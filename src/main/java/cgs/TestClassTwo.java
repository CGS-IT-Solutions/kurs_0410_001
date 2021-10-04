package cgs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestClassTwo {

    private static final Logger LOGGER = LogManager.getLogger(TestClassTwo.class);

    static String getHello() {
        LOGGER.debug("Hello logger");
        LOGGER.error("WHAT HAPPENED! ERROR!");
        return "Hello";
    }

}
