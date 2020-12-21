/*Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.

Через пробел либо с новой строки.*/

package module2.task6;

public class Subtask13 {
    public static void main(String[] args) {

        for (int i=0; i<=100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
