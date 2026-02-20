package Day3;

public class Program5 {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40 };
    int index = 2;
    if (index > arr.length) {
      System.out.println("NO Such Index");
    } else {
      for (int i = index; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
      }
      arr[arr.length - 1] = -1;
      for (int i : arr) {
        System.out.println(i);
      }
    }
  }
}
