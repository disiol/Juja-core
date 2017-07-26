package ua.com.juja.core.Matrix.LAB22.rateMatrix;

/**
 * Created by Denis Oleynyk on 24.07.17.
 * mail: deoniisii@gmail.com
 */
public class RateMatrix {
    public static int[][] rotateClockwise(int[][] oldArray) {
        int columnLength = oldArray.length;
        int mideleSkver = oldArray.length / 2;
        int newArray[][] = new int[0][];

        //TODO
        // 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
        // (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
        // есть строки с null вместо одномерных массивов)
        if (checker(oldArray, columnLength)) {
            return null;
        } else {

            for (int i = 0; i < mideleSkver; i++) {
                for (int j = 0; j < mideleSkver; j++) {
                    int tmp = oldArray[i][j];
                    oldArray[i][j] = oldArray[i + mideleSkver - 1][j + mideleSkver - 1];

                }
            }
        }


        //TODO
        // 2) "проворачивает" массив по часовой стрелке на 90 градусов,
        //  т.е[1] -> [1]
        //
        //      [[1, 2],
        //       [3, 4]] -> [[3, 1],          первый елемент воромасива ставитса на место перврго елента первого масава
        //                   [4, 2]]          первый елемент певог масиваа становиса на место втрого елемета первого масива
        //                                втрой елемент первого масива становитса на место втрого лемента второго масива,
        //                                    а втрой лемент на мето первого
        //      [[1, 2, 3],
        //       [4, 5, 6],
        //       [7, 8, 9]] -> [[7, 4, 1],
        //                      [8, 5, 2],
        //                      [9, 6, 3]] ...


        for (int i = 0; i < mideleSkver; i++) {
            for (int j = 0; j < mideleSkver; j++) {
                int tmp = oldArray[i][j];
                oldArray[i][j] = oldArray[i + mideleSkver - 1][j + mideleSkver - 1];

            }


            //print
            for (int f = 0; f < columnLength; f++) {


                System.out.println(oldArray[f][f]);

            }


        }

        return oldArray;
    }

    private static boolean checker(int[][] oldArray, int columnLength) {
        for (int i = 0; i < columnLength; i++) {
            for (int j = 0; j < oldArray[j].length; j++) {
                if (columnLength != oldArray[j].length || oldArray == null) {
                }
                return true;
            }

        }
        return false;
    }
}
