/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.languageprovider;

import bweng.netbeans.thrift.ThriftDataObject;
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
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath lang, InputAttributes attr ) 
    {
        return null;
    }
    
}
