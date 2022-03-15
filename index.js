const path = require('path');
const express = require('express');
const http = require('http');
const socketio = require('socket.io');
// const { randomInt } = require('crypto');
const child_process = require('child_process');
const fs = require('fs');

const app = express();
const server = http.createServer(app);
const PORT = process.env.PORT || 5000;
const io = socketio(server);

const frame_rate = 30;
const premium_frame_rate = 60;

const init_iframe_code = {
    html: ["<h1>", '\tHola Jaime', "</h1>"].join("\n"),
    css: ["h1 {", '\tcolor: red;', "}"].join("\n"),
    js:  ["function x() {", '\tconsole.log("Hello world!");', "}"].join("\n")
};
const init_processing_code = {
    processing: 'print("Hola Jaime");',
}

// Seteando carpeta estatica, carpeta donde contiene todos los datos que requiere el usuario cuando hace la peticion
// a la web buscando recursos.
app.use(express.static(path.join(__dirname, 'dist')))

console.log("Empezando!!");

const iframe_code_rooms = {};
const socket_rooms = {};
const socket_users = {};

// Funcion que se ejecuta cuando un usuario se conecta al websocket
io.on('connection', (socket) => {
    console.log("Nueva conexion!!");

    socket.on("disconnecting", () => {
        // Deleting users
        if (socket_users[socket.id] == null) return; // check if user exists
        console.log('user exists');
        var room_id = socket_users[socket.id].room;
        if (socket_rooms[room_id] == null) return; // check if room exists
        console.log('room exists');
        if (!socket_rooms[room_id].includes(socket.id)) return;  // check if user is in room
        console.log('user inside room');
        
        // Deleting user form rooms if was in one
        socket_rooms[room_id].splice(socket_rooms[room_id].indexOf(socket.id), 1);
        // remove user from users
        delete socket_users[socket.id];
        
        // if room is empty, delete room
        if (socket_rooms[room_id].length == 0) {
            delete socket_rooms[room_id];
        }

        // DEBUG
        // console.log("**** DISCONNECTING ****");
        // console.log(socket.id);
        // console.log(socket_users);
        // console.log(socket_rooms);
        // console.log("**********************");
    });   

    // msg to change code on server and other clients in the same room
    socket.on('client_code', (data) =>{
        if (socket_users[socket.id] == null) return; // check if user exists
        socket.broadcast.to(socket_users[socket.id].room).emit('server_code', data);
        
        if (data.id !== 'html' && data.id !== 'css' && data.id !== 'js' && data.id !== 'processing') return; // check if id is valid
        
        iframe_code_rooms[socket_users[socket.id].room][data.id] = data.code; // update iframe code of the room
        
    });
    
    // msg to set up client code at the beginning
    socket.on('get_code_client', (data) => {
        if (socket_users[socket.id] == null) return; // check if user exists

        socket.emit('get_code_server', iframe_code_rooms[socket_users[socket.id].room]);
    });

    socket.on('create_room', data => {
        console.log(data);
        // check if data room is valid
        if (data.room == null || data.room == "") {
            socket.emit('enter_room', {
                code: 400,
                error: 'Room name is invalid'
            });
            return;
        }

        // check if room exists
        if (socket_rooms[data.room] != null) {
            socket.emit('enter_room', {
                code: 402,
                error: 'Room already exists'
            });
            return;
        }

        // check if program setted
        if (data.program !== 'web' && data.program !== 'processing') {
            socket.emit('enter_room', {
                code: 405,
                error: 'Program is invalid ( Web | Processing )',
                message: data
            });
            return;
        }

        // create room and join the user
        socket_rooms[data.room] = [];
        socket_rooms[data.room].push(socket.id);
        socket_rooms[data.room].program = data.program;
        
        socket_users[socket.id] = {
            room: data.room
        };
        
        // *** FOR WEB ***
        console.log('Setting up iframe code');
        iframe_code_rooms[data.room] = {};
        if (data.program == 'web') {
            // create initial code
            Object.assign(iframe_code_rooms[data.room], init_iframe_code);
            console.log('Setting up web code');
            console.log(init_iframe_code);
        }
        // *** FOR PROCESSING ***
        else if (data.program == 'processing') {
            // create initial code
            // create a copy of init_processing_code
            Object.assign(iframe_code_rooms[data.room], init_processing_code);
            // iframe_code_rooms[data.room] = init_processing_code;
            console.log('Setting up processing code');
            console.log(init_processing_code);
        }
        
        // join the room
        socket.join(data.room);

        // send response to client
        socket.emit('enter_room', {
            room: data.room,
            program: data.program
        });
    });

    socket.on('join_room', data =>{
        // check if data room is valid
        if (data.room == null || data.room == "") {
            socket.emit('enter_room', {
                code: 400,
                error: 'Room name is invalid'
            });
            return;
        }

        // check if room exists
        if (socket_rooms[data.room] == null) {
            socket.emit('enter_room', {
                code: 401,
                error: 'Room does not exists'
            });
            return;
        }

        // join the user
        socket_rooms[data.room].push(socket.id);
        socket_users[socket.id] = {
            room: data.room
        };

        socket.join(data.room);
          // send response to client
          socket.emit('enter_room', {
            code: 200,
            room: data.room,
            program: socket_rooms[data.room].program
        });
    });
});

const interval_time = 1000/frame_rate;

function run_script(command, args, cwd, time_out=null, callback) {
    console.log("Starting Process.");
    var child = child_process.spawn(command, args, cwd);

    child.stdout.setEncoding('ascii');
    child.stdout.on('data', function(data) {
        callback(data);
    });

    child.stderr.setEncoding('ascii');
    child.stderr.on('data', function(data) {
        console.log("Error: " + data);
    });

    child.on('close', function() {
        console.log('finish code: ' + child.exitCode);
    });

  if (time_out == null) {
    child.kill();
    console.log("Error no time setted of process child.");
    return;
  }

    setTimeout(function() {
        child.kill();
        console.log("Process killed.");
    }, time_out);
}

server.listen(PORT, () => {console.log(`runing on port ${PORT}`);});

function run_code(){
    var time_out = 10000; // 10 seconds

    run_script(path.join(__dirname, 'Processing', 'processing-java.exe'), ["--force", `--sketch=${path.join(__dirname, 'temp', 'template')}`, `--output=${path.join(__dirname, 'temp', 'template','out')}`, "--run"], {cwd:`${path.join(__dirname, 'temp', 'template')}`}, time_out, function(buf) {
        socket.emit('processing_output_server', buf);
    });

    // TODO: DISPLAY IMAGE, set it to room attribute so it can stopped later on
    var int_display = setInterval(() => {
        // read frame.svg from template/img_output
        fs.readFile(path.join(__dirname, 'temp', 'template', 'img_output', 'frame.svg'), function(err, data) {
            if (err) throw err;
            console.log(data);
            socket.emit('server_image', data);
        });
        // emit image to socket
    }, interval_time);
}