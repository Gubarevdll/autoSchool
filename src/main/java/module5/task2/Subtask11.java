package module5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Subtask11 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String a = reader.readLine();
            list.add(a);
        }

        for (int i = 0; i < 13; i++) {
            String buff = list.get(4);
            list.remove(4);
            list.add(0, buff);
        }

        System.out.println(list);
    }
}
