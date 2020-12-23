/*Вывести на экран таблицу умножения 10х10 используя цикл while.

Числа разделить пробелом.*/

package module2.task6;

public class Subtask12 {
    public static void main(String[] args) {
        int i=1,n=1;
        while(i<=10)
        {
            System.out.print(i+" ");
            while(n<=9)
            {
                n++;
                System.out.print(i*n+" ");
            }
            i++;
            n=1;
            System.out.println("");
            }
        }
    }

       /*while (i<=10){
            System.out.println(1*i+" "+2*i+" "+3*i+" "+4*i+" "+5*i+" "+6*i+" "+6*i+" "+7*i+" "+8*i+" "+9*i+" "+10*i); //интересное решение, а полностью в цикле попробуешь? (там будет while вложенный в while)
            i++;*/

        //(Сделал с помощью вложенного цикла)
