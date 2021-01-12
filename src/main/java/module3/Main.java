package module3;

import module3.figure.Circle;
import module3.figure.Figure;
import module3.figure.Square;
import module3.figure.Triangle;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = createRandomFigure(i);
        }

        Figure[] sorted_objects = sortFigures(figures);

        for (Figure sorted_object : sorted_objects) {
            System.out.println("Фигруа - " + sorted_object.getName() + ", площадь - " + sorted_object.getSpace());
        }

    }

    public static Figure createRandomFigure(int name) {
        double rand = Math.random();
        if (rand <= 0.33) {
            return new Square(name, randomSize());
        } else if (rand <= 0.66) {
            return new Triangle(name, randomSize());
        } else
            return new Circle(name, randomSize());
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

    private static int randomSize() {
        return (int) Math.round(Math.random() * 10 + 1);
    }
}
