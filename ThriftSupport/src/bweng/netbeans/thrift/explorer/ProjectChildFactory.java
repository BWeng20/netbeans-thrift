/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.explorer;

import bweng.netbeans.thrift.ThriftDataObject;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 * ChildFactory to create project nodes in ThriftExplorer.
 * @author Bernd Wengenroth
 */
class ProjectChildFactory extends ChildFactory<Project>
{ 
   ArrayList< ProjectChangeListener > projectFCL_ 
      = new ArrayList< ProjectChangeListener >();
   
   @Override
   protected boolean createKeys(List<Project> toPopulate)
   {
      for (ProjectChangeListener pfcl : projectFCL_ )
      {
         pfcl.cleanup();
      }
      projectFCL_.clear();
   
      OpenProjects op = OpenProjects.getDefault();
      Project projects[] = op.getOpenProjects();
      for ( Project p : projects )
      {
         projectFCL_.add( new ProjectChangeListener( p ) );
         toPopulate.add(p);
      }
      return true;
   }
   
   /**
    * Creates a Project Node that will later scan the project for thrift files.
    */
   @Override
   protected Node createNodeForKey(Project key)
   {
      return new ProjectNode( key );
   }

   void startUpdate()
   {
      OpenProjects op = OpenProjects.getDefault();
      // Don't know if duplicate lissters can be a issue.
      op.removePropertyChangeListener(projectListener_); 
      op.addPropertyChangeListener(projectListener_);
      openProjects_ = new WeakReference<OpenProjects>(op);
      
      refresh(true); 
   }

   void stopUpdate()
   {
      OpenProjects op = openProjects_.get();
      if ( op != null ) op.removePropertyChangeListener(projectListener_);
      openProjects_.clear();
   }
   
   class ProjectsListener implements PropertyChangeListener
   {
      @Override
      public void propertyChange(PropertyChangeEvent pce)
      {
         if ( pce.getPropertyName().equals( OpenProjects.PROPERTY_OPEN_PROJECTS) )
         {
            refresh(true);
         }
      }
   };
   
   final ProjectsListener projectListener_ = new ProjectsListener();
   // Last used instance of "OpenProjects", possible a "WeakReference" is not needed here.
   WeakReference<OpenProjects> openProjects_ = new WeakReference<OpenProjects>(null);
   
}

class ProjectChangeListener implements FileChangeListener, PropertyChangeListener
{
   final WeakReference<Project> projectRef_;
   final WeakReference<FileObject> fileRef_;
   
   ProjectChangeListener( Project project )
   {
      projectRef_ = new WeakReference<Project>(project);
      
      FileObject fo = project.getProjectDirectory();
      fileRef_ = new WeakReference<FileObject>( fo );
      
      ProjectInformation pinfo = ProjectUtils.getInformation(project);
      if ( null != pinfo )
      {
         pinfo.addPropertyChangeListener(this);
      }
      
      fo.addRecursiveListener(this);
   }
   
   void cleanup()
   {
      FileObject fo = fileRef_.get();
      if ( fo != null )
      {
         fo.removeRecursiveListener(this);
      }
      Project p = projectRef_.get();
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
      Project p = projectRef_.get();
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
         syncProject();
      }
   }
}