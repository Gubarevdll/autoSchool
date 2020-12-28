package module3.figure;

public abstract class Figure {

    protected String name;
    protected int space;
    protected int[] coordinates;

    protected Figure() {
    }
    /*Здесь не совсем понятно, я не мог создать конструктор в классах-наследниках
    пока не прописал пустой конструктор в классе-родителе. При этом в классе родителе у меня
    уже был написан конструктор принимающий парметр int, но создать или оверрайдить такой же в
    наследниках я не могу, пока не написал пустой конструктор.
     */

    public String getName() {
        return this.name;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace() {
    }

    public int[] getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates() {
        this.coordinates = new int[0];
    }

    public void showCoordinates() {
    }
}
