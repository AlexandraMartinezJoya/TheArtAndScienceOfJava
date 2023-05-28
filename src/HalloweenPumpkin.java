import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class HalloweenPumpkin  extends GraphicsProgram {

    private final double pumpkinHeadRadius = 250;
    private final double PUMPKIN_STEM_HEIGHT = 35;
    private final double PUMPKIN_STEM_WIDTH = 20;
    private final double PUMPKIN_EYE_SIDE = 40;
    private final double PUMPKIN_NOSE_BASE = 30;
    private final double PUMPKIN_NOSE_HEIGHT = 35;

    public void run(){
        double dx = getWidth() / 2;
        double dy = getHeight() / 2;

        drawPumpkinHead();
        drawPumpkinStem(dx, dy);
//        drawPumpkinEyes(dx, dy);
        drawPumpkinNose(dx, dy);
    }

    private void drawPumpkinHead( ){
        double dx = (getWidth() -  pumpkinHeadRadius) / 2;
        double dy = (getHeight() -  pumpkinHeadRadius) / 2;
        drawPumpkinHeadShape(dx, dy);


      //  drawPumpkinMouth();
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
        double leftEyeX = dx + PUMPKIN_EYE_SIDE ;
        double leftEyeY = dy + PUMPKIN_EYE_SIDE / 2;
        GPolygon leftEye = new GPolygon();
        leftEye.addVertex(-PUMPKIN_EYE_SIDE / 2, 0);
        int angle = 135;
        for (int i = 0; i < 2; i++){
            leftEye.addPolarEdge(PUMPKIN_EYE_SIDE, angle);
            angle += 90;
        }
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.BLACK);
        add(leftEye, dx, dy);
    }

    private void drawPumpkinNose(double dx, double dy){
        double noseX = dx + PUMPKIN_EYE_SIDE ;
        double noseY = dy + PUMPKIN_EYE_SIDE / 2;
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
}
