package part2.decorator;

public class CoffeeWithSugerDecorator implements Coffee {
    private Coffee coffee;
    private int suger;
    public CoffeeWithSugerDecorator(Coffee coffee){
        this.coffee = coffee;
        this.suger = 0;
    }
    public CoffeeWithSugerDecorator(Coffee coffee, int suger){
        this.coffee = coffee;
        this.suger = suger;
    }
    public void addSuger(int amount){
        this.suger += suger;
    }
    @Override
    public void drinkCoffee() {
        coffee.drinkCoffee();
        if (suger < 5){
            System.out.println("Not very good");
        } else if (suger < 20){
            System.out.println("Yummy");
        } else {
            System.out.println("Too sweet");
        }
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + " suger: " + suger + "g";
    }
}
