/*Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран. Случай,
когда самых длинных слов может быть несколько, не обрабатывать.
 */

package module2.task4;

import java.util.Arrays;
import java.util.List;

public class Subtask3 {

    public static void main(String[] args) {

        String sentence = "random words in this sentence";
        List<String> words = Arrays.asList(sentence.split(" "));

        String longest = "1";

        for (int i=0; i<words.size(); i++){
            if (longest.length()<words.get(i).length()){
                longest = words.get(i);
            }
        }

        System.out.println(longest);
    }
}
