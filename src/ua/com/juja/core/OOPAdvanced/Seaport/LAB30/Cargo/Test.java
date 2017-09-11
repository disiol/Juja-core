package ua.com.juja.core.OOPAdvanced.Seaport.LAB30.Cargo;

import static org.testng.Assert.assertEquals;

public class Test {
    @org.testng.annotations.Test

    public static void test2() {
        String testCargoName = "TestCargoName";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;

        float testRentTaxNegative = -1;
        float expectedCargoPaymentRentTaxDefault = testCargoTonnage * Cargo.DEFAULT_RENTAL;

        Cargo cargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);

        //check payment if rent tax is negative
        float actualCargoPaymentRentTaxNegative = cargo.calculatePayment(testRentTaxNegative);

            assertEquals(expectedCargoPaymentRentTaxDefault,
                    actualCargoPaymentRentTaxNegative, "Rent tax is negative= " + testRentTaxNegative + " and expected payment value= ");



    }

    @org.testng.annotations.Test
    public static void test1() {
        String testCargoName = "TestCargoName";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;

        float expectedCargoPaymentRentTaxDefault = testCargoTonnage * Cargo.DEFAULT_RENTAL;

        Cargo cargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);

        //check payment if rent tax is default
        float actualCargoPaymentRentTaxDefault = cargo.calculatePayment();
        if (actualCargoPaymentRentTaxDefault != expectedCargoPaymentRentTaxDefault)
            assertEquals(expectedCargoPaymentRentTaxDefault,
                    actualCargoPaymentRentTaxDefault, "Rent tax is default= " + Cargo.DEFAULT_RENTAL + " and expected payment value= ");


    }
}
