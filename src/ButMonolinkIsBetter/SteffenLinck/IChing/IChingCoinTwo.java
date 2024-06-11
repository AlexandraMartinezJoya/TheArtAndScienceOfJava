package ButMonolinkIsBetter.SteffenLinck.IChing;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class IChingCoinTwo extends GraphicsProgram implements IChingCoinModel {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    public IChingCoinTypes coinType;
    private String coinName;
    private int count = 1;

    public GImage create() {
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
            coinType =  IChingCoinTypes.COIN_DIFFERENT_HEADS;
            return new GImage("Shell.jpg");
        }
        else{
            coinType = IChingCoinTypes.COIN_DIFFERENT_TAILS;
            return new GImage("ShellReversed.jpg");
        }

    }

    public int getDistance() {
        return rgen.nextInt(0, 32);
    }
    public IChingCoinTypes getCoinType(){return coinType;}
    public String getCoinName() {return coinName;}
}
