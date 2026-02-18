import java.util.Scanner;

public class PTR {
  public static void main(String[] args) {
    int p, t, r;
    Scanner sc = new Scanner(System.in);
    p = sc.nextInt();
    t = sc.nextInt();
    r = sc.nextInt();
    double SI = (p * t * r) / 100;
    System.out.println(SI);
    sc.close();
  }
}
