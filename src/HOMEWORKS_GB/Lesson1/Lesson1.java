package HOMEWORKS_GB.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
//2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte byte1 = -50;
        short short1 = 23576;
        long long1 = 6578493045L;
        boolean boolean1 = true;
        int int1, int2, int3, int4, result1;
        float a, b, c, d;
        char char1 = 'c';
        System.out.println (calculate (15,6,8,7));
        System.out.println(isSummInRange (5,16));
        isNumberPositiveOrNegative(6);
        System.out.println (isPositiveOrNegative (67));
        greeting ("Элина");
        isBissextileYear (1896);

    }

// 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – аргументы этого метода, имеющие тип float.
// результат у меня типа int

    static int calculate(int a, int b, int c, int d) {
        int result1 = a * (b + (c / d));
        return result1;
    }
//4. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    static boolean isSummInRange (int int1, int int2) {
        if ((int1 + int2) >= 10 && (int1 + int2) <= 20) {
            return true;
        } else {
            return false;
        }
    }
//5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    static void isNumberPositiveOrNegative (int int3){
        if (int3 >= 0) {
            System.out.println("Число " + int3 + " положительное");
        }
        else {
            System.out.println("Число " +int3 + " отрицательное");
        }
    }
//6. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean isPositiveOrNegative (int int4){
        if (int4 <=0) {
            return true;
        }
        else {
            return false;
        }
    }
    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    static void greeting (String name){
        System.out.println("Привет, " + name + "!");
    }
//8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void isBissextileYear (int int5){
        if ((int5 % 400 == 0) || ((int5 % 100 !=0) && (int5 % 4 == 0))){
            System.out.println(int5 + " - високосный год");
        }
        else {
            System.out.println(int5 + " - невисокосный год");
        }
    }
}
