import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomColorSquare extends GraphicsProgram {

    /*
        Private constants
     */
    private final double SQUARE_SIZE = 50;
    private final double PAUSE_TIME = 200;

    /* Instace variables */
    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        double xCoord = (getWidth() - SQUARE_SIZE) / 2;
        double yCoord = (getHeight() - SQUARE_SIZE) / 2;
        GRect square = new GRect(xCoord, yCoord, SQUARE_SIZE, SQUARE_SIZE);
        square.setFilled(true);
        add(square);
        while (true){
            square.setFillColor(rgen.nextColor());
            pause(PAUSE_TIME);
        }
    }
}
