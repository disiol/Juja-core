package ua.com.juja.core.OOPAdvanced.Library.Seaport.LAB31.SeaPortQueue;

/**
 * Created by Denis Oleynyk on 07.09.17.
 * mail: deoniisii@gmail.com
 */
public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return passengers * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return volume * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL = 550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return tonnage * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}

interface SeaPortQueue {
    public final static int LENGTH_QUEUE_SHIP = 3;

    public int addShipToEndQueue(AbstractShip ship);

    public int removeShipFromBeginQueue();

    public String printQueueShip();
}

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        for (int index = 0; index < arrayShip.length; index++) {

            // Если корабль успешно добавлен в очередь,в озврощает его  индес массиве очереди.
            if (arrayShip[index] == null) {
                arrayShip[index] = ship;
                indexShipInPort = index;
                return indexShipInPort;
            }
            //Если очередь полная возвращает -1
            if (index == LENGTH_QUEUE_SHIP - 1 && arrayShip[index] != null) {
                indexShipInPort = -1;
                return indexShipInPort;
            }

        }


        return indexShipInPort;
    }

    @Override
    public int removeShipFromBeginQueue() {
        //очередь пуста возрощает -1
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return NO_SHIP_IN_ARRAY;
        } else {
            //удаляет корабль из начала очереди
            System.out.println("удаляет корабль из начала очереди ");
           arrayShip = removeShip(arrayShip, 0);
            return 1;
        }
    }

    @Override
    public String printQueueShip() {
        String Ships = "";

        //Если в очереди нет кораблей возрощает строку "QueueEmpty"
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return "QueueEmpty";
        } else {
            //печать информации о корабле
            System.out.println(" печать информации о корабле ");
            for (int i = 0; i < arrayShip.length; i++) {
                Ships += "{" + arrayShip[i].toPrint() + "};";
                System.out.println(Ships);

            }
        }


        return Ships;
    }


    public AbstractShip[] removeShip(AbstractShip[] symbols, int index) {
        if (index >= 0 && index < symbols.length) {
            AbstractShip[] copy = new AbstractShip[symbols.length - 1];
            System.arraycopy(symbols, 0, copy, 0, index);
            System.arraycopy(symbols, index + 1, copy, index, symbols.length - index - 1);
            return copy;
        }
        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i]);
        }
        return symbols;
    }


}
