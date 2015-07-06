package bweng.netbeans.thrift;

import java.util.List;
import bweng.thrift.parser.model.*;
import org.openide.filesystems.*;
import org.openide.nodes.*;

/**
 *
 * @author Bernd Wengenroth
 */
class ThriftChildFactory extends ThriftSubChildFactory implements FileChangeListener
{
   private final ThriftDataObject dObj;

   public ThriftChildFactory(ThriftDataObject dObj)
   {
      super( null );
      this.dObj = dObj;
      dObj.getPrimaryFile().addFileChangeListener(this);
   }

   @Override
   protected boolean createKeys(List<ThriftObject> list)
   {
      ThriftDocument doc = dObj.getDocument();
      if ( null != doc )
      {
         if ( 0<doc.packages_.size() )
         {
            // DAI Mode...
            for (ThriftPackage pk : doc.packages_)
            {
               if ( pk.name_.isEmpty() )
               {
                  for (ThriftService s : pk.services_)
                     list.add( s );                     
               }
               else
                  list.add( pk );
            }
         }
         else
         {
            for (ThriftService s : doc.services_)
               list.add( s );                     
         }
      }      
      return true;
   }   
   
   @Override
   public void fileFolderCreated(FileEvent fe)
   {
      System.out.println("fileFolderCreated " + fe);
   }

   @Override
   public void fileDataCreated(FileEvent fe)
   {
      System.out.println("fileDataCreated " + fe);
   }

   @Override
   public void fileChanged(FileEvent fe)
   {
      System.out.println("fileChanged " + fe);
      dObj.refresh();
      refresh(true);
   }

   @Override
   public void fileDeleted(FileEvent fe)
   {
      System.out.println("fileDeleted " + fe);
   }

   @Override
   public void fileRenamed(FileRenameEvent fe)
   {
      System.out.println("fileRenamed " + fe);
   }

   @Override
   public void fileAttributeChanged(FileAttributeEvent fe)
   {
      System.out.println("fileAttributeChanged " + fe);
   }
   
}
