package Day3;

import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] str_arr = new String[2][2];
    System.out.println("Enter 4 Strings : ");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        str_arr[i][j] = sc.nextLine();
      }
    }
    System.out.println("Given Matrix is : ");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(str_arr[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
