package HOMEWORKS_GB.Lesson7;

public class CatsVSPlate {
    public static void main(String[] args) {

        Cats[] catsArr = new Cats[5];
        catsArr[0] = new Cats("Musya", 10, false);
        catsArr[1] = new Cats("Sima", 30, false);
        catsArr[2] = new Cats("Barsik", 40, false);
        catsArr[3] = new Cats("Ryzhik", 30, false);
        catsArr[4] = new Cats("Keks", 10, false);
        Plate plate1 = new Plate(100);
        plate1.info();

// вариант 1, когда все будут накормлены
        for (int i = 0; i < catsArr.length; i++) {
            if ((plate1.getFood() - catsArr[i].getAppetite()) >= 0) {
                catsArr[i].eat(plate1, plate1.getFood());
            } else {
                plate1.addFood();
                catsArr[i].eat(plate1, plate1.getFood());
            }
        }
        // вариант 2, когда кто-то останется голодным
//        for (int i = 0; i < catsArr.length; i++) {
//            if ((plate1.getFood() - catsArr[i].getAppetite()) >= 0) {
//                catsArr[i].eat(plate1, plate1.getFood());}
//            else {
//                catsArr[i].eat(plate1, plate1.getFood());
//            }
//            }
        plate1.info();
    }
}
