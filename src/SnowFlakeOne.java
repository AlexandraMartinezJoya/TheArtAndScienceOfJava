import acm.graphics.GLine;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

import java.awt.*;

public class SnowFlakeOne extends Snowflake {

    public SnowFlakeOne(SnowflakeType type, double width){
        super(type, width);
        create(width);
    }

    @Override
    void create(double width) {
        innerStar = new TwelvePointStar(StarType.TWELVE_POINT, width);
        add(innerStar);
        double localX = innerStar.getX();
        double localY = innerStar.getY();
        double starCenterX = localX + width / 2.5;
        double starCenterY = localY + width / 2.5;
        lineOne = new GLine(starCenterX, starCenterY, starCenterX, localY - width * 1.3);
        lineOneTwo = new GLine(starCenterX - 1, starCenterY - 1, starCenterX - 1, localY - width * 1.3 -1);
        lineOneThree = new GLine(starCenterX + 1, starCenterY + 1, starCenterX + 1, localY - width * 1.3 +1);
        add(lineOneTwo);
        add(lineOneThree);
        add(lineOne);
        lineTwo = new GLine(starCenterX, starCenterY, starCenterX, localY + width * 2);
        lineTwoOne = new GLine(starCenterX -1, starCenterY -1, starCenterX -1, localY + width * 2 -1);
        lineTwoTwo = new GLine(starCenterX +1, starCenterY +1, starCenterX +1, localY + width * 2 +1);
        add(lineTwo);
        add(lineTwoOne);
        add(lineTwoTwo);
        lineThree = new GLine(starCenterX, starCenterY, starCenterX +   width * 1.7,localY - width * 1.3);
        lineThreeOne = new GLine(starCenterX -1, starCenterY -1, starCenterX +   width * 1.7 -1 ,localY - width * 1.3 -1);
        lineThreeTwo = new GLine(starCenterX +1, starCenterY +1, starCenterX +   width * 1.7 + 1 ,localY - width * 1.3 + 1);
        add(lineThree);
        add(lineThreeOne);
        add(lineThreeTwo);
        lineFour = new GLine(starCenterX, starCenterY, starCenterX - width * 1.7, localY + width * 2);
        lineFourOne = new GLine(starCenterX -1, starCenterY -1, starCenterX - width * 1.7 -1, localY + width * 2 -1);
        lineFourTwo = new GLine(starCenterX +1, starCenterY +1, starCenterX - width * 1.7 + 1, localY + width * 2 +1);
        add(lineFour);
        add(lineFourOne);
        add(lineFourTwo);
        lineFive = new GLine(starCenterX, starCenterY, starCenterX - width * 1.7, localY - width * 1.3);
        lineFiveOne = new GLine(starCenterX -1 , starCenterY -1, starCenterX - width * 1.7 -1, localY - width * 1.3 -1);
        lineFiveTwo = new GLine(starCenterX +1, starCenterY +1, starCenterX - width * 1.7 + 1, localY - width * 1.3 +1);
        add(lineFive);
        add(lineFiveOne);
        add(lineFiveTwo);
        lineSix = new GLine(starCenterX, starCenterY, starCenterX + width * 1.7, localY + width * 2);
        lineSixOne = new GLine(starCenterX - 1, starCenterY -1 , starCenterX + width * 1.7 -1 , localY + width * 2 -1);
        lineSixTwo = new GLine(starCenterX + 1, starCenterY +1 , starCenterX + width * 1.7 +1 , localY + width * 2 +1);
        add(lineSix);
        add(lineSixOne);
        add(lineSixTwo);

        double rectWidth = width / 4;
        double rectHeight = width * 1.5;

        double rectOneX = starCenterX - rectWidth / 2;
        double rectOneY = localY - width * 1.3 -   rectHeight;
        rectOne = new GRect(rectWidth, rectHeight);
        add(rectOne, rectOneX, rectOneY);

        double rectTwoX = rectOneX;
        double rectTwoY = localY + width * 2 ;
        rectTwo = new GRect(rectWidth, rectHeight);
        add(rectTwo, rectTwoX,  rectTwoY);

        rectThree = new GPolygon();
        double x0 = -( + rectWidth / Math.sqrt(2)) / 2;
        double y0 = rectHeight / Math.sqrt(2) / 2;
        rectThree.addVertex(x0, y0);
        rectThree.addPolarEdge(rectWidth, -45);
        rectThree.addPolarEdge(rectHeight, 45);
        rectThree.addPolarEdge(rectWidth, 135);
        rectThree.addPolarEdge(rectHeight, 225);
        add(rectThree, starCenterX +   width * 1.5,localY - width * 1.7);

        rectFour = new GPolygon();
        rectFour.addVertex(x0, y0);
        rectFour.addPolarEdge(rectWidth, 45);
        rectFour.addPolarEdge(rectHeight, 135);
        rectFour.addPolarEdge(rectWidth, 225);
        rectFour.addPolarEdge(rectHeight, 315);
        add(rectFour, starCenterX +   width * 2.6, localY + width* 2.4);

        rectFive = new GPolygon();
        rectFive.addVertex(x0, y0);
        rectFive.addPolarEdge(rectWidth, -45);
        rectFive.addPolarEdge(rectHeight, -135);
        rectFive.addPolarEdge(rectWidth, -225);
        rectFive.addPolarEdge(rectHeight, -315);
        add(rectFive, starCenterX - width * 1.5, localY + width * 1.2);

        rectSix = new GPolygon();
        rectSix.addVertex(x0, y0);
        rectSix.addPolarEdge(rectWidth, 45);
        rectSix.addPolarEdge(rectHeight, -45);
        rectSix.addPolarEdge(rectWidth, -135);
        rectSix.addPolarEdge(rectHeight, -225);
        add(rectSix, starCenterX -   width * 2.6, localY - width * 2.6);

        snowFlakeDetailOne = new GPolygon();
        snowFlakeDetailOne.addVertex(x0, y0);
        snowFlakeDetailOne.addPolarEdge(rectWidth, 45);
        snowFlakeDetailOne.addPolarEdge(rectHeight * 0.7, 135);
        snowFlakeDetailOne.addPolarEdge(rectWidth, 225);
        snowFlakeDetailOne.addPolarEdge(rectHeight * 0.7, 315);
        snowFlakeDetailOne.addPolarEdge(rectWidth, -45);
        snowFlakeDetailOne.addPolarEdge(rectHeight * 0.8, 45);
        snowFlakeDetailOne.addPolarEdge(rectWidth, 135);
        snowFlakeDetailOne.addPolarEdge(rectHeight * 0.8, 225);
        add(snowFlakeDetailOne, rectOneX, rectOneY);

        snowFlakeDetailTwo = new GPolygon();
        snowFlakeDetailTwo.addVertex(x0, y0);
        snowFlakeDetailTwo.addPolarEdge(rectWidth, 45);
        snowFlakeDetailTwo.addPolarEdge(rectHeight * 0.7, 135);
        snowFlakeDetailTwo.addPolarEdge(rectWidth, 225);
        snowFlakeDetailTwo.addPolarEdge(rectHeight * 0.7, 315);
        snowFlakeDetailTwo.addPolarEdge(rectWidth, -45);
        snowFlakeDetailTwo.addPolarEdge(rectHeight * 0.8, 45);
        snowFlakeDetailTwo.addPolarEdge(rectWidth, 135);
        snowFlakeDetailTwo.addPolarEdge(rectHeight * 0.8, 225);
        add(snowFlakeDetailTwo, rectOneX, rectOneY + rectHeight * 0.5);

        snowFlakeDetailThree = new GPolygon();
        snowFlakeDetailThree.addVertex(x0, y0);
        snowFlakeDetailThree.addPolarEdge(rectWidth, 315);
        snowFlakeDetailThree.addPolarEdge(rectHeight * 0.7, 225);
        snowFlakeDetailThree.addPolarEdge(rectWidth, 135);
        snowFlakeDetailThree.addPolarEdge(rectHeight * 0.7, 45);
        snowFlakeDetailThree.addPolarEdge(rectWidth, 45);
        snowFlakeDetailThree.addPolarEdge(rectHeight * 0.8, -45);
        snowFlakeDetailThree.addPolarEdge(rectWidth, -135);
        snowFlakeDetailThree.addPolarEdge(rectHeight * 0.8, -225);
        add(snowFlakeDetailThree,  rectTwoX,  rectTwoY - rectHeight * 0.2);

        snowFlakeDetailFour = new GPolygon();
        snowFlakeDetailFour.addVertex(x0, y0);
        snowFlakeDetailFour.addPolarEdge(rectWidth, 315);
        snowFlakeDetailFour.addPolarEdge(rectHeight * 0.7, 225);
        snowFlakeDetailFour.addPolarEdge(rectWidth, 135);
        snowFlakeDetailFour.addPolarEdge(rectHeight * 0.7, 45);
        snowFlakeDetailFour.addPolarEdge(rectWidth, 45);
        snowFlakeDetailFour.addPolarEdge(rectHeight * 0.8, -45);
        snowFlakeDetailFour.addPolarEdge(rectWidth, -135);
        snowFlakeDetailFour.addPolarEdge(rectHeight * 0.8, -225);
        add(snowFlakeDetailFour,  rectTwoX,  rectTwoY + rectHeight * 0.3 );

        snowFlakeDetailFive = new GPolygon();
        snowFlakeDetailFive.addVertex(x0, y0);
        snowFlakeDetailFive.addPolarEdge(rectWidth, 0);
        snowFlakeDetailFive.addPolarEdge(rectHeight * 0.7, 90);
        snowFlakeDetailFive.addPolarEdge(rectWidth, 180);
        snowFlakeDetailFive.addPolarEdge(rectHeight * 0.7, 270);
        snowFlakeDetailFive.addPolarEdge(rectWidth, 270);
        snowFlakeDetailFive.addPolarEdge(rectHeight * 0.8, 360);
        snowFlakeDetailFive.addPolarEdge(rectWidth, 450);
        snowFlakeDetailFive.addPolarEdge(rectHeight * 0.8, 540);
        add(snowFlakeDetailFive, starCenterX +   width * 1.6,localY - width * 1.8);

        snowFlakeDetailSix = new GPolygon();
        snowFlakeDetailSix.addVertex(x0, y0);
        snowFlakeDetailSix.addPolarEdge(rectWidth, 0);
        snowFlakeDetailSix.addPolarEdge(rectHeight * 0.7, 90);
        snowFlakeDetailSix.addPolarEdge(rectWidth, 180);
        snowFlakeDetailSix.addPolarEdge(rectHeight * 0.7, 270);
        snowFlakeDetailSix.addPolarEdge(rectWidth, 270);
        snowFlakeDetailSix.addPolarEdge(rectHeight * 0.8, 360);
        snowFlakeDetailSix.addPolarEdge(rectWidth, 450);
        snowFlakeDetailSix.addPolarEdge(rectHeight * 0.8, 540);
        add(snowFlakeDetailSix, starCenterX +   width * 2.1,localY - width *2.4);

        snowFlakeDetailSeven = new GPolygon();
        snowFlakeDetailSeven.addVertex(x0, y0);
        snowFlakeDetailSeven.addPolarEdge(rectWidth, 0);
        snowFlakeDetailSeven.addPolarEdge(rectHeight * 0.7, -90);
        snowFlakeDetailSeven.addPolarEdge(rectWidth, -180);
        snowFlakeDetailSeven.addPolarEdge(rectHeight *0.7, -270);
        snowFlakeDetailSeven.addPolarEdge(rectWidth, -270);
        snowFlakeDetailSeven.addPolarEdge(rectHeight *0.8, -360);
        snowFlakeDetailSeven.addPolarEdge(rectWidth, -450);
        snowFlakeDetailSeven.addPolarEdge(rectHeight *0.8, -540);
        add(snowFlakeDetailSeven, starCenterX +   width * 2.2, localY + width* 2.1);

        snowFlakeDetailEight = new GPolygon();
        snowFlakeDetailEight.addVertex(x0, y0);
        snowFlakeDetailEight.addPolarEdge(rectWidth, 0);
        snowFlakeDetailEight.addPolarEdge(rectHeight * 0.7, -90);
        snowFlakeDetailEight.addPolarEdge(rectWidth, -180);
        snowFlakeDetailEight.addPolarEdge(rectHeight *0.7, -270);
        snowFlakeDetailEight.addPolarEdge(rectWidth, -270);
        snowFlakeDetailEight.addPolarEdge(rectHeight *0.8, -360);
        snowFlakeDetailEight.addPolarEdge(rectWidth, -450);
        snowFlakeDetailEight.addPolarEdge(rectHeight *0.8, -540);
        add(snowFlakeDetailEight, starCenterX +   width * 1.7, localY + width* 1.5);

        snowFlakeDetailNine = new GPolygon();
        snowFlakeDetailNine.addVertex(x0, y0);
        snowFlakeDetailNine.addPolarEdge(rectWidth, 0);
        snowFlakeDetailNine.addPolarEdge(rectHeight * 0.7, -90);
        snowFlakeDetailNine.addPolarEdge(rectWidth, -180);
        snowFlakeDetailNine.addPolarEdge(rectHeight *0.7, -270);
        snowFlakeDetailNine.addPolarEdge(rectWidth, -270);
        snowFlakeDetailNine.addPolarEdge(rectHeight * 0.8, -180);
        snowFlakeDetailNine.addPolarEdge(rectWidth, -90);
        snowFlakeDetailNine.addPolarEdge(rectHeight * 0.8, 0);
        add(snowFlakeDetailNine, starCenterX - width * 1.6, localY + width * 1.5);

        snowFlakeDetailTen = new GPolygon();
        snowFlakeDetailTen.addVertex(x0, y0);
        snowFlakeDetailTen.addPolarEdge(rectWidth, 0);
        snowFlakeDetailTen.addPolarEdge(rectHeight * 0.7, -90);
        snowFlakeDetailTen.addPolarEdge(rectWidth, -180);
        snowFlakeDetailTen.addPolarEdge(rectHeight *0.7, -270);
        snowFlakeDetailTen.addPolarEdge(rectWidth, -270);
        snowFlakeDetailTen.addPolarEdge(rectHeight * 0.8, -180);
        snowFlakeDetailTen.addPolarEdge(rectWidth, -90);
        snowFlakeDetailTen.addPolarEdge(rectHeight * 0.8, 0);
        add(snowFlakeDetailTen, starCenterX - width * 2.2, localY + width * 2.1);

        snowFlakeDetailEleven = new GPolygon();
        snowFlakeDetailEleven.addVertex(x0, y0);
        snowFlakeDetailEleven.addPolarEdge(rectWidth, 0);
        snowFlakeDetailEleven.addPolarEdge(rectHeight * 0.7, 90);
        snowFlakeDetailEleven.addPolarEdge(rectWidth, 180);
        snowFlakeDetailEleven.addPolarEdge(rectHeight *0.7, 270);
        snowFlakeDetailEleven.addPolarEdge(rectWidth, 270);
        snowFlakeDetailEleven.addPolarEdge(rectHeight * 0.8, 180);
        snowFlakeDetailEleven.addPolarEdge(rectWidth, 90);
        snowFlakeDetailEleven.addPolarEdge(rectHeight * 0.8, 0);
        add(snowFlakeDetailEleven, starCenterX -   width * 2.2, localY - width * 2.4);

        snowFlakeDetailTwelve = new GPolygon();
        snowFlakeDetailTwelve.addVertex(x0, y0);
        snowFlakeDetailTwelve.addPolarEdge( rectWidth, 0);
        snowFlakeDetailTwelve.addPolarEdge(rectHeight * 0.7, 90);
        snowFlakeDetailTwelve.addPolarEdge(rectWidth, 180);
        snowFlakeDetailTwelve.addPolarEdge(rectHeight *0.7, 270);
        snowFlakeDetailTwelve.addPolarEdge(rectWidth, 270);
        snowFlakeDetailTwelve.addPolarEdge(rectHeight * 0.8, 180);
        snowFlakeDetailTwelve.addPolarEdge(rectWidth, 90);
        snowFlakeDetailTwelve.addPolarEdge(rectHeight * 0.8, 0);
        add(snowFlakeDetailTwelve, starCenterX -   width * 1.6, localY - width * 1.8);
    }

    @Override
    public void setFilled(boolean b) {
        Color myColor = innerStar.getColor();
        innerStar.setFilled(b);
        innerStar.setFillColor(myColor);
        lineOne.setColor(myColor);
        lineOneTwo.setColor(myColor);
        lineOneThree.setColor(myColor);
        lineTwo.setColor(myColor);
        lineTwoOne.setColor(myColor);
        lineTwoTwo.setColor(myColor);
        lineThree.setColor(myColor);
        lineThreeOne.setColor(myColor);
        lineThreeTwo.setColor(myColor);
        lineFour.setColor(myColor);
        lineFourOne.setColor(myColor);
        lineFourTwo.setColor(myColor);
        lineFive.setColor(myColor);
        lineFiveOne.setColor(myColor);
        lineFiveTwo.setColor(myColor);
        lineSix.setColor(myColor);
        lineSixOne.setColor(myColor);
        lineSixTwo.setColor(myColor);
        rectOne.setFilled(b);
        rectOne.setFillColor(myColor);
        rectTwo.setFilled(b);
        rectTwo.setFillColor(myColor);
        rectThree.setFilled(b);
        rectThree.setFillColor(myColor);
        rectFour.setFilled(b);
        rectFour.setFillColor(myColor);
        rectFive.setFilled(b);
        rectFive.setFillColor(myColor);
        rectSix.setFilled(b);
        rectSix.setFillColor(myColor);
        snowFlakeDetailOne.setFilled(b);
        snowFlakeDetailOne.setFillColor(myColor);
        snowFlakeDetailTwo.setFilled(b);
        snowFlakeDetailTwo.setFillColor(myColor);
        snowFlakeDetailThree.setFilled(b);
        snowFlakeDetailThree.setFillColor(myColor);
        snowFlakeDetailFour.setFilled(b);
        snowFlakeDetailFour.setFillColor(myColor);
        snowFlakeDetailFive.setFilled(b);
        snowFlakeDetailFive.setFillColor(myColor);
        snowFlakeDetailSix.setFilled(b);
        snowFlakeDetailSix.setFillColor(myColor);
        snowFlakeDetailSeven.setFilled(b);
        snowFlakeDetailSeven.setFillColor(myColor);
        snowFlakeDetailEight.setFilled(b);
        snowFlakeDetailEight.setFillColor(myColor);
        snowFlakeDetailNine.setFilled(b);
        snowFlakeDetailNine.setFillColor(myColor);
        snowFlakeDetailTen.setFilled(b);
        snowFlakeDetailTen.setFillColor(myColor);
        snowFlakeDetailEleven.setFilled(b);
        snowFlakeDetailEleven.setFillColor(myColor);
        snowFlakeDetailTwelve.setFilled(true);
        snowFlakeDetailTwelve.setFillColor(myColor);
    }

    @Override
    public boolean isFilled() {
        return innerStar.isFilled();
    }

    @Override
    public void setFillColor(Color color) {
        innerStar.setFillColor(color);
        lineOne.setColor(color);
        lineOneTwo.setColor(color);
        lineOneThree.setColor(color);
        lineTwo.setColor(color);
        lineTwoOne.setColor(color);
        lineTwoTwo.setColor(color);
        lineThree.setColor(color);
        lineThreeOne.setColor(color);
        lineThreeTwo.setColor(color);
        lineFour.setColor(color);
        lineFourOne.setColor(color);
        lineFourTwo.setColor(color);
        lineFive.setColor(color);
        lineFiveOne.setColor(color);
        lineFiveTwo.setColor(color);
        lineSix.setColor(color);
        lineSixOne.setColor(color);
        lineSixTwo.setColor(color);
        rectOne.setFillColor(color);
        rectTwo.setFillColor(color);
        rectThree.setFillColor(color);
        rectFour.setFillColor(color);
        rectFive.setFillColor(color);
        rectSix.setFillColor(color);
        snowFlakeDetailOne.setFillColor(color);
        snowFlakeDetailTwo.setFillColor(color);
        snowFlakeDetailThree.setFillColor(color);
        snowFlakeDetailFour.setFillColor(color);
        snowFlakeDetailFive.setFillColor(color);
        snowFlakeDetailSix.setFillColor(color);
        snowFlakeDetailSeven.setFillColor(color);
        snowFlakeDetailEight.setFillColor(color);
        snowFlakeDetailNine.setFillColor(color);
        snowFlakeDetailTen.setFillColor(color);
        snowFlakeDetailEleven.setFillColor(color);
        snowFlakeDetailTwelve.setFillColor(color);
        fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor == null ? this.getColor() : this.fillColor;
    }

    private TwelvePointStar innerStar;

    private GLine lineOne;
    private GLine lineOneTwo;
    private GLine lineOneThree;
    private GLine lineTwo;
    private GLine lineTwoOne;
    private GLine lineTwoTwo;
    private GLine lineThree;
    private GLine lineThreeOne;
    private GLine lineThreeTwo;
    private GLine lineFour;
    private GLine lineFourOne;
    private GLine lineFourTwo;
    private GLine lineFive;
    private GLine lineFiveOne;
    private GLine lineFiveTwo;
    private GLine lineSix;
    private GLine lineSixOne;
    private  GLine lineSixTwo;

    private GRect rectOne;
    private GRect rectTwo;
    private GPolygon rectThree;
    private GPolygon rectFour;
    private GPolygon rectFive;
    private GPolygon rectSix;

    private GPolygon snowFlakeDetailOne;
    private GPolygon snowFlakeDetailTwo;
    private GPolygon snowFlakeDetailThree;
    private GPolygon snowFlakeDetailFour;
    private GPolygon snowFlakeDetailFive;
    private GPolygon snowFlakeDetailSix;
    private GPolygon snowFlakeDetailSeven;
    private GPolygon snowFlakeDetailEight;
    private GPolygon snowFlakeDetailNine;
    private GPolygon snowFlakeDetailTen;
    private GPolygon snowFlakeDetailEleven;
    private GPolygon snowFlakeDetailTwelve;

    private Color fillColor;
}
