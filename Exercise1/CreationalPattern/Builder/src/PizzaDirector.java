public class PizzaDirector {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza constructPizza() {
        builder.buildSize();
        builder.buildCrust();
        builder.buildToppings();
        return builder.getPizza();
    }
}
