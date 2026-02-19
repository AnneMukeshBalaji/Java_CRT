package Day2;

public class Pattern8 {
  public static void main(String[] args) {
    int n = 5; // height of pyramid
    for (int i = 1; i <= n; i++) {
      // print spaces
      for (int j = i; j < n; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
