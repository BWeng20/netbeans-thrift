/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bweng.netbeans.thrift;

import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;

@org.openide.util.lookup.ServiceProvider(service=org.netbeans.spi.lexer.LanguageProvider.class)
public class ThriftLanguageProvider extends LanguageProvider
{

    @Override
    public Language<?> findLanguage(String mimeType) 
    {
        if ( ThriftDataObject.mime_type.equals(mimeType))
        {
           Language<?> l = new ThriftLanguageHierarchy().language();
           return l;
        }
        return null;
    }

    @Override
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> arg0, LanguagePath arg1, InputAttributes arg2) 
    {
        return null;
    }
    
}
