/*Ввести с клавиатуры два числа m и n.

Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.*/

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask14 {
    public static void main(String[] args) throws Exception{

        System.out.println("Введите строку:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        //пользователь должен ввести два числа

        // (исправил)


        for (int a = 0; a < m; a++) {
             //лучше перенести в конец цикла, так как печатается пустая строка в самом начале

            // (Исправил)
            for (int i = 0; i < n; i++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
    }

    /* Много раз слышал, что нельзя использовать цикл внутри цикла, по пока неизвестным мне причинам,
    но тут пришлось использовать
    Все же хотелось бы узнать почему так нельзя:) */

//Если честно, я такого не слышал. Возможно, если налепить 100 циклов внутри друг друга,
// то читабельность кода упадёт до нуля и искать где что сломалось будет затруднительно.
// Других причин я не вижу. Так что, смело используй, тем более, что это помогает понять принцип их работы
