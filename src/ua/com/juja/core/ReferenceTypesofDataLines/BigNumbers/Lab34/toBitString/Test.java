package ua.com.juja.core.ReferenceTypesofDataLines.BigNumbers.Lab34.toBitString;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void Test2() {
        BigInteger k = new BigInteger("2");
        String expected = "10";
        String actual = BigIntegerUtils.toBitStr(k);

        assertEquals("BigIntegerUtils.toBitStr(\"2\")", expected, actual);

    }

    @org.junit.Test
    public void Test1() {
        BigInteger k = new BigInteger("0");
        String expected = "0";
        String actual = BigIntegerUtils.toBitStr(k);

        assertEquals("BigIntegerUtils.toBitStr(\"0\")", expected, actual);

    }
}