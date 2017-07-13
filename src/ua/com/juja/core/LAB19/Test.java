package ua.com.juja.core.LAB19;

/**
 * Created by Denis Oleynyk on 11.07.17.
 * mail: deoniisii@gmail.com
 */

public class Test {
    public static void main(String[] args) {
        Test1();
        Test2();
        Test3();
    }

    private static void Test1() {
        int testMoney = 5;
        int expectedValue = 4;

        int actualValue = ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue != expectedValue)
            throw new AssertionError("Money= " + testMoney + "  number of variants=  " + expectedValue +
                    " but found " + actualValue);

        System.out.print("OK");
    }

    private static void Test2() {
        int testMoney = 10;
        int expectedValue = 11;

        int actualValue = ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue != expectedValue)
            throw new AssertionError("Money= " + testMoney + "  number of variants=  " + expectedValue +
                    " but found " + actualValue);

        System.out.print("OK");
    }

    private static void Test3() {
        int testMoney = 100;
        int expectedValue = 3953;

        int actualValue = ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue != expectedValue)
            throw new AssertionError("Money= " + testMoney + "  number of variants=  " + expectedValue +
                    " but found " + actualValue);

        System.out.print("OK");
    }
}