public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
