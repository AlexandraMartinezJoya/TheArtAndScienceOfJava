import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

import java.awt.*;

public class DrawHourGlass extends GraphicsProgram {

    public void run(){
        double initialStartPointXCoord = getWidth() / 2;
        double initialStartPointYCoord = getHeight() / 2;


        GPolygon hourGlassCompound = new GPolygon();
        hourGlassCompound.addVertex( 0 , 0 );
        hourGlassCompound.addVertex(  90, 0  );
        hourGlassCompound.addVertex(  0, 50);
        hourGlassCompound.addVertex(  0, 0);
        hourGlassCompound.addVertex(  90, 0);
        hourGlassCompound.addVertex(  0, 90);

        //
        hourGlassCompound.addVertex( 0 , 0 );
        hourGlassCompound.addVertex(  -90, 0  );
        hourGlassCompound.addVertex(  0, -50);
        hourGlassCompound.addVertex(  0, 0);
        hourGlassCompound.addVertex(  -90, 0);
        hourGlassCompound.addVertex(  0, -90);

        hourGlassCompound.setFilled(true);
        hourGlassCompound.setFillColor(Color.BLACK);
        add(hourGlassCompound,  (initialStartPointXCoord + objectBase)/ 2, initialStartPointYCoord );
    }


    private final double objectBase = 250;
}

