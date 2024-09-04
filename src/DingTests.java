import IChingClasses.DingTheCaldron;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class DingTests extends ConsoleProgram {

    public void run() {
        DingTheCaldron ding = new DingTheCaldron();
        String hasSameImage = hasSameImage(ding);
        println(hasSameImage);
    }

    public String hasSameImage(DingTheCaldron ding){
        String hasSameImage = "Ding has the same image as expected";
        String doesNotHaveSameImage = "Ding does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/50.DingTheCaldron.jpg");
        if(ding.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(DingTheCaldron ding) {
        String hasTheSameImagePath = "Ding has the same image path";
        String doesNotHaveTheSameImagePath = "Ding does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/50.DingTheCaldron.jpg";
        if(ding.getImagePath() == expectedImagePath) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName (DingTheCaldron ding) {
        String hasTheSameElementName = "Ding has the same element name and is " + ding.getElementName();
        String doesNotHaveTheSameElementName = "Ding does not have the same element name";
        String expectedElementName = "Fire, Wind, wood";
        if(ding.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameElementQualities (DingTheCaldron ding) {
        String hasTheSameElementQualities = "Ding has the same element qualities and are: " + ding.getElementQualities();
        String doesNotHaveTheSameElementQualities = "Ding does not have the same qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1", "Cultural renewal" );
        expectedElementQualities.put("2", "In with the new");
        expectedElementQualities.put("3", "Establishing things");
        expectedElementQualities.put("4", "Formation in a new order");
        expectedElementQualities.put("5", "Devotion");
        expectedElementQualities.put("6", "Creation of new rituals");
        expectedElementQualities.put("7", "Polishing your talents");
        expectedElementQualities.put("8", "Seeking spiritual values");
        expectedElementQualities.put("9", "Being of service to others");
        if(expectedElementQualities.equals(ding.getElementQualities())) {
            return hasTheSameElementQualities;
        } else {
            return doesNotHaveTheSameElementQualities;
        }
    }

    public String hasTheSameDivination (DingTheCaldron ding) {
        String hasTheSameDivination = "Ding has the same element divination with the keywords: " + ding.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Ding does not have the same element divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Ding - The caldron");
        expectedDivination.put("Keywords", "The Caldron, Cultural renewal, In with the new, Establishing things, Formation in a new order, Devotion, creation of new rituals, polishing your talents, seeing spiritual values, being of service to others");
        expectedDivination.put("The Judgement", "The Caldron, Supreme good fortune, success.");
        expectedDivination.put("Judgement Description", "The Ding, or ritual caldron, formed part of a religious service in which sacrifices were made to a divinity. Through this ritual, people purified themselves and rededicated themselves to spiritual ends. The text urges you to model yourself after the Ding. It is time to purify your motives and devote yourself to worthy aims. The text promises success and supreme good fortune. But it is not necessarily worldly success. Indeed, it is time to abandon materialism and selfishness. You will make progress not from chasing after greater wealth or social status but from pursuing spiritual values such as kindness, generosity, and service to others. Different ingredients were mixed in the ritual caldron and then cooked together to fom a divine offering. In the same way, you must now gather the different ingredients of your world and combine them together to produce something worthwhile. That the raw materials of your life and transform them into something new and wonderful. These raw ingredients inclusde your talents. Keep your skills in good repair by employing them in the service of others. Don't waste your abilities on things that are trivial or unworthy of you. The raw materials of life also include opportunities in your environment. Look around you. There are hidden possibilities everywhere for you to deploy and improve your skills. You may fear that you lack the ability or the qualities of mind and heart necessary to succeed. Do not be concerned. You do have something to contribute to the situation, whether you know it or not. Within every person there lies a divine presence. It is up to you to discover it and develop your life. Ding teaches that you can transform yourself and your world if you do so not for selfish ends but in pursuit of something truly valuable. Quietly support others and help them to succeed. Assist other people without any desire to take credit for their success. Conduct yourself with modesty and devotion. Like the ritual caldron, you can be a source of inspiration to others. People will draw strength from you and follow your example.");
        expectedDivination.put("The Image", "Above wood there is fire, This is the image of the caldron, thus the superior person consolidates his fate by making his position correct");
        if(expectedDivination.equals(ding.getDivination())) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    String hasTheSameNumber (DingTheCaldron ding) {
        String hasTheSameNumber = "Ding has the same number and it is: " + ding.getNumber();
        String doesNotHaveTheSameNumber = "Ding does not have the same number";
        int expectedNumber = 50;
        if(ding.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
