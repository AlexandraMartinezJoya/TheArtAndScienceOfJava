package IChingTests;

import IChingClasses.Qian;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class QuianTests extends ConsoleProgram {

    GImage thisImage;

    public void run() {
        Qian quian = new Qian();
        GImage quianImage = quian.getIChingImage();
        isQuianImage(quianImage);
        String elementName = quian.getElementName();
        HashMap elementQualities = quian.getElementQualities();
        String familyMember = quian.getFamilyMember();
        HashMap bodyPart = quian.getBodyPart();
        String animals = quian.getRelatedAnimal();
        HashMap seasonAndWeather = quian.getSeasonAndWeather();
        HashMap divination = quian.getDivination();
    }

    public String isQuianImage(GImage quianImage) {
        String isSameImage = "This is the same image";
        String isNotSameImage = "This is not the same image";
        thisImage = new GImage("../IChingImages/UpToSixtyFour/1.Qian.jpg");
        if(thisImage.equals(quianImage)) {
            return isSameImage;
        } else {
            return isNotSameImage;
        }
    }
}
