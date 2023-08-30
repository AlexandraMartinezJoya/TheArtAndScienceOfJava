
import acm.program.GraphicsProgram;

import java.awt.*;


public class DrawGHeart extends GraphicsProgram {

    public void run(){

        GHeart heart  = new GHeart(DIAMOND_SIDE);
        heart.setColor(Color.RED);
        heart.setFilled(true);
        heart.setFillColor(Color.RED);
        add(heart, 300, 300);
    }
    private final double DIAMOND_SIDE = 100;

}
