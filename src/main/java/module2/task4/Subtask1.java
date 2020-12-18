/*Дана строка. Вывести первый, последний и средний (если он есть) символы.
Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
Также предусмотрите вывод количества пробелов.
 */

package module2.task4;public class Subtask1 {

    public static void main(String[] args) {

        String x = "random.w o r d";

        String first_char = x.substring(0,1);
        String last_char = x.substring(x.length()-1);

        System.out.println("First letter - " + first_char +" last letter - " + last_char);

        int value = x.indexOf('.');
        System.out.println(x.substring(0, value+1));

        int spaceCount = 0;
        for (char c : x.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println(spaceCount);
    }
}
