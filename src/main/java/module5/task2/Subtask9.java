package module5.task2;

import java.util.ArrayList;

public class Subtask9 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        int shortest = list.get(0).length();
        String result = list.get(0);
        for (String s : list) {
            if (shortest > s.length()) {
                shortest = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }
}

