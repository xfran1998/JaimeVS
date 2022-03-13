const socket = io();
const $ = selector => document.querySelector(selector);
const $$ = selector => document.querySelectorAll(selector);

$('#create-room').addEventListener('click', function (e) {
    // socket.emit('create_room');
    console.log('create room');
    $$('#init-btns > button').forEach(function (btn) {
      btn.classList.add('hidden');
    });

    $('#create-room-container').classList.remove('hidden');
});


$('#join-room').addEventListener('click', function (e) {
    // socket.emit('join_room');
    console.log('join room');
    $$('#init-btns > button').forEach(function (btn) {
      btn.classList.add('hidden');
    });

    $('#join-room-container').classList.remove('hidden');
});

$('#create-room-btn').addEventListener('click', function (e) {
    var room = $('#create-room-name').value;
    room = room.replace(' ', '_');

    // check if room only contain [A-Z], [0-9], [a-z], [_], [.] and [ ]
    var regex = /^[A-Za-z0-9_.]+$/;
    if (!regex.test(room)) {
      alert('Room name must only contain [A-Z, a-z, 0-9, _, ., SPACE]');
      return;
    }

    console.log('create room', room);
    if (room.length > 0) {
      socket.emit('create_room', {room: room});
    }
});

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
    socket.emit('join_room', {room: room});
  }
});

socket.on('enter_room', (response) => {
  if (response.code >= 400){
    alert(response.error);
    return;
  }

  console.log('enter room', response);
  $('#init-container').classList.add('hidden');
  $('#editor-container').classList.remove('hidden');

  setTimeout(initIframe, 1000);
});