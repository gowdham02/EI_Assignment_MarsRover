public class PayPalAdapter implements Payment {
    private PayPalPayment paypal;

    public PayPalAdapter(PayPalPayment paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}
