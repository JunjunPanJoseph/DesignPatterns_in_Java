package part2.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        System.out.println("Ingredients: " + coffee.getIngredients());
        coffee.drinkCoffee();

        coffee = new CoffeeWithSugerDecorator(coffee, 15);
        coffee.drinkCoffee();

        CoffeeWithIce coffeeWithIce = new CoffeeWithIce(coffee);
        coffeeWithIce.drinkCoffee();
        coffeeWithIce.addIce();
        coffeeWithIce.drinkCoffee();
        System.out.println(coffeeWithIce.getIngredients());
    }
}
