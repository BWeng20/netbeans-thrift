/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.completionprovider;

import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;

/**
 *
 */
@MimeRegistration(mimeType = "text/x-thrift", service = CompletionProvider.class)
public class ThriftCompletionProvider implements CompletionProvider 
{
   @Override
   public CompletionTask createTask(int queryType, JTextComponent jtc)
   {
      if (queryType == CompletionProvider.DOCUMENTATION_QUERY_TYPE) 
      {
         return new AsyncCompletionTask( new ThriftDocumentationQuery() );
      }
      else if (queryType == CompletionProvider.TOOLTIP_QUERY_TYPE) 
      {
         return new AsyncCompletionTask(new ThriftTooltipQuery() );
      }
      else
      {
         return null;
      }
   }

   @Override
   public int getAutoQueryTypes(JTextComponent component, String typedText)
   {
      return DOCUMENTATION_QUERY_TYPE | TOOLTIP_QUERY_TYPE;
   }

}
