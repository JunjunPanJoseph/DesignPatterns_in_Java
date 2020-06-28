package misc.design_principle.no4_prog_to_interface;

public class Timer {
    /*
    int getTime(Dog dog, int distance){
        return distance / dog.runningSpeed();
    }
    int getTime(Cat cat, int distance){
        return distance / cat.runningSpeed();
    }
    */
    int getTime(Runnable runnable, int distance){
        return distance / runnable.runningSpeed();
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Timer timer = new Timer();
        System.out.println("Time required for cat run 15m: " + timer.getTime(cat, 15));
        System.out.println("Time required for dog run 15m: " + timer.getTime(dog, 15));
    }
}
