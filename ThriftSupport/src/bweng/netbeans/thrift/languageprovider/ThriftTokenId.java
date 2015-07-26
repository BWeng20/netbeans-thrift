/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.languageprovider;

import bweng.thrift.parser.ThriftParser;
import org.netbeans.api.lexer.TokenId;

public final class ThriftTokenId implements TokenId
{
    private final String name_;
    private final String primaryCategory_;
    private final int id_;
    
    // Categories
    public final static String KEYWORD    = "keyword";
    public final static String NUMBER     = "number";
    public final static String IDENTIFIER = "identifier";
    public final static String COMMENT    = "comment";
    public final static String SEPARATROR = "separator";
    public final static String WHITESPACE = "whitespace";
    public final static String OPERATOR   = "operator";
    public final static String DEFAULT    = "default";
    
    public ThriftTokenId(            
            int id,
            String primaryCategory  ) 
    {
        name_ = ThriftParser.tokenNames[id];
        primaryCategory_ = primaryCategory;
        id_ = id;
    }
    
    public ThriftTokenId(
            String name,
            String primaryCategory,
            int id) 
    {
        name_ = name;
        primaryCategory_ = primaryCategory;
        id_ = id;
    }
    
    @Override
    public String name() { return name_;  }

    @Override
    public int ordinal() { return id_; }

    @Override
    public String primaryCategory() { return primaryCategory_; }
    
}
