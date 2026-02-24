package ArrayaAndStrings;

public class LargestNumber {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 45, 6, 234, 621, 8 };
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    System.out.println(largest);

  }
}
