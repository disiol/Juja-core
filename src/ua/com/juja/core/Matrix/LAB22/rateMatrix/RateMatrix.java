package ua.com.juja.core.Matrix.LAB22.rateMatrix;

/**
 * Created by Denis Oleynyk on 24.07.17.
 * mail: deoniisii@gmail.com
 */
public class RateMatrix {


    public static void main(String[] args) {
        Object res;
        System.out.println(res = RateMatrix.rotateClockwise(null));
    }


    public static int[][] rotateClockwise(int[][] oldArray) {

        if (checker(oldArray)) {
            return null;
        }

        int columnLength = oldArray.length;
        int roowLeght = oldArray[0].length;
        int newArray[][] = new int[columnLength][columnLength];


        rateMatrix(oldArray, columnLength, newArray);

        printMaprix(columnLength, newArray);


        return newArray;
    }

    private static boolean checker(int[][] oldArray) {
        if (oldArray == null || oldArray.length == 0 || oldArray[0] == null || oldArray[0].length != oldArray.length) {
            return true;
        }


        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] == null || oldArray[i].length != oldArray[0].length) {
                return true;
            }
        }
        return false;
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

}
