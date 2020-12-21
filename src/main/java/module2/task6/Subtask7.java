package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Subtask7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        System.out.println(secret);


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
            System.out.println("Это была последняя попытка");
    }
    }


