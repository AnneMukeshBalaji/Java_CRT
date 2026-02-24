package ArrayaAndStrings;

public class CheckIfTheArrayIsSorted {
  public static boolean soluction(int n, int[] arr) {
    // NOTE: Always remember to run the looop upto n-1 if i and j are begng used in
    // a single loop
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 1 };
    int n = 6;
    System.out.println(soluction(n, arr));
  }
}
