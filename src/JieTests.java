import IChingClasses.Jie;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JieTests extends ConsoleProgram {

    public void run() {
        Jie jie = new Jie();
        String hasSameImage = hasSameImage(jie);
        println(hasSameImage);
    }

    public String hasSameImage(Jie jie) {
        String hasSameImage = "Jie has the same image";
        String doesNotHaveTheSameImage = "Jie does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/40.Jie.jpg");
        if(jie.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Jie jie) {
        String hasSameImagePath = "Jie has the same image path";
        String doesNotHaveTheSameImagePath = "Jie does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/40.Jie.jpg";
        if(jie.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(Jie jie){
        String hasSameElementName = "Jie has the same element name " + jie.getElementName();
        String doesNotHaveTheSameElementName = "Jie does not have the same element name";
        String expectedElementName = "Thunder, Water";
        if(jie.getElementName().equals(expectedElementName)) {
            return hasSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasSameQualities(Jie jie){
        String hasSameQualities = "Jie has the same qualities "+ jie.getElementQualities();
        String doesNotHaveTheSameQualities = "Jie does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Deliverance" );
        expectedQualities.put("2", "Release");
        expectedQualities.put("3", "Relief");
        expectedQualities.put("4", "Separation");
        expectedQualities.put("5", "Removal");
        expectedQualities.put("6", "Loosening the knot");
        expectedQualities.put("7", "Untying");
        expectedQualities.put("8", "End of obstruction");
        expectedQualities.put("9", "End of hardships");
        expectedQualities.put("10", "Redemption");
        expectedQualities.put("11", "Forgiveness");
        expectedQualities.put("12", "Letting go of the past");
        if(jie.getElementQualities().equals(expectedQualities)) {
            return hasSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination(Jie jie){
        String hasSameDivination = "Jie has the same divination with the keywords "+ jie.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Jie does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Jie - Deliverance");
        expectedDivination.put("Keywords","Release, relief, separation, removal, loosening the knot, untying, end of obstruction, end of hardships, redemption, forgiveness, letting go of the past");
        expectedDivination.put("The Judgement","Deliverance. The southwest is beneficial. If there is no longer somewhere to go, return brings good fortune, if there is still somewhere to go, an early start brings good fortune.");
        expectedDivination.put("Judgement Description","Things have been frustrating for a long time. You have been unable to make progress, or your relationships have been full of conflict and misunderstanding. Now things start to get better. Tension begin to be eased. Difficulties begin to resolve themselves. It is as if a storm has broken and the air has suddenly cleared. You feel liberated from what has been a seemingly endless cycle of failure and frustration. There is new hope. When conditions start to improve after a long period of stagnation, it is perfectly all right to celebrate and feel joy. A heavy burden has been lifted from your shoulders, it is no wonder that you feel simulated. But the most important thing is to regain your balance. Hence the text speaks of the 'southwest' the direction traditionally associated with the earth. It is time to put yourself on solid ground and restore conditions of normalcy. Return to a healthy pattern of living and restore the natural rythms of your life. Now that the tensions have begun to be relieved, you don't need to make any bold or audacious gestures. Things are already moving in the right direction. Ask yourself whether there are any remaining matters that need to be taken care of to restore things to their regular and proper order. If there are, take care of them immediately. Do just what is necessary, promptly and unobstrusively, without making a fuss. Spend some time thinking about why things went wrong. Did something in your behavior and your attitudes hold you back? Did you unwittingly keep the cycle of frustation going though your thoughts and actions? When the moment of deliverance comes, you have the opportunity to make things right and to let go of the mistakes of the past. There is no better time for this than the present. As the text says, an early start brings good fortune.");
        expectedDivination.put("The Image","Thunder and rain invigorate, this is the image of Deliverance, thus the superior person forgives misdeeds and pardons mistakes.");
        if(jie.getDivination().equals(expectedDivination)){
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(Jie jie){
        String hasSameNumber = "Jie has the same number as expected "+ jie.getNumber();
        String doesNotHaveTheSameNumber = "Jie does not have the same number";
        int expectedNumber = 40;
        if(jie.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
