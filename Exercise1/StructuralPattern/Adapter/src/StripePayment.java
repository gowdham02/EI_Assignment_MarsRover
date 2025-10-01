public class StripePayment {
    public void makePayment(int amountInCents) {
        System.out.println("Stripe payment of $" + (amountInCents / 100.0) + " processed successfully.");
    }
}
