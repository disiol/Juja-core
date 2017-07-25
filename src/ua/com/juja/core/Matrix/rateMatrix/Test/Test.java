package ua.com.juja.core.Matrix.rateMatrix.Test;

import ua.com.juja.core.Matrix.rateMatrix.RateMatrix;

import static org.testng.Assert.assertEquals;


/**
 * Created by Denis Oleynyk on 24.07.17.
 * mail: deoniisii@gmail.com
 */
public class Test {

//    public static void main(String[] args) {
//        int[][] oldArray = {{1}};
//        int[][] newExpectedArray = {{1}};
//        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
//
//        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
//            throw new AssertionError();
//        }
//
//        System.out.print("OK");
//    }

    @org.junit.jupiter.api.Test

    public void test1() {
        int[][] oldArray = {{1}};
        int[][] newExpectedArray = {{1}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertEquals(newActualArray, newExpectedArray, " [1] -> [1]");
    }

    @org.junit.jupiter.api.Test

    public void test2() {
        int[][] oldArray = {{1, 2}, {3, 4}};
        int[][] newExpectedArray = {{3, 1}, {4, 2}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertEquals(newActualArray, newExpectedArray, " [[1, 2], [3, 4]] -> [[3, 1], [4, 2]]");
    }

    @org.junit.jupiter.api.Test

    public void test3() {
        int[][] oldArray = {{1, 2, 3}, {3, 4}};
        int[][] newExpectedArray = {{3, 1}, {4, 2}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertEquals(newActualArray, newExpectedArray, " [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]]");
    }


    //TODO
    @org.junit.jupiter.api.Test

    public void checkerOfScverMatrix() {
        int[][] oldArray = {{1, 2, 3}, {3, 4}};
        int[][] newExpectedArray = {{3, 1}, {4, 2}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertEquals(newActualArray, newExpectedArray, " [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]]");
    }


    // 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
    //(возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
    // есть строки с null вместо одномерных массивов)
}
