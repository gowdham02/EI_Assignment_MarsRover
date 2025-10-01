import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Choose strategy
        System.out.println("Choose sorting strategy:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        int choice = sc.nextInt();

        Sorter sorter = new Sorter();

        switch (choice) {
            case 1 -> sorter.setStrategy(new BubbleSort());
            case 2 -> sorter.setStrategy(new QuickSort());
            case 3 -> sorter.setStrategy(new MergeSort());
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        sorter.sortArray(arr);
        sc.close();
    }
}
