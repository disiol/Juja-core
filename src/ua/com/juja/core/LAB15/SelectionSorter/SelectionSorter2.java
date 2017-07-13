package ua.com.juja.core.LAB15.SelectionSorter;

/**
 * Created by Denis Oleynyk on 29.06.17.
 * mail: deoniisii@gmail.com
 * <p>
 * Переписать алгоритм сортировки выборками:
 * <p>
 * public class SelectionSorter2 {
 * public static void sort(int[] arr) {
 * for (int barrier = 0; barrier < arr.length - 1; barrier++) {
 * for (int index = barrier + 1; index < arr.length; index++) {
 * if (arr[barrier] > arr[index]) {
 * int tmp = arr[index];
 * arr[index] = arr[barrier];
 * arr[barrier] = tmp;
 * }
 * }
 * }
 * }
 * }
 * <p>
 * <p>
 * 1. Убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент.
 * Найти наименьший элемент во всем массиве - и обменять с ним.
 * 2. Убрать обращение во внутреннем цикле к элементу массива arr[barrier].
 * Вычитать значение ячейки массива в локальную переменную (за пределами внутреннего цикла) и использовать ее (во внутреннем цикле).
 * В моих экспериментах:
 * <p>
 * пункт #1 ускорил сортировку в 2 раза.
 * <p>
 * пункт #2 ускорил сортировку еще на 10%-20%.
 */
public class SelectionSorter2 {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = 0;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    min = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = min;
                }
            }
        }
    }
}