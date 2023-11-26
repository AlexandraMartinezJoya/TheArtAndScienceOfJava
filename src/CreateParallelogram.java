import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateParallelogram extends GraphicsProgram {
    public void run() {
        GPolygon poly = new GPolygon();
        double x0 = -(edge + edge / Math.sqrt(2)) / 2;
        double y0 = edge / Math.sqrt(2) / 2;
        poly.addVertex(x0, y0);
        poly.addPolarEdge(edge, 0);
        poly.addPolarEdge(edge, 45);
        poly.addPolarEdge(edge, 180);
        poly.addPolarEdge(edge, 225);
        add(poly, getWidth() / 2, getHeight() / 2);
    }

    private final double edge = 100;
}


