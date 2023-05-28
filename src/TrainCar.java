import acm.graphics.*;
import java.awt.Color;

/** This abstract class defines what is common to all train cars */
public abstract class TrainCar extends GCompound {

    /* Dimensions of the frame of a car train */
    protected final double CAR_WIDTH = 75;
    protected final double CAR_HEIGHT = 36;

    /* Distanxethat the bottom of a train car rides about the track */
    protected final double CAR_BASELINE = 10;

    /* Width of the connector, which overlaps between successive cars */
    public final double CONNECTOR = 6;

    /* Radius of the wheels on each car */
    protected final double WHEEL_RADIUS = 8;

    /* Distance from the edge of the frame to the center of the wheel */
    protected final double WHEEL_INSET = 16;

    /**
     * Creates the frmae of the car using the specified color
     * @param color The color of the new boxcar
     */
    public TrainCar(Color color){
        double xLeft = CONNECTOR;
        double yBase = -CAR_BASELINE;
        add(new GLine(0, yBase, CAR_WIDTH + 2 * CONNECTOR, yBase));
        addWheel(xLeft + WHEEL_INSET, -WHEEL_RADIUS);
        addWheel(xLeft + CAR_WIDTH - WHEEL_INSET, -WHEEL_RADIUS);
        double yTop = yBase - CAR_HEIGHT;
        GRect r = new GRect(xLeft, yTop, CAR_WIDTH, CAR_HEIGHT);
        r.setFilled(true);
        r.setFillColor(color);
        add(r);
    }

    /* Adds a wheel centered at (x, y) */
    private void addWheel(double x, double y){
        GOval wheel = new GOval(x - WHEEL_RADIUS, y - WHEEL_RADIUS, 2 * WHEEL_RADIUS, 2 * WHEEL_RADIUS);
        wheel.setFilled(true);
        wheel.setFillColor(Color.GRAY);
        add(wheel);
    }

    public double getConnector(){
        return this.CONNECTOR;
    }
}
