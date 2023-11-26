import acm.graphics.*;

import java.awt.*;

public class GBallWithNumber extends GCompound  {

    /** Creates a new GObject  Ball with radius centered at (x, y) */
    public GBallWithNumber(double radius, double xCoord, double yCoord, String number){
        GOval ball = new GOval(2 * radius, 2 * radius);
        ball.setFilled(false);
        GLabel numberLabel = new GLabel(number);
        double oneWidth = 2  *  numberLabel.getWidth();
        double oneHeight = numberLabel.getDescent() - 2  * numberLabel.getHeight();
        numberLabel.setFont("TimesNewRoman-36");
        numberLabel.setColor(PURPLE_COLOR);
        numberLabel.setLocation(xCoord  - oneWidth / 2,  yCoord  - oneHeight / 2);
        add(numberLabel);
        ball.setLocation(xCoord - radius, yCoord - radius);
        add(ball);
    }

    private final Color PURPLE_COLOR = new Color(163, 73, 164);

}