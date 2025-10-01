# Travel Booking Facade Example

This project demonstrates the Facade Design Pattern in Java using a travel booking scenario. The Facade pattern provides a simplified interface to a complex subsystem, making it easier for clients to interact with the system.

## Structure

- `src/CarBooking.java`: Handles car booking operations.
- `src/FlightBooking.java`: Handles flight booking operations.
- `src/HotelBooking.java`: Handles hotel booking operations.
- `src/TravelFacade.java`: The Facade class that provides a unified interface for booking travel (car, flight, hotel).
- `src/TravelApp.java`: The client application that uses the `TravelFacade` to book travel.
- `ClassPng.png`: Class diagram illustrating the structure of the project.

## How It Works

The client (`TravelApp`) interacts only with the `TravelFacade`, which internally manages the car, flight, and hotel bookings. This hides the complexity of the subsystem and provides a simple method for booking all travel arrangements.

## Usage

1. Compile all Java files in the `src` directory:
   ```powershell
   cd src
   javac *.java
   ```
2. Run the application:
   ```powershell
   java TravelApp
   ```

## Diagram

Refer to `ClassPng.png` for a visual representation of the class structure and relationships.