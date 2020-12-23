package module3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Round round = new Round();
        System.out.println("Round point a: x=" + round.a_x +" y="+ round.a_y);
        System.out.println("Round point b: x=" + round.b_x +" y="+ round.b_y);
        System.out.println("Round radius : " + round.radius);
        System.out.println("Space = " + round.space);

        Triangle triangle = new Triangle();
        System.out.println();

        System.out.println("Triangle point a: x="+ triangle.a_x+" y="+ triangle.a_y);
        System.out.println("Triangle low-center: x="+ triangle.b_x_center+" y="+ triangle.b_y_center);
        System.out.println("Triangle point c: x="+ triangle.c_x+" y="+ triangle.c_y);
        System.out.println("Triangle point d: x="+ triangle.d_x+" y="+ triangle.d_y);
        System.out.println("Triangle space = " + round.space);

        System.out.println();

        Sqare sqare = new Sqare();

        System.out.println("Sqare point a: x="+sqare.a_x+" y="+sqare.a_y );
        System.out.println("Sqare point b: x="+sqare.b_x+" y="+sqare.b_y );
        System.out.println("Sqare point c: x="+sqare.c_x+" y="+sqare.c_y );
        System.out.println("Sqare point d: x="+sqare.d_x+" y="+sqare.d_y );
        System.out.println("Spare space = " + sqare.space);


    }
}
