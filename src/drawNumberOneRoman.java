import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class drawNumberOneRoman extends GraphicsProgram {

    public void run(){
        double initialStartPointXCoord = getWidth() / 2;
        double initialStartPointYCoord = getHeight() / 2;
        GNumberOneRoman numberOneRoman = new GNumberOneRoman(rectangleOneBase, rectangleOneHeight, rectangleTwoBase, rectangleTwoHeight, initialStartPointXCoord, initialStartPointYCoord);
        add(numberOneRoman);
    }

    private final double rectangleOneBase = 90;
    private final double rectangleOneHeight = 15;
    private final double rectangleTwoBase = 45;
    private final double rectangleTwoHeight = 90;
}
