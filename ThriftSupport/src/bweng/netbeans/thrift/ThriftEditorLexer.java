package bweng.netbeans.thrift;

import bweng.thrift.parser.ThriftLexer;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class ThriftEditorLexer implements Lexer<ThriftTokenId>
{
    private LexerRestartInfo<ThriftTokenId> info_;
    private ThriftLexer lexer_;
    
    public ThriftEditorLexer(LexerRestartInfo<ThriftTokenId> info) 
    {
        info_ = info;
        LexerCharStream charStream = new LexerCharStream(info.input(), "ThriftEditor", false);
        lexer_ = new ThriftLexer(charStream);
    }
    
    @Override
    public Token<ThriftTokenId> nextToken() 
    {
        org.antlr.runtime.Token token = lexer_.nextToken();

        Token<ThriftTokenId> createdToken = null;
        ThriftTokenId tokenId = null;
        if (token.getType() != -1){
            tokenId  = ThriftLanguageHierarchy.getToken(token.getType());
            createdToken = info_.tokenFactory().createToken(tokenId);
        }
        else if(info_.input().readLength() > 0)
        {
            tokenId  = ThriftLanguageHierarchy.getToken(ThriftLexer.WS);
            createdToken = info_.tokenFactory().createToken(tokenId);
        }
if ( tokenId != null )        
    System.err.println("> "+token.getType()+" --> "+tokenId.primaryCategory() +" -> "+createdToken );
        return createdToken;
    }

    @Override
    public Object state() 
    {
        return null;
    }

    @Override
    public void release() 
    {
    }
    
}
