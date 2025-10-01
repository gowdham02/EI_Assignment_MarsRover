# Factory Design Pattern Example

This project demonstrates the Factory Design Pattern in Java using a simple notification system. The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Project Structure

```
src/
  EmailNotification.java
  Notification.java
  NotificationApp.java
  NotificationFactory.java
  PushNotification.java
  SMSNotification.java
ClassPng.png
```

- `Notification.java`: Interface for notification types.
- `EmailNotification.java`: Implementation of email notification.
- `SMSNotification.java`: Implementation of SMS notification.
- `PushNotification.java`: Implementation of push notification.
- `NotificationFactory.java`: Factory class to create notification objects based on input.
- `NotificationApp.java`: Main application to demonstrate usage of the factory.
- `ClassPng.png`: Class diagram for the project.

## How It Works

1. The user specifies the type of notification (Email, SMS, or Push).
2. The `NotificationFactory` creates the appropriate notification object.
3. The application sends the notification using the created object.

## Usage

To run the application:

1. Compile all Java files in the `src` directory:
   ```
   javac src/*.java
   ```
2. Run the main application:
   ```
   java -cp src NotificationApp
   ```

## Example Output

```
Enter the type of notification (EMAIL, SMS, PUSH): EMAIL
Sending an Email Notification
```

## Diagram

See `ClassPng.png` for the class diagram illustrating the Factory Pattern implementation.