package ua.com.juja.core.LAB12.ArrayUtils;

/**
 * Created by Denis Oleynyk on 18.06.17.
 * mail: deoniisii@gmail.com
 * <p>
 * На вход подается одномерный массив. Необходимо найти диапазон максимальной ширины,
 * элементы которого положительные (больше 0).
 * В качестве ответа должен быть массив из 2х элементов, где:
 * - элемент №0 - индекс элемента левой границы отрезка;
 * - элемент №1 - индекс элемента правой границы отрезка.
 * <p>
 * Если таких отрезков несколько - вернуть самый ПРАВЫЙ.
 * Если в массиве отсутствует такой отрезок (все числа отрицательны) - вернуть пустой массив.
 * <p>
 * Например
 * <p>
 * lookFor([1, 1, 1]) = [0, 2]
 * lookFor([0, 1, 1]) = [1, 2]
 * lookFor([1, 1, 0]) = [0, 1]
 * lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
 * lookFor([1, 1, 0, 1, 1]) = [3, 4] // возвращаем ПРАВЫЙ
 * lookFor([0, -1, 0, -1]) = [] // отсутствуют положительные числа
 */

public class ArrayUtilsRight {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] actual = lookFor(array);
        for (int i : actual) {
            System.out.print(i);

        }
    }

    public static int[] lookFor(int[] array) {
        int[] result = new int[2];
        int firstIndex = 0;
        int lastIndex = 0;
        int sequenceLength = 0;
        int currentSequenceLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (currentSequenceLength == 0) {
                    firstIndex = i;
                }

                currentSequenceLength += 1;
                lastIndex = i;
            } else {
                if (currentSequenceLength >= sequenceLength) {
                    sequenceLength = currentSequenceLength;

                    result[0] = firstIndex;
                    result[1] = lastIndex;
                }

                currentSequenceLength = 0;
            }
        }

        if (currentSequenceLength >= sequenceLength) {
            sequenceLength = currentSequenceLength;
            result[0] = firstIndex;
            result[1] = lastIndex;
        }
        if (sequenceLength == 0) {
            return new int[0];
        }

        return result;
    }
}
