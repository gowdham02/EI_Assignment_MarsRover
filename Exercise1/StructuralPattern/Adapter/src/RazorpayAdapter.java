public class RazorpayAdapter implements Payment {
    private RazorpayPayment razorpay;

    public RazorpayAdapter(RazorpayPayment razorpay) {
        this.razorpay = razorpay;
    }

    @Override
    public void processPayment(double amount) {
        razorpay.payAmount(amount);
    }
}
