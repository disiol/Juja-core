package ua.com.juja.core.Matrix.LAB22.rateMatrix.Test;

import ua.com.juja.core.Matrix.LAB22.rateMatrix.RateMatrix;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        assertEquals(Arrays.toString(newActualArray), Arrays.toString(newExpectedArray), " [1] -> [1]");
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
        int[][] oldArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newExpectedArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertEquals(newActualArray, newExpectedArray, " [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]]");
    }


    @org.junit.jupiter.api.Test

    public void checkerOfScverMatrixNull() {
        int[][] oldArray = {{}, {}, {}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertNull(newActualArray, "одна из размерностей = 0");
    }


    @org.junit.jupiter.api.Test

    public void checkerOfScverMatrixZero() {
        int[][] oldArray = {{1, 2, 3}, {}, {}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertNull(newActualArray, "null вместо массива");
    }

    @org.junit.jupiter.api.Test

    public void checkerOfScverMatrixNull2() {
        int[][] oldArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 9}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertNull(newActualArray, "есть строки разной длины");
    }

    @org.junit.jupiter.api.Test

    public void checkerOfScverMatrixNull3() {
        int[][] oldArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}, {7, 8, 9,}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);
        assertNull(newActualArray, "длина не равна ширине");
    }


    // 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
    //(возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
    // есть строки с null вместо одномерных массивов)есть строки разной длин
}
