import acm.graphics.GLine;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class EquilateralTriangle extends GraphicsProgram {

    public void run(){
        add(createEquilateralTriangle(50.0, 65.0,getWidth() /2, getHeight() /2));
    }


    private GPolygon createEquilateralTriangle(double base, double height, double widthStartPoint, double heightStartPoint){
        GLine line1  = new GLine(widthStartPoint, heightStartPoint,  widthStartPoint + base, heightStartPoint);
        GLine line2  = new GLine(widthStartPoint, heightStartPoint, widthStartPoint + base / 2, heightStartPoint - height);
        GLine line3 = new GLine(widthStartPoint + base, heightStartPoint, widthStartPoint + base / 2, heightStartPoint - height);
        add(line1);
        add(line2);
        add(line3);
        GPolygon equilateralTriangle = new GPolygon(widthStartPoint, heightStartPoint);
        return equilateralTriangle;

    }
}