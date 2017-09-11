package ua.com.juja.core.OOPAdvanced.Library.Seaport.LAB28.Liner;

/**
 * Created by Denis Oleynyk on 08.09.17.
 * mail: deoniisii@gmail.com
 */
public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int linerPassengers) {
        super(name, length, width, displacement);
        this.passengers = linerPassengers;
    }

    @Override
    public float calculatePayment() {
        //TODO  Количество пассажиров * Рентный налог судна.  Типы данных параметра float. Формула для расчета не меняется.
        // Если передается отрицательное значение рентной ставки или 0 то использовать дефолтное значение для этого типа корабля.
        return DEFAULT_RENTAL * passengers;
    }

    public float calculatePayment(float rentTaxNegative) {
        //TODO  Количество пассажиров * Рентный налог судна.  Типы данных параметра float. Формула для расчета не меняется.
        // Если передается отрицательное значение рентной ставки или 0 то использовать дефолтное значение для этого типа корабля.
        return rentTaxNegative * passengers;
    }

     /*BODY*/

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
