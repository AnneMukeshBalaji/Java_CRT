package Day5;

public class AccessPrivateData {
  public static void main(String[] args) {
    EncapsulationJava ej = new EncapsulationJava();
    int data = 20;
    ej.setData(data);
    System.out.println(ej.getData());
  }
}
