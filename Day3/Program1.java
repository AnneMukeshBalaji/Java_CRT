package Day3;

import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    int N;
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Program to Write/Print The Array Elements :");
    System.out.println("Enter the Value of N : ");
    N = sc.nextInt();
    System.out.println("Enter the Array Values : ");
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Given Array :");
    for (int i = 0; i < N; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}
