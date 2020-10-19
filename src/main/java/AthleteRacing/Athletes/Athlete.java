package AthleteRacing.Athletes;

import AthleteRacing.Obstacles.Obstacle;

public interface Athlete {

    void run(Obstacle obstacle);

    void jump(Obstacle obstacle);

    int getDistance();

    int getHeight();

    String getName();

    boolean setisReady(boolean isReady);
    boolean getisReady();


}