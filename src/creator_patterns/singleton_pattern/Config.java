package part2.singleton;
// Singleton: we want this class only have one instance
// We don't want it can be created for multiple times
public class Config {
    private static Config configInstance = null;
    private int epochs = 100;
    private int batchSize = 30;

    private Config(){
        System.out.println("Initializing Config...");
    }
    public static Config getConfig(){
        // Lazy initializaton
        if (configInstance == null){
            synchronized (Config.class) {
                if (configInstance == null) {
                    configInstance = new Config();
                }
            }
        }
        return configInstance;
    }
    public int getEpochs(){
        return epochs;
    }
    public int getBatchSize(){
        return batchSize;
    }
}
