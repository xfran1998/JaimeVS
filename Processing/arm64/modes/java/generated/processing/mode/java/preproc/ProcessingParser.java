// Generated from /home/fry/processing4/java/src/processing/mode/java/preproc/Processing.g4 by ANTLR 4.7.2
package processing.mode.java.preproc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProcessingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, HexColorLiteral=2, WS=3, COMMENT=4, LINE_COMMENT=5, CHAR_LITERAL=6, 
		ABSTRACT=7, ASSERT=8, BOOLEAN=9, BREAK=10, BYTE=11, CASE=12, CATCH=13, 
		CHAR=14, CLASS=15, CONST=16, CONTINUE=17, DEFAULT=18, DO=19, DOUBLE=20, 
		ELSE=21, ENUM=22, EXTENDS=23, FINAL=24, FINALLY=25, FLOAT=26, FOR=27, 
		IF=28, GOTO=29, IMPLEMENTS=30, IMPORT=31, INSTANCEOF=32, INT=33, INTERFACE=34, 
		LONG=35, NATIVE=36, NEW=37, PACKAGE=38, PRIVATE=39, PROTECTED=40, PUBLIC=41, 
		RETURN=42, SHORT=43, STATIC=44, STRICTFP=45, SUPER=46, SWITCH=47, SYNCHRONIZED=48, 
		THIS=49, THROW=50, THROWS=51, TRANSIENT=52, TRY=53, VAR=54, VOID=55, VOLATILE=56, 
		WHILE=57, DECIMAL_LITERAL=58, HEX_LITERAL=59, OCT_LITERAL=60, BINARY_LITERAL=61, 
		FLOAT_LITERAL=62, HEX_FLOAT_LITERAL=63, BOOL_LITERAL=64, STRING_LITERAL=65, 
		MULTI_STRING_LIT=66, NULL_LITERAL=67, LPAREN=68, RPAREN=69, LBRACE=70, 
		RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, COMMA=75, DOT=76, ASSIGN=77, 
		GT=78, LT=79, BANG=80, TILDE=81, QUESTION=82, COLON=83, EQUAL=84, LE=85, 
		GE=86, NOTEQUAL=87, AND=88, OR=89, INC=90, DEC=91, ADD=92, SUB=93, MUL=94, 
		DIV=95, BITAND=96, BITOR=97, CARET=98, MOD=99, ADD_ASSIGN=100, SUB_ASSIGN=101, 
		MUL_ASSIGN=102, DIV_ASSIGN=103, AND_ASSIGN=104, OR_ASSIGN=105, XOR_ASSIGN=106, 
		MOD_ASSIGN=107, LSHIFT_ASSIGN=108, RSHIFT_ASSIGN=109, URSHIFT_ASSIGN=110, 
		ARROW=111, COLONCOLON=112, AT=113, ELLIPSIS=114, IDENTIFIER=115;
	public static final int
		RULE_processingSketch = 0, RULE_javaProcessingSketch = 1, RULE_staticProcessingSketch = 2, 
		RULE_activeProcessingSketch = 3, RULE_warnMixedModes = 4, RULE_variableDeclaratorId = 5, 
		RULE_warnTypeAsVariableName = 6, RULE_methodCall = 7, RULE_functionWithPrimitiveTypeName = 8, 
		RULE_primitiveType = 9, RULE_colorPrimitiveType = 10, RULE_qualifiedName = 11, 
		RULE_literal = 12, RULE_hexColorLiteral = 13, RULE_compilationUnit = 14, 
		RULE_packageDeclaration = 15, RULE_importDeclaration = 16, RULE_typeDeclaration = 17, 
		RULE_modifier = 18, RULE_classOrInterfaceModifier = 19, RULE_variableModifier = 20, 
		RULE_classDeclaration = 21, RULE_typeParameters = 22, RULE_typeParameter = 23, 
		RULE_typeBound = 24, RULE_enumDeclaration = 25, RULE_enumConstants = 26, 
		RULE_enumConstant = 27, RULE_enumBodyDeclarations = 28, RULE_interfaceDeclaration = 29, 
		RULE_classBody = 30, RULE_interfaceBody = 31, RULE_classBodyDeclaration = 32, 
		RULE_memberDeclaration = 33, RULE_methodDeclaration = 34, RULE_methodBody = 35, 
		RULE_typeTypeOrVoid = 36, RULE_genericMethodDeclaration = 37, RULE_genericConstructorDeclaration = 38, 
		RULE_constructorDeclaration = 39, RULE_fieldDeclaration = 40, RULE_interfaceBodyDeclaration = 41, 
		RULE_interfaceMemberDeclaration = 42, RULE_constDeclaration = 43, RULE_constantDeclarator = 44, 
		RULE_interfaceMethodDeclaration = 45, RULE_interfaceMethodModifier = 46, 
		RULE_genericInterfaceMethodDeclaration = 47, RULE_variableDeclarators = 48, 
		RULE_variableDeclarator = 49, RULE_variableInitializer = 50, RULE_arrayInitializer = 51, 
		RULE_classOrInterfaceType = 52, RULE_typeArgument = 53, RULE_qualifiedNameList = 54, 
		RULE_formalParameters = 55, RULE_formalParameterList = 56, RULE_formalParameter = 57, 
		RULE_lastFormalParameter = 58, RULE_baseStringLiteral = 59, RULE_multilineStringLiteral = 60, 
		RULE_stringLiteral = 61, RULE_integerLiteral = 62, RULE_floatLiteral = 63, 
		RULE_annotation = 64, RULE_elementValuePairs = 65, RULE_elementValuePair = 66, 
		RULE_elementValue = 67, RULE_elementValueArrayInitializer = 68, RULE_annotationTypeDeclaration = 69, 
		RULE_annotationTypeBody = 70, RULE_annotationTypeElementDeclaration = 71, 
		RULE_annotationTypeElementRest = 72, RULE_annotationMethodOrConstantRest = 73, 
		RULE_annotationMethodRest = 74, RULE_annotationConstantRest = 75, RULE_defaultValue = 76, 
		RULE_block = 77, RULE_blockStatement = 78, RULE_localVariableDeclaration = 79, 
		RULE_localTypeDeclaration = 80, RULE_statement = 81, RULE_catchClause = 82, 
		RULE_catchType = 83, RULE_finallyBlock = 84, RULE_resourceSpecification = 85, 
		RULE_resources = 86, RULE_resource = 87, RULE_switchBlockStatementGroup = 88, 
		RULE_switchLabel = 89, RULE_forControl = 90, RULE_forInit = 91, RULE_enhancedForControl = 92, 
		RULE_parExpression = 93, RULE_expressionList = 94, RULE_expression = 95, 
		RULE_lambdaExpression = 96, RULE_lambdaParameters = 97, RULE_lambdaBody = 98, 
		RULE_primary = 99, RULE_classType = 100, RULE_creator = 101, RULE_createdName = 102, 
		RULE_innerCreator = 103, RULE_arrayCreatorRest = 104, RULE_classCreatorRest = 105, 
		RULE_explicitGenericInvocation = 106, RULE_typeArgumentsOrDiamond = 107, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 108, RULE_nonWildcardTypeArguments = 109, 
		RULE_typeList = 110, RULE_typeType = 111, RULE_typeArguments = 112, RULE_superSuffix = 113, 
		RULE_explicitGenericInvocationSuffix = 114, RULE_arguments = 115;
	private static String[] makeRuleNames() {
		return new String[] {
			"processingSketch", "javaProcessingSketch", "staticProcessingSketch", 
			"activeProcessingSketch", "warnMixedModes", "variableDeclaratorId", "warnTypeAsVariableName", 
			"methodCall", "functionWithPrimitiveTypeName", "primitiveType", "colorPrimitiveType", 
			"qualifiedName", "literal", "hexColorLiteral", "compilationUnit", "packageDeclaration", 
			"importDeclaration", "typeDeclaration", "modifier", "classOrInterfaceModifier", 
			"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "enumDeclaration", "enumConstants", "enumConstant", "enumBodyDeclarations", 
			"interfaceDeclaration", "classBody", "interfaceBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
			"fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "genericInterfaceMethodDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "baseStringLiteral", "multilineStringLiteral", 
			"stringLiteral", "integerLiteral", "floatLiteral", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "expression", "lambdaExpression", "lambdaParameters", 
			"lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'color'", null, null, null, null, null, "'abstract'", "'assert'", 
			"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
			"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
			"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
			"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
			"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
			"'var'", "'void'", "'volatile'", "'while'", null, null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
			"'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "HexColorLiteral", "WS", "COMMENT", "LINE_COMMENT", "CHAR_LITERAL", 
			"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
			"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
			"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
			"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", 
			"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VAR", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "MULTI_STRING_LIT", "NULL_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Processing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProcessingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProcessingSketchContext extends ParserRuleContext {
		public JavaProcessingSketchContext javaProcessingSketch() {
			return getRuleContext(JavaProcessingSketchContext.class,0);
		}
		public StaticProcessingSketchContext staticProcessingSketch() {
			return getRuleContext(StaticProcessingSketchContext.class,0);
		}
		public ActiveProcessingSketchContext activeProcessingSketch() {
			return getRuleContext(ActiveProcessingSketchContext.class,0);
		}
		public WarnMixedModesContext warnMixedModes() {
			return getRuleContext(WarnMixedModesContext.class,0);
		}
		public ProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitProcessingSketch(this);
		}
	}

	public final ProcessingSketchContext processingSketch() throws RecognitionException {
		ProcessingSketchContext _localctx = new ProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_processingSketch);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				javaProcessingSketch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				staticProcessingSketch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				activeProcessingSketch();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				warnMixedModes();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JavaProcessingSketchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public JavaProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaProcessingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterJavaProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitJavaProcessingSketch(this);
		}
	}

	public final JavaProcessingSketchContext javaProcessingSketch() throws RecognitionException {
		JavaProcessingSketchContext _localctx = new JavaProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_javaProcessingSketch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(238);
				packageDeclaration();
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(241);
				importDeclaration();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				typeDeclaration();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT );
			setState(252);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticProcessingSketchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public StaticProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticProcessingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterStaticProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitStaticProcessingSketch(this);
		}
	}

	public final StaticProcessingSketchContext staticProcessingSketch() throws RecognitionException {
		StaticProcessingSketchContext _localctx = new StaticProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_staticProcessingSketch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(254);
					importDeclaration();
					}
					break;
				case T__0:
				case HexColorLiteral:
				case CHAR_LITERAL:
				case ABSTRACT:
				case ASSERT:
				case BOOLEAN:
				case BREAK:
				case BYTE:
				case CHAR:
				case CLASS:
				case CONTINUE:
				case DO:
				case DOUBLE:
				case FINAL:
				case FLOAT:
				case FOR:
				case IF:
				case INT:
				case INTERFACE:
				case LONG:
				case NEW:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case RETURN:
				case SHORT:
				case STATIC:
				case STRICTFP:
				case SUPER:
				case SWITCH:
				case SYNCHRONIZED:
				case THIS:
				case THROW:
				case TRY:
				case VAR:
				case VOID:
				case WHILE:
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
				case FLOAT_LITERAL:
				case HEX_FLOAT_LITERAL:
				case BOOL_LITERAL:
				case STRING_LITERAL:
				case MULTI_STRING_LIT:
				case NULL_LITERAL:
				case LPAREN:
				case LBRACE:
				case SEMI:
				case LT:
				case BANG:
				case TILDE:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case AT:
				case IDENTIFIER:
					{
					setState(255);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActiveProcessingSketchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ActiveProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeProcessingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterActiveProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitActiveProcessingSketch(this);
		}
	}

	public final ActiveProcessingSketchContext activeProcessingSketch() throws RecognitionException {
		ActiveProcessingSketchContext _localctx = new ActiveProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_activeProcessingSketch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(263);
					importDeclaration();
					}
					break;
				case 2:
					{
					setState(264);
					classBodyDeclaration();
					}
					break;
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WarnMixedModesContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public WarnMixedModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warnMixedModes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterWarnMixedModes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitWarnMixedModes(this);
		}
	}

	public final WarnMixedModesContext warnMixedModes() throws RecognitionException {
		WarnMixedModesContext _localctx = new WarnMixedModesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_warnMixedModes);
		int _la;
		try {
			int _alt;
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(275);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(272);
							importDeclaration();
							}
							break;
						case 2:
							{
							setState(273);
							classBodyDeclaration();
							}
							break;
						case 3:
							{
							setState(274);
							blockStatement();
							}
							break;
						}
						} 
					}
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(280);
				blockStatement();
				setState(281);
				classBodyDeclaration();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(282);
						importDeclaration();
						}
						break;
					case 2:
						{
						setState(283);
						classBodyDeclaration();
						}
						break;
					case 3:
						{
						setState(284);
						blockStatement();
						}
						break;
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(293);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(290);
							importDeclaration();
							}
							break;
						case 2:
							{
							setState(291);
							classBodyDeclaration();
							}
							break;
						case 3:
							{
							setState(292);
							blockStatement();
							}
							break;
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(298);
				classBodyDeclaration();
				setState(299);
				blockStatement();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(300);
						importDeclaration();
						}
						break;
					case 2:
						{
						setState(301);
						classBodyDeclaration();
						}
						break;
					case 3:
						{
						setState(302);
						blockStatement();
						}
						break;
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public WarnTypeAsVariableNameContext warnTypeAsVariableName() {
			return getRuleContext(WarnTypeAsVariableNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaratorId);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				warnTypeAsVariableName();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(IDENTIFIER);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(312);
					match(LBRACK);
					setState(313);
					match(RBRACK);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WarnTypeAsVariableNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public WarnTypeAsVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warnTypeAsVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterWarnTypeAsVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitWarnTypeAsVariableName(this);
		}
	}

	public final WarnTypeAsVariableNameContext warnTypeAsVariableName() throws RecognitionException {
		WarnTypeAsVariableNameContext _localctx = new WarnTypeAsVariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_warnTypeAsVariableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			((WarnTypeAsVariableNameContext)_localctx).primitiveType = primitiveType();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(322);
				match(LBRACK);
				setState(323);
				match(RBRACK);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        notifyErrorListeners("Type names are not allowed as variable names: "+(((WarnTypeAsVariableNameContext)_localctx).primitiveType!=null?_input.getText(((WarnTypeAsVariableNameContext)_localctx).primitiveType.start,((WarnTypeAsVariableNameContext)_localctx).primitiveType.stop):null));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public FunctionWithPrimitiveTypeNameContext functionWithPrimitiveTypeName() {
			return getRuleContext(FunctionWithPrimitiveTypeNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(ProcessingParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodCall);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				functionWithPrimitiveTypeName();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(IDENTIFIER);
				setState(333);
				match(LPAREN);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(334);
					expressionList();
					}
				}

				setState(337);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(THIS);
				setState(339);
				match(LPAREN);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(340);
					expressionList();
					}
				}

				setState(343);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(SUPER);
				setState(345);
				match(LPAREN);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(346);
					expressionList();
					}
				}

				setState(349);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionWithPrimitiveTypeNameContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode BOOLEAN() { return getToken(ProcessingParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(ProcessingParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(ProcessingParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(ProcessingParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ProcessingParser.INT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionWithPrimitiveTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWithPrimitiveTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFunctionWithPrimitiveTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFunctionWithPrimitiveTypeName(this);
		}
	}

	public final FunctionWithPrimitiveTypeNameContext functionWithPrimitiveTypeName() throws RecognitionException {
		FunctionWithPrimitiveTypeNameContext _localctx = new FunctionWithPrimitiveTypeNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionWithPrimitiveTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			match(LPAREN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(354);
				expressionList();
				}
			}

			setState(357);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ProcessingParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(ProcessingParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(ProcessingParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(ProcessingParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ProcessingParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ProcessingParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ProcessingParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ProcessingParser.DOUBLE, 0); }
		public ColorPrimitiveTypeContext colorPrimitiveType() {
			return getRuleContext(ColorPrimitiveTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitiveType);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(CHAR);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(BYTE);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(SHORT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(INT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				match(LONG);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(365);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				match(DOUBLE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(367);
				colorPrimitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorPrimitiveTypeContext extends ParserRuleContext {
		public ColorPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterColorPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitColorPrimitiveType(this);
		}
	}

	public final ColorPrimitiveTypeContext colorPrimitiveType() throws RecognitionException {
		ColorPrimitiveTypeContext _localctx = new ColorPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_colorPrimitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public List<ColorPrimitiveTypeContext> colorPrimitiveType() {
			return getRuleContexts(ColorPrimitiveTypeContext.class);
		}
		public ColorPrimitiveTypeContext colorPrimitiveType(int i) {
			return getRuleContext(ColorPrimitiveTypeContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProcessingParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProcessingParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(372);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(373);
				colorPrimitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(376);
					match(DOT);
					setState(379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(377);
						match(IDENTIFIER);
						}
						break;
					case T__0:
						{
						setState(378);
						colorPrimitiveType();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(ProcessingParser.CHAR_LITERAL, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(ProcessingParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ProcessingParser.NULL_LITERAL, 0); }
		public HexColorLiteralContext hexColorLiteral() {
			return getRuleContext(HexColorLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				match(NULL_LITERAL);
				}
				break;
			case HexColorLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				hexColorLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexColorLiteralContext extends ParserRuleContext {
		public TerminalNode HexColorLiteral() { return getToken(ProcessingParser.HexColorLiteral, 0); }
		public HexColorLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexColorLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterHexColorLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitHexColorLiteral(this);
		}
	}

	public final HexColorLiteralContext hexColorLiteral() throws RecognitionException {
		HexColorLiteralContext _localctx = new HexColorLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hexColorLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(HexColorLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(397);
				packageDeclaration();
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(400);
				importDeclaration();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(406);
				typeDeclaration();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ProcessingParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(414);
				annotation();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(PACKAGE);
			setState(421);
			qualifiedName();
			setState(422);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ProcessingParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(ProcessingParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(IMPORT);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(425);
				match(STATIC);
				}
			}

			setState(428);
			qualifiedName();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(429);
				match(DOT);
				setState(430);
				match(MUL);
				}
			}

			setState(433);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDeclaration);
		try {
			int _alt;
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(441);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(442);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(443);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(444);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(ProcessingParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(ProcessingParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(ProcessingParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(ProcessingParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modifier);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ProcessingParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ProcessingParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ProcessingParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ProcessingParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ProcessingParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(ProcessingParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classOrInterfaceModifier);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(464);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ProcessingParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableModifier);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ProcessingParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ProcessingParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(CLASS);
			setState(472);
			match(IDENTIFIER);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(473);
				typeParameters();
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(476);
				match(EXTENDS);
				setState(477);
				typeType();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(480);
				match(IMPLEMENTS);
				setState(481);
				typeList();
				}
			}

			setState(484);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LT);
			setState(487);
			typeParameter();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(488);
				match(COMMA);
				setState(489);
				typeParameter();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(497);
				annotation();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			match(IDENTIFIER);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(504);
				match(EXTENDS);
				setState(505);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ProcessingParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ProcessingParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			typeType();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(509);
				match(BITAND);
				setState(510);
				typeType();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ProcessingParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ProcessingParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ProcessingParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(ENUM);
			setState(517);
			match(IDENTIFIER);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(518);
				match(IMPLEMENTS);
				setState(519);
				typeList();
				}
			}

			setState(522);
			match(LBRACE);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(523);
				enumConstants();
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(526);
				match(COMMA);
				}
			}

			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(529);
				enumBodyDeclarations();
				}
			}

			setState(532);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			enumConstant();
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					match(COMMA);
					setState(536);
					enumConstant();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(542);
				annotation();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			match(IDENTIFIER);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(549);
				arguments();
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(552);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(SEMI);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(556);
				classBodyDeclaration();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ProcessingParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(INTERFACE);
			setState(563);
			match(IDENTIFIER);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(564);
				typeParameters();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(567);
				match(EXTENDS);
				setState(568);
				typeList();
				}
			}

			setState(571);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(LBRACE);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(574);
				classBodyDeclaration();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(LBRACE);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (LT - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				{
				setState(583);
				interfaceBodyDeclaration();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				importDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(593);
					match(STATIC);
					}
				}

				setState(596);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(597);
						modifier();
						}
						} 
					}
					setState(602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(603);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_memberDeclaration);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(612);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(614);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ProcessingParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			typeTypeOrVoid();
			setState(618);
			match(IDENTIFIER);
			setState(619);
			formalParameters();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(620);
				match(LBRACK);
				setState(621);
				match(RBRACK);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(627);
				match(THROWS);
				setState(628);
				qualifiedNameList();
				}
			}

			setState(631);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodBody);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ProcessingParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeTypeOrVoid);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			typeParameters();
			setState(642);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			typeParameters();
			setState(645);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(ProcessingParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(IDENTIFIER);
			setState(648);
			formalParameters();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(649);
				match(THROWS);
				setState(650);
				qualifiedNameList();
				}
			}

			setState(653);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			typeType();
			setState(656);
			variableDeclarators();
			setState(657);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VAR:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(659);
						modifier();
						}
						} 
					}
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(665);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceMemberDeclaration);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(673);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(674);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(675);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			typeType();
			setState(679);
			constantDeclarator();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(680);
				match(COMMA);
				setState(681);
				constantDeclarator();
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(687);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(IDENTIFIER);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(690);
				match(LBRACK);
				setState(691);
				match(RBRACK);
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
			match(ASSIGN);
			setState(698);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ProcessingParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					interfaceMethodModifier();
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(706);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(707);
				typeParameters();
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(708);
						annotation();
						}
						} 
					}
					setState(713);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(714);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(718);
			match(IDENTIFIER);
			setState(719);
			formalParameters();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(720);
				match(LBRACK);
				setState(721);
				match(RBRACK);
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(727);
				match(THROWS);
				setState(728);
				qualifiedNameList();
				}
			}

			setState(731);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ProcessingParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ProcessingParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(ProcessingParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(ProcessingParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interfaceMethodModifier);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(737);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(738);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			typeParameters();
			setState(742);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			variableDeclarator();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				variableDeclarator();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			variableDeclaratorId();
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(753);
				match(ASSIGN);
				setState(754);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableInitializer);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				arrayInitializer();
				}
				break;
			case T__0:
			case HexColorLiteral:
			case CHAR_LITERAL:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(LBRACE);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(762);
				variableInitializer();
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(763);
						match(COMMA);
						setState(764);
						variableInitializer();
						}
						} 
					}
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(770);
					match(COMMA);
					}
				}

				}
			}

			setState(775);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProcessingParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProcessingParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(IDENTIFIER);
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(778);
				typeArguments();
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(781);
					match(DOT);
					setState(782);
					match(IDENTIFIER);
					setState(784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(783);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ProcessingParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeArgument);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(QUESTION);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(793);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(794);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			qualifiedName();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800);
				match(COMMA);
				setState(801);
				qualifiedName();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(LPAREN);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(808);
				formalParameterList();
				}
			}

			setState(811);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				formalParameter();
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(814);
						match(COMMA);
						setState(815);
						formalParameter();
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(821);
					match(COMMA);
					setState(822);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(828);
					variableModifier();
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(834);
			typeType();
			setState(835);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(ProcessingParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					variableModifier();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(843);
			typeType();
			setState(844);
			match(ELLIPSIS);
			setState(845);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseStringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ProcessingParser.STRING_LITERAL, 0); }
		public BaseStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterBaseStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitBaseStringLiteral(this);
		}
	}

	public final BaseStringLiteralContext baseStringLiteral() throws RecognitionException {
		BaseStringLiteralContext _localctx = new BaseStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_baseStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultilineStringLiteralContext extends ParserRuleContext {
		public TerminalNode MULTI_STRING_LIT() { return getToken(ProcessingParser.MULTI_STRING_LIT, 0); }
		public MultilineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multilineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMultilineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMultilineStringLiteral(this);
		}
	}

	public final MultilineStringLiteralContext multilineStringLiteral() throws RecognitionException {
		MultilineStringLiteralContext _localctx = new MultilineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_multilineStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(MULTI_STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public BaseStringLiteralContext baseStringLiteral() {
			return getRuleContext(BaseStringLiteralContext.class,0);
		}
		public MultilineStringLiteralContext multilineStringLiteral() {
			return getRuleContext(MultilineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_stringLiteral);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				baseStringLiteral();
				}
				break;
			case MULTI_STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				multilineStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ProcessingParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ProcessingParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(ProcessingParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ProcessingParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(ProcessingParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(ProcessingParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ProcessingParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(AT);
			setState(860);
			qualifiedName();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(861);
				match(LPAREN);
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(862);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(863);
					elementValue();
					}
					break;
				}
				setState(866);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			elementValuePair();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(870);
				match(COMMA);
				setState(871);
				elementValuePair();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(IDENTIFIER);
			setState(878);
			match(ASSIGN);
			setState(879);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementValue);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(LBRACE);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(887);
				elementValue();
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(888);
						match(COMMA);
						setState(889);
						elementValue();
						}
						} 
					}
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
			}

			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(897);
				match(COMMA);
				}
			}

			setState(900);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ProcessingParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(ProcessingParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(AT);
			setState(903);
			match(INTERFACE);
			setState(904);
			match(IDENTIFIER);
			setState(905);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(LBRACE);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOLATILE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				{
				setState(908);
				annotationTypeElementDeclaration();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(914);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VAR:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(916);
						modifier();
						}
						} 
					}
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				setState(922);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotationTypeElementRest);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				typeType();
				setState(927);
				annotationMethodOrConstantRest();
				setState(928);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				classDeclaration();
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(931);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				interfaceDeclaration();
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(935);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(938);
				enumDeclaration();
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(939);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(942);
				annotationTypeDeclaration();
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(943);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotationMethodOrConstantRest);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(IDENTIFIER);
			setState(953);
			match(LPAREN);
			setState(954);
			match(RPAREN);
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(955);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(ProcessingParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(DEFAULT);
			setState(961);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(LBRACE);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(964);
				blockStatement();
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockStatement);
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				localVariableDeclaration();
				setState(973);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(976);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(979);
					variableModifier();
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(985);
			typeType();
			setState(986);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(988);
					classOrInterfaceModifier();
					}
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(994);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(995);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ProcessingParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public TerminalNode IF() { return getToken(ProcessingParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProcessingParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(ProcessingParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(ProcessingParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ProcessingParser.DO, 0); }
		public TerminalNode TRY() { return getToken(ProcessingParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(ProcessingParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(ProcessingParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(ProcessingParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(ProcessingParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(ProcessingParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(ProcessingParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(ASSERT);
				setState(1003);
				expression(0);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1004);
					match(COLON);
					setState(1005);
					expression(0);
					}
				}

				setState(1008);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				match(IF);
				setState(1011);
				parExpression();
				setState(1012);
				statement();
				setState(1015);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1013);
					match(ELSE);
					setState(1014);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				match(FOR);
				setState(1018);
				match(LPAREN);
				setState(1019);
				forControl();
				setState(1020);
				match(RPAREN);
				setState(1021);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1023);
				match(WHILE);
				setState(1024);
				parExpression();
				setState(1025);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1027);
				match(DO);
				setState(1028);
				statement();
				setState(1029);
				match(WHILE);
				setState(1030);
				parExpression();
				setState(1031);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				match(TRY);
				setState(1034);
				block();
				setState(1044);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1036); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1035);
						catchClause();
						}
						}
						setState(1038); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1040);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1043);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1046);
				match(TRY);
				setState(1047);
				resourceSpecification();
				setState(1048);
				block();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1049);
					catchClause();
					}
					}
					setState(1054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1055);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1058);
				match(SWITCH);
				setState(1059);
				parExpression();
				setState(1060);
				match(LBRACE);
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1061);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1066);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1067);
					switchLabel();
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1075);
				match(SYNCHRONIZED);
				setState(1076);
				parExpression();
				setState(1077);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1079);
				match(RETURN);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1080);
					expression(0);
					}
				}

				setState(1083);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1084);
				match(THROW);
				setState(1085);
				expression(0);
				setState(1086);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1088);
				match(BREAK);
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1089);
					match(IDENTIFIER);
					}
				}

				setState(1092);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1093);
				match(CONTINUE);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1094);
					match(IDENTIFIER);
					}
				}

				setState(1097);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1098);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1099);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1100);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1102);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(1103);
				match(COLON);
				setState(1104);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ProcessingParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(CATCH);
			setState(1108);
			match(LPAREN);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1109);
				variableModifier();
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
			catchType();
			setState(1116);
			match(IDENTIFIER);
			setState(1117);
			match(RPAREN);
			setState(1118);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ProcessingParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ProcessingParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			qualifiedName();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1121);
				match(BITOR);
				setState(1122);
				qualifiedName();
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ProcessingParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(FINALLY);
			setState(1129);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(LPAREN);
			setState(1132);
			resources();
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1133);
				match(SEMI);
				}
			}

			setState(1136);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcessingParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcessingParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			resource();
			setState(1143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1139);
					match(SEMI);
					setState(1140);
					resource();
					}
					} 
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1146);
				variableModifier();
				}
				}
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1152);
			classOrInterfaceType();
			setState(1153);
			variableDeclaratorId();
			setState(1154);
			match(ASSIGN);
			setState(1155);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1157);
				switchLabel();
				}
				}
				setState(1160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1162);
				blockStatement();
				}
				}
				setState(1165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(ProcessingParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(ProcessingParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_switchLabel);
		try {
			setState(1175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(CASE);
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1168);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1169);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1172);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				match(DEFAULT);
				setState(1174);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcessingParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcessingParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forControl);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1178);
					forInit();
					}
				}

				setState(1181);
				match(SEMI);
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1182);
					expression(0);
					}
				}

				setState(1185);
				match(SEMI);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1186);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forInit);
		try {
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1195);
					variableModifier();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1201);
			typeType();
			setState(1202);
			variableDeclaratorId();
			setState(1203);
			match(COLON);
			setState(1204);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(LPAREN);
			setState(1207);
			expression(0);
			setState(1208);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			expression(0);
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1211);
				match(COMMA);
				setState(1212);
				expression(0);
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ProcessingParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ProcessingParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ProcessingParser.SUB, 0); }
		public TerminalNode INC() { return getToken(ProcessingParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ProcessingParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(ProcessingParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ProcessingParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ProcessingParser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ProcessingParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ProcessingParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ProcessingParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(ProcessingParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ProcessingParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ProcessingParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ProcessingParser.GT, i);
		}
		public TerminalNode LE() { return getToken(ProcessingParser.LE, 0); }
		public TerminalNode GE() { return getToken(ProcessingParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(ProcessingParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ProcessingParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(ProcessingParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(ProcessingParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(ProcessingParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(ProcessingParser.AND, 0); }
		public TerminalNode OR() { return getToken(ProcessingParser.OR, 0); }
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(ProcessingParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ProcessingParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ProcessingParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ProcessingParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ProcessingParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ProcessingParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ProcessingParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ProcessingParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ProcessingParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(ProcessingParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ProcessingParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ProcessingParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(ProcessingParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ProcessingParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ProcessingParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(ProcessingParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1219);
				primary();
				}
				break;
			case 2:
				{
				setState(1220);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1221);
				match(NEW);
				setState(1222);
				creator();
				}
				break;
			case 4:
				{
				setState(1223);
				match(LPAREN);
				setState(1224);
				typeType();
				setState(1225);
				match(RPAREN);
				setState(1226);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1228);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (INC - 90)) | (1L << (DEC - 90)) | (1L << (ADD - 90)) | (1L << (SUB - 90)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1229);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1230);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1231);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1232);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1233);
				typeType();
				setState(1234);
				match(COLONCOLON);
				setState(1240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1235);
						typeArguments();
						}
					}

					setState(1238);
					match(IDENTIFIER);
					}
					break;
				case NEW:
					{
					setState(1239);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1242);
				classType();
				setState(1243);
				match(COLONCOLON);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1244);
					typeArguments();
					}
				}

				setState(1247);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1251);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1252);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (MUL - 94)) | (1L << (DIV - 94)) | (1L << (MOD - 94)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1253);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1254);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1255);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1256);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1257);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1265);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
						case 1:
							{
							setState(1258);
							match(LT);
							setState(1259);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1260);
							match(GT);
							setState(1261);
							match(GT);
							setState(1262);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1263);
							match(GT);
							setState(1264);
							match(GT);
							}
							break;
						}
						setState(1267);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1268);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1269);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1270);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1271);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1272);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1273);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1274);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1275);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1276);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1277);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1278);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1279);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1280);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1281);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1282);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1283);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1284);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1285);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1286);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1287);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1288);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1289);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1290);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1291);
						expression(0);
						setState(1292);
						match(COLON);
						setState(1293);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1295);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1296);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ASSIGN - 77)) | (1L << (ADD_ASSIGN - 77)) | (1L << (SUB_ASSIGN - 77)) | (1L << (MUL_ASSIGN - 77)) | (1L << (DIV_ASSIGN - 77)) | (1L << (AND_ASSIGN - 77)) | (1L << (OR_ASSIGN - 77)) | (1L << (XOR_ASSIGN - 77)) | (1L << (MOD_ASSIGN - 77)) | (1L << (LSHIFT_ASSIGN - 77)) | (1L << (RSHIFT_ASSIGN - 77)) | (1L << (URSHIFT_ASSIGN - 77)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1297);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1298);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1299);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1311);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1300);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1301);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1302);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1303);
							match(NEW);
							setState(1305);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1304);
								nonWildcardTypeArguments();
								}
							}

							setState(1307);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1308);
							match(SUPER);
							setState(1309);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1310);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1313);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1314);
						match(LBRACK);
						setState(1315);
						expression(0);
						setState(1316);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1318);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1319);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1320);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1321);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1322);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1323);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1324);
						match(COLONCOLON);
						setState(1326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1325);
							typeArguments();
							}
						}

						setState(1328);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ProcessingParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			lambdaParameters();
			setState(1335);
			match(ARROW);
			setState(1336);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_lambdaParameters);
		int _la;
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339);
				match(LPAREN);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1340);
					formalParameterList();
					}
				}

				setState(1343);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				match(LPAREN);
				setState(1345);
				match(IDENTIFIER);
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1346);
					match(COMMA);
					setState(1347);
					match(IDENTIFIER);
					}
					}
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1353);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_lambdaBody);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case HexColorLiteral:
			case CHAR_LITERAL:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(ProcessingParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(ProcessingParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_primary);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				match(LPAREN);
				setState(1361);
				expression(0);
				setState(1362);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1367);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1368);
				typeTypeOrVoid();
				setState(1369);
				match(DOT);
				setState(1370);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1372);
				nonWildcardTypeArguments();
				setState(1376);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1373);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1374);
					match(THIS);
					setState(1375);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1380);
				classOrInterfaceType();
				setState(1381);
				match(DOT);
				}
				break;
			}
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1385);
				annotation();
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
			match(IDENTIFIER);
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1392);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_creator);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				nonWildcardTypeArguments();
				setState(1396);
				createdName();
				setState(1397);
				classCreatorRest();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				createdName();
				setState(1402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1400);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1401);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProcessingParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProcessingParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_createdName);
		int _la;
		try {
			setState(1421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				match(IDENTIFIER);
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1407);
					typeArgumentsOrDiamond();
					}
				}

				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1410);
					match(DOT);
					setState(1411);
					match(IDENTIFIER);
					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1412);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(IDENTIFIER);
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1424);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1427);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(LBRACK);
			setState(1457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1430);
				match(RBRACK);
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1431);
					match(LBRACK);
					setState(1432);
					match(RBRACK);
					}
					}
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1438);
				arrayInitializer();
				}
				break;
			case T__0:
			case HexColorLiteral:
			case CHAR_LITERAL:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1439);
				expression(0);
				setState(1440);
				match(RBRACK);
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1441);
						match(LBRACK);
						setState(1442);
						expression(0);
						setState(1443);
						match(RBRACK);
						}
						} 
					}
					setState(1449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1450);
						match(LBRACK);
						setState(1451);
						match(RBRACK);
						}
						} 
					}
					setState(1456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			arguments();
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1460);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			nonWildcardTypeArguments();
			setState(1464);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_typeArgumentsOrDiamond);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				match(LT);
				setState(1467);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				match(LT);
				setState(1472);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(LT);
			setState(1477);
			typeList();
			setState(1478);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			typeType();
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1481);
				match(COMMA);
				setState(1482);
				typeType();
				}
				}
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ProcessingParser.VAR, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1488);
				annotation();
				}
			}

			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1491);
				classOrInterfaceType();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1492);
				primitiveType();
				}
				break;
			case VAR:
				{
				setState(1493);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1496);
					match(LBRACK);
					setState(1497);
					match(RBRACK);
					}
					} 
				}
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(LT);
			setState(1504);
			typeArgument();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1505);
				match(COMMA);
				setState(1506);
				typeArgument();
				}
				}
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1512);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_superSuffix);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				match(DOT);
				setState(1516);
				match(IDENTIFIER);
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1517);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(SUPER);
				setState(1523);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				match(IDENTIFIER);
				setState(1525);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(LPAREN);
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1529);
				expressionList();
				}
			}

			setState(1532);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 95:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u0601\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\3\2\5\2\u00ef\n\2\3\3\5\3\u00f2\n\3\3\3\7\3\u00f5\n\3\f\3\16\3\u00f8"+
		"\13\3\3\3\6\3\u00fb\n\3\r\3\16\3\u00fc\3\3\3\3\3\4\3\4\7\4\u0103\n\4\f"+
		"\4\16\4\u0106\13\4\3\4\3\4\3\5\3\5\7\5\u010c\n\5\f\5\16\5\u010f\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\7\6\u0116\n\6\f\6\16\6\u0119\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u0120\n\6\f\6\16\6\u0123\13\6\3\6\3\6\3\6\7\6\u0128\n\6\f\6\16"+
		"\6\u012b\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0132\n\6\f\6\16\6\u0135\13\6\5"+
		"\6\u0137\n\6\3\7\3\7\3\7\3\7\7\7\u013d\n\7\f\7\16\7\u0140\13\7\5\7\u0142"+
		"\n\7\3\b\3\b\3\b\7\b\u0147\n\b\f\b\16\b\u014a\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\5\t\u0152\n\t\3\t\3\t\3\t\3\t\5\t\u0158\n\t\3\t\3\t\3\t\3\t\5\t\u015e"+
		"\n\t\3\t\5\t\u0161\n\t\3\n\3\n\3\n\5\n\u0166\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0173\n\13\3\f\3\f\3\r\3\r\5\r\u0179"+
		"\n\r\3\r\3\r\3\r\5\r\u017e\n\r\7\r\u0180\n\r\f\r\16\r\u0183\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u018c\n\16\3\17\3\17\3\20\5\20\u0191"+
		"\n\20\3\20\7\20\u0194\n\20\f\20\16\20\u0197\13\20\3\20\7\20\u019a\n\20"+
		"\f\20\16\20\u019d\13\20\3\20\3\20\3\21\7\21\u01a2\n\21\f\21\16\21\u01a5"+
		"\13\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u01ad\n\22\3\22\3\22\3\22\5"+
		"\22\u01b2\n\22\3\22\3\22\3\23\7\23\u01b7\n\23\f\23\16\23\u01ba\13\23\3"+
		"\23\3\23\3\23\3\23\5\23\u01c0\n\23\3\23\5\23\u01c3\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01ca\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u01d4\n\25\3\26\3\26\5\26\u01d8\n\26\3\27\3\27\3\27\5\27\u01dd\n\27\3"+
		"\27\3\27\5\27\u01e1\n\27\3\27\3\27\5\27\u01e5\n\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u01ed\n\30\f\30\16\30\u01f0\13\30\3\30\3\30\3\31\7\31"+
		"\u01f5\n\31\f\31\16\31\u01f8\13\31\3\31\3\31\3\31\5\31\u01fd\n\31\3\32"+
		"\3\32\3\32\7\32\u0202\n\32\f\32\16\32\u0205\13\32\3\33\3\33\3\33\3\33"+
		"\5\33\u020b\n\33\3\33\3\33\5\33\u020f\n\33\3\33\5\33\u0212\n\33\3\33\5"+
		"\33\u0215\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u021c\n\34\f\34\16\34\u021f"+
		"\13\34\3\35\7\35\u0222\n\35\f\35\16\35\u0225\13\35\3\35\3\35\5\35\u0229"+
		"\n\35\3\35\5\35\u022c\n\35\3\36\3\36\7\36\u0230\n\36\f\36\16\36\u0233"+
		"\13\36\3\37\3\37\3\37\5\37\u0238\n\37\3\37\3\37\5\37\u023c\n\37\3\37\3"+
		"\37\3 \3 \7 \u0242\n \f \16 \u0245\13 \3 \3 \3!\3!\7!\u024b\n!\f!\16!"+
		"\u024e\13!\3!\3!\3\"\3\"\3\"\5\"\u0255\n\"\3\"\3\"\7\"\u0259\n\"\f\"\16"+
		"\"\u025c\13\"\3\"\5\"\u025f\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u026a\n"+
		"#\3$\3$\3$\3$\3$\7$\u0271\n$\f$\16$\u0274\13$\3$\3$\5$\u0278\n$\3$\3$"+
		"\3%\3%\5%\u027e\n%\3&\3&\5&\u0282\n&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)"+
		"\5)\u028e\n)\3)\3)\3*\3*\3*\3*\3+\7+\u0297\n+\f+\16+\u029a\13+\3+\3+\5"+
		"+\u029e\n+\3,\3,\3,\3,\3,\3,\3,\5,\u02a7\n,\3-\3-\3-\3-\7-\u02ad\n-\f"+
		"-\16-\u02b0\13-\3-\3-\3.\3.\3.\7.\u02b7\n.\f.\16.\u02ba\13.\3.\3.\3.\3"+
		"/\7/\u02c0\n/\f/\16/\u02c3\13/\3/\3/\3/\7/\u02c8\n/\f/\16/\u02cb\13/\3"+
		"/\3/\5/\u02cf\n/\3/\3/\3/\3/\7/\u02d5\n/\f/\16/\u02d8\13/\3/\3/\5/\u02dc"+
		"\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02e6\n\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\7\62\u02ee\n\62\f\62\16\62\u02f1\13\62\3\63\3\63\3\63"+
		"\5\63\u02f6\n\63\3\64\3\64\5\64\u02fa\n\64\3\65\3\65\3\65\3\65\7\65\u0300"+
		"\n\65\f\65\16\65\u0303\13\65\3\65\5\65\u0306\n\65\5\65\u0308\n\65\3\65"+
		"\3\65\3\66\3\66\5\66\u030e\n\66\3\66\3\66\3\66\5\66\u0313\n\66\7\66\u0315"+
		"\n\66\f\66\16\66\u0318\13\66\3\67\3\67\3\67\3\67\5\67\u031e\n\67\5\67"+
		"\u0320\n\67\38\38\38\78\u0325\n8\f8\168\u0328\138\39\39\59\u032c\n9\3"+
		"9\39\3:\3:\3:\7:\u0333\n:\f:\16:\u0336\13:\3:\3:\5:\u033a\n:\3:\5:\u033d"+
		"\n:\3;\7;\u0340\n;\f;\16;\u0343\13;\3;\3;\3;\3<\7<\u0349\n<\f<\16<\u034c"+
		"\13<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\5?\u0358\n?\3@\3@\3A\3A\3B\3B\3B\3"+
		"B\3B\5B\u0363\nB\3B\5B\u0366\nB\3C\3C\3C\7C\u036b\nC\fC\16C\u036e\13C"+
		"\3D\3D\3D\3D\3E\3E\3E\5E\u0377\nE\3F\3F\3F\3F\7F\u037d\nF\fF\16F\u0380"+
		"\13F\5F\u0382\nF\3F\5F\u0385\nF\3F\3F\3G\3G\3G\3G\3G\3H\3H\7H\u0390\n"+
		"H\fH\16H\u0393\13H\3H\3H\3I\7I\u0398\nI\fI\16I\u039b\13I\3I\3I\5I\u039f"+
		"\nI\3J\3J\3J\3J\3J\3J\5J\u03a7\nJ\3J\3J\5J\u03ab\nJ\3J\3J\5J\u03af\nJ"+
		"\3J\3J\5J\u03b3\nJ\5J\u03b5\nJ\3K\3K\5K\u03b9\nK\3L\3L\3L\3L\5L\u03bf"+
		"\nL\3M\3M\3N\3N\3N\3O\3O\7O\u03c8\nO\fO\16O\u03cb\13O\3O\3O\3P\3P\3P\3"+
		"P\3P\5P\u03d4\nP\3Q\7Q\u03d7\nQ\fQ\16Q\u03da\13Q\3Q\3Q\3Q\3R\7R\u03e0"+
		"\nR\fR\16R\u03e3\13R\3R\3R\5R\u03e7\nR\3R\5R\u03ea\nR\3S\3S\3S\3S\3S\5"+
		"S\u03f1\nS\3S\3S\3S\3S\3S\3S\3S\5S\u03fa\nS\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\6S\u040f\nS\rS\16S\u0410\3S\5S\u0414\n"+
		"S\3S\5S\u0417\nS\3S\3S\3S\3S\7S\u041d\nS\fS\16S\u0420\13S\3S\5S\u0423"+
		"\nS\3S\3S\3S\3S\7S\u0429\nS\fS\16S\u042c\13S\3S\7S\u042f\nS\fS\16S\u0432"+
		"\13S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u043c\nS\3S\3S\3S\3S\3S\3S\3S\5S\u0445"+
		"\nS\3S\3S\3S\5S\u044a\nS\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0454\nS\3T\3T\3T"+
		"\7T\u0459\nT\fT\16T\u045c\13T\3T\3T\3T\3T\3T\3U\3U\3U\7U\u0466\nU\fU\16"+
		"U\u0469\13U\3V\3V\3V\3W\3W\3W\5W\u0471\nW\3W\3W\3X\3X\3X\7X\u0478\nX\f"+
		"X\16X\u047b\13X\3Y\7Y\u047e\nY\fY\16Y\u0481\13Y\3Y\3Y\3Y\3Y\3Y\3Z\6Z\u0489"+
		"\nZ\rZ\16Z\u048a\3Z\6Z\u048e\nZ\rZ\16Z\u048f\3[\3[\3[\5[\u0495\n[\3[\3"+
		"[\3[\5[\u049a\n[\3\\\3\\\5\\\u049e\n\\\3\\\3\\\5\\\u04a2\n\\\3\\\3\\\5"+
		"\\\u04a6\n\\\5\\\u04a8\n\\\3]\3]\5]\u04ac\n]\3^\7^\u04af\n^\f^\16^\u04b2"+
		"\13^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\7`\u04c0\n`\f`\16`\u04c3\13`"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u04d7\na\3a"+
		"\3a\5a\u04db\na\3a\3a\3a\5a\u04e0\na\3a\3a\5a\u04e4\na\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u04f4\na\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\5a\u051c\na\3a\3a\3a\3a\5a\u0522\na\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\5a\u0531\na\3a\7a\u0534\na\fa\16a\u0537\13a\3b\3"+
		"b\3b\3b\3c\3c\3c\5c\u0540\nc\3c\3c\3c\3c\3c\7c\u0547\nc\fc\16c\u054a\13"+
		"c\3c\5c\u054d\nc\3d\3d\5d\u0551\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\5e\u0563\ne\5e\u0565\ne\3f\3f\3f\5f\u056a\nf\3f\7f\u056d"+
		"\nf\ff\16f\u0570\13f\3f\3f\5f\u0574\nf\3g\3g\3g\3g\3g\3g\3g\5g\u057d\n"+
		"g\5g\u057f\ng\3h\3h\5h\u0583\nh\3h\3h\3h\5h\u0588\nh\7h\u058a\nh\fh\16"+
		"h\u058d\13h\3h\5h\u0590\nh\3i\3i\5i\u0594\ni\3i\3i\3j\3j\3j\3j\7j\u059c"+
		"\nj\fj\16j\u059f\13j\3j\3j\3j\3j\3j\3j\3j\7j\u05a8\nj\fj\16j\u05ab\13"+
		"j\3j\3j\7j\u05af\nj\fj\16j\u05b2\13j\5j\u05b4\nj\3k\3k\5k\u05b8\nk\3l"+
		"\3l\3l\3m\3m\3m\5m\u05c0\nm\3n\3n\3n\5n\u05c5\nn\3o\3o\3o\3o\3p\3p\3p"+
		"\7p\u05ce\np\fp\16p\u05d1\13p\3q\5q\u05d4\nq\3q\3q\3q\5q\u05d9\nq\3q\3"+
		"q\7q\u05dd\nq\fq\16q\u05e0\13q\3r\3r\3r\3r\7r\u05e6\nr\fr\16r\u05e9\13"+
		"r\3r\3r\3s\3s\3s\3s\5s\u05f1\ns\5s\u05f3\ns\3t\3t\3t\3t\5t\u05f9\nt\3"+
		"u\3u\5u\u05fd\nu\3u\3u\3u\2\3\u00c0v\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\2\16\b\2\3\3\13\13\r\r\20\20\34\34##\4\2\31\31"+
		"\60\60\3\2<?\3\2@A\3\2\\_\3\2RS\4\2`aee\3\2^_\4\2PQWX\4\2VVYY\4\2OOfp"+
		"\3\2\\]\2\u06b7\2\u00ee\3\2\2\2\4\u00f1\3\2\2\2\6\u0104\3\2\2\2\b\u010d"+
		"\3\2\2\2\n\u0136\3\2\2\2\f\u0141\3\2\2\2\16\u0143\3\2\2\2\20\u0160\3\2"+
		"\2\2\22\u0162\3\2\2\2\24\u0172\3\2\2\2\26\u0174\3\2\2\2\30\u0178\3\2\2"+
		"\2\32\u018b\3\2\2\2\34\u018d\3\2\2\2\36\u0190\3\2\2\2 \u01a3\3\2\2\2\""+
		"\u01aa\3\2\2\2$\u01c2\3\2\2\2&\u01c9\3\2\2\2(\u01d3\3\2\2\2*\u01d7\3\2"+
		"\2\2,\u01d9\3\2\2\2.\u01e8\3\2\2\2\60\u01f6\3\2\2\2\62\u01fe\3\2\2\2\64"+
		"\u0206\3\2\2\2\66\u0218\3\2\2\28\u0223\3\2\2\2:\u022d\3\2\2\2<\u0234\3"+
		"\2\2\2>\u023f\3\2\2\2@\u0248\3\2\2\2B\u025e\3\2\2\2D\u0269\3\2\2\2F\u026b"+
		"\3\2\2\2H\u027d\3\2\2\2J\u0281\3\2\2\2L\u0283\3\2\2\2N\u0286\3\2\2\2P"+
		"\u0289\3\2\2\2R\u0291\3\2\2\2T\u029d\3\2\2\2V\u02a6\3\2\2\2X\u02a8\3\2"+
		"\2\2Z\u02b3\3\2\2\2\\\u02c1\3\2\2\2^\u02e5\3\2\2\2`\u02e7\3\2\2\2b\u02ea"+
		"\3\2\2\2d\u02f2\3\2\2\2f\u02f9\3\2\2\2h\u02fb\3\2\2\2j\u030b\3\2\2\2l"+
		"\u031f\3\2\2\2n\u0321\3\2\2\2p\u0329\3\2\2\2r\u033c\3\2\2\2t\u0341\3\2"+
		"\2\2v\u034a\3\2\2\2x\u0351\3\2\2\2z\u0353\3\2\2\2|\u0357\3\2\2\2~\u0359"+
		"\3\2\2\2\u0080\u035b\3\2\2\2\u0082\u035d\3\2\2\2\u0084\u0367\3\2\2\2\u0086"+
		"\u036f\3\2\2\2\u0088\u0376\3\2\2\2\u008a\u0378\3\2\2\2\u008c\u0388\3\2"+
		"\2\2\u008e\u038d\3\2\2\2\u0090\u039e\3\2\2\2\u0092\u03b4\3\2\2\2\u0094"+
		"\u03b8\3\2\2\2\u0096\u03ba\3\2\2\2\u0098\u03c0\3\2\2\2\u009a\u03c2\3\2"+
		"\2\2\u009c\u03c5\3\2\2\2\u009e\u03d3\3\2\2\2\u00a0\u03d8\3\2\2\2\u00a2"+
		"\u03e9\3\2\2\2\u00a4\u0453\3\2\2\2\u00a6\u0455\3\2\2\2\u00a8\u0462\3\2"+
		"\2\2\u00aa\u046a\3\2\2\2\u00ac\u046d\3\2\2\2\u00ae\u0474\3\2\2\2\u00b0"+
		"\u047f\3\2\2\2\u00b2\u0488\3\2\2\2\u00b4\u0499\3\2\2\2\u00b6\u04a7\3\2"+
		"\2\2\u00b8\u04ab\3\2\2\2\u00ba\u04b0\3\2\2\2\u00bc\u04b8\3\2\2\2\u00be"+
		"\u04bc\3\2\2\2\u00c0\u04e3\3\2\2\2\u00c2\u0538\3\2\2\2\u00c4\u054c\3\2"+
		"\2\2\u00c6\u0550\3\2\2\2\u00c8\u0564\3\2\2\2\u00ca\u0569\3\2\2\2\u00cc"+
		"\u057e\3\2\2\2\u00ce\u058f\3\2\2\2\u00d0\u0591\3\2\2\2\u00d2\u0597\3\2"+
		"\2\2\u00d4\u05b5\3\2\2\2\u00d6\u05b9\3\2\2\2\u00d8\u05bf\3\2\2\2\u00da"+
		"\u05c4\3\2\2\2\u00dc\u05c6\3\2\2\2\u00de\u05ca\3\2\2\2\u00e0\u05d3\3\2"+
		"\2\2\u00e2\u05e1\3\2\2\2\u00e4\u05f2\3\2\2\2\u00e6\u05f8\3\2\2\2\u00e8"+
		"\u05fa\3\2\2\2\u00ea\u00ef\5\4\3\2\u00eb\u00ef\5\6\4\2\u00ec\u00ef\5\b"+
		"\5\2\u00ed\u00ef\5\n\6\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\3\3\2\2\2\u00f0\u00f2\5 \21\2"+
		"\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5"+
		"\5\"\22\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb"+
		"\5$\23\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\2\2\3\u00ff\5\3\2\2\2"+
		"\u0100\u0103\5\"\22\2\u0101\u0103\5\u009eP\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\2\2\3\u0108"+
		"\7\3\2\2\2\u0109\u010c\5\"\22\2\u010a\u010c\5B\"\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\2\2\3\u0111"+
		"\t\3\2\2\2\u0112\u0116\5\"\22\2\u0113\u0116\5B\"\2\u0114\u0116\5\u009e"+
		"P\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011b\5\u009eP\2\u011b\u0121\5B\"\2\u011c"+
		"\u0120\5\"\22\2\u011d\u0120\5B\"\2\u011e\u0120\5\u009eP\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0137\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0124\u0128\5\"\22\2\u0125\u0128\5B\"\2\u0126\u0128\5\u009eP\2\u0127"+
		"\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\5B\"\2\u012d\u0133\5\u009eP\2\u012e\u0132\5"+
		"\"\22\2\u012f\u0132\5B\"\2\u0130\u0132\5\u009eP\2\u0131\u012e\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0117\3\2\2\2\u0136\u0129\3\2\2\2\u0137\13\3\2\2\2\u0138\u0142\5\16\b"+
		"\2\u0139\u013e\7u\2\2\u013a\u013b\7J\2\2\u013b\u013d\7K\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u0139\3\2"+
		"\2\2\u0142\r\3\2\2\2\u0143\u0148\5\24\13\2\u0144\u0145\7J\2\2\u0145\u0147"+
		"\7K\2\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\b\b"+
		"\1\2\u014c\17\3\2\2\2\u014d\u0161\5\22\n\2\u014e\u014f\7u\2\2\u014f\u0151"+
		"\7F\2\2\u0150\u0152\5\u00be`\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0153\u0161\7G\2\2\u0154\u0155\7\63\2\2\u0155\u0157"+
		"\7F\2\2\u0156\u0158\5\u00be`\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u0161\7G\2\2\u015a\u015b\7\60\2\2\u015b\u015d"+
		"\7F\2\2\u015c\u015e\5\u00be`\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u0161\7G\2\2\u0160\u014d\3\2\2\2\u0160\u014e"+
		"\3\2\2\2\u0160\u0154\3\2\2\2\u0160\u015a\3\2\2\2\u0161\21\3\2\2\2\u0162"+
		"\u0163\t\2\2\2\u0163\u0165\7F\2\2\u0164\u0166\5\u00be`\2\u0165\u0164\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7G\2\2\u0168"+
		"\23\3\2\2\2\u0169\u0173\7\13\2\2\u016a\u0173\7\20\2\2\u016b\u0173\7\r"+
		"\2\2\u016c\u0173\7-\2\2\u016d\u0173\7#\2\2\u016e\u0173\7%\2\2\u016f\u0173"+
		"\7\34\2\2\u0170\u0173\7\26\2\2\u0171\u0173\5\26\f\2\u0172\u0169\3\2\2"+
		"\2\u0172\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u016d"+
		"\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173\25\3\2\2\2\u0174\u0175\7\3\2\2\u0175\27\3\2\2\2\u0176"+
		"\u0179\7u\2\2\u0177\u0179\5\26\f\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2"+
		"\2\2\u0179\u0181\3\2\2\2\u017a\u017d\7N\2\2\u017b\u017e\7u\2\2\u017c\u017e"+
		"\5\26\f\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0180\3\2\2\2"+
		"\u017f\u017a\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\31\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u018c\5~@\2\u0185"+
		"\u018c\5\u0080A\2\u0186\u018c\7\b\2\2\u0187\u018c\5|?\2\u0188\u018c\7"+
		"B\2\2\u0189\u018c\7E\2\2\u018a\u018c\5\34\17\2\u018b\u0184\3\2\2\2\u018b"+
		"\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c\33\3\2\2\2\u018d\u018e"+
		"\7\4\2\2\u018e\35\3\2\2\2\u018f\u0191\5 \21\2\u0190\u018f\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0195\3\2\2\2\u0192\u0194\5\"\22\2\u0193\u0192\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u019b\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\5$\23\2\u0199\u0198\3\2"+
		"\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\2\2\3\u019f\37\3\2\2"+
		"\2\u01a0\u01a2\5\u0082B\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01a7\7(\2\2\u01a7\u01a8\5\30\r\2\u01a8\u01a9\7L\2\2\u01a9"+
		"!\3\2\2\2\u01aa\u01ac\7!\2\2\u01ab\u01ad\7.\2\2\u01ac\u01ab\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\5\30\r\2\u01af\u01b0\7"+
		"N\2\2\u01b0\u01b2\7`\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\7L\2\2\u01b4#\3\2\2\2\u01b5\u01b7\5(\25\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01bf\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01c0\5,\27\2\u01bc"+
		"\u01c0\5\64\33\2\u01bd\u01c0\5<\37\2\u01be\u01c0\5\u008cG\2\u01bf\u01bb"+
		"\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01c3\7L\2\2\u01c2\u01b8\3\2\2\2\u01c2\u01c1\3\2"+
		"\2\2\u01c3%\3\2\2\2\u01c4\u01ca\5(\25\2\u01c5\u01ca\7&\2\2\u01c6\u01ca"+
		"\7\62\2\2\u01c7\u01ca\7\66\2\2\u01c8\u01ca\7:\2\2\u01c9\u01c4\3\2\2\2"+
		"\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca\'\3\2\2\2\u01cb\u01d4\5\u0082B\2\u01cc\u01d4\7+\2\2\u01cd"+
		"\u01d4\7*\2\2\u01ce\u01d4\7)\2\2\u01cf\u01d4\7.\2\2\u01d0\u01d4\7\t\2"+
		"\2\u01d1\u01d4\7\32\2\2\u01d2\u01d4\7/\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01cc"+
		"\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3"+
		"\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4)\3\2\2\2"+
		"\u01d5\u01d8\7\32\2\2\u01d6\u01d8\5\u0082B\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8+\3\2\2\2\u01d9\u01da\7\21\2\2\u01da\u01dc\7u\2\2"+
		"\u01db\u01dd\5.\30\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0"+
		"\3\2\2\2\u01de\u01df\7\31\2\2\u01df\u01e1\5\u00e0q\2\u01e0\u01de\3\2\2"+
		"\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3\7 \2\2\u01e3\u01e5"+
		"\5\u00dep\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2"+
		"\2\u01e6\u01e7\5> \2\u01e7-\3\2\2\2\u01e8\u01e9\7Q\2\2\u01e9\u01ee\5\60"+
		"\31\2\u01ea\u01eb\7M\2\2\u01eb\u01ed\5\60\31\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7P\2\2\u01f2/\3\2\2\2\u01f3\u01f5"+
		"\5\u0082B\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc"+
		"\7u\2\2\u01fa\u01fb\7\31\2\2\u01fb\u01fd\5\62\32\2\u01fc\u01fa\3\2\2\2"+
		"\u01fc\u01fd\3\2\2\2\u01fd\61\3\2\2\2\u01fe\u0203\5\u00e0q\2\u01ff\u0200"+
		"\7b\2\2\u0200\u0202\5\u00e0q\2\u0201\u01ff\3\2\2\2\u0202\u0205\3\2\2\2"+
		"\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\63\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0206\u0207\7\30\2\2\u0207\u020a\7u\2\2\u0208\u0209\7 \2\2\u0209"+
		"\u020b\5\u00dep\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020e\7H\2\2\u020d\u020f\5\66\34\2\u020e\u020d\3\2\2\2"+
		"\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0212\7M\2\2\u0211\u0210"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\5:\36\2\u0214"+
		"\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7I"+
		"\2\2\u0217\65\3\2\2\2\u0218\u021d\58\35\2\u0219\u021a\7M\2\2\u021a\u021c"+
		"\58\35\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\67\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\5\u0082"+
		"B\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228\7u"+
		"\2\2\u0227\u0229\5\u00e8u\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u022c\5> \2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2"+
		"\2\u022c9\3\2\2\2\u022d\u0231\7L\2\2\u022e\u0230\5B\"\2\u022f\u022e\3"+
		"\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		";\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235\7$\2\2\u0235\u0237\7u\2\2\u0236"+
		"\u0238\5.\30\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023b\3\2"+
		"\2\2\u0239\u023a\7\31\2\2\u023a\u023c\5\u00dep\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\5@!\2\u023e=\3\2\2\2\u023f"+
		"\u0243\7H\2\2\u0240\u0242\5B\"\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2"+
		"\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243"+
		"\3\2\2\2\u0246\u0247\7I\2\2\u0247?\3\2\2\2\u0248\u024c\7H\2\2\u0249\u024b"+
		"\5T+\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7I"+
		"\2\2\u0250A\3\2\2\2\u0251\u025f\7L\2\2\u0252\u025f\5\"\22\2\u0253\u0255"+
		"\7.\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u025f\5\u009cO\2\u0257\u0259\5&\24\2\u0258\u0257\3\2\2\2\u0259\u025c"+
		"\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u025f\5D#\2\u025e\u0251\3\2\2\2\u025e\u0252\3\2\2"+
		"\2\u025e\u0254\3\2\2\2\u025e\u025a\3\2\2\2\u025fC\3\2\2\2\u0260\u026a"+
		"\5F$\2\u0261\u026a\5L\'\2\u0262\u026a\5R*\2\u0263\u026a\5P)\2\u0264\u026a"+
		"\5N(\2\u0265\u026a\5<\37\2\u0266\u026a\5\u008cG\2\u0267\u026a\5,\27\2"+
		"\u0268\u026a\5\64\33\2\u0269\u0260\3\2\2\2\u0269\u0261\3\2\2\2\u0269\u0262"+
		"\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0264\3\2\2\2\u0269\u0265\3\2\2\2\u0269"+
		"\u0266\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026aE\3\2\2\2"+
		"\u026b\u026c\5J&\2\u026c\u026d\7u\2\2\u026d\u0272\5p9\2\u026e\u026f\7"+
		"J\2\2\u026f\u0271\7K\2\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0277\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u0276\7\65\2\2\u0276\u0278\5n8\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5H%\2\u027aG\3\2\2\2\u027b"+
		"\u027e\5\u009cO\2\u027c\u027e\7L\2\2\u027d\u027b\3\2\2\2\u027d\u027c\3"+
		"\2\2\2\u027eI\3\2\2\2\u027f\u0282\5\u00e0q\2\u0280\u0282\79\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282K\3\2\2\2\u0283\u0284\5.\30\2"+
		"\u0284\u0285\5F$\2\u0285M\3\2\2\2\u0286\u0287\5.\30\2\u0287\u0288\5P)"+
		"\2\u0288O\3\2\2\2\u0289\u028a\7u\2\2\u028a\u028d\5p9\2\u028b\u028c\7\65"+
		"\2\2\u028c\u028e\5n8\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0290\5\u009cO\2\u0290Q\3\2\2\2\u0291\u0292\5\u00e0q\2"+
		"\u0292\u0293\5b\62\2\u0293\u0294\7L\2\2\u0294S\3\2\2\2\u0295\u0297\5&"+
		"\24\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029e\5V"+
		",\2\u029c\u029e\7L\2\2\u029d\u0298\3\2\2\2\u029d\u029c\3\2\2\2\u029eU"+
		"\3\2\2\2\u029f\u02a7\5X-\2\u02a0\u02a7\5\\/\2\u02a1\u02a7\5`\61\2\u02a2"+
		"\u02a7\5<\37\2\u02a3\u02a7\5\u008cG\2\u02a4\u02a7\5,\27\2\u02a5\u02a7"+
		"\5\64\33\2\u02a6\u029f\3\2\2\2\u02a6\u02a0\3\2\2\2\u02a6\u02a1\3\2\2\2"+
		"\u02a6\u02a2\3\2\2\2\u02a6\u02a3\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5"+
		"\3\2\2\2\u02a7W\3\2\2\2\u02a8\u02a9\5\u00e0q\2\u02a9\u02ae\5Z.\2\u02aa"+
		"\u02ab\7M\2\2\u02ab\u02ad\5Z.\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2"+
		"\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b1\u02b2\7L\2\2\u02b2Y\3\2\2\2\u02b3\u02b8\7u\2\2\u02b4\u02b5"+
		"\7J\2\2\u02b5\u02b7\7K\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8"+
		"\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2"+
		"\2\2\u02bb\u02bc\7O\2\2\u02bc\u02bd\5f\64\2\u02bd[\3\2\2\2\u02be\u02c0"+
		"\5^\60\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02ce\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02cf\5J"+
		"&\2\u02c5\u02c9\5.\30\2\u02c6\u02c8\5\u0082B\2\u02c7\u02c6\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2"+
		"\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\5J&\2\u02cd\u02cf\3\2\2\2\u02ce\u02c4"+
		"\3\2\2\2\u02ce\u02c5\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7u\2\2\u02d1"+
		"\u02d6\5p9\2\u02d2\u02d3\7J\2\2\u02d3\u02d5\7K\2\2\u02d4\u02d2\3\2\2\2"+
		"\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02db"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\7\65\2\2\u02da\u02dc\5n8\2\u02db"+
		"\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\5H"+
		"%\2\u02de]\3\2\2\2\u02df\u02e6\5\u0082B\2\u02e0\u02e6\7+\2\2\u02e1\u02e6"+
		"\7\t\2\2\u02e2\u02e6\7\24\2\2\u02e3\u02e6\7.\2\2\u02e4\u02e6\7/\2\2\u02e5"+
		"\u02df\3\2\2\2\u02e5\u02e0\3\2\2\2\u02e5\u02e1\3\2\2\2\u02e5\u02e2\3\2"+
		"\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6_\3\2\2\2\u02e7\u02e8"+
		"\5.\30\2\u02e8\u02e9\5\\/\2\u02e9a\3\2\2\2\u02ea\u02ef\5d\63\2\u02eb\u02ec"+
		"\7M\2\2\u02ec\u02ee\5d\63\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef"+
		"\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0c\3\2\2\2\u02f1\u02ef\3\2\2\2"+
		"\u02f2\u02f5\5\f\7\2\u02f3\u02f4\7O\2\2\u02f4\u02f6\5f\64\2\u02f5\u02f3"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6e\3\2\2\2\u02f7\u02fa\5h\65\2\u02f8"+
		"\u02fa\5\u00c0a\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fag\3\2\2"+
		"\2\u02fb\u0307\7H\2\2\u02fc\u0301\5f\64\2\u02fd\u02fe\7M\2\2\u02fe\u0300"+
		"\5f\64\2\u02ff\u02fd\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0306\7M"+
		"\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307"+
		"\u02fc\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\7I"+
		"\2\2\u030ai\3\2\2\2\u030b\u030d\7u\2\2\u030c\u030e\5\u00e2r\2\u030d\u030c"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0316\3\2\2\2\u030f\u0310\7N\2\2\u0310"+
		"\u0312\7u\2\2\u0311\u0313\5\u00e2r\2\u0312\u0311\3\2\2\2\u0312\u0313\3"+
		"\2\2\2\u0313\u0315\3\2\2\2\u0314\u030f\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317k\3\2\2\2\u0318\u0316\3\2\2\2"+
		"\u0319\u0320\5\u00e0q\2\u031a\u031d\7T\2\2\u031b\u031c\t\3\2\2\u031c\u031e"+
		"\5\u00e0q\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2"+
		"\2\u031f\u0319\3\2\2\2\u031f\u031a\3\2\2\2\u0320m\3\2\2\2\u0321\u0326"+
		"\5\30\r\2\u0322\u0323\7M\2\2\u0323\u0325\5\30\r\2\u0324\u0322\3\2\2\2"+
		"\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327o\3"+
		"\2\2\2\u0328\u0326\3\2\2\2\u0329\u032b\7F\2\2\u032a\u032c\5r:\2\u032b"+
		"\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\7G"+
		"\2\2\u032eq\3\2\2\2\u032f\u0334\5t;\2\u0330\u0331\7M\2\2\u0331\u0333\5"+
		"t;\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0339\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0338\7M"+
		"\2\2\u0338\u033a\5v<\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033d"+
		"\3\2\2\2\u033b\u033d\5v<\2\u033c\u032f\3\2\2\2\u033c\u033b\3\2\2\2\u033d"+
		"s\3\2\2\2\u033e\u0340\5*\26\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2"+
		"\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0341"+
		"\3\2\2\2\u0344\u0345\5\u00e0q\2\u0345\u0346\5\f\7\2\u0346u\3\2\2\2\u0347"+
		"\u0349\5*\26\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u034a\3\2\2\2\u034d"+
		"\u034e\5\u00e0q\2\u034e\u034f\7t\2\2\u034f\u0350\5\f\7\2\u0350w\3\2\2"+
		"\2\u0351\u0352\7C\2\2\u0352y\3\2\2\2\u0353\u0354\7D\2\2\u0354{\3\2\2\2"+
		"\u0355\u0358\5x=\2\u0356\u0358\5z>\2\u0357\u0355\3\2\2\2\u0357\u0356\3"+
		"\2\2\2\u0358}\3\2\2\2\u0359\u035a\t\4\2\2\u035a\177\3\2\2\2\u035b\u035c"+
		"\t\5\2\2\u035c\u0081\3\2\2\2\u035d\u035e\7s\2\2\u035e\u0365\5\30\r\2\u035f"+
		"\u0362\7F\2\2\u0360\u0363\5\u0084C\2\u0361\u0363\5\u0088E\2\u0362\u0360"+
		"\3\2\2\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0366\7G\2\2\u0365\u035f\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0083\3\2"+
		"\2\2\u0367\u036c\5\u0086D\2\u0368\u0369\7M\2\2\u0369\u036b\5\u0086D\2"+
		"\u036a\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u0085\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\7u\2\2\u0370"+
		"\u0371\7O\2\2\u0371\u0372\5\u0088E\2\u0372\u0087\3\2\2\2\u0373\u0377\5"+
		"\u00c0a\2\u0374\u0377\5\u0082B\2\u0375\u0377\5\u008aF\2\u0376\u0373\3"+
		"\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u0089\3\2\2\2\u0378"+
		"\u0381\7H\2\2\u0379\u037e\5\u0088E\2\u037a\u037b\7M\2\2\u037b\u037d\5"+
		"\u0088E\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2"+
		"\u037e\u037f\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0379"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0385\7M\2\2\u0384"+
		"\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\7I"+
		"\2\2\u0387\u008b\3\2\2\2\u0388\u0389\7s\2\2\u0389\u038a\7$\2\2\u038a\u038b"+
		"\7u\2\2\u038b\u038c\5\u008eH\2\u038c\u008d\3\2\2\2\u038d\u0391\7H\2\2"+
		"\u038e\u0390\5\u0090I\2\u038f\u038e\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394\u0395\7I\2\2\u0395\u008f\3\2\2\2\u0396\u0398\5&\24\2\u0397"+
		"\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2"+
		"\2\2\u039a\u039c\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039f\5\u0092J\2\u039d"+
		"\u039f\7L\2\2\u039e\u0399\3\2\2\2\u039e\u039d\3\2\2\2\u039f\u0091\3\2"+
		"\2\2\u03a0\u03a1\5\u00e0q\2\u03a1\u03a2\5\u0094K\2\u03a2\u03a3\7L\2\2"+
		"\u03a3\u03b5\3\2\2\2\u03a4\u03a6\5,\27\2\u03a5\u03a7\7L\2\2\u03a6\u03a5"+
		"\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03b5\3\2\2\2\u03a8\u03aa\5<\37\2\u03a9"+
		"\u03ab\7L\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b5\3\2"+
		"\2\2\u03ac\u03ae\5\64\33\2\u03ad\u03af\7L\2\2\u03ae\u03ad\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b5\3\2\2\2\u03b0\u03b2\5\u008cG\2\u03b1\u03b3"+
		"\7L\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03a0\3\2\2\2\u03b4\u03a4\3\2\2\2\u03b4\u03a8\3\2\2\2\u03b4\u03ac\3\2"+
		"\2\2\u03b4\u03b0\3\2\2\2\u03b5\u0093\3\2\2\2\u03b6\u03b9\5\u0096L\2\u03b7"+
		"\u03b9\5\u0098M\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9\u0095"+
		"\3\2\2\2\u03ba\u03bb\7u\2\2\u03bb\u03bc\7F\2\2\u03bc\u03be\7G\2\2\u03bd"+
		"\u03bf\5\u009aN\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u0097"+
		"\3\2\2\2\u03c0\u03c1\5b\62\2\u03c1\u0099\3\2\2\2\u03c2\u03c3\7\24\2\2"+
		"\u03c3\u03c4\5\u0088E\2\u03c4\u009b\3\2\2\2\u03c5\u03c9\7H\2\2\u03c6\u03c8"+
		"\5\u009eP\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2"+
		"\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03cd"+
		"\7I\2\2\u03cd\u009d\3\2\2\2\u03ce\u03cf\5\u00a0Q\2\u03cf\u03d0\7L\2\2"+
		"\u03d0\u03d4\3\2\2\2\u03d1\u03d4\5\u00a4S\2\u03d2\u03d4\5\u00a2R\2\u03d3"+
		"\u03ce\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4\u009f\3\2"+
		"\2\2\u03d5\u03d7\5*\26\2\u03d6\u03d5\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8"+
		"\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03d8\3\2"+
		"\2\2\u03db\u03dc\5\u00e0q\2\u03dc\u03dd\5b\62\2\u03dd\u00a1\3\2\2\2\u03de"+
		"\u03e0\5(\25\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2"+
		"\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e6\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e7\5,\27\2\u03e5\u03e7\5<\37\2\u03e6\u03e4\3\2\2\2\u03e6\u03e5\3\2"+
		"\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03ea\7L\2\2\u03e9\u03e1\3\2\2\2\u03e9"+
		"\u03e8\3\2\2\2\u03ea\u00a3\3\2\2\2\u03eb\u0454\5\u009cO\2\u03ec\u03ed"+
		"\7\n\2\2\u03ed\u03f0\5\u00c0a\2\u03ee\u03ef\7U\2\2\u03ef\u03f1\5\u00c0"+
		"a\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f3\7L\2\2\u03f3\u0454\3\2\2\2\u03f4\u03f5\7\36\2\2\u03f5\u03f6\5\u00bc"+
		"_\2\u03f6\u03f9\5\u00a4S\2\u03f7\u03f8\7\27\2\2\u03f8\u03fa\5\u00a4S\2"+
		"\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0454\3\2\2\2\u03fb\u03fc"+
		"\7\35\2\2\u03fc\u03fd\7F\2\2\u03fd\u03fe\5\u00b6\\\2\u03fe\u03ff\7G\2"+
		"\2\u03ff\u0400\5\u00a4S\2\u0400\u0454\3\2\2\2\u0401\u0402\7;\2\2\u0402"+
		"\u0403\5\u00bc_\2\u0403\u0404\5\u00a4S\2\u0404\u0454\3\2\2\2\u0405\u0406"+
		"\7\25\2\2\u0406\u0407\5\u00a4S\2\u0407\u0408\7;\2\2\u0408\u0409\5\u00bc"+
		"_\2\u0409\u040a\7L\2\2\u040a\u0454\3\2\2\2\u040b\u040c\7\67\2\2\u040c"+
		"\u0416\5\u009cO\2\u040d\u040f\5\u00a6T\2\u040e\u040d\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2\2\u0412"+
		"\u0414\5\u00aaV\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0417"+
		"\3\2\2\2\u0415\u0417\5\u00aaV\2\u0416\u040e\3\2\2\2\u0416\u0415\3\2\2"+
		"\2\u0417\u0454\3\2\2\2\u0418\u0419\7\67\2\2\u0419\u041a\5\u00acW\2\u041a"+
		"\u041e\5\u009cO\2\u041b\u041d\5\u00a6T\2\u041c\u041b\3\2\2\2\u041d\u0420"+
		"\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0422\3\2\2\2\u0420"+
		"\u041e\3\2\2\2\u0421\u0423\5\u00aaV\2\u0422\u0421\3\2\2\2\u0422\u0423"+
		"\3\2\2\2\u0423\u0454\3\2\2\2\u0424\u0425\7\61\2\2\u0425\u0426\5\u00bc"+
		"_\2\u0426\u042a\7H\2\2\u0427\u0429\5\u00b2Z\2\u0428\u0427\3\2\2\2\u0429"+
		"\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0430\3\2"+
		"\2\2\u042c\u042a\3\2\2\2\u042d\u042f\5\u00b4[\2\u042e\u042d\3\2\2\2\u042f"+
		"\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0433\u0434\7I\2\2\u0434\u0454\3\2\2\2\u0435"+
		"\u0436\7\62\2\2\u0436\u0437\5\u00bc_\2\u0437\u0438\5\u009cO\2\u0438\u0454"+
		"\3\2\2\2\u0439\u043b\7,\2\2\u043a\u043c\5\u00c0a\2\u043b\u043a\3\2\2\2"+
		"\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0454\7L\2\2\u043e\u043f"+
		"\7\64\2\2\u043f\u0440\5\u00c0a\2\u0440\u0441\7L\2\2\u0441\u0454\3\2\2"+
		"\2\u0442\u0444\7\f\2\2\u0443\u0445\7u\2\2\u0444\u0443\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0454\7L\2\2\u0447\u0449\7\23\2\2\u0448"+
		"\u044a\7u\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u0454\7L\2\2\u044c\u0454\7L\2\2\u044d\u044e\5\u00c0a\2\u044e"+
		"\u044f\7L\2\2\u044f\u0454\3\2\2\2\u0450\u0451\7u\2\2\u0451\u0452\7U\2"+
		"\2\u0452\u0454\5\u00a4S\2\u0453\u03eb\3\2\2\2\u0453\u03ec\3\2\2\2\u0453"+
		"\u03f4\3\2\2\2\u0453\u03fb\3\2\2\2\u0453\u0401\3\2\2\2\u0453\u0405\3\2"+
		"\2\2\u0453\u040b\3\2\2\2\u0453\u0418\3\2\2\2\u0453\u0424\3\2\2\2\u0453"+
		"\u0435\3\2\2\2\u0453\u0439\3\2\2\2\u0453\u043e\3\2\2\2\u0453\u0442\3\2"+
		"\2\2\u0453\u0447\3\2\2\2\u0453\u044c\3\2\2\2\u0453\u044d\3\2\2\2\u0453"+
		"\u0450\3\2\2\2\u0454\u00a5\3\2\2\2\u0455\u0456\7\17\2\2\u0456\u045a\7"+
		"F\2\2\u0457\u0459\5*\26\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u045a\3\2"+
		"\2\2\u045d\u045e\5\u00a8U\2\u045e\u045f\7u\2\2\u045f\u0460\7G\2\2\u0460"+
		"\u0461\5\u009cO\2\u0461\u00a7\3\2\2\2\u0462\u0467\5\30\r\2\u0463\u0464"+
		"\7c\2\2\u0464\u0466\5\30\r\2\u0465\u0463\3\2\2\2\u0466\u0469\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u00a9\3\2\2\2\u0469\u0467\3\2"+
		"\2\2\u046a\u046b\7\33\2\2\u046b\u046c\5\u009cO\2\u046c\u00ab\3\2\2\2\u046d"+
		"\u046e\7F\2\2\u046e\u0470\5\u00aeX\2\u046f\u0471\7L\2\2\u0470\u046f\3"+
		"\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\7G\2\2\u0473"+
		"\u00ad\3\2\2\2\u0474\u0479\5\u00b0Y\2\u0475\u0476\7L\2\2\u0476\u0478\5"+
		"\u00b0Y\2\u0477\u0475\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2"+
		"\u0479\u047a\3\2\2\2\u047a\u00af\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047e"+
		"\5*\26\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483\5j"+
		"\66\2\u0483\u0484\5\f\7\2\u0484\u0485\7O\2\2\u0485\u0486\5\u00c0a\2\u0486"+
		"\u00b1\3\2\2\2\u0487\u0489\5\u00b4[\2\u0488\u0487\3\2\2\2\u0489\u048a"+
		"\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\3\2\2\2\u048c"+
		"\u048e\5\u009eP\2\u048d\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u048d"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u00b3\3\2\2\2\u0491\u0494\7\16\2\2"+
		"\u0492\u0495\5\u00c0a\2\u0493\u0495\7u\2\2\u0494\u0492\3\2\2\2\u0494\u0493"+
		"\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u049a\7U\2\2\u0497\u0498\7\24\2\2\u0498"+
		"\u049a\7U\2\2\u0499\u0491\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u00b5\3\2"+
		"\2\2\u049b\u04a8\5\u00ba^\2\u049c\u049e\5\u00b8]\2\u049d\u049c\3\2\2\2"+
		"\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a1\7L\2\2\u04a0\u04a2"+
		"\5\u00c0a\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2"+
		"\2\u04a3\u04a5\7L\2\2\u04a4\u04a6\5\u00be`\2\u04a5\u04a4\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u049b\3\2\2\2\u04a7\u049d\3\2"+
		"\2\2\u04a8\u00b7\3\2\2\2\u04a9\u04ac\5\u00a0Q\2\u04aa\u04ac\5\u00be`\2"+
		"\u04ab\u04a9\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ac\u00b9\3\2\2\2\u04ad\u04af"+
		"\5*\26\2\u04ae\u04ad\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b4\5\u00e0"+
		"q\2\u04b4\u04b5\5\f\7\2\u04b5\u04b6\7U\2\2\u04b6\u04b7\5\u00c0a\2\u04b7"+
		"\u00bb\3\2\2\2\u04b8\u04b9\7F\2\2\u04b9\u04ba\5\u00c0a\2\u04ba\u04bb\7"+
		"G\2\2\u04bb\u00bd\3\2\2\2\u04bc\u04c1\5\u00c0a\2\u04bd\u04be\7M\2\2\u04be"+
		"\u04c0\5\u00c0a\2\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u00bf\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c5\ba\1\2\u04c5\u04e4\5\u00c8e\2\u04c6\u04e4\5\20\t\2\u04c7\u04c8"+
		"\7\'\2\2\u04c8\u04e4\5\u00ccg\2\u04c9\u04ca\7F\2\2\u04ca\u04cb\5\u00e0"+
		"q\2\u04cb\u04cc\7G\2\2\u04cc\u04cd\5\u00c0a\27\u04cd\u04e4\3\2\2\2\u04ce"+
		"\u04cf\t\6\2\2\u04cf\u04e4\5\u00c0a\25\u04d0\u04d1\t\7\2\2\u04d1\u04e4"+
		"\5\u00c0a\24\u04d2\u04e4\5\u00c2b\2\u04d3\u04d4\5\u00e0q\2\u04d4\u04da"+
		"\7r\2\2\u04d5\u04d7\5\u00e2r\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2"+
		"\u04d7\u04d8\3\2\2\2\u04d8\u04db\7u\2\2\u04d9\u04db\7\'\2\2\u04da\u04d6"+
		"\3\2\2\2\u04da\u04d9\3\2\2\2\u04db\u04e4\3\2\2\2\u04dc\u04dd\5\u00caf"+
		"\2\u04dd\u04df\7r\2\2\u04de\u04e0\5\u00e2r\2\u04df\u04de\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\7\'\2\2\u04e2\u04e4\3\2"+
		"\2\2\u04e3\u04c4\3\2\2\2\u04e3\u04c6\3\2\2\2\u04e3\u04c7\3\2\2\2\u04e3"+
		"\u04c9\3\2\2\2\u04e3\u04ce\3\2\2\2\u04e3\u04d0\3\2\2\2\u04e3\u04d2\3\2"+
		"\2\2\u04e3\u04d3\3\2\2\2\u04e3\u04dc\3\2\2\2\u04e4\u0535\3\2\2\2\u04e5"+
		"\u04e6\f\23\2\2\u04e6\u04e7\t\b\2\2\u04e7\u0534\5\u00c0a\24\u04e8\u04e9"+
		"\f\22\2\2\u04e9\u04ea\t\t\2\2\u04ea\u0534\5\u00c0a\23\u04eb\u04f3\f\21"+
		"\2\2\u04ec\u04ed\7Q\2\2\u04ed\u04f4\7Q\2\2\u04ee\u04ef\7P\2\2\u04ef\u04f0"+
		"\7P\2\2\u04f0\u04f4\7P\2\2\u04f1\u04f2\7P\2\2\u04f2\u04f4\7P\2\2\u04f3"+
		"\u04ec\3\2\2\2\u04f3\u04ee\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f5\3\2"+
		"\2\2\u04f5\u0534\5\u00c0a\22\u04f6\u04f7\f\20\2\2\u04f7\u04f8\t\n\2\2"+
		"\u04f8\u0534\5\u00c0a\21\u04f9\u04fa\f\16\2\2\u04fa\u04fb\t\13\2\2\u04fb"+
		"\u0534\5\u00c0a\17\u04fc\u04fd\f\r\2\2\u04fd\u04fe\7b\2\2\u04fe\u0534"+
		"\5\u00c0a\16\u04ff\u0500\f\f\2\2\u0500\u0501\7d\2\2\u0501\u0534\5\u00c0"+
		"a\r\u0502\u0503\f\13\2\2\u0503\u0504\7c\2\2\u0504\u0534\5\u00c0a\f\u0505"+
		"\u0506\f\n\2\2\u0506\u0507\7Z\2\2\u0507\u0534\5\u00c0a\13\u0508\u0509"+
		"\f\t\2\2\u0509\u050a\7[\2\2\u050a\u0534\5\u00c0a\n\u050b\u050c\f\b\2\2"+
		"\u050c\u050d\7T\2\2\u050d\u050e\5\u00c0a\2\u050e\u050f\7U\2\2\u050f\u0510"+
		"\5\u00c0a\t\u0510\u0534\3\2\2\2\u0511\u0512\f\7\2\2\u0512\u0513\t\f\2"+
		"\2\u0513\u0534\5\u00c0a\7\u0514\u0515\f\33\2\2\u0515\u0521\7N\2\2\u0516"+
		"\u0522\7u\2\2\u0517\u0522\5\20\t\2\u0518\u0522\7\63\2\2\u0519\u051b\7"+
		"\'\2\2\u051a\u051c\5\u00dco\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2"+
		"\u051c\u051d\3\2\2\2\u051d\u0522\5\u00d0i\2\u051e\u051f\7\60\2\2\u051f"+
		"\u0522\5\u00e4s\2\u0520\u0522\5\u00d6l\2\u0521\u0516\3\2\2\2\u0521\u0517"+
		"\3\2\2\2\u0521\u0518\3\2\2\2\u0521\u0519\3\2\2\2\u0521\u051e\3\2\2\2\u0521"+
		"\u0520\3\2\2\2\u0522\u0534\3\2\2\2\u0523\u0524\f\32\2\2\u0524\u0525\7"+
		"J\2\2\u0525\u0526\5\u00c0a\2\u0526\u0527\7K\2\2\u0527\u0534\3\2\2\2\u0528"+
		"\u0529\f\26\2\2\u0529\u0534\t\r\2\2\u052a\u052b\f\17\2\2\u052b\u052c\7"+
		"\"\2\2\u052c\u0534\5\u00e0q\2\u052d\u052e\f\5\2\2\u052e\u0530\7r\2\2\u052f"+
		"\u0531\5\u00e2r\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0534\7u\2\2\u0533\u04e5\3\2\2\2\u0533\u04e8\3\2\2\2\u0533"+
		"\u04eb\3\2\2\2\u0533\u04f6\3\2\2\2\u0533\u04f9\3\2\2\2\u0533\u04fc\3\2"+
		"\2\2\u0533\u04ff\3\2\2\2\u0533\u0502\3\2\2\2\u0533\u0505\3\2\2\2\u0533"+
		"\u0508\3\2\2\2\u0533\u050b\3\2\2\2\u0533\u0511\3\2\2\2\u0533\u0514\3\2"+
		"\2\2\u0533\u0523\3\2\2\2\u0533\u0528\3\2\2\2\u0533\u052a\3\2\2\2\u0533"+
		"\u052d\3\2\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2"+
		"\2\2\u0536\u00c1\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u0539\5\u00c4c\2\u0539"+
		"\u053a\7q\2\2\u053a\u053b\5\u00c6d\2\u053b\u00c3\3\2\2\2\u053c\u054d\7"+
		"u\2\2\u053d\u053f\7F\2\2\u053e\u0540\5r:\2\u053f\u053e\3\2\2\2\u053f\u0540"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u054d\7G\2\2\u0542\u0543\7F\2\2\u0543"+
		"\u0548\7u\2\2\u0544\u0545\7M\2\2\u0545\u0547\7u\2\2\u0546\u0544\3\2\2"+
		"\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054b"+
		"\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u054d\7G\2\2\u054c\u053c\3\2\2\2\u054c"+
		"\u053d\3\2\2\2\u054c\u0542\3\2\2\2\u054d\u00c5\3\2\2\2\u054e\u0551\5\u00c0"+
		"a\2\u054f\u0551\5\u009cO\2\u0550\u054e\3\2\2\2\u0550\u054f\3\2\2\2\u0551"+
		"\u00c7\3\2\2\2\u0552\u0553\7F\2\2\u0553\u0554\5\u00c0a\2\u0554\u0555\7"+
		"G\2\2\u0555\u0565\3\2\2\2\u0556\u0565\7\63\2\2\u0557\u0565\7\60\2\2\u0558"+
		"\u0565\5\32\16\2\u0559\u0565\7u\2\2\u055a\u055b\5J&\2\u055b\u055c\7N\2"+
		"\2\u055c\u055d\7\21\2\2\u055d\u0565\3\2\2\2\u055e\u0562\5\u00dco\2\u055f"+
		"\u0563\5\u00e6t\2\u0560\u0561\7\63\2\2\u0561\u0563\5\u00e8u\2\u0562\u055f"+
		"\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0552\3\2\2\2\u0564"+
		"\u0556\3\2\2\2\u0564\u0557\3\2\2\2\u0564\u0558\3\2\2\2\u0564\u0559\3\2"+
		"\2\2\u0564\u055a\3\2\2\2\u0564\u055e\3\2\2\2\u0565\u00c9\3\2\2\2\u0566"+
		"\u0567\5j\66\2\u0567\u0568\7N\2\2\u0568\u056a\3\2\2\2\u0569\u0566\3\2"+
		"\2\2\u0569\u056a\3\2\2\2\u056a\u056e\3\2\2\2\u056b\u056d\5\u0082B\2\u056c"+
		"\u056b\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2"+
		"\2\2\u056f\u0571\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0573\7u\2\2\u0572"+
		"\u0574\5\u00e2r\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u00cb"+
		"\3\2\2\2\u0575\u0576\5\u00dco\2\u0576\u0577\5\u00ceh\2\u0577\u0578\5\u00d4"+
		"k\2\u0578\u057f\3\2\2\2\u0579\u057c\5\u00ceh\2\u057a\u057d\5\u00d2j\2"+
		"\u057b\u057d\5\u00d4k\2\u057c\u057a\3\2\2\2\u057c\u057b\3\2\2\2\u057d"+
		"\u057f\3\2\2\2\u057e\u0575\3\2\2\2\u057e\u0579\3\2\2\2\u057f\u00cd\3\2"+
		"\2\2\u0580\u0582\7u\2\2\u0581\u0583\5\u00d8m\2\u0582\u0581\3\2\2\2\u0582"+
		"\u0583\3\2\2\2\u0583\u058b\3\2\2\2\u0584\u0585\7N\2\2\u0585\u0587\7u\2"+
		"\2\u0586\u0588\5\u00d8m\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u058a\3\2\2\2\u0589\u0584\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2"+
		"\2\2\u058b\u058c\3\2\2\2\u058c\u0590\3\2\2\2\u058d\u058b\3\2\2\2\u058e"+
		"\u0590\5\24\13\2\u058f\u0580\3\2\2\2\u058f\u058e\3\2\2\2\u0590\u00cf\3"+
		"\2\2\2\u0591\u0593\7u\2\2\u0592\u0594\5\u00dan\2\u0593\u0592\3\2\2\2\u0593"+
		"\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\5\u00d4k\2\u0596\u00d1"+
		"\3\2\2\2\u0597\u05b3\7J\2\2\u0598\u059d\7K\2\2\u0599\u059a\7J\2\2\u059a"+
		"\u059c\7K\2\2\u059b\u0599\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2"+
		"\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f\u059d\3\2\2\2\u05a0"+
		"\u05b4\5h\65\2\u05a1\u05a2\5\u00c0a\2\u05a2\u05a9\7K\2\2\u05a3\u05a4\7"+
		"J\2\2\u05a4\u05a5\5\u00c0a\2\u05a5\u05a6\7K\2\2\u05a6\u05a8\3\2\2\2\u05a7"+
		"\u05a3\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aa\u05b0\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad\7J\2\2\u05ad"+
		"\u05af\7K\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2"+
		"\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3"+
		"\u0598\3\2\2\2\u05b3\u05a1\3\2\2\2\u05b4\u00d3\3\2\2\2\u05b5\u05b7\5\u00e8"+
		"u\2\u05b6\u05b8\5> \2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u00d5"+
		"\3\2\2\2\u05b9\u05ba\5\u00dco\2\u05ba\u05bb\5\u00e6t\2\u05bb\u00d7\3\2"+
		"\2\2\u05bc\u05bd\7Q\2\2\u05bd\u05c0\7P\2\2\u05be\u05c0\5\u00e2r\2\u05bf"+
		"\u05bc\3\2\2\2\u05bf\u05be\3\2\2\2\u05c0\u00d9\3\2\2\2\u05c1\u05c2\7Q"+
		"\2\2\u05c2\u05c5\7P\2\2\u05c3\u05c5\5\u00dco\2\u05c4\u05c1\3\2\2\2\u05c4"+
		"\u05c3\3\2\2\2\u05c5\u00db\3\2\2\2\u05c6\u05c7\7Q\2\2\u05c7\u05c8\5\u00de"+
		"p\2\u05c8\u05c9\7P\2\2\u05c9\u00dd\3\2\2\2\u05ca\u05cf\5\u00e0q\2\u05cb"+
		"\u05cc\7M\2\2\u05cc\u05ce\5\u00e0q\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3"+
		"\2\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u00df\3\2\2\2\u05d1"+
		"\u05cf\3\2\2\2\u05d2\u05d4\5\u0082B\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4"+
		"\3\2\2\2\u05d4\u05d8\3\2\2\2\u05d5\u05d9\5j\66\2\u05d6\u05d9\5\24\13\2"+
		"\u05d7\u05d9\78\2\2\u05d8\u05d5\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d7"+
		"\3\2\2\2\u05d9\u05de\3\2\2\2\u05da\u05db\7J\2\2\u05db\u05dd\7K\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u00e1\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e2\7Q\2\2\u05e2"+
		"\u05e7\5l\67\2\u05e3\u05e4\7M\2\2\u05e4\u05e6\5l\67\2\u05e5\u05e3\3\2"+
		"\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05ea\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05eb\7P\2\2\u05eb\u00e3\3\2"+
		"\2\2\u05ec\u05f3\5\u00e8u\2\u05ed\u05ee\7N\2\2\u05ee\u05f0\7u\2\2\u05ef"+
		"\u05f1\5\u00e8u\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3"+
		"\3\2\2\2\u05f2\u05ec\3\2\2\2\u05f2\u05ed\3\2\2\2\u05f3\u00e5\3\2\2\2\u05f4"+
		"\u05f5\7\60\2\2\u05f5\u05f9\5\u00e4s\2\u05f6\u05f7\7u\2\2\u05f7\u05f9"+
		"\5\u00e8u\2\u05f8\u05f4\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u00e7\3\2\2"+
		"\2\u05fa\u05fc\7F\2\2\u05fb\u05fd\5\u00be`\2\u05fc\u05fb\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\7G\2\2\u05ff\u00e9\3\2"+
		"\2\2\u00c5\u00ee\u00f1\u00f6\u00fc\u0102\u0104\u010b\u010d\u0115\u0117"+
		"\u011f\u0121\u0127\u0129\u0131\u0133\u0136\u013e\u0141\u0148\u0151\u0157"+
		"\u015d\u0160\u0165\u0172\u0178\u017d\u0181\u018b\u0190\u0195\u019b\u01a3"+
		"\u01ac\u01b1\u01b8\u01bf\u01c2\u01c9\u01d3\u01d7\u01dc\u01e0\u01e4\u01ee"+
		"\u01f6\u01fc\u0203\u020a\u020e\u0211\u0214\u021d\u0223\u0228\u022b\u0231"+
		"\u0237\u023b\u0243\u024c\u0254\u025a\u025e\u0269\u0272\u0277\u027d\u0281"+
		"\u028d\u0298\u029d\u02a6\u02ae\u02b8\u02c1\u02c9\u02ce\u02d6\u02db\u02e5"+
		"\u02ef\u02f5\u02f9\u0301\u0305\u0307\u030d\u0312\u0316\u031d\u031f\u0326"+
		"\u032b\u0334\u0339\u033c\u0341\u034a\u0357\u0362\u0365\u036c\u0376\u037e"+
		"\u0381\u0384\u0391\u0399\u039e\u03a6\u03aa\u03ae\u03b2\u03b4\u03b8\u03be"+
		"\u03c9\u03d3\u03d8\u03e1\u03e6\u03e9\u03f0\u03f9\u0410\u0413\u0416\u041e"+
		"\u0422\u042a\u0430\u043b\u0444\u0449\u0453\u045a\u0467\u0470\u0479\u047f"+
		"\u048a\u048f\u0494\u0499\u049d\u04a1\u04a5\u04a7\u04ab\u04b0\u04c1\u04d6"+
		"\u04da\u04df\u04e3\u04f3\u051b\u0521\u0530\u0533\u0535\u053f\u0548\u054c"+
		"\u0550\u0562\u0564\u0569\u056e\u0573\u057c\u057e\u0582\u0587\u058b\u058f"+
		"\u0593\u059d\u05a9\u05b0\u05b3\u05b7\u05bf\u05c4\u05cf\u05d3\u05d8\u05de"+
		"\u05e7\u05f0\u05f2\u05f8\u05fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}