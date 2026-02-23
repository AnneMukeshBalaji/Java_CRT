package Day5;

public class InheritanceClass extends Inheritance {
  int age;

  InheritanceClass(String name, int age) {
    super(name); // calling parent constructor
    this.age = age;
    System.out.println("Student constructor called");
  }

  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }

  public static void main(String[] args) {
    InheritanceClass s1Obj = new InheritanceClass("Vijay", 20);
    s1Obj.display();
  }

}
