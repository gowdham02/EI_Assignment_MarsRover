import java.util.Arrays;

public class PepperoniPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Cheese Burst");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(Arrays.asList("Cheese", "Pepperoni", "Olives"));
    }
}
