// TODO: Add time out to prevent spamming, maybe use a debounce function, add debounce in iframe update only
// TODO: Add a way to save code

// require.config({ paths: { vs: "https://cdnjs.cloudflare.com/ajax/libs/monaco-editor/0.30.0/min/vs" }});
const sourceUser = {
  id: "source",
  label: "Source User",
  color: "orange"
};

const staticUser = {
  id: "static",
  label: "Static User",
  color: "blue"
};

const $ = selector => document.querySelector(selector);
const $$ = selector => document.querySelectorAll(selector);

import * as monaco from 'monaco-editor/esm/vs/editor/editor.api.js';
import * as MonacoCollabExt from "@convergencelabs/monaco-collab-ext";
import socket from './init.js';
import {option_program} from './init.js';

// import css from "/src/example.css";

  //
  // Create the target editor where events will be played into.
  //
	console.log(monaco.editor);
  const target = monaco.editor.create(document.getElementById("target-editor"), {
    value: 'test',
    theme: "vs-dark'",
    language: 'javascript',
    readOnly: false
  });

  const remoteCursorManager = new MonacoCollabExt.RemoteCursorManager({
    editor: target,
    tooltips: true,
    tooltipDuration: 2
  });
  
  const sourceUserCursor = remoteCursorManager.addCursor(sourceUser.id, sourceUser.color, sourceUser.label);

  const remoteSelectionManager = new MonacoCollabExt.RemoteSelectionManager({editor: target});
  remoteSelectionManager.addSelection(sourceUser.id, sourceUser.color, sourceUser.label);


  const targetContentManager = new MonacoCollabExt.EditorContentManager({
    editor: target
  });


  //
  // Create the source editor were events will be generated.
  //
  const source = monaco.editor.create(document.getElementById("source-editor"), {
    value: 'test',
    theme: "vs-dark'",
    language: 'javascript'
  });


  source.onDidChangeCursorPosition(e => {
    const offset = source.getModel().getOffsetAt(e.position);
    sourceUserCursor.setOffset(offset);
  });

  source.onDidChangeCursorSelection(e => {
    const startOffset = source.getModel().getOffsetAt(e.selection.getStartPosition());
    const endOffset = source.getModel().getOffsetAt(e.selection.getEndPosition());
    remoteSelectionManager.setSelectionOffsets(sourceUser.id, startOffset, endOffset);
  });

  const sourceContentManager = new MonacoCollabExt.EditorContentManager({
    editor: source,
    onInsert(index, text) {
      // target.updateOptions({readOnly: false});
      targetContentManager.insert(index, text);
      // target.updateOptions({readOnly: true});
    },
    onReplace(index, length, text) {
      // target.updateOptions({readOnly: false});
      targetContentManager.replace(index, length, text);
      // target.updateOptions({readOnly: true});
    },
    onDelete(index, length) {
      // target.updateOptions({readOnly: false});
      targetContentManager.delete(index, length);
      // target.updateOptions({readOnly: true});
    }
  });

  
  const originCursorManager = new MonacoCollabExt.RemoteCursorManager({
    editor: source,
    tooltips: true,
    tooltipDuration: 2
  });

  const staticUserCursor = originCursorManager.addCursor(staticUser.id, staticUser.color, staticUser.label);

  const sourceSelectionManager = new MonacoCollabExt.RemoteSelectionManager({editor: source});
  sourceSelectionManager.addSelection(staticUser.id, staticUser.color, staticUser.label);

   //
  // Faked other user.
  //
  staticUserCursor.setOffset(50);
  sourceSelectionManager.setSelectionOffsets(staticUser.id, 40, 50);

  window.addEventListener('resize', () => {
    source.layout();
    target.layout();
  });

var UPDATE_RATE = 0; // each 5000 will update if the code has not been changed in more than 5000 ms
var iframe = $("#iframe-res");
var lastPosition = {column: 0,	lineNumber: 0};

var iframe_code = {};
var editor = {};

function getCodeFromEditor(id) {
	if (editor[id] == null) return "<h1>Error, editor not found</h1>";

	// if (id == "html") {
	// 	iframe_code.html = editor.html.getValue();
	// }
	// if (id == "css") {
	// 	iframe_code.css =  editor.css.getValue();
	// }
	// if (id == "js") {
	// 	iframe_code.js = editor.js.getValue();
	// }

	iframe_code[id] = editor[id].getValue();

	// console.log(editor[id].getValue());
}

function setCodeFromEditor(id, code) {
	// console.log('id: ' + id + ' code: ' + code);
	if (id == null) return;
	iframe_code[id] = code;

	// console.log('id: ' + id + ' code: ' + code);

	if(code !== editor[id].getValue())
		editor[id].setValue(code);
}

function initIframe() {
	socket.emit("get_code_client");
}

function createCodeEditor() {
	// Add event listener to code editor
	setListenersForCodeEditor();
	
	// Create editors
	createCodeEditorContainers();
}

function setListenersForCodeEditor() {
	console.log('option_program: ' + option_program);
	if (option_program == 'web'){
		// addEventListener keyup will trigger when client press a key on editor 1
		$("#html").addEventListener("keyup", function (e) {
			getCodeFromEditor("html");
			socket.emit('client_code', { id: "html", code: iframe_code.html});
			updateIframe();
		});
		
		// addEventListener keyup will trigger when client press a key on editor 1
		$("#css").addEventListener("keyup", function (e) {
			getCodeFromEditor("css");
			socket.emit('client_code', { id: "css", code: iframe_code.css });
			updateIframe();
		});
		
		// addEventListener keyup will trigger when client press a key on editor 1
		$("#js").addEventListener("keyup", function (e) {
			getCodeFromEditor("js");
			socket.emit('client_code', { id: "js", code: iframe_code.js });
			updateIframe();
		});
		return;
	}
	
	if (option_program == 'processing'){
		// console.log("setListenersForCodeEditor2:" + option_program);
		// addEventListener keyup will trigger when client press a key on editor 1
		$("#processing-editor").addEventListener("keyup", function (e) {
			getCodeFromEditor("processing");
			socket.emit('client_code', { id: "processing", code: iframe_code.processing });
		});
		return;
	}
	
	alert("Error, Code Editor type not found");
}

function updateIframe(){
	iframe.srcdoc = iframe_code.html + 
	'<style>' + iframe_code.css + '</style>' + 
	`<script> 
	let debounceTimer;
	function debounce (callback, time) {
		window.clearTimeout(debounceTimer);
		debounceTimer = window.setTimeout(callback, time);
	};
	debounce(() => {
		console.log("*** updateIframeJS ***");
		${iframe_code.js}
	}, ${UPDATE_RATE});</script>`;
}

function createCodeEditorContainers(){
	if (option_program == 'web'){
		// Instance 1
		require(["vs/editor/editor.main"], function () {
			editor.html = monaco.editor.create(document.getElementById("html"), {
				value: "",
				language: "html",
				automaticLayout: true,
				overviewRulerLanes: 0,
				hideCursorInOverviewRuler: true,
				scrollbar: {
					vertical: 'hidden'
				},
				overviewRulerBorder: false,
				minimap: {enabled: true},
				// wordWrap: 'on',
				// no line numbers
				lineNumbers: false,
			});
			
			window.onresize = function () {
				editor.html.layout();
			};
			
			editor.html.onDidChangeModelContent((e)=>{ 
				editor.html.setPosition({lineNumber:10, column:2}); 
				// console.log('MODEL');
				// editor.html.focus(); 
			});
			
			editor.html.onDidChangeCursorPosition(e => {
				lastPosition = editor.html.getPosition();
				// console.log('CURSOR');
				// console.log({lastPosition});
				// console.log('Cursor changed', editor.html.getPosition());
			});
			
			// autocomplete html
			monaco.languages.registerCompletionItemProvider('html', 
			{
				triggerCharacters: ['>'],
				provideCompletionItems: (model, position) => 
				{
					const codePre = model.getValueInRange({
						startLineNumber: position.lineNumber,
						startColumn: 1,
						endLineNumber: position.lineNumber,
						endColumn: position.column,
					});
					
					const tag = codePre.match(/.*<(\w+)>$/)?.[1];
					
					if (!tag) {
						return;
					}
					
					const word = model.getWordUntilPosition(position);
					
					return {
						suggestions: [
							{
								label: `</${tag}>`,
								kind: monaco.languages.CompletionItemKind.EnumMember,
								insertText: `$1</${tag}>`,
								insertTextRules: monaco.languages.CompletionItemInsertTextRule.InsertAsSnippet,
								range:  {
									startLineNumber: position.lineNumber,
									endLineNumber: position.lineNumber,
									startColumn: word.startColumn,
									endColumn: word.endColumn,
								},
							},
						],
					};
				},
			});
		});
			
		// Instance 2
		require(["vs/editor/editor.main"], function () {
			editor.css = monaco.editor.create(document.getElementById("css"), {
				value: "",
				language: "css",
				automaticLayout: true,
				overviewRulerLanes: 0,
				hideCursorInOverviewRuler: true,
				scrollbar: {
					vertical: 'hidden'
				},
				overviewRulerBorder: false,
				minimap: {enabled: true},
				// wordWrap: 'on',
				// no line numbers
				lineNumbers: false,
			});
			window.onresize = function () {
				editor.css.layout();
			};
			
			editor.css.onDidChangeModelContent((e)=>{ 
				editor.css.setPosition({lineNumber:10, column:2}); 
				// console.log('MODEL');
				// editor.css.focus(); 
			});
			
			editor.css.onDidChangeCursorPosition(e => {
				lastPosition = editor.css.getPosition();
				// console.log('CURSOR');
				// console.log({lastPosition});
				// console.log('Cursor changed', editor.css.getPosition());
			});
		});
		
		// Instance 3
		require(["vs/editor/editor.main"], function () {
			editor.js = monaco.editor.create(document.getElementById("js"), {
				value: "",
				language: "javascript",
				automaticLayout: true,
				overviewRulerLanes: 0,
				hideCursorInOverviewRuler: true,
				scrollbar: {
					vertical: 'hidden'
				},
				overviewRulerBorder: false,
				minimap: {enabled: true},
				// wordWrap: 'on',
				// no line numbers
				lineNumbers: false,
			});
			
			window.onresize = function () {
				editor.js.layout();
			};
			
			editor.js.onDidChangeModelContent((e)=>{ 
				editor.js.setPosition({lineNumber:10, column:2}); 
				// console.log('MODEL');
				// console.log({lastPosition});
				// editor.js.focus(); 
			});
			
			editor.js.onDidChangeCursorPosition(e => {
				// console.log('CURSOR');
				lastPosition = editor.js.getPosition();
				// console.log('Cursor changed', editor.js.getPosition());
			});
		});
		
		return;
	}
	
	if (option_program == 'processing'){
		// console.log("createCodeEditorContainers2:" + option_program);
		require(["vs/editor/editor.main"], function () {
			editor.processing = monaco.editor.create(document.getElementById("processing-editor"), {
				value: "",
				language: "java",
				automaticLayout: true,
				overviewRulerLanes: 0,
				hideCursorInOverviewRuler: true,
				scrollbar: {
					vertical: 'hidden'
				},
				overviewRulerBorder: false,
				minimap: {enabled: true},
				// wordWrap: 'on',
				// no line numbers
				lineNumbers: false,
			});

			// console.log('editor.processing', editor.processing);
			window.onresize = function () {
				editor.processing.layout();
			};

			editor.processing.onDidChangeModelContent((e)=>{ 
				// editor.processing.setPosition({lineNumber:10, column:2}); 
				// console.log('MODEL');
				// console.log({lastPosition});
				// editor.processing.focus(); 
			});
			
			editor.processing.onDidChangeCursorPosition(e => {
				// console.log('CURSOR');
				 lastPosition = editor.processing.getPosition();
				// console.log('Cursor changed', editor.processing.getPosition());
			});
		});
		// console.log(editor.processing);
		return;
	}

	alert("Error, Code Editor type not found");
}

socket.on('server_code', data => {
	// console.log('server_code: ');
	// console.log(data);
	if (editor[data.id] == null) return;
	
	setCodeFromEditor(data.id, data.code); // change editor

	if (option_program == 'web')
		updateIframe();
});

socket.on('get_code_server', data => {
	// console.log('get_code_server: ');
	// console.log(data);
	// console.log('**************')
	
	// iterate through editor objects
	for (var key in data) {
		// console.log('key: ' + key);
		setCodeFromEditor(key, data[key]); // change editor
	}

	// console.log('**************')
	
	if (option_program == 'web')
		updateIframe();
});


socket.on('enter_room', (response) => {
	console.log('option_program: ' + option_program);
  // console.log('enter room', response);

  if (option_program == 'web') {
    $('#init-container').classList.add('hidden');
    $('#editor-container').classList.remove('hidden');
    setTimeout(initIframe, 1000);
		UPDATE_RATE = 3000; // Update rate for JS iframe
		createCodeEditor();
  }
  else if (option_program == 'processing') {
    $('#init-container').classList.add('hidden');
    $('#processing-container').classList.remove('hidden');
    setTimeout(initIframe, 1000);
		createCodeEditor();
  }
  else
    alert('Unexpected error, reload the page and try again');
});


// Processing
$('#run-btn').addEventListener('click', () => {
	console.log('run-btn');
	startProgram();
});

$('#stop-btn').addEventListener('click', () => {
	console.log('stop-btn');
	stopProgram();
});

function startProgram(){
	// console.log('startProgram');
	// console.log(editor.processing.getValue());
	socket.emit('run_code_client', {
		code: editor.processing.getValue()
	});
}

function stopProgram(){
	// console.log('stopProgram');
	socket.emit('stop_code_client');
}

var svg_container = $('#img-processing-svg');
var img = new Image();

// change image content
socket.on('image_server', svg_buffer => {
	// console.log(svg_buffer);
	if(svg_buffer.length <= 100) {
		// console.log('Error: Image is too small');
		return;
	}

	img.src = 'data:image/svg+xml;base64,' + svg_buffer;
	svg_container.innerHTML = '';
	svg_container.appendChild(img);
	console.log('image recieved');
});

// AUX
let debounceTimer;
function debounce (callback, time) {
  window.clearTimeout(debounceTimer);
  debounceTimer = window.setTimeout(callback, time);
};

socket.on('processing_output_server', (data) => {
	console.log('processing_output_server');
	console.log(data);
	$('#processing-output').innerHTML += `<p>${data}</p>`;
});

socket.on('error',(error) => {
	if (error.code >= 400) {
    alert(`Server error (${error.code}):  + ${error.info}`);
    return;
  }
	
	// Error in img processing client
	if (error.code >= 300) {
		alert(`Client error (${error.code}):  + ${error.info}`);
		return;
	}
});


const MAX_PERS = 7;
let num_pers = 7;

if (num_pers < MAX_PERS) {
	console.log('Pueden entrar mas personas');
}
else if (num_pers > MAX_PERS) {
	console.log('Más personas que las que caben!!');
}
else{
	console.log('Capacidad máxima alcanzada');
}