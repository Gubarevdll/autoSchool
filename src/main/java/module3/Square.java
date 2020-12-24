package module3;

import java.util.Random;

public class Square extends Figure {
    private String name;
    private double[] coordinates = new double[9];
    private double a_x;
    private double a_y;
    private double b_x;
    private double b_y;
    private double c_x;
    private double c_y;
    private double d_x;
    private double d_y;
    private double side_length;
    private double space;


    public Square(int name) {
        this.name = "Square №" + name;
    }

    @Override
    public void setCoordinates() {
        Random random = new Random();

        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = a_y + random.nextInt(10 + 1);
        this.c_x = Math.abs(a_y - b_y) + a_x;
        this.c_y = a_y;
        this.d_x = c_x;
        this.d_y = b_y;
        this.side_length = Math.abs(a_y - b_y);

        double[] coordinates = {a_x, a_y, b_x, b_y, c_x, c_y, d_x, d_y, side_length};
        this.coordinates = coordinates;
    }

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public void setSpace(double space) {
        this.space = side_length * side_length;
    }

    @Override
    public double getSpace() {
        return space;
    }

    @Override
    public void showCoordinates() {

        System.out.println(name);
        System.out.println("Square point a: x=" + a_x + " y=" + a_y);
        System.out.println("Square point b: x=" + b_x + " y=" + b_y);
        System.out.println("Square point c: x=" + c_x + " y=" + c_y);
        System.out.println("Square point d: x=" + d_x + " y=" + d_y);
        System.out.println("Square space = " + space);
    }
}

