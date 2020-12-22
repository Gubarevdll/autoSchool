/*Массив из чисел в обратном порядке

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
 */
package module2.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Subtask4 {
    public static void main(String[] args) throws Exception {
        int[] arr = initializeArray(10);
        int[] arr_reverse = new int[10];

        for (int i=arr.length-1; i>=0; i--){
            int a = 0;
            arr_reverse[a]=arr[i];
            a++;
        }

        for (int i = 0; i < arr_reverse.length; i++ ){
            System.out.println(arr_reverse[i]);
        }
    }

    //Ты вывел числа, но не расположил их в обратном порядке в массиве.


    static int[] initializeArray(int size) throws Exception{

        int[] array = new int[size];
        for (int i=0; i<array.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String a = reader.readLine();
            try {
                int x = Integer.parseInt(a.trim());
                array[i] = x;

            }
            catch (Exception e){
                i++;
            }
        }
        return array;
    }
}