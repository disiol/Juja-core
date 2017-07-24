package ua.com.juja.core.LAB14.BubbleSorter;

/**
 * Created by Denis Oleynyk on 28.06.17.
 * mail: deoniisii@gmail.com
 *
 * допускает вариации и оптимизации. В данном случае приведен алгоритм, при котором на каждом проходе "всплывает"
 * самый большой элемент. Перепишите алгоритм на такой, при котором "тонет" самый маленький элемент. Порядок сортировки
 * должен сохраниться - по возрастанию. Элементы должны перебираться справа - налево. Всплывал - вправо, тонет - влево.
 * Цикл не доходил до правого конца, теперь - не доходит до левого. В массиве из 6 элементов должны сравниваться (и в случае инверсии переставляться) пары 4-5 3-4 2-3 1-2 0-1 4-5 3-4 2-3 1-2 4-5 3-4 2-3 4-5 3-4 4-5
 *
 */
public class BubbleSorterSinksToTheLeft {
    public static void main(String[] args) {
        int numbers[] = {10, 2, 1, 3, 5, 4, 6, 8, 7, 9};
        sort(numbers);
        for (int i: numbers) {
            System.out.print(i);

        }
        System.out.println();
    }

    public static void sort(int[] arr) {

        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {

            boolean isIter = false;

            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                    isIter = true;
                }
            }

            if ( !isIter ) {
                break;
            }
        }
    }
}