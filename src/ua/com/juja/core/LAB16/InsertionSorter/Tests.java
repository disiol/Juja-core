package ua.com.juja.core.LAB16.InsertionSorter;

import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 06.07.17.
 * mail: deoniisii@gmail.com
 */
public class Tests {

    public static void main(String[] args) {
        // fill elements
        int[] array = new int[]{2, 1, 6, 7, 8, 9};
        // library sort
        int[] expected = array.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = array.clone();
        InsertionSorterOptemizetd.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected) + " but actual  = " + Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}