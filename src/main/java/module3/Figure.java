package module3;

public abstract class Figure {

     String name;
     double space;

    public int getName (int name){
        this.name = "figure № " + name;
        return name;
    }

    public int[] getCoordinats(){
        int[]coordinates = new int[0];
        return coordinates;
    }

    public int getSpace(){
        int a = 0;
        return a;
    }

}
