import acm.graphics.GPolygon;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

import java.awt.*;

public class CreateArrowHead extends GraphicsProgram {

    public void run() {
        double initialStartPointXCoord = getWidth() / 2;
        double initialStartPointYCoord = getHeight() / 2;


        GPolygon arrowCompound = new GPolygon();
        arrowCompound.addVertex( - ARROW_BASE / 1.50, 0 );
        arrowCompound.addVertex(  30, ARROW_HEIGHT / 2 );
        arrowCompound.addVertex( ARROW_BASE / 1.50 , 0 );
        arrowCompound.addVertex(  30, - ARROW_HEIGHT / 2 );

        add(arrowCompound, (double)getWidth() / 2, (double)getHeight() / 2);

        arrowCompound.setFilled(true);
        arrowCompound.setFillColor(Color.BLACK);
        add(arrowCompound,  initialStartPointXCoord - arrowInitialRadius / 6, initialStartPointYCoord + arrowInitialRadius / 4);
    }

    private final double arrowInitialRadius = 250;
    private final double ARROW_BASE = 20;
    private final double ARROW_HEIGHT = 65;

}
