import IChingClasses.DaZhuang;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class DaZhuangTests extends ConsoleProgram {

    public void run(){
        DaZhuang daZhuang = new DaZhuang();
        String hasSameImage = hasSameImage(daZhuang);
        println(hasSameImage);
    }

    public String hasSameImage (DaZhuang daZhuang){
        String hasSameImage = "Da Zhuang has the same image";
        String doesNotHaveTheSameImage = "Da Zhuang does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/34.DaZhuang.jpg");
        if(daZhuang.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(DaZhuang daZhuang) {
        String hasTheSameImagePath = "Da Zhuang has the same image path";
        String doesNotHaveTheSameImagePath = "Da Zhuang does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/34.DaZhuang.jpg";
        if(daZhuang.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(DaZhuang daZhuang) {
        String hasTheSameElementName = "Da Zhuang has the same element name " + daZhuang.getElementName();
        String doesNotHaveTheSameElementName = "Da Zhuang does not have the same element name";
        String expectedElementName = "Thunder, Heaven";
        if(daZhuang.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasSameQualities(DaZhuang daZhuang){
        String hasSameQualities = "Da Zhuang has the same expected qualities " + daZhuang.getElementQualities();
        String doesNotHaveSameQualities = "Da Zhuang does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", " The power of the great" );
        expectedQualities.put("2", "Dominance");
        expectedQualities.put("3", "Great Strength");
        expectedQualities.put("4", "Using your power wisely");
        expectedQualities.put("5", "Uniting strength with justice");
        expectedQualities.put("6", "Great Power");
        if(daZhuang.getElementQualities().equals(expectedQualities)) {
            return hasSameQualities;
        } else {
            return doesNotHaveSameQualities;
        }
    }

    public String hasSameDivination(DaZhuang daZhuang) {
        String hasSameDivination = "Da Zhuang has the same expected divination with the keywords "+ daZhuang.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Da Zhuang does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Da Zhuang - Great Power");
        expectedDivination.put("Keywords", "The power of the great, Dominance, Great Strength, Using your power wisely, uniting strength with justice");
        expectedDivination.put("The Judgement", "Great Power, It is beneficial to persevere");
        expectedDivination.put("Judgement Description", "You have enormous power and influence on the situation now. But the secret to great power is knowing when and how to use it. And the moral responsibility of great power is to use it only for good purposes and not simply to attain selfish ends. The situation has great potential. You can achieve a great deal now. But do not become reckless or overconfident. Perhaps you think you hold all the cards, or that you can bully your way forward to get what you want. But if you become aggressive and try to impose your will on others, you will simply create resistence and opposition. You should carefully consider how other people will be affectred by your actions and what would be in the best interests of everyone before you go ahead. Exercise caution and circumspection. The proper use of great power is a matter of timing. Patience and care amplify your strength and influence, recklessness and carelessness dissipate them. Wait for the right moment to act. If you rush ahead and try to force matters, you may well make everything worse. Even if you do prevail ultimately. acting aggressively at the wrong time may make your ultimate victory much more difficult to achieve or much less happy and fulfilling when it arrives. Great power is truly great when it is vast or mighty but when it is used in the pursuit of something good and just. Great power that is excercises selfishly degenerates into tyranny, great power exercises thoughtlessly degenerates into chaos. If you find yourself in a position of strenght and influence, let your conscience be your guide. Don't allow yourself to be moved by greed, self-indulgence, or vanity. Do not act on impulse, and do not lord your power over others. Rather, simply decide what is right and do it without arrogance and without letting yourself be distracted by irrelevant or petty considerations. Unite strength with justsice, influence with integrity, and power with principle, and you will achieve something that is truly great.");
        expectedDivination.put("The Image", "Thunder in heaven above, this is the image of Great Power, thus the superior person does not act in any way contrary to codes of proper courtesy and decorum");
        if(daZhuang.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber (DaZhuang daZhuang) {
        String hasSameNumber = "Da Zhuang has the same number " +daZhuang.getNumber();
        String doesNotHaveSameNumber = "Da Zhuang does not have the same number";
        int expectedNumber = 34;
        if(daZhuang.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveSameNumber;
        }
    }
}
