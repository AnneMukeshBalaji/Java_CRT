package Day7;

public class Main {
  public static void main(String[] args) {
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;

    System.out.println("Addition: " + addition.operation(10, 5)); // Actual values
    System.out.println("Subtraction: " + subtraction.operation(10, 5));
    PaymentProcessor paypalProcessor = new PayPalPaymentProcessor(); // Set<Character> Objset = new HastSet<>();
    PaymentService paymentService = new PaymentService(paypalProcessor);
    paymentService.makePayment("PayPal payment details");

    PaymentProcessor stripeProcessor = new StripePaymentProcessor();
    paymentService = new PaymentService(stripeProcessor);
    paymentService.makePayment("Stripe payment details");
  }
}
