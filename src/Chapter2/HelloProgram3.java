package Chapter2;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.*;

public class HelloProgram3 extends GraphicsProgram {

    private final Color  PURPLE_COLOR = new Color(163, 73, 164);
    private final Color PINK_RED = new Color(255,159,159);

    public void run(){
        GLabel msg = new GLabel("I Love Java", 500,  400);
        msg.setFont("Lucida -48");
        msg.setColor(PURPLE_COLOR);

        GLabel me = new GLabel("Alexandra Martinez Joya", 600, 600);
        msg.setFont("Lucida Blackletter-24");
        me.setColor(PINK_RED);
    }

}
