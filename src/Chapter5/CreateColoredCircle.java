package acm.jar.java.Chapter5;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

//also if its not running, you can always say "does not run" or "ran" instead of targetting people's heads like insane people.

class CreateColoredCircles extends GraphicsProgram {

    /**
     * Private constants
     */
    private final int N_CIRCLES = 8;
    private final double OUTER_RADIUS = 75;
    private final double INNER_RADIUS = 10;

    /**
     * Colors for new Circle
     */
    Color MY_DEEP_PURPLE = new Color(170, 60,  160);
    Color MY_HEAVY_INDIGO = new Color(20, 5, 165);
    Color MY_LIGHT_BLUE = new Color(200, 245, 251);
    Color MY_LIGHT_GREEN = new Color(165, 250,150);
    Color MY_LIGHT_YELLOW = new Color(250, 250, 190);
    // This would be nice if it matched the Orange company phone number, but I currently just have Vodaphone
    Color MY_ORANGE = new Color(250, 160, 100);
    Color MY_RED = new Color(255, 0 ,6);

    public void run() {
        int oneEith = 8;
        double directionX = (double) getWidth()  / oneEith;
        double directionY = (double) getHeight() / oneEith;
        double spaceBetweenCircles = (OUTER_RADIUS - INNER_RADIUS ) / (N_CIRCLES - 1) ;
        drawCirclesYooo(directionX, directionY, spaceBetweenCircles);
    }

    private void drawCirclesYooo(double dx, double dy, double spaceBetween){
        GOval outterCircle =  createFilledCircle(dx, dy, OUTER_RADIUS,  Color.RED );
        add(outterCircle);
        GOval outterMiddleWhiteCircle  = createFilledCircle( dx  , dy  , OUTER_RADIUS - ( spaceBetween), Color.WHITE);
        add(outterMiddleWhiteCircle);
        GOval innerMiddleRedCircle = createFilledCircle(dx, dy, OUTER_RADIUS - ( 2 * spaceBetween), Color.RED);
        add(innerMiddleRedCircle);
        GOval innerMiddleWhiteCircle = createFilledCircle(dx, dy, OUTER_RADIUS - ( 3 * spaceBetween), Color.WHITE);
        add(innerMiddleWhiteCircle);
        GOval innerMiddleRedSmallCircle = createFilledCircle(dx, dy, OUTER_RADIUS - ( 4 * spaceBetween), Color.RED);
        add(innerMiddleRedSmallCircle);
        GOval innerWhiteCircle = createFilledCircle(dx, dy, INNER_RADIUS, Color.WHITE);
        add(innerWhiteCircle);
    }

    private GOval createFilledCircle(double x, double y, double r, Color color){
        GOval circle = new GOval( x - r, y - r, 2 * r, 2 * r);
        circle.setColor(color);
        circle.setFillColor(color);
        circle.setFilled(true);
        return circle;
    }
}
