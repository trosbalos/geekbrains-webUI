package AthleteRacing.Athletes;

import AthleteRacing.Obstacles.Obstacle;

public class Robot implements Athlete {
    private int distance;
    private int height;
    private String name;
    private boolean isReady;



    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean setisReady(boolean isReady) {
        return this.isReady=isReady;
    }

    @Override
    public boolean getisReady() {
        return isReady;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    public Robot(int distance, int height, String name,boolean isReady) {
        this.distance = distance;
        this.height = height;
        this.name = name;
        this.isReady = isReady;
    }


    public void run(Obstacle obstacle) {
        if (obstacle.getDistance() <= this.distance) {
            System.out.println(this.name + " пробежал " + obstacle.getName());
        } else System.out.println(this.name + " не пробежал " + obstacle.getName());
    }

    public void jump(Obstacle obstacle) {
        if (obstacle.getHeight() <= this.height) {
            System.out.println(this.name + " перепрыгнул " + obstacle.getName());
        } else System.out.println(this.name + " не перепрыгнул " + obstacle.getName());
    }


}
