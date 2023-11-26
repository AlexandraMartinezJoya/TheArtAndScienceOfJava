import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class drawGTwelvePointStar extends GraphicsProgram {
    public void run(){
        double width = 35;
        GPolygon star = new GPolygon();
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        star.addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 12; i++ ){
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 30);
            angle -= 30;
        }
        add(star, getWidth() / 2,  getHeight() / 2);

        GTwelvePointStar graphStar = new GTwelvePointStar(width);
        add(graphStar, getWidth() / 3, getHeight() / 3);
    }
}
