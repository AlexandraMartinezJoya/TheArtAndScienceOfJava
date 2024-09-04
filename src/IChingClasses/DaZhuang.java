package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class DaZhuang  extends IChingStone implements IChingLineNames {

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

    public DaZhuang() {
        imagePath = "../IChingImages/UpToSixtyFour/34.DaZhuang.jpg";
        image = new GImage(imagePath);
        element = "Thunder, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", " The power of the great" );
        qualities.put("2", "Dominance");
        qualities.put("3", "Great Strength");
        qualities.put("4", "Using your power wisely");
        qualities.put("5", "Uniting strength with justice");
        qualities.put("6", "Great Power");
        divination = getDivinationText();
        number = 34;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Da Zhuang - Great Power";
        String keywords = "The power of the great, Dominance, Great Strength, Using your power wisely, uniting strength with justice";
        String theJudgement = "Great Power, It is beneficial to persevere";
        String theJudgementDescription = "You have enormous power and influence on the situation now. But the secret to great power is knowing when and how to use it. And the moral responsibility of great power is to use it only for good purposes and not simply to attain selfish ends. The situation has great potential. You can achieve a great deal now. But do not become reckless or overconfident. Perhaps you think you hold all the cards, or that you can bully your way forward to get what you want. But if you become aggressive and try to impose your will on others, you will simply create resistence and opposition. You should carefully consider how other people will be affectred by your actions and what would be in the best interests of everyone before you go ahead. Exercise caution and circumspection. The proper use of great power is a matter of timing. Patience and care amplify your strength and influence, recklessness and carelessness dissipate them. Wait for the right moment to act. If you rush ahead and try to force matters, you may well make everything worse. Even if you do prevail ultimately. acting aggressively at the wrong time may make your ultimate victory much more difficult to achieve or much less happy and fulfilling when it arrives. Great power is truly great when it is vast or mighty but when it is used in the pursuit of something good and just. Great power that is excercises selfishly degenerates into tyranny, great power exercises thoughtlessly degenerates into chaos. If you find yourself in a position of strenght and influence, let your conscience be your guide. Don't allow yourself to be moved by greed, self-indulgence, or vanity. Do not act on impulse, and do not lord your power over others. Rather, simply decide what is right and do it without arrogance and without letting yourself be distracted by irrelevant or petty considerations. Unite strength with justsice, influence with integrity, and power with principle, and you will achieve something that is truly great.";
        String theImage = "Thunder in heaven above, this is the image of Great Power, thus the superior person does not act in any way contrary to codes of proper courtesy and decorum";
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

    public String getImagePath() { return imagePath; }

    @Override
    public void create() {
        new DaZhuang();
    }
}
