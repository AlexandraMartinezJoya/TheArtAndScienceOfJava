import acm.graphics.GPolygon;

public class GDiamond extends GPolygon {

    public GDiamond(int width){
        addVertex(-width , 0);

        int angle = 120;
        for (int i = 0; i < 3; i++){
            addPolarEdge(width, angle);
            if( i %2 == 0 ) {
                angle += 120;
            } else {
                angle += 60;
            }
        }
    }
}
