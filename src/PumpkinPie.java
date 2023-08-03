import acm.graphics.GArc;
import acm.program.GraphicsProgram;
import acm.graphics.GPolygon;

import java.awt.*;

public class PumpkinPie extends GraphicsProgram {

    public void run(){
        drawPumpkingPie();
    }

    private void drawPumpkingPie(){
        double r = 50.0;
        double width = getWidth();
        double height = getHeight();
        //Draws a filled Arc
//        GArc filledArc = new GArc(2 * r, 2 * r,0, -60);
//        filledArc.setFilled(true);
//        filledArc.setFillColor(PUMPKIN_COLOR);
//        add(filledArc,   width / 2 - 2 * r, height / 2 - 2 * r );
//
//        GArc filledArc2 = new GArc(2 * r, 2 * r,0, 60);
//        filledArc2.setFilled(true);
//        filledArc2.setFillColor(PUMPKIN_COLOR);
//        add(filledArc2,   width / 2 - 2 * r, height / 2 - 2 * r );
//
//        GArc filledArc3 = new GArc(2 * r, 2 * r,60 ,60);
//        filledArc3.setFilled(true);
//        filledArc3.setFillColor(PUMPKIN_COLOR);
//        add(filledArc3,   width / 2 - 2 * r, height / 2 - 2 * r );
//
//        GArc filledArc4 = new GArc(2 * r, 2 * r,-60, -60);
//        filledArc4.setFilled(true);
//        filledArc4.setFillColor(PUMPKIN_COLOR);
//        add(filledArc4,   width / 2 - 2 * r, height / 2 - 2 * r );
//
//        GArc filledArc5 = new GArc(2 * r, 2 * r,-120, -60);
//        filledArc5.setFilled(true);
//        filledArc5.setFillColor(PUMPKIN_COLOR);
//        add(filledArc5,   width / 2 - 2 * r, height / 2 - 2 * r );
//
//        GArc filledArc6 = new GArc(2 * r, 2 * r,120, 60);
//        filledArc6.setFilled(true);
//        filledArc6.setFillColor(PUMPKIN_COLOR);
//        add(filledArc6,   width / 2 - 2 * r, height / 2 - 2 * r );
        int step1 = 120;
        int step2 = 60;
        for(int count = N_PIECES; N_PIECES > 0;  count--) {
            if (count == 5) {
                step1 = -step1;
                step2 = -step2;
            }
            if(count == 4 ) {
                step1 = step1 - step2;
            }
            if(count == 3){
                step1 = -step1;
                step2 = -step2;
            }
            if(count == 2 ) {
                step1 = step2;
                step2 = -step2;
            }
            if(count == 1 ) {
                step1 = step2;
                step2 = -step2;
            }
            GArc pumpkinSlice = new GArc(2 * r, 2 * r, step1, step2);
            pumpkinSlice.setFilled(true);
            pumpkinSlice.setFillColor(PUMPKIN_COLOR);
            add(pumpkinSlice, width / 2 -2 *r,height /2 - 2 * r);
        }
    }

    private final Color PUMPKIN_COLOR = Color.ORANGE;
    private final int N_PIECES = 6;
}
