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
/*
 * NOTE: 1 byte = 8 bits
 * NOTE: 1 Kilo = 2^10
 * NOTE: 1 Mega = 2^20
 * NOTE: 1 Giga = 2^30
 * NOTE: 1 Tera = 2 ^40
 * NOTE: 1 TB = 2^10 * 1GB
 * ======================> 2 ^40 Bytes
 * NOTE: 1 GB = 2^30 * 8 bits
 * 
 * TODO :
 * 1] Bypte means 8 bits ... MSB is Sign and next 7 bits for Magnitude
 */
