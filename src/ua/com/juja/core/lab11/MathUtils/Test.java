package ua.com.juja.core.lab11.MathUtils;

/**
 * Created by Denis Oleynyk on 17.06.17.
 * mail: deoniisii@gmail.com
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Test_1());
        System.out.println(Test_2());
        System.out.println(Test_3());
        System.out.println(Test_4());

    }

    public static String Test_1() {
        System.out.println("MathUtils.lookFor(1) != 0");
        if (MathUtils.lookFor(1) != 0) {
            throw new AssertionError();
        }

        return "OK";
    }

    public static String Test_2() {
        System.out.println("MathUtils.lookFor(2) != 1");
        if (MathUtils.lookFor(2) != 1) {
            throw new AssertionError();
        }

        return "OK";
    }

    public static String Test_3() {
        System.out.println(MathUtils.lookFor(5) != 3);
        if (MathUtils.lookFor(5) != 3) {
            throw new AssertionError();
        }

        return "OK";
    }

    public static String Test_4() {
        System.out.println(MathUtils.lookFor(8) != 4);
        if (MathUtils.lookFor(8) != 4) {
            throw new AssertionError();
        }

        return "OK";
    }
}