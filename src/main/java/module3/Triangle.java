package module3;

import java.util.Random;

public class Triangle extends Figure{

    String name;
    double a_x;
    double a_y;
    double b_x_center;
    double b_y_center;
    double halh_width;
    double c_x;
    double c_y;
    double d_x;
    double d_y;
    double height;
    double width;
    double space;


    public Triangle(int name){
        Random random = new Random();

        this.name = "Triangle №" + name;
        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x_center = a_x;
        this.b_y_center = a_y+random.nextInt(10 + 1);
        this.halh_width = random.nextInt(10 + 1);
        this.c_x = b_x_center-halh_width;
        this.c_y = b_y_center;
        this.d_x = b_x_center+halh_width;
        this.d_y = b_y_center;
        this.height = Math.abs(a_y-b_y_center);
        this.width = Math.abs(c_x-d_x);
        this.space = (width*height)/2;
    }
}
