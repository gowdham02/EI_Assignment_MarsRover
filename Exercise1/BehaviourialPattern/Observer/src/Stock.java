import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String stockName;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(); 
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, price);
        }
    }

    public String getStockName() {
        return stockName;
    }
}
