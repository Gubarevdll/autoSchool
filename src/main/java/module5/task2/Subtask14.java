package module5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Subtask14 {
   public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя для поиска:");
        String name = reader.readLine();
        System.out.println("Введите фамилия для поиска:");
        String lastnmae = reader.readLine();


        map.put("Алексей", "Песков");
        map.put("Владимир", "Иванов");
        map.put("Андрей", "Песков");
        map.put("Роман", "Котов");
        map.put("Денис", "Гнатенко");
        map.put("Влад", "Петров");
        map.put("Артем", "Михайлов");
        map.put("Вадим", "Данилов");
        map.put("Стас", "Тихонов");
        map.put("Антон", "Алексеенко");

        int firstnameconter = 0;
        int lastnamecounter = 0;

        ArrayList<String> names = new ArrayList<>(map.keySet());
        ArrayList<String> lastnames = new ArrayList<>(map.values());

        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(name)){
                firstnameconter++;
            }
        }

       for (int i = 0; i < lastnames.size(); i++){
           if (lastnames.get(i).equals(lastnmae)){
               lastnamecounter++;
           }
       }

       System.out.println(firstnameconter);
       System.out.println(lastnamecounter);
     }
}

