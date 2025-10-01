public class StripeAdapter implements Payment {
    private StripePayment stripe;

    public StripeAdapter(StripePayment stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        int amountInCents = (int)(amount * 100);
        stripe.makePayment(amountInCents);
    }
}
