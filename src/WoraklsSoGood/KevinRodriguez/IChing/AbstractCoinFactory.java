package WoraklsSoGood.KevinRodriguez.IChing;

import acm.util.RandomGenerator;

public class AbstractCoinFactory {

    public IChingCoinModel coin;
    public IChingCoinModel coinDifferent;
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public IChingCoinModel generateRandomCoin() {
        int number = rgen.nextInt(1, 6);
        switch (number) {
            case 1 -> coin = new IChingCoinOne();
            case 2 -> coin = new IChingCoinOne();
            case 3 -> coin = new IChingCoinOne();
            case 4 -> coin = new IChingCoinOne();
            case 5 -> coin = new IChingCoinOne();
            case 6 -> coin = new IChingCoinOne();
            default -> rerollCoin();
        }
        return coin;
      }

      public IChingCoinModel generateRandomDifferentCoin() {
        int number = rgen.nextInt(1, 3);
          switch (number) {
              case 1 -> coinDifferent = new IChingCoinTwo();
              case 2 -> coinDifferent = new IChingCoinTwo();
              case 3 -> coinDifferent = new IChingCoinTwo();
              default -> rerollCoinDifferent();
          }
        return coinDifferent;
      }

      private IChingCoinModel rerollCoin(){
        coin = generateRandomCoin();
        return coin;
      }

      private IChingCoinModel rerollCoinDifferent(){
        coinDifferent = generateRandomDifferentCoin();
        return coinDifferent;
      }

}
