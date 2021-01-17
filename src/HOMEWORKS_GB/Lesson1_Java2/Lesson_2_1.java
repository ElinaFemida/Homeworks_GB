package HOMEWORKS_GB.Lesson1_Java2;
public class Lesson_2_1 {
    public static void main(String[] args) {

        BaseMemberClass[] persons = {
                new Human("Gosha", 5, 15000),
                new Robot("Wall-e", 20, 10000),
                new Human("Ivan", 3, 10000),
                new Cats("Bars", 15, 1000),
                new Human("Petro", 10, 5000),
                new Cats("Snezhok", 20, 1500),
                new Human("Hanna", 3, 15000),
                new Robot("Atlas", 30, 20000),
        };
        ObstacleArr raceObstacles = new ObstacleArr(new Wall(1), new Treadmill(1000), new Wall(3),
                new Treadmill(8000), new Wall(8));

        for (BaseMemberClass person : persons) {
            for (int j = 0; j < raceObstacles.getObstacles().length; j++) {
                if (raceObstacles.getObstacles()[j] instanceof Wall) {
                    if (person.getMaxHeight() < (raceObstacles.getObstacles()[j]).getinfo()) {
                        person.info();
                        System.out.println(" can't take wall" + raceObstacles.getObstacles()[j].info() + "m");
                        break;
                    } else {
                        person.info();
                        System.out.println(" passed" + raceObstacles.getObstacles()[j].info() + "m");
                    }
                }
                if (raceObstacles.getObstacles()[j] instanceof Treadmill) {
                    if (person.getMaxDistance() < (raceObstacles.getObstacles()[j]).getinfo()) {
                        person.info();
                        System.out.println(" can't take treadmill" + raceObstacles.getObstacles()[j].info() + "m");
                        break;
                    } else {
                        person.info();
                        System.out.println(" passed" + raceObstacles.getObstacles()[j].info() + "m");
                    }
                }
            }
        }
    }
}
