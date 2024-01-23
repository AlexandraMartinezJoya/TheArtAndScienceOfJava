import IChingClasses.*;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.lang.Math;

public class IChing extends GraphicsProgram {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    int coinOneDistance;
    int coinTwoDistance;
    int coinThreeDistance;
    int coinFourDistance;
    int coinFiveDistance;
    int coinSixDistance;
    IChingCoinTypes coinOneType;
    IChingCoinTypes coinTwoType;
    IChingCoinTypes coinThreeType;
    IChingCoinTypes coinFourType;
    IChingCoinTypes coinFiveType;
    IChingCoinTypes coinSixType;
    String coinOneName;
    String coinTwoName;
    String coinThreeName;
    String coinFourName;
    String coinFiveName;
    String coinSixName;


    public void run(){
        GImage minScreenSizeImage = new GImage("IChingImages/MinScreenSize/MinScreenSize375x667SamsungSEBorders.png");
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();
        this.resize(390, 730);

        AbstractCoinFactory coinFactory = new AbstractCoinFactory();
        coinFactory.generateRandomCoin();
        coinFactory.generateRandomDifferentCoin();
        GImage coinOne = coinFactory.coin.create();
        coinOneDistance = coinFactory.coin.getDistance();
        coinOneType = coinFactory.coin.getCoinType();
        coinOneName = coinFactory.coin.getCoinName();
        add(coinOne, 50, 50);
        pause(800);
        removeAll();
        println("Coin one distance: " + coinOneDistance);
        println("Coin one name: " + coinOneName);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        GImage coinTwo = coinFactory.coin.create();
        coinTwoDistance = coinFactory.coin.getDistance();
        coinTwoName = coinFactory.coin.getCoinName();
        coinTwoType = coinFactory.coin.getCoinType();
        add(coinTwo, 50, 50);
        pause(800);
        removeAll();
        println("Coin two distance: " + coinTwoDistance);
        println("Coin two name: " + coinTwoName);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        GImage coinThree = coinFactory.coin.create();
        coinThreeType = coinFactory.coin.getCoinType();
        coinThreeName = coinFactory.coin.getCoinName();
        coinThreeDistance = coinFactory.coin.getDistance();
        add(coinThree, 50, 50);
        pause(800);
        removeAll();
        println("Coin three distance: " + coinThreeDistance);
        println("Coin three name: " + coinThreeName);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        GImage coinFour = coinFactory.coin.create();
        coinFourDistance = coinFactory.coin.getDistance();
        coinFourName = coinFactory.coin.getCoinName();
        coinFourType = coinFactory.coin.getCoinType();
        add(coinFour, 50, 50);
        pause(800);
        removeAll();
        println("Coin four distance: " + coinFourDistance);
        println("Coin four name: " + coinFourName);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        GImage coinFive = coinFactory.coin.create();
        coinFiveDistance = coinFactory.coin.getDistance();
        coinFiveName = coinFactory.coin.getCoinName();
        coinFiveType = coinFactory.coin.getCoinType();
        add(coinFive, 50, 50);
        pause(800);
        removeAll();
        println("Coin Five distance: " + coinFiveDistance);
        println("Coin Five name: " + coinFiveName);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        GImage coinSix = coinFactory.coin.create();
        coinSixDistance = coinFactory.coin.getDistance();
        coinSixName = coinFactory.coin.getCoinName();
        coinSixType = coinFactory.coin.getCoinType();
        add(coinSix, 50, 50);
        pause(800);
        removeAll();
        println("Coin Six distance: " + coinSixDistance);
        println("Coin Six name: " + coinSixName);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        GImage coinDifferent = coinFactory.coinDifferent.create();
        IChingCoinTypes coinDifferentType = coinFactory.coinDifferent.getCoinType();
        int distanceCoinDifferent = coinFactory.coinDifferent.getDistance();
        add(coinDifferent, 50, 50);
        pause(800);
        removeAll();
        println("Coin Different: " + distanceCoinDifferent);
        add(minScreenSizeImage);
        minScreenSizeImage.sendBackward();

        int closestDistance = getClosestDistanceToCoinDifferent(coinOneDistance, coinTwoDistance, coinThreeDistance, coinFourDistance, coinFiveDistance, coinSixDistance, distanceCoinDifferent);
        String changingLine = "";
        if ((closestDistance + distanceCoinDifferent) == coinOneDistance) {
            changingLine = "CoinOne";
        } else if ((closestDistance + distanceCoinDifferent) == coinTwoDistance) {
             changingLine = "CoinTwo";
        } else if ((closestDistance + distanceCoinDifferent) == coinThreeDistance) {
            changingLine = "CoinThree";
        } else if ((closestDistance + distanceCoinDifferent) == coinFourDistance) {
            changingLine = "CoinFour";
        } else if ((closestDistance + distanceCoinDifferent) == coinFiveDistance) {
            changingLine = "CoinFive";
        } else {
            changingLine = "CoinSix";
        }
        println("The changing line is :" + changingLine);

        String lineOne = extractedType(coinOneType);
        String lineTwo = extractedType(coinTwoType);
        String lineThree = extractedType(coinThreeType);
        String lineFour = extractedType(coinFourType);
        String lineFive = extractedType(coinFiveType);
        String lineSix = extractedType(coinSixType);
        String lineDifferent = extractedDifferentType(coinDifferentType);

        println("First Diagram is: ");
        println("LineOne : "+ lineOne);
        println("LineTwo :" + lineTwo);
        println("LineThree: " + lineThree);
        println("LineFour: " + lineFour);
        println("LineFive: " + lineFive);
        println("LineSix: " + lineSix);
        println("TheDifferentLine: "+ lineDifferent);

        if(changingLine.equals(coinOneName)) {
            if(lineOne.equals("StraightLine")) {
                lineOne = "BrokenLine";
            } else {
                lineOne = "StraightLine";
            }
        }
        if(changingLine.equals(coinTwoName)) {
            if(lineTwo.equals("StraightLine")) {
                lineTwo = "BrokenLine";
            } else {
                lineTwo = "StraightLine";
            }
        }
        if(changingLine.equals(coinThreeName)) {
            if(lineThree.equals("StraightLine")){
                lineThree = "BrokenLine";
            } else {
                lineThree = "StraightLine";
            }
        }
        if(changingLine.equals(coinFourName)) {
            if(lineThree.equals("StraightLine")){
                lineFour = "BrokenLine";
            } else {
                lineFour = "StraightLine";
            }
        }
        if(changingLine.equals(coinFiveName)) {
            if(lineFive.equals("StraightLine")) {
                lineFive = "BrokenLine";
            } else {
                lineFive = "StraightLine";
            }
        }
        if(changingLine.equals(coinSixName)) {
            if(lineSix.equals("StraightLine")) {
                lineSix = "BrokenLine";
            } else {
                lineSix = "StraightLine";
            }
        }

        println("Changes to: ");
        println("LineOne : "+ lineOne);
        println("LineTwo :" + lineTwo);
        println("LineThree: " + lineThree);
        println("LineFour: " + lineFour);
        println("LineFive: " + lineFive);
        println("LineSix: " + lineSix);

        IChingStoneModel firstStone = new IChingStoneModel(lineOne, lineTwo, lineThree);
        IChingStoneModel secondStone = new IChingStoneModel(lineFour, lineFive, lineSix);
        GImage firstStoneImage = firstStone.getImage();
        GImage secondStoneImage = secondStone.getImage();
        firstStoneImage.setSize(80, 70);
        secondStoneImage.setSize(80, 70);
        add(firstStoneImage, getWidth()  /2.0 - firstStone.getWidth(), 10);
        add(secondStoneImage, getWidth()  /2.0 - secondStone.getWidth(), 10 + secondStoneImage.getHeight() );
        AbstractIChingStoneFactory stoneFactory =   new AbstractIChingStoneFactory();
        IChingStone thisStone = stoneFactory.createIChingStone(firstStone, secondStone);
        println(thisStone);
//        println("The DifferentLine: "+ lineDifferent);
//        removeAll();
//        Quian quian = new Quian();
//        println(quian.getDivination().get("Judgement Description"));
    }

    private String extractedType(IChingCoinTypes coinThreeType) {
        String lineThree = "";
        if(coinThreeType.toString().equals("HEADS")) {
              lineThree = "StraightLine";
        } else {
             lineThree = "BrokenLine";
        }
        return lineThree;
    }

    private String extractedDifferentType(IChingCoinTypes coinDifferentType) {
        String lineDifferent = "";
        if(coinDifferentType.toString().equals("HEADS")) {
            lineDifferent = "StraightLine";
        } else {
            lineDifferent = "BrokenLine";
        }
        return lineDifferent;
    }

    private int getClosestDistanceToCoinDifferent(int num1, int num2, int num3, int num4, int num5, int num6, int numDifferent){
        int closestValueToDifferent = 0;
        int secondClosest = 0;
        int closestValueBetweenOneAndTwo = 0;
        int closestValueBetweenThreeAndFour = 0;
        int closestValueBetweenFiveAndSix = 0;

        int differenceBetweenNumOneAndDifferent = changeNumToPositiveValue(num1 - numDifferent);
        int differenceBetweenNumTwoAndDifferent = changeNumToPositiveValue( num2 - numDifferent);
        int differenceBetweenNumThreeAndDifferent = changeNumToPositiveValue(num3 - numDifferent);
        int differenceBetweenNumFourAndDifferent = changeNumToPositiveValue(num4 - numDifferent);
        int differenceBetweenNumFiveAndDifferent = changeNumToPositiveValue(num5 - numDifferent);
        int differenceBetweenNumSixAndDifferent = changeNumToPositiveValue(num6 - numDifferent);

        println("Difference between one and different is: " + differenceBetweenNumOneAndDifferent);
        println("Difference between two and different is: " + differenceBetweenNumTwoAndDifferent);
        println("Difference between three and different is: " + differenceBetweenNumThreeAndDifferent);
        println("Difference between four and different is: " + differenceBetweenNumFourAndDifferent);
        println("Difference between five and different is: " + differenceBetweenNumFiveAndDifferent);
        println("Difference between six and different is: " + differenceBetweenNumSixAndDifferent);

        if(differenceBetweenNumOneAndDifferent <= differenceBetweenNumTwoAndDifferent){
            closestValueBetweenOneAndTwo = differenceBetweenNumOneAndDifferent;
        } else {
            closestValueBetweenOneAndTwo = differenceBetweenNumTwoAndDifferent;
        }

        if(differenceBetweenNumThreeAndDifferent <= differenceBetweenNumFourAndDifferent){
            closestValueBetweenFiveAndSix = differenceBetweenNumThreeAndDifferent;
        } else {
            closestValueBetweenFiveAndSix = differenceBetweenNumFourAndDifferent;
        }

        if(differenceBetweenNumFiveAndDifferent <= differenceBetweenNumSixAndDifferent){
            closestValueBetweenThreeAndFour = differenceBetweenNumFiveAndDifferent;
        } else {
            closestValueBetweenThreeAndFour = differenceBetweenNumSixAndDifferent;
        }

        println("Closest between one And Two difference: " + closestValueBetweenOneAndTwo);
        println("Closest between three And Four difference: " + closestValueBetweenThreeAndFour);
        println("Closest between Five And Six difference: " + closestValueBetweenFiveAndSix);

        if(closestValueBetweenOneAndTwo <= closestValueBetweenThreeAndFour) {
            secondClosest = closestValueBetweenOneAndTwo;
        } else {
            secondClosest = closestValueBetweenThreeAndFour;
        }

        if(secondClosest <= closestValueBetweenFiveAndSix) {
            closestValueToDifferent = secondClosest;
        } else {
            closestValueToDifferent = closestValueBetweenFiveAndSix;
        }

        println("Closest is: " + closestValueToDifferent);

        return closestValueToDifferent;
    }

    private int changeNumToPositiveValue( int differenceBetweenNumFiveAndDifferent) {
        if(differenceBetweenNumFiveAndDifferent < 0) {
            return Math.abs(differenceBetweenNumFiveAndDifferent);
        }
        else return differenceBetweenNumFiveAndDifferent;
    }
}
