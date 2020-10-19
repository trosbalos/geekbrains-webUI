package AthleteRacing.Obstacles;

public class Wall implements Obstacle {
    private int height;
    private  String name;


    public int getHeight() {
        return height;
    }

    @Override
    public int getDistance() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    public Wall(int height, String name) {
        this.height = height;
        this.name = name;
    }


}