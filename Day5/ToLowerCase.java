package Day5;

public class ToLowerCase {
  public String toLowerCase(String s) {
    return s.toLowerCase();
  }

  public static void main(String[] args) {
    String s = "Hello";
    ToLowerCase obj = new ToLowerCase();
    System.out.println(obj.toLowerCase(s));
  }
}
