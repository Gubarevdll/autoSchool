/*В переменных q и w хранятся два натуральных числа.
Создайте программу, выводящую на экран результат деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке
 */


package module2.task3;

public class Subtask1 {
    public static void main(String[] args) {
        int q = 21; //Почему double?
        int w = 8;

        int result = q/w;
        int sresult = q%w;//необходимо использовать деление с остатком.
                            //(Я не совсем понял задачу в первый раз и не уверен, что понял в этот раз, но исправил :) )

        System.out.println("Результат: " + result + " и "+ sresult + " в остатке");
    }
}
