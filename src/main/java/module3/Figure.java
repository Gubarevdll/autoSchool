package module3;

public abstract class Figure {

    private String name;
    private double space;
    private double[] coordinates;

    protected Figure() {
    }
    /*Здесь не совсем понятно, я не мог создать конструктор в классах-наследниках
    пока не прописал пустой конструктор в классе-родителе. При этом в классе родителе у меня
    уже был написан конструктор принимающий парметр int, но создать или оверрайдить такой же в
    наследниках я не могу, пока не написал пустой конструктор.
     */


    public Figure(int name) {
        this.name = "Figure №:" + name;
    }

    public String getName() {
        return name;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace() {
        this.space = space;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates() {
        double[] coordinates = new double[0];
        this.coordinates = coordinates;
    }

    public void showCoordinates() {
    }
}
