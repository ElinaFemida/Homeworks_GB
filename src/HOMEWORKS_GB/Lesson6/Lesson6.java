package HOMEWORKS_GB.Lesson6;

public class Lesson6 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Cat cat1 = new Cat(counter, "Persik", 200);
        Cat cat2 = new Cat(counter, "Mars", 200);
        Dog dog1 = new Dog(counter,"Bobik", 500,10);
        Dog dog2 = new Dog(counter,"Baton", 500, 10);
        Cat catn = new Cat(counter,"Murzik", 200);
        Dog dogn = new Dog(counter, "Tuzik", 500, 10);

        cat1.run(100);
        cat2.run(200);
        cat1.swim(100);
        cat2.swim(200);
        catn.run(1000);
        dog1.run(1000);
        dog2.run(500);
        dog1.swim(10);
        dog2.swim(6);
        dogn.swim(100);
        System.out.println("Cats:" + catn.getAnimalCounter().getCatCounter());
        System.out.println("Dogs:" + dog1.getAnimalCounter().getDogCounter());
        System.out.println("Animals:" + dog1.getAnimalCounter().getAnimalCounter());
    }
    }