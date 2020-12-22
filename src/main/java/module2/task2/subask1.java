/*Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”*/

package module2.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class subask1 {
    public static void main(String[] args) throws Exception {

        InputStreamReader r=new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(r);

        String name=br.readLine();

        System.out.println("Hello " + name);

    }
}

// Отсутствует метод printHelloName(), который должен запрашивать у пользователя имя