package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class LuTreading extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public LuTreading() {
        image = new GImage("../IChingImages/UpToSixtyFour/10.LuTreading.jpg");
        element = "Heaven, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1", " Treading" );
        qualities.put("2", "Conduct");
        qualities.put("3", "Circumspection");
        qualities.put("4", "Daring");
        qualities.put("5", "Treading carefully");
        qualities.put("6", "Stepping on the tiger's tail");
        divination = getDivinationText();
        number = 10;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Lu-Treading";
        String keywords = "Conduct, Circumspection, Daring, Treading carefully, Stepping on the tiger's tail";
        String theJudgement = "Treading on the tail of the tiger. It does not bite. Success";
        String theJudgementDescription = "The theme of Lu is the need for care and circumspection, in conduct and social interaction. You find yourself in a difficult situation. It is like treading on the tail of a tiger. If you make a wrong move, you may bring strong forces down upon you. Therefor it is important to behave with the utmost delicacy and decorum. Plan your moves in advance. Think carefully what you want to do before you act. Move toward your goal steadily and avoid rash behavior. This is not the time to engage in reckless adventures or radical approaches. Stick to traditional, tested and proven methods. In personal relations, be pleasant and tactful, particularly to difficult people who might have reason to harm you. Don't allow their inability and bad temper to throw you or cause you respond sarcastically or in anger. maintain your poise and composure. Even though your position is perilous, you can still make progress if you behave with the utmost tact and consideration during this difficult time. Don't forget your sense of humor and manners. They will help you avoid potential problems and smooth over misunderstandings. Above all, do not lose your cool. Doing the right thing now requires that you keep your wits about you. Imagine yourself walking along a balance beam. If you keep your balance emotionally as well as physically and move forward with grace and dexterity, you will get to the other side unharmed. ";
        String theImage = "Heaven above, the lake below, this is the image of treading, thus the superior person distinguishes between the high and the low, improving the hearts and minds of ordinary people";
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

    public void create() {
        new LuTreading();
    }
}
