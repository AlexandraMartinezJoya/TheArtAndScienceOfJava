package IChingTests;

import IChingClasses.Sun;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class SunTests extends ConsoleProgram {

    public void run() {
        Sun sun = new Sun();
        String hasSameImage = hasSameImage(sun);
        println(hasSameImage);
    }

    public String hasSameImage(Sun sun) {
        String hasSameImage = "Sun has the same image";
        String doesNotHaveTheSameImage = "Sun does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/41.Sun.jpg");
        if(sun.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Sun sun) {
        String hasSameImagePath = "Sun has the same image path";
        String doesNotHaveTheSameImagePath = "Sun does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/41.Sun.jpg";
        if(sun.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(Sun sun){
        String hasSameElementName = "Sun has the same element name " + sun.getElementName();
        String doesNotHaveTheSameElementName = "Sun does not have the same element name";
        String expectedElementName = "Mountain, Lake";
        if(sun.getElementName().equals(expectedElementName)) {
            return hasSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasSameQualities(Sun sun) {
        String hasSameQualities = "Sun has the same expected qualities " + sun.getElementQualities();
        String doesNotHaveTheSameQualities = "Sun does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Diminish" );
        expectedQualities.put("2", "Loss");
        expectedQualities.put("3", "Reduction");
        expectedQualities.put("4", "Scaling back");
        expectedQualities.put("5", "Avoiding excess");
        expectedQualities.put("6", "Challenging old beliefs");
        if(sun.getElementQualities().equals(expectedQualities)) {
            return hasSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination(Sun sun) {
        String hasSameDivination = "Sun has the same divination with the keywords "+sun.getDivination().get("Keywords");
        String doesNotHaveSameDivination = "Sun does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Sun");
        expectedDivination.put("Keywords","Diminish, Loss, Reduction, Scaling back, Avoiding excess");
        expectedDivination.put("The Judgement","Decrease with sincerity, brings supreme good fortune, no blame, one is able to persevere, it is beneficial to have somewhere to go");
        expectedDivination.put("Judgement Description","Decrease is not necessarily a bad thing. Increase and decrease are basic features of life. They are part of a natural cycle and succeed each other inevitably. Everything that expands too far will eventually contract. Everything that is made great will eventually be made small. A wise person tries to understand the nature of the time, in order to discern when decrease is appropriate. When things have proceeded too far, or when practices have become excessive, it is time for decrease. When aspects of your life have become too confusing or too complicated, it is time to step back and simplify. Decrease means understanding that you must give up some thing to get other things. In the long run, your happiness and success depend on learning to recognize what you must surrender as we aas what you wish to obtain. The task before you now is to put priorities in order. What is most important to you? What must be given up? Face facts. There is no shame in decrease if it is appropriate to the time, and it is appropriate to the time if it helps you clarify your values, achieve your goals. or get you though a difficult period in your life. The same principle apply to your conduct and demeanor. Because you want to much too badly, you fill your life with complications and entanglements. Simplify. Get rid of excess and affectation. Return to the basic principles and straight forwardness in your dealings with others. Perhaps you ego has gotten a bit inflated or your expectations have gotten out of hand. Now is the time to put things in perspective and to decide what is most important to you. Hence the text says 'It is beneficial to have somewhere to go'. Scaling back and doing with less can strengthen your character. It will help you meet the challenges ahead. Do not be concerned if others have more than you do. Hence the text 'two small bows' are sufficient to make the offering. This means that people who are devoted and down-to-earth will be accepted even if their worldly possessions are meager. What is in your heart is much more important than what is in your pockets. What matters is not what you have but who you are. Don't put on airs or pretend to be something that you are not. It is completely unnecessary and may even be counterproductive. Act with sincerity and integrity, and the quality of your character will shine through to others. Be generous and helpful. Do not insist on taking the lead. Instead, be content to play your part. Be willing to give what you have to help others. Have faith: If you are decreased in the short run, you will surely be increased in the long run. As the text says 'decrease with sincerity brings about supreme good fortune'");
        expectedDivination.put("The Image","At the foot of the mountain, a lake, this is the image of decrease. Thus the superior person controls his anger and restrains his desire");
        if(sun.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveSameDivination;
        }
    }

    public String hasSameNumber(Sun sun) {
        String hasSameNumber = "Sun has the same number " + sun.getNumber();
        String doesNotHaveSameNumber= "Sun does not have the same number";
        int expectedNumber = 41;
        if(sun.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveSameNumber;
        }
    }
}

