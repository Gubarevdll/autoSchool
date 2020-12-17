package module2.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception {

        InputStreamReader r=new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(r);

        String name=br.readLine();

        System.out.println("Hello " + name);

    }
}
