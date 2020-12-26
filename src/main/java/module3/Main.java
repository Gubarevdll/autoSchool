package module3;

import java.util.Arrays;

public class Main {

    private static Object object;

    public static void main(String[] args) {


        Figure[] random_objects = create10RandomObjects();
        Figure[] sorted_objects = sortFigures(random_objects);


        for (int i = 0; i < random_objects.length; i++) {
            System.out.println("Обьект - " + sorted_objects[i].getName() + ", Площадь - " + sorted_objects[i].getSpace());
        }
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

    public static Figure[] sortFigures(Figure[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].getSpace() < arr[i - 1].getSpace()) {
                    Figure temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }

}
