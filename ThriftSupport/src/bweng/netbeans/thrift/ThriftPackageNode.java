package bweng.netbeans.thrift;

import bweng.thrift.parser.model.ThriftPackage;
import java.awt.Image;
import org.openide.util.ImageUtilities;

/**
 *
 * @author Bernd Wengenroth
 */
public class ThriftPackageNode extends ThriftBaseNode
{
   public ThriftPackageNode(ThriftPackage pg)
   {
      super(pg);
      setDisplayName( pg.name_ );  
   }
   
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/ThriftPackage.png"); 
    } 
   
}
