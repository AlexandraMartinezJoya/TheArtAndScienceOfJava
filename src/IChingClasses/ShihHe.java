package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class ShihHe extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public ShihHe(){
        image = new GImage("../IChingImages/UpToSixtyFour/21.ShihHe.jpg");
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
        number = 21;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Shih He - Reform";
        String keywords = "Reform, Acting decisively, Administrating punishments, doing justice";
        String theJudgement = "Biting through. Success. It is beneficial to do justice";
        String theJudgementDescription = "This hexagram traditionally represented criminal penalties, or recourse to law in order to enforce justice. More generally, Shih He concerns the need for energetic reform. The basic metaphor of the hexagram is a person who bites through and obstruction. When there is danger of significant deterioration or lasting injury, vigorous action is necessary to do justice and restore proper conditions. Something has gone wrong. It may be a a transgression or an injustice. Someone may be taking advantage of you. Or you may have fallen prey to bad habits. Whatever the cause of the situation, reform is imperative. You must take a firm stand now. Things must change. Half measures will not do. You must cut through to the heart of the situation and approach it with complete clarity. Then when you understand what needs to be done, you must act. This is no time to be meek and pliant. Attack the problem with energy and determination. If you do not act quickly and decisively, the problem will not go away, and it may only become worse. Nevertheless, this does not mean that you should be reckless. Prompt and eficient action is necessary, but your action should be based on clear thinking rather than emotion. And it should be the result of careful planning rather than blind instinct. The best approach now is one that is firm but reasonable, fair but resolute.";
        String theImage = "Thunder and lightning. This is the image of biting through. Thus the ancient kings enforced the laws. Through clearly defined penalties";
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

    @Override
   public void create() { new ShihHe();}
}
