package HOMEWORKS_GB.Lesson1_Java2;
public class Human implements BaseMemberClass {
    String name;
    int height;
    int distance;

    public Human(String name, int height, int distance) {
        this.name = name;
        this.height = height;
        this.distance = distance;
    }
    @Override
    public void info() {
        System.out.print(this.name);
    }
    @Override
    public int getMaxDistance() {
        return distance;
    }
    @Override
    public int getMaxHeight() {
        return height;
    }
}
