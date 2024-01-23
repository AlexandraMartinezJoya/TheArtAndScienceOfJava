package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public interface IChingLineNames {

    GImage getIChingImage();
    String getElementName();
    HashMap getElementQualities();
    String getFamilyMember();
    HashMap getBodyPart();
    //This probably can relate to chineese zodiac
    String getRelatedAnimal();
    HashMap getSeasonAndWeather();
    HashMap getDivination();
    int getNumber();
}
