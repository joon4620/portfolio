// Generated from /Users/joon/Desktop/College/Fall_2023/Programming_Paradigms/Assignments/pp-jl72763/lexparse/code/SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, BOOL=44, ID=45, NUM=46, 
		CHAR=47, COMMENT=48, WS=49, OTHER=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "BOOL", "ID", "NUM", "CHAR", "COMMENT", "WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'project'", "'{'", "'}'", "'const'", "'='", "','", "';'", "'enum'", 
			"'['", "']'", "'class'", "'extends'", "'implements'", "'interface'", 
			"'static'", "'void'", "'('", "')'", "'if'", "'else'", "'for'", "'break'", 
			"'continue'", "'return'", "'read'", "'print'", "'++'", "'--'", "'||'", 
			"'&&'", "'-'", "'new'", "'.'", "'=='", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'+'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "BOOL", "ID", "NUM", 
			"CHAR", "COMMENT", "WS", "OTHER"
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


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 49:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    System.out.println("LEXER ERROR");

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0146\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u011e\n-\3.\3.\7.\u0122\n.\f.\16.\u0125\13.\3/\3/\7/"+
		"\u0129\n/\f/\16/\u012c\13/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61"+
		"\u0136\n\61\f\61\16\61\u0139\13\61\3\61\3\61\3\62\6\62\u013e\n\62\r\62"+
		"\16\62\u013f\3\62\3\62\3\63\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\3"+
		"\2\"\u0080\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u014a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13y\3\2\2\2\r{\3"+
		"\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27"+
		"\u0088\3\2\2\2\31\u008e\3\2\2\2\33\u0096\3\2\2\2\35\u00a1\3\2\2\2\37\u00ab"+
		"\3\2\2\2!\u00b2\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2"+
		")\u00be\3\2\2\2+\u00c3\3\2\2\2-\u00c7\3\2\2\2/\u00cd\3\2\2\2\61\u00d6"+
		"\3\2\2\2\63\u00dd\3\2\2\2\65\u00e2\3\2\2\2\67\u00e8\3\2\2\29\u00eb\3\2"+
		"\2\2;\u00ee\3\2\2\2=\u00f1\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00fa"+
		"\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2I\u0102\3\2\2\2K\u0104\3\2\2\2M"+
		"\u0107\3\2\2\2O\u0109\3\2\2\2Q\u010c\3\2\2\2S\u010e\3\2\2\2U\u0110\3\2"+
		"\2\2W\u0112\3\2\2\2Y\u011d\3\2\2\2[\u011f\3\2\2\2]\u0126\3\2\2\2_\u012d"+
		"\3\2\2\2a\u0131\3\2\2\2c\u013d\3\2\2\2e\u0143\3\2\2\2gh\7r\2\2hi\7t\2"+
		"\2ij\7q\2\2jk\7l\2\2kl\7g\2\2lm\7e\2\2mn\7v\2\2n\4\3\2\2\2op\7}\2\2p\6"+
		"\3\2\2\2qr\7\177\2\2r\b\3\2\2\2st\7e\2\2tu\7q\2\2uv\7p\2\2vw\7u\2\2wx"+
		"\7v\2\2x\n\3\2\2\2yz\7?\2\2z\f\3\2\2\2{|\7.\2\2|\16\3\2\2\2}~\7=\2\2~"+
		"\20\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7w\2\2\u0082"+
		"\u0083\7o\2\2\u0083\22\3\2\2\2\u0084\u0085\7]\2\2\u0085\24\3\2\2\2\u0086"+
		"\u0087\7_\2\2\u0087\26\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7u\2\2\u008c\u008d\7u\2\2\u008d\30\3\2\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7z\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094\u0095\7u\2\2\u0095\32\3\2"+
		"\2\2\u0096\u0097\7k\2\2\u0097\u0098\7o\2\2\u0098\u0099\7r\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7g\2\2\u009b\u009c\7o\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7u\2\2\u00a0\34\3\2\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\u00a6\7t\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9"+
		"\7e\2\2\u00a9\u00aa\7g\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7e\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7f\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8"+
		"$\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7h\2\2\u00bd(\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7g\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7t\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7m\2\2\u00cc"+
		".\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7w\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7"+
		"g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\62\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7f\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\66\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7-\2\2\u00ea8\3\2\2\2\u00eb"+
		"\u00ec\7/\2\2\u00ec\u00ed\7/\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7~\2\2\u00ef"+
		"\u00f0\7~\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7(\2\2\u00f3"+
		">\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7y\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7\60\2\2\u00fbD"+
		"\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\u00fe\7?\2\2\u00feF\3\2\2\2\u00ff\u0100"+
		"\7#\2\2\u0100\u0101\7?\2\2\u0101H\3\2\2\2\u0102\u0103\7@\2\2\u0103J\3"+
		"\2\2\2\u0104\u0105\7@\2\2\u0105\u0106\7?\2\2\u0106L\3\2\2\2\u0107\u0108"+
		"\7>\2\2\u0108N\3\2\2\2\u0109\u010a\7>\2\2\u010a\u010b\7?\2\2\u010bP\3"+
		"\2\2\2\u010c\u010d\7-\2\2\u010dR\3\2\2\2\u010e\u010f\7,\2\2\u010fT\3\2"+
		"\2\2\u0110\u0111\7\61\2\2\u0111V\3\2\2\2\u0112\u0113\7\'\2\2\u0113X\3"+
		"\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117\7w\2\2\u0117"+
		"\u011e\7g\2\2\u0118\u0119\7h\2\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2"+
		"\u011b\u011c\7u\2\2\u011c\u011e\7g\2\2\u011d\u0114\3\2\2\2\u011d\u0118"+
		"\3\2\2\2\u011eZ\3\2\2\2\u011f\u0123\t\2\2\2\u0120\u0122\t\3\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\\\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012a\t\4\2\2\u0127\u0129"+
		"\t\4\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b^\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7)\2\2\u012e"+
		"\u012f\t\5\2\2\u012f\u0130\7)\2\2\u0130`\3\2\2\2\u0131\u0132\7\61\2\2"+
		"\u0132\u0133\7\61\2\2\u0133\u0137\3\2\2\2\u0134\u0136\n\6\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b\61\2\2\u013bb\3\2\2\2"+
		"\u013c\u013e\t\7\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\62\2\2"+
		"\u0142d\3\2\2\2\u0143\u0144\13\2\2\2\u0144\u0145\b\63\3\2\u0145f\3\2\2"+
		"\2\b\2\u011d\u0123\u012a\u0137\u013f\4\b\2\2\3\63\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}