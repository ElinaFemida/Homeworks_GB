package HOMEWORKS_GB.Lesson6;

public class Counter {
    private int animalCounter;
    private int catCounter;
    private int dogCounter;

    public void countAnimal() {
        animalCounter++;
    }

    public void countCats() {
        catCounter++;
    }

    public void countDogs() {
        dogCounter++;
    }

    public int getAnimalCounter() {
        return animalCounter;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public int getDogCounter() {
        return dogCounter;
    }
}
