package module3;

import java.util.Random;

public class Sqare extends Figure {
    String name;
    double a_x;
    double a_y;
    double b_x;
    double b_y;
    double c_x;
    double c_y;
    double d_x;
    double d_y;
    double side_length;
    double space;


    public Sqare(int name) {
        Random random = new Random();
        this.name = "Sqare №" + name;
        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = a_y + random.nextInt(10 + 1);
        this.c_x = Math.abs(a_y-b_y)+a_x;
        this.c_y = a_y;
        this.d_x = c_x;
        this.d_y = b_y;
        this.side_length = Math.abs(a_y-b_y);
        this.space = side_length*side_length;
    }

}
