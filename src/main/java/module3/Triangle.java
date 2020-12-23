package module3;

import java.util.Random;

public class Triangle extends Figure{

    int a_x;
    int a_y;
    int b_x_center;
    int b_y_center;
    int halh_width;
    int c_x;
    int c_y;
    int d_x;
    int d_y;
    int height;
    int width;
    int space;


    public Triangle(){
        Random random = new Random();

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
