package ua.com.juja.core.LABA16.InsertionSorter;

/**
 * Created by Denis Oleynyk on 06.07.17.
 * mail: deoniisii@gmail.com
 */
public class InsertionSorter2 {
    public static void sort(int[] arr) {

        int j;
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                arr[j +1] = arr[j];

            }
            arr[j +1] = tmp;

        }

    }
}