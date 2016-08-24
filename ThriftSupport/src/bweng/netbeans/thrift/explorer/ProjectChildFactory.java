/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.explorer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.java.classpath.GlobalPathRegistryEvent;
import org.netbeans.api.java.classpath.GlobalPathRegistryListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 * ChildFactory to create project nodes in ThriftExplorer.
 * @author Bernd Wengenroth
 */
class ProjectChildFactory extends ChildFactory<ProjectData>
   implements GlobalPathRegistryListener
{ 
   ArrayList< ProjectData > projects_ = new ArrayList< ProjectData >();
   
   @Override
   protected boolean createKeys(List<ProjectData> toPopulate)
   {
      OpenProjects op = OpenProjects.getDefault();
      Project projects[] = op.getOpenProjects();

      ArrayList<ProjectData> pl = projects_;
      projects_= new ArrayList<ProjectData>(projects.length);
      
      for (Project p : projects )
      {
         ProjectData pd = null;
         for (int i=0 ; i<pl.size(); ++i )
         {
            if ( p == pl.get(i).getProject() )
            {
               pd = pl.remove(i);
               break;
            }
         }
         if ( null == pd )
            pd = new ProjectData(p);
         projects_.add(pd);
      }
      // Clean-up deprecated proejct data elements
      for (ProjectData pd : pl )
         pd.cleanup();
   
      for ( ProjectData pd : projects_ )
      {
         toPopulate.add( pd );
      }
      return true;
   }
   
   /**
    * Creates a Project Node that will later scan the project for thrift files.
    */
   @Override
   protected Node createNodeForKey(ProjectData key)
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
   
      GlobalPathRegistry gpr = GlobalPathRegistry.getDefault();
      if (gpr != null )
      {
         gpr.addGlobalPathRegistryListener(this);
         System.out.println("paths "+ gpr.getSourceRoots() );

      }
      refresh(true); 
   }

   void stopUpdate()
   {
      GlobalPathRegistry gpr = GlobalPathRegistry.getDefault();
      if (gpr != null ) gpr.removeGlobalPathRegistryListener(this);
      OpenProjects op = openProjects_.get();
      if ( op != null ) op.removePropertyChangeListener(projectListener_);
      openProjects_.clear();
   }

   @Override
   public void pathsAdded(GlobalPathRegistryEvent event)
   {
      System.out.println("pathAdded "+ event.getChangedPaths() );
   }

   @Override
   public void pathsRemoved(GlobalPathRegistryEvent event)
   {
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
