import acm.graphics.*;

public class MegaNeonEgg  extends GCompound{

    /** Creates a new GObject subclass that represents a ball whose reference point
     * is the center rather than the upper left corner
     */
    public MegaNeonEgg(double r){
        GOval ball = new GOval(2 * r, 2 * r);
        ball.setFilled(true);
        add(ball);
        markAsComplete();
        //GArc eggTop = new GArc();
        //add(eggTop);
    }
}
