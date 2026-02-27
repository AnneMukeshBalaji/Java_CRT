package Day9;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    File f = new File("sample.txt");
    if (f.exists() && f.canRead()) {
      try (BufferedReader br = new BufferedReader(new FileReader(f))) {
        String line;
        while ((line = br.readLine()) != null) {
          System.out.println(line);
        }
      } catch (FileNotFoundException ex) {
        System.out.println("Can't open " + f.getName());
      } catch (IOException e) {
        System.out.println("IO Error occurred");
      }
    } else {
      System.out.println("File does not exist or cannot be read.");
    }
  }
}