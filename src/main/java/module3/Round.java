package module3;

import java.util.Random;

public class Round extends Figure{

    int[]arr = getCoordinats();
    int a_x = arr[0];
    int a_y = arr[1];
    int b_x = arr[2];
    int b_y = arr[3];


    @Override
    public int[] getCoordinats() {

        Random random = new Random();

        int point_a_x_coordinate = random.nextInt(100 + 1);
        int point_a_y_coordinate = random.nextInt(100 + 1);
        int point_b_x_coordinate = point_a_x_coordinate;
        int point_b_y_coordinate = random.nextInt(100 + 1);

        int[]coordinats = {point_a_x_coordinate, point_a_y_coordinate, point_b_x_coordinate, point_b_y_coordinate};

        return coordinats;
    }

    @Override
    public int getName(int name) {
        this.name = "Round № " + name;
        return super.getName(name);
    }

    @Override
    public int getSpace() {
        return super.getSpace();
    }
}