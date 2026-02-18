import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    if (n % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("Odd Number");
    }
    sc.close();
  }
}
