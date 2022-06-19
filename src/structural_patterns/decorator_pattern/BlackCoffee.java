package part2.decorator;

public class BlackCoffee implements Coffee {
    @Override
    public void drinkCoffee() {
        System.out.println("Drink black coffee");
    }

    @Override
    public String getIngredients() {
        return "Black coffee";
    }
}
