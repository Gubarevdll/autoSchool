package module5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Subtask14 {
   public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите фамилию для поиска:");
        String lastname = reader.readLine();
        System.out.println("Введите имя для поиска:");
        String name = reader.readLine();


       map.put("Песков", "Алексей");
       map.put("Иванов", "Владимир");
       map.put("Артемов", "Андрей");
       map.put("Котов", "Роман");
       map.put("Гнатенко", "Денис");
       map.put("Петров", "Андрей");
       map.put("Михайлов", "Артем");
       map.put("Данилов", "Вадим");
       map.put("Тихонов", "Стас");
       map.put("Алексеенко", "Антон");

        int firstnameconter = 0;
        int lastnamecounter = 0;

        ArrayList<String> names = new ArrayList<>(map.values());
        ArrayList<String> lastnames = new ArrayList<>(map.keySet());

        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(name)){
                firstnameconter++;
            }
        }

       for (int i = 0; i < lastnames.size(); i++){
           if (lastnames.get(i).equals(lastname)){
               lastnamecounter++;
           }
       }

       System.out.println("Количество людей с такой фамилией: " + lastnamecounter + ", с таким именем: " + firstnameconter);
     }
}

//To do - не забыть поставить фамилии первыми

