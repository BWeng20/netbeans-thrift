/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bweng.netbeans.thrift;

import bweng.thrift.parser.ThriftLexer;
import bweng.thrift.parser.ThriftModelGenerator;
import bweng.thrift.parser.model.ThriftDocument;
import bweng.thrift.parser.model.ThriftPackage;
import java.io.IOException;
import java.util.List;
import org.antlr.runtime.ANTLRInputStream;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
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
        iconBase = "bweng/netbeans/thrift/Thrift.png",
        displayName = "#LBL_Thrift_LOADER",
        position = 300
)

public class ThriftDataObject extends MultiDataObject {

    public final static String mime_type = "text/x-thrift";
    
    public ThriftDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-thrift", true);
    }

    @Override
    protected int associateLookup() {
        return 1;
    }

    @MultiViewElement.Registration(
            displayName = "#LBL_Thrift_EDITOR",
            iconBase = "bweng/netbeans/thrift/Thrift.png",
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
        return new DataNode(this, 
                Children.create(new ThriftDataObject.ThriftChildFactory(this), true),
                getLookup()); 
    }    
    
    private static class ThriftChildFactory extends ChildFactory<String> implements FileChangeListener
    {

        private final ThriftDataObject dObj;

        public ThriftChildFactory(ThriftDataObject dObj) 
        {
            this.dObj = dObj;
            
            dObj.getPrimaryFile().addFileChangeListener(this);
            
        }

        @Override
        protected boolean createKeys(List<String> list) {

            FileObject fObj = dObj.getPrimaryFile();
            try {
                ThriftLexer lex = new ThriftLexer(new ANTLRInputStream(fObj.getInputStream()));
                ThriftDocument doc = new ThriftModelGenerator().generateModel(lex);
                
                for (int i=0 ; i<doc.packages_.size() ; ++i )
                {
                    ThriftPackage pack = doc.packages_.get(i);
                    for (int si=0 ; si<pack.services_.size() ; ++si )
                    {
                        list.add( pack.name_+"."+pack.services_.get(si).name_);
                    }
                }
            
                // list.addAll(dObjContent);
            } catch (IOException ex) {
                ex.printStackTrace();
            } 
            return true;
        }

        @Override
        protected Node createNodeForKey(String key) 
        {
            Node childNode = new AbstractNode(Children.LEAF);
            childNode.setDisplayName(key);
                  
            return childNode;
        }


      @Override
      public void fileFolderCreated(FileEvent fe)
      {
         System.out.println("fileFolderCreated "+fe);
      }

      @Override
      public void fileDataCreated(FileEvent fe)
      {
         System.out.println("fileDataCreated "+fe);
      }

      @Override
      public void fileChanged(FileEvent fe)
      {
         System.out.println("fileChanged "+fe);
         refresh(true);
      }

      @Override
      public void fileDeleted(FileEvent fe)
      {
         System.out.println("fileDeleted "+fe);
      }

      @Override
      public void fileRenamed(FileRenameEvent fe)
      {
         System.out.println("fileRenamed "+fe);         
      }

      @Override
      public void fileAttributeChanged(FileAttributeEvent fe)
      {
         System.out.println("fileAttributeChanged "+fe);
       
      }
        
    }

}
