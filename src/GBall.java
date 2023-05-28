import acm.graphics.*;

public class GBall extends GCompound  {

    /** Creates a new GObject subclass that represents a ball whose reference point
     * is the center rather than the upper left corner
     */
    public GBall(double radius){
        GOval ball = new GOval(2 * radius, 2 * radius);
        ball.setFilled(true);
        add(ball);
        markAsComplete();
    }

    /** Creates a new ball with radius centered at (x, y) */
    public GBall(double radius, double width, double height){
        this(radius);
        setLocation(width, height);
    }
}
