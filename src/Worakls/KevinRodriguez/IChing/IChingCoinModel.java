package Worakls.KevinRodriguez.IChing;

import acm.graphics.GImage;

public interface IChingCoinModel {

    GImage create();
    int getDistance();
    IChingCoinTypes getCoinType();
    String getCoinName();
}
