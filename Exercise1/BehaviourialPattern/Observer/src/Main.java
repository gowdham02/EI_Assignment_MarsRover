import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stock name input
        System.out.print("Enter stock name: ");
        String stockName = sc.nextLine().trim();

        // Initial stock price validation
        double price = 0;
        while (true) {
            System.out.print("Enter initial stock price (positive number): ");
            if (sc.hasNextDouble()) {
                price = sc.nextDouble();
                if (price >= 0) break;
                else System.out.println("Price cannot be negative!");
            } else {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); // clear invalid input
            }
        }
        sc.nextLine(); // consume newline

        Stock stock = new Stock(stockName, price);

        // Number of investors validation
        int n = 0;
        while (true) {
            System.out.print("Enter number of investors (positive integer): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Number of investors must be greater than 0!");
            } else {
                System.out.println("Invalid input! Enter an integer.");
                sc.next(); // clear invalid input
            }
        }
        sc.nextLine(); // consume newline

        // Register investors
        for (int i = 0; i < n; i++) {
            System.out.print("Enter investor " + (i + 1) + " name: ");
            String name = sc.nextLine().trim();
            Investor investor = new Investor(name);
            stock.registerObserver(investor);
        }

        // Number of price updates validation
        int updates = 0;
        while (true) {
            System.out.print("Enter number of price updates (positive integer): ");
            if (sc.hasNextInt()) {
                updates = sc.nextInt();
                if (updates > 0) break;
                else System.out.println("Number of updates must be greater than 0!");
            } else {
                System.out.println("Invalid input! Enter an integer.");
                sc.next(); // clear invalid input
            }
        }

        // Update stock prices
        for (int i = 0; i < updates; i++) {
            double newPrice = -1;
            while (true) {
                System.out.print("Enter new stock price (positive number): ");
                if (sc.hasNextDouble()) {
                    newPrice = sc.nextDouble();
                    if (newPrice >= 0) break;
                    else System.out.println("Price cannot be negative!");
                } else {
                    System.out.println("Invalid input! Enter a number.");
                    sc.next(); // clear invalid input
                }
            }
            stock.setPrice(newPrice);
        }

        sc.close();
    }
}
