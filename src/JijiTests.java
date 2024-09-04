import IChingClasses.Jiji;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JijiTests extends ConsoleProgram {

    public void run() {
        Jiji jiji = new Jiji();
        String hasSameImage = hasSameImage(jiji);
        println(hasSameImage);
    }

    public String hasSameImage(Jiji jiji){
        String hasSameImage = "Jiji has the same image";
        String doesNotHaveSameImage = "Jiji does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/63.Jiji.jpg");
        if(jiji.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(Jiji jiji){
        String hasTheSameImagePath = "Jiji has the same image path as expected";
        String doesNotHaveTheSameImagePath = "Jiji does not have the same image path as expected";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/63.Jiji.jpg";
        if(jiji.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName( Jiji jiji) {
        String hasTheSameElementName = "Jiji has the same element name and it is " + jiji.getElementName();
        String doesNotHaveTheSameElementName = "Jiji does not have the same element name";
        String expectedElementName = "Water, Fire";
        if( jiji.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities (Jiji jiji) {
        String hasTheSameQualities = "Jiji has the same expected qualities and they are " + jiji.getElementQualities();
        String doesNotHaveTheSameQualities = "Jiji does not have the same expected qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "After completion" );
        expectedQualities.put("2", "Mission accomplished");
        expectedQualities.put("3", "Everything in its place");
        expectedQualities.put("4", "After fording the stream");
        expectedQualities.put("5", "After fulfillment");
        expectedQualities.put("6", "Consolidating gains");
        expectedQualities.put("7", "Maintaining equilibrium");
        expectedQualities.put("8", "Nipping problems in the bud");
        expectedQualities.put("9", "Preventing deterioration");
        expectedQualities.put("10", "Watching carefully");
        expectedQualities.put("11", "Minding the kettle");
        if(jiji.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination (Jiji jiji) {
        String hasTheSameDivination = "Jiji has the same divination with the keywords " + jiji.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Jiji does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Ji Ji - After completion");
        expectedDivination.put("Keywords", "Ferrying complete, Mission accomplished, everything in its place, after fording the stream, after fulfillment, consolidating gains, maintaining equilibrium, nipping problems in the bud, preventing deterioration, watching carefully, minding the kettle");
        expectedDivination.put("The Judgement", "After Completion. Success in small matters. It is beneficial to persevere, In the begining, good fortune. In the end, disorder.");
        expectedDivination.put("Judgement Description", "The situation has reached completion. You have achieved what you wanted. Details remain to be worked out, but the essential features have been achieved. It is perfectly all right to celebrate your accomplishments. But now the next phase of your efforts must begin. The final elements must be hammered into place. Promises and commitments must be fulfilled. And after all of this is done, you must maintain your new position and consolidate your good fortune. The key is not to let success go to your head. You may be tempted to relax and let things move along on their own momentum. But that would be a mistake. Keeping things running smoothly will take effort. The law of change holds that as soon as things have reached perfection, they will begin to disintegrate. As soon as a person achieves success, problems begin to emerge. Those problems become more serious unless you deal with them at the outset. Therefore, your task is to maintain the fruits of your victory and to eliminate difficulties and obstacles before they have a chance to grow large. Don't regard any part of the task as beneath you. Pay careful attention to detail. Keep alert to any signs of possible decay in the situation. Do not take your previous successes for granted. Instead, continue to nurture the situation and strive to keep things healthy and vital. Now is definitely not the time to slack off. If you don't make the effort to consolidate your gains, you will lose them. But if you pay attention to the little things, you can keep the situation in good order and enjoy the benefits of your hard-won success. The key is devotion and perseverance. The lesson of this hexagram is that when things have reached completion, your work has only begun.");
        expectedDivination.put("The Image", "Water over fire: This is the image of things After Completion. Thus the superior person contemplates difficulties And guards against them in advance");
        if(jiji.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber (Jiji jiji) {
        String hasTheSameNumber = "Jiji has the same number and it is " + jiji.getNumber();
        String doesNotHaveTheSameNumber = "Jiji does not have the same number ";
        int expectedNumber = 63;
        if( jiji.getNumber() == expectedNumber ){
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
