package ua.com.juja.core.OOPAdvanced.Seaport.LAB31.SeaPortQueue;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Test2 {


    @Test
    public static void Test5() {
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

        assertEquals("Expected to be printed ", expectedResultPrintShipQueue, actualPrintQueueShip);


    }

    @Test
    public static void Test4() {
        //check successful remove ship
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

        String expectedResultPrintShipQueueAfterRemove = "{Name=NameTestLinerLength=1000.0Width=1000.0Displacement=1000.0};{Name=NameTestTankerLength=1000.0Width=1000.0Displacement=1000.0};";

        int expectedSuccessfulStatusRemoveShipInQueue = 1;

        AbstractShip testLiner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
        AbstractShip testCargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);
        AbstractShip testTanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();


        odessaSeaPort.addShipToEndQueue(testCargo);
        odessaSeaPort.addShipToEndQueue(testLiner);
        odessaSeaPort.addShipToEndQueue(testTanker);


        int actualSuccessfulStatusRemoveShipInQueue = odessaSeaPort.removeShipFromBeginQueue();


        assertEquals("Successful status remove ship in queue 1 but found ", expectedSuccessfulStatusRemoveShipInQueue, actualSuccessfulStatusRemoveShipInQueue);

        String actualPrintShipQueueAfterRemove = odessaSeaPort.printQueueShip();

        assertEquals("Expected to be printed ", expectedResultPrintShipQueueAfterRemove, actualPrintShipQueueAfterRemove);


    }


    @Test
    public static void Test3() {
        //check add into full queue
        System.out.println("check add into full queue");
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

        int expected = -1;

        AbstractShip testLiner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
        AbstractShip testCargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);
        AbstractShip testTanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();


        odessaSeaPort.addShipToEndQueue(testLiner);
        odessaSeaPort.addShipToEndQueue(testCargo);
        odessaSeaPort.addShipToEndQueue(testTanker);

        int actual = odessaSeaPort.addShipToEndQueue(testTanker);

        assertEquals("Queue is full expected return -1 but found ", expected, actual);
    }


    @Test
    public static void Test2() {
        //check delete in empty  queue
        System.out.println("check delete in empty  queue " + "\n");
        int expected = -1;
        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();

        int actual = odessaSeaPort.removeShipFromBeginQueue();


        assertEquals("Queue is empty expected return -1 but found ", expected, actual);

    }

    @Test
    public static void Test1() {
        //check print empty queue
        System.out.println(" check print empty queue " + "\n");
        String expected = "QueueEmpty";

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();
        String actual = odessaSeaPort.printQueueShip();
        assertEquals("Print empty queue expected to be printed", expected, actual);
    }
}