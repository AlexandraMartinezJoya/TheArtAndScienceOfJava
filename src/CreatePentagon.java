import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreatePentagon extends GraphicsProgram {
    public void run() {
        GPolygon poly = new GPolygon();
        double x0 = -edge / 2;
        double y0 = edge / 2 / GMath.tanDegrees(36);
        poly.addVertex(x0, y0);
        for (int i = 0; i < 5; i++) {
            poly.addPolarEdge(edge, i * 72);
        }
        add(poly, getWidth() / 2, getHeight() / 2);
    }

    private final double edge = 100;
}


