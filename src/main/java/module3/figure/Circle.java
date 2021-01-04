package module3.figure;


public class Circle extends Figure {

    public Circle(int name, int size) {
        setName("Circle #" + name);
        setCoordinates(buildCoordinates(size));
        setSpace(evaluateSpace());
    }

    @Override
    public int[] buildCoordinates(int size) {
        int a_x = size;
        int a_y = size;
        int b_x = a_x;
        int b_y = (a_y + 1) + size;
        int radius = Math.abs(a_y - b_y);

        return new int[]{a_x, a_y, b_x, b_y, radius};
    }

    @Override
    public int evaluateSpace() {
        int[] cords = super.getCoordinates();
        return (int) Math.round(Math.PI * (cords[4] * cords[4]));
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