/*4 Даны три переменные a, b и c.
        Изменить значения этих переменных так, ч
        тобы в a хранилось значение a+b, в b хранилась разность
        старых значений c−a, а в c хранилось сумма старых значений a+b+c.
        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/

package module2.task3;

public class Subtask4 {
    public static void main(String[] args) {


        int a=Subtask4.a+Subtask4.b, b=Subtask4.c-Subtask4.a, c=Subtask4.a+Subtask4.b+Subtask4.c;


        System.out.println(a + " " + b + " " + c); //результат не соответствует условию

                                                    //(Не досмотрел условие для "a", теперь исправил)

        }

        static int a = 0, b = 2, c = 5;

    }

