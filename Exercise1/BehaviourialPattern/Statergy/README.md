# Strategy Pattern Sorting Algorithms

This project demonstrates the Strategy design pattern in Java by implementing multiple sorting algorithms. The Strategy pattern allows you to select an algorithm's behavior at runtime.

## Project Structure

- `src/SortStrategy.java` — Interface for sorting strategies.
- `src/BubbleSort.java` — Bubble Sort implementation.
- `src/QuickSort.java` — Quick Sort implementation.
- `src/MergeSort.java` — Merge Sort implementation.
- `src/Sorter.java` — Context class that uses a sorting strategy.
- `src/Main.java` — Main class to run and test the sorting strategies.
- `ClassPng.png` — Class diagram for the project.

## How It Works

- The `SortStrategy` interface defines a method for sorting arrays.
- Each sorting algorithm implements `SortStrategy`.
- The `Sorter` class uses a `SortStrategy` to sort data.
- You can switch sorting algorithms at runtime by changing the strategy in `Sorter`.

## Usage

1. Compile all Java files in the `src` directory:
   ```powershell
   javac src/*.java
   ```
2. Run the main program:
   ```powershell
   java -cp src Main
   ```
3. The program will demonstrate sorting an array using different strategies.

## Example Output
```
Original array: [5, 2, 9, 1, 5, 6]
BubbleSort: [1, 2, 5, 5, 6, 9]
QuickSort: [1, 2, 5, 5, 6, 9]
MergeSort: [1, 2, 5, 5, 6, 9]
```

## Class Diagram
See `ClassPng.png` for a visual representation of the class relationships.


