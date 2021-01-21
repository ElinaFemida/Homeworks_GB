package HOMEWORKS_GB.Lesson2_Java2;

public class ArrayCheck {

    public void checkSize(String[][] arr) {
        checkSize(arr.length);
        for (int i = 0; i < arr.length; i++) {
            checkSize(arr[i].length);
        }

    }

    public void checkSize(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4!");
        }
    }

    public int calculate(String[][] arr) {
        checkSize(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    String message = String.format("Невозможно суммировать значение ячейки %s, %s (%s)", i,j, arr[i][j]);
                    throw new MyArrayDataExeption(message, e);
                }
            }
        }
        return result;
    }
}
