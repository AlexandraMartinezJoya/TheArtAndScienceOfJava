import acm.program.GraphicsProgram;

public class DrawObjects  extends GraphicsProgram {

    public void run(){
        add(new GFivePointStar(50), getWidth() /2, getHeight() / 2);
        add(new GTrapezoid(100), getWidth() / 3 , getHeight() / 4);
        add(new GTShape(60, 100), getWidth() / 6, getHeight() / 4);
        add(new GArchedDoor(60,100), getWidth() / 2, 400);
    }
}
