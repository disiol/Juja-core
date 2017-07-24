package ua.com.juja.core.LAB14.BubbleSorter;

/**
 * Created by Denis Oleynyk on 28.06.17.
 * mail: deoniisii@gmail.com
 */
public class BubbleSorter {
    public static void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}