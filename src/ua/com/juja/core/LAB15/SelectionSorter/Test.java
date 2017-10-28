package ua.com.juja.core.LAB15.SelectionSorter;

/**
 * Created by Denis Oleynyk on 29.06.17.
 * mail: deoniisii@gmail.com
 */

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test_NotNull");
        Test1();
        System.out.println();
        System.out.println("Test2");
        Test2();
        System.out.println();
        System.out.println("Test3");
        Test3();

    }

    private static void Test1() {
        long start = System.nanoTime();
        // fill random elements
        Random rnd = new Random(0);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        // library sort
        int[] expected = array.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = array.clone();
        SelectionSorter.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected) + " but actual  = "
                    + Arrays.toString(actual));
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнеия: " + timeConsumedMillis / 60);
        System.out.println();
        System.out.print("OK");
    }

    private static void Test2() {
        long start = System.nanoTime();
        // fill random elements
        Random rnd = new Random(0);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        // library sort
        int[] expected = array.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = array.clone();
        SelectionSorter2.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected) + " but actual  = "
                    + Arrays.toString(actual));
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнеия: " + timeConsumedMillis / 60);
        System.out.println();
        System.out.print("OK");
    }

    private static void Test3() {
        long start = System.nanoTime();
        // fill random elements
        Random rnd = new Random(0);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        // library sort
        int[] expected = array.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = array.clone();
        SelectionSorter3.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected) + " but actual  = "
                    + Arrays.toString(actual));
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнеия: " + timeConsumedMillis / 60);
        System.out.println();
        System.out.print("OK");
    }
}
