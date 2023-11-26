import acm.graphics.GMath;
import acm.graphics.GPolygon;

/**
 * Defines a new GObject class that appears as a eight-pointed star
 */
public class GEightPointStar extends GPolygon {
    /**
     * Creates a new GStar centered at the origin with the specified horizontal width
     * @param width The width of the star
     */
    public GEightPointStar(double width){
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 8; i++ ){
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 90);
            angle -= 45;
        }
    }
}
