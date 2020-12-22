/*За семь попыток угадать число.
При каждой попытке вам будет выводиться сообщение -
"Мало" или "Много". Если угадаете, уложившись в семь попыток,
то выводится сообщение "Угадал :)" и программа завершает работу. Если по истечении
7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
 */

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Subtask7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        System.out.println(secret); //я буду угадывать каждое число :)


            for (int i = 0; i <= 6; i++) {


                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите число");
                String a = reader.readLine();
                int x = Integer.parseInt(a.trim());

                if (x < secret) {
                    System.out.println("Мало");
                } else if (x > secret) {
                    System.out.println("Много");
                } else if (x == secret) {
                    System.out.println("Угадал :)");
                    break;
                }
            }
            System.out.println("Это была последняя попытка"); //выводится в любом случае, независимо от результата, так не должно быть
    }
    }


