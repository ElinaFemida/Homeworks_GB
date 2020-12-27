package HOMEWORKS_GB.Lesson6;

public abstract class Animal {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private Counter counter;


    public String getName() {
        return name;
    }
    public Counter getAnimalCounter(){
        return counter;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }



    public Animal(Counter counter, String name, int maxRunDistance, int maxSwimDistance) {
        this.counter = counter;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        counter.countAnimal();
    }

    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.printf("%s может пробежать не более %s метров.%n", name, maxRunDistance);
            return;
        }
        System.out.printf("%s пробежал %s метров.%n", name, distance);
    }

    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.printf("%s может проплыть не более %s метров.%n", name, maxSwimDistance);
            return;
        }
        System.out.printf("%s проплыл %s метров.%n", name, distance);
    }
}

