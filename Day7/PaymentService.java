package Day7;

class PaymentService {
  private PaymentProcessor paymentProcessor;

  public PaymentService(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }

  public void makePayment(String paymentDetails) {
    paymentProcessor.processPayment(paymentDetails);
  }
}
