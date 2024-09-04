package IChingClasses;

import IChingClasses.IChingLineNames;
import IChingClasses.IChingStone;
import IChingClasses.ShihHe;
import acm.graphics.GImage;

import java.util.HashMap;

public class WeiJi extends IChingStone implements IChingLineNames {

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

    public WeiJi(){
        imagePath = "../IChingImages/UpToSixtyFour/64.WeiJi.jpg";
        image = new GImage("../IChingImages/UpToSixtyFour/64.WeiJi.jpg");
        element = "Fire, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Not yet across" );
        qualities.put("2", "Before the end");
        qualities.put("3", "Nearly home and dry");
        qualities.put("4", "Bringing order out of confusion");
        qualities.put("9", "Exercising order and circumspection");
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
        String title = "Wei Ji - Before Completion";
        String keywords = "Not yet across, Before the end, Nearly home and dry, Bringing order out of confusion, Exercising order and circumspection";
        String theJudgement = "Before Completion. Success.But if the little fox, Almost across the river, Gets its tail wet, There is nothing for which this is beneficial.";
        String theJudgementDescription = "You face a difficult situation. The elements for successful change are there, but everything seems confused and unsettled. It is up to you to bring order out of chaos. It is a great responsibility. The problem is, you don't yet know what to do. There are contradictory indication and contradictory forces at work in the situation. You feel tugged at from all sides. You you must make a decision. The text compares your situation to that of an old fox that is trying to cross a frozen river. It does not know there the ice is to thin. Therefore, it proceeds slowly and cautiously, listening carefully for the first sounds of a crack in the surface. No matter how dar across it is, it does not lose its balance or caution. By contrast, a young fox lacks this prudence and circumspection, if it rushes ahead boldly when it is nearly across the river, it may fall into the icy waters. In the same way, when you are trying to bring order to a confusing situation, you must begin slowly and methodically, First of all, decide what your goals truly are. There is no sense of starting out if you don't know there you want to go. Clarifying what you want the outcome to be will go a long way toward formulating the right strategy. Second, don't rush matters. Rome wasn't built in a day. Take things one step at a time. Don't try to resolve everything at once. Third, be wary. Take the time to gather information and intelligence. Deliberate thoroughly about the best way to proceed. In sum, be like an old fox navigating the ice, cautious, alert, flexible, surefooted, and willing to change direction at a moment's notice. If you can keep your wits about you, you will get across.";
        String theImage = "Fire over water. This is the image of things before completion. Thus the superior person carefully distinguishes things so that everything is its place";
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

    public int getNumber() { return number; }

    public String getImagePath() { return imagePath; }

    @Override
    public void create() { new WeiJi();}
}
