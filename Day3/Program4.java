package Day3;

public class Program4 {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int index = 2;
    int value = 99;
    int newarr[] = new int[arr.length + 1];
    for (int i = 0; i < index; i++) {
      newarr[i] = arr[i];
    }
    newarr[index] = value;
    for (int i = index; i < arr.length; i++) {
      newarr[i + 1] = arr[i];
    }
    for (int i = 0; i < newarr.length; i++) {
      System.out.println(newarr[i]);
    }
  }
}
