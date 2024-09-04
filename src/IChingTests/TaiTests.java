package IChingTests;

import IChingClasses.Tai;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class TaiTests  extends ConsoleProgram {

    public void run() {

        Tai tai = new Tai();
        String taiHasTheSameImage = taiHasTheSameImage(tai);
        println(taiHasTheSameImage);

    }

    public String taiHasTheSameImage(Tai tai){
        String taiHasTheSameImage = "Tai has the same image";
        String taiDoesNotHaveTheSameImage = "Tai does not have the same imege";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/11.Tai.jpg");
        if(tai.getIChingImage().equals(expectedImage)) {
            return taiHasTheSameImage;
        } else {
            return taiDoesNotHaveTheSameImage;
        }
    }

    public String taiHasTheSameImagePath(Tai tai) {
        String taiHasTheSameImageClassPath = "Tai has the same image class path";
        String taiDoesNotHaveTheSameImageClassPath = "Tai does not have the same image class path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/11.Tai.jpg";
        if(tai.getImageClassPath().equals(expectedImagePath)) {
            return taiHasTheSameImageClassPath;
        } else {
            return taiDoesNotHaveTheSameImageClassPath;
        }
    }

    public String taiHasSameElementName (Tai tai) {
        String taiHasTheSameElementName = "Tai has the same element name and it is" + tai.getElementName();
        String taiDoesNotHaveTheSameElementName = "Tai does not have the same element name";
        String expectedTaiElementName = "Wind, Heaven";
        if(tai.getElementName().equals(expectedTaiElementName)) {
            return taiHasTheSameElementName;
        } else {
            return taiDoesNotHaveTheSameElementName;
        }
    }

    public String taiHasTheSameQualities(Tai tai) {
        String taiHasTheSameElementQualities = "Tai has the same element qualities "+ tai.getElementQualities();
        String taiDoesNotHaveTheSameElementQualities = "Tai does not have the same element qualities";
        HashMap expectedTaiElementQualities = new HashMap<>();
        expectedTaiElementQualities.put("1", "Peace" );
        expectedTaiElementQualities.put("2", "Harmony");
        expectedTaiElementQualities.put("3", "Swift flowing");
        expectedTaiElementQualities.put("5", "Harmonious interaction");
        expectedTaiElementQualities.put("7", "Advance");
        expectedTaiElementQualities.put("8", "Agreement");
        expectedTaiElementQualities.put("9", "Dual Signature");
        expectedTaiElementQualities.put("10", "Mutual agreement");
        expectedTaiElementQualities.put("11", "Coherence");
        expectedTaiElementQualities.put("12", "Mutual consent");
        expectedTaiElementQualities.put("13", "Agreeable");
        expectedTaiElementQualities.put("14", "Bell");
        if(tai.getElementQualities().equals(expectedTaiElementQualities)) {
            return taiHasTheSameElementQualities;
        } else {
            return taiDoesNotHaveTheSameElementQualities;
        }
    }

    public String taiHasTheSameDivination(Tai tai) {
        String taiHasTheSameDivination = "Tai has the same divination with the keywords " + tai.getDivination().get("Keywords");
        String taiDoesNotHaveTheSameDivination = "Tai does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Tai - Peace");
        expectedDivination.put("Keywords", "Peace, Harmony, Harmonious interaction, Advance, Agreement, Dual signature, Mutual agreement, Coherence, Mutual consent");
        expectedDivination.put("The Judgement", "Peace. The petty depart, The great arrive. Good fortune. Success");
        expectedDivination.put("Judgement Description", "Decrease is not necessarily a bad thing. Increase and decrease are basic features of life. Tehey are part of a natural cycle and succeed ach other inevitably. Everything that expands too far will eventually contract. Everything that is made great will eventually be made small. A wise person tries to understand the nature of the time, in order to discern when decrease is appropriate. When things have proceeded too far, or when practices have become excessive, it is time for decrease. When aspects of your life have become too confusing or too complicated, it is time to step back and simplify. Decrease means understanding that you must give up some thing to get other things. In the long run, your happiness and success depend on learning to recognize what you must surrender as well as what you wish to obtain. The task before you now is to put priorities in order. What is most important to you? What must be given up? Face facts. There is no shame in decrease if it is appropriate to the time, and it is appropriate to the time if it helps you clarify your values, achieve your goals. or get you though a difficult period in your life. The same principle apply to your conduct and demeanor. Because you want to much too badly, you fill your life with complications and entanglements. Simplify. Get rid of excess. Return to the basic principles and straight forwardness in your dealings with others. Perhaps you ego has gotten a bit inflated or your expectations have gotten out of hand. Now is the time to put things in perspective and to decide what is most important to you. Hence the text says 'It is beneficial to have somewhere to go'. Scaling back and doing with less can strengthen your character. It will help you meet the challenges ahead. Do not be concerned if others have more than you do. This means that people who are devoted and down-to-earth will be accepted even if their worldly possessions are meager. What is in your heart is much more important than what is in your pockets. What matters is not what you have but who you are. Don't put on airs or pretend to be something that you are not. It is completely unnecessary and may even be counterproductive. Act with sincerity and integrity, and the quality of your character will shine through to others. Be generous and helpful. Do not insist on taking the lead. Instead, be content to play your part. Be willing to give what you have to help others. Have faith: If you are decreased in the short run, you will surely be increased in the long run. As the text says 'decrease with sincerity brings about supreme good fortune'");
        expectedDivination.put("The Image", "Winds in heavens are struggling to find coherence");
        if(tai.getDivination().equals(expectedDivination)) {
            return taiHasTheSameDivination;
        } else {
            return taiDoesNotHaveTheSameDivination;
        }
    }

    public String taiHasTheSameNumber(Tai tai) {
        String taiHasTheSameNumber = "Tai has the same number and it is: "+ tai.getNumber();
        String taiDoesNotHaveTheSameNumber = "Tai does not have the same number";
        int expectedNumber = 11;
        if(tai.getNumber() == expectedNumber) {
            return taiHasTheSameNumber;
        } else {
            return taiDoesNotHaveTheSameNumber;
        }
    }
}

