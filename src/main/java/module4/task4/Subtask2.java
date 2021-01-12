package module4.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите первое имя");
            String a = reader.readLine();
            System.out.println("Введите второе имя");
            String b = reader.readLine();

            System.out.println("Ожидание 3 секунды...");
            Thread.sleep(3000);

            int zero = 5/0;

            if (a.equals(b)) {
                System.out.println("Имена идентичны");
            } else if (a.length() == b.length()) {
                System.out.println("Длины имен равны");
            } else {
                System.out.println("Имена не идентичны и их длина не равна");
            }
        } catch (Exception e) {
            System.out.println(" You shall not fall!");
        }
    }
}

