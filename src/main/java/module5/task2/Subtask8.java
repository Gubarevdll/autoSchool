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
        for (int i = 0; i < list.size(); i++){
            if (longest < list.get(i).length()){
                longest = list.get(i).length();
                result = list.get(i);
            }
        }
        System.out.println(result);
    }
}
