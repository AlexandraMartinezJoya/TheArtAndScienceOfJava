import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.*;

/**
 * File: ColorChangingSquare.java
 * -------------------------------------
 *
 */

public class ColorChangingSquare extends GraphicsProgram {

    public void run(){
        GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
        square.setFilled(true);
        add(square, (getWidth() - SQUARE_SIZE) /2 , (getHeight() - SQUARE_SIZE)  / 2);
        while(true) {
            square.setColor(rgen.nextColor());
            pause(PAUSE_TIME);
        }
    }


    /** Size of the square in pixels*/
    private final double SQUARE_SIZE = 100;

    /** Pause time in milliseconds **/
    private final double PAUSE_TIME = 1000;

    /**Random number generator */
    private RandomGenerator rgen = new RandomGenerator();
}
