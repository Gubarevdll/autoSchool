package module3.figure;

import java.util.Random;

public class Circle extends Figure {

    private int[] coordinates = new int[5];
    private int a_x;
    private int a_y;
    private int b_x;
    private int b_y;
    private int radius;

    public Circle(int name) {
        this.name = "Circle № " + name;
        setCoordinates();
        setSpace();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSpace() {
        return space;
    }

    @Override
    public void setCoordinates() {
        Random random = new Random();

        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = (a_y + 1) + random.nextInt(10 + 1);
        this.radius = Math.abs(a_y - b_y);


        this.coordinates = new int[]{a_y, a_y, b_x, b_y, radius};
    }

    @Override
    public int[] getCoordinates() {
        return coordinates;
    }

    @Override
    public void setSpace() {
        this.space = (int) Math.round(Math.PI * (radius * radius));
    }


    @Override
    public void showCoordinates() {

        System.out.println(name);
        System.out.println(name + " point a: x=" + a_x + " y=" + a_y);
        System.out.println(name + " point b: x=" + b_x + " y=" + b_y);
        System.out.println(name + " radius : " + radius);
        System.out.println(name + " space = " + space + "\n");

        //Все приведено в инты на выводе просто для того, что бы легче читалось
    }
}