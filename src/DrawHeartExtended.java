import acm.graphics.GArc;
import acm.graphics.GCompound;
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
            GPolygon diamond = new GPolygon();
            diamond.addVertex( - DIAMOND_SIDE , 0 );
            diamond.addVertex(  0, DIAMOND_HEIGHT  );
            diamond.addVertex( DIAMOND_SIDE , 0 );
            diamond.addVertex(  0, - DIAMOND_SIDE  );
//            diamond.addArc( DIAMOND_SIDE *2  , DIAMOND_SIDE * 2 , 0,  90 );
            diamond.addArc( DIAMOND_SIDE , 90, 90, 10  );
//            diamond.addArc(100/ 2, 45, 90, 100  );
//            diamond.addArc(100,90, 45, 0  );
//            diamond.setFilled(true);
//            diamond.setFillColor(Color.RED);
            add(diamond, initialStartPointXCoord , initialStartPointYCoord );
            GArc heartRightSide = new GArc(DIAMOND_SIDE * 2.1, DIAMOND_SIDE * 2.1,  0, 88);
//            heartRightSide.setFilled(true);
//            heartRightSide.setFillColor(Color.RED);
            add(heartRightSide, initialStartPointXCoord - DIAMOND_SIDE - DIAMOND_SIDE / 10 , initialStartPointYCoord - DIAMOND_SIDE - DIAMOND_SIDE / 20 );

            GArc heartLeftSide = new GArc(DIAMOND_SIDE *2, DIAMOND_SIDE * 2, 30, 150 );
            add(heartLeftSide, initialStartPointXCoord -   DIAMOND_SIDE ,  initialStartPointYCoord - DIAMOND_SIDE);

        }

        /**
         * Private constants
         */
        private final double DIAMOND_SIDE = 100;
        private final double DIAMOND_HEIGHT = 100;
    }

}
