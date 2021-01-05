package module5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Subtask6 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);

        Map<String, Object> reversedMap = new TreeMap<String, Object>(map);

        for (Map.Entry entry : reversedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
