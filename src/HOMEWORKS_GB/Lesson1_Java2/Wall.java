package HOMEWORKS_GB.Lesson1_Java2;

public class Wall implements BaseObstacle{
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String info() {
        return (" height: " + height);
    }

    @Override
    public int getinfo() {
        return height;
    }
}
