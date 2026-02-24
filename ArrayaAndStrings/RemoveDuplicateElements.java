package ArrayaAndStrings;

public class RemoveDuplicateElements { // NOTE: since the array is sorted you can use this method
  public static void soluction(int[] arr) {
    int i = 0;
    int j = 0;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] != arr[j]) { // NOTE: Here you need to use not equals
        arr[j + 1] = arr[i];
        j = j + 1;
      }
    }
    System.out.println("Array After Removing Duplicate Elements");
    for (int k = 0; k <= j && j > 0; k++) {
      System.out.print(arr[k]);
    }
    for (int k = 0; k <= i && j == 0; k++) {
      System.out.print(arr[k]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    soluction(arr);
  }
}
