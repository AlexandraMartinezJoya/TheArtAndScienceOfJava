import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

import java.awt.*;

public class CreateKiteShape extends GraphicsProgram {

    public void run() {
        double initialStartPointXCoord = getWidth() / 6;
        double initialStartPointYCoord = getHeight() / 6;

        GPolygon kiteCompound = new GPolygon();
        kiteCompound.addVertex( - PUMPKIN_NOSE_BASE / 1.50, -10 );
        kiteCompound.addVertex(  0, PUMPKIN_NOSE_HEIGHT / 2 );
        kiteCompound.addVertex( PUMPKIN_NOSE_BASE / 1.50 , -10 );
        kiteCompound.addVertex(  0, - PUMPKIN_NOSE_HEIGHT / 2 );

        add(kiteCompound, (double)getWidth() / 2, (double)getHeight() / 2);

        kiteCompound.setFilled(true);
        kiteCompound.setFillColor(Color.BLACK);
        add(kiteCompound,  initialStartPointXCoord - pumpkinHeadRadius / 6, initialStartPointYCoord + pumpkinHeadRadius / 4);
    }

    private final double pumpkinHeadRadius = 250;
    private final double PUMPKIN_NOSE_BASE = 20;
    private final double PUMPKIN_NOSE_HEIGHT = 65;

}
