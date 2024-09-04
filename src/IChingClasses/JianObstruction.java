package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class JianObstruction extends IChingStone implements IChingLineNames {

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

    public JianObstruction() {
        imagePath = "../IChingImages/UpToSixtyFour/39.JianObstruction.jpg";
        image = new GImage(imagePath);
        element = "Water, Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Limping" );
        qualities.put("2", "Stumbling");
        qualities.put("3", "Adversity");
        qualities.put("4", "Impediment");
        qualities.put("5", "Trouble");
        qualities.put("6", "Difficulty");
        qualities.put("7", "Hardship");
        qualities.put("8", "Hindrance");
        qualities.put("9", "Looking inward");
        qualities.put("10", "Self-reflection");
        qualities.put("11", "Surmounting the obstacles within");
        divination = getDivinationText();
        number = 39;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Jian - Obstruction";
        String keywords = "Limping, stumbling, adversity, impediment, trouble, difficulty, hardship, hindrance, looking inward, self-reflection, surmounting the obstacles within";
        String theJudgement = "Obstruction. The southwest is beneficial. The northeast is not. It is beneficial to see a great person. Perseverance beings good fortune.";
        String theJudgementDescription = "The southwest represents receptivity and patience, the northeast represents assertion and advance. Hence the text says that instead of pressing ahead urgently one should hold back and accept the situation for what it is. You are faced with obstacles that you cannot overcome. The more you struggle with your problems, the larger they seem to loom. It is time to take a break from your efforts and pause. Stop trying to enforce your will. Instead, look at the things with detachment, humility, and acceptance. Be willing to learn. The point of detaching yourself from your current struggles is not to give up hope of eventual success. Quite the contrary: you must be absolutely determined to prevail in the long run. Rather, the point is to restore your emotional balance and clear your head. Before you can regroup, you must free yourself from the emotional entanglements of past approaches that have been counterproductive. You need a fresh start and a fresh attitude. This is the meaning of the statement that the 'southwest' is beneficial. In the Book of Changes, the southwest is the direction associated with the earth. By adopting the virtues associated with earth: acceptance, humility, devotion, and patience - you will regain your composure and recharge your batteries. The text says 'it is beneficial to see a great person'. After you have taken the time to reassess the situation, you need to join forces with others. Ask for advice from people you respect and trust, and who understand you and your goals. They may have fresh perspectives. Don't be too stubborn to admit that you need help or too proud to accept it from others. Work together with people to tackle the problem rather than trying to go it alone. Finally, do not give up hope. Persevere. Even though you may have to wait, or make a strategic retreat, if you maintain an enduring devotion to achieving your goal, you will eventually prevail. The test of great character is the ability to let go and walk away temporarily from a goal while being utterly devoted to achieving it in the long run. The obstructions that you face today will help develop your character so that you can better meet the challenges of the future. When obstruction leads to reassessment and self-improvement, it can even be a blessing in disguise.";
        String theImage = "Beyond the mountain, there is water, This is the image of obstruction, thus the superior person reflects on himself, and cultivates his character.";
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

    public String getImagePath() { return imagePath;}

    public void create() {
        new JianObstruction();
    }
}
