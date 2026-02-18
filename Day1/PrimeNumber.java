import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i < num - 1; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println("A Prime Number");
    } else {
      System.out.println("Not a Prime Number");
    }
    sc.close();
  }
}
