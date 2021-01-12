package module3.figure;


public class Square extends Figure {

    public Square(int name, int size) {
        setName("Square #" + name);
        setCoordinates(buildCoordinates(size));
        setSpace(evaluateSpace());
    }

    @Override
    public int[] buildCoordinates(int size) {
        int a_x = size;
        int a_y = size;
        int b_x = a_x;
        int b_y = (a_y + 1) + size;
        int c_x = Math.abs(a_y - b_y) + a_x;
        int c_y = a_y;
        int d_x = c_x;
        int d_y = b_y;
        int side_length = Math.abs(a_y - b_y);

        return new int[]{a_x, a_y, b_x, b_y, c_x, c_y, d_x, d_y, side_length};
    }

    @Override
    public int evaluateSpace() {
        int[] cords = super.getCoordinates();
        return cords[8] * cords[8];
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

