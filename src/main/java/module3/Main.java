package module3;

import java.util.Arrays;

public class Main {

    private static Object object;

    public static void main(String[] args) {

        Square square = new Square(1);
        square.showCoordinates();

        Round round = new Round(1);
        round.showCoordinates();

        Triangle triangle = new Triangle(1);
        triangle.showCoordinates();


        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++){
            double rand = Math.random();
            if (rand <= 0.33) {
                figures [i] = new Square(i);
            } else if (rand <= 0.66) {
                figures [i] = new Triangle(i);
            } else if (rand > 0.33){
                figures [i] = new Round(i);
            }


        }

        System.out.println("Фигруа - :" + figures[0].getName() +" площадь - " + figures[0].getSpace());
        System.out.println("Фигруа - :" + figures[1].getName() +" площадь - " + figures[1].getSpace());
        System.out.println("Фигруа - :" + figures[2].getName() +" площадь - " + figures[2].getSpace());
        System.out.println("Фигруа - :" + figures[3].getName() +" площадь - " + figures[3].getSpace());
        System.out.println("Фигруа - :" + figures[4].getName() +" площадь - " + figures[4].getSpace());
        System.out.println("Фигруа - :" + figures[5].getName() +" площадь - " + figures[5].getSpace());
        System.out.println("Фигруа - :" + figures[6].getName() +" площадь - " + figures[6].getSpace());
        System.out.println("Фигруа - :" + figures[7].getName() +" площадь - " + figures[7].getSpace());
        System.out.println("Фигруа - :" + figures[8].getName() +" площадь - " + figures[8].getSpace());
        System.out.println("Фигруа - :" + figures[9].getName() +" площадь - " + figures[9].getSpace());


        createSortDouble(figures);
    }

    public static void createSortDouble(Figure[] arr){
        double[]sorteddoubles = new double[arr.length];

        for (int i = 0; i < arr.length; i++){
            double iter = arr[i].getSpace();
            sorteddoubles[i]= iter;
        }

        Arrays.sort(sorteddoubles);

        System.out.println();
        System.out.println("sorteddoubles");
        System.out.println(sorteddoubles[0]);
        System.out.println(sorteddoubles[1]);
        System.out.println(sorteddoubles[2]);
        System.out.println(sorteddoubles[3]);
        System.out.println(sorteddoubles[4]);
        System.out.println(sorteddoubles[5]);
        System.out.println(sorteddoubles[6]);
        System.out.println(sorteddoubles[7]);
        System.out.println(sorteddoubles[8]);
        System.out.println(sorteddoubles[9]);


        Figure[] fig = new Figure[arr.length];

        for (int a = 0; a < arr.length; a++) {
            Figure qwe = arr[a];
            for (int i = 0; i < arr.length; i++) {
                if (qwe.getSpace() == sorteddoubles[i]) {
                    fig[i] = qwe;
                }
            }
        }

        System.out.println(" ");
        System.out.println("сорт");
        System.out.println("Фигруа - :" + fig[0].getName() +" площадь - " + fig[0].getSpace());
        System.out.println("Фигруа - :" + fig[1].getName() +" площадь - " + fig[1].getSpace());
        System.out.println("Фигруа - :" + fig[2].getName() +" площадь - " + fig[2].getSpace());
        System.out.println("Фигруа - :" + fig[3].getName() +" площадь - " + fig[3].getSpace());
        System.out.println("Фигруа - :" + fig[4].getName() +" площадь - " + fig[4].getSpace());
        System.out.println("Фигруа - :" + fig[5].getName() +" площадь - " + fig[5].getSpace());
        System.out.println("Фигруа - :" + fig[6].getName() +" площадь - " + fig[6].getSpace());
        System.out.println("Фигруа - :" + fig[7].getName() +" площадь - " + fig[7].getSpace());
        System.out.println("Фигруа - :" + fig[8].getName() +" площадь - " + fig[8].getSpace());
        System.out.println("Фигруа - :" + fig[9].getName() +" площадь - " + fig[9].getSpace());
    }
}
