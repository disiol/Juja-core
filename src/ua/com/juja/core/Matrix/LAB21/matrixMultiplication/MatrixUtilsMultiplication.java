package ua.com.juja.core.Matrix.LAB21.matrixMultiplication;

/**
 * Created by Denis Oleynyk on 19.07.17.
 * mail: deoniisii@gmail.com
 */
public class MatrixUtilsMultiplication {


    static int[][] A = {{1, 2},
            {7, 8},
            {3, 4}};

    static int[][] B = {{3, 4, 5, 6},
            {9, 0, 1, 2}};
    static int[][] C;

    public static void main(String[] args) {
        C = mul(A, B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++)
                System.out.print("\t" + C[i][j] + " ");
            System.out.println();
        }


    }


    public static int[][] mul(int[][] fst, int[][] snd) {
        if (fst == null || snd == null) {
            throw new IllegalArgumentException();
        }
        if (fst[0].length != snd.length) {
            throw new IllegalArgumentException();
        }

        int[][] result = new int[fst.length][snd[0].length];
        int rows = result.length;
        int columns = result[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int sum = 0;

                for (int k = 0; k < fst[0].length; k++) {
                    sum += fst[i][k] * snd[k][j];
                }

                result[i][j] = sum;
            }
        }
        return result;
    }


}