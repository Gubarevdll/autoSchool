package module4.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Subtask2 {
    static String line;
    final static Logger LOGGER = LogManager.getLogger(Subtask2.class.getName());

    public static void main(String[] args) {
        publicMethod();
    }


        static private void privateMethod(){
            line = "original line";
            LOGGER.info("Private method has been called");
        }

        static public void publicMethod(){
            privateMethod();
            line = line + " with changes";
            LOGGER.info("Public method has been called");
        }

}
