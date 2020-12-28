package module3.figure;

import java.util.Random;

public class Triangle extends Figure {

    private int a_x;
    private int a_y;
    private int c_x;
    private int c_y;
    private int d_x;
    private int d_y;
    private int height;
    private int width;


    public Triangle(int name) {
        this.name = "Triangle № " + name;
        setCoordinates();
        setSpace();
    }

    @Override
    public void setCoordinates() {
        Random random = new Random();

        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        int b_x_center = a_x;
        int b_y_center = (a_y + 1) + random.nextInt(10 + 1);
        int half_width = 1 + random.nextInt(10 + 1);
        this.c_x = b_x_center - half_width;
        this.c_y = b_y_center;
        this.d_x = b_x_center + half_width;
        this.d_y = b_y_center;
        this.height = Math.abs(a_y - b_y_center);
        this.width = Math.abs(c_x - d_x);

        this.coordinates = new int[]{a_x, a_y, b_x_center, b_y_center, half_width, c_x, c_y, d_x, d_y};
    }

    @Override
    public void setSpace() {
        this.space = (width * height) / 2;
    }

    @Override
    public void showCoordinates() {
        System.out.println(name);
        System.out.println(name + " point a: x=" + a_x + " y=" + a_y);
        System.out.println(name + " point c: x=" + c_x + " y=" + c_y);
        System.out.println(name + " point d: x=" + d_x + " y=" + d_y);
        System.out.println(name + " space = " + space + "\n");


        //Все приведено в инты на выводе просто для того, что бы легче читалось
    }
}

