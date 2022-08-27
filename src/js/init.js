// import * as monaco from 'monaco-editor/esm/vs/editor/editor.api.js';
const socket = io();
console.log(socket);
console.log('hello');

// const socket = io();
const $ = (s, e = document) => e.querySelector(s);
const $$ = (s, e = document) => e.querySelectorAll(s);

var option_program = null;

// create room container
$('#create-room').addEventListener('click', function (e) {
    // socket.emit('create_room');
    console.log('create room');
    $$('#init-btns > button').forEach(function (btn) {
      btn.classList.add('hidden');
    });

    $('#create-room-container').classList.remove('hidden');
});

// join room container
$('#join-room').addEventListener('click', function (e) {
    // socket.emit('join_room');
    console.log('join room');
    $$('#init-btns > button').forEach(function (btn) {
      btn.classList.add('hidden');
    });

    $('#join-room-container').classList.remove('hidden');
});


// create room button
$('#create-room-btn').addEventListener('click', function (e) {
    var room = $('#create-room-name').value;
    room = room.replace(' ', '_');

    // check if room only contain [A-Z], [0-9], [a-z], [_], [.] and [ ]
    var regex = /^[A-Za-z0-9_.]+$/;
    if (!regex.test(room)) {
      alert('Room name must only contain [A-Z, a-z, 0-9, _, ., SPACE]');
      return;
    }

    if (room.length > 0) {
      socket.emit('create_room', {
        room: room, 
        program: option_program,
        user_type: 'user',
      });
    }
});


// join room button
$('#join-room-btn').addEventListener('click', function (e) {
  var room = $('#join-room-name').value;
  room = room.replace(' ', '_');

  // check if room only contain [A-Z], [0-9], [a-z], [_], [.] and [ ]
  var regex = /^[A-Za-z0-9_]+$/;
  if (!regex.test(room)) {
    alert('Room name must only contain [A-Z, a-z, 0-9, _, SPACE]');
    return;
  }

  console.log('join room', {room: room});
  if (room.length > 0) {
    socket.emit('join_room', {
      room: room,
      user_type: 'user',
    });
  }
});


// program option button
$('#web-dev-btn').addEventListener('click', function (e) {
  option_program = 'web';

  // hide all option buttons container
  $('#program-option-container').classList.add('hidden');
  
  // show create name room container
  $('.create-name-room-container').classList.remove('hidden');
});

export default socket;
export {option_program};