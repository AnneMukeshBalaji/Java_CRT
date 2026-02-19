package Day2;

public class Pattern7 {
  public static void main(String[] args) {
    int i, j;
    int n = 5;
    for (i = 1; i <= n; i++) {
      if (i == 1 || i == n) {
        for (j = 1; j <= n; j++) {
          System.out.print("* ");
        }
      } else {
        for (j = 1; j <= n; j++) {
          if (j == 1 || j == n) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
  }
}
