package AthleteRacing;

import AthleteRacing.Athletes.Athlete;
import AthleteRacing.Athletes.Cat;
import AthleteRacing.Athletes.Human;
import AthleteRacing.Athletes.Robot;
import AthleteRacing.Obstacles.Obstacle;
import AthleteRacing.Obstacles.Runningtrack;
import AthleteRacing.Obstacles.Wall;
import AthleteRacing.RaceService.Race;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class RaceTest {
    @Test
    public void testRace() {
        // Данные заезда.
        Race testrace = new Race();
        Cat boris = new Cat(4, 9, "boris", true);
        Cat gulfik = new Cat(3, 9, "gulfik", true);
        Cat pauk = new Cat(7, 3, "pauk", true);
        Robot term1 = new Robot(5, 2, "term1", true);
        Robot term2 = new Robot(4, 3, "term2", true);
        Robot term3 = new Robot(4, 0, "term3", true);
        Human kolya = new Human(4, 3, "kolya", true);
        Human bolt = new Human(100, 9, "bolt", true);
        Human vasya = new Human(4, 5, "vasya", true);
        Wall wall1 = new Wall(5, "wall1");
        Wall wall2 = new Wall(2, "wall2");
        Wall wall3 = new Wall(8, "wall3");
        Runningtrack track1 = new Runningtrack(9, "track1");
        Runningtrack track2 = new Runningtrack(2, "track2");
        Runningtrack track3 = new Runningtrack(8, "track3");

        Athlete[] athletes = {boris, gulfik, pauk, term1, term2, term3, kolya, vasya, bolt};
        Obstacle[] obstacles = {wall1, wall2, wall3, track1, track2, track3};

        //Поехали

        testrace.race(athletes, obstacles);

        // Проверяем кто дошел.

        Assert.assertEquals(false, boris.getisReady());
        Assert.assertEquals(false, gulfik.getisReady());
        Assert.assertEquals(false, pauk.getisReady());
        Assert.assertEquals(false, vasya.getisReady());
        Assert.assertEquals(true, bolt.getisReady());
        Assert.assertEquals(false, kolya.getisReady());
        Assert.assertEquals(false, term1.getisReady());
        Assert.assertEquals(false, term2.getisReady());
        Assert.assertEquals(false, term3.getisReady());

    }

}