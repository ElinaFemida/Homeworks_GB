package HOMEWORKS_GB.Lesson2;

import java.util.Scanner;
import java.util.Arrays;

public class Lesson2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int[] numbers = new int[8];
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 10;
        int[][] arr2 = new int[i][i];
        int[] mas = doRandomArr();
        doReplaceInArray(mas);
        System.out.println();
        fillArr(numbers);
        System.out.println();
        multiplyByTwo(arr1);
        System.out.println();
        fillDiagonal(arr2);
        System.out.println();
        int[] mas2 = doRandomArr2();
        maxMinArr(mas2);
        System.out.println();
        int[] mas3 = doRandomArr3();
        System.out.println(checkBalance(mas3));
        System.out.println();
        int[] mas4 = doUserArr();
        System.out.println(checkBalance_var2(mas4));
    }

    //1.Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void doReplaceInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] doRandomArr() {
        int[] randomArr = new int[10];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 2);
        }
        return randomArr;
    }

    //2.Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void fillArr(int[] numbers) {
        for (int i = 0, n = 0; i < numbers.length; n = n + 3, i++) {
            numbers[i] = n;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//числа меньшие 6 умножить на 2;
    static void multiplyByTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5.Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static void maxMinArr(int[] arr) {
        int maxNumber = arr[0], minNumber = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            } else if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        System.out.println("В массиве максимальное число: " + maxNumber + '\n' + "Минимальное число: " + minNumber);
    }

    static int[] doRandomArr2() {
        System.out.println("Введите минимальное число массива");
        int min = sc.nextInt();
        System.out.println("Введите максимальное число массива");
        int max = sc.nextInt();
        int[] randomArr = new int[10];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = min + (int) (Math.random() * (max - min) + 1);
        }
        return randomArr;
    }


//6** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.
// первый вариант

    static boolean checkBalance(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int commonSum = 0;
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            commonSum += arr[i];
        }
        if (commonSum % 2 == 0) {
            for (int i = 0; (i < arr.length) & (n <= (commonSum - n)); i++) {
                if (n == commonSum - n) {
                    return true;
                } else {
                    n += arr[i + 1];
                }
            }
        }
        return false;
    }

    static int[] doRandomArr3() {
        System.out.println("Введите минимальное число массива");
        int min = sc.nextInt();
        System.out.println("Введите максимальное число массива");
        int max = sc.nextInt();
        int[] randomArr = new int[10];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = min + (int) (Math.random() * (max - min) + 1);
        }
        return randomArr;
    }

    //    второй вариант
    static boolean checkBalance_var2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int commonSum = 0;
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            commonSum += arr[i];
        }
        if (commonSum % 2 == 0) {
            for (int i = 0; (i < arr.length) & (n <= (commonSum - n)); i++) {
                if (n == commonSum - n) {
                    return true;
                } else {
                    n += arr[i + 1];
                }
            }
        }
        return false;
    }

    static int[] doUserArr() {
        System.out.println("Введите количество элементов массива");
        int n = sc.nextInt();
        int[] userArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число");
            userArr[i] = sc.nextInt();
        }
        return userArr;

    }
}
