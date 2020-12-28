package HOMEWORKS_GB.Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food-=n;
    }

    public void info() {
        if (food >= 0) {
            System.out.println("plate: " + food);
        } else {
            System.out.println("plate is empty");
        }
    }
    public void addFood(){
        System.out.println("Food is added.");
        food = 100;
    }

}

