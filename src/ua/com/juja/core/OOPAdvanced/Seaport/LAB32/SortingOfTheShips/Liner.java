package ua.com.juja.core.OOPAdvanced.Seaport.LAB32.SortingOfTheShips;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Denis Oleynyk on 11.09.17.
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

class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        String arrayShipsSotrts = "";
        if (arrayShips == null||arrayShips.length == 0 ) {
            return arrayShipsSotrts = "";
        }


        //TODO отсортированного массива по возрастанию оплаты услуг порта

        Arrays.sort(arrayShips, new Comparator<AbstractShip>() {
            @Override
            public int compare(AbstractShip o1, AbstractShip o2) {
                if (o1.calculatePayment() < o2.calculatePayment()) {
                    //текущее меньше полученного
                    return -1;
                } else if (o1.calculatePayment() > o2.calculatePayment()) {
                    // текущее больше полученного
                    return 1;
                }
                return 0;
            }
        });

        // печать отсортированного массива
        for (int index = 0; index < arrayShips.length; index++) {
            arrayShipsSotrts += arrayShips[index].getName()
                    + "=" + arrayShips[index].calculatePayment();

            //System.out.println(arrayShipsSotrts);
        }


        return arrayShipsSotrts.toString();
    }



}
