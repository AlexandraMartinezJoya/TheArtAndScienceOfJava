package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Zhun  extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Zhun() {
        image = new GImage("../IChingImages/UpToSixtyFour/3.Zhun.jpg");
        element = "Water, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Pushing up out of the ground" );
        qualities.put("2", "Growing pains");
        qualities.put("3", "Birth throes");
        qualities.put("4", "Birth pangs");
        qualities.put("5", "Initial difficulties");
        qualities.put("6", "Time to gather helper");
        divination = getDivinationText();
        number = 3;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Zhun - Difficulty in the beginning";
        String keywords = "Pushing up out of the ground, growing pains, birth throes, birth pangs, initial difficulties, time to gather helpers";
        String theJudgement = "Difficulty in the beginning, Supreme success, It is beneficial to persevere, Do not use this as an opportunity to undertake anything, it is beneficial to establish feudal lords";
        String theJudgementDescription = "To undertake something means to engage in something ambitious. In ancient China, rulers granted lands and titles to feudatories in exchange for their promise of help and support, and in particular promises of military assistance when the ruler was attacked. Hence \"to establish feudal lords\" means to seek help from others during a difficult time. You face a situation akin to growing pains. A new era is beginning. Things are struggling to take form. Chaos is slowly and painfully being converted into the first semblance of a new order. This confusion may reside in your projects and undertakings, in your own thoughts and desires, or even in your relationships with others. You may find what you one thought was settled and clear has now become unsettled and uncertain. You may be questioning old assumptions and belifs, although you are not yet quite sure what to replace them with. You are leaving the confines of the safe and familiar and moving to a new frontier of inderterminate scope and abundent possibilities. Indeed, there are so many possibilities now that you may find yourself adrift and confused. But the current lack of form brings the promisse of ultimate success, for there is much potential here. Nevertheless, precisely because things are still so unsettled, you must not act prematurely or attempt any great undertakings. This is not the time to be overly ambitious. Rather, you must move slowly and carefully, feeling your way about and beginning to consolidate your position. You could benefit greatly from the help and advice of other people during this difficult time. Do not be too proud to ask for assistance. Look to people more experienced than yourself to advise you. They will help you sort out your thoughts and priorities.";
        String theImage = "Clouds and thunder. This is the image of difficulty in the beginning. thus the superior person regulates and brings order.";
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
    public void create() {
        new Zhun();
    }
}
