import IChingClasses.ZhongFu;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class ZhongFuTests extends ConsoleProgram {

    public void run() {
        ZhongFu zhongFu = new ZhongFu();
        String hasSameImage = hasSameImage(zhongFu);
        println(hasSameImage);
    }

    public String hasSameImage(ZhongFu zhongFu){
        String hasSameImage = "Zhong fu has the same image";
        String doesNotHaveTheSameImage = "Zhong Fu does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/61.ZhongFu.jpg");
        if(zhongFu.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSAmeImagePath(ZhongFu zhongFu) {
        String hasSameImagePath = "Zhong Fu has same image path";
        String doesNotHaveSameImagePath = "Zhong Fu does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/61.ZhongFu.jpg";
        if(zhongFu.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasSameElementName(ZhongFu zhongFu) {
        String hasSameElementName = "Zhong Fu has the same element name and it is " + zhongFu.getElementName();
        String doesNotHaveTheSameElementName = "Zhong Fu does not have the same element name";
        String expectedElementName = "Wind, Lake";
        if(zhongFu.getElementName().equals(expectedElementName)){
            return hasSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities (ZhongFu zhongFu) {
        String hasTheSameQualities = "Zhong Fu has the same qualities and they are " + zhongFu.getElementQualities();
        String doesNotHaveTheSameQualities = "Zhong Fu does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Windy Lake" );
        expectedQualities.put("2", "Inner sincerity");
        expectedQualities.put("3", "Inner faithfulness");
        expectedQualities.put("4", "Trustworthiness");
        expectedQualities.put("5", "Conformity between what is outside and inside");
        expectedQualities.put("6", "As within so outside");
        expectedQualities.put("7", "Trusting your own instincts");
        expectedQualities.put("8", "Being able to listen to yourself");
        expectedQualities.put("9", "Inner knowledge");
        expectedQualities.put("10", "Bell");
        if(zhongFu.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(ZhongFu zhongFu) {
        String hasTheSameDivination = "Zhong Fu has the same divination with the keywords " + zhongFu.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Zhong Fu does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Zhong Fu - Inner truth");
        expectedDivination.put("Keywords","Windy Lake. Inner sincerity. Inner faithfulness, trustworthiness. Conformity between what is outside and inside. as within so outside, trusting your own instincts, being able to listen to yourself, inner knowledge");
        expectedDivination.put("The Judgement","Inner truth, inner sincerity, Good fortune. It is beneficial to cross the great river");
        expectedDivination.put("Judgement Description","The Book of Changes regards truth as one of the most powerful forces in the universe. If you want to influence other people, there is no better way than through the truth that lies within you. Possessing  inner truth means that you are sincere. You are on the inside what you appear to be on the outside. You are honest and genuine both in your words and your deeds. You say what you mean and you mean what you say. Such a person naturally inspires trust and confidence in others. Even the most difficult and contentious people will respond to someone whom they recognize is sincere and aboveboard. The most powerful advocates are those who genuinely believe in the rightness of their cause. Many speaks try to win influence by manipulating or flattering others. They may confuse and even impress momentarily, but their audiences do not really trust them. On the other hand, when people are completely sincere, their character shines through to others with the most powerful effect. Indeed, the text says that even pigs and fish respond to the power of inner truth. To influence others, you must approach them in the proper manner. If you want them to be receptive to you, then you must also be receptive to them. Listen to what other people have to say. Try to see things from their point of view. Open your heart and your mind and assume that you have as much to learn from them as they have to learn from you. When you do this, you will be able to see the truth in their way of thinking, and they, in turn, will be able to see truth in yours. Once you understand what is important to them, you will be able to express yourself in the right way. Nevertheless, inner truth is not simply a device for persuading others. It is a way of living your life. The word truth, is also the word for confidence, trust, and reliability. If you want to have these things in your dealing with the outside world, you must possess each of them within. First, to possess inner truth you must know yourself. Then you can trust your instincts in any situation. Second, to possess inner truth means that ou have personal integrity, a stable center, and a core of beliefs and principles to which you remain true. If you lack these things, your life will be shallow and unfulfilling. You cannot compensate for them by relying on other people and things to give yourself stability or fill and inner emptiness. Third, inner truth means inner confidence. To possess inner truth means that you are self-reliant and have faith in yourself. If you are conflicted and uncertain, this will be reflected in your behavior and in dealings with others. As a result, people will lose confidence in you. You must believe in yourself if you want others to believe in you. Indeed, you will find that the power of inner truth is contagious. A person with supreme confidence inspires others and gives them confidence as well. Fourth, to possess inner truth means that you must be honest with yourself. Self-deception will inevitably affect your choices and your relationships. People who hide things from themselves cannot help hiding things from others. That is why inner truth is crucial to behaving with rectitude toward the outside world. You cannot be true to others if you are not true to yourself.");
        expectedDivination.put("The Image","Wind over lake. This is the image of inner truth. Thus the superior person discusses criminal cases carefully, and postpones executions.");
        if(zhongFu.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(ZhongFu zhongFu){
        String hasTheSameNumber = "Zhong Fu has the same number and it is " + zhongFu.getNumber();
        String doesNotHaveTheSameNumber = "Zhong Fu does not have the same number";
        int expectedNumber =  61;
        if( zhongFu.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
