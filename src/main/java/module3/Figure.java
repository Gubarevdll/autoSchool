package module3;

public abstract class Figure {

     private String name;
     private double space;
     private double[] coordinates;

    protected Figure() {
    }
    //Здесь не совсем понятно, я не смог создать конструктов в классе неследнике,
    //Идея предложила создать пустой конструктор и только потом получилось создать его в наследнике
    // У меня есть конструктор с параметрами, зачем в таком случае прописывать пустой?


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

    public void showCoordinates(){
    }
}
