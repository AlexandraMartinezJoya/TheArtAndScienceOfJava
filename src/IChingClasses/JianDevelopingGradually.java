package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class JianDevelopingGradually extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public JianDevelopingGradually(){
        image = new GImage("../IChingImages/UpToSixtyFour/53.JianDevelopingGradually.jpg");
        element = "Wind, Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Gradual advance");
        qualities.put("2", "Slow");
        qualities.put("3", "Steady development");
        qualities.put("4", "Progress step by step");
        qualities.put("5", "Faithfulness");
        qualities.put("6", "Persistence");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 53;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Huan Dispersion ";
        String keywords = "Dispersion, Dissolution, Getting rid of egotism, bringing people together, finding a common purpose, clearing up blockages, melting the ice, eliminating obstacles within yourself";
        String theJudgement = "Gradual Advance, the maiden is given in marriage, good fortune, it is beneficial to persevere";
        String theJudgementDescription = "There is the promise of future success, but you must allow the situation to develop gradually in order to realize it. The Book of Changes compares the situation to a long period of courtship, bethothal, and engagement. The parties must get to know each other and develop bonds of shared commitment and trust to accompany bonds of initial attraction. The couple's families must be brought together. Plans must be established. Ritual formalities must be observed. All of these things take time. What is true of marriage is true of all other forms of courtship and persuation. If you are trying to get other people to make a major commitment, or to do something important, don't expect them to be convinced overnight. You must be considerate and allow them to move toward a decision gradually after they have obtained the requisite level of trust and confidence. If you allow things to develop at their own pace, you will lay a firm foundation for your future success. Don't be anxious for quick results or greedy to get everything at once. You may well get some short-term benefits, but in the long term nothing good will come of it and what you have won in this fashion is unlikely to endure. Rash or reckless action will undermine the very features of the situation that are likely to produce the most good for the longest period of time. You must be patient and have faith that things will work out as they must, exactly in the right way. Similarily, do not think you can get immediate results through clever manipulation. This will also backfire. Rather, tried and true methods are the best way to obtain a positive outcome. Although you must be patient, that does not mean that you should do nothing. To the contrary, you should continually focus on your long-term goal. Progress will often be slow. Hence you must persevere in order that things do not bog down. Be gentle. Do not try to force matters. As new problems arise - and they will invetiably will, remain adaptable and flexible. Externally, maintain poise and calm. Internally, maintain your determination to succeed. Similar concerns apply to the cultivation of your character. Perhaps you want to reform your life or make a change to a more rewarding lifestyle. It is entirely appropriate that you make some changes at once. But you cannot become a completely better, happier person overnight. You will need time to adjust to the new conditions.";
        String theImage = "On the mountain there is a tree, This is the image of Developing Gradually, Thus the superior person abides in thw worthiness and virtue And so improves the lives and values of ordinary people";
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
    public void create() { new JianDevelopingGradually();}
}
