package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class DaXu  extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public DaXu() {
        image = new GImage("../IChingImages/UpToSixtyFour/26.DaXu.jpg");
        element = "Mountain, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Great Accumulation" );
        qualities.put("2", "Taming power of the great");
        qualities.put("4", "Accumulation");
        qualities.put("5", "Great restraint");
        qualities.put("7", "Storing up");
        qualities.put("8", "Preparation");
        qualities.put("6", "Bell");
        qualities.put("9", "Gathering knowledge");
        qualities.put("10", "Cultivating your abilities");
        qualities.put("11", "Improving yourself");
        divination = getDivinationText();
        number = 26;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.DaXu - Great Accumulation";
        String keywords = "The taming power of the great, Great amassing, accumulation, great restraint, great caretaking, storing up, preparation, gathering knowledge, cultivating your abilities, improving yourself, waiting for the right moment";
        String theJudgement = "Great Accumulation. It is beneficial to persevere, not eating at home brings good fortune, it is beneficial to cross the great river";
        String theJudgementDescription = "The theme of Da IChingClasses.Xu is storing up and developing energy and resources for future use. Hence, it is beneficial to persevere in marshaling your resources and developing your abilities. Cultivating a determined and steadfast character is essential, because if you wish to remain at the height of your powers you will need to hone your skills continually and renew yourself daily. 'not eating at home' refers to persons of great ability and talent who advised rulers in Ancient China and lived with them as their honored guests. Here it means that good fortune will come from working for the public good rather than for private advantage. Devote yourself to the perfection of your talents" +
                "and to the achievement of something beyond your narrow self-interest, and you will have both the power and the vision to achieve great things, symbolized by crossing the great river. This hexagram offers advice both about how to achieve future success and how to make yourself into the sort of person who naturally succeeds. Whatever your goals in life, you can achieve them if you go about things in the right way. First, size up the resources that you currently have available. These include not only your financial resources but also your social resources - your friends, relationships, and connections. Take stock of your talents and abilities, including any special knowledge and expertise you may have. Second, decide what needs to be improved or accumulated in order to reach your goal. Perhaps you need to make new connections or raise funds. Or perhaps you need to brush up on your talents or your social skills. Whatever it is, make a plan and stick to it. Gather the necessary knowledge and information. Enlist friends and helpers. To prevail you will need commitment and dedication over the long haul. The key is not to be impatient. You will succeed because you have wisely gathered the right resources and then controlled and used them properly. Third, work on yourself. Your character is the most important resource that you have. Develop good habits. Plan your actions in advance. Instead of rushing forward impetuously, stop to consider consequences. Stay focused and don't let yourself become distracted from your long-term goals. Organize your life so that you can make progress step by step rather than in a single valiant effort. Keep on top of things and don't slack off. Be industrious. Challenge yourself. If you make the effort, you can do more than you ever thought yourself capable of. Giving your best each and every day will bolster your confidence and make you feel better about yourself. Developing and stretching yourself will contribute to your overall happiness and well-being as well as making it easier for you to succeed. Fourth, work for something larger than yourself. Don't confuse determination with isolation from others . This is a time for new possibilities, new situations, and even new relationships. Let go of your fears and inhibitions. It is time to go out into the world and make a difference. Dedicating yourself to others will redound to your benefit in the long run.";
        String theImage = " Heaven dwells in the center of the mountain: this is the image of Great Accumulation. Thus the superior person gathers knowledge of the words and deeds of the past, In order to strengthen his character and accumulate his virtue.";
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
        new DaXu();
    }
}
