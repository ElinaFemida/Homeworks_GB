package HOMEWORKS_GB.Lesson7;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p, int getFood) {
        if ((getFood - appetite) >= 0) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.printf("%s's satiety is %s.%n", name, satiety);
//            System.out.printf("%s ate. %n%s's satiety is %s. %n", name, name, satiety);

        }
        else {
//            System.out.printf("There's not enough food for %s((( %n%s's satiety is %s. %n", name, name, satiety);
            System.out.printf("%s's satiety is %s. %n", name, satiety);
        }

    }
}
