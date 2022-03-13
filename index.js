const path = require('path');
const express = require('express');
const http = require('http');
const socketio = require('socket.io');
// const { randomInt } = require('crypto');

const app = express();
const server = http.createServer(app);
const PORT = process.env.PORT || 5000;
const io = socketio(server);

const init_iframe_code = {
    html: ["<h1>", '\tHola Jaime', "</h1>"].join("\n"),
    css: ["h1 {", '\tcolor: red;', "}"].join("\n"),
    js:  ["function x() {", '\tconsole.log("Hello world!");', "}"].join("\n")
};

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
        if (!socket_rooms[room_id].includes(socket.id)) return;  // check if user is in room
        var room_id = socket_users[socket.id].room;
        
        // Deleting user form rooms if was in one
        socket_rooms[room_id].splice(socket_rooms[room_id].indexOf(socket.id), 1);
        // remove user from users
        delete socket_users[socket.id];
        
        // if room is empty, delete room
        if (socket_rooms[room_id].length == 0) {
            delete socket_rooms[room_id];
        }

        console.log("**** DISCONNECTING ****");
        console.log(socket.id);
        console.log(socket_users);
        console.log(socket_rooms);
        console.log("**********************");
    });   

    // msg to change code on server and other clients in the same room
    socket.on('client_code', (data) =>{
        // ('server_code', data);
        if (socket_users[socket.id] == null) return; // check if user exists
        socket.broadcast.to(socket_users[socket.id].room).emit('server_code', data);
        
        /*if (iframe_code[data.id] != null) 
        iframe_code[data.id] = data.code; */
        
        if (data.id !== 'html' || data.id !== 'css' || data.id !== 'js') return; // check if id is valid
        
        iframe_code_rooms[socket_users[socket.id].room][data.id] = data.code; // update iframe code of the room
        console.log(iframe_code_rooms[socket_users[socket.id].room]);
    });
    
    // msg to set up client code at the beginning
    socket.on('get_code_client', () => {
        if (socket_users[socket.id] == null) return; // check if user exists
        // ('get_code_server', iframe_code);
        // emit only in the room of the client
        socket.emit('get_code_server', iframe_code_rooms[socket_users[socket.id].room]);
    });

    socket.on('create_room', data =>{
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

        // create room and join the user
        socket_rooms[data.room] = [];
        socket_rooms[data.room].push(socket.id);
        socket_users[socket.id] = {
            room: data.room
        };

        // create initial code
        iframe_code_rooms[data.room] = init_iframe_code;

        // join the room
        socket.join(data.room);

        // send response to client
        socket.emit('enter_room', {
            room: data.room
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
            room: data.room
        });
    });
});

server.listen(PORT, () => {console.log(`runing on port ${PORT}`);});