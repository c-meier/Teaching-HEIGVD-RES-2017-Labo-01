package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 * @author Christopher Meier
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
    write(str.toCharArray(), off, len);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    int end = off + len;
    for(int i = off; i < end; i++) {
      cbuf[i] = Character.toUpperCase(cbuf[i]);
    }
    super.write(cbuf, off, len);
  }

  @Override
  public void write(int c) throws IOException {
    super.write(Character.toUpperCase(c));
  }

}
