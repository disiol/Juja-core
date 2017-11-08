package ua.com.juja.core.ReferenceTypesofDataLines.BigNumbers.LAB33.Fraction;

/**
 * Created by Denis Oleynyk on 19.09.17.
 * mail: deoniisii@gmail.com
 */

import java.math.BigInteger;

public class FractionUtils {

    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {

        BigInteger[] fractionSum = new BigInteger[2];
        /*BODY*/
        //Сложение дробей с одинаковыми знаменателями
        if (x[1].equals(y[1])) {
            fractionSum[0] = x[0].add(y[0]);// сложение числителей дроби
            fractionSum[1] = y[1];//знаменатель
        } else {
            fractionSum = additionOfFractions(x, y);
        }

        //сократить полученную дробь
        fractionSum = abbreviationOfFraction(fractionSum);

        return fractionSum;
    }

    //сложение дробей
    private static BigInteger[] additionOfFractions(BigInteger[] x, BigInteger[] y) {

        BigInteger[] sum = new BigInteger[2];


        BigInteger numeratorX = x[0];
        BigInteger denominatorX = x[1];
        BigInteger numeratorY = y[0];
        BigInteger denominatorY = y[1];

        sum[0] = (numeratorX.multiply(denominatorY)).add(numeratorY.multiply(denominatorX));
        sum[1] = denominatorX.multiply(denominatorY);


        return sum;
    }


    private static BigInteger[] abbreviationOfFraction(BigInteger[] x) {
        BigInteger greatestCommonDivisor; //наибольший общий делитель
        BigInteger[] fraction = new BigInteger[2];

        BigInteger numeratorX = x[0];
        BigInteger denominatorX = x[1];

        greatestCommonDivisor = numeratorX.gcd(denominatorX);
        fraction[0] = numeratorX.divide(greatestCommonDivisor);
        fraction[1] = denominatorX.divide(greatestCommonDivisor);


        //Чтобы сократить дробь   m n  нужно найти наибольший общий делитель ее числителя и знаменателя: НОД(m,n),
        // после чего поделить числитель и знаменатель дроби на это число. Если НОД(m,n)=1, то дробь сократить нельзя.

        return fraction;
    }
}