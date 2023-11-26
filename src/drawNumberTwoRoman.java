import acm.program.GraphicsProgram;

public class drawNumberTwoRoman extends GraphicsProgram {

    public void run(){
        double initialStartPointXCoord = getWidth() /2;
        double initialStartPointYCoord = getHeight() / 2;
        GNumberTwoRoman two = new GNumberTwoRoman(rectangleOneBase, rectangleOneHeight, rectangleTwoBase, rectangleTwoHeight, initialStartPointXCoord, initialStartPointYCoord);
        add(two, initialStartPointXCoord /20 - rectangleOneBase  , (initialStartPointYCoord  - 3 * rectangleTwoHeight) );
    }

    private final double rectangleOneBase = 90;
    private final double rectangleOneHeight = 15;
    private final double rectangleTwoBase = 45;
    private final double rectangleTwoHeight = 90;
}
