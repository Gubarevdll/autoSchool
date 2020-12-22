/*Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.
 */

package module2.task4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtask2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Type the sentence:");
        InputStreamReader a=new InputStreamReader(System.in);
        BufferedReader bra=new BufferedReader(a);
        String original=bra.readLine();
        //Исходную строку тоже должнен вводить пользователь
        //(Исправил)

        System.out.println("Please choose the word you want to replace");
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

//Нет проверки на наличие подстроки для замены в исходной строке.
// Программа в любом случае дорабатывает до конца, даже если ничего не вводить.



        /*int start = original.indexOf(line);
        int end = line.length();

        String word_to_change = (original.substring(start, start+ end));
        System.out.println(word_to_change);

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String newword=br.readLine();*/


//Старайся не оставлять закомменченный код.
// Если вдруг такое потребовалось, то лучше дописать для чего заккоментили кусок кода,
// а то через некоторое время никто и не вспомнит деталей



