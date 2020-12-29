package module3.figure;

import java.util.Random;

public class Circle extends Figure {

    public Circle(int name) {
        setName("Circle #" + name);
        setCoordinates(new int[1]);
        setSpace(1);
    }

    @Override
    public void setCoordinates(int[] cords) {
        Random random = new Random();

        int a_x = random.nextInt(10 + 1);
        int a_y = random.nextInt(10 + 1);
        int b_x = a_x;
        int b_y = (a_y + 1) + random.nextInt(10 + 1);
        int radius = Math.abs(a_y - b_y);

        super.setCoordinates(new int[]{a_x, a_y, b_x, b_y, radius});
    }

    @Override
    public void setSpace(int space) {
        int[] cords = super.getCoordinates();
        space = (int) Math.round(Math.PI * (cords[4] * cords[4]));
        super.setSpace(space);
    }

    @Override
    public void showCoordinates() {

        int[] cords = super.getCoordinates();

        System.out.println(getName());
        System.out.println(getName() + " point a: x=" + cords[0] + " y=" + cords[1]);
        System.out.println(getName() + " point b: x=" + cords[2] + " y=" + cords[3]);
        System.out.println(getName() + " radius = " + cords[4]);
        System.out.println(getName() + " space = " + getSpace() + "\n");
    }
}