package ua.com.juja.core.OOPAdvanced.Library.Seaport.LAB31.SeaPortQueue;

public class Test {
    public static void main(String[] args) {
        String testLinerName = "NameTestLiner";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;
        String testCargoName = "NameTestCargo";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;
        String testTankerName = "NameTestTanker";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        String expectedResultPrintShipQueue = "{Name=NameTestLinerLength=1000.0Width=1000.0Displacement=1000.0};{Name=NameTestCargoLength=1000.0Width=1000.0Displacement=1000.0};";

        AbstractShip testLiner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
        AbstractShip testCargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);
        AbstractShip testTanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();

        odessaSeaPort.addShipToEndQueue(testLiner);
        odessaSeaPort.addShipToEndQueue(testCargo);


        //check print queue ship
        String actualPrintQueueShip = odessaSeaPort.printQueueShip();
        if(!(actualPrintQueueShip.equals(expectedResultPrintShipQueue)))
            throw new AssertionError("Expected to be printed " + expectedResultPrintShipQueue + " but found " + actualPrintQueueShip);

        System.out.print("OK");
    }
}