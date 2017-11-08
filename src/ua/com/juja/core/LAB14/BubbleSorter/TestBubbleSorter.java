package ua.com.juja.core.LAB14.BubbleSorter;

import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 28.06.17.
 * mail: deoniisii@gmail.com
 */
public class TestBubbleSorter {
    // fill elements
    public static final int[] ARRAY = new int[]{10, 2, 1, 3, 5, 4, 6, 8, 7, 9};

    public static void main(String[] args) {

        Test();
        System.out.println();
        TestLeft();


    }

    private static void Test() {
        long start = System.nanoTime();


        // library sort
        int[] expected = ARRAY.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = ARRAY.clone();
        BubbleSorter.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected)
                    + " but actual  = " + Arrays.toString(actual));
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнеия: " + timeConsumedMillis);
        System.out.println();
        System.out.print("OK");
    }

    private static void TestLeft() {
        long start = System.nanoTime();

        // fill elements
//        int[] ARRAY = new int[]{2, 1};
        // library sort
        int[] expected = ARRAY.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = ARRAY.clone();
        BubbleSorterSinksToTheLeft.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected)
                    + " but actual  = " + Arrays.toString(actual));
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнеия: " + timeConsumedMillis);
        System.out.println();
        System.out.print("OK");
    }

}
