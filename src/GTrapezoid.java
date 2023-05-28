import acm.graphics.GPolygon;

public class GTrapezoid extends GPolygon {

    public GTrapezoid (double width) {
        addVertex( 0, 0);
        double height = 2*  width  / 3;
        addEdge(  width, 0);
        addEdge(height, height);
        addEdge(-(width + 2 * height ), 0);
    }
}
