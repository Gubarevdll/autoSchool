/*Ввести с клавиатуры два числа m и n.

Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.*/

package module2.task6;

public class Subtask14 {
    public static void main(String[] args) {
        int m = 2;
        int n = 6;


        for (int a = 0; a < m; a++) {
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(8);
            }
        }
    }
    }

    /* Много раз слышал, что нельзя использовать цикл внутри цикла, по пока неизвестным мне причинам,
    но тут пришлось использовать
    Все же хотелось бы узнать почему так нельзя:) */

