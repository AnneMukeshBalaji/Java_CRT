package ArrayaAndStrings;

public class LeftRotateArrayByOne {

  public static void soluction(int[] arr) {
    int temp = arr[0];
    int i;
    for (i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[i - 1] = temp;

    System.out.println("Array After Left Rotating By One");
    for (int k = 0; k < arr.length; k++) {
      System.out.print(arr[k]);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    soluction(arr);
  }
}
