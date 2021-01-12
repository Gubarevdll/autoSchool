package module5.task2;

import java.util.HashMap;
import java.util.Map;

public class Subtask16 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("Песков", "Алексей");
        map.put("Иванов", "Владимир");
        map.put("Артемов", "Андрей");
        map.put("Котов", "Роман");
        map.put("Гнатенко", "Денис");
        map.put("Петров", "Андрей");
        map.put("Михайлов", "Андрей");
        map.put("Данилов", "Андрей");
        map.put("Тихонов", "Стас");
        map.put("Алексеенко", "Антон");

        removeTheFirstNameDuplicates(map);

        System.out.println(map);
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if (s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey()))
                    removeItemFromMapByValue(map, s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
