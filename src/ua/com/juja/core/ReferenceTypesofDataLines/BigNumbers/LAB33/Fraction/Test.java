package ua.com.juja.core.ReferenceTypesofDataLines.BigNumbers.LAB33.Fraction;

import java.math.BigInteger;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void Test2() {
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] expected = {new BigInteger("1"), new BigInteger("1")};
        BigInteger[] actual = FractionUtils.sum(x, y);

        assertEquals(Arrays.toString(expected),Arrays.toString(actual));


    }

    @org.junit.Test
    public void Test1() {
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("3")};
        BigInteger[] expected = {new BigInteger("5"), new BigInteger("6")};
        BigInteger[] actual = FractionUtils.sum(x, y);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        System.out.println(Arrays.toString(actual));

    }
}