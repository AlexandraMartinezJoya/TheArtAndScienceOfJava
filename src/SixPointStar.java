import acm.graphics.GMath;

class SixPointStar extends Star{

    public SixPointStar(StarType type, double width) {
        super(type, width);
        create(width);
    }

    public void create(double starWidth) {
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 6; i++ ){
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 72);
            angle -= 60;
        }
    }
}
