package Day7;

class PayPalPaymentProcessor implements PaymentProcessor {
  @Override
  public void processPayment(String paymentDetails) {
    System.out.println("Processing payment through PayPal: " + paymentDetails);
  }
}
