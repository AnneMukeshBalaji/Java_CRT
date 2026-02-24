package ArrayaAndStrings;

public class SecondLargest {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 5 };
    int largest = arr[0];
    int SecondLargest = -1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        SecondLargest = largest;
        largest = arr[i];
      }
    }
    System.out.println("SecondLargest Element is : " + SecondLargest);
  }
}
