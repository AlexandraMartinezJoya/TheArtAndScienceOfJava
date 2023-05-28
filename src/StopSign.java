import acm.graphics.GLabel;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

import java.awt.*;

public class StopSign extends GraphicsProgram {

    public void run(){
        double centerWidth = getWidth() /2;
        double centerHeight = getHeight() /2;
        GPolygon sign = createOctagon(EDGE_LENGTH);
        sign.setFilled(true);
        sign.setColor(Color.RED);
        add(sign, centerWidth, centerHeight);
        GLabel stop = new GLabel("STOP");
        stop.setFont("SansSerif-bold-36");
        stop.setColor(Color.WHITE);
        add(stop, centerWidth - stop.getWidth() / 2 + EDGE_LENGTH / 4, centerHeight + stop.getAscent() /2 + EDGE_LENGTH / 3);
    }

    private GPolygon createOctagon(double side){
        GPolygon octagon = new GPolygon();
        octagon.addVertex(-side, 0);
        int angle = 45;
        for (int i = 0; i < 7; i++){
            octagon.addPolarEdge(side, angle);
            angle -= 45;
        }
        return octagon;
    }

    /* Private constants */
    private final double EDGE_LENGTH = 50;
}
