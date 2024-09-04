package IChingTests;

import IChingClasses.YiIncrease;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class YiIncreaseTests extends ConsoleProgram {

    public void run() {

        YiIncrease yiIncrease = new YiIncrease();
        String hasSameImage = hasSameImage(yiIncrease);
        println(hasSameImage);
    }

    public String hasSameImage(YiIncrease yiIncrease) {
        String hasTheSameImage = " Yi Increase has the same image";
        String doesNotHaveTheSameImage = "Yi Increase does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/42.YiIncrease.jpg");
        if(yiIncrease.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(YiIncrease yiIncrease) {
        String hasTheSameImagePath = "Yi Increase has the same image path";
        String doesNotHaveTheSameImagePath = "Yi Increase does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/42.YiIncrease.jpg";
        if(yiIncrease.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(YiIncrease yiIncrease) {
        String hasTheSameElementName = "Yi increase has the same element name " + yiIncrease.getElementName();
        String doesNotHaveTheSameElementName = "Yi increase does not have the same element name";
        String expectedElementName = "Wind, Thunder";
        if(yiIncrease.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(YiIncrease yiIncrease) {
        String hasTheSameQualities = "Yi Increase has the same qualities " + yiIncrease.getElementQualities();
        String doesNotHaveTheSameQualities = "Yi Increase does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Benefit");
        expectedQualities.put("2", "Harvest");
        expectedQualities.put("3", "Enrichment");
        expectedQualities.put("4", "Generosity");
        expectedQualities.put("5", "Sharing your bounty");
        expectedQualities.put("6", "Thunder carried by wind");
        if(yiIncrease.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(YiIncrease yiIncrease) {
        String hasTheSameDivination  =  "Yi Increase has the same divination with the keywords "+ yiIncrease.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Yi Increase does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Yi Increase");
        expectedDivination.put("Keywords","Benefit, Harvest, Enrichment, Generosity, Sharing your bounty, thunder carried by wind");
        expectedDivination.put("The Judgement","It is beneficial to have somewhere to go. It is beneficial to cross the great river");
        expectedDivination.put("Judgement Description","You are in the midst of a very fortunate time, one that offers excellent opportunities to resolve old problems and start new projects. You can now make progress on things that seemed too difficult before. Obstacles fall away. Your relationships with other bloom and grow. Everything flourishes. There are two reasons why things are going so well. Their cooperation brings success. When those who are in more powerful and influential position act to benefit those with less status and influence, everyone benefits. WHen people feel that those in charge have their interests at heart, they willingly cooperate in even the most ambitious projects, and even the most difficult tasks can be completed successfully. Second, things are prospering because people pau attention to the fundamentals rather than to surface appearances. When a choice has to be made between making outward aspects of things more impressive or strengthening foundations, people choose the latter without hesitation, and they are right to do so. These good times will not last forever. Therefore, it is up to you to capitalize on them. First you must decide what your priorities are. The text says that if you want to benefit from the time, you have to have somewhere you want to go. If you dither and hesitate between various projects, or try to do too many things at once, you will squander your opportunities. Second, once you know what your goals are, you cannot hesitate, you need to take action. As the text says you must cross the great river. When the time is propitious, you can afford to take calculated risks and embark on challenging endeavors. It is a matter of faith and commitment. Have the courage of your convictions. Second, once you know what your goals are, you cannot hesitate, you need to take action. As the text says, you must cross the great river. When the time is propitious, you can afford to take calculated risks and embark on challenging endeavors. It is a matter of faith and commitment. Have the courage of your convictions. Third, to make the most of the good times, you must comprehend the causes that produced them. That means paying attention to fundamentals rather than trivial matters. Spend more time on the foundations of the work and less time on impressing people or fathering your own nest. Always remember that the work is more important than you are. Finally, you will succeed only if you do something that benefits people other than yourself. The secret to increase is reciprocity. If you work only for your own self-interest, or if you try to hog all the benefits for yourself, people will not join in, and you will not prosper. But if you are called to do something that serves a larger interest, and you are willing to share the benefits with others, people will rally around you. Pass on your bounty to others, especially to the people who work with you. Your generosity will be rewarded in countless ways. When you focus on what you can contribute to the world rather than what you can take away from it, you help keep the good times going.");
        expectedDivination.put("The Image","Wind and thunder, this is the image of increase, thus the superior person when sees the good, imitates it, when he has faults, corrects himself, versioning systems");
        if(yiIncrease.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber (YiIncrease yiIncrease) {
        String hasTheSameNumber = "Yi Increase has the same number "+ yiIncrease.getNumber();
        String doesNotHaveTheSameNumber = "Yi Increase does not have the same number";
        int expectedNumber = 42;
        if(yiIncrease.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
