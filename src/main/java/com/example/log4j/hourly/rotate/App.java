package com.example.log4j.hourly.rotate;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.lang.Thread;
import java.lang.InterruptedException;

/**
 * Hello world!
 *
 */
public class App {
    
    private Logger logger = Logger.getLogger(App.class);

    public App() {
        PropertyConfigurator.configure("src/test/resources/log4j_hourly.properties");
    }
    
    public void printDebug(String message) {
        logger.debug(message);
    }

    public static void main( String[] args ) throws InterruptedException {
        App app = new App();
        
        for(int i=0;i<50;i++) {
            app.printDebug("Goodbye old system!");
            Thread.sleep(5000);
        }
    }
}
