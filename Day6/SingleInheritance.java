package Day6;

public class SingleInheritance {
  private String name;

  // Constructor - Instead of the Member method setName
  SingleInheritance(String name) {
    this.name = name;
  }

  // Member Method
  public void eat() {
    System.out.println(name + " is eating.");
  }

  // Getter method // Member Method
  public String getName() {
    return name;
  }
}
