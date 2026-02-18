import java.util.Scanner;

public class Fibnocci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = 0;
    int y = 1;
    int i = 0;
    System.out.println(x);
    System.out.println(y);
    while (i < N) {
      i = x + y;
      System.out.println(i);
      x = y;
      y = i;
    }
    sc.close();
  }
}
