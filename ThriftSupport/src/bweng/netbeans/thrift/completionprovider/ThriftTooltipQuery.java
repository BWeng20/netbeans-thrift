/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.completionprovider;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.openide.util.Exceptions;

class ThriftTooltipQuery extends AsyncCompletionQuery
{
   @Override
   protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) 
   {
      try
      {
         if ( null != document )
            System.out.println("TooltripQuery - "+ document.getText(caretOffset, 10 )+ " @"+caretOffset);
         else
            System.out.println("Tooltip Document null");
  }
      catch (BadLocationException ex)
      {
         Exceptions.printStackTrace(ex);
      }
      ThriftTooltipCompletionItem item = new ThriftTooltipCompletionItem("Test",caretOffset);
      completionResultSet.addItem(item);
      completionResultSet.finish();     
   } 
}
