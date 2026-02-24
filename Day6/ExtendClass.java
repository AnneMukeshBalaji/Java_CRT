package Day6;

public class ExtendClass extends SingleInheritance {
  ExtendClass(String name) {
    super(name); // It uses parent Animal's - due to super.
  }

  // Method specific to Dog
  public void bark() {
    System.out.println(getName() + " is barking.");
  }
}
