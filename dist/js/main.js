// TODO: Add time out to prevent spamming, maybe use a debounce function, add debounce in iframe update only
// TODO: Add a way to save code

require.config({ paths: { vs: "https://cdnjs.cloudflare.com/ajax/libs/monaco-editor/0.30.0/min/vs" }});
const socket = io();

var UPDATE_RATE = 0; // each 5000 will update if the code has not been changed in more than 5000 ms
const $ = selector => document.querySelector(selector);
const $$ = selector => document.querySelectorAll(selector);
var iframe = $("#iframe-res");

var iframe_code =
{
	html: "",
	css: "",
	js: "",
}

var editor = {
	html: null,
	css: null,
	js: null
}

function getCodeFromEditor(id) {
	if (editor[id] == null) return "<h1>Error, editor not found</h1>";

	if (id == "html") {
		iframe_code.html = editor.html.getValue();
	}
	if (id == "css") {
		iframe_code.css =  editor.css.getValue();
	}
	if (id == "js") {
		iframe_code.js = editor.js.getValue();
	}
}

function setCodeFromEditor(id, code) {
	if (editor[id] == null) return;
	iframe_code[id] = code;
	editor[id].setValue(code);
	
}

function initIframe() {
	socket.emit("get_code_client");
}

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


function updateIframe(){
	// font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	iframe.srcdoc = iframe_code.html + 
					'<style>' + iframe_code.css + '</style>' + 
					`<script> 
					let debounceTimer;
					function debounce (callback, time) {
					  window.clearTimeout(debounceTimer);
					  debounceTimer = window.setTimeout(callback, time);
					};
					debounce(() => {
						console.log("updateIframeJS");
						${iframe_code.js}
					}, ${UPDATE_RATE});</script>`;
	
}

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
});

setTimeout(initIframe, 1000);

socket.on('server_code', data => {
	console.log('msg: ' + data.code);
	if (editor[data.id] == null) return;
	
	setCodeFromEditor(data.id, data.code); // change editor
	updateIframe();
});

socket.on('get_code_server', data => {
	setCodeFromEditor('html', data.html);
	setCodeFromEditor('css', data.css);
	setCodeFromEditor('js', data.js);	
	
	updateIframe();
	UPDATE_RATE = 3000;
});


// AUX
let debounceTimer;
function debounce (callback, time) {
  window.clearTimeout(debounceTimer);
  debounceTimer = window.setTimeout(callback, time);
};