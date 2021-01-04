package module3.figure;


public class Triangle extends Figure {

    public Triangle(int name, int size) {
        setName("Triangle #" + name);
        setCoordinates(buildCoordinates(size));
        setSpace(evaluateSpace());
    }


    @Override
    public int[] buildCoordinates(int size) {
        int a_x = size;
        int a_y = size;
        int b_x_center = a_x;
        int b_y_center = (a_y + 1) + size;
        int half_width = 1 + size;
        int c_x = b_x_center - half_width;
        int c_y = b_y_center;
        int d_x = b_x_center + half_width;
        int d_y = b_y_center;
        int height = Math.abs(a_y - b_y_center);
        int width = Math.abs(c_x - d_x);

        return new int[]{a_x, a_y, b_x_center, b_y_center, half_width, c_x, c_y, d_x, d_y, height, width};
    }

    @Override
    public int evaluateSpace() {
        int[] cords = super.getCoordinates();
        return (cords[9] * cords[10]) / 2;
    }

    @Override
    public void showCoordinates() {
        int[] cords = super.getCoordinates();

        System.out.println(getName());
        System.out.println(getName() + " point a: x=" + cords[0] + " y=" + +cords[1]);
        System.out.println(getName() + " point c: x=" + cords[5] + " y=" + +cords[6]);
        System.out.println(getName() + " point d: x=" + cords[7] + " y=" + +cords[8]);
        System.out.println(getName() + " space = " + getSpace() + "\n");
    }
}

