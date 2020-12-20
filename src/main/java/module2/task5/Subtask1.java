package module2.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Subtask1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int[] array;

        for (int i=0; i>array.length; i++){
            array[i] = a;
        }
    }

    static int[] initializeArray(int in){
        int[] array = new int[20];
        return array;
    }
}
