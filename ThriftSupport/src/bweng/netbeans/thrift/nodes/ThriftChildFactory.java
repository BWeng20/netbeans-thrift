/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.netbeans.thrift.ThriftDataObject;
import java.util.List;
import bweng.thrift.parser.model.*;
import org.openide.filesystems.*;

/**
 * Child Factory used to create the top-level Thrift-Object that 
 * represents a thrift file in project-explorer.
 * *
 * @see ThriftSubChildFactory
 * @author Bernd Wengenroth
 */
public class ThriftChildFactory extends ThriftSubChildFactory implements FileChangeListener
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
         for (ThriftService s : doc.services_)
            if ( s.package_ == null ) list.add( s );
         
         // DAI Mode...
         for (ThriftPackage pk : doc.all_packages_)
         {
            if ( null == pk.parent_ )
               list.add( pk );
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
