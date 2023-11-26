import acm.graphics.GCompound;
import acm.graphics.GRect;

class GNumberOneRoman extends GCompound {

    /**
     * This Graphic object draws the roman representation of number 1 at a set location on the screen
     * For best dimensions try and set the second rectangle 1/3 bigger than the base rectangle
     *
     * @param rectangleOneBase
     * @param rectangleOneHeight
     * @param rectangleTwoBase
     * @param rectangleTwoHeight
     * @param initialStartPointXCoord
     * @param initialStartPointYCoord
     */
    public GNumberOneRoman(double rectangleOneBase, double  rectangleOneHeight, double rectangleTwoBase, double rectangleTwoHeight, double initialStartPointXCoord,  double initialStartPointYCoord){
        GRect rectangleOne = new GRect(rectangleOneBase , rectangleOneHeight);
        rectangleOne.setFilled(true);
        add(rectangleOne, initialStartPointXCoord - rectangleOneBase /2 , initialStartPointYCoord - rectangleOneHeight / 2);
        GRect rectangleTwo = new GRect(rectangleTwoBase, rectangleTwoHeight);
        add(rectangleTwo, initialStartPointXCoord - rectangleOneBase / 4 , initialStartPointYCoord - rectangleOneHeight / 2);
        GRect rectangleThree = new GRect(rectangleOneBase, rectangleOneHeight);
        rectangleTwo.setFilled(true);
        add(rectangleThree, initialStartPointXCoord - rectangleOneBase /2, initialStartPointYCoord - rectangleOneHeight / 2 + rectangleTwoHeight - rectangleOneHeight);
        rectangleThree.setFilled(true);
    }
}
