package IChingTests;

import IChingClasses.DaXu;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class DaXuTests extends ConsoleProgram {

    public void run() {
        DaXu daXu = new DaXu();
        String hasSameImage = hasSameImage(daXu);
        println(daXu);
    }

    public String hasSameImage(DaXu daXu) {
        String hasSameImage = "Da Xu has same image";
        String doesNotHaveSameImage = "Da Xu does not have same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/26.DaXu.jpg");
        if(daXu.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(DaXu daXu) {
        String hasSameImagePath = "Da Xu has same image path";
        String doesNotHaveSameImagePath = "Da Xu does not have same image path";
        String expectedImage = "../IChingImages/UpToSixtyFour/26.DaXu.jpg";
        if(daXu.getImagePath().equals(expectedImage)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasTheSameElementName(DaXu daXu) {
        String hasTheSameElementName = "Da Xu has the same element name " + daXu.getElementName();
        String doesNotHaveTheSameElementName = "Da Xu does not have the same elment name";
        String expectedElementName = "Mountain, Heaven";
        if(daXu.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualties (DaXu daXu) {
        String hasTheSameQualities = "Da Xu has the same qualities " + daXu.getElementQualities();
        String doesNotHaveTheSameQualities = "Da Xu does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Great Accumulation" );
        expectedQualities.put("2", "Taming power of the great");
        expectedQualities.put("4", "Accumulation");
        expectedQualities.put("5", "Great restraint");
        expectedQualities.put("7", "Storing up");
        expectedQualities.put("8", "Preparation");
        expectedQualities.put("6", "Bell");
        expectedQualities.put("9", "Gathering knowledge");
        expectedQualities.put("10", "Cultivating your abilities");
        expectedQualities.put("11", "Improving yourself");
        expectedQualities.put("12", "Great care");
        if(daXu.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination(DaXu daXu) {
        String hasTheSameDivination = "Da Xu has the same divination " + daXu.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Da Xu does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "DaXu - Great Accumulation");
        expectedDivination.put("Keywords", "The taming power of the great, Great amassing, accumulation, great restraint, great care-taking, storing up, preparation, gathering knowledge, cultivating your abilities, improving yourself, waiting for the right moment");
        expectedDivination.put("The Judgement", "Great Accumulation. It is beneficial to persevere, not eating at home brings good fortune, it is beneficial to cross the great river");
        expectedDivination.put("Judgement Description", "The theme of Da Xu is storing up and developing energy and resources for future use. Hence, it is beneficial to persevere in marshaling your resources and developing your abilities. Cultivating a determined and steadfast character is essential, because if you wish to remain at the height of your powers you will need to hone your skills continually and renew yourself daily. 'not eating at home' refers to persons of great ability and talent who advised rulers in Ancient China and lived with them as their honored guests. Here it means that good fortune will come from working for the public good rather than for private advantage. Devote yourself to the perfection of your talents and to the achievement of something beyond your narrow self-interest, and you will have both the power and the vision to achieve great things, symbolized by crossing the great river. This hexagram offers advice both about how to achieve future success and how to make yourself into the sort of person who naturally succeeds. Whatever your goals in life, you can achieve them if you go about things in the right way. First, size up the resources that you currently have available. These include not only your financial resources but also your social resources - your friends, relationships, and connections. Take stock of your talents and abilities, including any special knowledge and expertise you may have. Second, decide what needs to be improved or accumulated in order to reach your goal. Perhaps you need to make new connections or raise funds. Or perhaps you need to brush up on your talents or your social skills. Whatever it is, make a plan and stick to it. Gather the necessary knowledge and information. Enlist friends and helpers. To prevail you will need commitment and dedication over the long haul. The key is not to be impatient. You will succeed because you have wisely gathered the right resources and then controlled and used them properly. Third, work on yourself. Your character is the most important resource that you have. Develop good habits. Plan your actions in advance. Instead of rushing forward impetuously, stop to consider consequences. Stay focused and don't let yourself become distracted from your long-term goals. Organize your life so that you can make progress step by step rather than in a single valiant effort. Keep on top of things and don't slack off. Be industrious. Challenge yourself. If you make the effort, you can do more than you ever thought yourself capable of. Giving your best each and every day will bolster your confidence and make you feel better about yourself. Developing and stretching yourself will contribute to your overall happiness and well-being as well as making it easier for you to succeed. Fourth, work for something larger than yourself. Don't confuse determination with isolation from others . This is a time for new possibilities, new situations, and even new relationships. Let go of your fears and inhibitions. It is time to go out into the world and make a difference. Dedicating yourself to others will redound to your benefit in the long run.");
        expectedDivination.put("The Image", "Heaven dwells in the center of the mountain: this is the image of Great Accumulation. Thus the superior person gathers knowledge of the words and deeds of the past, In order to strengthen his character and accumulate his virtue.");
        if(daXu.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(DaXu daXu) {
        String hasTheSameNumber = "Da Xu has the same number "+ daXu.getNumber();
        String doesNotHaveTheSameNumber = "Da Xu does not have the same number";
        int expectedNumber = 26;
        if(daXu.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}

