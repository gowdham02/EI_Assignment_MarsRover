# Observer Design Pattern - Java Implementation

This project demonstrates the Observer design pattern using Java. The Observer pattern is a behavioral design pattern that allows an object (the subject) to notify other objects (observers) about changes in its state, without coupling them tightly.

## Project Structure

```
src/
  Investor.java      // Concrete observer implementation
  Main.java          // Entry point to run the example
  Observer.java      // Observer interface
  Stock.java         // Concrete subject implementation
  Subject.java       // Subject interface
Classpng.png         // Class diagram image
```

## How It Works
- **Subject**: Maintains a list of observers and notifies them of any state changes.
- **Observer**: Defines an updating interface for objects that should be notified of changes in a subject.
- **Stock**: Concrete implementation of Subject, represents a stock whose price changes.
- **Investor**: Concrete implementation of Observer, represents an investor who gets notified when the stock price changes.
- **Main**: Demonstrates the pattern by creating stocks and investors, and showing notifications on price changes.

## Usage
1. Compile all Java files in the `src` directory:
   ```powershell
   cd src
   javac *.java
   ```
2. Run the main class:
   ```powershell
   java Main
   ```

## Diagram
See `Classpng.png` for a visual representation of the class relationships.

