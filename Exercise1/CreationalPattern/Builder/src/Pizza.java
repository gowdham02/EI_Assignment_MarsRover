import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private List<String> toppings;

    public void setSize(String size) {
        this.size = size;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void showPizza() {
        System.out.println("Pizza Details:");
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Toppings: " + toppings);
        System.out.println("-------------------------");
    }
}
