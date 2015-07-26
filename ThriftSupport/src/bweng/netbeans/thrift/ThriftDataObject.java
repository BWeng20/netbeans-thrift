/* 
 * Copyright (c) 2015 Bernd Wengenroth
 * 
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift;

import bweng.netbeans.thrift.nodes.ThriftChildFactory;
import bweng.netbeans.thrift.nodes.ThriftNode;
import org.netbeans.api.project.Project; 
import bweng.thrift.parser.ThriftLexer;
import bweng.thrift.parser.ThriftModelGenerator;
import bweng.thrift.parser.model.ThriftDocument;
import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.Lookup.Result;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@Messages({
    "LBL_Thrift_LOADER=Files of Thrift"
})
@MIMEResolver.ExtensionRegistration(
        displayName = "#LBL_Thrift_LOADER",
        mimeType = "text/x-thrift",
        extension = {"thrift"},
        position = 300
)
@DataObject.Registration(
        mimeType = "text/x-thrift",
        iconBase = "bweng/netbeans/thrift/resources/Thrift.png",
        displayName = "#LBL_Thrift_LOADER",
        position = 300
)

/**
 * Data Object Node to represent a Thrift file.
 * @author Bernd Wengenroth
 */
public class ThriftDataObject extends MultiDataObject {

    public final static String mime_type = "text/x-thrift";
    
    private ThriftDocument doc_;
    
    Result<Project> projectsInLookup; 
    
    public ThriftDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-thrift", true);        
    }

    @Override
    protected int associateLookup() 
    {
        return 1;
    }

    @MultiViewElement.Registration(
            displayName = "#LBL_Thrift_EDITOR",
            iconBase = "bweng/netbeans/thrift/resources/Thrift.png",
            mimeType = "text/x-thrift",
            persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
            preferredID = "Thrift",
            position = 1000
    )
    
    @Messages("LBL_Thrift_EDITOR=Source")
    public static MultiViewEditorElement createEditor(Lookup lkp) {
        return new MultiViewEditorElement(lkp);
    }
    
    @Override 
    protected Node createNodeDelegate() 
    { 
        return new ThriftNode(this, 
                Children.create(new ThriftChildFactory(this), true),
                getLookup()); 
    }   
    
    public void refresh()
    {
       doc_ = null;
    }
        
    public synchronized ThriftDocument getDocument()
    {
       if ( null == doc_ )
       {
         FileObject fObj = getPrimaryFile();      
         try
         {
            ThriftLexer lex = new ThriftLexer(new ANTLRInputStream(fObj.getInputStream()));
            doc_ = new ThriftModelGenerator().generateModel( fObj.getName(), lex );
            if ( doc_ != null) doc_.ospath_ = fObj.getPath();
         }
         catch (IOException ex)
         {
            // ex.printStackTrace();
         }
       }
       return doc_;
    }

}
