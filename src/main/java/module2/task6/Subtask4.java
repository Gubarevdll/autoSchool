/*Ввести с клавиатуры два имени, и если имена одинаковые,
вывести сообщение «Имена идентичны». Если имена разные,
но их длины равны – вывести сообщение – «Длины имен равны».
 */

package module2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask4 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();

         if(a.equals(b)){
            System.out.println("Имена идентичны");
        }
        else if (a.length()==b.length()){
            System.out.println("Длины имен равны");
        }
        else {
             System.out.println("Имена не идентичны и их длина не равна");
         }

    }
}
