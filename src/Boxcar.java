import acm.graphics.*;
import java.awt.*;


public class Boxcar extends TrainCar {
    /**
     * Creates the frmae of the car using the specified color
     *
     * @param color The color of the new boxcar
     */
    public Boxcar(Color color) {
        super(color);
        double xRightDoor = CONNECTOR + CAR_WIDTH / 2;
        double xLeftDoor = xRightDoor - DOOR_WIDTH;
        double yDoor = -CAR_BASELINE - DOOR_HEIGHT;
        add(new GRect(xLeftDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
        add(new GRect(xRightDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }

    /* Dimensions of the door panels on the boxcar */
    private final double DOOR_WIDTH = 18;
    private final double DOOR_HEIGHT = 18;
}
