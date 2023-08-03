import acm.graphics.GPolygon;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

import java.awt.*;

public class CreateArrowHead extends GraphicsProgram {

    public void run() {
        double initialStartPointXCoord = getWidth() / 6;
        double initialStartPointYCoord = getHeight() / 6;


        GPolygon mouthCompound = new GPolygon();
        mouthCompound.addVertex( - PUMPKIN_NOSE_BASE / 1.50, 0 );
        mouthCompound.addVertex(  30, PUMPKIN_NOSE_HEIGHT / 2 );
        mouthCompound.addVertex( PUMPKIN_NOSE_BASE / 1.50 , 0 );
        mouthCompound.addVertex(  30, - PUMPKIN_NOSE_HEIGHT / 2 );

        add(mouthCompound, (double)getWidth() / 2, (double)getHeight() / 2);

        mouthCompound.setFilled(true);
        mouthCompound.setFillColor(Color.BLACK);
        add(mouthCompound,  initialStartPointXCoord - pumpkinHeadRadius / 6, initialStartPointYCoord + pumpkinHeadRadius / 4);
    }

    private final double pumpkinHeadRadius = 250;
    private final double PUMPKIN_NOSE_BASE = 20;
    private final double PUMPKIN_NOSE_HEIGHT = 65;

}
