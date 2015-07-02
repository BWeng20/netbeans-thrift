package bweng.thrift.parser;

import bweng.thrift.parser.model.ThriftDocument;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;

public class ThriftParserMain {
        
    public static void main(String[] args) throws RecognitionException 
    {
        try {
            ThriftModelGenerator gen = new ThriftModelGenerator();
            ThriftDocument doc = gen.loadDocument(args[0]);
            gen.loadIncludes( doc );            
            
            System.out.println(doc.toString() );

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
