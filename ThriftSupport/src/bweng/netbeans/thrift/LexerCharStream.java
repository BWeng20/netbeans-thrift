/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bweng.netbeans.thrift;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.CharStream;
import org.netbeans.spi.lexer.LexerInput;


public class LexerCharStream implements CharStream {

    private class CharStreamState 
    {
        int index;
        int line;
        int charPositionInLine;
    }

    private int line_ = 1;
    private int charPositionInLine_ = 0;
    private LexerInput input_;
    private String name_;
    private int index_ = 0;
    private List<CharStreamState> markers;
    private int markDepth_ = 0;
    private int lastMarker_;

    private boolean ignoreCase_ = false;

    public LexerCharStream(LexerInput input, String name, boolean ignoreCase) 
    {
        this.input_ = input;
        this.name_ = name;
        this.ignoreCase_ = ignoreCase;
    }

    @Override
    public String substring(int start, int stop) {
        System.out.println(" substring( "+start+","+stop+")");
        return ""; // input_.readText(start, stop).toString();
    }

    @Override
    public int LT(int i) {
        return LA(i);
    }

    @Override
    public int getLine() {
        return line_;
    }

    @Override
    public void setLine(int line) {
        this.line_ = line;
    }

    @Override
    public void setCharPositionInLine(int pos) {
        this.charPositionInLine_ = pos;
    }

    @Override
    public int getCharPositionInLine() {
        return charPositionInLine_;
    }

    @Override
    public void consume() {
        int c = input_.read();
        index_++;
        charPositionInLine_++;

        if (c == '\n') {
            line_++;
            charPositionInLine_ = 0;
        }
    }

    @Override
    public int LA(int i) 
    {
        if (i == 0) {
            return 0; // undefined
        }

        int c = 0;
        for (int j = 0; j < i; j++) {
            c = read();
        }
        backup(i);

        if (ignoreCase_ && (c != -1)){
            return Character.toLowerCase((char)c);
        } else {
            return c;
        }
    }

    @Override
    public int mark() {
        if (markers == null) {
            markers = new ArrayList<CharStreamState>();
            markers.add(null); // depth 0 means no backtracking, leave blank
        }
        markDepth_++;
        CharStreamState state = null;
        if (markDepth_ >= markers.size()) {
            state = new CharStreamState();
            markers.add(state);
        } else {
            state = markers.get(markDepth_);
        }
        state.index = index_;
        state.line = line_;
        state.charPositionInLine = charPositionInLine_;
        lastMarker_ = markDepth_;

        return markDepth_;
    }

    @Override
    public void rewind() {
        rewind(lastMarker_);
    }

    @Override
    public void rewind(int marker) {
        CharStreamState state = markers.get(marker);
        // restore stream state
        seek(state.index);
        line_ = state.line;
        charPositionInLine_ = state.charPositionInLine;
        release(marker);
    }

    @Override
    public void release(int marker) {
        // unwind any other markers made after m and release m
        markDepth_ = marker;
        // release this marker
        markDepth_--;
    }

    @Override
    public void seek(int index) {
        if (index < this.index_) {
            backup(this.index_ - index);
            this.index_ = index; // just jump; don't update stream state (line_, ...)
            return;
        }

        // seek forward, consume until p hits index
        while (this.index_ < index) {
            consume();
        }
    }

    @Override
    public int index() {
        return index_;
    }

    @Override
    public int size() {
        return -1; //unknown...
    }

    @Override
    public String getSourceName() {
        return name_;
    }

    private int read() {
        int result = input_.read();
        if (result == LexerInput.EOF) {
            result = CharStream.EOF;
        }

        return result;
    }

    private void backup(int count) {
        input_.backup(count);
    }    
}
