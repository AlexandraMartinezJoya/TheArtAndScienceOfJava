import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class drawGTenPointStar extends GraphicsProgram {

    public void run(){
        double width = 50;
        GPolygon star = new GPolygon();
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        star.addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 10; i++ ){
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 36);
            angle -= 36;
        }
        add(star, getWidth() / 2, getHeight() / 2);

        GTenPointStar graphStar = new GTenPointStar(width);
        add(graphStar, getWidth()/ 3, getHeight() / 3);
    }
}
