import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("First");
      case 2:
        System.out.println("Second");
        break;
      case 3:
        System.out.println("Third");
      default:
        System.out.println("Wrong Choice");
    }
    sc.close();
  }
}
