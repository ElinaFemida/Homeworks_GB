package HOMEWORKS_GB.Lesson1_Java2;
public class Treadmill implements BaseObstacle{
    private int distance;
    public Treadmill(int distance) {
        this.distance = distance;    }

    @Override
    public String info() {
        return (" distance: " + distance);
    }

    @Override
    public int getinfo() {
        return distance;
    }
}

