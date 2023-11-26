import acm.graphics.GLabel;
import acm.graphics.GPolygon;

import java.awt.*;


public class GOne  extends GPolygon {

    /**
     * Creates a new Graphic Number 1 centered at the set of coordinates given
     * @param XLocation set the
     */
    public GOne(double XLocation, double YLocation){

        GLabel one = new GLabel("1" );
        double oneWidth = one.getWidth();
        double oneHeight = one.getHeight();
        one.setColor(PURPLE_COLOR);
        one.setLocation(XLocation - oneWidth / 2,  YLocation - oneHeight / 2);
    }

    private final Color PURPLE_COLOR = new Color(163, 73, 164);
}
