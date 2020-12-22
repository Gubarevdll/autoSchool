/*Ввести с клавиатуры три числа, и вывести их в порядке убывания.*/

package module2.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Subtask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int[] arr = new int[3]; //достаточно даже int[] arr;

        arr = new int[]{a, b, c};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]); //вывести не в обратном порядке, а в порядке убывания. То есть, от большего к меньшему
        }

    }
}
