import acm.program.GraphicsProgram;

import java.awt.*;

public class MoveTrain extends GraphicsProgram {

    public void run(){
        double xc = getWidth() / 2;
        Train train = new Train();
//        train.append(new Engine());
        train.append(new Boxcar(Color.BLUE));
//        train.append(new Caboose());
        add(train, xc - train.getWidth() / 2, getHeight());
        waitForClick();
        while(train.getX() + train.getWidth() >= 0){
            train.move( -DELTA_X, 0);
            pause(PAUSE_TIME);
        }
    }

    private final double DELTA_X = 2;
    private final double PAUSE_TIME = 20;
}
