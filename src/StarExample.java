import acm.graphics.GMath;
import acm.graphics.GPolygon;

public class StarExample extends GPolygon {
    public StarType type;


    public StarExample(String starType, double width){
        switch (starType) {
            case STAR_TYPE_FOUR_POINT : createFourPoint(width);break;
            case STAR_TYPE_FIVE_POINT : createFivePoint(width); break;
            case STAR_TYPE_SIX_POINT:  createSixPoint(width); break;
            case STAR_TYPE_EIGHT_POINT:createEightPoint(width); break;
            case STAR_TYPE_TEN_POINT: createTenPointStar(width);break;
            case STAR_TYPE_TWELVE_POINT: createTwelvePointStar(width);break;
            default: createEightPoint(width);
        }
    }

    private void createFourPoint(double width){
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 4; i++ ){
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 72);
            angle -= 90;
        }
    }

    private void createFivePoint(double width) {
        double dx = width /2;
        double dy = dx * GMath.tanDegrees(18);
        double edge = width / 2 - dy * GMath.tanDegrees(36);
        addVertex(-dx, -dy);
        int angle = 0;
        for(int i = 0; i < 5; i++ ){
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 72);
            angle -= 72;
        }
    }

    private void createSixPoint(double width) {
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

        private void createEightPoint(double width) {
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

        private void createTenPointStar(double width) {
            double dx = width /2;
            double dy = dx * GMath.tanDegrees(18);
            double edge = width / 2 - dy * GMath.tanDegrees(36);
            addVertex(-dx, -dy);
            int angle = 0;
            for(int i = 0; i < 10; i++ ){
                addPolarEdge(edge, angle);
                addPolarEdge(edge, angle + 72);
                angle -= 36;
            }
        }

        private void createTwelvePointStar(double width) {
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


    private final String STAR_TYPE_FOUR_POINT = "fourPoint";
    private final String STAR_TYPE_FIVE_POINT = "fivePoint";
    private final String STAR_TYPE_SIX_POINT = "sixPoint";
    private final String STAR_TYPE_EIGHT_POINT = "eightPoint";
    private final String STAR_TYPE_TEN_POINT = "tenPoint";
    private final String STAR_TYPE_TWELVE_POINT = "twelvePoint";
}


