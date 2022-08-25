// TODO: Add time out to prevent spamming, maybe use a debounce function, add debounce in iframe update only
// TODO: Add a way to save code

// require.config({ paths: { vs: "https://cdnjs.cloudflare.com/ajax/libs/monaco-editor/0.30.0/min/vs" }});
let main_program;

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
import { userAgent } from 'monaco-editor/esm/vs/base/common/platform.js';
// import {option_program} from './init.js';
const editors = {};

function createEditor(editor, id_div, value, lenguage, user){
	//
  	// Create the target editor where events will be played into.
  	//
	console.log(monaco.editor);
	editor[editor] = {};
  	editor[editor].editor = createCodeEditor(id_div, value, lenguage);
	editor[editor].cursorManager = createCursorManagerEditor(editor[editor].editor);
	editor[editor].cursor = createCursor(editor[editor].cursorManager, user);
}

function createCodeEditor(id_div, value, lenguage){
	return monaco.editor.create(document.getElementById(id_div), {
    value: value,
    theme: "vs-dark",
    language: lenguage,
    readOnly: false
  });
}

function createCursorManagerEditor(target) {
	return new MonacoCollabExt.RemoteCursorManager({
    editor: target,
    tooltips: true,
    tooltipDuration: 2
  });
}

function addCursor(cursorManager, user){
	return cursorManager.addCursor(user.id, user.color, user.label);
}

function createSelectorManagerEditor(editor){
	return new MonacoCollabExt.RemoteSelectionManager({editor: editor});
}

function addSelectorEditor(remoteSelectionManager, user){
	return remoteSelectionManager.addSelection(user.id, user.color, user.label);
}

const demo_editors = {};
const demo_cursors = {};

function createOriginEditor(container, content, lang){
	//
  	// Create the source editor were events will be generated.
	demo_editors[container] =  {};
  	demo_editors[container].editor = monaco.editor.create(document.getElementById(container), {
		// value: ["function x() {", '\tconsole.log("Hola Jaime!");', "}", "x();"].join("\n"),
		value: content,
		theme: "vs-dark",
		language: lang,
	});

	const source = demo_editors[container].editor;
	
	source.onDidChangeCursorPosition(e => {
		const offset = source.getModel().getOffsetAt(e.position);
		// sourceUserCursor.setOffset(offset);
		// console.log('onDidChangeCursorPosition: ' + offset);
		socket.emit('client_change_cursor_position', [container, offset]);
	});

	source.onDidChangeCursorSelection(e => {
		const startOffset = source.getModel().getOffsetAt(e.selection.getStartPosition());
		const endOffset = source.getModel().getOffsetAt(e.selection.getEndPosition());
		//remoteSelectionManager.setSelectionOffsets(sourceUser.id, startOffset, endOffset);
		// console.log('onDidChangeCursorSelection: ' + startOffset + ' ' + endOffset);
		socket.emit('client_change_cursor_selection', [container, startOffset, endOffset]);
	});

	demo_editors[container].contentManager = new MonacoCollabExt.EditorContentManager({
		editor: source,
		onInsert(index, text) {
			//targetContentManager.insert(index, text);
			// if (container == 'html'){
			// 	demo_editors['css'].contentManager.insert(index, text);
			// 	console.log('insert');
			// }
			socket.emit('client_code', { id: container, action: 'insert', values: [index, text] });
			updateIframe();
		},
		onReplace(index, length, text) {
			// targetContentManager.replace(index, length, text);
			// if (container == 'html'){
			// 	demo_editors['css'].contentManager.replace(index, length, text);
			// 	console.log('replace');
			// }
			socket.emit('client_code', { id: container, action: 'replace', values: [index, length, text] });
			updateIframe();
		},
		onDelete(index, length) {
			// targetContentManager.delete(index, length);
			// if (container == 'html'){
			// 	demo_editors['css'].contentManager.delete(index, length);
			// 	console.log('delete');
			// }
			socket.emit('client_code', { id: container, action: 'delete', values: [index, length] });
			updateIframe();
		}
	});


	// *** CURSOR ***
	// Create cursor manager
	demo_editors[container].cursorManager = createCursorManagerEditor(source);

	// Create cursor
	demo_cursors[container] = addCursor(demo_editors[container].cursorManager, sourceUser);

	// *** SELECTOR ***
	// Create selector manager
	demo_editors[container].selectorManager = createSelectorManagerEditor(source);

	// Create selector
	addSelectorEditor(demo_editors[container].selectorManager, sourceUser);
}

function demo_cursor(){
	const remoteCursorManager = new MonacoCollabExt.RemoteCursorManager({
    editor: target,
    tooltips: true,
    tooltipDuration: 2
  });
}

var UPDATE_RATE = 0; // each 5000 will update if the code has not been changed in more than 5000 ms
var iframe = $("#iframe-res");
var lastPosition = {column: 0,	lineNumber: 0};

var iframe_code = {};
var editor = {};
/*
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

function createCodeEditor() {
	// Add event listener to code editor
	setListenersForCodeEditor();
	
	// Create editors
	createCodeEditorContainers();
}

function setListenersForCodeEditor() {
	console.log('main_program: ' + main_program);
	if (main_program == 'web'){
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
	
	if (main_program == 'processing'){
		// console.log("setListenersForCodeEditor2:" + main_program);
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
	if (main_program == 'web'){
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
	
	if (main_program == 'processing'){
		// console.log("createCodeEditorContainers2:" + main_program);
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

*/


function updateIframe(){
	// console.log(demo_editors['html'].editor.getValue());
	/*$('iframe').srcdoc = demo_editors['html'].editor.getValue() + 
	'<style>' + demo_editors['css'].editor.getValue() + '</style>' + 
	`<script> 
	let debounceTimer;
	function debounce (callback, time) {
		window.clearTimeout(debounceTimer);
		debounceTimer = window.setTimeout(callback, time);
	};
	debounce(() => {
		console.log("*** updateIframeJS ***");
		${demo_editors['js'].editor.getValue()}
	}, ${UPDATE_RATE});</script>`;*/
	$('iframe').srcdoc = '<body>' + demo_editors['html'].editor.getValue() + '</body>' + 
	'<style>' + demo_editors['css'].editor.getValue() + `\nbody{
		animation: bounce-top 0.9s both;
	}
	
	@keyframes bounce-top {
	  0% {
		transform: translateY(-45px);
		animation-timing-function: ease-in;
		opacity: 1;
	  }
	  24% {
		opacity: 1;
	  }
	  40%{
		transform: translateY(-24px);
		animation-timing-function: ease-in;
	  }
	  65% {
		transform: translateY(-12px);
		animation-timing-function: ease-in;
	  }
	  82% {
		transform: translateY(-6px);
		animation-timing-function: ease-in;
	  }
	  93% {
		transform: translateY(-4px);
		animation-timing-function: ease-in;
	  }
	  25%,
	  55%,
	  75%,
	  87% {
		transform: translateY(0px);
		animation-timing-function: ease-out;
	  }
	  100% {
		transform: translateY(0px);
		animation-timing-function: ease-out;
		opacity: 1;
	  }
	}</style>` + 
	`<script> 
	let debounceTimer;
	function debounce (callback, time) {
		window.clearTimeout(debounceTimer);
		debounceTimer = window.setTimeout(callback, time);
	};
	debounce(() => {
		console.log("*** updateIframeJS ***");
		${demo_editors['js'].editor.getValue()}
	}, ${UPDATE_RATE});</script>`;
}

function initIframe() {
	socket.emit("get_code_client");
}

socket.on('server_code', data => { // update code from server
	// console.log('server_code: ');
	// console.log(data);
	console.table(data);
	
	/*if (editor[data.id] == null) return;
	
	setCodeFromEditor(data.id, data.code); // change editor

	if (main_program == 'web')
		updateIframe();*/

	if (data.action == 'insert') {
		console.log('insert', data.id);
		demo_editors[data.id].contentManager.insert(...data.values);
	}
	else if (data.action == 'replace') {
		console.log('replace', data.id);
		demo_editors[data.id].contentManager.replace(...data.values);
	}
	else if (data.action == 'delete') {
		console.log('delete', data.id);
		demo_editors[data.id].contentManager.delete(...data.values);
	}

	updateIframe();
});

socket.on('get_code_server', data => { // init
	console.log('get_code_server: ');
	console.log(data);
	console.log('**************')
	
	// iterate through editor objects
	for (var key in data) {
		// console.log('key: ' + key);
		// setCodeFromEditor(key, data[key]); // change editor
		const lenguage = key == 'js' ? 'javascript' : key;
		console.log('lenguage: ' + lenguage);
		createOriginEditor(key, data[key], lenguage); // create editor
	}

	// console.log('**************')
	
	if (main_program == 'web')
		updateIframe();
});


socket.on('enter_room', (response) => {
	main_program = response.program;
	console.log('main_program: ' + response.program);
  // console.log('enter room', response);
	
  /*if (main_program == 'web') {
		$('#init-container').classList.add('hidden');
    $('#editor-container').classList.remove('hidden');
    setTimeout(initIframe, 1000);
		UPDATE_RATE = 3000; // Update rate for JS iframe
		createCodeEditor();
  }
  else if (main_program == 'processing') {
		$('#init-container').classList.add('hidden');
    $('#processing-container').classList.remove('hidden');
    setTimeout(initIframe, 1000);
		createCodeEditor();
  }
  else
	alert('Unexpected error, reload the page and try again');*/
	if (main_program == 'web') {
		
			$('#init-container').classList.add('hidden');
			$('#editor-container').classList.remove('hidden');
			setTimeout(initIframe, 100);
			UPDATE_RATE = 3000; // Update rate for JS iframe
			// createCodeEditor();
		}
		else if (main_program == 'processing') {
			$('#init-container').classList.add('hidden');
			$('#processing-container').classList.remove('hidden');
			setTimeout(initIframe, 100);
			// createCodeEditor();
		}
		else
			alert('Unexpected error, reload the page and try again');
});

socket.on('server_change_cursor_position', (data) => {
	const [ id, offset ] = data;
	demo_cursors[id].setOffset(offset);
});

socket.on('server_change_cursor_selection', (data) => {
	const [ id, ...info ] = data;
	console.log('id: ' + id);
	console.log('info: ', ...info);
	demo_editors[id].selectorManager.setSelectionOffsets(sourceUser.id, ...info);
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
	// run the processing program inside the editor
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