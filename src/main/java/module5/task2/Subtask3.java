package module5.task2;

import java.util.HashMap;
import java.util.Map;

public class Subtask3 {
    public static void main(String[] args) {

        Map<String, Cat> map = new HashMap<String, Cat>();

        map.put("first", new Cat("first"));
        map.put("second", new Cat("second"));
        map.put("third", new Cat("third"));
        map.put("fourth", new Cat("fourth"));
        map.put("fifth", new Cat("fifth"));
        map.put("sixth", new Cat("sixth"));
        map.put("seventh", new Cat("seventh"));
        map.put("eight", new Cat("eight"));
        map.put("ninth", new Cat("ninth"));
        map.put("tenth", new Cat("tenth"));

        System.out.println(map);
    }
}
