package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Jiji extends IChingStone implements IChingLineNames {

    GImage image;
    String imagePath;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Jiji() {
        imagePath = "../IChingImages/UpToSixtyFour/63.Jiji.jpg";
        image = new GImage(imagePath);
        element = "Water, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "After completion" );
        qualities.put("2", "Mission accomplished");
        qualities.put("3", "Everything in its place");
        qualities.put("4", "After fording the stream");
        qualities.put("5", "After fulfillment");
        qualities.put("6", "Consolidating gains");
        qualities.put("7", "Maintaining equilibrium");
        qualities.put("8", "Nipping problems in the bud");
        qualities.put("9", "Preventing deterioration");
        qualities.put("10", "Watching carefully");
        qualities.put("11", "Minding the kettle");
        divination = getDivinationText();
        number = 63;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Ji Ji - After completion";
        String keywords = "Ferrying complete, Mission accomplished, everything in its place, after fording the stream, after fulfillment, consolidating gains, maintaining equilibrium, nipping problems in the bud, preventing deterioration, watching carefully, minding the kettle";
        String theJudgement = "After Completion. Success in small matters. It is beneficial to persevere, In the begining, good fortune. In the end, disorder.";
        String theJudgementDescription = "The situation has reached completion. You have achieved what you wanted. Details remain to be worked out, but the essential features have been achieved. It is perfectly all right to celebrate your accomplishments. But now the next phase of your efforts must begin. The final elements must be hammered into place. Promises and commitments must be fulfilled. And after all of this is done, you must maintain your new position and consolidate your good fortune. The key is not to let success go to your head. You may be tempted to relax and let things move along on their own momentum. But that would be a mistake. Keeping things running smoothly will take effort. The law of change holds that as soon as things have reached perfection, they will begin to disintegrate. As soon as a person achieves success, problems begin to emerge. Those problems become more serious unless you deal with them at the outset. Therefore, your task is to maintain the fruits of your victory and to eliminate difficulties and obstacles before they have a chance to grow large. Don't regard any part of the task as beneath you. Pay careful attention to detail. Keep alert to any signs of possible decay in the situation. Do not take your previous successes for granted. Instead, continue to nurture the situation and strive to keep things healthy and vital. Now is definitely not the time to slack off. If you don't make the effort to consolidate your gains, you will lose them. But if you pay attention to the little things, you can keep the situation in good order and enjoy the benefits of your hard-won success. The key is devotion and perseverance. The lesson of this hexagram is that when things have reached completion, your work has only begun.";
        String theImage = "Water over fire: This is the image of things After Completion. Thus the superior person contemplates difficulties And guards against them in advance";
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

    public HashMap getElementQualities() {return qualities;}

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

    public String getImagePath() { return imagePath; }

    @Override
    public void create() {
        new Jiji();
    }
}
