package HOMEWORKS_GB.Lesson2_Java2;

public class Lesson2_Java2 {
    public static void main(String[] args) {
        String[][] testArr1 = {{"10", "10", "10", "10"},
                            {"10", "10", "10", "10"},
                            {"10", "10", "10", "10"},
                            {"10", "ibwrhrb", "10", "10"}};
        String[][] testArr2 = {{"10", "10", "10"},
                              {"10", "10", "10", "10"},
                              {"10", "10", "10", "10"},
                              {"10", "k", "10", "10"}};
        String[][] testArr3 = {{"10", "10", "10", "10"},
                               {"10", "10", "10", "10"},
                               {"10", "10", "10", "10"},
                               {"10", "1", "10", "10"}};
        String[][] testArr4 = {{"10", "10", "10"},
                                {"10", "10", "10", "10"},
                                {"10", "k", "10", "10"}};


        ArrayCheck arr = new ArrayCheck();
//        System.out.println(arr.calculate(testArr1));
//        System.out.println(arr.calculate(testArr2));
        System.out.println(arr.calculate(testArr3));
        System.out.println(arr.calculate(testArr4));
    }
}


