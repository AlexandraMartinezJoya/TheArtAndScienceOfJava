import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class TimeSquare extends GraphicsProgram {

    public void run(){
        GLabel label = new GLabel(HEADLINE);
        label.setFont("Times-72");
        add(label, getWidth(), (getHeight() + label.getAscent()) / 2);
        while( label.getX() + label.getWidth() > 0){
            label.move(-DELTA_X, 0);
            pause(PAUSE_TIME);
        }
    }


    /**
     * The number of pixels to shift the label on each cycle
     */
    private final double DELTA_X = 2.0;

    /**
     * The number of milliseconds to pause on each cycle
     */
    private final int PAUSE_TIME = 20;

    /**
     * The string to use as the value of the label
     */
    private final String HEADLINE =
            "Monolink was here!!!! ";
}
