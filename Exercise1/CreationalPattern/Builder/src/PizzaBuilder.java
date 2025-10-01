public abstract class PizzaBuilder {
    protected Pizza pizza = new Pizza();

    public abstract void buildSize();
    public abstract void buildCrust();
    public abstract void buildToppings();

    public Pizza getPizza() {
        return pizza;
    }
}
