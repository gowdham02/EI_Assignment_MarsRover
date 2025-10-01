import java.util.Scanner;

public class NotificationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotificationFactory factory = new NotificationFactory();

        System.out.println("Choose notification type (email/sms/push): ");
        String type = sc.nextLine();

        System.out.println("Enter message to send: ");
        String message = sc.nextLine();

        try {
            Notification notification = factory.createNotification(type);
            notification.notifyUser(message);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
