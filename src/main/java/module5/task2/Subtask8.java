package module5.task2;

import java.util.ArrayList;

public class Subtask8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        int longest = list.get(0).length();
        String result = null;
        for (String s : list) {
            if (longest < s.length()) {
                longest = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }
}
