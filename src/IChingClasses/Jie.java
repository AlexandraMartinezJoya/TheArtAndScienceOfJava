package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Jie extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Jie() {
        image = new GImage("../IChingImages/UpToSixtyFour/40.Jie.jpg");
        element = "Thunder, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Deliverance" );
        qualities.put("2", "Release");
        qualities.put("3", "Relief");
        qualities.put("4", "Separation");
        qualities.put("5", "Removal");
        qualities.put("6", "Loosening the knot");
        qualities.put("7", "Untying");
        qualities.put("8", "End of obstruction");
        qualities.put("9", "End of hardships");
        qualities.put("10", "Redemption");
        qualities.put("11", "Forgivness");
        qualities.put("12", "Letting go of the past");
        divination = getDivinationText();
        number = 40;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Jie - Deliverance";
        String keywords = "Release, relief, separation, removal, loosening the knot, untying, end of obstruction, end of hardships, redemption, forgiveness, letting go of the past";
        String theJudgement = "Deliverance. The southwest is beneficial. If there is no longer somewhere to go, return brings good fortune, if there is still somewhere to go, an early start brings good fortune.";
        String theJudgementDescription = "Things have been frustrating for a long time. You have been unable to make progress, or your relationships have been full of conflict and misunderstanding. Now things start to get better. Tension begin to be eased. Difficulties begin to resolve themselves. It is as if a storm has broken and the air has suddenly cleared. You feel liberatated from what has been a seemingly endless cycle of failure and frustration. There is new hope. When conditions start to improve after a long period of stagnation, it is perfectly all right to celebrate and feel joy. A heavy burden has been lifted from your shuolders, it is no wonder that you feel simulated. But the most important thing is to regain your balance. Hence the text speaks of the \"southwest\" the direction traditionally associated with the earth. It is time to put yourself on solid ground and restore conditions of normalcy. Return to a healthy pattern of living and restore the natural rythms of your life. Now that the tensions have begun to be relieved, you don't need to make any bold or audacious gestures. Things are already moving in the right direction. Ask yourself whether there are any remaining matters that need to be taken care of to restore things to their regular and proper order. If there are, take care of them immediately. Do just what is necessary, promptly and unobstrusively, without making a fuss. Spend some time thinking about why things went wrong. Did something in your behavior and your attitudes hold you back? Did you unwittingly keep the cycle of frustation going though your thoughts and actions? When the moment of deliverance comes, you have the opportunity to make things right and to let go of the mistakes of the past. There is no better time for this than the present. As the text says, an early start brings good fortune.";
        String theImage = "Thunder and rain invigorate, this is the image of Deliverance, thus the superior person forgives misdeeds and pardons mistakes.";
        divination.put("Title", title);
        divination.put("Keywords", keywords);
        divination.put("The Judgement", theJudgement);
        divination.put("Judgement Description", theJudgementDescription);
        divination.put("The Image", theImage);
        return divination;
    }

    public GImage getIChingImage() {
        return image;
    }

    public String getElementName() {
        return element;
    }

    public HashMap getElementQualities() {
        return qualities;
    }

    public String getFamilyMember() { return familyMember;}

    public HashMap getBodyPart() {
        return partOfBody;
    }

    public String getRelatedAnimal() {
        return animals;
    }

    public HashMap getSeasonAndWeather() {
        return seasonsAndWeather;
    }

    public HashMap getDivination() { return divination;}

    public int getNumber() { return number;}

    @Override
    public void create() {new Jie();}
}
