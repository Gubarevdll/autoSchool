/*Максимальное среди массива на 20 чисел

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */

package module2.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask1 {
    public static void main(String[] args) throws Exception {

        int[] arr = initializeArray(20);
        System.out.println(max(arr));


    }

    static int[] initializeArray(int size) throws Exception{

        int[] array = new int[size];
        for (int i=0; i<array.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(reader.readLine());

            array[i] = a;
        }
        return array;
    }


    static int max(int[] array){
        int[] sarr = array;
        int max = sarr[0];
        for (int i=0; i<sarr.length; i++){
            if (max < sarr[i]){
                max = sarr[i];
            }
        }
        return max;
    }
}
