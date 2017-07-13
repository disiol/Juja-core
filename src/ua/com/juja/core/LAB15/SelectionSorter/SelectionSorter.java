package ua.com.juja.core.LAB15.SelectionSorter;

/**
 * Created by Denis Oleynyk on 29.06.17.
 * mail: deoniisii@gmail.com
 */
public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }
}