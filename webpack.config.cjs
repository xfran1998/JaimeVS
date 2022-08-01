const path = require('path');
const MonacoWebpackPlugin = require('monaco-editor-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
	mode: 'development',
	entry: ['./src/js/main.js', './src/js/init.js', './src/index.html', './src/css/style.css'],
	output: {
		path: path.resolve(__dirname, 'dist'),
		filename: '[name].js'
	},
	module: {
		rules: [
			{
				test: /\.css$/,
				use: ['style-loader', 'css-loader']
			},
			{
				test: /\.html$/,
				use: ['html-loader']
			}
		]
	},
	plugins: [
		new MonacoWebpackPlugin({
			languages: ['typescript', 'javascript', 'css']
		}),
		new HtmlWebpackPlugin({
			template: './src/index.html',
			filename: './index.html'
		})
	],
  resolve: {
    modules: [path.resolve(__dirname, './app/'), path.resolve('./node_modules')],
		mainFields: ['browser', 'main', 'module']
  }
};