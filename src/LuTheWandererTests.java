import IChingClasses.LuTheWanderer;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class LuTheWandererTests extends ConsoleProgram {

    public void run() {
        LuTheWanderer luTheWanderer = new LuTheWanderer();
        String hasSameImage = hasSameImage(luTheWanderer);
        println(hasSameImage);
    }

    public String hasSameImage(LuTheWanderer luTheWanderer) {
        String hasTheSameImage = "Lu the wanderer has the same image";
        String doesNotHaveTheSameImage = "Lu the wanderer does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/56.LuTheWanderer.jpg");
        if(expectedImage.equals(luTheWanderer.getIChingImage())) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(LuTheWanderer luTheWanderer) {
        String hasTheSameImagePath = "Lu the Wanderer has the same image path";
        String doesNotHaveTheSameImagePath = "Lu the Wanderer has the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/56.LuTheWanderer.jpg";
        if(luTheWanderer.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElements(LuTheWanderer luTheWanderer) {
        String hasTheSameElement = "Lu the Wanderer has the same element " + luTheWanderer.getElementName();
        String doesNotHaveTheSameElement = "Lu the wanderer does not have the same element";
        String expectedElement = "Fire, Mountain";
        if(luTheWanderer.getElementName().equals(expectedElement)){
            return hasTheSameElement;
        } else {
            return doesNotHaveTheSameElement;
        }
    }

    public String hasTheSameQualities(LuTheWanderer luTheWanderer) {
        String hasTheSameQualities = "Lu the wanderer has the same qualities " + luTheWanderer.getElementQualities();
        String doesNotHaveTheSameQualities = "Lu the wanderer does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Traveling" );
        expectedQualities.put("2", "Unsettled");
        expectedQualities.put("3", "Tentative");
        expectedQualities.put("4", "Uncertain");
        expectedQualities.put("5", "In transition");
        expectedQualities.put("6", "Exploring");
        expectedQualities.put("7", "Trying new experiences");
        if(expectedQualities.equals(luTheWanderer.getElementQualities())){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(LuTheWanderer luTheWanderer) {
        String hasTheSameDivination = "Lu the wanderer has the same divination with the keywords "+ luTheWanderer.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Lu the wanderer does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Lu - The Wanderer");
        expectedDivination.put("Keywords","Traveling, Unsettled, Tentative,  Uncertain, In transition, Exploring, Trying new experiences");
        expectedDivination.put("The Judgement","The wanderer, In small matters, success. Perseverance brings good fortune");
        expectedDivination.put("Judgement Description","You are in a period of transition. Things are not yet certain, and it is not yet clear how you fit into them or what your identity is supposed to be. The text compares your situation to that of a wanderer who is traveling through a strange land. The wanderer is a sojourner - he does not expect to stay long, but he is not quite sure where he is going next. He knows very few people. He is not exactly sure what the local customs are or whom he can trust. He does not completely understand what is expected of him. Because his situation is uncertain, he is circumspect and cautious. He does not call attention to himself nor does he get involved in matters that do not concern him. He associates only with reliable and trustworthy people and does not get involved in anything underhanded or unscrupulous, much less anything that would get him in trouble with the local authorities. Instead, he tries to learn as much as he can from his new souroundings, and in this way he learns something about himself. Apply these principles to your own life. You are on a journey whose destination is not yet determined. This is not a time to make definite commitments. Instead it is a time to explore. You need to gather new information , gain new perspectives, experiment with new ways of living, and meet new people. Don't be afraid to try something different. You won't know what the right path is until you try a number of different possibilities. Be flexible and adaptable and willing to learn. However, precicely because you don't know yet where you are going, you must also be politic and discret. When you find yourself in new situations with new people. be respectful but also reserved. It will take time to know whom you can really trust. Try to associate with good people and make friends with those you respect. This will help keep you out of harm's way and ensure that you get the most out of your new experiences. Relish the uncertainty of this time. You have a wonderful opportunity now to expand your horizons and make important connections. You may well encounter new people and new experiences that will change your life. But don't do anything that is beneath you and don't compromise your integrity just to fit in or to get others to like you. Instead, just be yourself. If you behave with courtesy and discretion, you will attract the right sort of people. A sincere and friendly approach will meet with a natural and positive response, no matter where you are. When people go out of their way to help you, make usre that you let them know that you appreciate their generosity, and then do your best to help them in return. In this way you will begin to form bonds of reciprocity that will help you through this period of transition.");
        expectedDivination.put("The Image","Fire on the mountain. This is the image of the wanderer, thus the superior person is clear-minded and cautious in imposing penalties and protracts no lawsuits");
        if(luTheWanderer.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(LuTheWanderer luTheWanderer) {
        String hasTheSameNumber = "Lu the wanderer has the same number "+ luTheWanderer.getNumber();
        String doesNotHaveTheSameNumber = "Lu the wanderer does not have the same number";
        int expectedNumber = 56;
        if(luTheWanderer.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
