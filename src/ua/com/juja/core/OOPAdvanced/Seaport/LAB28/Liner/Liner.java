package ua.com.juja.core.OOPAdvanced.Seaport.LAB28.Liner;

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
        float rental = DEFAULT_RENTAL * passengers;
        return rental;
    }

    public float calculatePayment(float rentTaxNegative) {
        // Если передается отрицательное значение рентной ставки или 0 то использовать дефолтное значение для этого типа корабля.
        if (rentTaxNegative <= 0) {
            rentTaxNegative = DEFAULT_RENTAL;
        }

        float rental = rentTaxNegative * passengers;
        return rental;
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
