import acm.graphics.GPolygon;

public abstract class Star extends GPolygon{

    StarType type;
    double width;

    Star(StarType type, double width ){
        this.type = type;
        this.width = width;
    }

    abstract void create( double width);
}

