package module3;

import java.util.Random;

public class Round extends Figure {
    private String name;
    private double[] coordinates = new double[5];
    private double a_x;
    private double a_y;
    private double b_x;
    private double b_y;
    private double radius;
    private double space;


    public Round(int name) {
        this.name = "Round #" + name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCoordinates() {
        Random random = new Random();

        this.name = "Round №" + name;
        this.a_x = random.nextInt(10 + 1);
        this.a_y = random.nextInt(10 + 1);
        this.b_x = a_x;
        this.b_y = random.nextInt(10 + 1);
        this.radius = Math.abs(a_y - b_y);
        this.space = Math.PI * (radius * radius);

        double[] coordinates = {a_y, a_y, b_x, b_y, radius};
        this.coordinates = coordinates;
    }

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public void setSpace(double space) {
        this.space = Math.PI * (radius * radius);
        this.space = space;
    }

    @Override
    public double getSpace() {
        return space;
    }

    @Override
    public void showCoordinates() {
        System.out.println(name);
        System.out.println("Round point a: x=" + a_x + " y=" + a_y);
        System.out.println("Round point b: x=" + b_x + " y=" + b_y);
        System.out.println("Round radius : " + radius);
        System.out.println("Space = " + space);
        super.showCoordinates();
    }
}