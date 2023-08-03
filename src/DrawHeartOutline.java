import acm.graphics.GArc;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

import java.awt.*;

public class DrawHeartOutline extends GraphicsProgram {

    public void run(){

        drawHearOutline();
    }

    private void drawHearOutline() {
        double startPointX = getWidth() /2 ;
        double starPointY = getHeight() /2;
        GLine lineOne = new GLine(startPointX, starPointY, startPointX + lineDistance, starPointY + lineDistance);
        add(lineOne);
        GLine lineTwo = new GLine(startPointX + lineDistance , starPointY + lineDistance ,  startPointX , starPointY + lineDistance * 2);
        add(lineTwo);
        GLine lineThree = new GLine(startPointX , starPointY + lineDistance * 2 ,  startPointX - lineDistance  , starPointY + lineDistance);
        add(lineThree);
        GLine lineFour = new GLine(startPointX - lineDistance  , starPointY + lineDistance,  startPointX, starPointY);
        add(lineFour);

        double  r = lineDistance;
        //Draws an outlined Arc
        GArc heartRightOutline = new GArc( r * 1.4 ,  r *1.4 , -45, 180);
        heartRightOutline.setFilled(true);
        heartRightOutline.setFillColor(Color.WHITE);
        add(heartRightOutline,startPointX  - lineDistance / 5 , starPointY  - lineDistance /5);
        GArc heartLeftOutline = new GArc( r * 1.4 ,  r *1.4 , 45, 180);
        heartLeftOutline.setFilled(true);
        heartLeftOutline.setFillColor(Color.WHITE);
        add(heartLeftOutline, startPointX - lineDistance - lineDistance / 6  , starPointY - lineDistance / 6  );
//        GArc heartRightOutline = new GArc();
    }

    private final double lineDistance = 50;
    //------- This sort of looks like an owl right now ----
    // double startPointX = getWidth() /2 ;
    //        double starPointY = getHeight() /2;
    //        GLine lineOne = new GLine(startPointX, starPointY, startPointX + lineDistance, starPointY + lineDistance);
    //        add(lineOne);
    //        GLine lineTwo = new GLine(startPointX + lineDistance , starPointY + lineDistance ,  startPointX , starPointY + lineDistance * 2);
    //        add(lineTwo);
    //        GLine lineThree = new GLine(startPointX , starPointY + lineDistance * 2 ,  startPointX - lineDistance  , starPointY + lineDistance);
    //        add(lineThree);
    //        GLine lineFour = new GLine(startPointX - lineDistance  , starPointY + lineDistance,  startPointX, starPointY);
    //        add(lineFour);
    //
    //        double  r = lineDistance;
    //        //Draws an outlined Arc
    //        GArc heartRightOutline = new GArc( r * 1.4 ,  r *1.4 , -45, 180);
    //        heartRightOutline.setFilled(true);
    //        heartRightOutline.setFillColor(Color.WHITE);
    //        add(heartRightOutline,startPointX  - lineDistance / 5 , starPointY  - lineDistance /5);
    //        GArc heartLeftOutline = new GArc( r * 1.4 ,  r *1.4 , -180, 45);
    //        heartLeftOutline.setFilled(true);
    //        heartLeftOutline.setFillColor(Color.WHITE);
    //        add(heartLeftOutline, startPointX, starPointY );

}
