/*Вывести на экран квадрат из 10х10 букв S используя цикл while.

Буквы в каждой строке не разделять.*/

package module2.task6;

public class Subtask11 {
    public static void main(String[] args) {

        int i = 0;
        int a = 0;

        while (a < 10) {
            System.out.println(" ");
            a++;
            while (i < 10) {
                System.out.print("S"); //хитро, но давай по одной букве System.out.print("S")
                i++;
            }
        }
    }
}
