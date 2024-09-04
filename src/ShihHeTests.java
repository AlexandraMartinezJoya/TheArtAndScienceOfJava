import IChingClasses.ShihHe;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class ShihHeTests extends ConsoleProgram {

    public void run() {
        ShihHe shihHe = new ShihHe();
        String hasTheSameImage = hasTheSameImage(shihHe);
        println(hasTheSameImage);
    }

    public String hasTheSameImage(ShihHe shihHe) {
        String hasTheSameImage = "ShihHe has the same image";
        String doesNotHaveTheSameImage = "ShihHe does not have the same image";
        GImage expectedImage =  new GImage("../IChingImages/UpToSixtyFour/21.ShihHe.jpg");
        if(shihHe.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImageClassPath(ShihHe shihHe){
        String hasTheSameImagePath = "ShihHe has the same image class path";
        String doesNotHaveTheSameImagePath = "ShihHe does not have the same image class path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/21.ShihHe.jpg";
        if(shihHe.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(ShihHe shihHe) {
        String hasTheSameElementName = "ShihHe has the expected element name of "+ shihHe.getElementName();
        String doesNotHaveTheSameElementName = "ShihHe does not have the expected element name";
        String expectedElementName =  "Fire, Thunder";
        if(shihHe.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(ShihHe shihHe) {
        String hasTheSameQualities = "ShihHe has the expected qualities and they are "+ shihHe.getElementQualities();
        String doesNotHaveTheSameQualities = "ShihHe does not have the expected qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Reform" );
        expectedQualities.put("2", "Acting decisively");
        expectedQualities.put("3", "Administrating punishments");
        expectedQualities.put("4", "Doing justice");
        expectedQualities.put("9", "Bell");
        if(shihHe.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(ShihHe shihHe) {
        String hasTheSameDivination = "ShihHe has the same divination with the keywords: "+ shihHe.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "ShihHe does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Shih He - Reform");
        expectedDivination.put("Keywords", "Reform, Acting decisively, Administrating punishments, doing justice");
        expectedDivination.put("The Judgement", "Biting through. Success. It is beneficial to do justice");
        expectedDivination.put("Judgement Description", "This hexagram traditionally represented criminal penalties, or recourse to law in order to enforce justice. More generally, Shih He concerns the need for energetic reform. The basic metaphor of the hexagram is a person who bites through and obstruction. When there is danger of significant deterioration or lasting injury, vigorous action is necessary to do justice and restore proper conditions. Something has gone wrong. It may be a a transgression or an injustice. Someone may be taking advantage of you. Or you may have fallen prey to bad habits. Whatever the cause of the situation, reform is imperative. You must take a firm stand now. Things must change. Half measures will not do. You must cut through to the heart of the situation and approach it with complete clarity. Then when you understand what needs to be done, you must act. This is no time to be meek and pliant. Attack the problem with energy and determination. If you do not act quickly and decisively, the problem will not go away, and it may only become worse. Nevertheless, this does not mean that you should be reckless. Prompt and efficient action is necessary, but your action should be based on clear thinking rather than emotion. And it should be the result of careful planning rather than blind instinct. The best approach now is one that is firm but reasonable, fair but resolute.");
        expectedDivination.put("The Image", "Thunder and lightning. This is the image of biting through. Thus the ancient kings enforced the laws. Through clearly defined penalties");
        if(shihHe.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

   public String hasTheSameNumber(ShihHe shihHe) {
        String hasTheSameNumber = "ShihHe has the same number and it is "+ shihHe.getNumber();
        String doesNotHaveTheSameNumber = "ShihHe does not have the same number";
        int expectedNumber = 21;
        if(shihHe.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
   }
}
