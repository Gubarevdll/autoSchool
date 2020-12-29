package module3.figure;

import java.util.Random;

public class Square extends Figure {

    public Square(int name) {
        setName("Square #" + name);
        setCoordinates(new int[8]);
        setSpace(1);
    }

    @Override
    public void setCoordinates(int[] cords) {
        Random random = new Random();

        int a_x = random.nextInt(10 + 1);
        int a_y = random.nextInt(10 + 1);
        int b_x = a_x;
        int b_y = (a_y + 1) + random.nextInt(10 + 1);
        int c_x = Math.abs(a_y - b_y) + a_x;
        int c_y = a_y;
        int d_x = c_x;
        int d_y = b_y;
        int side_length = Math.abs(a_y - b_y);

        super.setCoordinates(new int[]{a_x, a_y, b_x, b_y, c_x, c_y, d_x, d_y, side_length});
    }

    @Override
    public void setSpace(int space) {
        int[] cords = super.getCoordinates();
        space = cords[8] * cords[8];
        super.setSpace(space);
    }

    @Override
    public void showCoordinates() {
        int[] cords = super.getCoordinates();

        System.out.println(getName());
        System.out.println(getName() + "point a: x=" + cords[0] + " y=" + cords[1]);
        System.out.println(getName() + "point b: x=" + cords[2] + " y=" + cords[3]);
        System.out.println(getName() + "point c: x=" + cords[4] + " y=" + cords[5]);
        System.out.println(getName() + "point d: x=" + cords[6] + " y=" + +cords[7]);
        System.out.println(getName() + "space = " + getSpace() + "\n");

    }
}

