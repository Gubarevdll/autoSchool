package module3;

import java.util.Random;

public class Sqare extends Figure {
    int a_x;
    int a_y;
    int b_x;
    int b_y;
    int c_x;
    int c_y;
    int d_x;
    int d_y;
    int side_length;
    int space;


    public Sqare() {
        Random random = new Random();

        this.a_x = random.nextInt(5 + 1);
        this.a_y = random.nextInt(5 + 1);
        this.b_x = a_x;
        this.b_y = a_y + random.nextInt(5 + 1);
        this.c_x = Math.abs(a_y-b_y)+a_x;
        this.c_y = a_y;
        this.d_x = c_x;
        this.d_y = b_y;
        this.side_length = Math.abs(a_y-b_y);
        this.space = side_length*side_length;
    }
}
