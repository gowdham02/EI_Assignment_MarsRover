import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept only valid integer amount
        int amount = 0;
        while (true) {
            System.out.println("Enter payment amount (integer only):");
            if (sc.hasNextInt()) {
                amount = sc.nextInt();
                if (amount > 0) break; // valid amount
                else System.out.println("Amount must be greater than 0.");
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); // clear invalid input
            }
        }

        sc.nextLine(); // consume newline

        // Accept only valid payment method
        String method = "";
        while (true) {
            System.out.println("Choose payment method: paypal / stripe / razorpay");
            method = sc.nextLine().toLowerCase();

            if (method.equals("paypal") || method.equals("stripe") || method.equals("razorpay")) {
                break; // valid choice
            } else {
                System.out.println("Invalid option! Please choose a valid payment method.");
            }
        }

        // Select adapter based on method
        Payment payment;
        switch (method) {
            case "paypal" -> payment = new PayPalAdapter(new PayPalPayment());
            case "stripe" -> payment = new StripeAdapter(new StripePayment());
            case "razorpay" -> payment = new RazorpayAdapter(new RazorpayPayment());
            default -> throw new IllegalStateException("Unexpected value: " + method);
        }

        // Process payment
        payment.processPayment(amount);

        sc.close();
    }
}
