/**
 *
 * File: EarthImage.java
 * --------------------------------
 * This program displays an image of the earth from space
 * The image appears through the courtesy of NASA/JPL-Caltech
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;


public class EarthImage extends GraphicsProgram {

    public void run(){
        add(new GImage("EarthFromApollo17.jpg"));
        addCitation("Courtesy NASA/JPL-Caltech");
    }

    /** Adds a citation label at the lower right of the canvas.  */
    private void addCitation(String text){
        GLabel label = new GLabel(text);
        label.setFont(CITATION_FONT);
        label.setColor(Color.LIGHT_GRAY);
        double x = getWidth() - label.getWidth() - CITATION_MARGIN;
        double y = getHeight() - (CITATION_MARGIN + label.getAscent()) ;
        add(label, x, y);
    }

    /** Private constants **/
    private  final String CITATION_FONT = "SansSerif-10";
    private  final int CITATION_MARGIN = 14;

    /* Set the dimentions of the window */
    //these have to be static to be in place, and I avoided using statics so far
//    public static final int APPLICATION_WIDTH = 663;
//    public static final int APPLICATION_HEIGHT = 670 + CITATION_MARGIN;
}
