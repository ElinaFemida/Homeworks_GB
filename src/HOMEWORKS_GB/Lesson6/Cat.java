package HOMEWORKS_GB.Lesson6;

public class Cat extends Animal {
    public Cat(Counter counter, String name, int maxRunDistance) {
        super(counter, name, maxRunDistance, 0);
        counter.countCats();
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не может плавать. %n", getName());
    }
}
