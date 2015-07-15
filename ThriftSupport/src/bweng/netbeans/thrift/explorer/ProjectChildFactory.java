/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.explorer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 * ChildFactory to create project nodes in ThriftExplorer.
 * @author Bernd Wengenroth
 */
class ProjectChildFactory extends ChildFactory<Project>
{
  
   @Override
   protected boolean createKeys(List<Project> toPopulate)
   {
      OpenProjects op = OpenProjects.getDefault();
      Project projects[] = op.getOpenProjects();
      for ( Project p : projects )
      {
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
      // Don't know if duplicat elisnsters can be a issue.
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
         System.out.println("ThriftExplorerTopComponent pop changed");
         refresh(true);
      }
   };
   
   final ProjectsListener projectListener_ = new ProjectsListener();
   // Last used instance of "OpenProjects", possible a "WeakReference" is not needed here.
   WeakReference<OpenProjects> openProjects_ = new WeakReference<OpenProjects>(null);
   
}
