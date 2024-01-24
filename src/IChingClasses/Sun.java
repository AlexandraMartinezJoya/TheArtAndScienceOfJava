package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Sun extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Sun() {
        image = new GImage("../IChingImages/UpToSixtyFour/41.Sun.jpg");
        element = "Mountain, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Diminish" );
        qualities.put("2", "Loss");
        qualities.put("3", "Reduction");
        qualities.put("4", "Scaling back");
        qualities.put("5", "Avoiding excess");
        qualities.put("6", "Challenging old beliefs");
        divination = getDivinationText();
        number = 41;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Sun";
        String keywords = "Diminish, Loss, Reduction, Scaling back, Avoiding excess";
        String theJudgement = "Decrease with sincerity, brings supreme good fortune, no blame, one is able to persevere, it is beneficial to have somewhere to go";
        String theJudgementDescription = "Decrease is not necessarily a bad thing. Increase and decrease are basic features of life. They are part of a natural cycle and succeed each other inevitably. Everything that expands too far will eventually contract. Everything that is made great will eventually be made small. A wise person tries to understand the nature of the time, in order to discern when decrease is appropriate. When things have proceeded too far, or when practices have become excessive, it is time for decrease. When aspects of your life have become too confusing or too complicated, it is time to step back and simplify. Decrease means understanding that you must give up some thing to get other things. In the long run, your happiness and success depend on learning to recognize what you must surrender as we aas what you wish to obtain. The task before you now is to put priorities in order. What is most important to you? What must be given up? Face facts. There is no shame in decrease if it is appropriate to the time, and it is appropriate to the time if it helps you clarify your values, achieve your goals. or get you though a difficult period in your life.\n" +
                "The same principle apply to your conduct and demeanor. Because you want to much too badly, you fill your life with complications and entanglements. Simplify. Get rid of excess and affectation. Return to the basic principles and straight forwardness in your dealings with others. Perhaps you ego has gotten a bit inflated or your expectations have gotten out of hand. Now is the time to put things in perspective and to decide what is most important to you. Hence the text says \"It is beneficial to have somewhere to go\". Scaling back and doing with less can strenghten your character. It will help you meet the challendges ahead. Do not be concerned if others have more than you do. Hence the text \"two small bows\" are sufficient to make the offering. This means that people who are devoted and down-to-earth will be accepted even if their worldly possesions are meager. What is in your heart is much more important than what is in your pockets. WHat matters is not what you have but who you are. Don't put on airs or pretend to be something that you are not. It is completely unnecessary and may even be counterproductive. Act with sincerity and integrity, and the quality of your character will shine through to others. Be generous and helpful. Do not insist on taking the lead. Instead, be content to play your part. Be willing to give what you have to help others. Have faith: If you are decreased in the short run, you will surely be increased in the long run. As the text says \"decrease with sincerity brings about supreme good fortune";
        String theImage = "At the foot of the mountain, a lake, this is the image of decrease. Thus the superior person controls his anger and restrains his desire";
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
        new Sun();
    }
}
