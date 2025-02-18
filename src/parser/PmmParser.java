// Generated from D:/DLP/DLP_UO277574_2024-25/src/parser/Pmm.g4 by ANTLR 4.13.2
package parser;
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
		RULE_main_function = 4, RULE_args = 5, RULE_type = 6, RULE_build_in_type = 7, 
		RULE_complex_type = 8, RULE_fields = 9, RULE_statement = 10, RULE_func_invocation = 11, 
		RULE_block = 12, RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "var_definition", "func_definition", "main_function", 
			"args", "type", "build_in_type", "complex_type", "fields", "statement", 
			"func_invocation", "block", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'def'", "'('", "')'", "'->'", "'None'", "'{'", 
			"'}'", "'main'", "'int'", "'double'", "'char'", "'['", "']'", "'struct'", 
			"'print'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", 
			"'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'.'"
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
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					definition();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			main_function();
			setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				var_definition();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				func_definition();
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
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(41);
			match(ID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(42);
				match(T__0);
				setState(43);
				match(ID);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__1);
			setState(50);
			type();
			setState(51);
			match(T__2);
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
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Build_in_typeContext build_in_type() {
			return getRuleContext(Build_in_typeContext.class,0);
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
			setState(53);
			match(T__3);
			setState(54);
			match(ID);
			setState(55);
			match(T__4);
			setState(56);
			args();
			setState(57);
			match(T__5);
			setState(58);
			match(T__6);
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
				{
				setState(59);
				build_in_type();
				}
				break;
			case T__7:
				{
				setState(60);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			match(T__1);
			setState(64);
			match(T__8);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					var_definition();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132233481158688L) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__9);
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
			setState(79);
			match(T__3);
			setState(80);
			match(T__10);
			setState(81);
			match(T__4);
			setState(82);
			match(T__5);
			setState(83);
			match(T__6);
			setState(84);
			match(T__7);
			setState(85);
			match(T__1);
			setState(86);
			match(T__8);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					var_definition();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132233481158688L) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__9);
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
	public static class ArgsContext extends ParserRuleContext {
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
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(101);
				match(ID);
				setState(102);
				match(T__1);
				setState(103);
				type();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(104);
					match(T__0);
					setState(105);
					match(ID);
					setState(106);
					match(T__1);
					setState(107);
					type();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class TypeContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				build_in_type();
				}
				break;
			case T__14:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				complex_type();
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
		public Build_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_in_type; }
	}

	public final Build_in_typeContext build_in_type() throws RecognitionException {
		Build_in_typeContext _localctx = new Build_in_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_build_in_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Complex_typeContext extends ParserRuleContext {
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
		enterRule(_localctx, 16, RULE_complex_type);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__14);
				setState(122);
				match(INT_CONSTANT);
				setState(123);
				match(T__15);
				setState(124);
				type();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__16);
				setState(126);
				match(T__8);
				setState(127);
				fields();
				setState(128);
				match(T__9);
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
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(132);
				match(ID);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(133);
					match(T__0);
					setState(134);
					match(ID);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__1);
				setState(141);
				type();
				setState(142);
				match(T__2);
				}
				}
				setState(148);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__17);
				setState(150);
				expression(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(151);
					match(T__0);
					setState(152);
					expression(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__18);
				setState(161);
				expression(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(162);
					match(T__0);
					setState(163);
					expression(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				expression(0);
				setState(172);
				match(T__19);
				setState(173);
				expression(0);
				setState(174);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(T__20);
				setState(177);
				expression(0);
				setState(178);
				match(T__1);
				setState(179);
				block();
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(180);
					match(T__21);
					setState(181);
					match(T__1);
					setState(182);
					block();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(T__22);
				setState(186);
				expression(0);
				setState(187);
				match(T__1);
				setState(188);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(T__23);
				setState(191);
				expression(0);
				setState(192);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				func_invocation();
				setState(195);
				match(T__2);
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
		enterRule(_localctx, 22, RULE_func_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(T__4);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132233453109280L) != 0)) {
				{
				setState(201);
				expression(0);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(202);
					match(T__0);
					setState(203);
					expression(0);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(211);
			match(T__5);
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__33:
			case T__37:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				statement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__8);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132233481158688L) != 0)) {
					{
					{
					setState(215);
					statement();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(T__9);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(225);
				match(T__37);
				setState(226);
				expression(10);
				}
				break;
			case 2:
				{
				setState(227);
				match(T__33);
				setState(228);
				expression(9);
				}
				break;
			case 3:
				{
				setState(229);
				match(T__4);
				setState(230);
				type();
				setState(231);
				match(T__5);
				setState(232);
				expression(8);
				}
				break;
			case 4:
				{
				setState(234);
				func_invocation();
				}
				break;
			case 5:
				{
				setState(235);
				match(ID);
				}
				break;
			case 6:
				{
				setState(236);
				match(INT_CONSTANT);
				}
				break;
			case 7:
				{
				setState(237);
				match(REAL_CONSTANT);
				}
				break;
			case 8:
				{
				setState(238);
				match(CHAR_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(245);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(248);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(251);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(252);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						match(T__38);
						setState(255);
						match(ID);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(257);
						match(T__14);
						setState(258);
						expression(0);
						setState(259);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u010b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003C\b\u0003\n\u0003\f\u0003F\t"+
		"\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003L\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004Y\b"+
		"\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0004\u0005\u0004_\b\u0004\n\u0004"+
		"\f\u0004b\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005m\b"+
		"\u0005\n\u0005\f\u0005p\t\u0005\u0003\u0005r\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006v\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u0091\b\t\n\t\f\t\u0094\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u009a\b\n\n\n\f\n\u009d\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00a5\b\n\n\n\f\n\u00a8\t\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b8\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00c6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00cd\b\u000b\n\u000b\f\u000b\u00d0\t\u000b\u0003\u000b\u00d2"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00d9"+
		"\b\f\n\f\f\f\u00dc\t\f\u0001\f\u0003\f\u00df\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f0\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0106"+
		"\b\r\n\r\f\r\u0109\t\r\u0001\r\u0000\u0001\u001a\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0005\u0001"+
		"\u0000\f\u000e\u0001\u0000\u0019\u001a\u0001\u0000\u001b \u0001\u0000"+
		"!\"\u0001\u0000#%\u0124\u0000\u001f\u0001\u0000\u0000\u0000\u0002\'\u0001"+
		"\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\fu\u0001"+
		"\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000"+
		"\u0000\u0000\u0012\u0092\u0001\u0000\u0000\u0000\u0014\u00c5\u0001\u0000"+
		"\u0000\u0000\u0016\u00c7\u0001\u0000\u0000\u0000\u0018\u00de\u0001\u0000"+
		"\u0000\u0000\u001a\u00ef\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002"+
		"\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\b"+
		"\u0004\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000"+
		"%(\u0003\u0004\u0002\u0000&(\u0003\u0006\u0003\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000).\u0005"+
		"+\u0000\u0000*+\u0005\u0001\u0000\u0000+-\u0005+\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"12\u0005\u0002\u0000\u000023\u0003\f\u0006\u000034\u0005\u0003\u0000\u0000"+
		"4\u0005\u0001\u0000\u0000\u000056\u0005\u0004\u0000\u000067\u0005+\u0000"+
		"\u000078\u0005\u0005\u0000\u000089\u0003\n\u0005\u00009:\u0005\u0006\u0000"+
		"\u0000:=\u0005\u0007\u0000\u0000;>\u0003\u000e\u0007\u0000<>\u0005\b\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0002\u0000\u0000@D\u0005\t\u0000\u0000AC\u0003\u0004"+
		"\u0002\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EJ\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000GI\u0003\u0014\n\u0000HG\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\n\u0000"+
		"\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0005\u0004\u0000\u0000PQ\u0005"+
		"\u000b\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0005\u0006\u0000\u0000"+
		"ST\u0005\u0007\u0000\u0000TU\u0005\b\u0000\u0000UV\u0005\u0002\u0000\u0000"+
		"VZ\u0005\t\u0000\u0000WY\u0003\u0004\u0002\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[`\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0003\u0014"+
		"\n\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cd\u0005\n\u0000\u0000d\t\u0001\u0000\u0000\u0000ef"+
		"\u0005+\u0000\u0000fg\u0005\u0002\u0000\u0000gn\u0003\f\u0006\u0000hi"+
		"\u0005\u0001\u0000\u0000ij\u0005+\u0000\u0000jk\u0005\u0002\u0000\u0000"+
		"km\u0003\f\u0006\u0000lh\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qe\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r\u000b\u0001\u0000\u0000\u0000sv\u0003\u000e\u0007\u0000"+
		"tv\u0003\u0010\b\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"v\r\u0001\u0000\u0000\u0000wx\u0007\u0000\u0000\u0000x\u000f\u0001\u0000"+
		"\u0000\u0000yz\u0005\u000f\u0000\u0000z{\u0005,\u0000\u0000{|\u0005\u0010"+
		"\u0000\u0000|\u0083\u0003\f\u0006\u0000}~\u0005\u0011\u0000\u0000~\u007f"+
		"\u0005\t\u0000\u0000\u007f\u0080\u0003\u0012\t\u0000\u0080\u0081\u0005"+
		"\n\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082y\u0001\u0000"+
		"\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0083\u0011\u0001\u0000\u0000"+
		"\u0000\u0084\u0089\u0005+\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000"+
		"\u0086\u0088\u0005+\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d"+
		"\u008e\u0003\f\u0006\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u0084\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0012\u0000\u0000\u0096\u009b"+
		"\u0003\u001a\r\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u009a\u0003"+
		"\u001a\r\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00c6\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u00a6\u0003\u001a"+
		"\r\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a5\u0003\u001a\r"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000"+
		"\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af"+
		"\u00c6\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1"+
		"\u00b2\u0003\u001a\r\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u00b7"+
		"\u0003\u0018\f\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0002\u0000\u0000\u00b6\u00b8\u0003\u0018\f\u0000\u00b7\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0017\u0000\u0000\u00ba\u00bb\u0003\u001a"+
		"\r\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc\u00bd\u0003\u0018\f"+
		"\u0000\u00bd\u00c6\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0018\u0000"+
		"\u0000\u00bf\u00c0\u0003\u001a\r\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000"+
		"\u00c1\u00c6\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u0016\u000b\u0000"+
		"\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c5\u0095\u0001\u0000\u0000\u0000\u00c5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00c5\u00ab\u0001\u0000\u0000\u0000\u00c5\u00b0\u0001\u0000\u0000\u0000"+
		"\u00c5\u00b9\u0001\u0000\u0000\u0000\u00c5\u00be\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c6\u0015\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005+\u0000\u0000\u00c8\u00d1\u0005\u0005\u0000\u0000\u00c9"+
		"\u00ce\u0003\u001a\r\u0000\u00ca\u00cb\u0005\u0001\u0000\u0000\u00cb\u00cd"+
		"\u0003\u001a\r\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0006\u0000\u0000\u00d4\u0017\u0001\u0000\u0000\u0000\u00d5\u00df\u0003"+
		"\u0014\n\u0000\u00d6\u00da\u0005\t\u0000\u0000\u00d7\u00d9\u0003\u0014"+
		"\n\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0005\n\u0000\u0000\u00de\u00d5\u0001\u0000\u0000\u0000"+
		"\u00de\u00d6\u0001\u0000\u0000\u0000\u00df\u0019\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0006\r\uffff\uffff\u0000\u00e1\u00e2\u0005&\u0000\u0000"+
		"\u00e2\u00f0\u0003\u001a\r\n\u00e3\u00e4\u0005\"\u0000\u0000\u00e4\u00f0"+
		"\u0003\u001a\r\t\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6\u00e7\u0003"+
		"\f\u0006\u0000\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00e9\u0003\u001a"+
		"\r\b\u00e9\u00f0\u0001\u0000\u0000\u0000\u00ea\u00f0\u0003\u0016\u000b"+
		"\u0000\u00eb\u00f0\u0005+\u0000\u0000\u00ec\u00f0\u0005,\u0000\u0000\u00ed"+
		"\u00f0\u0005-\u0000\u0000\u00ee\u00f0\u0005.\u0000\u0000\u00ef\u00e0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u0107\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\n\u000e\u0000\u0000\u00f2\u00f3\u0007\u0001"+
		"\u0000\u0000\u00f3\u0106\u0003\u001a\r\u000f\u00f4\u00f5\n\r\u0000\u0000"+
		"\u00f5\u00f6\u0007\u0002\u0000\u0000\u00f6\u0106\u0003\u001a\r\u000e\u00f7"+
		"\u00f8\n\f\u0000\u0000\u00f8\u00f9\u0007\u0003\u0000\u0000\u00f9\u0106"+
		"\u0003\u001a\r\r\u00fa\u00fb\n\u000b\u0000\u0000\u00fb\u00fc\u0007\u0004"+
		"\u0000\u0000\u00fc\u0106\u0003\u001a\r\f\u00fd\u00fe\n\u0007\u0000\u0000"+
		"\u00fe\u00ff\u0005\'\u0000\u0000\u00ff\u0106\u0005+\u0000\u0000\u0100"+
		"\u0101\n\u0006\u0000\u0000\u0101\u0102\u0005\u000f\u0000\u0000\u0102\u0103"+
		"\u0003\u001a\r\u0000\u0103\u0104\u0005\u0010\u0000\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u00f1\u0001\u0000\u0000\u0000\u0105\u00f4\u0001"+
		"\u0000\u0000\u0000\u0105\u00f7\u0001\u0000\u0000\u0000\u0105\u00fa\u0001"+
		"\u0000\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000\u0105\u0100\u0001"+
		"\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u001b\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0019\u001f\'."+
		"=DJZ`nqu\u0082\u0089\u0092\u009b\u00a6\u00b7\u00c5\u00ce\u00d1\u00da\u00de"+
		"\u00ef\u0105\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}