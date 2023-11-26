import acm.graphics.GMath;
import acm.graphics.GPolygon;

/**
 * Defines a new GObject class that appears as a ten-pointed star
 */
public class GTenPointStar extends GPolygon {

    /**
     * Creates a new GStar centered at the origin with the specified horizontal width
     * @param width The width of the star
     */
    public GTenPointStar(double width){
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 10; i++ ){
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 72);
            angle -= 36;
        }
    }
}
