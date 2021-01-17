package HOMEWORKS_GB.Lesson1_Java2;
public class ObstacleArr {

    private BaseObstacle[] obstacles;

    public BaseObstacle[] getObstacles() {
        return obstacles;
    }

    public ObstacleArr(BaseObstacle... obstacle) {
        obstacles = new BaseObstacle[obstacle.length];
        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i] = obstacle[i];
        }
    }

    public void info() {
        for (BaseObstacle obstacle : obstacles) {
            obstacle.info();
        }
    }

}
