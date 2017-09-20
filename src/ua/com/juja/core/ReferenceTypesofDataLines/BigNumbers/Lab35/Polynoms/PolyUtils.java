package ua.com.juja.core.ReferenceTypesofDataLines.BigNumbers.Lab35.Polynoms;

/**
 * Created by Denis Oleynyk on 20.09.17.
 * mail: deoniisii@gmail.com
 */

import java.math.BigInteger;

public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        /*BODY*/
        BigInteger result = new BigInteger("0");

        for (int i = 0; i < poly.length; i++) {

            int pow = poly.length - i - 1;
            result = result.add(poly[i].multiply(arg.pow(pow)));

        }

        return result;
    }
}