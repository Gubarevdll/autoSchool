/*Вывести на экран квадрат из 10х10 букв S используя цикл while.

Буквы в каждой строке не разделять.*/

package module2.task6;

public class Subtask11 {
    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            cicle();
            System.out.println();
            i++;
        }
    }

    static void cicle() {
        int a = 0;
        while (a < 10) {
            System.out.print("S");
            a++;
        }
    }
}
