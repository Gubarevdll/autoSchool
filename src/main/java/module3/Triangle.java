package module3;

import java.util.Random;

public class Triangle extends Figure{

    private String name;
    private double[] coordinates = new double[11];
    private double a_x;
    private double a_y;
    private double b_x_center;
    private double b_y_center;
    private double half_width;
    private double c_x;
    private double c_y;
    private double d_x;
    private double d_y;
    private double height;
    private double width;
    private double space;


    public Triangle(int name){
        this.name = "Triangle № " + name;
        setCoordinates();
        setSpace();
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
        this.half_width = 1+random.nextInt(10 + 1);
        this.c_x = b_x_center-half_width;
        this.c_y = b_y_center;
        this.d_x = b_x_center+half_width;
        this.d_y = b_y_center;
        this.height = Math.abs(a_y-b_y_center);
        this.width = Math.abs(c_x-d_x);

        double[]cord = {a_x, a_y, b_x_center, b_y_center, half_width, c_x, c_y, d_x, d_y};
        this.coordinates = cord;
    }

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public void setSpace() {
        this.space = (width*height)/2;
    }

    @Override
    public double getSpace() {
        return space;
    }

    @Override
    public void showCoordinates() {
        System.out.println(name);
        System.out.println(name+ " point a: x="+ (int)a_x+" y="+ (int)a_y);
        System.out.println(name+ " point c: x="+ (int)c_x+" y="+ (int)c_y);
        System.out.println(name+ " point d: x="+ (int)d_x+" y="+ (int)d_y);
        System.out.println(name+ " space = " + space);
        System.out.println("");

        //Все приведено в инты на выводе просто для того, что бы легче читалось
    }
}

