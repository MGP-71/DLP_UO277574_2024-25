// Generated from D:/DLP/DLP_UO277574_2024-25/src/parser/Pmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_SPACE=1, ONE_LINE_COMMENT=2, MULTIPLE_LINE_COMMENT=3, ID=4, INT_CONSTANT=5, 
		REAL_CONSTANT=6, CHAR_CONSTANT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITE_SPACE", "ONE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "REAL_CONSTANT_FLOATING_POINT", "REAL_CONSTANT_MANTISSA_EXPONENT", 
			"CHAR_CONSTANT", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITE_SPACE", "ONE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT", "ID", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0017"+
		"\b\u0000\u000b\u0000\f\u0000\u0018\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002"+
		"\f\u00021\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003;\b\u0003\n\u0003"+
		"\f\u0003>\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004"+
		"\f\u0004E\t\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005L\b\u0005\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0003"+
		"\u0006X\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007`\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tm\b"+
		"\t\u0002 /\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0000\u000f\u0000\u0011\u0007\u0013\u0000\u0001\u0000\t"+
		"\u0003\u0000\t\n\r\r  \u0001\u0001\n\n\u0003\u0000AZ__az\u0004\u00000"+
		"9AZ__az\u0001\u000009\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0002"+
		"\u0000nnttx\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000"+
		"\u0000\u0003\u001c\u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000\u0000"+
		"\u00078\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bK\u0001"+
		"\u0000\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000f[\u0001\u0000\u0000"+
		"\u0000\u0011c\u0001\u0000\u0000\u0000\u0013l\u0001\u0000\u0000\u0000\u0015"+
		"\u0017\u0007\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0006\u0000\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c"+
		" \u0005#\u0000\u0000\u001d\u001f\t\u0000\u0000\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000#%\u0007\u0001\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&\'\u0006\u0001\u0000\u0000\'\u0004\u0001\u0000"+
		"\u0000\u0000()\u0005\"\u0000\u0000)*\u0005\"\u0000\u0000*+\u0005\"\u0000"+
		"\u0000+/\u0001\u0000\u0000\u0000,.\t\u0000\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005"+
		"\"\u0000\u000034\u0005\"\u0000\u000045\u0005\"\u0000\u000056\u0001\u0000"+
		"\u0000\u000067\u0006\u0002\u0000\u00007\u0006\u0001\u0000\u0000\u0000"+
		"8<\u0007\u0002\u0000\u00009;\u0007\u0003\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=\b\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?C\u0007"+
		"\u0004\u0000\u0000@B\u0007\u0005\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DH\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u00050\u0000"+
		"\u0000G?\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\n\u0001\u0000"+
		"\u0000\u0000IL\u0003\r\u0006\u0000JL\u0003\u000f\u0007\u0000KI\u0001\u0000"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000L\f\u0001\u0000\u0000\u0000MO\u0003"+
		"\t\u0004\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0005.\u0000\u0000QX\u0003\t\u0004\u0000RS\u0003"+
		"\t\u0004\u0000SU\u0005.\u0000\u0000TV\u0003\t\u0004\u0000UT\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WN\u0001"+
		"\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000X\u000e\u0001\u0000\u0000"+
		"\u0000Y\\\u0003\r\u0006\u0000Z\\\u0003\t\u0004\u0000[Y\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0007\u0006"+
		"\u0000\u0000^`\u0007\u0007\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0003\t\u0004\u0000b\u0010"+
		"\u0001\u0000\u0000\u0000cd\u0005\'\u0000\u0000de\u0003\u0013\t\u0000e"+
		"f\u0005\'\u0000\u0000f\u0012\u0001\u0000\u0000\u0000gm\t\u0000\u0000\u0000"+
		"hi\u0005\\\u0000\u0000im\u0003\t\u0004\u0000jk\u0005\\\u0000\u0000km\u0007"+
		"\b\u0000\u0000lg\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000m\u0014\u0001\u0000\u0000\u0000\u000f\u0000\u0018 $"+
		"/<CGKNUW[_l\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}