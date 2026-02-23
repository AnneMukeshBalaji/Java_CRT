package Day5;

public class EncapsulationJava {
  private int data;
  private String name;

  public void setData(int data) {
    this.data = data;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getData() {
    return this.data;
  }

  public String getName() {
    return this.name;
  }
}

// NOTE: Encapsulation Means it Encapuslates the Date the private data cannot be
// asscessed from other class
// NOTE: To asscesse the priavte Data you can use get and Set methods they only
// assign the copy value
//
