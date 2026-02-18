import java.util.Scanner;

public class ScannerInput {
  public static void main(String[] args) {
    System.out.println("Program to Print first N Odd Numbers");
    System.out.println("Please Enter the value of N : ");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1;
    while (i <= N) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
      i += 1;
    }
    sc.close();
  }
}
