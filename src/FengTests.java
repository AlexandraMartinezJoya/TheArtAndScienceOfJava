import IChingClasses.Feng;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class FengTests extends ConsoleProgram {

    public void run() {
        Feng feng = new Feng();
        String hasSameImage = hasSameImage(feng);
        println(hasSameImage);
    }

    public String hasSameImage(Feng feng) {
        String hasSameImage = "Feng has the same image";
        String doesNotHaveTheSameImage = "Feng does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/55.Feng.jpg");
        if(feng.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Feng feng) {
        String hasTheSameImagePath = "Feng has the same image path";
        String doesNotHaveTheSameImagePath = "Feng does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/54.GuiMei.jpg";
        if(feng.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(Feng feng) {
        String hasTheSameElement = "Feng has the same elements and it is " + feng.getElementName();
        String doesNotHaveTheSameElement = "Feng does not have the same element name";
        String expectedElementName = "Thunder, Fire";
        if(feng.getElementName().equals(expectedElementName)){
            return hasTheSameElement;
        } else {
            return doesNotHaveTheSameElement;
        }
    }

    public String hasSameElementQualities (Feng feng) {
        String hasTheSameQualities = "Feng has the same qualities";
        String doesNotHaveTheSameQualities = "Feng does not have the same qualities " + feng.getElementQualities();
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Abundance" );
        expectedQualities.put("2", "Zenith");
        expectedQualities.put("3", "Fullness");
        expectedQualities.put("4", "Splendor");
        expectedQualities.put("5", "Plenty");
        expectedQualities.put("6", "Being generous");
        expectedQualities.put("7", "Acting decisively");
        expectedQualities.put("8", "Living in the present");
        expectedQualities.put("9", "Making the most of the good times");
        if(feng.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination( Feng feng) {
        String hasTheSameDivination = "Feng has the same divination with the keywords " + feng.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Feng does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Feng - Abundance");
        expectedDivination.put("Keywords","Zenith, Fullness, Splendor, Plenty, Being generous, Acting decisively, living in the present, Making the most of the good times");
        expectedDivination.put("The Judgement","Abundance. Success. The king approaches. Do not be sad. Be like the sun at midday.");
        expectedDivination.put("Judgement Description","The sun at noon will surely descend just as it has ascended. But in the meantime it shines brightly, bestowing warmth and radiance on everything beneath it. In the same way, you now face a moment of rare brilliance and abundance. Everything is now possible. Relationships will flourish. Your ambitions can be achieved. Make the most of this time. Do not worry that things will not always be this perfect. That will only cause you to freeze up. If you mourn what has not yet happened, you will waste your opportunity to do good in the present. Therefore , the text advices you to be like the sun at midday - joyous, powerful, energetic, and happy. Size up the problems before you. Weigh the circumstances objectively. Then go out and take care of business. Success is assured. It is your time to shine. How can you make the good times last as long as possible? The answer, once again, is to take your cue from the sun. The sun is the very symbol of optimism and generosity: it does not try to keep its warmth and energy for itself. It spreads its light throughout the heavens, bringing clarity to everything beneath it. It does not worry that it will burn out someday. Rather, it gives freely, and then it gives some more, and in the way all life on earth is preserved and perpetuated. Like the sun, do what you can to illuminate the world and make your fellow creatures warm and happy. If you want to perpetuate t he good times, share your bounty with others. Do not worry about gain or loss, or about if you will have enough in the future. If you try and hog the benefits to yourself, you will cut yourself off from others. People will envy you and refuse to cooperate with you. If you become fearful and obsessed that people are trying to take things from you, you will drain your energies and squander your opportunities. As a result, the good times will pass all the more quickly, and no one will be there to help you on your downward slide. On the other hand, if you share your good fortune with others, they will rejoice in your success and work with you to keep things moving forward. And you in turn will be renewed and stimulated by their goodwill and cooperation. Be optimistic and you will feel better about yourself and your life. Be magnanimous and you will be enriched in countless ways through the gratitude, affection, and support of others. As paradoxical as it seems, the more you give to others, the more will be given to you in return. The less you worry about the transistors of the time of abundance, the longer it will remain with you and those you care for.");
        expectedDivination.put("The Image","Thunder and lightning culminate as one, This is the image of abundance, thus the superior person judges cases, and carries out punishments.");
        if(feng.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber (Feng feng){
        String hasTheSameNumber = "Feng has the same number and it is " + feng.getNumber();
        String doesNotHaveTheSameNumber = "feng does not have the same number";
        int expectedNumber = 55;
        if(feng.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
