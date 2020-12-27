package HOMEWORKS_GB.Lesson6;

public class Dog extends Animal {
    public Dog(Counter counter, String name) {
        super(counter,name, 500, 10);
        counter.countDogs();
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
        if (distance <= getMaxSwimDistance()) {
            System.out.printf("%s проплыл %s метров. %n", getName(), distance);
        } else {
            System.out.printf("%s не может проплыть более %s метров. %n", getName(), getMaxSwimDistance());
        }
    }
}
