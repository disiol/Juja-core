package ua.com.juja.core.Matrix.rateMatrix.Test;

import ua.com.juja.core.Matrix.rateMatrix.RateMatrix;

import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 24.07.17.
 * mail: deoniisii@gmail.com
 */
public class Test {

    public static void main(String[] args) {
        int[][] oldArray = {{1}};
        int[][] newExpectedArray = {{1}};
        int[][] newActualArray = RateMatrix.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }


}
