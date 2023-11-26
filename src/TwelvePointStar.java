import acm.graphics.GMath;

public class TwelvePointStar extends Star{
    TwelvePointStar(StarType type, double width) {
        super(type, width);
        create(width);
    }

    @Override
    void create(double width) {
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 12; i++ ){
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 90);
            angle -= 30;
        }
    }
}
