package AthleteRacing.RaceService;


import AthleteRacing.Athletes.Athlete;
import AthleteRacing.Obstacles.Obstacle;
import AthleteRacing.Obstacles.Runningtrack;
import AthleteRacing.Obstacles.Wall;

public class Race {

        public void race (Athlete[]athletes, Obstacle[]obstacles){
            for (Athlete athlete : athletes) {
                for (Obstacle obstacle : obstacles) {
                    if (athlete.getisReady()) {
                        if (obstacle instanceof Wall) {
                            athlete.jump(obstacle);
                            if (obstacle.getHeight() > athlete.getHeight()) {
                                System.out.println(athlete.getName() + " не перепрыгнул т.к. "+obstacle.getName()+" высотой " + obstacle.getHeight() + ", a атлет прыгнул на " + athlete.getHeight());
                                athlete.setisReady(false);
                            }
                        }
                        if (obstacle instanceof Runningtrack) {
                            athlete.run(obstacle);
                            if (obstacle.getDistance() > athlete.getDistance()) {
                                System.out.println(athlete.getName() + " не пробежал т.к. "+obstacle.getName()+" длиной " + obstacle.getDistance() + ", a атлет пробежал  " + athlete.getDistance());
                                athlete.setisReady(false);
                            }
                        }
                    }
                }
            }
        }
    }
