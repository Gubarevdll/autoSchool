/*Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией: //какой функцией?
 */

package module2.task6;

public class Subtask18 {
    public static void main(String[] args) throws Exception {
        for (int i=30; i>0; i--){
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Бум!");
    }
}
