/* Ввести с клавиатуры четыре числа, и вывести максимальное из них.*/

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        String h = reader.readLine();
        String k = reader.readLine();


        int x = Integer.parseInt(a.trim());
        int z = Integer.parseInt(b.trim());
        int c = Integer.parseInt(h.trim());
        int v = Integer.parseInt(k.trim());
        int result = 0;

        if (x>z && x>c && x>v){
            result=x;
        }
        else if(z>x && z>c &&z>v) {
            result=z;
        }
        else if(c>x && c>z && c>v){
            result=c;
        }
        else if(v>x && v>x &&v>c){
            result=v;
        }
        //Так как задача про if, то решение правильное, но обычно таких конструкций не пишут :) Как вариант, использовать массив и цикл

        System.out.println(result);
    }
}
