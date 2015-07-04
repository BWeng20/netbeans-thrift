// $ANTLR 3.5.2 Thrift.g 2015-07-04 21:58:32

package bweng.thrift.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ThriftParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS_", "ASYNC", "COMMA", "COMMENT", 
		"CONST", "CPP_INCLUDE_", "CPP_TYPE_", "DEFAULT_NAMESPACE_", "DEFERRED", 
		"DIGIT", "DOCUMENT_", "DOUBLE", "ENTRY_", "ENUM", "EVENT", "EXCEPTION", 
		"EXTENDS", "EXTENDS_", "FIELD_", "FIELD_ID_", "HEX_DIGIT", "HEX_INTEGER", 
		"IDENTIFIER", "INCLUDE", "INTEGER", "LCURLY", "LETTER", "LIST", "LITERAL", 
		"MAP", "METHOD_", "NAMESPACE", "ONEWAY", "OPTIONAL", "PACKAGE", "RCURLY", 
		"REQUIRED", "REQUIREDNESS_", "SEMICOLON", "SENUM", "SERVICE", "SET", "STRUCT", 
		"THROWS", "TYPEDEF", "TYPES_", "TYPE_", "TYPE_BINARY", "TYPE_BOOL", "TYPE_BYTE", 
		"TYPE_DOUBLE", "TYPE_I16", "TYPE_I32", "TYPE_I64", "TYPE_STRING", "UNION", 
		"VOID", "WS", "'('", "')'", "'*'", "':'", "'<'", "'='", "'>'", "'['", 
		"']'", "'cpp_include'", "'cpp_namespace'", "'cpp_type'", "'php_namespace'"
	};
	public static final int EOF=-1;
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
	public static final int T__74=74;
	public static final int ARGS_=4;
	public static final int ASYNC=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int CONST=8;
	public static final int CPP_INCLUDE_=9;
	public static final int CPP_TYPE_=10;
	public static final int DEFAULT_NAMESPACE_=11;
	public static final int DEFERRED=12;
	public static final int DIGIT=13;
	public static final int DOCUMENT_=14;
	public static final int DOUBLE=15;
	public static final int ENTRY_=16;
	public static final int ENUM=17;
	public static final int EVENT=18;
	public static final int EXCEPTION=19;
	public static final int EXTENDS=20;
	public static final int EXTENDS_=21;
	public static final int FIELD_=22;
	public static final int FIELD_ID_=23;
	public static final int HEX_DIGIT=24;
	public static final int HEX_INTEGER=25;
	public static final int IDENTIFIER=26;
	public static final int INCLUDE=27;
	public static final int INTEGER=28;
	public static final int LCURLY=29;
	public static final int LETTER=30;
	public static final int LIST=31;
	public static final int LITERAL=32;
	public static final int MAP=33;
	public static final int METHOD_=34;
	public static final int NAMESPACE=35;
	public static final int ONEWAY=36;
	public static final int OPTIONAL=37;
	public static final int PACKAGE=38;
	public static final int RCURLY=39;
	public static final int REQUIRED=40;
	public static final int REQUIREDNESS_=41;
	public static final int SEMICOLON=42;
	public static final int SENUM=43;
	public static final int SERVICE=44;
	public static final int SET=45;
	public static final int STRUCT=46;
	public static final int THROWS=47;
	public static final int TYPEDEF=48;
	public static final int TYPES_=49;
	public static final int TYPE_=50;
	public static final int TYPE_BINARY=51;
	public static final int TYPE_BOOL=52;
	public static final int TYPE_BYTE=53;
	public static final int TYPE_DOUBLE=54;
	public static final int TYPE_I16=55;
	public static final int TYPE_I32=56;
	public static final int TYPE_I64=57;
	public static final int TYPE_STRING=58;
	public static final int UNION=59;
	public static final int VOID=60;
	public static final int WS=61;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ThriftParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ThriftParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ThriftParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Thrift.g"; }


	public static class document_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "document"
	// Thrift.g:64:1: document : ( header )* ( definition )* EOF -> ^( DOCUMENT_ ( header )* ( definition )* ) ;
	public final ThriftParser.document_return document() throws RecognitionException {
		ThriftParser.document_return retval = new ThriftParser.document_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope header1 =null;
		ParserRuleReturnScope definition2 =null;

		CommonTree EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_header=new RewriteRuleSubtreeStream(adaptor,"rule header");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// Thrift.g:65:5: ( ( header )* ( definition )* EOF -> ^( DOCUMENT_ ( header )* ( definition )* ) )
			// Thrift.g:65:7: ( header )* ( definition )* EOF
			{
			// Thrift.g:65:7: ( header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE||LA1_0==NAMESPACE||(LA1_0 >= 71 && LA1_0 <= 72)||LA1_0==74) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Thrift.g:65:7: header
					{
					pushFollow(FOLLOW_header_in_document388);
					header1=header();
					state._fsp--;

					stream_header.add(header1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// Thrift.g:65:15: ( definition )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONST||LA2_0==ENUM||LA2_0==EXCEPTION||LA2_0==PACKAGE||(LA2_0 >= SENUM && LA2_0 <= SERVICE)||LA2_0==STRUCT||LA2_0==TYPEDEF||LA2_0==UNION) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Thrift.g:65:15: definition
					{
					pushFollow(FOLLOW_definition_in_document391);
					definition2=definition();
					state._fsp--;

					stream_definition.add(definition2.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_document394);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: header, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 65:31: -> ^( DOCUMENT_ ( header )* ( definition )* )
			{
				// Thrift.g:65:34: ^( DOCUMENT_ ( header )* ( definition )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOCUMENT_, "DOCUMENT_"), root_1);
				// Thrift.g:65:46: ( header )*
				while ( stream_header.hasNext() ) {
					adaptor.addChild(root_1, stream_header.nextTree());
				}
				stream_header.reset();

				// Thrift.g:65:54: ( definition )*
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_1, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "document"


	public static class header_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "header"
	// Thrift.g:69:1: header : ( include | namespace | cpp_include );
	public final ThriftParser.header_return header() throws RecognitionException {
		ThriftParser.header_return retval = new ThriftParser.header_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope include4 =null;
		ParserRuleReturnScope namespace5 =null;
		ParserRuleReturnScope cpp_include6 =null;


		try {
			// Thrift.g:70:5: ( include | namespace | cpp_include )
			int alt3=3;
			switch ( input.LA(1) ) {
			case INCLUDE:
				{
				alt3=1;
				}
				break;
			case NAMESPACE:
			case 72:
			case 74:
				{
				alt3=2;
				}
				break;
			case 71:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Thrift.g:70:7: include
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_include_in_header424);
					include4=include();
					state._fsp--;

					adaptor.addChild(root_0, include4.getTree());

					}
					break;
				case 2 :
					// Thrift.g:70:17: namespace
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_namespace_in_header428);
					namespace5=namespace();
					state._fsp--;

					adaptor.addChild(root_0, namespace5.getTree());

					}
					break;
				case 3 :
					// Thrift.g:70:29: cpp_include
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cpp_include_in_header432);
					cpp_include6=cpp_include();
					state._fsp--;

					adaptor.addChild(root_0, cpp_include6.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "header"


	public static class include_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "include"
	// Thrift.g:73:1: include : INCLUDE LITERAL -> ^( INCLUDE LITERAL ) ;
	public final ThriftParser.include_return include() throws RecognitionException {
		ThriftParser.include_return retval = new ThriftParser.include_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INCLUDE7=null;
		Token LITERAL8=null;

		CommonTree INCLUDE7_tree=null;
		CommonTree LITERAL8_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_INCLUDE=new RewriteRuleTokenStream(adaptor,"token INCLUDE");

		try {
			// Thrift.g:74:5: ( INCLUDE LITERAL -> ^( INCLUDE LITERAL ) )
			// Thrift.g:74:7: INCLUDE LITERAL
			{
			INCLUDE7=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include449);  
			stream_INCLUDE.add(INCLUDE7);

			LITERAL8=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_include451);  
			stream_LITERAL.add(LITERAL8);

			// AST REWRITE
			// elements: INCLUDE, LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 74:23: -> ^( INCLUDE LITERAL )
			{
				// Thrift.g:74:26: ^( INCLUDE LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INCLUDE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "include"


	public static class dpackage_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dpackage"
	// Thrift.g:77:1: dpackage : PACKAGE k= IDENTIFIER LCURLY ( definition )* RCURLY -> ^( PACKAGE $k ( definition )* ) ;
	public final ThriftParser.dpackage_return dpackage() throws RecognitionException {
		ThriftParser.dpackage_return retval = new ThriftParser.dpackage_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token k=null;
		Token PACKAGE9=null;
		Token LCURLY10=null;
		Token RCURLY12=null;
		ParserRuleReturnScope definition11 =null;

		CommonTree k_tree=null;
		CommonTree PACKAGE9_tree=null;
		CommonTree LCURLY10_tree=null;
		CommonTree RCURLY12_tree=null;
		RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// Thrift.g:78:5: ( PACKAGE k= IDENTIFIER LCURLY ( definition )* RCURLY -> ^( PACKAGE $k ( definition )* ) )
			// Thrift.g:78:7: PACKAGE k= IDENTIFIER LCURLY ( definition )* RCURLY
			{
			PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_dpackage476);  
			stream_PACKAGE.add(PACKAGE9);

			k=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dpackage480);  
			stream_IDENTIFIER.add(k);

			LCURLY10=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_dpackage482);  
			stream_LCURLY.add(LCURLY10);

			// Thrift.g:78:35: ( definition )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CONST||LA4_0==ENUM||LA4_0==EXCEPTION||LA4_0==PACKAGE||(LA4_0 >= SENUM && LA4_0 <= SERVICE)||LA4_0==STRUCT||LA4_0==TYPEDEF||LA4_0==UNION) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Thrift.g:78:35: definition
					{
					pushFollow(FOLLOW_definition_in_dpackage484);
					definition11=definition();
					state._fsp--;

					stream_definition.add(definition11.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			RCURLY12=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_dpackage487);  
			stream_RCURLY.add(RCURLY12);

			// AST REWRITE
			// elements: definition, PACKAGE, k
			// token labels: k
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 78:54: -> ^( PACKAGE $k ( definition )* )
			{
				// Thrift.g:78:57: ^( PACKAGE $k ( definition )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_k.nextNode());
				// Thrift.g:78:70: ( definition )*
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_1, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dpackage"


	public static class namespace_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "namespace"
	// Thrift.g:81:1: namespace : ( NAMESPACE '*' (v= IDENTIFIER |v= LITERAL ) -> ^( DEFAULT_NAMESPACE_ $v) | NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) -> ^( NAMESPACE $k $v) | 'cpp_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER ) | 'php_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER ) );
	public final ThriftParser.namespace_return namespace() throws RecognitionException {
		ThriftParser.namespace_return retval = new ThriftParser.namespace_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token v=null;
		Token k=null;
		Token NAMESPACE13=null;
		Token char_literal14=null;
		Token NAMESPACE15=null;
		Token string_literal16=null;
		Token IDENTIFIER17=null;
		Token string_literal18=null;
		Token IDENTIFIER19=null;

		CommonTree v_tree=null;
		CommonTree k_tree=null;
		CommonTree NAMESPACE13_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree NAMESPACE15_tree=null;
		CommonTree string_literal16_tree=null;
		CommonTree IDENTIFIER17_tree=null;
		CommonTree string_literal18_tree=null;
		CommonTree IDENTIFIER19_tree=null;
		RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");

		try {
			// Thrift.g:82:5: ( NAMESPACE '*' (v= IDENTIFIER |v= LITERAL ) -> ^( DEFAULT_NAMESPACE_ $v) | NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) -> ^( NAMESPACE $k $v) | 'cpp_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER ) | 'php_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER ) )
			int alt7=4;
			switch ( input.LA(1) ) {
			case NAMESPACE:
				{
				int LA7_1 = input.LA(2);
				if ( (LA7_1==64) ) {
					alt7=1;
				}
				else if ( (LA7_1==IDENTIFIER) ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 72:
				{
				alt7=3;
				}
				break;
			case 74:
				{
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Thrift.g:82:7: NAMESPACE '*' (v= IDENTIFIER |v= LITERAL )
					{
					NAMESPACE13=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace517);  
					stream_NAMESPACE.add(NAMESPACE13);

					char_literal14=(Token)match(input,64,FOLLOW_64_in_namespace519);  
					stream_64.add(char_literal14);

					// Thrift.g:82:21: (v= IDENTIFIER |v= LITERAL )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDENTIFIER) ) {
						alt5=1;
					}
					else if ( (LA5_0==LITERAL) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// Thrift.g:82:22: v= IDENTIFIER
							{
							v=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace524);  
							stream_IDENTIFIER.add(v);

							}
							break;
						case 2 :
							// Thrift.g:82:37: v= LITERAL
							{
							v=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_namespace530);  
							stream_LITERAL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 82:48: -> ^( DEFAULT_NAMESPACE_ $v)
					{
						// Thrift.g:82:51: ^( DEFAULT_NAMESPACE_ $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFAULT_NAMESPACE_, "DEFAULT_NAMESPACE_"), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Thrift.g:83:7: NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL )
					{
					NAMESPACE15=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace548);  
					stream_NAMESPACE.add(NAMESPACE15);

					k=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace552);  
					stream_IDENTIFIER.add(k);

					// Thrift.g:83:30: (v= IDENTIFIER |v= LITERAL )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==IDENTIFIER) ) {
						alt6=1;
					}
					else if ( (LA6_0==LITERAL) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// Thrift.g:83:31: v= IDENTIFIER
							{
							v=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace557);  
							stream_IDENTIFIER.add(v);

							}
							break;
						case 2 :
							// Thrift.g:83:46: v= LITERAL
							{
							v=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_namespace563);  
							stream_LITERAL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v, NAMESPACE, k
					// token labels: v, k
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 83:57: -> ^( NAMESPACE $k $v)
					{
						// Thrift.g:83:60: ^( NAMESPACE $k $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NAMESPACE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_k.nextNode());
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Thrift.g:84:7: 'cpp_namespace' IDENTIFIER
					{
					string_literal16=(Token)match(input,72,FOLLOW_72_in_namespace584);  
					stream_72.add(string_literal16);

					IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace586);  
					stream_IDENTIFIER.add(IDENTIFIER17);

					// AST REWRITE
					// elements: IDENTIFIER, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 84:34: -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER )
					{
						// Thrift.g:84:37: ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, "cpp"));
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Thrift.g:85:7: 'php_namespace' IDENTIFIER
					{
					string_literal18=(Token)match(input,74,FOLLOW_74_in_namespace605);  
					stream_74.add(string_literal18);

					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace607);  
					stream_IDENTIFIER.add(IDENTIFIER19);

					// AST REWRITE
					// elements: IDENTIFIER, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 85:34: -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER )
					{
						// Thrift.g:85:37: ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, "php"));
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespace"


	public static class cpp_include_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cpp_include"
	// Thrift.g:88:1: cpp_include : 'cpp_include' LITERAL -> ^( CPP_INCLUDE_ LITERAL ) ;
	public final ThriftParser.cpp_include_return cpp_include() throws RecognitionException {
		ThriftParser.cpp_include_return retval = new ThriftParser.cpp_include_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal20=null;
		Token LITERAL21=null;

		CommonTree string_literal20_tree=null;
		CommonTree LITERAL21_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

		try {
			// Thrift.g:89:5: ( 'cpp_include' LITERAL -> ^( CPP_INCLUDE_ LITERAL ) )
			// Thrift.g:89:7: 'cpp_include' LITERAL
			{
			string_literal20=(Token)match(input,71,FOLLOW_71_in_cpp_include635);  
			stream_71.add(string_literal20);

			LITERAL21=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_include637);  
			stream_LITERAL.add(LITERAL21);

			// AST REWRITE
			// elements: LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 89:29: -> ^( CPP_INCLUDE_ LITERAL )
			{
				// Thrift.g:89:32: ^( CPP_INCLUDE_ LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CPP_INCLUDE_, "CPP_INCLUDE_"), root_1);
				adaptor.addChild(root_1, stream_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cpp_include"


	public static class definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// Thrift.g:93:1: definition : ( dpackage | const_rule | typedef | enum_rule | senum | struct | union | exception | service );
	public final ThriftParser.definition_return definition() throws RecognitionException {
		ThriftParser.definition_return retval = new ThriftParser.definition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope dpackage22 =null;
		ParserRuleReturnScope const_rule23 =null;
		ParserRuleReturnScope typedef24 =null;
		ParserRuleReturnScope enum_rule25 =null;
		ParserRuleReturnScope senum26 =null;
		ParserRuleReturnScope struct27 =null;
		ParserRuleReturnScope union28 =null;
		ParserRuleReturnScope exception29 =null;
		ParserRuleReturnScope service30 =null;


		try {
			// Thrift.g:94:5: ( dpackage | const_rule | typedef | enum_rule | senum | struct | union | exception | service )
			int alt8=9;
			switch ( input.LA(1) ) {
			case PACKAGE:
				{
				alt8=1;
				}
				break;
			case CONST:
				{
				alt8=2;
				}
				break;
			case TYPEDEF:
				{
				alt8=3;
				}
				break;
			case ENUM:
				{
				alt8=4;
				}
				break;
			case SENUM:
				{
				alt8=5;
				}
				break;
			case STRUCT:
				{
				alt8=6;
				}
				break;
			case UNION:
				{
				alt8=7;
				}
				break;
			case EXCEPTION:
				{
				alt8=8;
				}
				break;
			case SERVICE:
				{
				alt8=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Thrift.g:94:7: dpackage
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_dpackage_in_definition663);
					dpackage22=dpackage();
					state._fsp--;

					adaptor.addChild(root_0, dpackage22.getTree());

					}
					break;
				case 2 :
					// Thrift.g:94:18: const_rule
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_const_rule_in_definition667);
					const_rule23=const_rule();
					state._fsp--;

					adaptor.addChild(root_0, const_rule23.getTree());

					}
					break;
				case 3 :
					// Thrift.g:94:31: typedef
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typedef_in_definition671);
					typedef24=typedef();
					state._fsp--;

					adaptor.addChild(root_0, typedef24.getTree());

					}
					break;
				case 4 :
					// Thrift.g:94:41: enum_rule
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_enum_rule_in_definition675);
					enum_rule25=enum_rule();
					state._fsp--;

					adaptor.addChild(root_0, enum_rule25.getTree());

					}
					break;
				case 5 :
					// Thrift.g:94:53: senum
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_senum_in_definition679);
					senum26=senum();
					state._fsp--;

					adaptor.addChild(root_0, senum26.getTree());

					}
					break;
				case 6 :
					// Thrift.g:94:61: struct
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_struct_in_definition683);
					struct27=struct();
					state._fsp--;

					adaptor.addChild(root_0, struct27.getTree());

					}
					break;
				case 7 :
					// Thrift.g:94:70: union
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_in_definition687);
					union28=union();
					state._fsp--;

					adaptor.addChild(root_0, union28.getTree());

					}
					break;
				case 8 :
					// Thrift.g:94:78: exception
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_exception_in_definition691);
					exception29=exception();
					state._fsp--;

					adaptor.addChild(root_0, exception29.getTree());

					}
					break;
				case 9 :
					// Thrift.g:94:90: service
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_service_in_definition695);
					service30=service();
					state._fsp--;

					adaptor.addChild(root_0, service30.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class const_rule_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_rule"
	// Thrift.g:97:1: const_rule : CONST field_type IDENTIFIER '=' const_value ( list_separator )? -> ^( CONST IDENTIFIER field_type const_value ) ;
	public final ThriftParser.const_rule_return const_rule() throws RecognitionException {
		ThriftParser.const_rule_return retval = new ThriftParser.const_rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CONST31=null;
		Token IDENTIFIER33=null;
		Token char_literal34=null;
		ParserRuleReturnScope field_type32 =null;
		ParserRuleReturnScope const_value35 =null;
		ParserRuleReturnScope list_separator36 =null;

		CommonTree CONST31_tree=null;
		CommonTree IDENTIFIER33_tree=null;
		CommonTree char_literal34_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:98:5: ( CONST field_type IDENTIFIER '=' const_value ( list_separator )? -> ^( CONST IDENTIFIER field_type const_value ) )
			// Thrift.g:98:7: CONST field_type IDENTIFIER '=' const_value ( list_separator )?
			{
			CONST31=(Token)match(input,CONST,FOLLOW_CONST_in_const_rule712);  
			stream_CONST.add(CONST31);

			pushFollow(FOLLOW_field_type_in_const_rule714);
			field_type32=field_type();
			state._fsp--;

			stream_field_type.add(field_type32.getTree());
			IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_rule716);  
			stream_IDENTIFIER.add(IDENTIFIER33);

			char_literal34=(Token)match(input,67,FOLLOW_67_in_const_rule718);  
			stream_67.add(char_literal34);

			pushFollow(FOLLOW_const_value_in_const_rule720);
			const_value35=const_value();
			state._fsp--;

			stream_const_value.add(const_value35.getTree());
			// Thrift.g:98:51: ( list_separator )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==COMMA||LA9_0==SEMICOLON) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Thrift.g:98:51: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_const_rule722);
					list_separator36=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator36.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, field_type, CONST, const_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 99:9: -> ^( CONST IDENTIFIER field_type const_value )
			{
				// Thrift.g:99:12: ^( CONST IDENTIFIER field_type const_value )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_1, stream_const_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_rule"


	public static class typedef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typedef"
	// Thrift.g:102:1: typedef : TYPEDEF field_type IDENTIFIER -> ^( TYPEDEF IDENTIFIER field_type ) ;
	public final ThriftParser.typedef_return typedef() throws RecognitionException {
		ThriftParser.typedef_return retval = new ThriftParser.typedef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TYPEDEF37=null;
		Token IDENTIFIER39=null;
		ParserRuleReturnScope field_type38 =null;

		CommonTree TYPEDEF37_tree=null;
		CommonTree IDENTIFIER39_tree=null;
		RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:103:5: ( TYPEDEF field_type IDENTIFIER -> ^( TYPEDEF IDENTIFIER field_type ) )
			// Thrift.g:103:7: TYPEDEF field_type IDENTIFIER
			{
			TYPEDEF37=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef760);  
			stream_TYPEDEF.add(TYPEDEF37);

			pushFollow(FOLLOW_field_type_in_typedef762);
			field_type38=field_type();
			state._fsp--;

			stream_field_type.add(field_type38.getTree());
			IDENTIFIER39=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedef764);  
			stream_IDENTIFIER.add(IDENTIFIER39);

			// AST REWRITE
			// elements: field_type, TYPEDEF, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 103:37: -> ^( TYPEDEF IDENTIFIER field_type )
			{
				// Thrift.g:103:40: ^( TYPEDEF IDENTIFIER field_type )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPEDEF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedef"


	public static class enum_rule_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_rule"
	// Thrift.g:106:1: enum_rule : ENUM IDENTIFIER LCURLY ( enum_field )* RCURLY -> ^( ENUM IDENTIFIER ( enum_field )* ) ;
	public final ThriftParser.enum_rule_return enum_rule() throws RecognitionException {
		ThriftParser.enum_rule_return retval = new ThriftParser.enum_rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ENUM40=null;
		Token IDENTIFIER41=null;
		Token LCURLY42=null;
		Token RCURLY44=null;
		ParserRuleReturnScope enum_field43 =null;

		CommonTree ENUM40_tree=null;
		CommonTree IDENTIFIER41_tree=null;
		CommonTree LCURLY42_tree=null;
		CommonTree RCURLY44_tree=null;
		RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_enum_field=new RewriteRuleSubtreeStream(adaptor,"rule enum_field");

		try {
			// Thrift.g:107:5: ( ENUM IDENTIFIER LCURLY ( enum_field )* RCURLY -> ^( ENUM IDENTIFIER ( enum_field )* ) )
			// Thrift.g:107:7: ENUM IDENTIFIER LCURLY ( enum_field )* RCURLY
			{
			ENUM40=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_rule791);  
			stream_ENUM.add(ENUM40);

			IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_rule793);  
			stream_IDENTIFIER.add(IDENTIFIER41);

			LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_enum_rule795);  
			stream_LCURLY.add(LCURLY42);

			// Thrift.g:107:30: ( enum_field )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENTIFIER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Thrift.g:107:30: enum_field
					{
					pushFollow(FOLLOW_enum_field_in_enum_rule797);
					enum_field43=enum_field();
					state._fsp--;

					stream_enum_field.add(enum_field43.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_enum_rule800);  
			stream_RCURLY.add(RCURLY44);

			// AST REWRITE
			// elements: enum_field, ENUM, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 107:49: -> ^( ENUM IDENTIFIER ( enum_field )* )
			{
				// Thrift.g:107:52: ^( ENUM IDENTIFIER ( enum_field )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:107:70: ( enum_field )*
				while ( stream_enum_field.hasNext() ) {
					adaptor.addChild(root_1, stream_enum_field.nextTree());
				}
				stream_enum_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_rule"


	public static class enum_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_field"
	// Thrift.g:110:1: enum_field : IDENTIFIER ( '=' integer )? ( list_separator )? -> ^( IDENTIFIER ( integer )? ) ;
	public final ThriftParser.enum_field_return enum_field() throws RecognitionException {
		ThriftParser.enum_field_return retval = new ThriftParser.enum_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER45=null;
		Token char_literal46=null;
		ParserRuleReturnScope integer47 =null;
		ParserRuleReturnScope list_separator48 =null;

		CommonTree IDENTIFIER45_tree=null;
		CommonTree char_literal46_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");

		try {
			// Thrift.g:111:5: ( IDENTIFIER ( '=' integer )? ( list_separator )? -> ^( IDENTIFIER ( integer )? ) )
			// Thrift.g:111:7: IDENTIFIER ( '=' integer )? ( list_separator )?
			{
			IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_field828);  
			stream_IDENTIFIER.add(IDENTIFIER45);

			// Thrift.g:111:18: ( '=' integer )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==67) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Thrift.g:111:19: '=' integer
					{
					char_literal46=(Token)match(input,67,FOLLOW_67_in_enum_field831);  
					stream_67.add(char_literal46);

					pushFollow(FOLLOW_integer_in_enum_field833);
					integer47=integer();
					state._fsp--;

					stream_integer.add(integer47.getTree());
					}
					break;

			}

			// Thrift.g:111:33: ( list_separator )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA||LA12_0==SEMICOLON) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Thrift.g:111:33: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_enum_field837);
					list_separator48=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator48.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, integer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 111:49: -> ^( IDENTIFIER ( integer )? )
			{
				// Thrift.g:111:52: ^( IDENTIFIER ( integer )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
				// Thrift.g:111:65: ( integer )?
				if ( stream_integer.hasNext() ) {
					adaptor.addChild(root_1, stream_integer.nextTree());
				}
				stream_integer.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_field"


	public static class senum_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "senum"
	// Thrift.g:114:1: senum : SENUM IDENTIFIER LCURLY ( LITERAL ( list_separator )? )* RCURLY -> ^( SENUM IDENTIFIER ( LITERAL )* ) ;
	public final ThriftParser.senum_return senum() throws RecognitionException {
		ThriftParser.senum_return retval = new ThriftParser.senum_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SENUM49=null;
		Token IDENTIFIER50=null;
		Token LCURLY51=null;
		Token LITERAL52=null;
		Token RCURLY54=null;
		ParserRuleReturnScope list_separator53 =null;

		CommonTree SENUM49_tree=null;
		CommonTree IDENTIFIER50_tree=null;
		CommonTree LCURLY51_tree=null;
		CommonTree LITERAL52_tree=null;
		CommonTree RCURLY54_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_SENUM=new RewriteRuleTokenStream(adaptor,"token SENUM");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");

		try {
			// Thrift.g:115:5: ( SENUM IDENTIFIER LCURLY ( LITERAL ( list_separator )? )* RCURLY -> ^( SENUM IDENTIFIER ( LITERAL )* ) )
			// Thrift.g:115:7: SENUM IDENTIFIER LCURLY ( LITERAL ( list_separator )? )* RCURLY
			{
			SENUM49=(Token)match(input,SENUM,FOLLOW_SENUM_in_senum864);  
			stream_SENUM.add(SENUM49);

			IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_senum866);  
			stream_IDENTIFIER.add(IDENTIFIER50);

			LCURLY51=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_senum868);  
			stream_LCURLY.add(LCURLY51);

			// Thrift.g:115:31: ( LITERAL ( list_separator )? )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==LITERAL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Thrift.g:115:32: LITERAL ( list_separator )?
					{
					LITERAL52=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_senum871);  
					stream_LITERAL.add(LITERAL52);

					// Thrift.g:115:40: ( list_separator )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==COMMA||LA13_0==SEMICOLON) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// Thrift.g:115:40: list_separator
							{
							pushFollow(FOLLOW_list_separator_in_senum873);
							list_separator53=list_separator();
							state._fsp--;

							stream_list_separator.add(list_separator53.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop14;
				}
			}

			RCURLY54=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_senum878);  
			stream_RCURLY.add(RCURLY54);

			// AST REWRITE
			// elements: LITERAL, IDENTIFIER, SENUM
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 115:65: -> ^( SENUM IDENTIFIER ( LITERAL )* )
			{
				// Thrift.g:115:68: ^( SENUM IDENTIFIER ( LITERAL )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SENUM.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:115:87: ( LITERAL )*
				while ( stream_LITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_LITERAL.nextNode());
				}
				stream_LITERAL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "senum"


	public static class struct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "struct"
	// Thrift.g:118:1: struct : STRUCT IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? ) ;
	public final ThriftParser.struct_return struct() throws RecognitionException {
		ThriftParser.struct_return retval = new ThriftParser.struct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STRUCT55=null;
		Token IDENTIFIER56=null;
		Token LCURLY57=null;
		Token RCURLY59=null;
		ParserRuleReturnScope field58 =null;
		ParserRuleReturnScope type_annotations60 =null;

		CommonTree STRUCT55_tree=null;
		CommonTree IDENTIFIER56_tree=null;
		CommonTree LCURLY57_tree=null;
		CommonTree RCURLY59_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// Thrift.g:119:5: ( STRUCT IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? ) )
			// Thrift.g:119:7: STRUCT IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )?
			{
			STRUCT55=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct906);  
			stream_STRUCT.add(STRUCT55);

			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct908);  
			stream_IDENTIFIER.add(IDENTIFIER56);

			LCURLY57=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_struct910);  
			stream_LCURLY.add(LCURLY57);

			// Thrift.g:119:32: ( field )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= HEX_INTEGER && LA15_0 <= IDENTIFIER)||LA15_0==INTEGER||LA15_0==LIST||LA15_0==MAP||LA15_0==OPTIONAL||LA15_0==REQUIRED||LA15_0==SET||(LA15_0 >= TYPE_BINARY && LA15_0 <= TYPE_STRING)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// Thrift.g:119:32: field
					{
					pushFollow(FOLLOW_field_in_struct912);
					field58=field();
					state._fsp--;

					stream_field.add(field58.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			RCURLY59=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_struct915);  
			stream_RCURLY.add(RCURLY59);

			// Thrift.g:119:46: ( type_annotations )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==62) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Thrift.g:119:46: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_struct917);
					type_annotations60=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations60.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field, type_annotations, STRUCT, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 119:64: -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? )
			{
				// Thrift.g:119:67: ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_STRUCT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:119:87: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// Thrift.g:119:94: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "struct"


	public static class union_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "union"
	// Thrift.g:122:1: union : UNION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? ) ;
	public final ThriftParser.union_return union() throws RecognitionException {
		ThriftParser.union_return retval = new ThriftParser.union_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNION61=null;
		Token IDENTIFIER62=null;
		Token LCURLY63=null;
		Token RCURLY65=null;
		ParserRuleReturnScope field64 =null;
		ParserRuleReturnScope type_annotations66 =null;

		CommonTree UNION61_tree=null;
		CommonTree IDENTIFIER62_tree=null;
		CommonTree LCURLY63_tree=null;
		CommonTree RCURLY65_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// Thrift.g:123:5: ( UNION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? ) )
			// Thrift.g:123:7: UNION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )?
			{
			UNION61=(Token)match(input,UNION,FOLLOW_UNION_in_union949);  
			stream_UNION.add(UNION61);

			IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_union951);  
			stream_IDENTIFIER.add(IDENTIFIER62);

			LCURLY63=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_union953);  
			stream_LCURLY.add(LCURLY63);

			// Thrift.g:123:31: ( field )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= HEX_INTEGER && LA17_0 <= IDENTIFIER)||LA17_0==INTEGER||LA17_0==LIST||LA17_0==MAP||LA17_0==OPTIONAL||LA17_0==REQUIRED||LA17_0==SET||(LA17_0 >= TYPE_BINARY && LA17_0 <= TYPE_STRING)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Thrift.g:123:31: field
					{
					pushFollow(FOLLOW_field_in_union955);
					field64=field();
					state._fsp--;

					stream_field.add(field64.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			RCURLY65=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_union958);  
			stream_RCURLY.add(RCURLY65);

			// Thrift.g:123:45: ( type_annotations )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==62) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Thrift.g:123:45: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_union960);
					type_annotations66=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations66.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field, UNION, IDENTIFIER, type_annotations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 123:63: -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? )
			{
				// Thrift.g:123:66: ^( UNION IDENTIFIER ( field )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_UNION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:123:85: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// Thrift.g:123:92: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "union"


	public static class exception_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exception"
	// Thrift.g:126:1: exception : EXCEPTION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? ) ;
	public final ThriftParser.exception_return exception() throws RecognitionException {
		ThriftParser.exception_return retval = new ThriftParser.exception_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EXCEPTION67=null;
		Token IDENTIFIER68=null;
		Token LCURLY69=null;
		Token RCURLY71=null;
		ParserRuleReturnScope field70 =null;
		ParserRuleReturnScope type_annotations72 =null;

		CommonTree EXCEPTION67_tree=null;
		CommonTree IDENTIFIER68_tree=null;
		CommonTree LCURLY69_tree=null;
		CommonTree RCURLY71_tree=null;
		RewriteRuleTokenStream stream_EXCEPTION=new RewriteRuleTokenStream(adaptor,"token EXCEPTION");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// Thrift.g:127:5: ( EXCEPTION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? ) )
			// Thrift.g:127:7: EXCEPTION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )?
			{
			EXCEPTION67=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception992);  
			stream_EXCEPTION.add(EXCEPTION67);

			IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exception994);  
			stream_IDENTIFIER.add(IDENTIFIER68);

			LCURLY69=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_exception996);  
			stream_LCURLY.add(LCURLY69);

			// Thrift.g:127:35: ( field )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= HEX_INTEGER && LA19_0 <= IDENTIFIER)||LA19_0==INTEGER||LA19_0==LIST||LA19_0==MAP||LA19_0==OPTIONAL||LA19_0==REQUIRED||LA19_0==SET||(LA19_0 >= TYPE_BINARY && LA19_0 <= TYPE_STRING)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Thrift.g:127:35: field
					{
					pushFollow(FOLLOW_field_in_exception998);
					field70=field();
					state._fsp--;

					stream_field.add(field70.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			RCURLY71=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_exception1001);  
			stream_RCURLY.add(RCURLY71);

			// Thrift.g:127:49: ( type_annotations )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==62) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Thrift.g:127:49: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_exception1003);
					type_annotations72=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations72.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field, type_annotations, IDENTIFIER, EXCEPTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 127:67: -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? )
			{
				// Thrift.g:127:70: ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_EXCEPTION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:127:93: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// Thrift.g:127:100: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exception"


	public static class service_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "service"
	// Thrift.g:130:1: service : SERVICE s= IDENTIFIER ( EXTENDS e= IDENTIFIER )? LCURLY (f= function )* RCURLY ( type_annotations )? -> ^( SERVICE $s ^( EXTENDS_ ( $e)? ) ( function )* ( type_annotations )? ) ;
	public final ThriftParser.service_return service() throws RecognitionException {
		ThriftParser.service_return retval = new ThriftParser.service_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token s=null;
		Token e=null;
		Token SERVICE73=null;
		Token EXTENDS74=null;
		Token LCURLY75=null;
		Token RCURLY76=null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope type_annotations77 =null;

		CommonTree s_tree=null;
		CommonTree e_tree=null;
		CommonTree SERVICE73_tree=null;
		CommonTree EXTENDS74_tree=null;
		CommonTree LCURLY75_tree=null;
		CommonTree RCURLY76_tree=null;
		RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_SERVICE=new RewriteRuleTokenStream(adaptor,"token SERVICE");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// Thrift.g:131:5: ( SERVICE s= IDENTIFIER ( EXTENDS e= IDENTIFIER )? LCURLY (f= function )* RCURLY ( type_annotations )? -> ^( SERVICE $s ^( EXTENDS_ ( $e)? ) ( function )* ( type_annotations )? ) )
			// Thrift.g:131:7: SERVICE s= IDENTIFIER ( EXTENDS e= IDENTIFIER )? LCURLY (f= function )* RCURLY ( type_annotations )?
			{
			SERVICE73=(Token)match(input,SERVICE,FOLLOW_SERVICE_in_service1035);  
			stream_SERVICE.add(SERVICE73);

			s=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service1039);  
			stream_IDENTIFIER.add(s);

			// Thrift.g:131:28: ( EXTENDS e= IDENTIFIER )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EXTENDS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Thrift.g:131:29: EXTENDS e= IDENTIFIER
					{
					EXTENDS74=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_service1042);  
					stream_EXTENDS.add(EXTENDS74);

					e=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service1046);  
					stream_IDENTIFIER.add(e);

					}
					break;

			}

			LCURLY75=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_service1050);  
			stream_LCURLY.add(LCURLY75);

			// Thrift.g:131:60: (f= function )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ASYNC||LA22_0==DEFERRED||LA22_0==EVENT||LA22_0==IDENTIFIER||LA22_0==LIST||LA22_0==MAP||LA22_0==ONEWAY||LA22_0==SET||(LA22_0 >= TYPE_BINARY && LA22_0 <= TYPE_STRING)||LA22_0==VOID) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Thrift.g:131:60: f= function
					{
					pushFollow(FOLLOW_function_in_service1054);
					f=function();
					state._fsp--;

					stream_function.add(f.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			RCURLY76=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_service1057);  
			stream_RCURLY.add(RCURLY76);

			// Thrift.g:131:78: ( type_annotations )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==62) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Thrift.g:131:78: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_service1059);
					type_annotations77=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations77.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e, s, type_annotations, function, SERVICE
			// token labels: s, e
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_e=new RewriteRuleTokenStream(adaptor,"token e",e);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 131:96: -> ^( SERVICE $s ^( EXTENDS_ ( $e)? ) ( function )* ( type_annotations )? )
			{
				// Thrift.g:131:99: ^( SERVICE $s ^( EXTENDS_ ( $e)? ) ( function )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SERVICE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				// Thrift.g:131:112: ^( EXTENDS_ ( $e)? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDS_, "EXTENDS_"), root_2);
				// Thrift.g:131:124: ( $e)?
				if ( stream_e.hasNext() ) {
					adaptor.addChild(root_2, stream_e.nextNode());
				}
				stream_e.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Thrift.g:131:128: ( function )*
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				// Thrift.g:131:138: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "service"


	public static class field_id_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_id"
	// Thrift.g:135:1: field_id : integer ':' -> ^( FIELD_ID_ integer ) ;
	public final ThriftParser.field_id_return field_id() throws RecognitionException {
		ThriftParser.field_id_return retval = new ThriftParser.field_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal79=null;
		ParserRuleReturnScope integer78 =null;

		CommonTree char_literal79_tree=null;
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");

		try {
			// Thrift.g:136:5: ( integer ':' -> ^( FIELD_ID_ integer ) )
			// Thrift.g:136:7: integer ':'
			{
			pushFollow(FOLLOW_integer_in_field_id1101);
			integer78=integer();
			state._fsp--;

			stream_integer.add(integer78.getTree());
			char_literal79=(Token)match(input,65,FOLLOW_65_in_field_id1103);  
			stream_65.add(char_literal79);

			// AST REWRITE
			// elements: integer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 136:19: -> ^( FIELD_ID_ integer )
			{
				// Thrift.g:136:22: ^( FIELD_ID_ integer )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_ID_, "FIELD_ID_"), root_1);
				adaptor.addChild(root_1, stream_integer.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_id"


	public static class field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field"
	// Thrift.g:139:1: field : ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )? -> ^( FIELD_ IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS_ ( field_req )? ) ( const_value )? ( type_annotations )? ) ;
	public final ThriftParser.field_return field() throws RecognitionException {
		ThriftParser.field_return retval = new ThriftParser.field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER83=null;
		Token char_literal84=null;
		ParserRuleReturnScope field_id80 =null;
		ParserRuleReturnScope field_req81 =null;
		ParserRuleReturnScope field_type82 =null;
		ParserRuleReturnScope const_value85 =null;
		ParserRuleReturnScope type_annotations86 =null;
		ParserRuleReturnScope list_separator87 =null;

		CommonTree IDENTIFIER83_tree=null;
		CommonTree char_literal84_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_field_id=new RewriteRuleSubtreeStream(adaptor,"rule field_id");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");
		RewriteRuleSubtreeStream stream_field_req=new RewriteRuleSubtreeStream(adaptor,"rule field_req");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// Thrift.g:140:5: ( ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )? -> ^( FIELD_ IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS_ ( field_req )? ) ( const_value )? ( type_annotations )? ) )
			// Thrift.g:140:7: ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )?
			{
			// Thrift.g:140:7: ( field_id )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==HEX_INTEGER||LA24_0==INTEGER) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Thrift.g:140:7: field_id
					{
					pushFollow(FOLLOW_field_id_in_field1128);
					field_id80=field_id();
					state._fsp--;

					stream_field_id.add(field_id80.getTree());
					}
					break;

			}

			// Thrift.g:140:17: ( field_req )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==OPTIONAL||LA25_0==REQUIRED) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Thrift.g:140:17: field_req
					{
					pushFollow(FOLLOW_field_req_in_field1131);
					field_req81=field_req();
					state._fsp--;

					stream_field_req.add(field_req81.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field1134);
			field_type82=field_type();
			state._fsp--;

			stream_field_type.add(field_type82.getTree());
			IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field1136);  
			stream_IDENTIFIER.add(IDENTIFIER83);

			// Thrift.g:140:50: ( '=' const_value )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==67) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Thrift.g:140:51: '=' const_value
					{
					char_literal84=(Token)match(input,67,FOLLOW_67_in_field1139);  
					stream_67.add(char_literal84);

					pushFollow(FOLLOW_const_value_in_field1141);
					const_value85=const_value();
					state._fsp--;

					stream_const_value.add(const_value85.getTree());
					}
					break;

			}

			// Thrift.g:140:69: ( type_annotations )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==62) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Thrift.g:140:69: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_field1145);
					type_annotations86=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations86.getTree());
					}
					break;

			}

			// Thrift.g:140:87: ( list_separator )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COMMA||LA28_0==SEMICOLON) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Thrift.g:140:87: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_field1148);
					list_separator87=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator87.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, type_annotations, field_req, const_value, field_id, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 141:9: -> ^( FIELD_ IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS_ ( field_req )? ) ( const_value )? ( type_annotations )? )
			{
				// Thrift.g:141:12: ^( FIELD_ IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS_ ( field_req )? ) ( const_value )? ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_, "FIELD_"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:141:43: ( field_id )?
				if ( stream_field_id.hasNext() ) {
					adaptor.addChild(root_1, stream_field_id.nextTree());
				}
				stream_field_id.reset();

				// Thrift.g:141:53: ^( REQUIREDNESS_ ( field_req )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REQUIREDNESS_, "REQUIREDNESS_"), root_2);
				// Thrift.g:141:69: ( field_req )?
				if ( stream_field_req.hasNext() ) {
					adaptor.addChild(root_2, stream_field_req.nextTree());
				}
				stream_field_req.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Thrift.g:141:81: ( const_value )?
				if ( stream_const_value.hasNext() ) {
					adaptor.addChild(root_1, stream_const_value.nextTree());
				}
				stream_const_value.reset();

				// Thrift.g:141:94: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class field_req_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_req"
	// Thrift.g:144:1: field_req : ( REQUIRED | OPTIONAL );
	public final ThriftParser.field_req_return field_req() throws RecognitionException {
		ThriftParser.field_req_return retval = new ThriftParser.field_req_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set88=null;

		CommonTree set88_tree=null;

		try {
			// Thrift.g:145:5: ( REQUIRED | OPTIONAL )
			// Thrift.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set88=input.LT(1);
			if ( input.LA(1)==OPTIONAL||input.LA(1)==REQUIRED ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_req"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// Thrift.g:150:1: function : ( function_mode )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )? -> ^( METHOD_ IDENTIFIER function_type ^( ARGS_ ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? ) ;
	public final ThriftParser.function_return function() throws RecognitionException {
		ThriftParser.function_return retval = new ThriftParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope function_mode89 =null;
		ParserRuleReturnScope function_type90 =null;
		ParserRuleReturnScope field93 =null;
		ParserRuleReturnScope throws_list95 =null;
		ParserRuleReturnScope type_annotations96 =null;
		ParserRuleReturnScope list_separator97 =null;

		CommonTree IDENTIFIER91_tree=null;
		CommonTree char_literal92_tree=null;
		CommonTree char_literal94_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_throws_list=new RewriteRuleSubtreeStream(adaptor,"rule throws_list");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_function_type=new RewriteRuleSubtreeStream(adaptor,"rule function_type");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");
		RewriteRuleSubtreeStream stream_function_mode=new RewriteRuleSubtreeStream(adaptor,"rule function_mode");

		try {
			// Thrift.g:151:5: ( ( function_mode )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )? -> ^( METHOD_ IDENTIFIER function_type ^( ARGS_ ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? ) )
			// Thrift.g:151:7: ( function_mode )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )?
			{
			// Thrift.g:151:7: ( function_mode )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ASYNC||LA29_0==DEFERRED||LA29_0==EVENT||LA29_0==ONEWAY) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Thrift.g:151:7: function_mode
					{
					pushFollow(FOLLOW_function_mode_in_function1226);
					function_mode89=function_mode();
					state._fsp--;

					stream_function_mode.add(function_mode89.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_function_type_in_function1229);
			function_type90=function_type();
			state._fsp--;

			stream_function_type.add(function_type90.getTree());
			IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function1231);  
			stream_IDENTIFIER.add(IDENTIFIER91);

			char_literal92=(Token)match(input,62,FOLLOW_62_in_function1233);  
			stream_62.add(char_literal92);

			// Thrift.g:151:51: ( field )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= HEX_INTEGER && LA30_0 <= IDENTIFIER)||LA30_0==INTEGER||LA30_0==LIST||LA30_0==MAP||LA30_0==OPTIONAL||LA30_0==REQUIRED||LA30_0==SET||(LA30_0 >= TYPE_BINARY && LA30_0 <= TYPE_STRING)) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Thrift.g:151:51: field
					{
					pushFollow(FOLLOW_field_in_function1235);
					field93=field();
					state._fsp--;

					stream_field.add(field93.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal94=(Token)match(input,63,FOLLOW_63_in_function1238);  
			stream_63.add(char_literal94);

			// Thrift.g:151:62: ( throws_list )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==THROWS) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Thrift.g:151:62: throws_list
					{
					pushFollow(FOLLOW_throws_list_in_function1240);
					throws_list95=throws_list();
					state._fsp--;

					stream_throws_list.add(throws_list95.getTree());
					}
					break;

			}

			// Thrift.g:151:75: ( type_annotations )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==62) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Thrift.g:151:75: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_function1243);
					type_annotations96=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations96.getTree());
					}
					break;

			}

			// Thrift.g:151:93: ( list_separator )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMA||LA33_0==SEMICOLON) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Thrift.g:151:93: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_function1246);
					list_separator97=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator97.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: throws_list, field, function_mode, type_annotations, function_type, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 152:9: -> ^( METHOD_ IDENTIFIER function_type ^( ARGS_ ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? )
			{
				// Thrift.g:152:12: ^( METHOD_ IDENTIFIER function_type ^( ARGS_ ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_, "METHOD_"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_function_type.nextTree());
				// Thrift.g:152:47: ^( ARGS_ ( field )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS_, "ARGS_"), root_2);
				// Thrift.g:152:55: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_2, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Thrift.g:152:63: ( function_mode )?
				if ( stream_function_mode.hasNext() ) {
					adaptor.addChild(root_1, stream_function_mode.nextTree());
				}
				stream_function_mode.reset();

				// Thrift.g:152:78: ( throws_list )?
				if ( stream_throws_list.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_list.nextTree());
				}
				stream_throws_list.reset();

				// Thrift.g:152:91: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class function_mode_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_mode"
	// Thrift.g:155:1: function_mode : ( EVENT | ONEWAY | ASYNC | DEFERRED );
	public final ThriftParser.function_mode_return function_mode() throws RecognitionException {
		ThriftParser.function_mode_return retval = new ThriftParser.function_mode_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set98=null;

		CommonTree set98_tree=null;

		try {
			// Thrift.g:156:5: ( EVENT | ONEWAY | ASYNC | DEFERRED )
			// Thrift.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set98=input.LT(1);
			if ( input.LA(1)==ASYNC||input.LA(1)==DEFERRED||input.LA(1)==EVENT||input.LA(1)==ONEWAY ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set98));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_mode"


	public static class function_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_type"
	// Thrift.g:159:1: function_type : ( field_type | VOID );
	public final ThriftParser.function_type_return function_type() throws RecognitionException {
		ThriftParser.function_type_return retval = new ThriftParser.function_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VOID100=null;
		ParserRuleReturnScope field_type99 =null;

		CommonTree VOID100_tree=null;

		try {
			// Thrift.g:160:5: ( field_type | VOID )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==IDENTIFIER||LA34_0==LIST||LA34_0==MAP||LA34_0==SET||(LA34_0 >= TYPE_BINARY && LA34_0 <= TYPE_STRING)) ) {
				alt34=1;
			}
			else if ( (LA34_0==VOID) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// Thrift.g:160:7: field_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_field_type_in_function_type1328);
					field_type99=field_type();
					state._fsp--;

					adaptor.addChild(root_0, field_type99.getTree());

					}
					break;
				case 2 :
					// Thrift.g:161:7: VOID
					{
					root_0 = (CommonTree)adaptor.nil();


					VOID100=(Token)match(input,VOID,FOLLOW_VOID_in_function_type1336); 
					VOID100_tree = (CommonTree)adaptor.create(VOID100);
					adaptor.addChild(root_0, VOID100_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_type"


	public static class throws_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "throws_list"
	// Thrift.g:164:1: throws_list : THROWS '(' ( field )* ')' -> ^( THROWS ( field )* ) ;
	public final ThriftParser.throws_list_return throws_list() throws RecognitionException {
		ThriftParser.throws_list_return retval = new ThriftParser.throws_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token THROWS101=null;
		Token char_literal102=null;
		Token char_literal104=null;
		ParserRuleReturnScope field103 =null;

		CommonTree THROWS101_tree=null;
		CommonTree char_literal102_tree=null;
		CommonTree char_literal104_tree=null;
		RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");

		try {
			// Thrift.g:165:5: ( THROWS '(' ( field )* ')' -> ^( THROWS ( field )* ) )
			// Thrift.g:165:7: THROWS '(' ( field )* ')'
			{
			THROWS101=(Token)match(input,THROWS,FOLLOW_THROWS_in_throws_list1353);  
			stream_THROWS.add(THROWS101);

			char_literal102=(Token)match(input,62,FOLLOW_62_in_throws_list1355);  
			stream_62.add(char_literal102);

			// Thrift.g:165:18: ( field )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= HEX_INTEGER && LA35_0 <= IDENTIFIER)||LA35_0==INTEGER||LA35_0==LIST||LA35_0==MAP||LA35_0==OPTIONAL||LA35_0==REQUIRED||LA35_0==SET||(LA35_0 >= TYPE_BINARY && LA35_0 <= TYPE_STRING)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Thrift.g:165:18: field
					{
					pushFollow(FOLLOW_field_in_throws_list1357);
					field103=field();
					state._fsp--;

					stream_field.add(field103.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			char_literal104=(Token)match(input,63,FOLLOW_63_in_throws_list1360);  
			stream_63.add(char_literal104);

			// AST REWRITE
			// elements: THROWS, field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 165:29: -> ^( THROWS ( field )* )
			{
				// Thrift.g:165:32: ^( THROWS ( field )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_THROWS.nextNode(), root_1);
				// Thrift.g:165:41: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throws_list"


	public static class type_annotations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_annotations"
	// Thrift.g:169:1: type_annotations : '(' ( type_annotation )* ')' -> ^( TYPES_ ( type_annotation )* ) ;
	public final ThriftParser.type_annotations_return type_annotations() throws RecognitionException {
		ThriftParser.type_annotations_return retval = new ThriftParser.type_annotations_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope type_annotation106 =null;

		CommonTree char_literal105_tree=null;
		CommonTree char_literal107_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_type_annotation=new RewriteRuleSubtreeStream(adaptor,"rule type_annotation");

		try {
			// Thrift.g:170:5: ( '(' ( type_annotation )* ')' -> ^( TYPES_ ( type_annotation )* ) )
			// Thrift.g:170:7: '(' ( type_annotation )* ')'
			{
			char_literal105=(Token)match(input,62,FOLLOW_62_in_type_annotations1387);  
			stream_62.add(char_literal105);

			// Thrift.g:170:11: ( type_annotation )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==IDENTIFIER) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Thrift.g:170:11: type_annotation
					{
					pushFollow(FOLLOW_type_annotation_in_type_annotations1389);
					type_annotation106=type_annotation();
					state._fsp--;

					stream_type_annotation.add(type_annotation106.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			char_literal107=(Token)match(input,63,FOLLOW_63_in_type_annotations1392);  
			stream_63.add(char_literal107);

			// AST REWRITE
			// elements: type_annotation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 170:32: -> ^( TYPES_ ( type_annotation )* )
			{
				// Thrift.g:170:35: ^( TYPES_ ( type_annotation )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPES_, "TYPES_"), root_1);
				// Thrift.g:170:44: ( type_annotation )*
				while ( stream_type_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotation.nextTree());
				}
				stream_type_annotation.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_annotations"


	public static class type_annotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_annotation"
	// Thrift.g:173:1: type_annotation : IDENTIFIER ( '=' annotation_value )? ( list_separator )? -> ^( TYPE_ IDENTIFIER ( annotation_value )? ) ;
	public final ThriftParser.type_annotation_return type_annotation() throws RecognitionException {
		ThriftParser.type_annotation_return retval = new ThriftParser.type_annotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER108=null;
		Token char_literal109=null;
		ParserRuleReturnScope annotation_value110 =null;
		ParserRuleReturnScope list_separator111 =null;

		CommonTree IDENTIFIER108_tree=null;
		CommonTree char_literal109_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_annotation_value=new RewriteRuleSubtreeStream(adaptor,"rule annotation_value");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");

		try {
			// Thrift.g:174:5: ( IDENTIFIER ( '=' annotation_value )? ( list_separator )? -> ^( TYPE_ IDENTIFIER ( annotation_value )? ) )
			// Thrift.g:174:7: IDENTIFIER ( '=' annotation_value )? ( list_separator )?
			{
			IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_annotation1418);  
			stream_IDENTIFIER.add(IDENTIFIER108);

			// Thrift.g:174:18: ( '=' annotation_value )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==67) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Thrift.g:174:19: '=' annotation_value
					{
					char_literal109=(Token)match(input,67,FOLLOW_67_in_type_annotation1421);  
					stream_67.add(char_literal109);

					pushFollow(FOLLOW_annotation_value_in_type_annotation1423);
					annotation_value110=annotation_value();
					state._fsp--;

					stream_annotation_value.add(annotation_value110.getTree());
					}
					break;

			}

			// Thrift.g:174:42: ( list_separator )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==COMMA||LA38_0==SEMICOLON) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Thrift.g:174:42: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_type_annotation1427);
					list_separator111=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator111.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, annotation_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 174:58: -> ^( TYPE_ IDENTIFIER ( annotation_value )? )
			{
				// Thrift.g:174:61: ^( TYPE_ IDENTIFIER ( annotation_value )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_, "TYPE_"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:174:80: ( annotation_value )?
				if ( stream_annotation_value.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation_value.nextTree());
				}
				stream_annotation_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_annotation"


	public static class annotation_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation_value"
	// Thrift.g:177:1: annotation_value : ( integer | LITERAL );
	public final ThriftParser.annotation_value_return annotation_value() throws RecognitionException {
		ThriftParser.annotation_value_return retval = new ThriftParser.annotation_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LITERAL113=null;
		ParserRuleReturnScope integer112 =null;

		CommonTree LITERAL113_tree=null;

		try {
			// Thrift.g:178:5: ( integer | LITERAL )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==HEX_INTEGER||LA39_0==INTEGER) ) {
				alt39=1;
			}
			else if ( (LA39_0==LITERAL) ) {
				alt39=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// Thrift.g:178:7: integer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_in_annotation_value1456);
					integer112=integer();
					state._fsp--;

					adaptor.addChild(root_0, integer112.getTree());

					}
					break;
				case 2 :
					// Thrift.g:178:17: LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LITERAL113=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_annotation_value1460); 
					LITERAL113_tree = (CommonTree)adaptor.create(LITERAL113);
					adaptor.addChild(root_0, LITERAL113_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation_value"


	public static class field_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_type"
	// Thrift.g:182:1: field_type : ( base_type | IDENTIFIER | container_type );
	public final ThriftParser.field_type_return field_type() throws RecognitionException {
		ThriftParser.field_type_return retval = new ThriftParser.field_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER115=null;
		ParserRuleReturnScope base_type114 =null;
		ParserRuleReturnScope container_type116 =null;

		CommonTree IDENTIFIER115_tree=null;

		try {
			// Thrift.g:183:5: ( base_type | IDENTIFIER | container_type )
			int alt40=3;
			switch ( input.LA(1) ) {
			case TYPE_BINARY:
			case TYPE_BOOL:
			case TYPE_BYTE:
			case TYPE_DOUBLE:
			case TYPE_I16:
			case TYPE_I32:
			case TYPE_I64:
			case TYPE_STRING:
				{
				alt40=1;
				}
				break;
			case IDENTIFIER:
				{
				alt40=2;
				}
				break;
			case LIST:
			case MAP:
			case SET:
				{
				alt40=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// Thrift.g:183:7: base_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_field_type1478);
					base_type114=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type114.getTree());

					}
					break;
				case 2 :
					// Thrift.g:183:19: IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENTIFIER115=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_type1482); 
					IDENTIFIER115_tree = (CommonTree)adaptor.create(IDENTIFIER115);
					adaptor.addChild(root_0, IDENTIFIER115_tree);

					}
					break;
				case 3 :
					// Thrift.g:183:32: container_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_container_type_in_field_type1486);
					container_type116=container_type();
					state._fsp--;

					adaptor.addChild(root_0, container_type116.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class base_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "base_type"
	// Thrift.g:186:1: base_type : real_base_type ( type_annotations )? ;
	public final ThriftParser.base_type_return base_type() throws RecognitionException {
		ThriftParser.base_type_return retval = new ThriftParser.base_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope real_base_type117 =null;
		ParserRuleReturnScope type_annotations118 =null;


		try {
			// Thrift.g:187:5: ( real_base_type ( type_annotations )? )
			// Thrift.g:187:7: real_base_type ( type_annotations )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_real_base_type_in_base_type1503);
			real_base_type117=real_base_type();
			state._fsp--;

			adaptor.addChild(root_0, real_base_type117.getTree());

			// Thrift.g:187:22: ( type_annotations )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==62) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Thrift.g:187:22: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_base_type1505);
					type_annotations118=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, type_annotations118.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_type"


	public static class container_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "container_type"
	// Thrift.g:190:1: container_type : ( map_type | set_type | list_type ) ( type_annotations )? ;
	public final ThriftParser.container_type_return container_type() throws RecognitionException {
		ThriftParser.container_type_return retval = new ThriftParser.container_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope map_type119 =null;
		ParserRuleReturnScope set_type120 =null;
		ParserRuleReturnScope list_type121 =null;
		ParserRuleReturnScope type_annotations122 =null;


		try {
			// Thrift.g:191:5: ( ( map_type | set_type | list_type ) ( type_annotations )? )
			// Thrift.g:191:7: ( map_type | set_type | list_type ) ( type_annotations )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// Thrift.g:191:7: ( map_type | set_type | list_type )
			int alt42=3;
			switch ( input.LA(1) ) {
			case MAP:
				{
				alt42=1;
				}
				break;
			case SET:
				{
				alt42=2;
				}
				break;
			case LIST:
				{
				alt42=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// Thrift.g:191:8: map_type
					{
					pushFollow(FOLLOW_map_type_in_container_type1524);
					map_type119=map_type();
					state._fsp--;

					adaptor.addChild(root_0, map_type119.getTree());

					}
					break;
				case 2 :
					// Thrift.g:191:19: set_type
					{
					pushFollow(FOLLOW_set_type_in_container_type1528);
					set_type120=set_type();
					state._fsp--;

					adaptor.addChild(root_0, set_type120.getTree());

					}
					break;
				case 3 :
					// Thrift.g:191:30: list_type
					{
					pushFollow(FOLLOW_list_type_in_container_type1532);
					list_type121=list_type();
					state._fsp--;

					adaptor.addChild(root_0, list_type121.getTree());

					}
					break;

			}

			// Thrift.g:191:41: ( type_annotations )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==62) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Thrift.g:191:41: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_container_type1535);
					type_annotations122=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, type_annotations122.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "container_type"


	public static class map_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "map_type"
	// Thrift.g:194:1: map_type : MAP ( cpp_type )? '<' field_type COMMA field_type '>' -> ^( MAP field_type field_type ( cpp_type )? ) ;
	public final ThriftParser.map_type_return map_type() throws RecognitionException {
		ThriftParser.map_type_return retval = new ThriftParser.map_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MAP123=null;
		Token char_literal125=null;
		Token COMMA127=null;
		Token char_literal129=null;
		ParserRuleReturnScope cpp_type124 =null;
		ParserRuleReturnScope field_type126 =null;
		ParserRuleReturnScope field_type128 =null;

		CommonTree MAP123_tree=null;
		CommonTree char_literal125_tree=null;
		CommonTree COMMA127_tree=null;
		CommonTree char_literal129_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:195:5: ( MAP ( cpp_type )? '<' field_type COMMA field_type '>' -> ^( MAP field_type field_type ( cpp_type )? ) )
			// Thrift.g:195:7: MAP ( cpp_type )? '<' field_type COMMA field_type '>'
			{
			MAP123=(Token)match(input,MAP,FOLLOW_MAP_in_map_type1553);  
			stream_MAP.add(MAP123);

			// Thrift.g:195:11: ( cpp_type )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==73) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Thrift.g:195:11: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_map_type1555);
					cpp_type124=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type124.getTree());
					}
					break;

			}

			char_literal125=(Token)match(input,66,FOLLOW_66_in_map_type1558);  
			stream_66.add(char_literal125);

			pushFollow(FOLLOW_field_type_in_map_type1560);
			field_type126=field_type();
			state._fsp--;

			stream_field_type.add(field_type126.getTree());
			COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_type1562);  
			stream_COMMA.add(COMMA127);

			pushFollow(FOLLOW_field_type_in_map_type1564);
			field_type128=field_type();
			state._fsp--;

			stream_field_type.add(field_type128.getTree());
			char_literal129=(Token)match(input,68,FOLLOW_68_in_map_type1566);  
			stream_68.add(char_literal129);

			// AST REWRITE
			// elements: cpp_type, MAP, field_type, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 195:57: -> ^( MAP field_type field_type ( cpp_type )? )
			{
				// Thrift.g:195:60: ^( MAP field_type field_type ( cpp_type )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_MAP.nextNode(), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:195:88: ( cpp_type )?
				if ( stream_cpp_type.hasNext() ) {
					adaptor.addChild(root_1, stream_cpp_type.nextTree());
				}
				stream_cpp_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "map_type"


	public static class set_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_type"
	// Thrift.g:198:1: set_type : SET ( cpp_type )? '<' field_type '>' -> ^( SET field_type ( cpp_type )? ) ;
	public final ThriftParser.set_type_return set_type() throws RecognitionException {
		ThriftParser.set_type_return retval = new ThriftParser.set_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SET130=null;
		Token char_literal132=null;
		Token char_literal134=null;
		ParserRuleReturnScope cpp_type131 =null;
		ParserRuleReturnScope field_type133 =null;

		CommonTree SET130_tree=null;
		CommonTree char_literal132_tree=null;
		CommonTree char_literal134_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:199:5: ( SET ( cpp_type )? '<' field_type '>' -> ^( SET field_type ( cpp_type )? ) )
			// Thrift.g:199:7: SET ( cpp_type )? '<' field_type '>'
			{
			SET130=(Token)match(input,SET,FOLLOW_SET_in_set_type1596);  
			stream_SET.add(SET130);

			// Thrift.g:199:11: ( cpp_type )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==73) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Thrift.g:199:11: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_set_type1598);
					cpp_type131=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type131.getTree());
					}
					break;

			}

			char_literal132=(Token)match(input,66,FOLLOW_66_in_set_type1601);  
			stream_66.add(char_literal132);

			pushFollow(FOLLOW_field_type_in_set_type1603);
			field_type133=field_type();
			state._fsp--;

			stream_field_type.add(field_type133.getTree());
			char_literal134=(Token)match(input,68,FOLLOW_68_in_set_type1605);  
			stream_68.add(char_literal134);

			// AST REWRITE
			// elements: cpp_type, field_type, SET
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 199:40: -> ^( SET field_type ( cpp_type )? )
			{
				// Thrift.g:199:43: ^( SET field_type ( cpp_type )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:199:60: ( cpp_type )?
				if ( stream_cpp_type.hasNext() ) {
					adaptor.addChild(root_1, stream_cpp_type.nextTree());
				}
				stream_cpp_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_type"


	public static class list_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list_type"
	// Thrift.g:202:1: list_type : LIST '<' field_type '>' ( cpp_type )? -> ^( LIST field_type ( cpp_type )? ) ;
	public final ThriftParser.list_type_return list_type() throws RecognitionException {
		ThriftParser.list_type_return retval = new ThriftParser.list_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LIST135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		ParserRuleReturnScope field_type137 =null;
		ParserRuleReturnScope cpp_type139 =null;

		CommonTree LIST135_tree=null;
		CommonTree char_literal136_tree=null;
		CommonTree char_literal138_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:203:5: ( LIST '<' field_type '>' ( cpp_type )? -> ^( LIST field_type ( cpp_type )? ) )
			// Thrift.g:203:7: LIST '<' field_type '>' ( cpp_type )?
			{
			LIST135=(Token)match(input,LIST,FOLLOW_LIST_in_list_type1633);  
			stream_LIST.add(LIST135);

			char_literal136=(Token)match(input,66,FOLLOW_66_in_list_type1635);  
			stream_66.add(char_literal136);

			pushFollow(FOLLOW_field_type_in_list_type1637);
			field_type137=field_type();
			state._fsp--;

			stream_field_type.add(field_type137.getTree());
			char_literal138=(Token)match(input,68,FOLLOW_68_in_list_type1639);  
			stream_68.add(char_literal138);

			// Thrift.g:203:31: ( cpp_type )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==73) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Thrift.g:203:31: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_list_type1641);
					cpp_type139=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type139.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: LIST, cpp_type, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 203:41: -> ^( LIST field_type ( cpp_type )? )
			{
				// Thrift.g:203:44: ^( LIST field_type ( cpp_type )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST.nextNode(), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:203:62: ( cpp_type )?
				if ( stream_cpp_type.hasNext() ) {
					adaptor.addChild(root_1, stream_cpp_type.nextTree());
				}
				stream_cpp_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_type"


	public static class cpp_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cpp_type"
	// Thrift.g:206:1: cpp_type : 'cpp_type' LITERAL -> ^( CPP_TYPE_ LITERAL ) ;
	public final ThriftParser.cpp_type_return cpp_type() throws RecognitionException {
		ThriftParser.cpp_type_return retval = new ThriftParser.cpp_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal140=null;
		Token LITERAL141=null;

		CommonTree string_literal140_tree=null;
		CommonTree LITERAL141_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

		try {
			// Thrift.g:207:5: ( 'cpp_type' LITERAL -> ^( CPP_TYPE_ LITERAL ) )
			// Thrift.g:207:7: 'cpp_type' LITERAL
			{
			string_literal140=(Token)match(input,73,FOLLOW_73_in_cpp_type1670);  
			stream_73.add(string_literal140);

			LITERAL141=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_type1672);  
			stream_LITERAL.add(LITERAL141);

			// AST REWRITE
			// elements: LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 207:26: -> ^( CPP_TYPE_ LITERAL )
			{
				// Thrift.g:207:29: ^( CPP_TYPE_ LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CPP_TYPE_, "CPP_TYPE_"), root_1);
				adaptor.addChild(root_1, stream_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cpp_type"


	public static class const_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_value"
	// Thrift.g:211:1: const_value : ( integer | DOUBLE | LITERAL | IDENTIFIER | const_list | const_map );
	public final ThriftParser.const_value_return const_value() throws RecognitionException {
		ThriftParser.const_value_return retval = new ThriftParser.const_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOUBLE143=null;
		Token LITERAL144=null;
		Token IDENTIFIER145=null;
		ParserRuleReturnScope integer142 =null;
		ParserRuleReturnScope const_list146 =null;
		ParserRuleReturnScope const_map147 =null;

		CommonTree DOUBLE143_tree=null;
		CommonTree LITERAL144_tree=null;
		CommonTree IDENTIFIER145_tree=null;

		try {
			// Thrift.g:212:5: ( integer | DOUBLE | LITERAL | IDENTIFIER | const_list | const_map )
			int alt47=6;
			switch ( input.LA(1) ) {
			case HEX_INTEGER:
			case INTEGER:
				{
				alt47=1;
				}
				break;
			case DOUBLE:
				{
				alt47=2;
				}
				break;
			case LITERAL:
				{
				alt47=3;
				}
				break;
			case IDENTIFIER:
				{
				alt47=4;
				}
				break;
			case 69:
				{
				alt47=5;
				}
				break;
			case LCURLY:
				{
				alt47=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// Thrift.g:212:7: integer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_in_const_value1698);
					integer142=integer();
					state._fsp--;

					adaptor.addChild(root_0, integer142.getTree());

					}
					break;
				case 2 :
					// Thrift.g:212:17: DOUBLE
					{
					root_0 = (CommonTree)adaptor.nil();


					DOUBLE143=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_const_value1702); 
					DOUBLE143_tree = (CommonTree)adaptor.create(DOUBLE143);
					adaptor.addChild(root_0, DOUBLE143_tree);

					}
					break;
				case 3 :
					// Thrift.g:212:26: LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LITERAL144=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_const_value1706); 
					LITERAL144_tree = (CommonTree)adaptor.create(LITERAL144);
					adaptor.addChild(root_0, LITERAL144_tree);

					}
					break;
				case 4 :
					// Thrift.g:212:36: IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_value1710); 
					IDENTIFIER145_tree = (CommonTree)adaptor.create(IDENTIFIER145);
					adaptor.addChild(root_0, IDENTIFIER145_tree);

					}
					break;
				case 5 :
					// Thrift.g:212:49: const_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_const_list_in_const_value1714);
					const_list146=const_list();
					state._fsp--;

					adaptor.addChild(root_0, const_list146.getTree());

					}
					break;
				case 6 :
					// Thrift.g:212:62: const_map
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_const_map_in_const_value1718);
					const_map147=const_map();
					state._fsp--;

					adaptor.addChild(root_0, const_map147.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_value"


	public static class integer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer"
	// Thrift.g:215:1: integer : ( INTEGER | HEX_INTEGER );
	public final ThriftParser.integer_return integer() throws RecognitionException {
		ThriftParser.integer_return retval = new ThriftParser.integer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set148=null;

		CommonTree set148_tree=null;

		try {
			// Thrift.g:216:5: ( INTEGER | HEX_INTEGER )
			// Thrift.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set148=input.LT(1);
			if ( input.LA(1)==HEX_INTEGER||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set148));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer"


	public static class const_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_list"
	// Thrift.g:233:1: const_list : '[' ( const_value ( list_separator )? )* ']' -> ^( LIST ( const_value )* ) ;
	public final ThriftParser.const_list_return const_list() throws RecognitionException {
		ThriftParser.const_list_return retval = new ThriftParser.const_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal149=null;
		Token char_literal152=null;
		ParserRuleReturnScope const_value150 =null;
		ParserRuleReturnScope list_separator151 =null;

		CommonTree char_literal149_tree=null;
		CommonTree char_literal152_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");

		try {
			// Thrift.g:234:5: ( '[' ( const_value ( list_separator )? )* ']' -> ^( LIST ( const_value )* ) )
			// Thrift.g:234:7: '[' ( const_value ( list_separator )? )* ']'
			{
			char_literal149=(Token)match(input,69,FOLLOW_69_in_const_list1868);  
			stream_69.add(char_literal149);

			// Thrift.g:234:11: ( const_value ( list_separator )? )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==DOUBLE||(LA49_0 >= HEX_INTEGER && LA49_0 <= IDENTIFIER)||(LA49_0 >= INTEGER && LA49_0 <= LCURLY)||LA49_0==LITERAL||LA49_0==69) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Thrift.g:234:12: const_value ( list_separator )?
					{
					pushFollow(FOLLOW_const_value_in_const_list1871);
					const_value150=const_value();
					state._fsp--;

					stream_const_value.add(const_value150.getTree());
					// Thrift.g:234:24: ( list_separator )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==COMMA||LA48_0==SEMICOLON) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// Thrift.g:234:24: list_separator
							{
							pushFollow(FOLLOW_list_separator_in_const_list1873);
							list_separator151=list_separator();
							state._fsp--;

							stream_list_separator.add(list_separator151.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop49;
				}
			}

			char_literal152=(Token)match(input,70,FOLLOW_70_in_const_list1878);  
			stream_70.add(char_literal152);

			// AST REWRITE
			// elements: const_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 234:46: -> ^( LIST ( const_value )* )
			{
				// Thrift.g:234:49: ^( LIST ( const_value )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);
				// Thrift.g:234:56: ( const_value )*
				while ( stream_const_value.hasNext() ) {
					adaptor.addChild(root_1, stream_const_value.nextTree());
				}
				stream_const_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_list"


	public static class const_map_entry_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_map_entry"
	// Thrift.g:237:1: const_map_entry : k= const_value ':' v= const_value ( list_separator )? -> ^( ENTRY_ $k $v) ;
	public final ThriftParser.const_map_entry_return const_map_entry() throws RecognitionException {
		ThriftParser.const_map_entry_return retval = new ThriftParser.const_map_entry_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal153=null;
		ParserRuleReturnScope k =null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope list_separator154 =null;

		CommonTree char_literal153_tree=null;
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");

		try {
			// Thrift.g:238:5: (k= const_value ':' v= const_value ( list_separator )? -> ^( ENTRY_ $k $v) )
			// Thrift.g:238:7: k= const_value ':' v= const_value ( list_separator )?
			{
			pushFollow(FOLLOW_const_value_in_const_map_entry1906);
			k=const_value();
			state._fsp--;

			stream_const_value.add(k.getTree());
			char_literal153=(Token)match(input,65,FOLLOW_65_in_const_map_entry1908);  
			stream_65.add(char_literal153);

			pushFollow(FOLLOW_const_value_in_const_map_entry1912);
			v=const_value();
			state._fsp--;

			stream_const_value.add(v.getTree());
			// Thrift.g:238:39: ( list_separator )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==COMMA||LA50_0==SEMICOLON) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Thrift.g:238:39: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_const_map_entry1914);
					list_separator154=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator154.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: k, v
			// token labels: 
			// rule labels: v, k, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_k=new RewriteRuleSubtreeStream(adaptor,"rule k",k!=null?k.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 238:55: -> ^( ENTRY_ $k $v)
			{
				// Thrift.g:238:58: ^( ENTRY_ $k $v)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENTRY_, "ENTRY_"), root_1);
				adaptor.addChild(root_1, stream_k.nextTree());
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_map_entry"


	public static class const_map_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_map"
	// Thrift.g:241:1: const_map : LCURLY ( const_map_entry )* RCURLY -> ^( MAP ( const_map_entry )* ) ;
	public final ThriftParser.const_map_return const_map() throws RecognitionException {
		ThriftParser.const_map_return retval = new ThriftParser.const_map_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LCURLY155=null;
		Token RCURLY157=null;
		ParserRuleReturnScope const_map_entry156 =null;

		CommonTree LCURLY155_tree=null;
		CommonTree RCURLY157_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_const_map_entry=new RewriteRuleSubtreeStream(adaptor,"rule const_map_entry");

		try {
			// Thrift.g:242:5: ( LCURLY ( const_map_entry )* RCURLY -> ^( MAP ( const_map_entry )* ) )
			// Thrift.g:242:7: LCURLY ( const_map_entry )* RCURLY
			{
			LCURLY155=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_const_map1944);  
			stream_LCURLY.add(LCURLY155);

			// Thrift.g:242:14: ( const_map_entry )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==DOUBLE||(LA51_0 >= HEX_INTEGER && LA51_0 <= IDENTIFIER)||(LA51_0 >= INTEGER && LA51_0 <= LCURLY)||LA51_0==LITERAL||LA51_0==69) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// Thrift.g:242:14: const_map_entry
					{
					pushFollow(FOLLOW_const_map_entry_in_const_map1946);
					const_map_entry156=const_map_entry();
					state._fsp--;

					stream_const_map_entry.add(const_map_entry156.getTree());
					}
					break;

				default :
					break loop51;
				}
			}

			RCURLY157=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_const_map1949);  
			stream_RCURLY.add(RCURLY157);

			// AST REWRITE
			// elements: const_map_entry
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 242:38: -> ^( MAP ( const_map_entry )* )
			{
				// Thrift.g:242:41: ^( MAP ( const_map_entry )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);
				// Thrift.g:242:47: ( const_map_entry )*
				while ( stream_const_map_entry.hasNext() ) {
					adaptor.addChild(root_1, stream_const_map_entry.nextTree());
				}
				stream_const_map_entry.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_map"


	public static class list_separator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list_separator"
	// Thrift.g:245:1: list_separator : ( COMMA | SEMICOLON );
	public final ThriftParser.list_separator_return list_separator() throws RecognitionException {
		ThriftParser.list_separator_return retval = new ThriftParser.list_separator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set158=null;

		CommonTree set158_tree=null;

		try {
			// Thrift.g:246:5: ( COMMA | SEMICOLON )
			// Thrift.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set158=input.LT(1);
			if ( input.LA(1)==COMMA||input.LA(1)==SEMICOLON ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set158));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_separator"


	public static class real_base_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "real_base_type"
	// Thrift.g:249:1: real_base_type : ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY );
	public final ThriftParser.real_base_type_return real_base_type() throws RecognitionException {
		ThriftParser.real_base_type_return retval = new ThriftParser.real_base_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set159=null;

		CommonTree set159_tree=null;

		try {
			// Thrift.g:250:5: ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY )
			// Thrift.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set159=input.LT(1);
			if ( (input.LA(1) >= TYPE_BINARY && input.LA(1) <= TYPE_STRING) ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set159));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "real_base_type"

	// Delegated rules



	public static final BitSet FOLLOW_header_in_document388 = new BitSet(new long[]{0x08015848080A0100L,0x0000000000000580L});
	public static final BitSet FOLLOW_definition_in_document391 = new BitSet(new long[]{0x08015840000A0100L});
	public static final BitSet FOLLOW_EOF_in_document394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_include_in_header424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespace_in_header428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cpp_include_in_header432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include449 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LITERAL_in_include451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_dpackage476 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_dpackage480 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_dpackage482 = new BitSet(new long[]{0x080158C0000A0100L});
	public static final BitSet FOLLOW_definition_in_dpackage484 = new BitSet(new long[]{0x080158C0000A0100L});
	public static final BitSet FOLLOW_RCURLY_in_dpackage487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_in_namespace517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_namespace519 = new BitSet(new long[]{0x0000000104000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_namespace530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_in_namespace548 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace552 = new BitSet(new long[]{0x0000000104000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_namespace563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_namespace584 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_namespace605 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_cpp_include635 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_include637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dpackage_in_definition663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_rule_in_definition667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedef_in_definition671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_rule_in_definition675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_senum_in_definition679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_in_definition683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_in_definition687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exception_in_definition691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_service_in_definition695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_const_rule712 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_const_rule714 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_rule716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_const_rule718 = new BitSet(new long[]{0x0000000136008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_const_value_in_const_rule720 = new BitSet(new long[]{0x0000040000000042L});
	public static final BitSet FOLLOW_list_separator_in_const_rule722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEDEF_in_typedef760 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_typedef762 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_typedef764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_in_enum_rule791 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_rule793 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_enum_rule795 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_enum_field_in_enum_rule797 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_RCURLY_in_enum_rule800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_field828 = new BitSet(new long[]{0x0000040000000042L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_enum_field831 = new BitSet(new long[]{0x0000000012000000L});
	public static final BitSet FOLLOW_integer_in_enum_field833 = new BitSet(new long[]{0x0000040000000042L});
	public static final BitSet FOLLOW_list_separator_in_enum_field837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SENUM_in_senum864 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_senum866 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_senum868 = new BitSet(new long[]{0x0000008100000000L});
	public static final BitSet FOLLOW_LITERAL_in_senum871 = new BitSet(new long[]{0x0000048100000040L});
	public static final BitSet FOLLOW_list_separator_in_senum873 = new BitSet(new long[]{0x0000008100000000L});
	public static final BitSet FOLLOW_RCURLY_in_senum878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRUCT_in_struct906 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct908 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_struct910 = new BitSet(new long[]{0x07F821A296000000L});
	public static final BitSet FOLLOW_field_in_struct912 = new BitSet(new long[]{0x07F821A296000000L});
	public static final BitSet FOLLOW_RCURLY_in_struct915 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_struct917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union949 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_union951 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_union953 = new BitSet(new long[]{0x07F821A296000000L});
	public static final BitSet FOLLOW_field_in_union955 = new BitSet(new long[]{0x07F821A296000000L});
	public static final BitSet FOLLOW_RCURLY_in_union958 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_union960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCEPTION_in_exception992 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exception994 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_exception996 = new BitSet(new long[]{0x07F821A296000000L});
	public static final BitSet FOLLOW_field_in_exception998 = new BitSet(new long[]{0x07F821A296000000L});
	public static final BitSet FOLLOW_RCURLY_in_exception1001 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_exception1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERVICE_in_service1035 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service1039 = new BitSet(new long[]{0x0000000020100000L});
	public static final BitSet FOLLOW_EXTENDS_in_service1042 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service1046 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_service1050 = new BitSet(new long[]{0x17F8209284041020L});
	public static final BitSet FOLLOW_function_in_service1054 = new BitSet(new long[]{0x17F8209284041020L});
	public static final BitSet FOLLOW_RCURLY_in_service1057 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_service1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_field_id1101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_field_id1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_id_in_field1128 = new BitSet(new long[]{0x07F8212284000000L});
	public static final BitSet FOLLOW_field_req_in_field1131 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_field1134 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field1136 = new BitSet(new long[]{0x4000040000000042L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_field1139 = new BitSet(new long[]{0x0000000136008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_const_value_in_field1141 = new BitSet(new long[]{0x4000040000000042L});
	public static final BitSet FOLLOW_type_annotations_in_field1145 = new BitSet(new long[]{0x0000040000000042L});
	public static final BitSet FOLLOW_list_separator_in_field1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_mode_in_function1226 = new BitSet(new long[]{0x17F8200284000000L});
	public static final BitSet FOLLOW_function_type_in_function1229 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function1231 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_function1233 = new BitSet(new long[]{0x87F8212296000000L});
	public static final BitSet FOLLOW_field_in_function1235 = new BitSet(new long[]{0x87F8212296000000L});
	public static final BitSet FOLLOW_63_in_function1238 = new BitSet(new long[]{0x4000840000000042L});
	public static final BitSet FOLLOW_throws_list_in_function1240 = new BitSet(new long[]{0x4000040000000042L});
	public static final BitSet FOLLOW_type_annotations_in_function1243 = new BitSet(new long[]{0x0000040000000042L});
	public static final BitSet FOLLOW_list_separator_in_function1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_type_in_function_type1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_function_type1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROWS_in_throws_list1353 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_throws_list1355 = new BitSet(new long[]{0x87F8212296000000L});
	public static final BitSet FOLLOW_field_in_throws_list1357 = new BitSet(new long[]{0x87F8212296000000L});
	public static final BitSet FOLLOW_63_in_throws_list1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_type_annotations1387 = new BitSet(new long[]{0x8000000004000000L});
	public static final BitSet FOLLOW_type_annotation_in_type_annotations1389 = new BitSet(new long[]{0x8000000004000000L});
	public static final BitSet FOLLOW_63_in_type_annotations1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_annotation1418 = new BitSet(new long[]{0x0000040000000042L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_type_annotation1421 = new BitSet(new long[]{0x0000000112000000L});
	public static final BitSet FOLLOW_annotation_value_in_type_annotation1423 = new BitSet(new long[]{0x0000040000000042L});
	public static final BitSet FOLLOW_list_separator_in_type_annotation1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_annotation_value1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_annotation_value1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_field_type1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field_type1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_container_type_in_field_type1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_base_type_in_base_type1503 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_base_type1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_type_in_container_type1524 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_set_type_in_container_type1528 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_list_type_in_container_type1532 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_container_type1535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAP_in_map_type1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_cpp_type_in_map_type1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_map_type1558 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_map_type1560 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_map_type1562 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_map_type1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_map_type1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_type1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_cpp_type_in_set_type1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_set_type1601 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_set_type1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_set_type1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list_type1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_list_type1635 = new BitSet(new long[]{0x07F8200284000000L});
	public static final BitSet FOLLOW_field_type_in_list_type1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_list_type1639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_cpp_type_in_list_type1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_cpp_type1670 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_type1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_const_value1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_const_value1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_const_value1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_value1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_list_in_const_value1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_map_in_const_value1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_const_list1868 = new BitSet(new long[]{0x0000000136008000L,0x0000000000000060L});
	public static final BitSet FOLLOW_const_value_in_const_list1871 = new BitSet(new long[]{0x0000040136008040L,0x0000000000000060L});
	public static final BitSet FOLLOW_list_separator_in_const_list1873 = new BitSet(new long[]{0x0000000136008000L,0x0000000000000060L});
	public static final BitSet FOLLOW_70_in_const_list1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_const_map_entry1908 = new BitSet(new long[]{0x0000000136008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry1912 = new BitSet(new long[]{0x0000040000000042L});
	public static final BitSet FOLLOW_list_separator_in_const_map_entry1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_const_map1944 = new BitSet(new long[]{0x0000008136008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_const_map_entry_in_const_map1946 = new BitSet(new long[]{0x0000008136008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RCURLY_in_const_map1949 = new BitSet(new long[]{0x0000000000000002L});
}
