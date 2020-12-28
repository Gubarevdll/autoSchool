package module3.figure;

import java.util.Random;

public class Square extends Figure {

    private int a_x;
    private int a_y;
    private int b_x;
    private int b_y;
    private int c_x;
    private int c_y;
    private int d_x;
    private int d_y;
    private int side_length;


    public Square(int name) {
        this.name = "Square № " + name;
        setCoordinates();
        setSpace();
    }

    @Override
    public void setCoordinates() {
        Random random = new Random();

        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = (a_y + 1) + random.nextInt(10 + 1);
        this.c_x = Math.abs(a_y - b_y) + a_x;
        this.c_y = a_y;
        this.d_x = c_x;
        this.d_y = b_y;
        this.side_length = Math.abs(a_y - b_y);

        this.coordinates = new int[]{a_x, a_y, b_x, b_y, c_x, c_y, d_x, d_y, side_length};
    }

    @Override
    public void setSpace() {
        this.space = side_length * side_length;
    }

    @Override
    public void showCoordinates() {

        System.out.println(name);
        System.out.println(name + " point a: x=" + a_x + " y=" + a_y);
        System.out.println(name + " point b: x=" + b_x + " y=" + b_y);
        System.out.println(name + " point c: x=" + c_x + " y=" + c_y);
        System.out.println(name + " point d: x=" + d_x + " y=" + d_y);
        System.out.println(name + " space = " + space + "\n");

        //Все приведено в инты на выводе просто для того, что бы легче читалось
    }
}

