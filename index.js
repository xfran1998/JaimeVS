const path = require('path');
const express = require('express');
const http = require('http');
const socketio = require('socket.io');
// const { randomInt } = require('crypto');

const app = express();
const server = http.createServer(app);
const PORT = process.env.PORT || 5000;
const io = socketio(server);

let iframe_code = {
    html: ["<h1>", '\tHola Jaime', "</h1>"].join("\n"),
    css: ["h1 {", '\tcolor: red;', "}"].join("\n"),
    js:  ["function x() {", '\tconsole.log("Hello world!");', "}"].join("\n")
};

// Seteando carpeta estatica, carpeta donde contiene todos los datos que requiere el usuario cuando hace la peticion
// a la web buscando recursos.
app.use(express.static(path.join(__dirname, 'dist')))

console.log("Empezando!!");

// Funcion que se ejecuta cuando un usuario se conecta al websocket
io.on('connection', (socket) => {
    console.log("Nueva conexion!!");

    // Envia mensaje al usuario que se ha conectado
    // socket.emit('server', 'Init Player');
    
    // Envia mensaje a todos menos al usuario que se ha conectado
    // socket.broadcast.emit('server', 'Alguien se ha conectado!!!');

    // Envia mensaje a todos los usuaios
    // io.emit();

    socket.on("disconnecting", () => {
        // Deleting users
        
        // Deleting user form rooms if was in
        // let room = users[socket.id].room;
        // var ind = rooms[room].indexOf(socket.id);
        // rooms[room].splice(ind, 1);
        
        // if (users[socket.id]);
        //     delete users[socket.id];


        console.log("**** DISCONNECTING ****");
        // console.log(socket.id);
        // console.log(users);
        // console.log(rooms);
        console.log("**********************");
    });   

    socket.on('client_code', (data) =>{
        socket.broadcast.emit('server_code', data);
        console.log(data);
    });

    socket.on('get_code_client', () => {
        socket.emit('get_code_server', iframe_code);
    });
})

server.listen(PORT, () => {console.log(`runing on port ${PORT}`);});