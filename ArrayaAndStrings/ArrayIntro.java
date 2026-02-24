package ArrayaAndStrings;

import java.util.ArrayList;

public class ArrayIntro {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    // NOTE: the time complexity is O(1)
    System.out.println("Index Value of 2 : " + arr[2]);
    // NOTE: O(n) Traversal
    for (int i : arr) {
      System.out.println(i);
    }
    // NOTE: O(n) Linear Search
    int target = 100;
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        index = i;
        break;
      }
    }
    System.out.println("Target Index : " + index);

    // TODO: Create a Array of size 6 and store first 6 even numbers
    // NOTE: Since Array itself does not have add method i am usign array List
    ArrayList<Integer> evenArr = new ArrayList<>();
    for (int i : arr) {
      if (i % 2 == 0) {
        evenArr.add(Integer.valueOf(i));
      }
    }
    System.out.println(evenArr);
    System.out.println(evenArr.get(2));
    evenArr.remove(2);

    System.out.println(evenArr + " \nSize of List :" + evenArr.size());
  }
}
