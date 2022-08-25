import path from 'path';
import express from 'express';
import http from 'http';
import * as socketio from 'socket.io';
// import { randomInt } from 'crypto';
import child_process from 'child_process';
import fs from 'fs';
import fs_Extra from 'fs-extra';
import kill from 'tree-kill';
import {fileURLToPath} from 'url';

console.log(socketio);

const app = express();
const server = http.createServer(app);
const PORT = process.env.PORT || 3000;
const io = new socketio.Server(server);


const __filename = fileURLToPath(import.meta.url);

// 👇️ "/home/john/Desktop/javascript"
const __dirname = path.dirname(__filename);

const frame_rate = 144;
const premium_frame_rate = 60;

const init_iframe_code = {
    html: ["<h1>", '\tHola Jaime', "</h1>"].join("\n"),
    css: ["h1 {", '\tcolor: red;', "}"].join("\n"),
    js:  ["function x() {", '\tconsole.log("Hola Jaime!");', "}", "x();"].join("\n")
};
const init_processing_code = {
    processing: '',
}

// heroku logs: heroku logs -t --app code-jaime-online
// heroku log error: heroku logs --tail 500 --app code-jaime-online o heroku logs -n 500 --app code-jaime-online

// AUX
let debounceTimer;
function debounce (callback, time) {
  clearTimeout(debounceTimer);
  debounceTimer = setTimeout(callback, time);
};

// defining processing init_processing_code getting from template.pde
function get_init_processing() {
    // read temp/template/template.pde code and change processing code
    fs.readFile(path.join(__dirname, 'temp', 'template', 'template.pde'), function(err, data) {
        if (err) throw err;
        init_processing_code.processing = data.toString();
    });
}

get_init_processing();

// Seteando carpeta estatica, carpeta donde contiene todos los datos que requiere el usuario cuando hace la peticion
// a la web buscando recursos.
app.use(express.static(path.join(__dirname, 'dist')))

console.log("Empezando!!");

const iframe_code_rooms = {};
const socket_rooms = {};
const socket_users = {};


function insertCode(index, code, iframe_code) {
    // insert into iframe_code the code at index
    return iframe_code.slice(0, index) + code + iframe_code.slice(index);   
}

function deleteCode(index, lenght, iframe_code) {
    // delete from iframe_code the code at index
    return iframe_code.slice(0, index) + iframe_code.slice(index + lenght);
}

function replaceCode(index, length, text, iframe_code) {
    // replace in iframe_code the code at index
    return iframe_code.slice(0, index) + text + iframe_code.slice(index + length);
}

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
            
            if (socket_rooms[room_id].program == 'processing') {
                // Delete folder of the room
                fs.rmSync(socket_rooms[room_id].dir, { recursive: true, force: true });
            }

            
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
        if (socket_users[socket.id] == null){
            socket.emit('error', {
                code: 408,
                info: 'User not found'
            });
            return; 
        }

        if (data.id !== 'html' && data.id !== 'css' && data.id !== 'js' && data.id !== 'processing') return; // check if id is valid
        if (data.action != 'insert' && data.action != 'delete' && data.action != 'replace') return; // check if action is valid

        if (data.action == 'insert') {
            iframe_code_rooms[socket_users[socket.id].room][data.id] = insertCode(...data.values, iframe_code_rooms[socket_users[socket.id].room][data.id]);
        }
        else if (data.action == 'delete') {
            iframe_code_rooms[socket_users[socket.id].room][data.id] = deleteCode(...data.values, iframe_code_rooms[socket_users[socket.id].room][data.id]);
        }
        else if (data.action == 'replace') {
            iframe_code_rooms[socket_users[socket.id].room][data.id] = replaceCode(...data.values, iframe_code_rooms[socket_users[socket.id].room][data.id]);
        }

        console.table(data);
        console.log(iframe_code_rooms[socket_users[socket.id].room]);
        socket.broadcast.to(socket_users[socket.id].room).emit('server_code', data);
    });
    

    // msg to set up client code at the beginning
    socket.on('client_change_cursor_position', (data) => {
        if (socket_users[socket.id] == null) { // check if user exists
            socket.emit('error', {
                code: 408,
                info: 'User not found'
            });
            return; 
        }

        // socket.emit('server_change_cursor_position', data);
        socket.broadcast.to(socket_users[socket.id].room).emit('server_change_cursor_position', data);
    });

    // msg to set up client code at the beginning
    socket.on('client_change_cursor_selection', (data) => {
        if (socket_users[socket.id] == null) { // check if user exists
            socket.emit('error', {
                code: 408,
                info: 'User not found'
            });
            return; 
        }

        // socket.emit('server_change_cursor_selection', data);
        socket.broadcast.to(socket_users[socket.id].room).emit('server_change_cursor_selection', data);
    });

    // msg to set up client code at the beginning
    socket.on('get_code_client', (data) => {
        if (socket_users[socket.id] == null) { // check if user exists
            socket.emit('error', {
                code: 408,
                info: 'User not found'
            });
            return; // check if user exists
        }

        socket.emit('get_code_server', iframe_code_rooms[socket_users[socket.id].room]);
    });

    socket.on('create_room', data => {
        console.log(data);
        // check if data room is valid
        if (data.room == null || data.room == "") {
            socket.emit('error', {
                code: 400,
                info: 'Room name is invalid'
            });
            return;
        }

        // check if room exists
        if (socket_rooms[data.room] != null) {
            console.log('room exists');
            console.log(socket_rooms[data.room]);
            socket.emit('error', {
                code: 402,
                info: 'Room already exists'
            });
            return;
        }

        // check if program setted
        if (data.program !== 'web' && data.program !== 'processing') {
            socket.emit('error', {
                code: 405,
                info: 'Program is invalid ( Web | Processing )',
                message: data
            });
            return;
        }

        // check if valid name for processing
        if (data.program !== 'processing' && data.room == 'template') { // TODO: should migrate template folder to another name
            socket.emit('error', {
                code: 406,
                info: 'Room already exists',
                message: data
            });
            return;
        }

        //check if valid user type
        if (data.user_type !== 'user' && data.user_type !== 'img_user') {
            socket.emit('error', {
                code: 407,
                info: 'User type is invalid, refresh the page and try again',
                message: data
            });
            return;
        }

        // create room and join the user
        socket_rooms[data.room] = [];
        socket_rooms[data.room].push(socket.id);
        socket_rooms[data.room].program = data.program;
        
        socket_users[socket.id] = {
            room: data.room,
            user_type: data.user_type
        };
        
        // *** FOR WEB ***
        console.log('Setting up iframe code');
        iframe_code_rooms[data.room] = {};
        if (data.program == 'web') {
            // create initial code
            iframe_code_rooms[data.room] = { ...init_iframe_code };
            console.log('Setting up web code');
            console.log(init_iframe_code);
        }
        // *** FOR PROCESSING ***
        else if (data.program == 'processing') {
            // create initial code
            // create a copy of init_processing_code
            iframe_code_rooms[data.room] = init_processing_code;
            
            // *** this is moved to client side ***
            // console.log('Setting up processing code');
            // console.log(init_processing_code);
            
            // console.log('Creating folder for the room');
            // var dir_template = path.join(__dirname, 'temp', 'template');
            // var dir_room = path.join(__dirname, 'temp', data.room);
            // cloneFolder(dir_template, dir_room, data.room);
            
            // socket_rooms[data.room].dir = dir_room;
            // console.log('Room folder created');
        }
        
        // join the room
        socket.join(data.room);

        // send response to client
        socket.emit('enter_room', {
            room: data.room,
            program: data.program
        });
    });

    socket.on('join_room', data => {
        // check if data room is valid
        if (data.room == null || data.room == "") {
            socket.emit('error', {
                code: 400,
                info: 'Room name is invalid'
            });
            return;
        }

        // check if room exists
        if (socket_rooms[data.room] == null) {
            socket.emit('error', {
                code: 401,
                info: 'Room does not exists'
            });
            return;
        }

        // join the user
        socket_rooms[data.room].push(socket.id);
        socket_users[socket.id] = {
            room: data.room,
            user_type: data.user_type
        };

        console.log('New user!');
        console.log(data);

        socket.join(data.room);
          // send response to client
          socket.emit('enter_room', {
            code: 200,
            room: data.room,
            program: socket_rooms[data.room].program
        });
    });
    
    socket.on('run_code_client', data => {
        if (socket_users[socket.id] == null) return;
        
        var room_name = socket_users[socket.id].room;

        if (socket_rooms[room_name].program != 'processing') {
            socket.emit('error', {
                code: 403,
                info: 'Program is not processing'
            });
            return;
        };
        
        // check if img_user is in the room
        var img_user_room_id = null;
        for (var i = 0; i < socket_rooms[room_name].length; i++) {
            if (socket_users[socket_rooms[room_name][i]].user_type == 'img_user') {
                img_user_room_id = socket_rooms[room_name][i];
                console.log('break');
                break;
            }
        }
        console.log('id img_user_room: ' + img_user_room_id);

        if (img_user_room_id == null) {
            socket.emit('error', {
                code: 409,
                info: 'There is no client running the code in the room'
            });
            console.log(socket_rooms);
            console.log(socket_users);
            return;
        }

        // create a random string
        console.log('running code');

        // send code to img_user only
        io.to(img_user_room_id).emit('run_code_server', {
            code: data.code,
        });

        // var room_name = socket_users[socket.id].room;
        // run_code(socket, room_name);
    });

    socket.on('stop_code_client', () => {
        if (socket_users[socket.id] == null) return;
        socket.broadcast.to(socket_users[socket.id].room).emit('stop_code_server');
    });
    
    // redirecting image from img_user to clients connected to the same room
    socket.on('image_client', img => {
        if (socket_users[socket.id] == null) return;
        socket.broadcast.to(socket_users[socket.id].room).emit('image_server', img);
    });
    
    // redirecting output from img_user to clients connected to the same room
    socket.on('processing_output_client', output => {
        if (socket_users[socket.id] == null) return;
        socket.broadcast.to(socket_users[socket.id].room).emit('processing_output_server', output);
    });
});

const interval_time = 1000/frame_rate;

function cloneFolder(source, target, room_name) {

    // check if folder exists and create it if not
    if (!fs.existsSync(target)){
        fs.mkdirSync(target, { recursive: true });
    }

    // copy files from source to target
    fs_Extra.copy(source, target, function(error) {
        if (error) {
            throw error;
        } else {
          console.log("success!");
          // rename template.pde to (room name).pde
            fs.renameSync(path.join(target, 'template.pde'), path.join(target, room_name + '.pde'));
          console.log('room name: ' + room_name);
        }
    });
}

function run_script(command, args, cwd, time_out=null, callback) {
    console.log("Starting Process.");
    console.log("Command: " + command);
    console.log("Args: " + args);
    console.log("CWD: " + cwd);
    console.log("Timeout: " + time_out);

    if (time_out == null) {
        console.log("Error no time setted of process child.");
        return;
      }
    
    var child = child_process.spawn(command, args, cwd);
    console.log("Child created");
    
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

    // setTimeout( () => {
    //     kill(child.pid);
    //     console.log("Process killed.");
    // }, time_out);

    return child;
}

server.listen(PORT, () => {console.log(`runing on port ${PORT}`);});

function run_code(socket, room_name){
    var time_out = 10000; // 10 seconds
    console.log('running on: ', process.platform);

    if (process.platform === 'win32') {
        console.log('running on windows');
        var child = run_script(path.join(__dirname, 'Processing', 'win32', 'processing-java.exe'), ["--force", `--sketch=${path.join(__dirname, 'temp', room_name)}`, `--output=${path.join(__dirname, 'temp', room_name,'out')}`, "--run"], {cwd:`${path.join(__dirname, 'temp', room_name)}`}, time_out, function(buf) {
            socket.emit('processing_output_server', buf);
        });
    }
    if (process.platform === 'linux') {
        console.log('running on linux');
        var child = run_script(path.join(__dirname, 'Processing', 'linux', 'processing-java'), ["--force", `--sketch=${path.join(__dirname, 'temp', room_name)}`, `--output=${path.join(__dirname, 'temp', room_name,'out')}`, "--run"], {cwd:`${path.join(__dirname, 'temp', room_name)}`}, time_out, function(buf) {
            socket.emit('processing_output_server', buf);
        });
    }
        
    if (child == null)  return;

    // TODO: DISPLAY IMAGE, set it to room attribute so it can stopped later on
    var int_display = setInterval(() => {
        // read frame.svg from template/img_output
        fs.readFile(path.join(__dirname, 'temp', room_name, 'img_output', 'frame.svg'), function(err, data) {
            if (err) {
                console.log('Error reading file: ' + err);
                // if still not sending image reset all finish timers, so it's time_out when start sending image to the client
                debounce(() => {
                    // kill process
                    kill(child.pid);
                    console.log("Process killed.");

                    // stop sending frames to client
                    clearInterval(int_display);
                    console.log('display cleared');
                    socket.emit('processing_info_server', 'Processing finished');
                    
                }, time_out);
                
                // clearInterval(int_display);
                // console.log('display cleared becouse error occured');
                // stop interval
                return;
            }
            // covert to base64
            var base64data = new Buffer(data).toString('base64');
            // console.log('sent');
            socket.emit('image_server', base64data);
        });
        // emit image to socket
    }, interval_time);

    
}
