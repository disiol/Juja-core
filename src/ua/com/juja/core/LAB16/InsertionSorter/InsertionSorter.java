package ua.com.juja.core.LAB16.InsertionSorter;

/**
 * Created by Denis Oleynyk on 06.07.17.
 * mail: deoniisii@gmail.com
 */
public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}