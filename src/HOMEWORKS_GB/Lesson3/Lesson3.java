package HOMEWORKS_GB.Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
//2    * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
// "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
// "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
// правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться: String str = "apple";
//char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.
        System.out.println("Перед вами массив:");
        String[] arr = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        String guessWord = doRandom(arr);
//      System.out.println(guessWord);
        int n = 0;
        while (n < 3) {
            System.out.println("Количество попыток: " + (3 - n));
            String userWord = getUserWord();
            if (guessWord.equals(userWord)) {
                System.out.print("Вы угадали!");
                break;
            } else {
                for (int i = 0; i < guessWord.length() && i < userWord.length(); i++) {
                    char a = guessWord.charAt(i);
                    char b = userWord.charAt(i);
                    if (a == b) {
                        System.out.print(b);
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("########");
                System.out.print("Вы не угадали. ");
            }
            n++;
            if (n < 2) {
                System.out.println("Попробуйте еще раз.");
            }
        }
        System.out.println("Загаданное слово - " + guessWord);

    }

    static String doRandom(String[] arr) {
        Random random = new Random();
        int number = random.nextInt(arr.length);
        return arr[number];
    }

    static String getUserWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте, какое слово я загадал?");
        String userWord = sc.next();
        return userWord;
    }
}