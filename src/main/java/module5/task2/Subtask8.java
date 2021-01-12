package module5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Subtask8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String a = reader.readLine();
            list.add(a);
        }


        int longest = list.get(0).length();
        String result = "";
        for (String s : list) {
            if (longest < s.length()) {
                longest = s.length();
                result = s;
            } else if (longest == s.length()) {
                longest = s.length();
                result = result + " " + s;
            }
        }
        System.out.println(result.replaceAll(" ", "\n"));
    }
}
