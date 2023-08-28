import acm.graphics.*;

public class GHeart extends GPolygon {

    public GHeart(double diamondSide) {

        int angle = -45;
        int angle2 = 180;

        angle += 90;
        addPolarEdge(diamondSide, angle);
        angle += 90;
        addPolarEdge(diamondSide, angle);
        addArc(diamondSide, diamondSide, -angle ,  -angle2);
        addArc(diamondSide, diamondSide, angle, -angle2);
    }

}
