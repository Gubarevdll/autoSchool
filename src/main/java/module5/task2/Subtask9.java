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
        for (int i = 0; i < list.size(); i++){
            if (shortest > list.get(i).length()){
                shortest = list.get(i).length();
                result = list.get(i);
            }
        }
        System.out.println(result);
    }
}

