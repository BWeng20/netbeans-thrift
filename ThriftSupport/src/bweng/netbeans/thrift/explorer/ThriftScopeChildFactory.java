/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.explorer;

import bweng.netbeans.thrift.ThriftDataObject;
import bweng.netbeans.thrift.nodes.ThriftSubChildFactory;
import bweng.thrift.parser.model.ThriftDocument;
import bweng.thrift.parser.model.ThriftObject;
import bweng.thrift.parser.model.ThriftPackage;
import bweng.thrift.parser.model.ThriftScope;
import bweng.thrift.parser.model.ThriftService;
import java.lang.ref.WeakReference;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;


/**
 * Factory used to generate Thrift scope-nodes below project nodes.
 */
public class ThriftScopeChildFactory extends ThriftSubChildFactory
{
   // Don't know if "weak" this is really needed, but it does't hurt also.
   final WeakReference<Project> projectref_;
     
   ThriftScopeChildFactory( Project p )
   {
      super(null);
      projectref_ = new WeakReference<Project>(p);
   }  
   
   private void copyObject( ThriftObject to, ThriftObject from )
   {
      to.column_  = from.column_;
      to.comment_ = from.comment_;
      to.line_    = from.line_;
      to.version_ = from.version_;     
      to.setDocument( from.getDocument() );
   }

   
   private void mergePackage( ThriftPackage to, ThriftPackage from )
   {
      for (ThriftService servFrom : from.services_)
      {
         to.services_.add(servFrom);
      }      
      for (ThriftPackage subpkgFrom : from.subpackages_)
      {
         ThriftPackage subPkgTo = null;
         for (ThriftPackage findsubpkg : to.subpackages_)
         {
            if( findsubpkg.name_.equals( subpkgFrom.name_))
            {
               subPkgTo = findsubpkg;
               break;
            }
         }
         if ( subPkgTo == null )
         {
            subPkgTo = new ThriftPackage();
            copyObject(subPkgTo,subpkgFrom);
            subPkgTo.name_ = subpkgFrom.name_;
            subPkgTo.name_fully_qualified_ = subpkgFrom.name_fully_qualified_;
            to.subpackages_.add(subPkgTo);
         }
         mergePackage( subPkgTo, subpkgFrom );
      }      
   }
   
   @Override
   protected boolean createKeys(List<ThriftObject> toPopulate)
   {
      Project p = projectref_.get();
      if ( null != p )
      {
         Sources s = ProjectUtils.getSources(p);
         SourceGroup groups[] = s.getSourceGroups(Sources.TYPE_GENERIC);
         ArrayList<ThriftDataObject> dobjs = new ArrayList<ThriftDataObject>(200);
         for ( SourceGroup group : groups )
         {
            scanFolder( dobjs, group.getRootFolder() );
         }
         
         HashMap<String,ThriftScope> thriftScopes = new HashMap<String,ThriftScope>();         
         HashMap<String,ThriftPackage> thriftPackages = new HashMap<String,ThriftPackage>();         
         for ( ThriftDataObject dobj : dobjs )
         {
            ThriftDocument doc = dobj.getDocument();
            if ( null != doc )
            {
               // Collect all services without package and create list of scopes.
               for ( ThriftService serv : doc.services_ )
               {
                  String scopeNames[] = serv.name_fully_qualified_.split("\\.");
                  if ( scopeNames.length >= 2 )
                  {
                     ThriftScope to = null;

                     to = thriftScopes.get(scopeNames[0]);
                     if ( null == to )
                     {
                        to = new ThriftScope();
                        to.line_ = 0;
                        to.setDocument(doc);
                        to.name_ = scopeNames[0];
                        to.name_fully_qualified_ = to.name_;
                        thriftScopes.put( to.name_, to);
                     }
                     else
                     {
                        if ( to.getDocument() != doc )
                           to.setDocument(null);
                     }
                     to.services_.add( serv);                     
                  }
               }
               // Collect and merge all top-level packages
               for ( ThriftPackage pkg : doc.all_packages_ )
               {
                  if ( pkg.parent_ == null )
                  {
                     ThriftPackage pkgTo = thriftPackages.get(pkg.name_);
                     if ( null == pkgTo )
                     {
                        pkgTo = new ThriftPackage();
                        copyObject( pkgTo, pkg );
                        pkgTo.name_ = pkg.name_;
                        pkgTo.name_fully_qualified_ = pkg.name_fully_qualified_;
                        thriftPackages.put( pkg.name_, pkgTo);
                     }
                     mergePackage(pkgTo, pkg);
                  }
               }
            }
         }

         Collator collator = Collator.getInstance();

         // Sort and add scopes
         {
            Set<String> scopeNames = thriftScopes.keySet();
            ArrayList<CollationKey> keys = new ArrayList<CollationKey>(scopeNames.size());
            
            for ( String scopeName : scopeNames )
                keys.add( collator.getCollationKey(scopeName) );
            
            Collections.sort(keys);

            for (CollationKey key : keys )
               toPopulate.add( thriftScopes.get(key.getSourceString()) );
         }
         // Sort and add packages
         {
            Set<String> packageNames = thriftPackages.keySet();
            ArrayList<CollationKey> keys = new ArrayList<CollationKey>(packageNames.size());
            
            for ( String packageName : packageNames )
                keys.add( collator.getCollationKey(packageName) );
            
            Collections.sort(keys);

            for (CollationKey key : keys )
               toPopulate.add( thriftPackages.get(key.getSourceString()) );
         }
         
      }
     return true;
   }

   private void scanFolder(List<ThriftDataObject> toPopulate, FileObject folder)
   {
      Enumeration<? extends FileObject> files = folder.getChildren(true);
      while ( files.hasMoreElements() )
      {
         FileObject file  = files.nextElement();

         if ( file.isData() && file.getMIMEType().equals( ThriftDataObject.mime_type ))
         {
            try 
            {
               DataObject dObj = DataObject.find(file);
               if ( dObj instanceof ThriftDataObject )
                  toPopulate.add( (ThriftDataObject)dObj );
            }
            catch (DataObjectNotFoundException ex )
            {
               // System.out.println(" File"+ file.getName()+" has no data object"  );         
            }
         }
      }
   }
   
}
