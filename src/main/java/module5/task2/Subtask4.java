package module5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Subtask4 {
        public static void main(String[] args) {

            HashMap<String, String> map = new HashMap();
            map.put("арбуз", "ягода");
            map.put("банан", "трава");
            map.put("вишня", "ягода");
            map.put("груша", "фрукт");
            map.put("дыня", "овощ");
            map.put("ежевика", "куст");
            map.put("жень-шень", "корень");
            map.put("земляника", "ягода");
            map.put("ирис", "цветок");
            map.put("картофель", "клубень");

            Map<String, String> reversedMap = new TreeMap<String, String>(map);

            for (Map.Entry entry : reversedMap.entrySet()) {
                System.out.println(entry.getKey());
            }
        }
    }

