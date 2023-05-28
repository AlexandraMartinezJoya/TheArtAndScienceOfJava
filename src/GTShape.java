import acm.graphics.GPolygon;

public class GTShape extends GPolygon {

    public GTShape(double width, double height) {
        addVertex( 0, 0);
        addEdge(  width, 0);
        addEdge(0, height / 3);
        addEdge(-width / 3, 0);
        addEdge(0, (2 * height )/ 3);
        addEdge(-width /3,0);
        addEdge(0, -(2 * height )/ 3);
        addEdge(-width / 3, 0);
    }
}
