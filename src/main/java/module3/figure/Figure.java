package module3.figure;

public abstract class Figure {

    private String name;
    private int space;
    private int[] coordinates;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int[] getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(int[] cords) {
        this.coordinates = cords;
    }

    public void showCoordinates() {
    }

    public abstract int evaluateSpace();

    public abstract int[] buildCoordinates(int size);
}
