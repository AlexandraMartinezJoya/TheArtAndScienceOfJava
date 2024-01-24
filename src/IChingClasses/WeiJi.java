package IChingClasses;

import IChingClasses.IChingLineNames;
import IChingClasses.IChingStone;
import IChingClasses.ShihHe;
import acm.graphics.GImage;

import java.util.HashMap;

public class WeiJi extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public WeiJi(){
        image = new GImage("../IChingImages/UpToSixtyFour/64.WeiJi.jpg");
        element = "Fire, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Reform" );
        qualities.put("2", "Acting decisively");
        qualities.put("3", "Administrating punishments");
        qualities.put("4", "Doing justice");
        qualities.put("9", "Bell");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "body aura");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        divination = getDivinationText();
        number = 64;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Shih He - Reform";
        String keywords = "Reform, Acting decisively, Administrating punishments, doing justice";
        String theJudgement = "Biting through. Success. It is beneficial to do justice";
        String theJudgementDescription = "You face a difficult situation. The elements for successful change are there, but everything seems confused and unsettled. It is up to you to bring order out of chaos. It is a great responsibility. The problem is, you don't yet know what to do. There are contradictory indication and contradictory forces at work in the situation. You feel tugged at from all sides. You you must make a decision. The text compares your situation to that of an old fox that is trying to cross a frozen river. It does not know there the ice is to thin. Therefore, it proceeds slowly and cautiously, listening carefully for the first sounds of a crack in the surface. No matter how dar across it is, it does not lose its balancec or caution. By contrast, a young fox lacks this prudence and circumspection, if it rushes ahead boldly when it is nearly across the river, it may fall into the icy waters. In the same way, when you are trying to bring order to a confusing situation, you must begin slowly and methodically, First of all, decide what your goals truly are. There is no sense of starting out if you don't know there you want to go. Clarifying what you want the outcome to be will go a long way toward forumlating the right strategy. Second, don't rush matters. Rome wasn't built in a day. Take things one step at a time. Don't try to resolve everythinig at once. Third, be wary. Take the time to gather information and intelligence. Deliberate thorhoughly about the best way to proceed. In sum, be like an old fox navigating the ice, cautios, alert, flexible, surefooted, and willing to change direction at a moment's notice. If you can keep your wits about you, you will get across.";
        String theImage = " Fire over water. This is the image of things before completion. Thus the superior person carefully distiguishes things so that everything is its place";
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
