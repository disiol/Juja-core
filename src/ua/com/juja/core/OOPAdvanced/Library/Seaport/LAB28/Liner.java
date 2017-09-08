package ua.com.juja.core.OOPAdvanced.Library.Seaport.LAB28;

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

            if (arrayShip[index] == null) {
                arrayShip[index] = ship;
                indexShipInPort = index;
                return indexShipInPort;
            }

            if (index == LENGTH_QUEUE_SHIP - 1 && arrayShip[index] != null) {
                indexShipInPort = -1;
                return indexShipInPort;
            }

        }
//  TODO - метод, который добавляет корабль в конец очереди. Если очередь полная необходимо вернуть -1.
// Если корабль успешно добавлен в очередь, необходимо вернуть его индекс в массиве очереди.

        return indexShipInPort;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return NO_SHIP_IN_ARRAY;
        } else {
            /* TODO Если корабль успешно удален вернуть 1. При удалении корабля обеспечить продвижение кораблей в начало очереди.
            (Подсказка: очередь - массив, поэтому можно использовать методы из стандартных пакетов для работы с массивами)
            */
            return 1;
        }
    }

    @Override
    public String printQueueShip() {
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return "QueueEmpty";
        } else {
            //TODO  Выходная строка имеет следующий вид: {Name=<>Length=<>Width=<>Displacement=<>};{Name=<>Length=<>Width=<>Displacement=<>};
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
