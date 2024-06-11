package WoraklsSoGood.KevinRodriguez.IChing;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class IChingCoinOne extends GraphicsProgram implements IChingCoinModel {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private int distance;
    private IChingCoinTypes coinType;
    private String coinName;
    private int count = 1;

    public GImage create() {
        setDistance();
        switch(count) {
            case 1: coinName = "CoinOne"; break;
            case 2: coinName = "CoinTwo"; break;
            case 3: coinName = "CoinThree"; break;
            case 4: coinName = "CoinFour"; break;
            case 5: coinName = "CoinFive"; break;
            case 6: coinName = "CoinSix"; break;
        }
        count++;
        int number = rgen.nextInt(0, 1);
        if(number == 1) {
            coinType = IChingCoinTypes.HEADS;
            return new GImage("CoinFaceOne.png");
        }
       else{
            coinType = IChingCoinTypes.TAILS;
            return new GImage("CoinReverseOne.png");
       }

    }

    public int setDistance() {
        distance = rgen.nextInt(0, 32);
        return distance;
    }

    public int getDistance(){
        return distance;
    }

    public IChingCoinTypes getCoinType(){
        return coinType;
    }
    public String getCoinName() {return coinName;}
}
