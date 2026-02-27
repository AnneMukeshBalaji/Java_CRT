package Day9;
import  java.io.*;
public class UppercaseFilterReader extends FilterReader {

  public UppercaseFilterReader(Reader in) {
    super(in);
  }

  @Override
  public int read(char[] cbuf, int off, int len) throws IOException {

    int numChars = super.read(cbuf, off, len);

    if (numChars == -1) {
      return -1;
    }

    for (int i = off; i < off + numChars; i++) {
      if (Character.isLowerCase(cbuf[i])) {
        cbuf[i] = Character.toUpperCase(cbuf[i]);
      }
    }

    return numChars;
  }
}
