import acm.graphics.GArc;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

import java.awt.*;

public class DrawHeartExtended extends GraphicsProgram {

    public void run() {
        double dx = getWidth() / 2;
        double dy = getHeight() / 2;
        FilledHeart heart = new FilledHeart(dx, dy);
    }

    private class FilledHeart extends GPolygon {

        public FilledHeart(double initialStartPointXCoord, double initialStartPointYCoord) {
            double  r = DIAMOND_SIDE;
            GPolygon newDiamond = new GPolygon();
            newDiamond.addVertex( -DIAMOND_SIDE * 4, DIAMOND_SIDE  * 4  );
            int angle = -45;
            for(int i = 0; i < 4; i ++){
                newDiamond.addPolarEdge(DIAMOND_SIDE, angle);
                angle += 90;
            }
            newDiamond.setFilled(true);
            newDiamond.setFillColor(Color.RED);
            newDiamond.setColor(Color.RED);
            add(newDiamond, initialStartPointXCoord  * 1.88   , initialStartPointYCoord - initialStartPointYCoord * 2 + 1.44 * DIAMOND_SIDE );

            GArc heartRightOutline1 = new GArc( r,  r  , -45, 180);
            heartRightOutline1.setFilled(true);
            heartRightOutline1.setFillColor(Color.RED);
            heartRightOutline1.setColor(Color.RED);
            add(heartRightOutline1,initialStartPointXCoord  - DIAMOND_SIDE / 8 , initialStartPointYCoord  - DIAMOND_SIDE /10 );

            GArc heartLeftOutline = new GArc( r  ,  r , 45, 180);
            heartLeftOutline.setFilled(true);
            heartLeftOutline.setFillColor(Color.RED);
            heartLeftOutline.setColor(Color.RED);
            add(heartLeftOutline, initialStartPointXCoord - DIAMOND_SIDE + DIAMOND_SIDE / 6, initialStartPointYCoord - DIAMOND_SIDE / 6 + DIAMOND_SIDE / 14);
        }

        /**
         * Private constants
         */
        private final double DIAMOND_SIDE = 100;
    }

}
