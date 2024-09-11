public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.setFileName("new_log.txt");


        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");

        logger.close();
    }
}
