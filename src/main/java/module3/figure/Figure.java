package module3.figure;

public abstract class Figure {

    private String name;
    private int space;
    private int[] coordinates;

    public Figure() {
    }
    /*Здесь не совсем понятно, я не мог создать конструктор в классах-наследниках
    пока не прописал пустой конструктор в классе-родителе. При этом в классе родителе у меня
    уже был написан конструктор принимающий парметр int, но создать или оверрайдить такой же в
    наследниках я не могу, пока не написал пустой конструктор.
     */

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
}
