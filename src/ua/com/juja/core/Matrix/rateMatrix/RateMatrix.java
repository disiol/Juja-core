package ua.com.juja.core.Matrix.rateMatrix;

/**
 * Created by Denis Oleynyk on 24.07.17.
 * mail: deoniisii@gmail.com
 */
public class RateMatrix {
    public static int[][] rotateClockwise(int[][] oldArray) {
           //TODO
        // 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
        // (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
        // есть строки с null вместо одномерных массивов)
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray.length != oldArray[0].length || oldArray == null){
                return null;
            }
        }




             //TODO
            // 2) "проворачивает" массив по часовой стрелке на 90 градусов,
            //  т.е[1] -> [1]
            //
            //  [[1, 2], [3, 4]] -> [[3, 1], [4, 2]]
            //
            //  [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...

            return null;
    }
}
