package Day8;

import java.util.ArrayList;

public class ListInJava {
  public static void main(String[] args) {
    // NOTE: Creating a ArratList Data Structure
    ArrayList<String> arrayString = new ArrayList<>();
    // NOTE: Adding Elements to the ArrayList
    arrayString.add("Diet");
    arrayString.add("Value1");
    arrayString.add("Value2");
    arrayString.add("Value3");
    // NOTE: printing array list
    System.out.println("Values in the ArrayList");
    System.out.println(arrayString);
    // NOTE: Traversing The ArrayList
    System.out.println("Traversing Using the For Each Loop : ");
    for (String e : arrayString) {
      System.out.println(e);
    }
    // NOTE: Accessing Elements in the ArrayList [With Index]
    System.out.println("Element at the index 2 : " + arrayString.get(2));
    // NOTE: Inserting the Elements
    arrayString.add(2, "New Value 2 ");
    System.out.println("After Inserting New Value");
    System.out.println(arrayString);
    // NOTE: Removing Element
    arrayString.remove(2);
  }
}
