package module4.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    final static Logger LOGGER = LogManager.getLogger(Logic.class.getName());
    public static void main(String[] args) {


        Logic.publicMethod();
        LOGGER.info("Main method has been called");
    }
}
