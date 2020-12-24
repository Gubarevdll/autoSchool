package module3;

public class Main {

    private static Object object;

    public static void main(String[] args) {

        Square square = new Square(1);
        square.showCoordinates();

        Round round = new Round(1);
        round.showCoordinates();

        Triangle triangle = new Triangle(1);
        triangle.showCoordinates();


        Object[] figures = new Object[10];
        for (int i = 0; i < 10; i++){
            double rand = Math.random();
            if (rand < 0.33) {
                figures [i] = new Square(i);
            } else if (rand < 0.66) {
                figures [i] = new Triangle(i);
            } else {
                figures [i] = new Round(i);
            }

        }
    }
}
