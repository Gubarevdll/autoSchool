package module5.task2;

import java.util.ArrayList;

public class Subtask7 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println("Array size = " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}