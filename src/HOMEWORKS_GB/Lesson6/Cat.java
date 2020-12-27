package HOMEWORKS_GB.Lesson6;

public class Cat extends Animal {
    public Cat(Counter counter, String name) {
        super(counter, name, 200, 0);
        counter.countCats();
    }

    @Override
    public void run(int distance) {
        if (distance <= getMaxRunDistance()) {
            System.out.printf("%s пробежал %s метров. %n", getName(), distance);
        } else {
            System.out.printf("%s не может пробежать более %s метров. %n", getName(), getMaxRunDistance());
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не может плавать. %n", getName());
    }
}
