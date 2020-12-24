package module3;

import java.util.Random;

public class Round extends Figure {
    private String name;
    private double[] coordinates = new double[5];
    private double a_x;
    private double a_y;
    private double b_x;
    private double b_y;
    private double radius;
    private double space;


    public Round(int name) {
        this.name = "Round №" + name;
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
        this.b_x = a_x;
        this.b_y = a_x+random.nextInt(10 + 1);
        this.radius = Math.abs(a_y - b_y);
        this.space = Math.PI * (radius * radius);

        double[] cord = {a_y, a_y, b_x, b_y, radius};
        this.coordinates = cord;
    }

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public void setSpace() {
        this.space = Math.PI * (radius * radius);

    }

    @Override
    public double getSpace() {
        return space;
    }

    @Override
    public void showCoordinates() {
        int ax = (int) a_x;


        System.out.println(name);
        System.out.println(name + " point a: x=" + (int)a_x + " y=" + (int)a_y);
        System.out.println(name + " point b: x=" + (int)b_x + " y=" + (int)b_y);
        System.out.println(name + " radius : " + radius);
        System.out.println(name + " space = " + space);
        System.out.println(" ");

        //Все приведено в инты на выводе просто для того, что бы легче читалось
    }
}