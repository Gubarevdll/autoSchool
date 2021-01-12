package module5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Subtask9 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String a = reader.readLine();
            list.add(a);
        }

        int shortest = list.get(0).length();
        String result = "";
        for (String s : list) {
            if (shortest > s.length()) {
                shortest = s.length();
                result = s;
            } else if (shortest == s.length()) {
                shortest = s.length();
                result = result + " " + s;
            }
        }
        System.out.println(result.replaceAll(" ", "\n"));
    }
}

