import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class GlowingRainbowHeart extends GraphicsProgram {

    public void run() {
        GHeart heart = new GHeart(HEART_SIZE_M);
        heart.setFilled(true);
        add(heart, (getWidth() -  HEART_SIZE_M) /2 , (getHeight() + 2 * HEART_SIZE_M)  / 2);
        while(true) {
            heart.setColor(rgen.nextColor());
            pause(PAUSE_TIME);
        }
    }


    /** Pause time in milliseconds **/
    private final double PAUSE_TIME = 1000;

    /**Random number generator */
    private RandomGenerator rgen = new RandomGenerator();

    private GHeart heart;

    private final double HEART_SIZE_M = 75;

    private final double HEART_SIZE_L = 100;

    private final double HEART_SIZE_S = 50;
}
