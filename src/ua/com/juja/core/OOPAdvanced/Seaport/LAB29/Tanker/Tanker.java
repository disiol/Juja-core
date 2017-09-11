package ua.com.juja.core.OOPAdvanced.Seaport.LAB29.Tanker;

/**
 * Created by Denis Oleynyk on 11.09.17.
 * mail: deoniisii@gmail.com
 */
public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float tankerVolume) {
        super(name, length, width, displacement);
        this.volume = tankerVolume;
    }

    @Override
    public float calculatePayment() {
        float reantal = DEFAULT_RENTAL * volume;
        return reantal;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax <= 0){
            rentTax = DEFAULT_RENTAL;
        }
            float reantal = rentTax * volume;
        return reantal;
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