package Day5;

public class ConstructorOverloading {
  String name;
  int age;

  // No-argument constructor or Zero argument
  ConstructorOverloading() {
    name = "Unknown";
    age = 0;
  }

  // Constructor with one parameter
  ConstructorOverloading(String n) {
    name = n;
    age = 0;
  }

  // Constructor with two parameters
  ConstructorOverloading(String n, int a) {
    name = n;
    age = a;
  }

  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }

  public static void main(String[] args) {
    // Using different constructors
    ConstructorOverloading s1 = new ConstructorOverloading();
    ConstructorOverloading s2 = new ConstructorOverloading("Vijay");
    ConstructorOverloading s3 = new ConstructorOverloading("Arun", 21);

    // Display results
    s1.display();
    s2.display();
    s3.display();

  }
}
