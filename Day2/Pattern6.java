package Day2;

public class Pattern6 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.printf("%d ", (i + j));
      }
      System.out.println();
    }
  }
}
