package IChingClasses;

import IChingClasses.IChingLineNames;
import IChingClasses.IChingStone;
import acm.graphics.GImage;

import java.util.HashMap;

public class LuTheWanderer extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public LuTheWanderer(){
        image = new GImage("../IChingImages/IChingClasses.LuTheWanderer.png");
        element = "";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Traveling" );
        qualities.put("2", "Unsettled");
        qualities.put("3", "Tentative");
        qualities.put("4", "Uncertain");
        qualities.put("5", "In transition");
        qualities.put("6", "Exploring");
        qualities.put("7", "Trying new experiences");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "body aura");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        divination = getDivinationText();
        number = 21;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Lu - The Wanderer ";
        String keywords = "Traveling, Unsettled, Tentative,  Uncertain, In transition, Exploring, Trying new experiences";
        String theJudgement = "The wanderer, In small matters, success. Perseverance brings good fortune";
        String theJudgementDescription = "You are in a period of transition. Things are not yet certain, and it is not yet clear how you fit into them or what your identity is supposed to be. The text compares your situation to that of a wanderer who is traveling through a strange land. The wanderer is a sojourner - he does not expect to stay long, but he is not quite sure where he is going next. He knows very few people. He is not exactly sure what the local customs are or whom he can trust. He does not completely understand what is expected of him. Because his situation is uncertain, he is circumspect and cautious. He does not call attention to himself nor does he get involved in matters that do not concern him. He associates only with reliable and trustworthy people and does not get involved in anything underhanded or unscrupulous, much less anything that would get him in trouble with the local authorities. Instead, he tries to learn as much as he can from his new souroundings, and in this way he learns something about himself. Apply these principles to your own life. You are on a journey whose destination is not yet determined. This is not a time to make definite commitments. Instead it is a time to explore. You need to gather new information , gain new perspectives, experiment with new ways of living, and meet new people. Don't be afraid to try something different. You won't know what the right path is until you try a number of different possibilities. Be flexible and adaptable and willing to learn. However, precicely because you don't know yet where you are going, you must also be politic and discret. When you find yourself in new situations with new people. be respectful but also reserved. It will take time to know whom you can really trust. Try to associate with good people and make friends with those you respect. This will help keep you out of harm's way and ensure that you get the most out of your new experiences. Relish the uncertainty of this time. You have a wonderful opportunity now to expand your horizons and make important connections. You may well encounter new people and new experiences that will change your life. But don't do anything that is beneath you and don't compromise your integrity just to fit in or to get others to like you. Instead, just be yourself. If you behave with courtesy and discretion, you will attract the right sort of people. A sincere and friendly approach will meet with a natural and positive response, no matter where you are. When people go out of their way to help you, make usre that you let them know that you appreciate their generosity, and then do your best to help them in return. In this way you will begin to form bonds of reciprocity that will help you through this period of transition.";
        String theImage = "Fire on the mountain. This is the image of the wanderer, thus the superior person is clear-minded and cautious in imposing penalties and protracts no lawsuits";
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

    public String getFamilyMember() {
        return familyMember;
    }

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

    void create() { new ShihHe();}
}
