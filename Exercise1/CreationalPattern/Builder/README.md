# Builder Design Pattern - Pizza Example

This project demonstrates the **Builder** creational design pattern in Java using a pizza ordering scenario. The Builder pattern is used to construct complex objects step by step, allowing for more readable and maintainable code when creating objects with many optional parameters.

## Structure

- `src/Main.java`: Entry point of the application. Demonstrates usage of the builder pattern to create different types of pizzas.
- `src/Pizza.java`: Represents the product being built (Pizza).
- `src/PizzaBuilder.java`: Abstract builder class defining the steps to build a pizza.
- `src/MargheritaPizzaBuilder.java`: Concrete builder for Margherita pizza.
- `src/PepperoniPizzaBuilder.java`: Concrete builder for Pepperoni pizza.
- `src/PizzaDirector.java`: Director class that defines the order of building steps.

## How It Works

1. **Builder Classes**: Each pizza type has its own builder class that implements the steps to create that specific pizza.
2. **Director**: The `PizzaDirector` controls the construction process, ensuring the correct sequence of steps.
3. **Main**: The main class demonstrates how to use the director and builders to create pizzas.

## Usage

1. Compile the project:
   ```powershell
   cd src
   javac *.java
   ```
2. Run the main class:
   ```powershell
   java Main
   ```

## Output

The program will print details of the pizzas created using the builder pattern.

