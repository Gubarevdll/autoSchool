package module3;

import java.util.Random;

public class Round extends Figure{
        String name;
         double a_x;
         double a_y;
         double b_x;
         double b_y;
         double radius;
         double space;

    public Round(int name) {
        Random random = new Random() ;

        this.name = "Sqare №" + name;
        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = random.nextInt(10 + 1);
        this.radius = Math.abs(a_y-b_y);
        this.space = Math.PI * (radius * radius);
    }

    @Override
    public int getName(int name) {
        this.name = "Round № " + name;
        return name;
    }

    //to do вручную посчитать площадь

}