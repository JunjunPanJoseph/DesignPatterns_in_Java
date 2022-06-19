package part2.singleton;

public class Main {
    public static void main(String[] args) {
        Config config = Config.getConfig();
        System.out.println("#Epochs: " + config.getEpochs());
        System.out.println("BatchSize: " + config.getBatchSize());
        System.out.println("Get config again...");
        Config config2 = Config.getConfig();

    }
}
