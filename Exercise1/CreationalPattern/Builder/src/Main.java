import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PizzaDirector director = new PizzaDirector();

        System.out.println("Choose Pizza Type:");
        System.out.println("1. Margherita");
        System.out.println("2. Pepperoni");
        int choice = sc.nextInt();

        PizzaBuilder builder;

        switch (choice) {
            case 1 -> builder = new MargheritaPizzaBuilder();
            case 2 -> builder = new PepperoniPizzaBuilder();
            default -> {
                System.out.println("Invalid choice!");
                sc.close();
                return;
            }
        }

        director.setBuilder(builder);
        Pizza pizza = director.constructPizza();
        pizza.showPizza();

        sc.close();
    }
}
