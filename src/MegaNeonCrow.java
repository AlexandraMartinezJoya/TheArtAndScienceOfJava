import acm.program.GraphicsProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MegaNeonCrow extends GraphicsProgram {

    private final double PAUSE_TIME = 200;

    /* Instace variables */
    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        drawCrow crow = new drawCrow();

        crow.setFillColor(rgen.nextColor());
        pause(PAUSE_TIME);
    }
}
