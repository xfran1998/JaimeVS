const path = require('path');
const express = require('express');
const http = require('http');
const socketio = require('socket.io');
// const { randomInt } = require('crypto');

const app = express();
const server = http.createServer(app);
const PORT = 3000 || process.env.PORT;
const io = socketio(server);

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
})


server.listen(PORT, () => {console.log(`runing on port ${PORT}`);});