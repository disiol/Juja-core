package ua.com.juja.core.ReferenceTypesofDataLines.BigNumbers.Lab35.Polynoms;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;


public class Test {
    @org.junit.Test
    public void Test1() {
        BigInteger[] poly = {new BigInteger("10")};
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("10");
        BigInteger actual = PolyUtils.eval(poly, arg);
        assertEquals(expected, actual);

    }
}