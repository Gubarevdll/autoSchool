/*Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.
 */

package module2.task4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask2 {
    public static void main(String[] args) throws Exception {

        String original = "Change any word in this sentence. Please type it below";
        System.out.println(original);

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String original_word=br.readLine();

        System.out.println("Please type a replacement word");

        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br2=new BufferedReader(b);
        String replacement_word =br2.readLine();

        System.out.println(original.replace( original_word,replacement_word));
    }
}



        /*int start = original.indexOf(line);
        int end = line.length();

        String word_to_change = (original.substring(start, start+ end));
        System.out.println(word_to_change);

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String newword=br.readLine();*/




