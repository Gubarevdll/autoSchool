package module5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

        Map<String, String> reversedMap = new TreeMap<>(map);
        Map<String, String> result = new HashMap<>();

        for (Map.Entry entry : reversedMap.entrySet()) {
            result.put(entry.getValue().toString(), entry.getKey().toString());
        }
        System.out.println(result);
    }
}
