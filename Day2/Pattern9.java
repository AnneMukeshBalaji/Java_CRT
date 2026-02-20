package Day2;

public class Pattern9 {
  public static void main(String[] args) {
    int count = 1;
    for (int i = 1; i <= 5; i++) {
      for (int k = i; k < 5; k++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= count; j++) {
        System.out.print(i);
      }
      System.out.println();
      count += 2;
    }
  }
}
