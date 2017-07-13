package ua.com.juja.core.LABA16.InsertionSorter;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Denis Oleynyk on 06.07.17.
 * mail: deoniisii@gmail.com
 * <p>
 * Скорость сортировки измерял данным кодом
 */
public class TestSpeed {
    public static void main(String[] args) {
////
//        System.out.println("TestSpeedInsertionSorter");
//        TestSpeedInsertionSorter();

        System.out.println("TestSpeedInsertionSorterOptemizeted");
        TestSpeedInsertionSorterOptemizeted();


    }

    private static void TestSpeedInsertionSorter() {
        int[] array = AresGenerate();
        long t1 = System.nanoTime();
        InsertionSorter.sort(array);
        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);
        System.out.println();

    }


    private static void TestSpeedInsertionSorterOptemizeted() {
        int[] array = AresGenerate();
        long t1 = System.nanoTime();
        InsertionSorterOptemizetd2.sort(array);
        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);
        System.out.println();
    }

    private static int[] AresGenerate() {
        int[] array = new int[256 * 1024];
        Random rnd = new Random(0);
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt();
        }
        return array;
    }

}