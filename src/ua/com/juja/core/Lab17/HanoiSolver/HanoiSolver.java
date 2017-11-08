package ua.com.juja.core.Lab17.HanoiSolver;

import java.util.Stack;

/**
 * Created by Denis Oleynyk on 10.07.17.
 * mail: deoniisii@gmail.com
 * <p>
 * Проставьте правильные аргументы методов в рекурсивных вызовах exchange вместо вопросительных знаков.
 * Итоговый код должен корректно решать задачу о Ханойской башне. Решение должно иметь вид
 * <p>
 * public static void exchange(
 * Stack from, Stack help,
 * Stack to, int count) {
 * if (count > 0) {
 * exchange(?, ?, ?, ?);
 * int biggest = (int) from.pop();
 * to.push(biggest);
 * exchange(?, ?, ?, ?);
 * }
 * }
 * Про Stack мы детальнее поговорим в следующих уроках. Пока что это структура данных, которая хранит множество элементов
 * и реализует принцип LIFO (last in first out) - последний пришел, первый ушел. Тоесть, когда мы просим стэк отдать
 * элемент методом pop(), он возвращает последний добавленный элемент. Также эта структура данных известна как магазин.
 * Метод push() добавляет элемент в начало стэка.
 */

public class HanoiSolver {

    public static void exchange(Stack from, Stack help, Stack to, int count) {
        if (count > 0) {
            exchange(from, to, help, count - 1);
            int biggest = (Integer) from.pop();
            to.push(biggest);
            exchange(help, from, to, count - 1);
        }
    }
}
