package Day2;

public class Pattern5 {
  public static void main(String[] args) {
    int count = 0;
    int i, j;
    for (i = 1; i <= 5; i++) {
      if (i % 2 == 0) {
        count = 0;
      } else {
        count = 1;
      }
      for (j = 1; j <= i; j++) {
        if (count % 2 == 0) {
          System.out.print("0 ");
        } else {
          System.out.print("1 ");
        }
        count += 1;
      }
      System.out.println();
    }
  }
}
/*
 *
 * 0
 * 1 0
 * 1 0 1
 * 0 1 0 1
 * 0 1 0 1 0
 *
 *
 *
 * 
 * 
 */
