package part2.decorator;

public class CoffeeWithIce implements Coffee{
    public Coffee coffee;
    private boolean ice = false;
    public CoffeeWithIce(Coffee coffee){
        this.coffee = coffee;
    }
    // Decorator can add new behavior to the class.
    public void addIce(){
        this.ice = true;
    }

    @Override
    public void drinkCoffee() {
        if (ice){
            System.out.print("Drink cold coffee");
            coffee.drinkCoffee();
        } else {
            System.out.print("Drink hot coffee");
            coffee.drinkCoffee();
        }
    }

    @Override
    public String getIngredients() {
        if (ice){
            return coffee.getIngredients() + " Ice";
        }
        return coffee.getIngredients();
    }
}
