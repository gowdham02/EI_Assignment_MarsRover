public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Hello " + name + ", " + stockName + " price updated to $" + price);
    }

    public String getName() {
        return name;
    }
}
