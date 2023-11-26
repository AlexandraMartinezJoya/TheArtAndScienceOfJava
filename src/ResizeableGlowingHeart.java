import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import javax.swing.*;

public class ResizeableGlowingHeart extends GraphicsProgram {

    public void run() {
        sizeSlider = new JSlider(HEART_SIZE_S, HEART_SIZE_L, HEART_SIZE_M);
        double currentHeartSize = getCurrentHeartSize();
        GHeart heart;

        while(true) {
            if(currentHeartSize < HEART_SIZE_L) {
                currentHeartSize += 5;
            } else {
                currentHeartSize = HEART_SIZE_S;
            }
//            removeAll();
            heart = new GHeart(currentHeartSize);
            heart.setColor(rgen.nextColor());
            pause(PAUSE_TIME);
            heart.setFilled(true);
            add(heart, (getWidth()  - currentHeartSize) /2,( getHeight() +2 * currentHeartSize)  / 2);
            pause(PAUSE_TIME_FOR_DELETE);
            removeAll();
        }
    }

    public double getCurrentHeartSize() {
        return sizeSlider.getValue();
    }

    /** Pause time in milliseconds **/
    private final double PAUSE_TIME = 1000;
    private final double PAUSE_TIME_FOR_DELETE = 400;

    /**Random number generator */
    private RandomGenerator rgen = new RandomGenerator();


    private GHeart heart;

    private final int HEART_SIZE_M = 75;
    private final int HEART_SIZE_L = 150;
    private final int HEART_SIZE_S = 50;

    private JSlider sizeSlider;
}