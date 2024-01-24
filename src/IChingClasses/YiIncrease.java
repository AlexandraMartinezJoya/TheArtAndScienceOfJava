package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class YiIncrease extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public YiIncrease(){
        image = new GImage("../IChingImages/UpToSixtyFour/42.YiIncrease.jpg");
        element = "Wind, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Benefit");
        qualities.put("2", "Harvest");
        qualities.put("3", "Enrichment");
        qualities.put("4", "Generosity");
        qualities.put("5", "Sharing your bounty");
        qualities.put("6", "Thunder carried by wind");
        qualities.put("7", "Brain scans transmitted back to yourself");
        qualities.put("8", "Autocorrection in real time");
        qualities.put("9", "Being able to mirror yourself");
        qualities.put("10", "Self analysis");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 42;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Yi Increase ";
        String keywords = "Benefit, Harvest, Enrichment, Generosity, Sharing your bounty, thunder carried by wind, brain scans transmitted in other places";
        String theJudgement = "It is beneficial to have somewhere to go. It is beneficial to cross the great river";
        String theJudgementDescription = "You are in the midst of a very fortunate time, one that offers excellent opportunities to resolve old problems and start new projects. You can now make progress on things that seemed too difficult before. Obstacles fall away. Your relationships with other bloom and grow. Everything flourishes. There are two reasons why things are going so well. Their cooperation brings success. When those who are in more powerful and influential position act to benefit those with less status and influence, everyone benefits. WHen people feel that those in charge have their interests at heart, they willingly cooperate in even the most amibitious projects, and even the most difficult tasks can be completed successfully. Second, things are prospering because people pau attention to the fundamentals rather than to surface appearances. When a choice has to be made between making outward aspects of things more impressive or strengthening foundations, people choose the latter without hesitation, and they are right to do so. These good times will not last forever. Therefore, it is up to you to capitalize on them. First you must decide what your priorites are. The text says that if you want to benefit from the time, you have to have somewhere you want to go. If you dither and hesitate between various projects, or try to do too many things at once, you will squander your opportunities. Second, once you know what your goals are, you cannot hesitate, you need to take action. As the text says you must cross the great river. When the time is propitious, you can afford to take calculated risks and embark on challenging endeavors. It is a matter of faith and commitment. Have the courage of your convictions. Second, once you know what your goals are, you cannot hesitate, you need to take action. As the text says, you must cross the great river. When the time is propitious, you can afford to take calculated risks and embark on challenging endeavors. It is a matter of faith and commitment. Have the courage of your convictions. Third, to make the most of the good times, you must comrephend the causes that produced them. That means paying attention to fundamentals rather than trivial matters. Spend more time on the foundations of the work and less time on impressing people or fathering your own nest. Always remember that the work is more imporant than you are. Finally, you will succeed only if you do something that benefits people other than yourself. The secret to increase is reciprocity. If you work only for your own self-interest, or if you try to hog all the benefits for yourself, people will not join in, and you will not prosper. But if you are called to do something that serves a larger interest, and you are willing to share the benefits with others, people will rally around you. Pass on your bounty to others, especially to the people who work with you. Your generosity will be rewarded in countless ways. When you focus on what you can contribute to the world rather than what you can take away from it, you help keep the good times going.";
        String theImage = " Wind and thunder, this is the image of increase, thus the superior person when sees the good, imitates it, when he has faults, corrects himself, versioning systems";
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

    void create() { new YiIncrease();}
}
