package module3;

import java.util.Random;

public class Round extends Figure{
         double a_x;
         double a_y;
         double b_x;
         double b_y;
         double radius;
         double space;


    public Round() {
        Random random = new Random() ;

        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = random.nextInt(10 + 1);
        this.radius = Math.abs(a_y-b_y);
        this.space = Math.PI * (radius * radius);
    }

    //to do вручную посчитать площадь

}