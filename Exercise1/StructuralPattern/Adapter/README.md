# Structural Pattern: Adapter

This project demonstrates the Adapter design pattern in Java using a payment processing example. The Adapter pattern allows incompatible interfaces to work together by providing a wrapper that translates one interface to another.

## Project Structure

```
src/
  Payment.java            // Interface for payment methods
  PaymentApp.java         // Main application to test payment adapters
  PayPalAdapter.java      // Adapter for PayPal payment
  PayPalPayment.java      // PayPal payment implementation
  RazorpayAdapter.java    // Adapter for Razorpay payment
  RazorpayPayment.java    // Razorpay payment implementation
  StripeAdapter.java      // Adapter for Stripe payment
  StripePayment.java      // Stripe payment implementation
ClassPng.png              // Class diagram image
```

## How It Works

- `Payment` is a common interface for all payment methods.
- `PayPalPayment`, `RazorpayPayment`, and `StripePayment` are classes with their own interfaces.
- Adapters (`PayPalAdapter`, `RazorpayAdapter`, `StripeAdapter`) implement the `Payment` interface and internally use the respective payment classes.
- `PaymentApp` demonstrates how to use different payment methods through the common `Payment` interface.

## Usage

1. Compile all Java files in the `src` directory:
   ```powershell
   javac src/*.java
   ```
2. Run the main application:
   ```powershell
   java -cp src PaymentApp
   ```

## Class Diagram

See `ClassPng.png` for a visual representation of the class relationships.