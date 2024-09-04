package Worakls.KevinRodriguez.IChing;

import acm.util.RandomGenerator;

public class AbstractCoinFactory {

    public Worakls.KevinRodriguez.IChing.IChingCoinModel coin;
    public Worakls.KevinRodriguez.IChing.IChingCoinModel coinDifferent;
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public Worakls.KevinRodriguez.IChing.IChingCoinModel generateRandomCoin() {
        int number = rgen.nextInt(1, 6);
        switch (number) {
            case 1 -> coin = new Worakls.KevinRodriguez.IChing.IChingCoinOne();
            case 2 -> coin = new Worakls.KevinRodriguez.IChing.IChingCoinOne();
            case 3 -> coin = new Worakls.KevinRodriguez.IChing.IChingCoinOne();
            case 4 -> coin = new Worakls.KevinRodriguez.IChing.IChingCoinOne();
            case 5 -> coin = new Worakls.KevinRodriguez.IChing.IChingCoinOne();
            case 6 -> coin = new IChingCoinOne();
            default -> rerollCoin();
        }
        return coin;
      }

      public Worakls.KevinRodriguez.IChing.IChingCoinModel generateRandomDifferentCoin() {
        int number = rgen.nextInt(1, 3);
          switch (number) {
              case 1 -> coinDifferent = new Worakls.KevinRodriguez.IChing.IChingCoinTwo();
              case 2 -> coinDifferent = new Worakls.KevinRodriguez.IChing.IChingCoinTwo();
              case 3 -> coinDifferent = new IChingCoinTwo();
              default -> rerollCoinDifferent();
          }
        return coinDifferent;
      }

      private Worakls.KevinRodriguez.IChing.IChingCoinModel rerollCoin(){
        coin = generateRandomCoin();
        return coin;
      }

      private IChingCoinModel rerollCoinDifferent(){
        coinDifferent = generateRandomDifferentCoin();
        return coinDifferent;
      }

}
