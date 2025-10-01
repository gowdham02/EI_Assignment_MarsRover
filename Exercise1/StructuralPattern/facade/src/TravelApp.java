import java.util.Scanner;

public class TravelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelFacade travelFacade = new TravelFacade();

        // Departure city validation
        String from;
        while (true) {
            System.out.println("Enter departure city:");
            from = sc.nextLine().trim();
            if (from.matches("[a-zA-Z ]+") && !from.isEmpty()) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid city name (letters only).");
            }
        }

        // Destination city validation
        String to;
        while (true) {
            System.out.println("Enter destination city:");
            to = sc.nextLine().trim();
            if (to.matches("[a-zA-Z ]+") && !to.isEmpty()) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid city name (letters only).");
            }
        }

        // Hotel nights validation
        int hotelNights = 0;
        while (true) {
            System.out.println("Enter number of hotel nights:");
            if (sc.hasNextInt()) {
                hotelNights = sc.nextInt();
                if (hotelNights > 0) {
                    break;
                } else {
                    System.out.println("Number of nights must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); // clear invalid input
            }
        }

        // Car rental days validation
        int carDays = 0;
        while (true) {
            System.out.println("Enter number of car rental days:");
            if (sc.hasNextInt()) {
                carDays = sc.nextInt();
                if (carDays > 0) {
                    break;
                } else {
                    System.out.println("Number of rental days must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); // clear invalid input
            }
        }

        // Call Facade method
        travelFacade.bookTrip(from, to, hotelNights, carDays);

        sc.close();
    }
}
