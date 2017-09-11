package ua.com.juja.core.OOPAdvanced.Library.Seaport.LAB29.Tanker;

import static org.testng.AssertJUnit.assertEquals;

public class Test {
    @org.testng.annotations.Test
    public static void test1() {
        String testTankerName = "TestTankerName";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        float expectedTankerPaymentRentTaxDefault = testTankerVolume * Tanker.DEFAULT_RENTAL;

        Tanker tanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        //check payment if rent tax is default
        float actualTankerPaymentRentTaxDefault = tanker.calculatePayment();
        if (actualTankerPaymentRentTaxDefault != expectedTankerPaymentRentTaxDefault)
             assertEquals("Rent tax is default= " + Tanker.DEFAULT_RENTAL + " and expected payment value= ",
                     expectedTankerPaymentRentTaxDefault,actualTankerPaymentRentTaxDefault);


    }
}