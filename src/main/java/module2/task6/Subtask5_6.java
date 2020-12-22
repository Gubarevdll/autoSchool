/*Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
* Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»*/

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask5_6 {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //можешь ещё попробовать
        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //int age = scanner.nextInt();

        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите возраст");
        String age_s = reader.readLine();
        int age = Integer.parseInt(age_s.trim());


        if (age<=18){
            System.out.println("Подрасти еще");
        }
        else if (age>=20){
            System.out.println("И 18-ти достаточно");
        }

    }
}

//В коменнтах увидел, что можно обьеденить 5-6 задачу, потому тут 2
