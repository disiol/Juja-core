package ua.com.juja.core.OOPAdvanced.Seaport.LAB32.SortingOfTheShips;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class Test {
    @org.testng.annotations.Test
    public static void test2() {

        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;
        String testCargoName = "TestCargoName";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;
        String testTankerName = "TestTankerName";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        String expectedSortedShipString = "TestTankerName=25000.0TestCargoName=55000.0TestLinerName=100000.0";

        // check arrays length > 0
        AbstractShip[] arrayShips = {
                new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers),
                new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage),
                new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume)
        };

        String actualSortedShipString = OdessaSeaPort.sortSumPaymentAsc(arrayShips);

        assertEquals(expectedSortedShipString, actualSortedShipString, "Expected to be printed ");

    }

    @org.testng.annotations.Test
    public static void test1() {

        // check null
        String actualSortedShipStringIfNull = OdessaSeaPort.sortSumPaymentAsc(null);
        if (!((actualSortedShipStringIfNull != null) && (actualSortedShipStringIfNull.isEmpty())))
            assertNotNull("Result cannot be null, expected to be empty string", actualSortedShipStringIfNull);


    }
}