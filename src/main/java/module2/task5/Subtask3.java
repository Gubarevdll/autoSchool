package module2.task5;

import com.sun.jdi.event.ExceptionEvent;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask3 {
    public static void main(String[] args) throws Exception {

        String[] stringarray = initializeArray(10);
        int[] linescount = StringLineCountArray(stringarray);
        for (int i = 0; i < linescount.length; i++){
            System.out.println(linescount[i]);
        }
    }

    static String[] initializeArray(int size) throws Exception {

        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String a = reader.readLine();

            array[i] = a;
        }
        return array;
    }

    static int[] StringLineCountArray(String[] array) throws Exception {

        int[] linescount = new int[array.length];

        for (int i=0; i< array.length; i++){
            linescount[i] = array[i].length();
        }
        return linescount;
    }
}