package Day7;

public class Main {
  public static void main(String[] args) {
    // Implementing MathOperation using lambda expression
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;

    System.out.println("Addition: " + addition.operation(10, 5)); // Actual values
    System.out.println("Subtraction: " + subtraction.operation(10, 5));
  }
}
