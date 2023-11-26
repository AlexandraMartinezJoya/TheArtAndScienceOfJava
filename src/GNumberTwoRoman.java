import acm.graphics.GCompound;
import acm.graphics.GRect;

public class GNumberTwoRoman  extends GCompound {

    /**
     * This Graphic object draws the roman representation of number 2 centered location on the screen
     * For best dimensions try and set the second rectangle 1/3 bigger than the base rectangle
     *
     * @param rectangleOneBase
     * @param rectangleOneHeight
     * @param rectangleTwoBase
     * @param rectangleTwoHeight
     * @param initialStartPointXCoord
     * @param initialStartPointYCoord
     */
    public GNumberTwoRoman(double rectangleOneBase, double  rectangleOneHeight, double rectangleTwoBase, double rectangleTwoHeight, double initialStartPointXCoord,  double initialStartPointYCoord){
        GNumberOneRoman numberOneRoman = new GNumberOneRoman(rectangleOneBase, rectangleOneHeight, rectangleTwoBase, rectangleTwoHeight,  initialStartPointXCoord, initialStartPointYCoord);
        add(numberOneRoman);
        double initalStarPointXCoordForSecondOne= initialStartPointXCoord + rectangleOneBase + spaceBetween;
        GNumberOneRoman numberAnotherOneRoman = new GNumberOneRoman(rectangleOneBase, rectangleOneHeight, rectangleTwoBase, rectangleTwoHeight, initalStarPointXCoordForSecondOne, initialStartPointYCoord);
        add(numberAnotherOneRoman);
    }

    private final double spaceBetween = 10;
}
