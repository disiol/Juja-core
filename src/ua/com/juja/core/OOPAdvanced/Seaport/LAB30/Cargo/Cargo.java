package ua.com.juja.core.OOPAdvanced.Seaport.LAB30.Cargo;

/**
 * Created by Denis Oleynyk on 11.09.17.
 * mail: deoniisii@gmail.com
 */
public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL = 550;
    private float rental;

    public Cargo(String name, float length, float width, float displacement, float сargoTonnage) {
        super(name, length, width, displacement);
        this.tonnage = сargoTonnage;
    }

    @Override
    public float calculatePayment() {
        rental = tonnage * DEFAULT_RENTAL;
        return rental;
    }

    public float calculatePayment(float rentTaxNegative) {
        if (rentTaxNegative <= 0) {
            rental = tonnage * DEFAULT_RENTAL;
        } else {
            rental = rentTaxNegative * tonnage;
        }
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