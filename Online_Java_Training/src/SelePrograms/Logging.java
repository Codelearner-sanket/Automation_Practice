package SelePrograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {
    public static void main(String[] args) {
        
        // Creating logger instance
        Logger logger = Logger.getLogger("Logging");

        // Configuring log4j properties
        PropertyConfigurator.configure("C:\\Users\\sanket umergi\\eclipse-workspace\\Online_Java_Training\\Repository\\log4j.properties");

        // Sample log statements
        logger.info("Logging initialized successfully.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
    }
}
