/*Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */

package module2.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask5 {
    public static void main(String[] args) throws Exception {
        int[] big_arr = initializeArray(20);
        int[] first_arr = new int[10];
        int[] second_arr = new int[10];

        for (int i=0; i<first_arr.length; i++){
            first_arr[i]=big_arr[i];
        }

        for (int i=0; i<second_arr.length; i++){
            second_arr[i]=big_arr[i+first_arr.length];
        }
        System.out.println("First array:");
        for (int i=0; i<first_arr.length; i++){
            System.out.println(first_arr[i]);
        }
        System.out.println("Second array:");
        for (int i=0; i<second_arr.length; i++){
            System.out.println(second_arr[i]);
        }
    }

    static int[] initializeArray(int size) throws Exception {

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String a = reader.readLine();
            try {
                int x = Integer.parseInt(a.trim());
                array[i] = x;

            } catch (Exception e) {
                i++;
            }
        }
        return array;
    }
}
