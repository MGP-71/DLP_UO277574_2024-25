// Generated from D:/DLP/DLP_UO277574_2024-25/src/parser/Pmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.program.*;
    import ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, WHITE_SPACE=40, ONE_LINE_COMMENT=41, MULTIPLE_LINE_COMMENT=42, 
		ID=43, INT_CONSTANT=44, REAL_CONSTANT=45, CHAR_CONSTANT=46;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_var_definition = 2, RULE_func_definition = 3, 
		RULE_main_function = 4, RULE_type = 5, RULE_build_in_type = 6, RULE_complex_type = 7, 
		RULE_function_type = 8, RULE_type_of_func = 9, RULE_fields = 10, RULE_statement = 11, 
		RULE_func_invocation = 12, RULE_block = 13, RULE_expression = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "var_definition", "func_definition", "main_function", 
			"type", "build_in_type", "complex_type", "function_type", "type_of_func", 
			"fields", "statement", "func_invocation", "block", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'def'", "'{'", "'}'", "'main'", "'int'", 
			"'double'", "'char'", "'['", "']'", "'struct'", "'('", "')'", "'->'", 
			"'None'", "'print'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'&&'", "'||'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WHITE_SPACE", "ONE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT", 
			"ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> dList = new ArrayList<Definition>();
		public DefinitionContext definition;
		public Main_functionContext main_function;
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).definition = definition();
					 _localctx.dList.addAll(((ProgramContext)_localctx).definition.ast); 
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).main_function = main_function();
			 _localctx.dList.add(((ProgramContext)_localctx).main_function.ast); 
			setState(40);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.dList); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public Var_definitionContext var_definition;
		public Func_definitionContext func_definition;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((DefinitionContext)_localctx).var_definition = var_definition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).var_definition.ast); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((DefinitionContext)_localctx).func_definition = func_definition();
				 _localctx.ast.add(((DefinitionContext)_localctx).func_definition.ast); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public List<Variable> vList = new ArrayList<Variable>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((Var_definitionContext)_localctx).id1 = match(ID);
			 _localctx.vList.add(new Variable(((Var_definitionContext)_localctx).id1.getLine(), ((Var_definitionContext)_localctx).id1.getCharPositionInLine() + 1, (((Var_definitionContext)_localctx).id1!=null?((Var_definitionContext)_localctx).id1.getText():null))); 
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				match(T__0);
				setState(54);
				((Var_definitionContext)_localctx).id2 = match(ID);
				 _localctx.vList.add(new Variable(((Var_definitionContext)_localctx).id2.getLine(), ((Var_definitionContext)_localctx).id2.getCharPositionInLine() + 1, (((Var_definitionContext)_localctx).id2!=null?((Var_definitionContext)_localctx).id2.getText():null))); 
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__1);
			setState(62);
			((Var_definitionContext)_localctx).type = type();
			setState(63);
			match(T__2);

			            for (Variable vb: _localctx.vList) {
			                { _localctx.ast.add(new VariableDefinition(vb.getLine(), vb.getColumn(), vb.getName(), ((Var_definitionContext)_localctx).type.ast)); }
			            }
			            for (int i = 0; i < _localctx.vList.size(); i++) {
			                for (int j = 0; j < _localctx.vList.size(); j++) {
			                    if (_localctx.vList.get(i).getName().equals(_localctx.vList.get(j).getName()) && i!=j) {
			                        new ErrorType(_localctx.vList.get(i), "Variable repetition '" + _localctx.vList.get(i).getName() + "'");
			                    }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<Statement> stList = new ArrayList<>();
		public Token d;
		public Token id1;
		public Function_typeContext function_type;
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((Func_definitionContext)_localctx).d = match(T__3);
			setState(67);
			((Func_definitionContext)_localctx).id1 = match(ID);
			setState(68);
			((Func_definitionContext)_localctx).function_type = function_type();
			setState(69);
			match(T__4);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					((Func_definitionContext)_localctx).var_definition = var_definition();
					 _localctx.stList.addAll(((Func_definitionContext)_localctx).var_definition.ast); 
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941624725504L) != 0)) {
				{
				{
				setState(78);
				((Func_definitionContext)_localctx).statement = statement();
				 _localctx.stList.addAll(((Func_definitionContext)_localctx).statement.ast); 
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__5);
			 ((Func_definitionContext)_localctx).ast =  new FunctionDefinition(((Func_definitionContext)_localctx).d.getLine(), ((Func_definitionContext)_localctx).d.getCharPositionInLine() + 1, (((Func_definitionContext)_localctx).id1!=null?((Func_definitionContext)_localctx).id1.getText():null), ((Func_definitionContext)_localctx).function_type.ast,
			        _localctx.stList); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_functionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<Statement> stList = new ArrayList<>();
		public Token d;
		public Token m;
		public Function_typeContext function_type;
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((Main_functionContext)_localctx).d = match(T__3);
			setState(90);
			((Main_functionContext)_localctx).m = match(T__6);
			setState(91);
			((Main_functionContext)_localctx).function_type = function_type();
			setState(92);
			match(T__4);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					((Main_functionContext)_localctx).var_definition = var_definition();
					 _localctx.stList.addAll(((Main_functionContext)_localctx).var_definition.ast); 
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941624725504L) != 0)) {
				{
				{
				setState(101);
				((Main_functionContext)_localctx).statement = statement();
				 _localctx.stList.addAll(((Main_functionContext)_localctx).statement.ast); 
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__5);
			 ((Main_functionContext)_localctx).ast =  new FunctionDefinition(((Main_functionContext)_localctx).d.getLine(), ((Main_functionContext)_localctx).d.getCharPositionInLine() + 1, (((Main_functionContext)_localctx).m!=null?((Main_functionContext)_localctx).m.getText():null), ((Main_functionContext)_localctx).function_type.ast,
			                _localctx.stList); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Build_in_typeContext build_in_type;
		public Complex_typeContext complex_type;
		public Build_in_typeContext build_in_type() {
			return getRuleContext(Build_in_typeContext.class,0);
		}
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((TypeContext)_localctx).build_in_type = build_in_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).build_in_type.ast; 
				}
				break;
			case T__10:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((TypeContext)_localctx).complex_type = complex_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).complex_type.ast; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Build_in_typeContext extends ParserRuleContext {
		public Type ast;
		public Build_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_in_type; }
	}

	public final Build_in_typeContext build_in_type() throws RecognitionException {
		Build_in_typeContext _localctx = new Build_in_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_build_in_type);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__7);
				 ((Build_in_typeContext)_localctx).ast =  new IntegerType(); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__8);
				 ((Build_in_typeContext)_localctx).ast =  new DoubleType(); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__9);
				 ((Build_in_typeContext)_localctx).ast =  new CharacterType(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Complex_typeContext extends ParserRuleContext {
		public Type ast;
		public Token INT_CONSTANT;
		public TypeContext type;
		public FieldsContext fields;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_complex_type);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__10);
				setState(129);
				((Complex_typeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(130);
				match(T__11);
				setState(131);
				((Complex_typeContext)_localctx).type = type();
				 ((Complex_typeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((Complex_typeContext)_localctx).INT_CONSTANT!=null?((Complex_typeContext)_localctx).INT_CONSTANT.getText():null)), ((Complex_typeContext)_localctx).type.ast); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__12);
				setState(135);
				match(T__4);
				setState(136);
				((Complex_typeContext)_localctx).fields = fields();
				setState(137);
				match(T__5);
				 ((Complex_typeContext)_localctx).ast =  new StructType(((Complex_typeContext)_localctx).fields.ast); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public FunctionType ast;
		public List<VariableDefinition> vdList = new ArrayList<>();
		public Token d;
		public Token id1;
		public TypeContext t1;
		public Token id2;
		public TypeContext t2;
		public Type_of_funcContext type_of_func;
		public Type_of_funcContext type_of_func() {
			return getRuleContext(Type_of_funcContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((Function_typeContext)_localctx).d = match(T__13);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(143);
				((Function_typeContext)_localctx).id1 = match(ID);
				setState(144);
				match(T__1);
				setState(145);
				((Function_typeContext)_localctx).t1 = type();
				 _localctx.vdList.add(new VariableDefinition(((Function_typeContext)_localctx).d.getLine(),
				            ((Function_typeContext)_localctx).d.getCharPositionInLine() + 1, (((Function_typeContext)_localctx).id1!=null?((Function_typeContext)_localctx).id1.getText():null), ((Function_typeContext)_localctx).t1.ast)); 
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(147);
					match(T__0);
					setState(148);
					((Function_typeContext)_localctx).id2 = match(ID);
					setState(149);
					match(T__1);
					setState(150);
					((Function_typeContext)_localctx).t2 = type();
					 _localctx.vdList.add(new VariableDefinition(((Function_typeContext)_localctx).d.getLine(), ((Function_typeContext)_localctx).d.getCharPositionInLine() + 1,
					            (((Function_typeContext)_localctx).id2!=null?((Function_typeContext)_localctx).id2.getText():null), ((Function_typeContext)_localctx).t2.ast)); 
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160);
			match(T__14);
			setState(161);
			match(T__15);
			setState(162);
			((Function_typeContext)_localctx).type_of_func = type_of_func();
			setState(163);
			match(T__1);
			 ((Function_typeContext)_localctx).ast =  new FunctionType(((Function_typeContext)_localctx).type_of_func.ast, _localctx.vdList); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_of_funcContext extends ParserRuleContext {
		public Type ast;
		public Build_in_typeContext build_in_type;
		public Build_in_typeContext build_in_type() {
			return getRuleContext(Build_in_typeContext.class,0);
		}
		public Type_of_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_of_func; }
	}

	public final Type_of_funcContext type_of_func() throws RecognitionException {
		Type_of_funcContext _localctx = new Type_of_funcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_of_func);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__16);
				 ((Type_of_funcContext)_localctx).ast =  new VoidType(); 
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				((Type_of_funcContext)_localctx).build_in_type = build_in_type();
				 ((Type_of_funcContext)_localctx).ast =  ((Type_of_funcContext)_localctx).build_in_type.ast; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldsContext extends ParserRuleContext {
		public List<Field> ast = new ArrayList<>();
		public List<Variable> vList = new ArrayList<Variable>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(173);
				((FieldsContext)_localctx).id1 = match(ID);
				 _localctx.vList.add(new Variable(((FieldsContext)_localctx).id1.getLine(), ((FieldsContext)_localctx).id1.getCharPositionInLine() + 1, (((FieldsContext)_localctx).id1!=null?((FieldsContext)_localctx).id1.getText():null))); 
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(175);
					match(T__0);
					setState(176);
					((FieldsContext)_localctx).id2 = match(ID);
					 _localctx.vList.add(new Variable(((FieldsContext)_localctx).id2.getLine(), ((FieldsContext)_localctx).id2.getCharPositionInLine() + 1, (((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null))); 
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__1);
				setState(184);
				((FieldsContext)_localctx).type = type();
				setState(185);
				match(T__2);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            for (Variable vb: _localctx.vList) {
			                { _localctx.ast.add(new Field(vb.getLine(), vb.getColumn(), vb.getName(), ((FieldsContext)_localctx).type.ast)); }
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public List<Statement> elseBody = new ArrayList<>();
		public Token p;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token i;
		public ExpressionContext expression;
		public BlockContext b1;
		public BlockContext b2;
		public Token w;
		public BlockContext block;
		public Token r;
		public Func_invocationContext func_invocation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Func_invocationContext func_invocation() {
			return getRuleContext(Func_invocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((StatementContext)_localctx).p = match(T__17);
				setState(195);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new Write(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast)); 
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(197);
					match(T__0);
					setState(198);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new Write(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).e2.ast)); 
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((StatementContext)_localctx).i = match(T__18);
				setState(209);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new Read(((StatementContext)_localctx).i.getLine(), ((StatementContext)_localctx).i.getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast)); 
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(211);
					match(T__0);
					setState(212);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new Read(((StatementContext)_localctx).i.getLine(), ((StatementContext)_localctx).i.getCharPositionInLine() + 1, ((StatementContext)_localctx).e2.ast)); 
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				((StatementContext)_localctx).e1 = expression(0);
				setState(223);
				match(T__19);
				setState(224);
				((StatementContext)_localctx).e2 = expression(0);
				setState(225);
				match(T__2);
				 _localctx.ast.add(new Assigment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				((StatementContext)_localctx).i = match(T__20);
				setState(229);
				((StatementContext)_localctx).expression = expression(0);
				setState(230);
				match(T__1);
				setState(231);
				((StatementContext)_localctx).b1 = block();
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(232);
					match(T__21);
					setState(233);
					match(T__1);
					setState(234);
					((StatementContext)_localctx).b2 = block();
					 _localctx.elseBody.addAll(((StatementContext)_localctx).b2.ast); 
					}
					break;
				}
				 _localctx.ast.add(new IfElse(((StatementContext)_localctx).i.getLine(), ((StatementContext)_localctx).i.getCharPositionInLine() + 1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast, _localctx.elseBody)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				((StatementContext)_localctx).w = match(T__22);
				setState(242);
				((StatementContext)_localctx).expression = expression(0);
				setState(243);
				match(T__1);
				setState(244);
				((StatementContext)_localctx).block = block();
				 _localctx.ast.add(new While(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine() + 1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).block.ast)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				((StatementContext)_localctx).r = match(T__23);
				setState(248);
				((StatementContext)_localctx).expression = expression(0);
				setState(249);
				match(T__2);
				 _localctx.ast.add(new Return(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine() + 1, ((StatementContext)_localctx).expression.ast)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				((StatementContext)_localctx).func_invocation = func_invocation();
				setState(253);
				match(T__2);
				 _localctx.ast.add(((StatementContext)_localctx).func_invocation.ast); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_invocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public List<Expression> params = new ArrayList<>();
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Func_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invocation; }
	}

	public final Func_invocationContext func_invocation() throws RecognitionException {
		Func_invocationContext _localctx = new Func_invocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((Func_invocationContext)_localctx).ID = match(ID);
			setState(259);
			match(T__13);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941596676096L) != 0)) {
				{
				setState(260);
				((Func_invocationContext)_localctx).expression = expression(0);
				 _localctx.params.add(((Func_invocationContext)_localctx).expression.ast); 
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(262);
					match(T__0);
					setState(263);
					((Func_invocationContext)_localctx).expression = expression(0);
					 _localctx.params.add(((Func_invocationContext)_localctx).expression.ast); 
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273);
			match(T__14);
			 ((Func_invocationContext)_localctx).ast =  new FunctionInvocation(((Func_invocationContext)_localctx).ID.getLine(), ((Func_invocationContext)_localctx).ID.getCharPositionInLine() + 1,
			        new Variable(((Func_invocationContext)_localctx).ID.getLine(), ((Func_invocationContext)_localctx).ID.getCharPositionInLine() + 1, (((Func_invocationContext)_localctx).ID!=null?((Func_invocationContext)_localctx).ID.getText():null)), _localctx.params); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((BlockContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__4);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941624725504L) != 0)) {
					{
					{
					setState(280);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext e;
		public Token op;
		public TypeContext t;
		public Func_invocationContext func_invocation;
		public Token ID;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_invocationContext func_invocation() {
			return getRuleContext(Func_invocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(292);
				match(T__13);
				setState(293);
				((ExpressionContext)_localctx).e = expression(0);
				setState(294);
				match(T__14);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e.ast; 
				}
				break;
			case 2:
				{
				setState(297);
				((ExpressionContext)_localctx).op = match(T__13);
				setState(298);
				((ExpressionContext)_localctx).t = type();
				setState(299);
				match(T__14);
				setState(300);
				((ExpressionContext)_localctx).e1 = expression(12);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).t.ast); 
				}
				break;
			case 3:
				{
				setState(303);
				((ExpressionContext)_localctx).op = match(T__25);
				setState(304);
				((ExpressionContext)_localctx).e1 = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 4:
				{
				setState(307);
				((ExpressionContext)_localctx).op = match(T__26);
				setState(308);
				((ExpressionContext)_localctx).e1 = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 5:
				{
				setState(311);
				((ExpressionContext)_localctx).func_invocation = func_invocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).func_invocation.ast; 
				}
				break;
			case 6:
				{
				setState(314);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 7:
				{
				setState(316);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntegerLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1,
				        LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(318);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1,
				        LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(320);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharacterLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1,
				        LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(354);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(325);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						((ExpressionContext)_localctx).e2 = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(330);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						((ExpressionContext)_localctx).e2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(335);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						((ExpressionContext)_localctx).e2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(340);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__38) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						((ExpressionContext)_localctx).e2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(345);
						match(T__10);
						setState(346);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(347);
						match(T__11);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e2.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(351);
						match(T__24);
						setState(352);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0168\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"9\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003"+
		"M\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003R\b\u0003\n\u0003"+
		"\f\u0003U\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004i\b\u0004\n\u0004\f\u0004l\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005w\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007f\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u008d\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009a\b\b\n\b\f\b\u009d\t\b"+
		"\u0003\b\u009f\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ac\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00b3\b\n\n\n\f\n\u00b6\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00bc\b\n\n\n\f\n\u00bf\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00ca\b\u000b\n\u000b\f\u000b\u00cd\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00d8\b\u000b\n\u000b\f\u000b\u00db"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00ee\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0101\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u010b\b\f\n\f\f\f\u010e\t\f\u0003\f"+
		"\u0110\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u011c\b\r\n\r\f\r\u011f\t\r\u0001\r\u0003\r"+
		"\u0122\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0143\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0163\b\u000e"+
		"\n\u000e\f\u000e\u0166\t\u000e\u0001\u000e\u0000\u0001\u001c\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0004\u0001\u0000\u001c\u001e\u0001\u0000\u001f$\u0001\u0000%&"+
		"\u0002\u0000\u001a\u001a\'\'\u0183\u0000#\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006B\u0001"+
		"\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000"+
		"\f~\u0001\u0000\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010"+
		"\u008e\u0001\u0000\u0000\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014"+
		"\u00bd\u0001\u0000\u0000\u0000\u0016\u0100\u0001\u0000\u0000\u0000\u0018"+
		"\u0102\u0001\u0000\u0000\u0000\u001a\u0121\u0001\u0000\u0000\u0000\u001c"+
		"\u0142\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f"+
		" \u0006\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001"+
		"\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&\'\u0003\b\u0004\u0000\'(\u0006\u0000\uffff\uffff\u0000()\u0005"+
		"\u0000\u0000\u0001)*\u0006\u0000\uffff\uffff\u0000*\u0001\u0001\u0000"+
		"\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0006\u0001\uffff\uffff\u0000"+
		"-2\u0001\u0000\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0006\u0001\uffff"+
		"\uffff\u000002\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001"+
		"\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005+\u0000\u0000"+
		"4:\u0006\u0002\uffff\uffff\u000056\u0005\u0001\u0000\u000067\u0005+\u0000"+
		"\u000079\u0006\u0002\uffff\uffff\u000085\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0002\u0000"+
		"\u0000>?\u0003\n\u0005\u0000?@\u0005\u0003\u0000\u0000@A\u0006\u0002\uffff"+
		"\uffff\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u0004\u0000\u0000"+
		"CD\u0005+\u0000\u0000DE\u0003\u0010\b\u0000EK\u0005\u0005\u0000\u0000"+
		"FG\u0003\u0004\u0002\u0000GH\u0006\u0003\uffff\uffff\u0000HJ\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LS\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0003\u0016\u000b\u0000OP\u0006\u0003\uffff"+
		"\uffff\u0000PR\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\u0006\u0000"+
		"\u0000WX\u0006\u0003\uffff\uffff\u0000X\u0007\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0004\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0003\u0010\b"+
		"\u0000\\b\u0005\u0005\u0000\u0000]^\u0003\u0004\u0002\u0000^_\u0006\u0004"+
		"\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cj\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0003\u0016"+
		"\u000b\u0000fg\u0006\u0004\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000"+
		"he\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0006\u0000\u0000no\u0006\u0004\uffff\uffff\u0000"+
		"o\t\u0001\u0000\u0000\u0000pq\u0003\f\u0006\u0000qr\u0006\u0005\uffff"+
		"\uffff\u0000rw\u0001\u0000\u0000\u0000st\u0003\u000e\u0007\u0000tu\u0006"+
		"\u0005\uffff\uffff\u0000uw\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000"+
		"\u0000vs\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000xy\u0005"+
		"\b\u0000\u0000y\u007f\u0006\u0006\uffff\uffff\u0000z{\u0005\t\u0000\u0000"+
		"{\u007f\u0006\u0006\uffff\uffff\u0000|}\u0005\n\u0000\u0000}\u007f\u0006"+
		"\u0006\uffff\uffff\u0000~x\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u000b\u0000\u0000\u0081\u0082\u0005,\u0000\u0000\u0082\u0083"+
		"\u0005\f\u0000\u0000\u0083\u0084\u0003\n\u0005\u0000\u0084\u0085\u0006"+
		"\u0007\uffff\uffff\u0000\u0085\u008d\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005\r\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089\u0003"+
		"\u0014\n\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u008b\u0006\u0007"+
		"\uffff\uffff\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0080\u0001"+
		"\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008d\u000f\u0001"+
		"\u0000\u0000\u0000\u008e\u009e\u0005\u000e\u0000\u0000\u008f\u0090\u0005"+
		"+\u0000\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091\u0092\u0003\n"+
		"\u0005\u0000\u0092\u009b\u0006\b\uffff\uffff\u0000\u0093\u0094\u0005\u0001"+
		"\u0000\u0000\u0094\u0095\u0005+\u0000\u0000\u0095\u0096\u0005\u0002\u0000"+
		"\u0000\u0096\u0097\u0003\n\u0005\u0000\u0097\u0098\u0006\b\uffff\uffff"+
		"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u008f\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u000f\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0012\t\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000"+
		"\u00a4\u00a5\u0006\b\uffff\uffff\u0000\u00a5\u0011\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u00ac\u0006\t\uffff\uffff\u0000"+
		"\u00a8\u00a9\u0003\f\u0006\u0000\u00a9\u00aa\u0006\t\uffff\uffff\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005+\u0000\u0000\u00ae\u00b4\u0006\n\uffff\uffff\u0000"+
		"\u00af\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b1\u0005+\u0000\u0000\u00b1"+
		"\u00b3\u0006\n\uffff\uffff\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8"+
		"\u00b9\u0003\n\u0005\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bb\u00ad\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0006\n\uffff\uffff\u0000\u00c1\u0015"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0012\u0000\u0000\u00c3\u00c4"+
		"\u0003\u001c\u000e\u0000\u00c4\u00cb\u0006\u000b\uffff\uffff\u0000\u00c5"+
		"\u00c6\u0005\u0001\u0000\u0000\u00c6\u00c7\u0003\u001c\u000e\u0000\u00c7"+
		"\u00c8\u0006\u000b\uffff\uffff\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c5\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u0101\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d2\u0003\u001c\u000e\u0000"+
		"\u00d2\u00d9\u0006\u000b\uffff\uffff\u0000\u00d3\u00d4\u0005\u0001\u0000"+
		"\u0000\u00d4\u00d5\u0003\u001c\u000e\u0000\u00d5\u00d6\u0006\u000b\uffff"+
		"\uffff\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0003"+
		"\u0000\u0000\u00dd\u0101\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u001c"+
		"\u000e\u0000\u00df\u00e0\u0005\u0014\u0000\u0000\u00e0\u00e1\u0003\u001c"+
		"\u000e\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0006\u000b"+
		"\uffff\uffff\u0000\u00e3\u0101\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0015\u0000\u0000\u00e5\u00e6\u0003\u001c\u000e\u0000\u00e6\u00e7\u0005"+
		"\u0002\u0000\u0000\u00e7\u00ed\u0003\u001a\r\u0000\u00e8\u00e9\u0005\u0016"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0002\u0000\u0000\u00ea\u00eb\u0003\u001a"+
		"\r\u0000\u00eb\u00ec\u0006\u000b\uffff\uffff\u0000\u00ec\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0006\u000b"+
		"\uffff\uffff\u0000\u00f0\u0101\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0017\u0000\u0000\u00f2\u00f3\u0003\u001c\u000e\u0000\u00f3\u00f4\u0005"+
		"\u0002\u0000\u0000\u00f4\u00f5\u0003\u001a\r\u0000\u00f5\u00f6\u0006\u000b"+
		"\uffff\uffff\u0000\u00f6\u0101\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0018\u0000\u0000\u00f8\u00f9\u0003\u001c\u000e\u0000\u00f9\u00fa\u0005"+
		"\u0003\u0000\u0000\u00fa\u00fb\u0006\u000b\uffff\uffff\u0000\u00fb\u0101"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003\u0018\f\u0000\u00fd\u00fe\u0005"+
		"\u0003\u0000\u0000\u00fe\u00ff\u0006\u000b\uffff\uffff\u0000\u00ff\u0101"+
		"\u0001\u0000\u0000\u0000\u0100\u00c2\u0001\u0000\u0000\u0000\u0100\u00d0"+
		"\u0001\u0000\u0000\u0000\u0100\u00de\u0001\u0000\u0000\u0000\u0100\u00e4"+
		"\u0001\u0000\u0000\u0000\u0100\u00f1\u0001\u0000\u0000\u0000\u0100\u00f7"+
		"\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0101\u0017"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005+\u0000\u0000\u0103\u010f\u0005"+
		"\u000e\u0000\u0000\u0104\u0105\u0003\u001c\u000e\u0000\u0105\u010c\u0006"+
		"\f\uffff\uffff\u0000\u0106\u0107\u0005\u0001\u0000\u0000\u0107\u0108\u0003"+
		"\u001c\u000e\u0000\u0108\u0109\u0006\f\uffff\uffff\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010b\u010e\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0104\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\u000f\u0000\u0000\u0112\u0113\u0006\f\uffff\uffff\u0000\u0113\u0019\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0003\u0016\u000b\u0000\u0115\u0116\u0006"+
		"\r\uffff\uffff\u0000\u0116\u0122\u0001\u0000\u0000\u0000\u0117\u011d\u0005"+
		"\u0005\u0000\u0000\u0118\u0119\u0003\u0016\u000b\u0000\u0119\u011a\u0006"+
		"\r\uffff\uffff\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0118\u0001"+
		"\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0122\u0005"+
		"\u0006\u0000\u0000\u0121\u0114\u0001\u0000\u0000\u0000\u0121\u0117\u0001"+
		"\u0000\u0000\u0000\u0122\u001b\u0001\u0000\u0000\u0000\u0123\u0124\u0006"+
		"\u000e\uffff\uffff\u0000\u0124\u0125\u0005\u000e\u0000\u0000\u0125\u0126"+
		"\u0003\u001c\u000e\u0000\u0126\u0127\u0005\u000f\u0000\u0000\u0127\u0128"+
		"\u0006\u000e\uffff\uffff\u0000\u0128\u0143\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\u000e\u0000\u0000\u012a\u012b\u0003\n\u0005\u0000\u012b\u012c"+
		"\u0005\u000f\u0000\u0000\u012c\u012d\u0003\u001c\u000e\f\u012d\u012e\u0006"+
		"\u000e\uffff\uffff\u0000\u012e\u0143\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005\u001a\u0000\u0000\u0130\u0131\u0003\u001c\u000e\u000b\u0131\u0132"+
		"\u0006\u000e\uffff\uffff\u0000\u0132\u0143\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005\u001b\u0000\u0000\u0134\u0135\u0003\u001c\u000e\n\u0135\u0136"+
		"\u0006\u000e\uffff\uffff\u0000\u0136\u0143\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0003\u0018\f\u0000\u0138\u0139\u0006\u000e\uffff\uffff\u0000\u0139"+
		"\u0143\u0001\u0000\u0000\u0000\u013a\u013b\u0005+\u0000\u0000\u013b\u0143"+
		"\u0006\u000e\uffff\uffff\u0000\u013c\u013d\u0005,\u0000\u0000\u013d\u0143"+
		"\u0006\u000e\uffff\uffff\u0000\u013e\u013f\u0005-\u0000\u0000\u013f\u0143"+
		"\u0006\u000e\uffff\uffff\u0000\u0140\u0141\u0005.\u0000\u0000\u0141\u0143"+
		"\u0006\u000e\uffff\uffff\u0000\u0142\u0123\u0001\u0000\u0000\u0000\u0142"+
		"\u0129\u0001\u0000\u0000\u0000\u0142\u012f\u0001\u0000\u0000\u0000\u0142"+
		"\u0133\u0001\u0000\u0000\u0000\u0142\u0137\u0001\u0000\u0000\u0000\u0142"+
		"\u013a\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000\u0142"+
		"\u013e\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0164\u0001\u0000\u0000\u0000\u0144\u0145\n\t\u0000\u0000\u0145\u0146"+
		"\u0007\u0000\u0000\u0000\u0146\u0147\u0003\u001c\u000e\n\u0147\u0148\u0006"+
		"\u000e\uffff\uffff\u0000\u0148\u0163\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\n\b\u0000\u0000\u014a\u014b\u0007\u0001\u0000\u0000\u014b\u014c\u0003"+
		"\u001c\u000e\t\u014c\u014d\u0006\u000e\uffff\uffff\u0000\u014d\u0163\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\n\u0007\u0000\u0000\u014f\u0150\u0007\u0002"+
		"\u0000\u0000\u0150\u0151\u0003\u001c\u000e\b\u0151\u0152\u0006\u000e\uffff"+
		"\uffff\u0000\u0152\u0163\u0001\u0000\u0000\u0000\u0153\u0154\n\u0006\u0000"+
		"\u0000\u0154\u0155\u0007\u0003\u0000\u0000\u0155\u0156\u0003\u001c\u000e"+
		"\u0007\u0156\u0157\u0006\u000e\uffff\uffff\u0000\u0157\u0163\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\n\u000e\u0000\u0000\u0159\u015a\u0005\u000b\u0000"+
		"\u0000\u015a\u015b\u0003\u001c\u000e\u0000\u015b\u015c\u0005\f\u0000\u0000"+
		"\u015c\u015d\u0006\u000e\uffff\uffff\u0000\u015d\u0163\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\n\r\u0000\u0000\u015f\u0160\u0005\u0019\u0000\u0000"+
		"\u0160\u0161\u0005+\u0000\u0000\u0161\u0163\u0006\u000e\uffff\uffff\u0000"+
		"\u0162\u0144\u0001\u0000\u0000\u0000\u0162\u0149\u0001\u0000\u0000\u0000"+
		"\u0162\u014e\u0001\u0000\u0000\u0000\u0162\u0153\u0001\u0000\u0000\u0000"+
		"\u0162\u0158\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000\u0000\u0000"+
		"\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u001d\u0001\u0000\u0000\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u001a#1:KSbjv~\u008c\u009b\u009e"+
		"\u00ab\u00b4\u00bd\u00cb\u00d9\u00ed\u0100\u010c\u010f\u011d\u0121\u0142"+
		"\u0162\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}