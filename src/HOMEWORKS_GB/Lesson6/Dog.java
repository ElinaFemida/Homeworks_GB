package HOMEWORKS_GB.Lesson6;

public class Dog extends Animal {
    public Dog(Counter counter, String name, int maxRunDistance, int maxSwimDistance) {
        super(counter, name, maxRunDistance, maxSwimDistance);
        counter.countDogs();
    }
}
