public class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] numbers) {
        if (strategy == null) {
            System.out.println("No sorting strategy set!");
            return;
        }
        strategy.sort(numbers);
    }
}
