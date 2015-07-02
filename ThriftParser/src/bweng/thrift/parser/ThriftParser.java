// $ANTLR 3.5.2 Thrift.g 2015-07-01 02:17:39

package bweng.thrift.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ThriftParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "ASYNC", "COMMA", "COMMENT", 
		"CONST", "CPP_INCLUDE", "CPP_TYPE", "DEFAULT_NAMESPACE", "DEFERRED", "DIGIT", 
		"DOCUMENT", "DOUBLE", "ENTRY", "ENUM", "EVENT", "EXCEPTION", "EXTENDS", 
		"FIELD", "FIELD_ID", "HEX_DIGIT", "HEX_INTEGER", "IDENTIFIER", "INCLUDE", 
		"INTEGER", "LCURLY", "LETTER", "LIST", "LITERAL", "MAP", "METHOD", "NAMESPACE", 
		"ONEWAY", "OPTIONAL", "PACKAGE", "RCURLY", "REQUIRED", "REQUIREDNESS", 
		"SEMICOLON", "SENUM", "SERVICE", "SET", "STRUCT", "THROWS", "TYPE", "TYPEDEF", 
		"TYPES", "TYPE_BINARY", "TYPE_BOOL", "TYPE_BYTE", "TYPE_DOUBLE", "TYPE_I16", 
		"TYPE_I32", "TYPE_I64", "TYPE_STRING", "UNION", "VOID", "WS", "'('", "')'", 
		"'*'", "':'", "'<'", "'='", "'>'", "'['", "']'", "'cpp_include'", "'cpp_namespace'", 
		"'cpp_type'", "'php_namespace'"
	};
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
	// Thrift.g:84:1: document : ( header )* ( definition )* EOF -> ^( DOCUMENT ( header )* ( definition )* ) ;
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
			// Thrift.g:85:5: ( ( header )* ( definition )* EOF -> ^( DOCUMENT ( header )* ( definition )* ) )
			// Thrift.g:85:7: ( header )* ( definition )* EOF
			{
			// Thrift.g:85:7: ( header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE||LA1_0==NAMESPACE||(LA1_0 >= 70 && LA1_0 <= 71)||LA1_0==73) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Thrift.g:85:7: header
					{
					pushFollow(FOLLOW_header_in_document384);
					header1=header();
					state._fsp--;

					stream_header.add(header1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// Thrift.g:85:15: ( definition )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONST||LA2_0==ENUM||LA2_0==EXCEPTION||LA2_0==PACKAGE||(LA2_0 >= SENUM && LA2_0 <= SERVICE)||LA2_0==STRUCT||LA2_0==TYPEDEF||LA2_0==UNION) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Thrift.g:85:15: definition
					{
					pushFollow(FOLLOW_definition_in_document387);
					definition2=definition();
					state._fsp--;

					stream_definition.add(definition2.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_document390);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: definition, header
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 85:31: -> ^( DOCUMENT ( header )* ( definition )* )
			{
				// Thrift.g:85:34: ^( DOCUMENT ( header )* ( definition )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOCUMENT, "DOCUMENT"), root_1);
				// Thrift.g:85:45: ( header )*
				while ( stream_header.hasNext() ) {
					adaptor.addChild(root_1, stream_header.nextTree());
				}
				stream_header.reset();

				// Thrift.g:85:53: ( definition )*
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
	// Thrift.g:89:1: header : ( include | namespace | cpp_include );
	public final ThriftParser.header_return header() throws RecognitionException {
		ThriftParser.header_return retval = new ThriftParser.header_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope include4 =null;
		ParserRuleReturnScope namespace5 =null;
		ParserRuleReturnScope cpp_include6 =null;


		try {
			// Thrift.g:90:5: ( include | namespace | cpp_include )
			int alt3=3;
			switch ( input.LA(1) ) {
			case INCLUDE:
				{
				alt3=1;
				}
				break;
			case NAMESPACE:
			case 71:
			case 73:
				{
				alt3=2;
				}
				break;
			case 70:
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
					// Thrift.g:90:7: include
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_include_in_header420);
					include4=include();
					state._fsp--;

					adaptor.addChild(root_0, include4.getTree());

					}
					break;
				case 2 :
					// Thrift.g:90:17: namespace
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_namespace_in_header424);
					namespace5=namespace();
					state._fsp--;

					adaptor.addChild(root_0, namespace5.getTree());

					}
					break;
				case 3 :
					// Thrift.g:90:29: cpp_include
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cpp_include_in_header428);
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
	// Thrift.g:93:1: include : INCLUDE LITERAL -> ^( INCLUDE LITERAL ) ;
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
			// Thrift.g:94:5: ( INCLUDE LITERAL -> ^( INCLUDE LITERAL ) )
			// Thrift.g:94:7: INCLUDE LITERAL
			{
			INCLUDE7=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include445);  
			stream_INCLUDE.add(INCLUDE7);

			LITERAL8=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_include447);  
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
			// 94:23: -> ^( INCLUDE LITERAL )
			{
				// Thrift.g:94:26: ^( INCLUDE LITERAL )
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
	// Thrift.g:97:1: dpackage : PACKAGE k= IDENTIFIER LCURLY ( definition )* RCURLY -> ^( PACKAGE $k ( definition )* ) ;
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
			// Thrift.g:98:5: ( PACKAGE k= IDENTIFIER LCURLY ( definition )* RCURLY -> ^( PACKAGE $k ( definition )* ) )
			// Thrift.g:98:7: PACKAGE k= IDENTIFIER LCURLY ( definition )* RCURLY
			{
			PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_dpackage472);  
			stream_PACKAGE.add(PACKAGE9);

			k=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dpackage476);  
			stream_IDENTIFIER.add(k);

			LCURLY10=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_dpackage478);  
			stream_LCURLY.add(LCURLY10);

			// Thrift.g:98:35: ( definition )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CONST||LA4_0==ENUM||LA4_0==EXCEPTION||LA4_0==PACKAGE||(LA4_0 >= SENUM && LA4_0 <= SERVICE)||LA4_0==STRUCT||LA4_0==TYPEDEF||LA4_0==UNION) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Thrift.g:98:35: definition
					{
					pushFollow(FOLLOW_definition_in_dpackage480);
					definition11=definition();
					state._fsp--;

					stream_definition.add(definition11.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			RCURLY12=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_dpackage483);  
			stream_RCURLY.add(RCURLY12);

			// AST REWRITE
			// elements: PACKAGE, k, definition
			// token labels: k
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 98:54: -> ^( PACKAGE $k ( definition )* )
			{
				// Thrift.g:98:57: ^( PACKAGE $k ( definition )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_k.nextNode());
				// Thrift.g:98:70: ( definition )*
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
	// Thrift.g:101:1: namespace : ( NAMESPACE '*' (v= IDENTIFIER |v= LITERAL ) -> ^( DEFAULT_NAMESPACE $v) | NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) -> ^( NAMESPACE $k $v) | 'cpp_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER ) | 'php_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER ) );
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
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

		try {
			// Thrift.g:102:5: ( NAMESPACE '*' (v= IDENTIFIER |v= LITERAL ) -> ^( DEFAULT_NAMESPACE $v) | NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) -> ^( NAMESPACE $k $v) | 'cpp_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER ) | 'php_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER ) )
			int alt7=4;
			switch ( input.LA(1) ) {
			case NAMESPACE:
				{
				int LA7_1 = input.LA(2);
				if ( (LA7_1==63) ) {
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
			case 71:
				{
				alt7=3;
				}
				break;
			case 73:
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
					// Thrift.g:102:7: NAMESPACE '*' (v= IDENTIFIER |v= LITERAL )
					{
					NAMESPACE13=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace513);  
					stream_NAMESPACE.add(NAMESPACE13);

					char_literal14=(Token)match(input,63,FOLLOW_63_in_namespace515);  
					stream_63.add(char_literal14);

					// Thrift.g:102:21: (v= IDENTIFIER |v= LITERAL )
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
							// Thrift.g:102:22: v= IDENTIFIER
							{
							v=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace520);  
							stream_IDENTIFIER.add(v);

							}
							break;
						case 2 :
							// Thrift.g:102:37: v= LITERAL
							{
							v=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_namespace526);  
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
					// 102:48: -> ^( DEFAULT_NAMESPACE $v)
					{
						// Thrift.g:102:51: ^( DEFAULT_NAMESPACE $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFAULT_NAMESPACE, "DEFAULT_NAMESPACE"), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Thrift.g:103:7: NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL )
					{
					NAMESPACE15=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace544);  
					stream_NAMESPACE.add(NAMESPACE15);

					k=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace548);  
					stream_IDENTIFIER.add(k);

					// Thrift.g:103:30: (v= IDENTIFIER |v= LITERAL )
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
							// Thrift.g:103:31: v= IDENTIFIER
							{
							v=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace553);  
							stream_IDENTIFIER.add(v);

							}
							break;
						case 2 :
							// Thrift.g:103:46: v= LITERAL
							{
							v=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_namespace559);  
							stream_LITERAL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: NAMESPACE, k, v
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
					// 103:57: -> ^( NAMESPACE $k $v)
					{
						// Thrift.g:103:60: ^( NAMESPACE $k $v)
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
					// Thrift.g:104:7: 'cpp_namespace' IDENTIFIER
					{
					string_literal16=(Token)match(input,71,FOLLOW_71_in_namespace580);  
					stream_71.add(string_literal16);

					IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace582);  
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
					// 104:34: -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER )
					{
						// Thrift.g:104:37: ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER )
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
					// Thrift.g:105:7: 'php_namespace' IDENTIFIER
					{
					string_literal18=(Token)match(input,73,FOLLOW_73_in_namespace601);  
					stream_73.add(string_literal18);

					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace603);  
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
					// 105:34: -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER )
					{
						// Thrift.g:105:37: ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER )
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
	// Thrift.g:108:1: cpp_include : 'cpp_include' LITERAL -> ^( CPP_INCLUDE LITERAL ) ;
	public final ThriftParser.cpp_include_return cpp_include() throws RecognitionException {
		ThriftParser.cpp_include_return retval = new ThriftParser.cpp_include_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal20=null;
		Token LITERAL21=null;

		CommonTree string_literal20_tree=null;
		CommonTree LITERAL21_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");

		try {
			// Thrift.g:109:5: ( 'cpp_include' LITERAL -> ^( CPP_INCLUDE LITERAL ) )
			// Thrift.g:109:7: 'cpp_include' LITERAL
			{
			string_literal20=(Token)match(input,70,FOLLOW_70_in_cpp_include631);  
			stream_70.add(string_literal20);

			LITERAL21=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_include633);  
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
			// 109:29: -> ^( CPP_INCLUDE LITERAL )
			{
				// Thrift.g:109:32: ^( CPP_INCLUDE LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CPP_INCLUDE, "CPP_INCLUDE"), root_1);
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
	// Thrift.g:113:1: definition : ( dpackage | const_rule | typedef | enum_rule | senum | struct | union | exception | service );
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
			// Thrift.g:114:5: ( dpackage | const_rule | typedef | enum_rule | senum | struct | union | exception | service )
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
					// Thrift.g:114:7: dpackage
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_dpackage_in_definition659);
					dpackage22=dpackage();
					state._fsp--;

					adaptor.addChild(root_0, dpackage22.getTree());

					}
					break;
				case 2 :
					// Thrift.g:114:18: const_rule
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_const_rule_in_definition663);
					const_rule23=const_rule();
					state._fsp--;

					adaptor.addChild(root_0, const_rule23.getTree());

					}
					break;
				case 3 :
					// Thrift.g:114:31: typedef
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typedef_in_definition667);
					typedef24=typedef();
					state._fsp--;

					adaptor.addChild(root_0, typedef24.getTree());

					}
					break;
				case 4 :
					// Thrift.g:114:41: enum_rule
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_enum_rule_in_definition671);
					enum_rule25=enum_rule();
					state._fsp--;

					adaptor.addChild(root_0, enum_rule25.getTree());

					}
					break;
				case 5 :
					// Thrift.g:114:53: senum
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_senum_in_definition675);
					senum26=senum();
					state._fsp--;

					adaptor.addChild(root_0, senum26.getTree());

					}
					break;
				case 6 :
					// Thrift.g:114:61: struct
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_struct_in_definition679);
					struct27=struct();
					state._fsp--;

					adaptor.addChild(root_0, struct27.getTree());

					}
					break;
				case 7 :
					// Thrift.g:114:70: union
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_in_definition683);
					union28=union();
					state._fsp--;

					adaptor.addChild(root_0, union28.getTree());

					}
					break;
				case 8 :
					// Thrift.g:114:78: exception
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_exception_in_definition687);
					exception29=exception();
					state._fsp--;

					adaptor.addChild(root_0, exception29.getTree());

					}
					break;
				case 9 :
					// Thrift.g:114:90: service
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_service_in_definition691);
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
	// Thrift.g:117:1: const_rule : CONST field_type IDENTIFIER '=' const_value ( list_separator )? -> ^( CONST IDENTIFIER field_type const_value ) ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:118:5: ( CONST field_type IDENTIFIER '=' const_value ( list_separator )? -> ^( CONST IDENTIFIER field_type const_value ) )
			// Thrift.g:118:7: CONST field_type IDENTIFIER '=' const_value ( list_separator )?
			{
			CONST31=(Token)match(input,CONST,FOLLOW_CONST_in_const_rule708);  
			stream_CONST.add(CONST31);

			pushFollow(FOLLOW_field_type_in_const_rule710);
			field_type32=field_type();
			state._fsp--;

			stream_field_type.add(field_type32.getTree());
			IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_rule712);  
			stream_IDENTIFIER.add(IDENTIFIER33);

			char_literal34=(Token)match(input,66,FOLLOW_66_in_const_rule714);  
			stream_66.add(char_literal34);

			pushFollow(FOLLOW_const_value_in_const_rule716);
			const_value35=const_value();
			state._fsp--;

			stream_const_value.add(const_value35.getTree());
			// Thrift.g:118:51: ( list_separator )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==COMMA||LA9_0==SEMICOLON) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Thrift.g:118:51: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_const_rule718);
					list_separator36=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator36.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field_type, CONST, IDENTIFIER, const_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 119:9: -> ^( CONST IDENTIFIER field_type const_value )
			{
				// Thrift.g:119:12: ^( CONST IDENTIFIER field_type const_value )
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
	// Thrift.g:122:1: typedef : TYPEDEF field_type IDENTIFIER -> ^( TYPEDEF IDENTIFIER field_type ) ;
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
			// Thrift.g:123:5: ( TYPEDEF field_type IDENTIFIER -> ^( TYPEDEF IDENTIFIER field_type ) )
			// Thrift.g:123:7: TYPEDEF field_type IDENTIFIER
			{
			TYPEDEF37=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef756);  
			stream_TYPEDEF.add(TYPEDEF37);

			pushFollow(FOLLOW_field_type_in_typedef758);
			field_type38=field_type();
			state._fsp--;

			stream_field_type.add(field_type38.getTree());
			IDENTIFIER39=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedef760);  
			stream_IDENTIFIER.add(IDENTIFIER39);

			// AST REWRITE
			// elements: TYPEDEF, field_type, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 123:37: -> ^( TYPEDEF IDENTIFIER field_type )
			{
				// Thrift.g:123:40: ^( TYPEDEF IDENTIFIER field_type )
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
	// Thrift.g:126:1: enum_rule : ENUM IDENTIFIER LCURLY ( enum_field )* RCURLY -> ^( ENUM IDENTIFIER ( enum_field )* ) ;
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
			// Thrift.g:127:5: ( ENUM IDENTIFIER LCURLY ( enum_field )* RCURLY -> ^( ENUM IDENTIFIER ( enum_field )* ) )
			// Thrift.g:127:7: ENUM IDENTIFIER LCURLY ( enum_field )* RCURLY
			{
			ENUM40=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_rule787);  
			stream_ENUM.add(ENUM40);

			IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_rule789);  
			stream_IDENTIFIER.add(IDENTIFIER41);

			LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_enum_rule791);  
			stream_LCURLY.add(LCURLY42);

			// Thrift.g:127:30: ( enum_field )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENTIFIER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Thrift.g:127:30: enum_field
					{
					pushFollow(FOLLOW_enum_field_in_enum_rule793);
					enum_field43=enum_field();
					state._fsp--;

					stream_enum_field.add(enum_field43.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_enum_rule796);  
			stream_RCURLY.add(RCURLY44);

			// AST REWRITE
			// elements: ENUM, IDENTIFIER, enum_field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 127:49: -> ^( ENUM IDENTIFIER ( enum_field )* )
			{
				// Thrift.g:127:52: ^( ENUM IDENTIFIER ( enum_field )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:127:70: ( enum_field )*
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
	// Thrift.g:130:1: enum_field : IDENTIFIER ( '=' integer )? ( list_separator )? -> ^( IDENTIFIER ( integer )? ) ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");

		try {
			// Thrift.g:131:5: ( IDENTIFIER ( '=' integer )? ( list_separator )? -> ^( IDENTIFIER ( integer )? ) )
			// Thrift.g:131:7: IDENTIFIER ( '=' integer )? ( list_separator )?
			{
			IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_field824);  
			stream_IDENTIFIER.add(IDENTIFIER45);

			// Thrift.g:131:18: ( '=' integer )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==66) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Thrift.g:131:19: '=' integer
					{
					char_literal46=(Token)match(input,66,FOLLOW_66_in_enum_field827);  
					stream_66.add(char_literal46);

					pushFollow(FOLLOW_integer_in_enum_field829);
					integer47=integer();
					state._fsp--;

					stream_integer.add(integer47.getTree());
					}
					break;

			}

			// Thrift.g:131:33: ( list_separator )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA||LA12_0==SEMICOLON) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Thrift.g:131:33: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_enum_field833);
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
			// 131:49: -> ^( IDENTIFIER ( integer )? )
			{
				// Thrift.g:131:52: ^( IDENTIFIER ( integer )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
				// Thrift.g:131:65: ( integer )?
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
	// Thrift.g:134:1: senum : SENUM IDENTIFIER LCURLY ( LITERAL ( list_separator )? )* RCURLY -> ^( SENUM IDENTIFIER ( LITERAL )* ) ;
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
			// Thrift.g:135:5: ( SENUM IDENTIFIER LCURLY ( LITERAL ( list_separator )? )* RCURLY -> ^( SENUM IDENTIFIER ( LITERAL )* ) )
			// Thrift.g:135:7: SENUM IDENTIFIER LCURLY ( LITERAL ( list_separator )? )* RCURLY
			{
			SENUM49=(Token)match(input,SENUM,FOLLOW_SENUM_in_senum860);  
			stream_SENUM.add(SENUM49);

			IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_senum862);  
			stream_IDENTIFIER.add(IDENTIFIER50);

			LCURLY51=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_senum864);  
			stream_LCURLY.add(LCURLY51);

			// Thrift.g:135:31: ( LITERAL ( list_separator )? )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==LITERAL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Thrift.g:135:32: LITERAL ( list_separator )?
					{
					LITERAL52=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_senum867);  
					stream_LITERAL.add(LITERAL52);

					// Thrift.g:135:40: ( list_separator )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==COMMA||LA13_0==SEMICOLON) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// Thrift.g:135:40: list_separator
							{
							pushFollow(FOLLOW_list_separator_in_senum869);
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

			RCURLY54=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_senum874);  
			stream_RCURLY.add(RCURLY54);

			// AST REWRITE
			// elements: SENUM, IDENTIFIER, LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:65: -> ^( SENUM IDENTIFIER ( LITERAL )* )
			{
				// Thrift.g:135:68: ^( SENUM IDENTIFIER ( LITERAL )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SENUM.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:135:87: ( LITERAL )*
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
	// Thrift.g:138:1: struct : STRUCT IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? ) ;
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
			// Thrift.g:139:5: ( STRUCT IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? ) )
			// Thrift.g:139:7: STRUCT IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )?
			{
			STRUCT55=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct902);  
			stream_STRUCT.add(STRUCT55);

			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct904);  
			stream_IDENTIFIER.add(IDENTIFIER56);

			LCURLY57=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_struct906);  
			stream_LCURLY.add(LCURLY57);

			// Thrift.g:139:32: ( field )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= HEX_INTEGER && LA15_0 <= IDENTIFIER)||LA15_0==INTEGER||LA15_0==LIST||LA15_0==MAP||LA15_0==OPTIONAL||LA15_0==REQUIRED||LA15_0==SET||(LA15_0 >= TYPE_BINARY && LA15_0 <= TYPE_STRING)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// Thrift.g:139:32: field
					{
					pushFollow(FOLLOW_field_in_struct908);
					field58=field();
					state._fsp--;

					stream_field.add(field58.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			RCURLY59=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_struct911);  
			stream_RCURLY.add(RCURLY59);

			// Thrift.g:139:46: ( type_annotations )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==61) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Thrift.g:139:46: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_struct913);
					type_annotations60=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations60.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: type_annotations, STRUCT, field, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 139:64: -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? )
			{
				// Thrift.g:139:67: ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_STRUCT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:139:87: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// Thrift.g:139:94: ( type_annotations )?
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
	// Thrift.g:142:1: union : UNION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? ) ;
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
			// Thrift.g:143:5: ( UNION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? ) )
			// Thrift.g:143:7: UNION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )?
			{
			UNION61=(Token)match(input,UNION,FOLLOW_UNION_in_union945);  
			stream_UNION.add(UNION61);

			IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_union947);  
			stream_IDENTIFIER.add(IDENTIFIER62);

			LCURLY63=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_union949);  
			stream_LCURLY.add(LCURLY63);

			// Thrift.g:143:31: ( field )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= HEX_INTEGER && LA17_0 <= IDENTIFIER)||LA17_0==INTEGER||LA17_0==LIST||LA17_0==MAP||LA17_0==OPTIONAL||LA17_0==REQUIRED||LA17_0==SET||(LA17_0 >= TYPE_BINARY && LA17_0 <= TYPE_STRING)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Thrift.g:143:31: field
					{
					pushFollow(FOLLOW_field_in_union951);
					field64=field();
					state._fsp--;

					stream_field.add(field64.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			RCURLY65=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_union954);  
			stream_RCURLY.add(RCURLY65);

			// Thrift.g:143:45: ( type_annotations )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==61) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Thrift.g:143:45: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_union956);
					type_annotations66=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations66.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: UNION, field, IDENTIFIER, type_annotations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:63: -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? )
			{
				// Thrift.g:143:66: ^( UNION IDENTIFIER ( field )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_UNION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:143:85: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// Thrift.g:143:92: ( type_annotations )?
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
	// Thrift.g:146:1: exception : EXCEPTION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? ) ;
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
			// Thrift.g:147:5: ( EXCEPTION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )? -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? ) )
			// Thrift.g:147:7: EXCEPTION IDENTIFIER LCURLY ( field )* RCURLY ( type_annotations )?
			{
			EXCEPTION67=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception988);  
			stream_EXCEPTION.add(EXCEPTION67);

			IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exception990);  
			stream_IDENTIFIER.add(IDENTIFIER68);

			LCURLY69=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_exception992);  
			stream_LCURLY.add(LCURLY69);

			// Thrift.g:147:35: ( field )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= HEX_INTEGER && LA19_0 <= IDENTIFIER)||LA19_0==INTEGER||LA19_0==LIST||LA19_0==MAP||LA19_0==OPTIONAL||LA19_0==REQUIRED||LA19_0==SET||(LA19_0 >= TYPE_BINARY && LA19_0 <= TYPE_STRING)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Thrift.g:147:35: field
					{
					pushFollow(FOLLOW_field_in_exception994);
					field70=field();
					state._fsp--;

					stream_field.add(field70.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			RCURLY71=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_exception997);  
			stream_RCURLY.add(RCURLY71);

			// Thrift.g:147:49: ( type_annotations )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==61) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Thrift.g:147:49: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_exception999);
					type_annotations72=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations72.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: EXCEPTION, IDENTIFIER, type_annotations, field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 147:67: -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? )
			{
				// Thrift.g:147:70: ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_EXCEPTION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:147:93: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// Thrift.g:147:100: ( type_annotations )?
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
	// Thrift.g:150:1: service : SERVICE s= IDENTIFIER ( EXTENDS e= IDENTIFIER )? LCURLY (f= function )* RCURLY ( type_annotations )? -> ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? ) ;
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
			// Thrift.g:151:5: ( SERVICE s= IDENTIFIER ( EXTENDS e= IDENTIFIER )? LCURLY (f= function )* RCURLY ( type_annotations )? -> ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? ) )
			// Thrift.g:151:7: SERVICE s= IDENTIFIER ( EXTENDS e= IDENTIFIER )? LCURLY (f= function )* RCURLY ( type_annotations )?
			{
			SERVICE73=(Token)match(input,SERVICE,FOLLOW_SERVICE_in_service1031);  
			stream_SERVICE.add(SERVICE73);

			s=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service1035);  
			stream_IDENTIFIER.add(s);

			// Thrift.g:151:28: ( EXTENDS e= IDENTIFIER )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EXTENDS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Thrift.g:151:29: EXTENDS e= IDENTIFIER
					{
					EXTENDS74=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_service1038);  
					stream_EXTENDS.add(EXTENDS74);

					e=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service1042);  
					stream_IDENTIFIER.add(e);

					}
					break;

			}

			LCURLY75=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_service1046);  
			stream_LCURLY.add(LCURLY75);

			// Thrift.g:151:60: (f= function )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ASYNC||LA22_0==DEFERRED||LA22_0==EVENT||LA22_0==IDENTIFIER||LA22_0==LIST||LA22_0==MAP||LA22_0==ONEWAY||LA22_0==SET||(LA22_0 >= TYPE_BINARY && LA22_0 <= TYPE_STRING)||LA22_0==VOID) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Thrift.g:151:60: f= function
					{
					pushFollow(FOLLOW_function_in_service1050);
					f=function();
					state._fsp--;

					stream_function.add(f.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			RCURLY76=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_service1053);  
			stream_RCURLY.add(RCURLY76);

			// Thrift.g:151:78: ( type_annotations )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==61) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Thrift.g:151:78: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_service1055);
					type_annotations77=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations77.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: function, SERVICE, type_annotations, e, EXTENDS, s
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
			// 151:96: -> ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? )
			{
				// Thrift.g:151:99: ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SERVICE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				// Thrift.g:151:112: ^( EXTENDS ( $e)? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_2);
				// Thrift.g:151:123: ( $e)?
				if ( stream_e.hasNext() ) {
					adaptor.addChild(root_2, stream_e.nextNode());
				}
				stream_e.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Thrift.g:151:127: ( function )*
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				// Thrift.g:151:137: ( type_annotations )?
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
	// Thrift.g:155:1: field_id : integer ':' -> ^( FIELD_ID integer ) ;
	public final ThriftParser.field_id_return field_id() throws RecognitionException {
		ThriftParser.field_id_return retval = new ThriftParser.field_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal79=null;
		ParserRuleReturnScope integer78 =null;

		CommonTree char_literal79_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");

		try {
			// Thrift.g:156:5: ( integer ':' -> ^( FIELD_ID integer ) )
			// Thrift.g:156:7: integer ':'
			{
			pushFollow(FOLLOW_integer_in_field_id1097);
			integer78=integer();
			state._fsp--;

			stream_integer.add(integer78.getTree());
			char_literal79=(Token)match(input,64,FOLLOW_64_in_field_id1099);  
			stream_64.add(char_literal79);

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
			// 156:19: -> ^( FIELD_ID integer )
			{
				// Thrift.g:156:22: ^( FIELD_ID integer )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_ID, "FIELD_ID"), root_1);
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
	// Thrift.g:159:1: field : ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )? -> ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? ) ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_field_id=new RewriteRuleSubtreeStream(adaptor,"rule field_id");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");
		RewriteRuleSubtreeStream stream_field_req=new RewriteRuleSubtreeStream(adaptor,"rule field_req");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// Thrift.g:160:5: ( ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )? -> ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? ) )
			// Thrift.g:160:7: ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )?
			{
			// Thrift.g:160:7: ( field_id )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==HEX_INTEGER||LA24_0==INTEGER) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Thrift.g:160:7: field_id
					{
					pushFollow(FOLLOW_field_id_in_field1124);
					field_id80=field_id();
					state._fsp--;

					stream_field_id.add(field_id80.getTree());
					}
					break;

			}

			// Thrift.g:160:17: ( field_req )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==OPTIONAL||LA25_0==REQUIRED) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Thrift.g:160:17: field_req
					{
					pushFollow(FOLLOW_field_req_in_field1127);
					field_req81=field_req();
					state._fsp--;

					stream_field_req.add(field_req81.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field1130);
			field_type82=field_type();
			state._fsp--;

			stream_field_type.add(field_type82.getTree());
			IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field1132);  
			stream_IDENTIFIER.add(IDENTIFIER83);

			// Thrift.g:160:50: ( '=' const_value )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==66) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Thrift.g:160:51: '=' const_value
					{
					char_literal84=(Token)match(input,66,FOLLOW_66_in_field1135);  
					stream_66.add(char_literal84);

					pushFollow(FOLLOW_const_value_in_field1137);
					const_value85=const_value();
					state._fsp--;

					stream_const_value.add(const_value85.getTree());
					}
					break;

			}

			// Thrift.g:160:69: ( type_annotations )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==61) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Thrift.g:160:69: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_field1141);
					type_annotations86=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations86.getTree());
					}
					break;

			}

			// Thrift.g:160:87: ( list_separator )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COMMA||LA28_0==SEMICOLON) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Thrift.g:160:87: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_field1144);
					list_separator87=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator87.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: const_value, field_id, field_req, IDENTIFIER, field_type, type_annotations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 161:9: -> ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? )
			{
				// Thrift.g:161:12: ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:161:42: ( field_id )?
				if ( stream_field_id.hasNext() ) {
					adaptor.addChild(root_1, stream_field_id.nextTree());
				}
				stream_field_id.reset();

				// Thrift.g:161:52: ^( REQUIREDNESS ( field_req )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REQUIREDNESS, "REQUIREDNESS"), root_2);
				// Thrift.g:161:67: ( field_req )?
				if ( stream_field_req.hasNext() ) {
					adaptor.addChild(root_2, stream_field_req.nextTree());
				}
				stream_field_req.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Thrift.g:161:79: ( const_value )?
				if ( stream_const_value.hasNext() ) {
					adaptor.addChild(root_1, stream_const_value.nextTree());
				}
				stream_const_value.reset();

				// Thrift.g:161:92: ( type_annotations )?
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
	// Thrift.g:164:1: field_req : ( REQUIRED | OPTIONAL );
	public final ThriftParser.field_req_return field_req() throws RecognitionException {
		ThriftParser.field_req_return retval = new ThriftParser.field_req_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set88=null;

		CommonTree set88_tree=null;

		try {
			// Thrift.g:165:5: ( REQUIRED | OPTIONAL )
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
	// Thrift.g:170:1: function : ( function_mode )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )? -> ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? ) ;
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
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_throws_list=new RewriteRuleSubtreeStream(adaptor,"rule throws_list");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_function_type=new RewriteRuleSubtreeStream(adaptor,"rule function_type");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");
		RewriteRuleSubtreeStream stream_function_mode=new RewriteRuleSubtreeStream(adaptor,"rule function_mode");

		try {
			// Thrift.g:171:5: ( ( function_mode )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )? -> ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? ) )
			// Thrift.g:171:7: ( function_mode )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )?
			{
			// Thrift.g:171:7: ( function_mode )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ASYNC||LA29_0==DEFERRED||LA29_0==EVENT||LA29_0==ONEWAY) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Thrift.g:171:7: function_mode
					{
					pushFollow(FOLLOW_function_mode_in_function1222);
					function_mode89=function_mode();
					state._fsp--;

					stream_function_mode.add(function_mode89.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_function_type_in_function1225);
			function_type90=function_type();
			state._fsp--;

			stream_function_type.add(function_type90.getTree());
			IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function1227);  
			stream_IDENTIFIER.add(IDENTIFIER91);

			char_literal92=(Token)match(input,61,FOLLOW_61_in_function1229);  
			stream_61.add(char_literal92);

			// Thrift.g:171:51: ( field )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= HEX_INTEGER && LA30_0 <= IDENTIFIER)||LA30_0==INTEGER||LA30_0==LIST||LA30_0==MAP||LA30_0==OPTIONAL||LA30_0==REQUIRED||LA30_0==SET||(LA30_0 >= TYPE_BINARY && LA30_0 <= TYPE_STRING)) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Thrift.g:171:51: field
					{
					pushFollow(FOLLOW_field_in_function1231);
					field93=field();
					state._fsp--;

					stream_field.add(field93.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal94=(Token)match(input,62,FOLLOW_62_in_function1234);  
			stream_62.add(char_literal94);

			// Thrift.g:171:62: ( throws_list )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==THROWS) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Thrift.g:171:62: throws_list
					{
					pushFollow(FOLLOW_throws_list_in_function1236);
					throws_list95=throws_list();
					state._fsp--;

					stream_throws_list.add(throws_list95.getTree());
					}
					break;

			}

			// Thrift.g:171:75: ( type_annotations )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==61) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Thrift.g:171:75: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_function1239);
					type_annotations96=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations96.getTree());
					}
					break;

			}

			// Thrift.g:171:93: ( list_separator )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMA||LA33_0==SEMICOLON) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Thrift.g:171:93: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_function1242);
					list_separator97=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator97.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: function_type, type_annotations, IDENTIFIER, field, function_mode, throws_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 172:9: -> ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? )
			{
				// Thrift.g:172:12: ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( function_mode )? ( throws_list )? ( type_annotations )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD, "METHOD"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_function_type.nextTree());
				// Thrift.g:172:46: ^( ARGS ( field )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);
				// Thrift.g:172:53: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_2, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Thrift.g:172:61: ( function_mode )?
				if ( stream_function_mode.hasNext() ) {
					adaptor.addChild(root_1, stream_function_mode.nextTree());
				}
				stream_function_mode.reset();

				// Thrift.g:172:76: ( throws_list )?
				if ( stream_throws_list.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_list.nextTree());
				}
				stream_throws_list.reset();

				// Thrift.g:172:89: ( type_annotations )?
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
	// Thrift.g:175:1: function_mode : ( EVENT | ONEWAY | ASYNC | DEFERRED );
	public final ThriftParser.function_mode_return function_mode() throws RecognitionException {
		ThriftParser.function_mode_return retval = new ThriftParser.function_mode_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set98=null;

		CommonTree set98_tree=null;

		try {
			// Thrift.g:176:5: ( EVENT | ONEWAY | ASYNC | DEFERRED )
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
	// Thrift.g:179:1: function_type : ( field_type | VOID );
	public final ThriftParser.function_type_return function_type() throws RecognitionException {
		ThriftParser.function_type_return retval = new ThriftParser.function_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VOID100=null;
		ParserRuleReturnScope field_type99 =null;

		CommonTree VOID100_tree=null;

		try {
			// Thrift.g:180:5: ( field_type | VOID )
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
					// Thrift.g:180:7: field_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_field_type_in_function_type1324);
					field_type99=field_type();
					state._fsp--;

					adaptor.addChild(root_0, field_type99.getTree());

					}
					break;
				case 2 :
					// Thrift.g:181:7: VOID
					{
					root_0 = (CommonTree)adaptor.nil();


					VOID100=(Token)match(input,VOID,FOLLOW_VOID_in_function_type1332); 
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
	// Thrift.g:184:1: throws_list : THROWS '(' ( field )* ')' -> ^( THROWS ( field )* ) ;
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
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");

		try {
			// Thrift.g:185:5: ( THROWS '(' ( field )* ')' -> ^( THROWS ( field )* ) )
			// Thrift.g:185:7: THROWS '(' ( field )* ')'
			{
			THROWS101=(Token)match(input,THROWS,FOLLOW_THROWS_in_throws_list1349);  
			stream_THROWS.add(THROWS101);

			char_literal102=(Token)match(input,61,FOLLOW_61_in_throws_list1351);  
			stream_61.add(char_literal102);

			// Thrift.g:185:18: ( field )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= HEX_INTEGER && LA35_0 <= IDENTIFIER)||LA35_0==INTEGER||LA35_0==LIST||LA35_0==MAP||LA35_0==OPTIONAL||LA35_0==REQUIRED||LA35_0==SET||(LA35_0 >= TYPE_BINARY && LA35_0 <= TYPE_STRING)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Thrift.g:185:18: field
					{
					pushFollow(FOLLOW_field_in_throws_list1353);
					field103=field();
					state._fsp--;

					stream_field.add(field103.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			char_literal104=(Token)match(input,62,FOLLOW_62_in_throws_list1356);  
			stream_62.add(char_literal104);

			// AST REWRITE
			// elements: field, THROWS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 185:29: -> ^( THROWS ( field )* )
			{
				// Thrift.g:185:32: ^( THROWS ( field )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_THROWS.nextNode(), root_1);
				// Thrift.g:185:41: ( field )*
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
	// Thrift.g:189:1: type_annotations : '(' ( type_annotation )* ')' -> ^( TYPES ( type_annotation )* ) ;
	public final ThriftParser.type_annotations_return type_annotations() throws RecognitionException {
		ThriftParser.type_annotations_return retval = new ThriftParser.type_annotations_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope type_annotation106 =null;

		CommonTree char_literal105_tree=null;
		CommonTree char_literal107_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_type_annotation=new RewriteRuleSubtreeStream(adaptor,"rule type_annotation");

		try {
			// Thrift.g:190:5: ( '(' ( type_annotation )* ')' -> ^( TYPES ( type_annotation )* ) )
			// Thrift.g:190:7: '(' ( type_annotation )* ')'
			{
			char_literal105=(Token)match(input,61,FOLLOW_61_in_type_annotations1383);  
			stream_61.add(char_literal105);

			// Thrift.g:190:11: ( type_annotation )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==IDENTIFIER) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Thrift.g:190:11: type_annotation
					{
					pushFollow(FOLLOW_type_annotation_in_type_annotations1385);
					type_annotation106=type_annotation();
					state._fsp--;

					stream_type_annotation.add(type_annotation106.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			char_literal107=(Token)match(input,62,FOLLOW_62_in_type_annotations1388);  
			stream_62.add(char_literal107);

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
			// 190:32: -> ^( TYPES ( type_annotation )* )
			{
				// Thrift.g:190:35: ^( TYPES ( type_annotation )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPES, "TYPES"), root_1);
				// Thrift.g:190:43: ( type_annotation )*
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
	// Thrift.g:193:1: type_annotation : IDENTIFIER ( '=' annotation_value )? ( list_separator )? -> ^( TYPE IDENTIFIER ( annotation_value )? ) ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_annotation_value=new RewriteRuleSubtreeStream(adaptor,"rule annotation_value");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");

		try {
			// Thrift.g:194:5: ( IDENTIFIER ( '=' annotation_value )? ( list_separator )? -> ^( TYPE IDENTIFIER ( annotation_value )? ) )
			// Thrift.g:194:7: IDENTIFIER ( '=' annotation_value )? ( list_separator )?
			{
			IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_annotation1414);  
			stream_IDENTIFIER.add(IDENTIFIER108);

			// Thrift.g:194:18: ( '=' annotation_value )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==66) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Thrift.g:194:19: '=' annotation_value
					{
					char_literal109=(Token)match(input,66,FOLLOW_66_in_type_annotation1417);  
					stream_66.add(char_literal109);

					pushFollow(FOLLOW_annotation_value_in_type_annotation1419);
					annotation_value110=annotation_value();
					state._fsp--;

					stream_annotation_value.add(annotation_value110.getTree());
					}
					break;

			}

			// Thrift.g:194:42: ( list_separator )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==COMMA||LA38_0==SEMICOLON) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Thrift.g:194:42: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_type_annotation1423);
					list_separator111=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator111.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: annotation_value, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 194:58: -> ^( TYPE IDENTIFIER ( annotation_value )? )
			{
				// Thrift.g:194:61: ^( TYPE IDENTIFIER ( annotation_value )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// Thrift.g:194:79: ( annotation_value )?
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
	// Thrift.g:197:1: annotation_value : ( integer | LITERAL );
	public final ThriftParser.annotation_value_return annotation_value() throws RecognitionException {
		ThriftParser.annotation_value_return retval = new ThriftParser.annotation_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LITERAL113=null;
		ParserRuleReturnScope integer112 =null;

		CommonTree LITERAL113_tree=null;

		try {
			// Thrift.g:198:5: ( integer | LITERAL )
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
					// Thrift.g:198:7: integer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_in_annotation_value1452);
					integer112=integer();
					state._fsp--;

					adaptor.addChild(root_0, integer112.getTree());

					}
					break;
				case 2 :
					// Thrift.g:198:17: LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LITERAL113=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_annotation_value1456); 
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
	// Thrift.g:202:1: field_type : ( base_type | IDENTIFIER | container_type );
	public final ThriftParser.field_type_return field_type() throws RecognitionException {
		ThriftParser.field_type_return retval = new ThriftParser.field_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER115=null;
		ParserRuleReturnScope base_type114 =null;
		ParserRuleReturnScope container_type116 =null;

		CommonTree IDENTIFIER115_tree=null;

		try {
			// Thrift.g:203:5: ( base_type | IDENTIFIER | container_type )
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
					// Thrift.g:203:7: base_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_field_type1474);
					base_type114=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type114.getTree());

					}
					break;
				case 2 :
					// Thrift.g:203:19: IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENTIFIER115=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_type1478); 
					IDENTIFIER115_tree = (CommonTree)adaptor.create(IDENTIFIER115);
					adaptor.addChild(root_0, IDENTIFIER115_tree);

					}
					break;
				case 3 :
					// Thrift.g:203:32: container_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_container_type_in_field_type1482);
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
	// Thrift.g:206:1: base_type : real_base_type ( type_annotations )? ;
	public final ThriftParser.base_type_return base_type() throws RecognitionException {
		ThriftParser.base_type_return retval = new ThriftParser.base_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope real_base_type117 =null;
		ParserRuleReturnScope type_annotations118 =null;


		try {
			// Thrift.g:207:5: ( real_base_type ( type_annotations )? )
			// Thrift.g:207:7: real_base_type ( type_annotations )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_real_base_type_in_base_type1499);
			real_base_type117=real_base_type();
			state._fsp--;

			adaptor.addChild(root_0, real_base_type117.getTree());

			// Thrift.g:207:22: ( type_annotations )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==61) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Thrift.g:207:22: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_base_type1501);
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
	// Thrift.g:210:1: container_type : ( map_type | set_type | list_type ) ( type_annotations )? ;
	public final ThriftParser.container_type_return container_type() throws RecognitionException {
		ThriftParser.container_type_return retval = new ThriftParser.container_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope map_type119 =null;
		ParserRuleReturnScope set_type120 =null;
		ParserRuleReturnScope list_type121 =null;
		ParserRuleReturnScope type_annotations122 =null;


		try {
			// Thrift.g:211:5: ( ( map_type | set_type | list_type ) ( type_annotations )? )
			// Thrift.g:211:7: ( map_type | set_type | list_type ) ( type_annotations )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// Thrift.g:211:7: ( map_type | set_type | list_type )
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
					// Thrift.g:211:8: map_type
					{
					pushFollow(FOLLOW_map_type_in_container_type1520);
					map_type119=map_type();
					state._fsp--;

					adaptor.addChild(root_0, map_type119.getTree());

					}
					break;
				case 2 :
					// Thrift.g:211:19: set_type
					{
					pushFollow(FOLLOW_set_type_in_container_type1524);
					set_type120=set_type();
					state._fsp--;

					adaptor.addChild(root_0, set_type120.getTree());

					}
					break;
				case 3 :
					// Thrift.g:211:30: list_type
					{
					pushFollow(FOLLOW_list_type_in_container_type1528);
					list_type121=list_type();
					state._fsp--;

					adaptor.addChild(root_0, list_type121.getTree());

					}
					break;

			}

			// Thrift.g:211:41: ( type_annotations )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==61) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Thrift.g:211:41: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_container_type1531);
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
	// Thrift.g:214:1: map_type : MAP ( cpp_type )? '<' field_type COMMA field_type '>' -> ^( MAP field_type field_type ( cpp_type )? ) ;
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
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:215:5: ( MAP ( cpp_type )? '<' field_type COMMA field_type '>' -> ^( MAP field_type field_type ( cpp_type )? ) )
			// Thrift.g:215:7: MAP ( cpp_type )? '<' field_type COMMA field_type '>'
			{
			MAP123=(Token)match(input,MAP,FOLLOW_MAP_in_map_type1549);  
			stream_MAP.add(MAP123);

			// Thrift.g:215:11: ( cpp_type )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==72) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Thrift.g:215:11: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_map_type1551);
					cpp_type124=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type124.getTree());
					}
					break;

			}

			char_literal125=(Token)match(input,65,FOLLOW_65_in_map_type1554);  
			stream_65.add(char_literal125);

			pushFollow(FOLLOW_field_type_in_map_type1556);
			field_type126=field_type();
			state._fsp--;

			stream_field_type.add(field_type126.getTree());
			COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_type1558);  
			stream_COMMA.add(COMMA127);

			pushFollow(FOLLOW_field_type_in_map_type1560);
			field_type128=field_type();
			state._fsp--;

			stream_field_type.add(field_type128.getTree());
			char_literal129=(Token)match(input,67,FOLLOW_67_in_map_type1562);  
			stream_67.add(char_literal129);

			// AST REWRITE
			// elements: MAP, field_type, field_type, cpp_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 215:57: -> ^( MAP field_type field_type ( cpp_type )? )
			{
				// Thrift.g:215:60: ^( MAP field_type field_type ( cpp_type )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_MAP.nextNode(), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:215:88: ( cpp_type )?
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
	// Thrift.g:218:1: set_type : SET ( cpp_type )? '<' field_type '>' -> ^( SET field_type ( cpp_type )? ) ;
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
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:219:5: ( SET ( cpp_type )? '<' field_type '>' -> ^( SET field_type ( cpp_type )? ) )
			// Thrift.g:219:7: SET ( cpp_type )? '<' field_type '>'
			{
			SET130=(Token)match(input,SET,FOLLOW_SET_in_set_type1592);  
			stream_SET.add(SET130);

			// Thrift.g:219:11: ( cpp_type )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==72) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Thrift.g:219:11: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_set_type1594);
					cpp_type131=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type131.getTree());
					}
					break;

			}

			char_literal132=(Token)match(input,65,FOLLOW_65_in_set_type1597);  
			stream_65.add(char_literal132);

			pushFollow(FOLLOW_field_type_in_set_type1599);
			field_type133=field_type();
			state._fsp--;

			stream_field_type.add(field_type133.getTree());
			char_literal134=(Token)match(input,67,FOLLOW_67_in_set_type1601);  
			stream_67.add(char_literal134);

			// AST REWRITE
			// elements: SET, cpp_type, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 219:40: -> ^( SET field_type ( cpp_type )? )
			{
				// Thrift.g:219:43: ^( SET field_type ( cpp_type )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:219:60: ( cpp_type )?
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
	// Thrift.g:222:1: list_type : LIST '<' field_type '>' ( cpp_type )? -> ^( LIST field_type ( cpp_type )? ) ;
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
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// Thrift.g:223:5: ( LIST '<' field_type '>' ( cpp_type )? -> ^( LIST field_type ( cpp_type )? ) )
			// Thrift.g:223:7: LIST '<' field_type '>' ( cpp_type )?
			{
			LIST135=(Token)match(input,LIST,FOLLOW_LIST_in_list_type1629);  
			stream_LIST.add(LIST135);

			char_literal136=(Token)match(input,65,FOLLOW_65_in_list_type1631);  
			stream_65.add(char_literal136);

			pushFollow(FOLLOW_field_type_in_list_type1633);
			field_type137=field_type();
			state._fsp--;

			stream_field_type.add(field_type137.getTree());
			char_literal138=(Token)match(input,67,FOLLOW_67_in_list_type1635);  
			stream_67.add(char_literal138);

			// Thrift.g:223:31: ( cpp_type )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==72) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Thrift.g:223:31: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_list_type1637);
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
			// 223:41: -> ^( LIST field_type ( cpp_type )? )
			{
				// Thrift.g:223:44: ^( LIST field_type ( cpp_type )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST.nextNode(), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// Thrift.g:223:62: ( cpp_type )?
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
	// Thrift.g:226:1: cpp_type : 'cpp_type' LITERAL -> ^( CPP_TYPE LITERAL ) ;
	public final ThriftParser.cpp_type_return cpp_type() throws RecognitionException {
		ThriftParser.cpp_type_return retval = new ThriftParser.cpp_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal140=null;
		Token LITERAL141=null;

		CommonTree string_literal140_tree=null;
		CommonTree LITERAL141_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");

		try {
			// Thrift.g:227:5: ( 'cpp_type' LITERAL -> ^( CPP_TYPE LITERAL ) )
			// Thrift.g:227:7: 'cpp_type' LITERAL
			{
			string_literal140=(Token)match(input,72,FOLLOW_72_in_cpp_type1666);  
			stream_72.add(string_literal140);

			LITERAL141=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_type1668);  
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
			// 227:26: -> ^( CPP_TYPE LITERAL )
			{
				// Thrift.g:227:29: ^( CPP_TYPE LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CPP_TYPE, "CPP_TYPE"), root_1);
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
	// Thrift.g:231:1: const_value : ( integer | DOUBLE | LITERAL | IDENTIFIER | const_list | const_map );
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
			// Thrift.g:232:5: ( integer | DOUBLE | LITERAL | IDENTIFIER | const_list | const_map )
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
			case 68:
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
					// Thrift.g:232:7: integer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_in_const_value1694);
					integer142=integer();
					state._fsp--;

					adaptor.addChild(root_0, integer142.getTree());

					}
					break;
				case 2 :
					// Thrift.g:232:17: DOUBLE
					{
					root_0 = (CommonTree)adaptor.nil();


					DOUBLE143=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_const_value1698); 
					DOUBLE143_tree = (CommonTree)adaptor.create(DOUBLE143);
					adaptor.addChild(root_0, DOUBLE143_tree);

					}
					break;
				case 3 :
					// Thrift.g:232:26: LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LITERAL144=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_const_value1702); 
					LITERAL144_tree = (CommonTree)adaptor.create(LITERAL144);
					adaptor.addChild(root_0, LITERAL144_tree);

					}
					break;
				case 4 :
					// Thrift.g:232:36: IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_value1706); 
					IDENTIFIER145_tree = (CommonTree)adaptor.create(IDENTIFIER145);
					adaptor.addChild(root_0, IDENTIFIER145_tree);

					}
					break;
				case 5 :
					// Thrift.g:232:49: const_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_const_list_in_const_value1710);
					const_list146=const_list();
					state._fsp--;

					adaptor.addChild(root_0, const_list146.getTree());

					}
					break;
				case 6 :
					// Thrift.g:232:62: const_map
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_const_map_in_const_value1714);
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
	// Thrift.g:235:1: integer : ( INTEGER | HEX_INTEGER );
	public final ThriftParser.integer_return integer() throws RecognitionException {
		ThriftParser.integer_return retval = new ThriftParser.integer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set148=null;

		CommonTree set148_tree=null;

		try {
			// Thrift.g:236:5: ( INTEGER | HEX_INTEGER )
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
	// Thrift.g:253:1: const_list : '[' ( const_value ( list_separator )? )* ']' -> ^( LIST ( const_value )* ) ;
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
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");

		try {
			// Thrift.g:254:5: ( '[' ( const_value ( list_separator )? )* ']' -> ^( LIST ( const_value )* ) )
			// Thrift.g:254:7: '[' ( const_value ( list_separator )? )* ']'
			{
			char_literal149=(Token)match(input,68,FOLLOW_68_in_const_list1864);  
			stream_68.add(char_literal149);

			// Thrift.g:254:11: ( const_value ( list_separator )? )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==DOUBLE||(LA49_0 >= HEX_INTEGER && LA49_0 <= IDENTIFIER)||(LA49_0 >= INTEGER && LA49_0 <= LCURLY)||LA49_0==LITERAL||LA49_0==68) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Thrift.g:254:12: const_value ( list_separator )?
					{
					pushFollow(FOLLOW_const_value_in_const_list1867);
					const_value150=const_value();
					state._fsp--;

					stream_const_value.add(const_value150.getTree());
					// Thrift.g:254:24: ( list_separator )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==COMMA||LA48_0==SEMICOLON) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// Thrift.g:254:24: list_separator
							{
							pushFollow(FOLLOW_list_separator_in_const_list1869);
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

			char_literal152=(Token)match(input,69,FOLLOW_69_in_const_list1874);  
			stream_69.add(char_literal152);

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
			// 254:46: -> ^( LIST ( const_value )* )
			{
				// Thrift.g:254:49: ^( LIST ( const_value )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);
				// Thrift.g:254:56: ( const_value )*
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
	// Thrift.g:257:1: const_map_entry : k= const_value ':' v= const_value ( list_separator )? -> ^( ENTRY $k $v) ;
	public final ThriftParser.const_map_entry_return const_map_entry() throws RecognitionException {
		ThriftParser.const_map_entry_return retval = new ThriftParser.const_map_entry_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal153=null;
		ParserRuleReturnScope k =null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope list_separator154 =null;

		CommonTree char_literal153_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");

		try {
			// Thrift.g:258:5: (k= const_value ':' v= const_value ( list_separator )? -> ^( ENTRY $k $v) )
			// Thrift.g:258:7: k= const_value ':' v= const_value ( list_separator )?
			{
			pushFollow(FOLLOW_const_value_in_const_map_entry1902);
			k=const_value();
			state._fsp--;

			stream_const_value.add(k.getTree());
			char_literal153=(Token)match(input,64,FOLLOW_64_in_const_map_entry1904);  
			stream_64.add(char_literal153);

			pushFollow(FOLLOW_const_value_in_const_map_entry1908);
			v=const_value();
			state._fsp--;

			stream_const_value.add(v.getTree());
			// Thrift.g:258:39: ( list_separator )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==COMMA||LA50_0==SEMICOLON) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Thrift.g:258:39: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_const_map_entry1910);
					list_separator154=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator154.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: v, k
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
			// 258:55: -> ^( ENTRY $k $v)
			{
				// Thrift.g:258:58: ^( ENTRY $k $v)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENTRY, "ENTRY"), root_1);
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
	// Thrift.g:261:1: const_map : LCURLY ( const_map_entry )* RCURLY -> ^( MAP ( const_map_entry )* ) ;
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
			// Thrift.g:262:5: ( LCURLY ( const_map_entry )* RCURLY -> ^( MAP ( const_map_entry )* ) )
			// Thrift.g:262:7: LCURLY ( const_map_entry )* RCURLY
			{
			LCURLY155=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_const_map1940);  
			stream_LCURLY.add(LCURLY155);

			// Thrift.g:262:14: ( const_map_entry )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==DOUBLE||(LA51_0 >= HEX_INTEGER && LA51_0 <= IDENTIFIER)||(LA51_0 >= INTEGER && LA51_0 <= LCURLY)||LA51_0==LITERAL||LA51_0==68) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// Thrift.g:262:14: const_map_entry
					{
					pushFollow(FOLLOW_const_map_entry_in_const_map1942);
					const_map_entry156=const_map_entry();
					state._fsp--;

					stream_const_map_entry.add(const_map_entry156.getTree());
					}
					break;

				default :
					break loop51;
				}
			}

			RCURLY157=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_const_map1945);  
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
			// 262:38: -> ^( MAP ( const_map_entry )* )
			{
				// Thrift.g:262:41: ^( MAP ( const_map_entry )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);
				// Thrift.g:262:47: ( const_map_entry )*
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
	// Thrift.g:265:1: list_separator : ( COMMA | SEMICOLON );
	public final ThriftParser.list_separator_return list_separator() throws RecognitionException {
		ThriftParser.list_separator_return retval = new ThriftParser.list_separator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set158=null;

		CommonTree set158_tree=null;

		try {
			// Thrift.g:266:5: ( COMMA | SEMICOLON )
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
	// Thrift.g:269:1: real_base_type : ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY );
	public final ThriftParser.real_base_type_return real_base_type() throws RecognitionException {
		ThriftParser.real_base_type_return retval = new ThriftParser.real_base_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set159=null;

		CommonTree set159_tree=null;

		try {
			// Thrift.g:270:5: ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY )
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



	public static final BitSet FOLLOW_header_in_document384 = new BitSet(new long[]{0x04012C24040A0100L,0x00000000000002C0L});
	public static final BitSet FOLLOW_definition_in_document387 = new BitSet(new long[]{0x04012C20000A0100L});
	public static final BitSet FOLLOW_EOF_in_document390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_include_in_header420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespace_in_header424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cpp_include_in_header428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include445 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LITERAL_in_include447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_dpackage472 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_dpackage476 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_dpackage478 = new BitSet(new long[]{0x04012C60000A0100L});
	public static final BitSet FOLLOW_definition_in_dpackage480 = new BitSet(new long[]{0x04012C60000A0100L});
	public static final BitSet FOLLOW_RCURLY_in_dpackage483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_in_namespace513 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_namespace515 = new BitSet(new long[]{0x0000000082000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_namespace526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_in_namespace544 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace548 = new BitSet(new long[]{0x0000000082000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_namespace559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_namespace580 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_namespace601 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_cpp_include631 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_include633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dpackage_in_definition659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_rule_in_definition663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedef_in_definition667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_rule_in_definition671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_senum_in_definition675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_in_definition679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_in_definition683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exception_in_definition687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_service_in_definition691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_const_rule708 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_const_rule710 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_rule712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_const_rule714 = new BitSet(new long[]{0x000000009B008000L,0x0000000000000010L});
	public static final BitSet FOLLOW_const_value_in_const_rule716 = new BitSet(new long[]{0x0000020000000042L});
	public static final BitSet FOLLOW_list_separator_in_const_rule718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEDEF_in_typedef756 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_typedef758 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_typedef760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_in_enum_rule787 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_rule789 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_enum_rule791 = new BitSet(new long[]{0x0000004002000000L});
	public static final BitSet FOLLOW_enum_field_in_enum_rule793 = new BitSet(new long[]{0x0000004002000000L});
	public static final BitSet FOLLOW_RCURLY_in_enum_rule796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_field824 = new BitSet(new long[]{0x0000020000000042L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_enum_field827 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_integer_in_enum_field829 = new BitSet(new long[]{0x0000020000000042L});
	public static final BitSet FOLLOW_list_separator_in_enum_field833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SENUM_in_senum860 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_senum862 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_senum864 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_LITERAL_in_senum867 = new BitSet(new long[]{0x0000024080000040L});
	public static final BitSet FOLLOW_list_separator_in_senum869 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_RCURLY_in_senum874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRUCT_in_struct902 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct904 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_struct906 = new BitSet(new long[]{0x03FC10D14B000000L});
	public static final BitSet FOLLOW_field_in_struct908 = new BitSet(new long[]{0x03FC10D14B000000L});
	public static final BitSet FOLLOW_RCURLY_in_struct911 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_struct913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union945 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_union947 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_union949 = new BitSet(new long[]{0x03FC10D14B000000L});
	public static final BitSet FOLLOW_field_in_union951 = new BitSet(new long[]{0x03FC10D14B000000L});
	public static final BitSet FOLLOW_RCURLY_in_union954 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_union956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCEPTION_in_exception988 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exception990 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_exception992 = new BitSet(new long[]{0x03FC10D14B000000L});
	public static final BitSet FOLLOW_field_in_exception994 = new BitSet(new long[]{0x03FC10D14B000000L});
	public static final BitSet FOLLOW_RCURLY_in_exception997 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_exception999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERVICE_in_service1031 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service1035 = new BitSet(new long[]{0x0000000010100000L});
	public static final BitSet FOLLOW_EXTENDS_in_service1038 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service1042 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LCURLY_in_service1046 = new BitSet(new long[]{0x0BFC104942041020L});
	public static final BitSet FOLLOW_function_in_service1050 = new BitSet(new long[]{0x0BFC104942041020L});
	public static final BitSet FOLLOW_RCURLY_in_service1053 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_service1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_field_id1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_field_id1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_id_in_field1124 = new BitSet(new long[]{0x03FC109142000000L});
	public static final BitSet FOLLOW_field_req_in_field1127 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_field1130 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field1132 = new BitSet(new long[]{0x2000020000000042L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_field1135 = new BitSet(new long[]{0x000000009B008000L,0x0000000000000010L});
	public static final BitSet FOLLOW_const_value_in_field1137 = new BitSet(new long[]{0x2000020000000042L});
	public static final BitSet FOLLOW_type_annotations_in_field1141 = new BitSet(new long[]{0x0000020000000042L});
	public static final BitSet FOLLOW_list_separator_in_field1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_mode_in_function1222 = new BitSet(new long[]{0x0BFC100142000000L});
	public static final BitSet FOLLOW_function_type_in_function1225 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function1227 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_function1229 = new BitSet(new long[]{0x43FC10914B000000L});
	public static final BitSet FOLLOW_field_in_function1231 = new BitSet(new long[]{0x43FC10914B000000L});
	public static final BitSet FOLLOW_62_in_function1234 = new BitSet(new long[]{0x2000420000000042L});
	public static final BitSet FOLLOW_throws_list_in_function1236 = new BitSet(new long[]{0x2000020000000042L});
	public static final BitSet FOLLOW_type_annotations_in_function1239 = new BitSet(new long[]{0x0000020000000042L});
	public static final BitSet FOLLOW_list_separator_in_function1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_type_in_function_type1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_function_type1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROWS_in_throws_list1349 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_throws_list1351 = new BitSet(new long[]{0x43FC10914B000000L});
	public static final BitSet FOLLOW_field_in_throws_list1353 = new BitSet(new long[]{0x43FC10914B000000L});
	public static final BitSet FOLLOW_62_in_throws_list1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_type_annotations1383 = new BitSet(new long[]{0x4000000002000000L});
	public static final BitSet FOLLOW_type_annotation_in_type_annotations1385 = new BitSet(new long[]{0x4000000002000000L});
	public static final BitSet FOLLOW_62_in_type_annotations1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_annotation1414 = new BitSet(new long[]{0x0000020000000042L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_type_annotation1417 = new BitSet(new long[]{0x0000000089000000L});
	public static final BitSet FOLLOW_annotation_value_in_type_annotation1419 = new BitSet(new long[]{0x0000020000000042L});
	public static final BitSet FOLLOW_list_separator_in_type_annotation1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_annotation_value1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_annotation_value1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_field_type1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field_type1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_container_type_in_field_type1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_base_type_in_base_type1499 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_base_type1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_type_in_container_type1520 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_set_type_in_container_type1524 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_list_type_in_container_type1528 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_container_type1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAP_in_map_type1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
	public static final BitSet FOLLOW_cpp_type_in_map_type1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_map_type1554 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_map_type1556 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_map_type1558 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_map_type1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_map_type1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_type1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
	public static final BitSet FOLLOW_cpp_type_in_set_type1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_set_type1597 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_set_type1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_set_type1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list_type1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_list_type1631 = new BitSet(new long[]{0x03FC100142000000L});
	public static final BitSet FOLLOW_field_type_in_list_type1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_list_type1635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_cpp_type_in_list_type1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_cpp_type1666 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_type1668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_const_value1694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_const_value1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_const_value1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_value1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_list_in_const_value1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_map_in_const_value1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_const_list1864 = new BitSet(new long[]{0x000000009B008000L,0x0000000000000030L});
	public static final BitSet FOLLOW_const_value_in_const_list1867 = new BitSet(new long[]{0x000002009B008040L,0x0000000000000030L});
	public static final BitSet FOLLOW_list_separator_in_const_list1869 = new BitSet(new long[]{0x000000009B008000L,0x0000000000000030L});
	public static final BitSet FOLLOW_69_in_const_list1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_const_map_entry1904 = new BitSet(new long[]{0x000000009B008000L,0x0000000000000010L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry1908 = new BitSet(new long[]{0x0000020000000042L});
	public static final BitSet FOLLOW_list_separator_in_const_map_entry1910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_const_map1940 = new BitSet(new long[]{0x000000409B008000L,0x0000000000000010L});
	public static final BitSet FOLLOW_const_map_entry_in_const_map1942 = new BitSet(new long[]{0x000000409B008000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RCURLY_in_const_map1945 = new BitSet(new long[]{0x0000000000000002L});
}
