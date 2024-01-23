package ButMonolinkIsBetter.SteffenLinck;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;



public class IChing extends GraphicsProgram {

    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        String coinsThrown = throwCoins();
        println(coinsThrown);
//        readFristCoinSet(coinsThrown);
//        readSecond();
//       CoinSet(coinsThrown);
//        readOddCoinSet(coinsThrown);
    }

    private String throwCoins(){
        int coinOne =  rgen.nextInt(1, 64);
        int coinTwo = rgen.nextInt(1, 64);
        int coinThree = rgen.nextInt(1, 64);
        String result =  ""+ coinOne + coinTwo + coinThree;
        return result;
    }


}
