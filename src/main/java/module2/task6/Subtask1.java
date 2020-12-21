/*Ввести с клавиатуры два числа, и вывести на экран минимальное из них.*/

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();

        int x = Integer.parseInt(a.trim());
        int z = Integer.parseInt(b.trim());

        int result = 0;

        if (x>z){
            result=x;
        }
        else {
            result=z;
        }

        System.out.println(result);
}}
