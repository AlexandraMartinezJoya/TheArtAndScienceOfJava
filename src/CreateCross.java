import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateCross extends GraphicsProgram {
    public void run() {
            GPolygon poly = new GPolygon();
            double x0 = -2.5 * edge;
            double y0 = edge / 2;
            poly.addVertex(x0, y0);
            poly.addEdge(edge, 0);
            poly.addEdge(0, edge);
            poly.addEdge(edge, 0);
            poly.addEdge(0, edge);
            poly.addEdge(edge, 0);
            poly.addEdge(0, -edge);
            poly.addEdge(edge, 0);
            poly.addEdge(0, -edge);
            poly.addEdge(edge, 0);
            poly.addEdge(0, -edge);
            poly.addEdge(-edge, 0);
            poly.addEdge(0, -edge);
            poly.addEdge(-edge, 0);
            poly.addEdge(0, -edge);
            poly.addEdge(-edge, 0);
            poly.addEdge(0, edge);
            poly.addEdge(-edge, 0);
            poly.addEdge(0, edge);
            poly.addEdge(-edge, 0);
            poly.addEdge(0, edge);
            add(poly, getWidth() / 2, getHeight() / 2);
    }

    private final double edge = 100;
}



