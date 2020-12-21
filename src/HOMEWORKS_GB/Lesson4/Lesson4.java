package HOMEWORKS_GB.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        char[][] field = createField();
        int k = field.length * field.length;
        while (true) {
            doUserMove(field);
            k--;
            if (checkWin(field, 'X')) {
                System.out.println("Congrats!!!");
                System.out.println("You're winner!!!");
                break;
            }
            if (checkDraw(k)) {
                System.out.println("Sorry, the game is draw!!!");
                System.out.println("Bay!!!");
                break;
            }
            doAIMove(field);
            k--;
            if (checkWin(field, 'O')) {
                System.out.println("Sorry!!!");
                System.out.println("AI is winner!!!");
                break;
            }
            if (checkDraw(k)) {
                System.out.println("Sorry, the game is draw!!!");
                System.out.println("Bay!!!");
                break;
            }
        }
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    static void doUserMove(char[][] field) {
        int x, y;
        do {
            x = chooseCoordinate(field.length, 'X');
            y = chooseCoordinate(field.length, 'Y');
        }
        while (field[x][y] != '-');
        field[x][y] = 'X';
        drawField(field);
    }

    static void doAIMove(char[][] field) {
        if (checkAIWin(field, 'O')) {
            drawField(field);
        } else if (checkUserWin(field, 'X')) {
            drawField(field);
        } else if (checkFreeCenter(field)) {
            drawField(field);
        } else {
            Random random = new Random();
            int x, y;
            do {
                x = random.nextInt(field.length);
                y = random.nextInt(field.length);
            } while (field[x][y] != '-');
            field[x][y] = 'O';
            drawField(field);
        }
    }

    static boolean checkAIWin(char[][] field, char sign) {
        for (int i = 1; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-') {
                    field[i][j] = 'O';
                    if (checkWin(field, 'O')) return true;
                    else {
                        field[i][j] = '-';
                    }
                }
            }
        }
        return false;
    }

    static boolean checkUserWin(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-') {
                    field[i][j] = 'X';
                    if (checkWin(field, 'X')) {
                        field[i][j] = 'O';
                        return true;
                    } else {
                        field[i][j] = '-';
                    }
                }
            }
        }
        return false;
    }

    static boolean checkFreeCenter(char[][] field) {
        int n = field.length / 2;
        if (field[n][n] == '-') {
            field[n][n] = 'O';
            return true;
        } else return false;
    }

    static int chooseCoordinate(int maxLength, char sign) {
        Scanner scanner = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Please enter %s-coord in range [1..3]%n", sign);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= maxLength);
        return coord;
    }

    static boolean checkWin(char[][] field, char sign) {
        // Horizontal
        int n, m;
        for (int i = 0; i < field.length; i++) {
            n = 0;
            for (int j = 1; j < field.length; j++) {
                if (field[i][j - 1] == sign && field[i][j] == sign) {
                    n++;
                }
                if (n == (field.length - 1)) {
                    return true;
                }
            }
        }
//                 Vertical
        for (int j = 0; j < field.length; j++) {
            n = 0;
            for (int i = 1; i < field.length; i++) {
                if (field[i - 1][j] == sign && field[i][j] == sign) {
                    n++;
                }
                if (n == (field.length - 1)) {
                    return true;
                }
            }
        }
//                 Diagonal
        n = m = 0;
        for (int i = 0; i < field.length - 1; i++) {
            if ((sign == field[i + 1][i + 1]) && (field[i][i] == sign)) {
                n++;
                if (n == field.length - 1) {
                    return true;
                }
            }
            if ((field[i][field.length - 1 - i] == sign) && (field[i + 1][field.length - 2 - i] == sign)) {
                m++;
                if (m == field.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkDraw(int k) {
        return k == 0;
    }
}

