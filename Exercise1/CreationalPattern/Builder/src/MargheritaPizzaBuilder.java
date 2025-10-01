import java.util.Arrays;

public class MargheritaPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Thin Crust");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(Arrays.asList("Cheese", "Tomato", "Basil"));
    }
}
