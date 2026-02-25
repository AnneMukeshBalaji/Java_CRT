package Day7;

class StripePaymentProcessor implements PaymentProcessor {
  @Override
  public void processPayment(String paymentDetails) {
    System.out.println("Processing payment through Stripe: " + paymentDetails);
  }
}
