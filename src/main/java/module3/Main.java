package module3;

import java.util.Arrays;

public class Main {

    private static Object object;

    public static void main(String[] args) {


        Figure[] random_objects = create10RandomObjects();
        Figure[] result = sortFigures(random_objects);

        for (int i = 0; i < result.length; i++) {
            System.out.println("Обьект - " + result[i].getName() + ", Площадь - " + result[i].getSpace() + result[i].getSpace());
        }
    }

    public static Figure[] sortFigures(Figure[] arr) {
        double[] sorteddoubles = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            double iter = arr[i].getSpace();
            sorteddoubles[i] = iter;
        }

        Arrays.sort(sorteddoubles);
        Figure[] fig = new Figure[arr.length];

        for (int a = 0; a < arr.length; a++) {
            Figure qwe = arr[a];
            for (int i = 0; i < arr.length; i++) {
                if (qwe.getSpace() == sorteddoubles[i]) {
                    fig[i] = qwe;
                }
            }
        }
        return fig;
    }

    public static Figure[] create10RandomObjects() {
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            double rand = Math.random();
            if (rand <= 0.33) {
                figures[i] = new Square(i);
            } else if (rand <= 0.66) {
                figures[i] = new Triangle(i);
            } else if (rand > 0.33) {
                figures[i] = new Circle(i);
            }
        }
        return figures;
    }
}
