package ua.com.juja.core.OOPAdvanced.Seaport.LAB28.Liner;

import static org.testng.Assert.assertEquals;

public class Test {

    @org.testng.annotations.Test
    public static void test2() {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;

        float testRentTaxNegative = -1;
        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);

        //check payment if  rent tax is negative

        float actualLinerPaymentRentTaxNegative = liner.calculatePayment(testRentTaxNegative);

        assertEquals(expectedLinerPaymentRentTaxDefault,
                actualLinerPaymentRentTaxNegative, "Rent tax is negative= " + testRentTaxNegative
                        + " and expected payment value= ");

    }

    @org.testng.annotations.Test
    public static void test1() {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;

        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);

        //check payment if rent tax is default
        float actualLinerPaymentRentTaxDefault = liner.calculatePayment();

        assertEquals(expectedLinerPaymentRentTaxDefault,
                actualLinerPaymentRentTaxDefault, "Rent tax is default " + Liner.DEFAULT_RENTAL + " and expected payment value= ");

    }
}
