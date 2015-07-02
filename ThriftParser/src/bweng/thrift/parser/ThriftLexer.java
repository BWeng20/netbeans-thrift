// $ANTLR 3.5.2 Thrift.g 2015-07-01 02:17:40

package bweng.thrift.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ThriftLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int ARGS=4;
	public static final int ASYNC=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int CONST=8;
	public static final int CPP_INCLUDE=9;
	public static final int CPP_TYPE=10;
	public static final int DEFAULT_NAMESPACE=11;
	public static final int DEFERRED=12;
	public static final int DIGIT=13;
	public static final int DOCUMENT=14;
	public static final int DOUBLE=15;
	public static final int ENTRY=16;
	public static final int ENUM=17;
	public static final int EVENT=18;
	public static final int EXCEPTION=19;
	public static final int EXTENDS=20;
	public static final int FIELD=21;
	public static final int FIELD_ID=22;
	public static final int HEX_DIGIT=23;
	public static final int HEX_INTEGER=24;
	public static final int IDENTIFIER=25;
	public static final int INCLUDE=26;
	public static final int INTEGER=27;
	public static final int LCURLY=28;
	public static final int LETTER=29;
	public static final int LIST=30;
	public static final int LITERAL=31;
	public static final int MAP=32;
	public static final int METHOD=33;
	public static final int NAMESPACE=34;
	public static final int ONEWAY=35;
	public static final int OPTIONAL=36;
	public static final int PACKAGE=37;
	public static final int RCURLY=38;
	public static final int REQUIRED=39;
	public static final int REQUIREDNESS=40;
	public static final int SEMICOLON=41;
	public static final int SENUM=42;
	public static final int SERVICE=43;
	public static final int SET=44;
	public static final int STRUCT=45;
	public static final int THROWS=46;
	public static final int TYPE=47;
	public static final int TYPEDEF=48;
	public static final int TYPES=49;
	public static final int TYPE_BINARY=50;
	public static final int TYPE_BOOL=51;
	public static final int TYPE_BYTE=52;
	public static final int TYPE_DOUBLE=53;
	public static final int TYPE_I16=54;
	public static final int TYPE_I32=55;
	public static final int TYPE_I64=56;
	public static final int TYPE_STRING=57;
	public static final int UNION=58;
	public static final int VOID=59;
	public static final int WS=60;

	    public static final int COMMENTS = 2;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ThriftLexer() {} 
	public ThriftLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ThriftLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Thrift.g"; }

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:14:7: ( '(' )
			// Thrift.g:14:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:15:7: ( ')' )
			// Thrift.g:15:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:16:7: ( '*' )
			// Thrift.g:16:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:17:7: ( ':' )
			// Thrift.g:17:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:18:7: ( '<' )
			// Thrift.g:18:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:19:7: ( '=' )
			// Thrift.g:19:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:20:7: ( '>' )
			// Thrift.g:20:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:21:7: ( '[' )
			// Thrift.g:21:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:22:7: ( ']' )
			// Thrift.g:22:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:23:7: ( 'cpp_include' )
			// Thrift.g:23:9: 'cpp_include'
			{
			match("cpp_include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:24:7: ( 'cpp_namespace' )
			// Thrift.g:24:9: 'cpp_namespace'
			{
			match("cpp_namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:25:7: ( 'cpp_type' )
			// Thrift.g:25:9: 'cpp_type'
			{
			match("cpp_type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:26:7: ( 'php_namespace' )
			// Thrift.g:26:9: 'php_namespace'
			{
			match("php_namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:57:9: ( 'include' )
			// Thrift.g:57:11: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:58:9: ( 'package' )
			// Thrift.g:58:11: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "SERVICE"
	public final void mSERVICE() throws RecognitionException {
		try {
			int _type = SERVICE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:59:9: ( 'service' )
			// Thrift.g:59:11: 'service'
			{
			match("service"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SERVICE"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:60:9: ( 'void' )
			// Thrift.g:60:11: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:61:9: ( 'enum' )
			// Thrift.g:61:11: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "TYPEDEF"
	public final void mTYPEDEF() throws RecognitionException {
		try {
			int _type = TYPEDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:62:9: ( 'typedef' )
			// Thrift.g:62:11: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEDEF"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:63:9: ( 'extends' )
			// Thrift.g:63:11: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "STRUCT"
	public final void mSTRUCT() throws RecognitionException {
		try {
			int _type = STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:64:9: ( 'struct' )
			// Thrift.g:64:11: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT"

	// $ANTLR start "UNION"
	public final void mUNION() throws RecognitionException {
		try {
			int _type = UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:65:9: ( 'union' )
			// Thrift.g:65:11: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION"

	// $ANTLR start "EXCEPTION"
	public final void mEXCEPTION() throws RecognitionException {
		try {
			int _type = EXCEPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:66:11: ( 'exception' )
			// Thrift.g:66:13: 'exception'
			{
			match("exception"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCEPTION"

	// $ANTLR start "DEFERRED"
	public final void mDEFERRED() throws RecognitionException {
		try {
			int _type = DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:67:9: ( 'deferred' )
			// Thrift.g:67:11: 'deferred'
			{
			match("deferred"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFERRED"

	// $ANTLR start "EVENT"
	public final void mEVENT() throws RecognitionException {
		try {
			int _type = EVENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:68:9: ( 'event' )
			// Thrift.g:68:11: 'event'
			{
			match("event"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVENT"

	// $ANTLR start "ONEWAY"
	public final void mONEWAY() throws RecognitionException {
		try {
			int _type = ONEWAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:69:9: ( 'oneway' )
			// Thrift.g:69:11: 'oneway'
			{
			match("oneway"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONEWAY"

	// $ANTLR start "ASYNC"
	public final void mASYNC() throws RecognitionException {
		try {
			int _type = ASYNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:70:9: ( 'async' )
			// Thrift.g:70:11: 'async'
			{
			match("async"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASYNC"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:71:9: ( 'list' )
			// Thrift.g:71:11: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "MAP"
	public final void mMAP() throws RecognitionException {
		try {
			int _type = MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:72:9: ( 'map' )
			// Thrift.g:72:11: 'map'
			{
			match("map"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:73:9: ( 'set' )
			// Thrift.g:73:11: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:74:9: ( 'throws' )
			// Thrift.g:74:11: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROWS"

	// $ANTLR start "REQUIRED"
	public final void mREQUIRED() throws RecognitionException {
		try {
			int _type = REQUIRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:75:9: ( 'required' )
			// Thrift.g:75:11: 'required'
			{
			match("required"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRED"

	// $ANTLR start "OPTIONAL"
	public final void mOPTIONAL() throws RecognitionException {
		try {
			int _type = OPTIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:76:9: ( 'optional' )
			// Thrift.g:76:11: 'optional'
			{
			match("optional"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPTIONAL"

	// $ANTLR start "SENUM"
	public final void mSENUM() throws RecognitionException {
		try {
			int _type = SENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:77:9: ( 'senum' )
			// Thrift.g:77:11: 'senum'
			{
			match("senum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SENUM"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:78:9: ( 'const' )
			// Thrift.g:78:11: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "NAMESPACE"
	public final void mNAMESPACE() throws RecognitionException {
		try {
			int _type = NAMESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:79:10: ( 'namespace' )
			// Thrift.g:79:12: 'namespace'
			{
			match("namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAMESPACE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:81:9: ( '{' )
			// Thrift.g:81:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:82:9: ( '}' )
			// Thrift.g:82:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:240:5: ( ( '+' | '-' )? ( DIGIT )+ )
			// Thrift.g:240:7: ( '+' | '-' )? ( DIGIT )+
			{
			// Thrift.g:240:7: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// Thrift.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Thrift.g:240:20: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Thrift.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			 setText(getText().substring(0, getText().length())); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "HEX_INTEGER"
	public final void mHEX_INTEGER() throws RecognitionException {
		try {
			int _type = HEX_INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:245:5: ( '0x' ( HEX_DIGIT )+ )
			// Thrift.g:245:7: '0x' ( HEX_DIGIT )+
			{
			match("0x"); 

			// Thrift.g:245:12: ( HEX_DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Thrift.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 setText(getText().substring(0, getText().length())); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_INTEGER"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:250:5: ( ( '+' | '-' )? ( DIGIT )* ( '.' ( DIGIT )+ )? ( ( 'E' | 'e' ) INTEGER )? )
			// Thrift.g:250:7: ( '+' | '-' )? ( DIGIT )* ( '.' ( DIGIT )+ )? ( ( 'E' | 'e' ) INTEGER )?
			{
			// Thrift.g:250:7: ( '+' | '-' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='+'||LA4_0=='-') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Thrift.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Thrift.g:250:20: ( DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Thrift.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			// Thrift.g:250:27: ( '.' ( DIGIT )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='.') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Thrift.g:250:28: '.' ( DIGIT )+
					{
					match('.'); 
					// Thrift.g:250:32: ( DIGIT )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Thrift.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}

			// Thrift.g:250:41: ( ( 'E' | 'e' ) INTEGER )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='E'||LA8_0=='e') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Thrift.g:250:42: ( 'E' | 'e' ) INTEGER
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					mINTEGER(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "TYPE_BOOL"
	public final void mTYPE_BOOL() throws RecognitionException {
		try {
			int _type = TYPE_BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:273:10: ( 'bool' )
			// Thrift.g:273:12: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BOOL"

	// $ANTLR start "TYPE_BYTE"
	public final void mTYPE_BYTE() throws RecognitionException {
		try {
			int _type = TYPE_BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:274:10: ( 'byte' | 'int8' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='b') ) {
				alt9=1;
			}
			else if ( (LA9_0=='i') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Thrift.g:274:12: 'byte'
					{
					match("byte"); 

					}
					break;
				case 2 :
					// Thrift.g:274:21: 'int8'
					{
					match("int8"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BYTE"

	// $ANTLR start "TYPE_I16"
	public final void mTYPE_I16() throws RecognitionException {
		try {
			int _type = TYPE_I16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:275:9: ( 'i16' | 'int16' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='i') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='1') ) {
					alt10=1;
				}
				else if ( (LA10_1=='n') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Thrift.g:275:11: 'i16'
					{
					match("i16"); 

					}
					break;
				case 2 :
					// Thrift.g:275:19: 'int16'
					{
					match("int16"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_I16"

	// $ANTLR start "TYPE_I32"
	public final void mTYPE_I32() throws RecognitionException {
		try {
			int _type = TYPE_I32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:276:9: ( 'i32' | 'int32' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='i') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='3') ) {
					alt11=1;
				}
				else if ( (LA11_1=='n') ) {
					alt11=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Thrift.g:276:11: 'i32'
					{
					match("i32"); 

					}
					break;
				case 2 :
					// Thrift.g:276:19: 'int32'
					{
					match("int32"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_I32"

	// $ANTLR start "TYPE_I64"
	public final void mTYPE_I64() throws RecognitionException {
		try {
			int _type = TYPE_I64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:277:9: ( 'i64' | 'int64' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='i') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='6') ) {
					alt12=1;
				}
				else if ( (LA12_1=='n') ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Thrift.g:277:11: 'i64'
					{
					match("i64"); 

					}
					break;
				case 2 :
					// Thrift.g:277:19: 'int64'
					{
					match("int64"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_I64"

	// $ANTLR start "TYPE_DOUBLE"
	public final void mTYPE_DOUBLE() throws RecognitionException {
		try {
			int _type = TYPE_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:278:12: ( 'double' )
			// Thrift.g:278:14: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_DOUBLE"

	// $ANTLR start "TYPE_STRING"
	public final void mTYPE_STRING() throws RecognitionException {
		try {
			int _type = TYPE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:279:12: ( 'string' )
			// Thrift.g:279:14: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_STRING"

	// $ANTLR start "TYPE_BINARY"
	public final void mTYPE_BINARY() throws RecognitionException {
		try {
			int _type = TYPE_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:280:12: ( 'binary' )
			// Thrift.g:280:14: 'binary'
			{
			match("binary"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BINARY"

	// $ANTLR start "LITERAL"
	public final void mLITERAL() throws RecognitionException {
		try {
			int _type = LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:283:5: ( ( ( '\"' (~ '\"' )* '\"' ) | ( '\\'' (~ '\\'' )* '\\'' ) ) )
			// Thrift.g:283:7: ( ( '\"' (~ '\"' )* '\"' ) | ( '\\'' (~ '\\'' )* '\\'' ) )
			{
			// Thrift.g:283:7: ( ( '\"' (~ '\"' )* '\"' ) | ( '\\'' (~ '\\'' )* '\\'' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\"') ) {
				alt15=1;
			}
			else if ( (LA15_0=='\'') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Thrift.g:283:8: ( '\"' (~ '\"' )* '\"' )
					{
					// Thrift.g:283:8: ( '\"' (~ '\"' )* '\"' )
					// Thrift.g:283:9: '\"' (~ '\"' )* '\"'
					{
					match('\"'); 
					// Thrift.g:283:13: (~ '\"' )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '\uFFFF')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// Thrift.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop13;
						}
					}

					match('\"'); 
					}

					}
					break;
				case 2 :
					// Thrift.g:283:26: ( '\\'' (~ '\\'' )* '\\'' )
					{
					// Thrift.g:283:26: ( '\\'' (~ '\\'' )* '\\'' )
					// Thrift.g:283:27: '\\'' (~ '\\'' )* '\\''
					{
					match('\''); 
					// Thrift.g:283:32: (~ '\\'' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// Thrift.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop14;
						}
					}

					match('\''); 
					}

					}
					break;

			}

			 setText(getText().substring(1, getText().length() - 1)); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:288:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '.' | '_' )* )
			// Thrift.g:288:7: ( LETTER | '_' ) ( LETTER | DIGIT | '.' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Thrift.g:288:22: ( LETTER | DIGIT | '.' | '_' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='.'||(LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Thrift.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			 setText(getText().substring(0, getText().length())); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:292:7: ( ',' )
			// Thrift.g:292:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:293:11: ( ';' )
			// Thrift.g:293:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Thrift.g:296:5: ( 'A' .. 'Z' | 'a' .. 'z' )
			// Thrift.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Thrift.g:300:5: ( '0' .. '9' )
			// Thrift.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// Thrift.g:304:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
			// Thrift.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:308:5: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )+ )
			// Thrift.g:308:7: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )+
			{
			// Thrift.g:308:7: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=5;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt17=1;
					}
					break;
				case '\t':
					{
					alt17=2;
					}
					break;
				case '\r':
					{
					alt17=3;
					}
					break;
				case '\n':
					{
					alt17=4;
					}
					break;
				}
				switch (alt17) {
				case 1 :
					// Thrift.g:308:8: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// Thrift.g:308:14: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// Thrift.g:308:21: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 4 :
					// Thrift.g:308:33: '\\n'
					{
					match('\n'); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Thrift.g:312:5: ( '/*' ( options {greedy=false; } : . )* '*/' | ( '//' | '#' ) (~ '\\n' )* )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='/') ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1=='*') ) {
					alt21=1;
				}
				else if ( (LA21_1=='/') ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA21_0=='#') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Thrift.g:312:7: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// Thrift.g:312:12: ( options {greedy=false; } : . )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0=='*') ) {
							int LA18_1 = input.LA(2);
							if ( (LA18_1=='/') ) {
								alt18=2;
							}
							else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '.')||(LA18_1 >= '0' && LA18_1 <= '\uFFFF')) ) {
								alt18=1;
							}

						}
						else if ( ((LA18_0 >= '\u0000' && LA18_0 <= ')')||(LA18_0 >= '+' && LA18_0 <= '\uFFFF')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// Thrift.g:312:39: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop18;
						}
					}

					match("*/"); 

					 _channel = COMMENTS; 
					}
					break;
				case 2 :
					// Thrift.g:313:7: ( '//' | '#' ) (~ '\\n' )*
					{
					// Thrift.g:313:7: ( '//' | '#' )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='/') ) {
						alt19=1;
					}
					else if ( (LA19_0=='#') ) {
						alt19=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// Thrift.g:313:8: '//'
							{
							match("//"); 

							}
							break;
						case 2 :
							// Thrift.g:313:15: '#'
							{
							match('#'); 
							}
							break;

					}

					// Thrift.g:313:20: (~ '\\n' )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\uFFFF')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// Thrift.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop20;
						}
					}

					 _channel = COMMENTS; 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// Thrift.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | INCLUDE | PACKAGE | SERVICE | VOID | ENUM | TYPEDEF | EXTENDS | STRUCT | UNION | EXCEPTION | DEFERRED | EVENT | ONEWAY | ASYNC | LIST | MAP | SET | THROWS | REQUIRED | OPTIONAL | SENUM | CONST | NAMESPACE | LCURLY | RCURLY | INTEGER | HEX_INTEGER | DOUBLE | TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY | LITERAL | IDENTIFIER | COMMA | SEMICOLON | WS | COMMENT )
		int alt22=55;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// Thrift.g:1:10: T__61
				{
				mT__61(); 

				}
				break;
			case 2 :
				// Thrift.g:1:16: T__62
				{
				mT__62(); 

				}
				break;
			case 3 :
				// Thrift.g:1:22: T__63
				{
				mT__63(); 

				}
				break;
			case 4 :
				// Thrift.g:1:28: T__64
				{
				mT__64(); 

				}
				break;
			case 5 :
				// Thrift.g:1:34: T__65
				{
				mT__65(); 

				}
				break;
			case 6 :
				// Thrift.g:1:40: T__66
				{
				mT__66(); 

				}
				break;
			case 7 :
				// Thrift.g:1:46: T__67
				{
				mT__67(); 

				}
				break;
			case 8 :
				// Thrift.g:1:52: T__68
				{
				mT__68(); 

				}
				break;
			case 9 :
				// Thrift.g:1:58: T__69
				{
				mT__69(); 

				}
				break;
			case 10 :
				// Thrift.g:1:64: T__70
				{
				mT__70(); 

				}
				break;
			case 11 :
				// Thrift.g:1:70: T__71
				{
				mT__71(); 

				}
				break;
			case 12 :
				// Thrift.g:1:76: T__72
				{
				mT__72(); 

				}
				break;
			case 13 :
				// Thrift.g:1:82: T__73
				{
				mT__73(); 

				}
				break;
			case 14 :
				// Thrift.g:1:88: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 15 :
				// Thrift.g:1:96: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 16 :
				// Thrift.g:1:104: SERVICE
				{
				mSERVICE(); 

				}
				break;
			case 17 :
				// Thrift.g:1:112: VOID
				{
				mVOID(); 

				}
				break;
			case 18 :
				// Thrift.g:1:117: ENUM
				{
				mENUM(); 

				}
				break;
			case 19 :
				// Thrift.g:1:122: TYPEDEF
				{
				mTYPEDEF(); 

				}
				break;
			case 20 :
				// Thrift.g:1:130: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 21 :
				// Thrift.g:1:138: STRUCT
				{
				mSTRUCT(); 

				}
				break;
			case 22 :
				// Thrift.g:1:145: UNION
				{
				mUNION(); 

				}
				break;
			case 23 :
				// Thrift.g:1:151: EXCEPTION
				{
				mEXCEPTION(); 

				}
				break;
			case 24 :
				// Thrift.g:1:161: DEFERRED
				{
				mDEFERRED(); 

				}
				break;
			case 25 :
				// Thrift.g:1:170: EVENT
				{
				mEVENT(); 

				}
				break;
			case 26 :
				// Thrift.g:1:176: ONEWAY
				{
				mONEWAY(); 

				}
				break;
			case 27 :
				// Thrift.g:1:183: ASYNC
				{
				mASYNC(); 

				}
				break;
			case 28 :
				// Thrift.g:1:189: LIST
				{
				mLIST(); 

				}
				break;
			case 29 :
				// Thrift.g:1:194: MAP
				{
				mMAP(); 

				}
				break;
			case 30 :
				// Thrift.g:1:198: SET
				{
				mSET(); 

				}
				break;
			case 31 :
				// Thrift.g:1:202: THROWS
				{
				mTHROWS(); 

				}
				break;
			case 32 :
				// Thrift.g:1:209: REQUIRED
				{
				mREQUIRED(); 

				}
				break;
			case 33 :
				// Thrift.g:1:218: OPTIONAL
				{
				mOPTIONAL(); 

				}
				break;
			case 34 :
				// Thrift.g:1:227: SENUM
				{
				mSENUM(); 

				}
				break;
			case 35 :
				// Thrift.g:1:233: CONST
				{
				mCONST(); 

				}
				break;
			case 36 :
				// Thrift.g:1:239: NAMESPACE
				{
				mNAMESPACE(); 

				}
				break;
			case 37 :
				// Thrift.g:1:249: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 38 :
				// Thrift.g:1:256: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 39 :
				// Thrift.g:1:263: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 40 :
				// Thrift.g:1:271: HEX_INTEGER
				{
				mHEX_INTEGER(); 

				}
				break;
			case 41 :
				// Thrift.g:1:283: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 42 :
				// Thrift.g:1:290: TYPE_BOOL
				{
				mTYPE_BOOL(); 

				}
				break;
			case 43 :
				// Thrift.g:1:300: TYPE_BYTE
				{
				mTYPE_BYTE(); 

				}
				break;
			case 44 :
				// Thrift.g:1:310: TYPE_I16
				{
				mTYPE_I16(); 

				}
				break;
			case 45 :
				// Thrift.g:1:319: TYPE_I32
				{
				mTYPE_I32(); 

				}
				break;
			case 46 :
				// Thrift.g:1:328: TYPE_I64
				{
				mTYPE_I64(); 

				}
				break;
			case 47 :
				// Thrift.g:1:337: TYPE_DOUBLE
				{
				mTYPE_DOUBLE(); 

				}
				break;
			case 48 :
				// Thrift.g:1:349: TYPE_STRING
				{
				mTYPE_STRING(); 

				}
				break;
			case 49 :
				// Thrift.g:1:361: TYPE_BINARY
				{
				mTYPE_BINARY(); 

				}
				break;
			case 50 :
				// Thrift.g:1:373: LITERAL
				{
				mLITERAL(); 

				}
				break;
			case 51 :
				// Thrift.g:1:381: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 52 :
				// Thrift.g:1:392: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 53 :
				// Thrift.g:1:398: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 54 :
				// Thrift.g:1:408: WS
				{
				mWS(); 

				}
				break;
			case 55 :
				// Thrift.g:1:411: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA22_eotS =
		"\1\36\11\uffff\17\42\2\uffff\1\36\2\103\1\uffff\2\42\6\uffff\16\42\1\36"+
		"\14\42\2\uffff\11\42\1\161\1\162\1\163\1\42\1\165\20\42\1\u0087\12\42"+
		"\1\u0094\3\42\3\uffff\1\42\1\uffff\3\42\1\u009c\1\u009d\13\42\1\u00a9"+
		"\1\uffff\2\42\1\u00ac\1\u0094\4\42\1\u00b1\3\42\1\uffff\1\161\1\162\1"+
		"\163\1\42\1\u00b6\2\42\2\uffff\2\42\1\u00bb\2\42\1\u00be\4\42\1\u00c3"+
		"\1\uffff\2\42\1\uffff\4\42\1\uffff\4\42\1\uffff\1\u00ce\1\u00cf\2\42\1"+
		"\uffff\1\42\1\u00d3\1\uffff\1\42\1\u00d5\1\u00d6\1\42\1\uffff\2\42\1\u00da"+
		"\4\42\1\u00df\1\u00e0\1\u00e1\2\uffff\1\u00e2\1\42\1\u00e4\1\uffff\1\42"+
		"\2\uffff\3\42\1\uffff\2\42\1\u00eb\1\42\4\uffff\1\42\1\uffff\1\u00ee\1"+
		"\u00ef\1\u00f0\3\42\1\uffff\1\42\1\u00f5\3\uffff\1\u00f6\3\42\2\uffff"+
		"\1\u00fa\2\42\1\uffff\2\42\1\u00ff\1\u0100\2\uffff";
	static final String DFA22_eofS =
		"\u0101\uffff";
	static final String DFA22_minS =
		"\1\11\11\uffff\1\157\1\141\1\61\1\145\1\157\1\53\1\150\1\156\1\145\1\156"+
		"\1\163\1\151\1\141\1\145\1\141\2\uffff\1\60\2\56\1\uffff\1\53\1\151\6"+
		"\uffff\1\160\1\156\1\160\2\143\1\66\1\62\1\64\1\156\1\162\1\151\1\165"+
		"\1\143\1\145\1\56\1\160\1\162\1\151\1\146\1\165\1\145\1\164\1\171\1\163"+
		"\1\160\1\161\1\155\2\uffff\1\157\1\164\1\156\1\137\1\163\1\137\1\153\1"+
		"\154\1\61\3\56\1\166\1\56\1\165\1\151\1\144\1\155\2\145\1\156\1\145\2"+
		"\157\1\145\1\142\1\167\1\151\1\156\1\164\1\56\1\165\1\145\1\154\1\145"+
		"\1\141\1\151\1\164\1\156\1\141\1\165\1\56\1\66\1\62\1\64\3\uffff\1\151"+
		"\1\uffff\1\155\1\143\1\156\2\56\1\156\1\160\1\164\1\144\1\167\1\156\1"+
		"\162\1\154\1\141\1\157\1\143\1\56\1\uffff\1\151\1\163\2\56\1\162\1\156"+
		"\1\141\1\171\1\56\1\141\1\147\1\144\1\uffff\3\56\1\143\1\56\1\164\1\147"+
		"\2\uffff\1\144\1\164\1\56\1\145\1\163\1\56\1\162\1\145\1\171\1\156\1\56"+
		"\1\uffff\1\162\1\160\1\uffff\1\171\1\143\1\155\1\160\1\uffff\1\155\3\145"+
		"\1\uffff\2\56\1\163\1\151\1\uffff\1\146\1\56\1\uffff\1\145\2\56\1\141"+
		"\1\uffff\1\145\1\141\1\56\1\154\3\145\3\56\2\uffff\1\56\1\157\1\56\1\uffff"+
		"\1\144\2\uffff\1\154\1\144\1\143\1\uffff\1\165\1\163\1\56\1\163\4\uffff"+
		"\1\156\1\uffff\3\56\1\145\1\144\1\160\1\uffff\1\160\1\56\3\uffff\1\56"+
		"\1\145\2\141\2\uffff\1\56\2\143\1\uffff\2\145\2\56\2\uffff";
	static final String DFA22_maxS =
		"\1\175\11\uffff\1\160\1\150\1\156\1\164\1\157\1\170\1\171\1\156\1\157"+
		"\1\160\1\163\1\151\1\141\1\145\1\141\2\uffff\1\71\1\170\1\145\1\uffff"+
		"\1\71\1\171\6\uffff\1\160\1\156\1\160\1\143\1\164\1\66\1\62\1\64\1\164"+
		"\1\162\1\151\1\165\1\164\1\145\1\172\1\160\1\162\1\151\1\146\1\165\1\145"+
		"\1\164\1\171\1\163\1\160\1\161\1\155\2\uffff\1\157\1\164\1\156\1\137\1"+
		"\163\1\137\1\153\1\154\1\70\3\172\1\166\1\172\2\165\1\144\1\155\2\145"+
		"\1\156\1\145\2\157\1\145\1\142\1\167\1\151\1\156\1\164\1\172\1\165\1\145"+
		"\1\154\1\145\1\141\2\164\1\156\1\141\1\165\1\172\1\66\1\62\1\64\3\uffff"+
		"\1\151\1\uffff\1\155\1\143\1\156\2\172\1\156\1\160\1\164\1\144\1\167\1"+
		"\156\1\162\1\154\1\141\1\157\1\143\1\172\1\uffff\1\151\1\163\2\172\1\162"+
		"\1\156\1\141\1\171\1\172\1\141\1\147\1\144\1\uffff\3\172\1\143\1\172\1"+
		"\164\1\147\2\uffff\1\144\1\164\1\172\1\145\1\163\1\172\1\162\1\145\1\171"+
		"\1\156\1\172\1\uffff\1\162\1\160\1\uffff\1\171\1\143\1\155\1\160\1\uffff"+
		"\1\155\3\145\1\uffff\2\172\1\163\1\151\1\uffff\1\146\1\172\1\uffff\1\145"+
		"\2\172\1\141\1\uffff\1\145\1\141\1\172\1\154\3\145\3\172\2\uffff\1\172"+
		"\1\157\1\172\1\uffff\1\144\2\uffff\1\154\1\144\1\143\1\uffff\1\165\1\163"+
		"\1\172\1\163\4\uffff\1\156\1\uffff\3\172\1\145\1\144\1\160\1\uffff\1\160"+
		"\1\172\3\uffff\1\172\1\145\2\141\2\uffff\1\172\2\143\1\uffff\2\145\2\172"+
		"\2\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\17\uffff\1\45\1\46\3\uffff"+
		"\1\51\2\uffff\1\62\1\63\1\64\1\65\1\66\1\67\33\uffff\1\50\1\47\55\uffff"+
		"\1\54\1\55\1\56\1\uffff\1\36\21\uffff\1\35\14\uffff\1\53\7\uffff\1\21"+
		"\1\22\13\uffff\1\34\2\uffff\1\52\4\uffff\1\43\4\uffff\1\42\4\uffff\1\31"+
		"\2\uffff\1\26\4\uffff\1\33\12\uffff\1\25\1\60\3\uffff\1\37\1\uffff\1\57"+
		"\1\32\3\uffff\1\61\4\uffff\1\17\1\16\1\20\1\24\1\uffff\1\23\6\uffff\1"+
		"\14\2\uffff\1\30\1\41\1\40\4\uffff\1\27\1\44\3\uffff\1\12\4\uffff\1\13"+
		"\1\15";
	static final String DFA22_specialS =
		"\u0101\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\45\2\uffff\1\45\22\uffff\1\45\1\uffff\1\41\1\46\3\uffff\1\41\1\1\1"+
			"\2\1\3\1\33\1\43\1\33\1\uffff\1\46\1\34\11\35\1\4\1\44\1\5\1\6\1\7\2"+
			"\uffff\4\42\1\37\25\42\1\10\1\uffff\1\11\1\uffff\1\42\1\uffff\1\24\1"+
			"\40\1\12\1\22\1\17\3\42\1\14\2\42\1\25\1\26\1\30\1\23\1\13\1\42\1\27"+
			"\1\15\1\20\1\21\1\16\4\42\1\31\1\uffff\1\32",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50\1\47",
			"\1\52\6\uffff\1\51",
			"\1\54\1\uffff\1\55\2\uffff\1\56\67\uffff\1\53",
			"\1\57\16\uffff\1\60",
			"\1\61",
			"\1\36\1\uffff\1\36\2\uffff\12\65\64\uffff\1\62\7\uffff\1\64\1\uffff"+
			"\1\63",
			"\1\67\20\uffff\1\66",
			"\1\70",
			"\1\71\11\uffff\1\72",
			"\1\73\1\uffff\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\12\35",
			"\1\36\1\uffff\12\35\13\uffff\1\36\37\uffff\1\36\22\uffff\1\102",
			"\1\36\1\uffff\12\35\13\uffff\1\36\37\uffff\1\36",
			"",
			"\1\36\1\uffff\1\36\2\uffff\12\65",
			"\1\106\5\uffff\1\104\11\uffff\1\105",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113\20\uffff\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\122\3\uffff\1\120\1\uffff\1\121",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\127\20\uffff\1\126",
			"\1\130",
			"\1\42\1\uffff\12\65\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\156\1\uffff\1\157\2\uffff\1\160\1\uffff\1\155",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\164",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\166",
			"\1\170\13\uffff\1\167",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d\4\uffff\1\u008e\5\uffff\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"",
			"",
			"",
			"\1\u0098",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u00aa",
			"\1\u00ab",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00b5",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00b7",
			"\1\u00b8",
			"",
			"",
			"\1\u00b9",
			"\1\u00ba",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00bc",
			"\1\u00bd",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u00c4",
			"\1\u00c5",
			"",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00d0",
			"\1\u00d1",
			"",
			"\1\u00d2",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u00d4",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00d7",
			"",
			"\1\u00d8",
			"\1\u00d9",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00e3",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u00e5",
			"",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"",
			"\1\u00e9",
			"\1\u00ea",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00ec",
			"",
			"",
			"",
			"",
			"\1\u00ed",
			"",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"",
			"\1\u00f4",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"",
			"",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00fb",
			"\1\u00fc",
			"",
			"\1\u00fd",
			"\1\u00fe",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | INCLUDE | PACKAGE | SERVICE | VOID | ENUM | TYPEDEF | EXTENDS | STRUCT | UNION | EXCEPTION | DEFERRED | EVENT | ONEWAY | ASYNC | LIST | MAP | SET | THROWS | REQUIRED | OPTIONAL | SENUM | CONST | NAMESPACE | LCURLY | RCURLY | INTEGER | HEX_INTEGER | DOUBLE | TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY | LITERAL | IDENTIFIER | COMMA | SEMICOLON | WS | COMMENT );";
		}
	}

}
