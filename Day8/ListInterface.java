package Day8;

import java.util.List;
import java.util.ArrayList;

public class ListInterface {
  public static void main(String[] args) {

    // NOTE :Creating a List of Strings using ArrayList
    List<String> li = new ArrayList<>();

    // NOTE: Adding elements in List
    li.add("Java");
    li.add("Python");
    li.add("DSA");
    li.add("C++");

    System.out.println("Elements of List are:");

    // NOTE :Iterating through the list
    for (String s : li) {
      System.out.println(s);
    }

    // NOTE: Accessing elements
    System.out.println("Element at Index 1: " + li.get(1));

    // NOTE: Updating elements
    li.set(1, "JavaScript");
    System.out.println("Updated List: " + li);

    // NOTE: Removing elements
    li.remove("C++");
    System.out.println("List After Removing Element: " + li);
  }
}
