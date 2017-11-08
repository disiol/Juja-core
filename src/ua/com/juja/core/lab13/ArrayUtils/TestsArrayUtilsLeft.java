package ua.com.juja.core.lab13.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 19.06.17.
 * mail: deoniisii@gmail.com
 */
public class TestsArrayUtilsLeft {
    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
        System.out.println();
        test4();
        System.out.println();
        test5();
        System.out.println();
        test6();


    }

    private static void test6() {
        System.out.println("0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1");

        int[] array = {0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        int[] expected = {6, 9};
        int[] actual = ArrayUtilsLeft.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("Fallen");
            throw new AssertionError();
        } else {
            System.out.print("OK");
            System.out.println();

        }
    }

    private static void test5() {
        System.out.println("int[] array = {1, 1, 0, 1, 1}");

        int[] array = {1, 1, 0, 1, 1};
        int[] expected = {0, 1};
        int[] actual = ArrayUtilsLeft.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("Fallen");
            throw new AssertionError();
        } else {
            System.out.print("OK");
            System.out.println();

        }
    }

    private static void test4() {
        System.out.println(" int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};");

        int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] expected = {1, 4};
        int[] actual = ArrayUtilsLeft.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("Fallen");
            throw new AssertionError();
        } else {
            System.out.print("OK");
            System.out.println();

        }
    }

    private static void test3() {
        System.out.println("int[] array = {0, 1, 1, 1, 0, 1, 1, 1, 1, 0}");

        int[] array = {0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] expected = {5, 8};
        int[] actual = ArrayUtilsLeft.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("Fallen");
            throw new AssertionError();
        } else {
            System.out.print("OK");
            System.out.println();

        }
    }

    private static void test2() {
        System.out.println("array = {-1000}");

        int[] array = {-1000};
        int[] expected = {};
        int[] actual = ArrayUtilsLeft.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("Fallen");
            throw new AssertionError();
        } else {
            System.out.print("OK");
            System.out.println();

        }
    }

    private static void test1() {
        System.out.println("  int[] array = {1, 2, 3, 4, 5}");
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {0, 4};
        int[] actual = ArrayUtilsLeft.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("Fallen");
            throw new AssertionError();
        } else {
            System.out.print("OK");
            System.out.println();

        }
    }


}