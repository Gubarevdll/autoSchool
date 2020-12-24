package module3;

import java.util.Random;

public class Triangle extends Figure{

    private String name;
    private double[] coordinates = new double[11];
    private double a_x;
    private double a_y;
    private double b_x_center;
    private double b_y_center;
    private double halh_width;
    private double c_x;
    private double c_y;
    private double d_x;
    private double d_y;
    private double height;
    private double width;
    private double space;


    public Triangle(int name){
        this.name = "Triangle №" + name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCoordinates() {
        Random random = new Random();

        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x_center = a_x;
        this.b_y_center = a_y+random.nextInt(10 + 1);
        this.c_x = b_x_center-halh_width;
        this.c_y = b_y_center;
        this.d_x = b_x_center+halh_width;
        this.d_y = b_y_center;
        this.halh_width = random.nextInt(10 + 1);
        this.height = Math.abs(a_y-b_y_center);
        this.width = Math.abs(c_x-d_x);

        double[]cord = {a_x, a_y, b_x_center, b_y_center, c_x, c_y, d_x, d_y, halh_width};
        this.coordinates = cord;
    }

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public void setSpace(double space) {
        this.space = (width*height)/2;
    }

    @Override
    public double getSpace() {
        return space;
    }

    @Override
    public void showCoordinates() {
        System.out.println(name);
        System.out.println("Triangle point a: x="+ a_x+" y="+ a_y);
        System.out.println("Triangle low-center: x="+ b_x_center+" y="+ b_y_center);
        System.out.println("Triangle point c: x="+ c_x+" y="+ c_y);
        System.out.println("Triangle point d: x="+ d_x+" y="+ d_y);
    }
}

