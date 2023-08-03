
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class HalloweenPumpkin  extends GraphicsProgram {

    public void run(){
        double dx = getWidth() / 2;
        double dy = getHeight() / 2;

        drawPumpkinHead();
        drawPumpkinStem(dx, dy);
        drawPumpkinEyes(dx, dy);
        drawPumpkinNose(dx, dy);
        drawPumpkinMouth(dx, dy);
    }

    private void drawPumpkinHead( ){
        double dx = (getWidth() -  pumpkinHeadRadius) / 2;
        double dy = (getHeight() -  pumpkinHeadRadius) / 2;
        drawPumpkinHeadShape(dx, dy);
    }

    private void drawPumpkinHeadShape(double dx, double dy){
        GOval circle = new GOval(dx, dy, pumpkinHeadRadius, pumpkinHeadRadius);
        circle.setFilled(true);
        circle.setFillColor(Color.ORANGE);
        add(circle);
    }

    private void  drawPumpkinStem(double dx, double dy){
        double stemX = dx - PUMPKIN_STEM_WIDTH / 2 ;
        double stemY = dy   - pumpkinHeadRadius / 2 - PUMPKIN_STEM_HEIGHT;
        GRect stem = new GRect(stemX, stemY, PUMPKIN_STEM_WIDTH, PUMPKIN_STEM_HEIGHT);
        stem.setFilled(true);
        stem.setFillColor(Color.BLACK);
        add(stem);
    }

    private void drawPumpkinEyes(double dx, double dy){
        //Add left eye
        double myDY = dy;
        double myDX = dx - PUMPKIN_EYE_SIDE / 4 ;
        int angle = 135;

        double leftEyeX = myDX -  pumpkinHeadRadius / 6;
        double leftEyeY = myDY + PUMPKIN_EYE_SIDE / 2 - pumpkinHeadRadius / 3;
        GPolygon leftEye = new GPolygon();
        leftEye.addVertex(-PUMPKIN_EYE_SIDE / 2, 0);

        for (int i = 0; i < 2; i++){
            //leftEye.addPolarEdge(PUMPKIN_EYE_SIDE, angle);
            angle += 90;
        }
        for (int i = 0; i < 2; i++){
            leftEye.addPolarEdge(PUMPKIN_EYE_SIDE, angle);
            angle += 90;
        }
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.BLACK);
        add(leftEye, leftEyeX, leftEyeY);

        int angle2 = 135;

        //add right eye
        double rightEyeX = myDX + pumpkinHeadRadius / 6 ;
        double rightEyeY = myDY + PUMPKIN_EYE_SIDE / 2 - pumpkinHeadRadius / 3;
        GPolygon rightEye = new GPolygon();
        rightEye.addVertex(-PUMPKIN_EYE_SIDE / 2, 0);
        for (int i = 0; i < 2; i++){
            //rightEye.addPolarEdge(PUMPKIN_EYE_SIDE, angle);
            angle2 += 90;
        }
        for (int i = 0; i < 2; i++){
            rightEye.addPolarEdge(PUMPKIN_EYE_SIDE, angle2);
            angle2 += 90;
        }
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.BLACK);
        add(rightEye, rightEyeX, rightEyeY);
    }

    private void drawPumpkinNose(double dx, double dy){
        double noseX = dx + PUMPKIN_EYE_SIDE ;
        double noseY = dy + PUMPKIN_EYE_SIDE / 2 ;
        GPolygon nose = new GPolygon();
        nose.addVertex(-PUMPKIN_EYE_SIDE / 2, 0);
        int angle = 135;
        for (int i = 0; i < 2; i++){
            nose.addPolarEdge(PUMPKIN_EYE_SIDE, angle);
            angle += 90;
        }
        nose.setFilled(true);
        nose.setFillColor(Color.BLACK);
        add(nose, noseX, noseY);
    }

    private void drawPumpkinMouth(double initialStartPointXCoord, double initialStartPointYCoord) {
        PumpkinMouth pumpinMouth = new PumpkinMouth(initialStartPointXCoord, initialStartPointYCoord);
    }

    private class PumpkinMouth extends GPolygon  {

        /** Creates a new GObject subclass that represents a ball whose reference point
         * is the center rather than the upper left corner
         */
        public PumpkinMouth(double initialStartPointXCoord, double initialStartPointYCoord){
            //initialStartPointXCoord = initialStartPointYCoord - 5;
            double thisStartPointx = initialStartPointXCoord - 10;
            GPolygon mouthCompound = new GPolygon();
            mouthCompound.addVertex( - PUMPKIN_MOUTH_BASE / 1.50, -10 );
            mouthCompound.addVertex(  10, PUMPKIN_MOUTH_HEIGHT / 2 );
            mouthCompound.addVertex( PUMPKIN_MOUTH_BASE / 1.50 , 10 );
            mouthCompound.addVertex(  -10, - PUMPKIN_MOUTH_HEIGHT / 2 );

            GPolygon mouthCompound2 = new GPolygon();
            mouthCompound2.addVertex( - PUMPKIN_MOUTH_BASE /1.50 , 10 );
            mouthCompound2.addVertex(  -10, PUMPKIN_MOUTH_HEIGHT / 2 );
            mouthCompound2.addVertex( PUMPKIN_MOUTH_BASE / 1.50 , -10 );
            mouthCompound2.addVertex(  10, - PUMPKIN_MOUTH_HEIGHT / 2 );

            GPolygon mouthCompound3 = new GPolygon();
            mouthCompound3.addVertex( - PUMPKIN_MOUTH_BASE / 1.50, -10 );
            mouthCompound3.addVertex(  10, PUMPKIN_MOUTH_HEIGHT / 2 );
            mouthCompound3.addVertex( PUMPKIN_MOUTH_BASE / 1.50 , 10 );
            mouthCompound3.addVertex(  -10, - PUMPKIN_MOUTH_HEIGHT / 2 );

            GPolygon mouthCompound4 = new GPolygon();
            mouthCompound4.addVertex( - PUMPKIN_MOUTH_BASE /1.50 , 10 );
            mouthCompound4.addVertex(  -10, PUMPKIN_MOUTH_HEIGHT / 2 );
            mouthCompound4.addVertex( PUMPKIN_MOUTH_BASE / 1.50 , -10 );
            mouthCompound4.addVertex(  10, - PUMPKIN_MOUTH_HEIGHT / 2 );

            GPolygon mouthCompound5 = new GPolygon();
            mouthCompound5.addVertex( - PUMPKIN_MOUTH_BASE / 1.50, -10 );
            mouthCompound5.addVertex(  10, PUMPKIN_MOUTH_HEIGHT / 2 );
            mouthCompound5.addVertex( PUMPKIN_MOUTH_BASE / 1.50 , 10 );
            mouthCompound5.addVertex(  -10, - PUMPKIN_MOUTH_HEIGHT / 2 );

            GPolygon mouthCompound6 = new GPolygon();
            mouthCompound6.addVertex( - PUMPKIN_MOUTH_BASE /1.50 , 10 );
            mouthCompound6.addVertex(  -10, PUMPKIN_MOUTH_HEIGHT / 2 );
            mouthCompound6.addVertex( PUMPKIN_MOUTH_BASE / 1.50 , -10 );
            mouthCompound6.addVertex(  10, - PUMPKIN_MOUTH_HEIGHT / 2 );

            mouthCompound.setFilled(true);
            mouthCompound.setFillColor(Color.BLACK);
            add(mouthCompound,  thisStartPointx - pumpkinHeadRadius / 6, initialStartPointYCoord + pumpkinHeadRadius / 4);

            mouthCompound2.setFilled(true);
            mouthCompound2.setFillColor(Color.BLACK);
            add(mouthCompound2,  thisStartPointx - pumpkinHeadRadius / 6 + PUMPKIN_MOUTH_BASE - 10, initialStartPointYCoord + pumpkinHeadRadius / 4);

            mouthCompound3.setFilled(true);
            mouthCompound3.setFillColor(Color.BLACK);
            add(mouthCompound3, thisStartPointx - pumpkinHeadRadius / 6 +  PUMPKIN_MOUTH_BASE * 1.5, initialStartPointYCoord + pumpkinHeadRadius / 4 ) ;

            mouthCompound4.setFilled(true);
            mouthCompound4.setFillColor(Color.BLACK);
            add(mouthCompound4, thisStartPointx - pumpkinHeadRadius / 6 +  PUMPKIN_MOUTH_BASE * 3 - 20, initialStartPointYCoord + pumpkinHeadRadius / 4 ) ;

            mouthCompound5.setFilled(true);
            mouthCompound5.setFillColor(Color.BLACK);
            add(mouthCompound5, thisStartPointx - pumpkinHeadRadius / 6 +  PUMPKIN_MOUTH_BASE * 3, initialStartPointYCoord + pumpkinHeadRadius / 4 ) ;

            mouthCompound6.setFilled(true);
            mouthCompound6.setFillColor(Color.BLACK);
            add(mouthCompound6, thisStartPointx - pumpkinHeadRadius / 6 +  PUMPKIN_MOUTH_BASE * 5 - 40, initialStartPointYCoord + pumpkinHeadRadius / 4 ) ;

            markAsComplete();
        }
    }

    private final double pumpkinHeadRadius = 250;
    private final double PUMPKIN_STEM_HEIGHT = 35;
    private final double PUMPKIN_STEM_WIDTH = 20;
    private final double PUMPKIN_EYE_SIDE = 40;
    private final double PUMPKIN_MOUTH_BASE = 30;
    private final double PUMPKIN_MOUTH_HEIGHT = 45;

}
