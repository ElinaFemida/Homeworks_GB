package HOMEWORKS_GB.Lesson6;

public class Lesson6 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Cat cat1 = new Cat(counter, "Persik");
        Cat cat2 = new Cat(counter, "Mars");
        Dog dog1 = new Dog(counter,"Bobik");
        Dog dog2 = new Dog(counter,"Baton");
        Cat catn = new Cat(counter,"Murzik");
        Dog dogn = new Dog(counter, "Tuzik");

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