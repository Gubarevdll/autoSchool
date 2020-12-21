/* Ввести с клавиатуры строку и число N.*/

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask10 {
    public static void main(String[] args)throws Exception{
        System.out.println("Введите строку:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();

        System.out.println("Введите число повторений");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        String b = reader2.readLine();
        int N = Integer.parseInt(b.trim());

        while (N>0){
            System.out.println(a);
            N--;
        }

    }
}
