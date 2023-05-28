import acm.graphics.GArc;
import acm.program.GraphicsProgram;

import java.awt.*;

public class UnfilledAndFilledArcs extends GraphicsProgram {

    public void run(){
        double r = 50;

        //Draws an open arc
        GArc openArc = new GArc(2 * r, 2 * r, 0, 60);
        add(openArc , 0.3 * getWidth() - r, (getHeight() - r ) / 2);

        //Draws a filled Arc
        GArc filledArc = new GArc(2 * r, 2 * r,0, 60);
        filledArc.setFilled(true);
        add(filledArc, 0.7 * getWidth() - r, (getHeight() - r) / 2 );

        //Draws an outlined Arc
        GArc outlinedArc = new GArc(2 * r, 2 * r, 0, 60);
        outlinedArc.setFilled(true);
        outlinedArc.setFillColor(Color.white);
        add(outlinedArc, 0.5 * getWidth() - r, (getHeight() - r) / 2);

        GArc outlinedArc2 = new GArc(2 * r, 2 * r, 0, 60);
        outlinedArc2.setFilled(true);
        outlinedArc2.setFillColor(Color.magenta);
        outlinedArc2.scale(4,1);
        add(outlinedArc2, 0.1 * getWidth() - r, 0.1 * (getHeight() - r) / 2);

        GArc a1 = new GArc( 2 * r, 2 * r, 0, 90);
        add(a1, 0.2 * getWidth() - r, 0.2 * (getHeight() - r) /2);

        GArc a2 = new GArc( 2 * r, 2 * r, 45, 270);
        add(a2, 0.4 * getWidth() - r, 0.4 * (getHeight() - r) /2);

        GArc a3 = new GArc( 2 * r, 2 * r, -90, 45);
        add(a3, 0.6 * getWidth() - r, 0.6 * (getHeight() - r) /2);

        GArc a4 = new GArc( 2 * r, 2 * r, 0, -180);
        add(a4, 0.9 * getWidth() - r, 0.9 * (getHeight() - r) /2);
    }
}
