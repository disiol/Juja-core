package ua.com.juja.core.LAB16.InsertionSorter;

import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 06.07.17.
 * mail: deoniisii@gmail.com
 * <p>
 * Такая версия алгоритм сортировки вставками
 * <p>
 * public class InsertionSorter {
 * public static void sort(int[] arr) {
 * for (int k = 1; k < arr.length; k++) {
 * int newElement = arr[k];
 * int location = k - 1;
 * while (location >= 0 && arr[location] > newElement) {
 * arr[location + 1] = arr[location];
 * location--;
 * }
 * arr[location + 1] = newElement;
 * }
 * }
 * }
 * <p>
 * <p>
 * реализована не оптимально, так как внутренний цикл while
 * - ищет позицию для вставки, перебирая последовательно элементы, при этом он
 * - поэлементно "смещает" массив.
 * <p>
 * В целях оптимизации перепишите алгоритм:
 * 1. Ищите позицию для вставки элемента бинарным поиском (Arrays.binarySearch(...)).
 * 2. Найдя позицию - смещайте всю часть массива за один вызов (System.arraycopy(...)).
 * В моих экспериментах эти две оптимизации ускорили сортировку в 2.2-2.6 раза. Скорость сортировки измерял данным кодом
 */
public class InsertionSorterOptemizetd2 {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            int counterShift = 0;

            if (location >= 0 && arr[location] > newElement) {
                Arrays.binarySearch(arr, newElement);
                counterShift++;
                location--;
            }

            int srcPos = location + 1;

            System.arraycopy(arr, srcPos, arr, srcPos + 1, counterShift);
            arr[srcPos] = newElement;
        }
    }
}
