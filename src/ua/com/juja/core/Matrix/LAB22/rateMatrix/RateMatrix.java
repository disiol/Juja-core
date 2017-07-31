package ua.com.juja.core.Matrix.LAB22.rateMatrix;

/**
 * Created by Denis Oleynyk on 24.07.17.
 * mail: deoniisii@gmail.com
 */
public class RateMatrix {
    public static void main(String[] args) {
        int[][] oldArray = {new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};

        rotateClockwise(oldArray);

    }


    public static int[][] rotateClockwise(int[][] oldArray) {
        int columnLength = oldArray.length;
        int mideleSkver = oldArray.length / 2;
        int newArray[][] = new int[columnLength][columnLength];

//
//        // 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
//        // (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
//        // есть строки с null вместо одномерных массивов)
        if (checker(oldArray, columnLength)) {
            return null;
        } else {
            rateMatrix(oldArray, columnLength, newArray);

            printMaprix(columnLength, newArray);

        }

        return newArray;
    }

    private static void printMaprix(int columnLength, int[][] newArray) {
        for (int b = 0; b < columnLength; b++) {
            for (int c = 0; c < newArray[b].length; c++) {
                System.out.printf("%3d ", newArray[b][c]);
            }
            System.out.print("\n");
        }
    }

    private static void rateMatrix(int[][] oldArray, int columnLength, int[][] newArray) {
        int i, j;
        for (i = 0; i < columnLength; i++) {
            for (j = 0; j < columnLength; j++) {
                newArray[i][j] = oldArray[columnLength - j - 1][i];
            }
        }
    }

    private static boolean checker(int[][] oldArray, int columnLength) {
        int rowLengt;
        for (int i = 0; i < columnLength; i++) {
            rowLengt = oldArray[i].length;

            for (int j = 0; j < rowLengt; j++) {
                if (columnLength != rowLengt || oldArray == null) {
                    return true;
                }
                return false;
            }

        }
        return false;
    }
}
