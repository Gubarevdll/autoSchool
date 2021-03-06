package module4.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logic {
    static String line;
    final static Logger LOGGER = LogManager.getLogger(Logic.class.getName());


    static private void privateMethod() {
        line = "original line";
        LOGGER.info("Private method has been called");
    }

    static public void publicMethod() {
        privateMethod();
        line = line + " with changes";
        LOGGER.info("Public method has been called");
    }

}
