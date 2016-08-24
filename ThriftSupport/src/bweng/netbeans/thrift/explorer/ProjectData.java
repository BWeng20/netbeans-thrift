/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */

package bweng.netbeans.thrift.explorer;

import bweng.netbeans.thrift.ThriftDataObject;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.api.project.ProjectUtils;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.util.ImageUtilities;
import java.awt.Image;

/**
 * Collect project related data for ThriftExplorer.
 * @author Bernd Wengenroth
 */
final class ProjectData implements FileChangeListener, PropertyChangeListener
{
   // Don't know if "weak" this is really needed, but it dones't hurt also.
   final WeakReference<Project> projectref_;
   final WeakReference<FileObject> fileRef_;
  
   Image  icon_;
   String name_;
   
   final Project getProject()
   {
      return projectref_.get();
   }
   
   ProjectData( Project project )
   {
      projectref_ = new  WeakReference<Project>(project);
   
      if ( null != project )
      {
         FileObject fo = project.getProjectDirectory();
         fileRef_ = new WeakReference<FileObject>( fo );

         ProjectInformation pinfo = ProjectUtils.getInformation(project);
         if ( null != pinfo )
         {
            name_ = pinfo.getDisplayName();          
            icon_ = ImageUtilities.icon2Image(pinfo.getIcon());
            
            pinfo.addPropertyChangeListener(this);
            fo.addRecursiveListener(this);
         }
         else
         {
            name_ = "";
            icon_ = ThriftExplorerComponent.getInstance().getThriftIcon();
         }
      }
      else  
      {
         name_ = "";
         icon_ = ThriftExplorerComponent.getInstance().getThriftIcon();
         fileRef_ = new WeakReference<FileObject>( null );        
      }
   }
   
   void cleanup()
   {
      FileObject fo = fileRef_.get();
      if ( fo != null )
      {
         fo.removeRecursiveListener(this);
      }
      Project p = getProject();
      if ( null != p )
      {
         ProjectInformation pinfo = ProjectUtils.getInformation(p);
         if ( pinfo != null )
         {
            pinfo.removePropertyChangeListener(this);
         }
      }
   }
   
   void syncProject()
   {
      Project p = getProject();
      if ( p != null )
      {
         ThriftExplorerComponent.getInstance().refreshProject(p);
      }
   }

   @Override
   public void fileFolderCreated(FileEvent fe)
   {
   }

   @Override
   public void fileDataCreated(FileEvent fe)
   {
      FileObject fo = fe.getFile();
      if ( (fo != null) && (fo.getMIMEType().equals( ThriftDataObject.mime_type)) )
      {
         syncProject();
      }
   }

   @Override
   public void fileChanged(FileEvent fe)
   {
      FileObject fo = fe.getFile();
      if ( (fo != null) && (fo.getMIMEType().equals( ThriftDataObject.mime_type)) )
      {
         syncProject();
      }
   }

   @Override
   public void fileDeleted(FileEvent fe)
   {
      FileObject fo = fe.getFile();
      if ( (fo != null) && (fo.getMIMEType().equals( ThriftDataObject.mime_type)) )
      {
         syncProject();
      }
   }

   @Override
   public void fileRenamed(FileRenameEvent fe)
   {
      FileObject fo = fe.getFile();
      if ( (fo != null) && (fo.getMIMEType().equals( ThriftDataObject.mime_type)) )
      {
         syncProject();
      }
   }

   @Override
   public void fileAttributeChanged(FileAttributeEvent fe)
   {
   }

   @Override
   public void propertyChange(PropertyChangeEvent pce)
   {
      if ( pce.getPropertyName().equals( ProjectInformation.PROP_DISPLAY_NAME ))
      {
         name_ = pce.getNewValue().toString();
         ThriftExplorerComponent.getInstance().setProjectDisplayname( getProject(), name_ );
      }
   }   
}
