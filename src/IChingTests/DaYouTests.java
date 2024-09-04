package IChingTests;

import IChingClasses.DaYou;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class DaYouTests extends ConsoleProgram {

    public void run(){
        DaYou daYou = new DaYou();
        String daYouHasTheSameImage = daYouHasTheSameImage(daYou);
        println(daYouHasTheSameImage);
    }

    public String daYouHasTheSameImage(DaYou daYou) {
        String daYouHasTheSameImage = "Da you has the same image as expected";
        String daYouDoesNotHaveTheSameImageAsExpected = "Da You does not have the same expected image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/14.DaYou.jpg");
        if(daYou.getIChingImage().equals(expectedImage)) {
            return daYouHasTheSameImage;
        } else {
            return daYouDoesNotHaveTheSameImageAsExpected;
        }
    }

    public String daYouHasSameImagePath(DaYou daYou){
        String daYouHasTheSameImagePath = "Da You has the same image path";
        String daYouDoesNotHaveTheSameImagePath = "Da you does not have the same image path";
        String expectedPath = "../IChingImages/UpToSixtyFour/14.DaYou.jpg";
        if(daYou.getImagePath().equals(expectedPath)) {
            return daYouHasTheSameImagePath;
        } else {
            return daYouDoesNotHaveTheSameImagePath;
        }
    }

    public String daYouHasSameElementName(DaYou daYou) {
        String daYouHasSameElementName = "Da You has the same element name and it is: "+ daYou.getElementName();
        String daYouDoesNoHaveSameElementName = "Da You does not have same element name";
        String expectedElementName = "Fire, Heaven";
        if(daYou.getElementName().equals(expectedElementName)) {
            return daYouHasSameElementName;
        } else {
            return daYouDoesNoHaveSameElementName;
        }
    }

    public String daYouHasSameQualities (DaYou daYou) {
        String daYouHasTheSameElementQualities = "Da You has the same element qualities and they are"+ daYou.getElementQualities();
        String daYouDoesNotHaveSameElementQualities = "Da you does not have the same element qualties";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Fire on top of heaven" );
        expectedQualities.put("2", "Possession in great measure.");
        expectedQualities.put("3", "Accumulation of truths");
        expectedQualities.put("4", "Many truths at the same time");
        expectedQualities.put("5", "Internal family system");
        expectedQualities.put("6", "Supreme success");
        expectedQualities.put("7", "Inner truth");
        expectedQualities.put("8", "Inner sincerity");
        expectedQualities.put("9", "Bell");
        if(daYou.getElementQualities().equals(expectedQualities)){
            return daYouHasTheSameElementQualities;
        } else{
            return daYouDoesNotHaveSameElementQualities;
        }
    }

    public String daYouHasTheSameDivination(DaYou daYou) {
        String daYouHasTheSameDivination = "Da you has the same divination with the keyords: "+daYou.getDivination().get("Keywords");
        String daYouDoesNotHaveTheSameDivination = "Da you does not have the same divination";
        HashMap expectedDivination = new HashMap<>();
        expectedDivination.put("Title", "Da You - Possession in great measure");
        expectedDivination.put("Keywords", "Fire on top of heaven. Supreme success. Possession in great measure");
        expectedDivination.put("The Judgement", "Inner truth, inner sincerity, Good fortune. It is beneficial to cross the great river");
        expectedDivination.put("Judgement Description", "The Book of Changes regards truth as one of the most powerful forces in the universe. If you want to influence other people, there is no better way than through the truth that lies within you. Possessing  inner truth means that you are sincere. You are on the inside what you appear to be on the outside. You are honest and genuine both in your words and your deeds. You say what you mean and you mean what you say. Such a person naturally inspires trust and confidence in others. Even the most difficult and contentious people will respond to someone whom they recognize is sincere and aboveboard. The most powerful advocates are those who genuinely believe in the rightness of their cause. Many speaks try to win influence by manipulating or flattering others. They may confuse and even impress momentarily, but their audiences do not really trust them. On the other hand, when people are completely sincere, their character shines through to others with the most powerful effect. Indeed, the text says that even pigs and fish respond to the power of inner truth. To influence others, you must approach them in the proper manner. If you want them to be receptive to you, then you must also be receptive to them. Listen to what other people have to say. Try to see things from their point of view. Open your heart and your mind and assume that you have as much to learn from them as they have to learn from you. When you do this, you will be able to see the truth in their way of thinking, and they, in turn, will be able to see truth in yours. Once you understand what is important to them, you will be able to express yourself in the right way. Nevertheless, inner truth is not simply a device for persuading others. It is a way of living your life. The word truth, is also the word for confidence, trust, and reliability. If you want to have these things in your dealing with the outside world, you must possess each of them within. First, to possess inner truth you must know yourself. Then you can trust your instincts in any situation. Second, to possess inner truth means that ou have personal integrity, a stable center, and a core of beliefs and principles to which you remain true. If you lack these things, your life will be shallow and unfulfilling. You cannot compensate for them by relying on other people and things to give yourself stability or fill and inner emptiness. Third, inner truth means inner confidence. To possess inner truth means that you are self-reliant and have faith in yourself. If you are conflicted and uncertain, this will be reflected in your behavior and in dealings with others. As a result, people will lose confidence in you. You must believe in yourself if you want others to believe in you. Indeed, you will find that the power of inner truth is contagious. A person with supreme confidence inspires others and gives them confidence as well. Fourth, to possess inner truth means that you must be honest with yourself. Self-deception will inevitably affect your choices and your relationships. People who hide things from themselves cannot help hiding things from others. That is why inner truth is crucial to behaving with rectitude toward the outside world. You cannot be true to others if you are not true to yourself.");
        expectedDivination.put("The Image", "Wind over fire. This is the image of inner truth. Thus the superior person discusses criminal cases carefully, and postpones executions. Cuvant purtat de vant, Who by truth");
        if(daYou.getDivination().equals(expectedDivination)) {
            return daYouHasTheSameDivination;
        } else {
            return daYouDoesNotHaveTheSameDivination;
        }
    }

    public String daYouHasSameNumber(DaYou daYou) {
        String daYouHasTheSameNumber = "Da you has the same expected number of "+ daYou.getNumber();
        String daYouDoesNotHaveTheSameNumber = "Da you does not have the same expected number";
        int expectedNumber = 14;
        if(daYou.getNumber()==expectedNumber) {
            return daYouHasTheSameNumber;
        } else {
            return daYouDoesNotHaveTheSameNumber;
        }
    }

}

