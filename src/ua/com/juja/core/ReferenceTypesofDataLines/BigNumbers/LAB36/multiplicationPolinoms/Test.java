package ua.com.juja.core.ReferenceTypesofDataLines.BigNumbers.LAB36.multiplicationPolinoms;

import java.math.BigInteger;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void Test1() {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("1"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        assertEquals(Arrays.toString(expected),Arrays.toString(actual));


    }
}