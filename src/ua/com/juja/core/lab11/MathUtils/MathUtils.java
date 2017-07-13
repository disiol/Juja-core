package ua.com.juja.core.lab11.MathUtils;

/**
 * Created by Denis Oleynyk on 17.06.17.
 * mail: deoniisii@gmail.com
 * <p>
 * Реализовать функцию, которая по целочисленому аргументу c возвращает количество целочисленных решений неравенства
 * <p>
 * a*a + b*b <= c
 * a > 0
 * b > 0
 */
public class MathUtils {

    public static void main(String[] args) {
        System.out.println("Количество верных решений " + lookFor(2));
    }

    public static int lookFor(int max) {
        int c = max;
        int result = 0;
        int count = 0;

        if (c <= 0) {
            System.out.println("Число не подходит по параметрам. ");
        } else {
            for (int a = 1; a * a <= c; a++) {
                for (int b = 1; b * b <= c; b++) {
                    result = a * a + b * b;
                    if (result <= c) {
                        count++;
                        System.out.println("(" + a + "," + b + ")");

                    }
                }
            }
        }
        return count;
    }

}
