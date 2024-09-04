import IChingClasses.JianDevelopingGradually;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JianDevelopingGraduallyTests extends ConsoleProgram {

    public void run() {
        JianDevelopingGradually jian = new JianDevelopingGradually();
        String hasSameImage = hasSameImage(jian);
        println(hasSameImage);
    }

    String hasSameImage(JianDevelopingGradually jian) {
        String hasSameImage = "Jian Developing gradually has same image";
        String doesNotHaveSameImage = "Jian Developing Gradually does not have same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/53.JianDevelopingGradually.jpg");
        if(jian.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    String hasSameImagePath(JianDevelopingGradually jian){
        String hasSameImagePath = "Jian has same image path";
        String doesNotHaveSameImagePath =  "Jian does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/53.JianDevelopingGradually.jpg";
        if(jian.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    String hasSameElement(JianDevelopingGradually jian) {
        String hasSameElement = "Jian has same element and it is: " +  jian.getElementName();
        String doesNotHaveSameElement = "Jian does not have the same element";
        String expectedElementName = "Wind, Mountain";
        if(jian.getElementName().equals(expectedElementName)) {
            return hasSameElement;
        } else {
            return doesNotHaveSameElement;
        }
    }

    String hasSameQualities (JianDevelopingGradually jian) {
        String hasSameQualities = "Jian has the same element qualities";
        String doesNotHaveTheSameQualities = "Jian does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Gradual advance");
        expectedQualities.put("2", "Slow");
        expectedQualities.put("3", "Steady development");
        expectedQualities.put("4", "Progress step by step");
        expectedQualities.put("5", "Faithfulness");
        expectedQualities.put("6", "Persistence");
        if(jian.getElementQualities().equals(expectedQualities)) {
            return hasSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    String hasSameDivination(JianDevelopingGradually jian) {
        String hasSameDivination = "Jian has the same divination";
        String doesNotHaveTheSameDivination = "Jian does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Jian Developing Gradually");
        expectedDivination.put("Keywords","Gradual advance, slow, steady development, Progress step by step, Faithfulness, persistence");
        expectedDivination.put("The Judgement","Gradual Advance, The maiden is given in marriage, good fortune, it is beneficial to persevere");
        expectedDivination.put("Judgement Description","There is the promise of future success, but you must allow the situation to develop gradually in order to realize it. The Book of Changes compares the situation to a long period of courtship, bethothal, and engagement. The parties must get to know each other and develop bonds of shared commitment and trust to accompany bonds of initial attraction. The couple's families must be brought together. Plans must be established. Ritual formalities must be observed. All of these things take time. What is true of marriage is true of all other forms of courtship and persuation. If you are trying to get other people to make a major commitment, or to do something important, don't expect them to be convinced overnight. You must be considerate and allow them to move toward a decision gradually after they have obtained the requisite level of trust and confidence. If you allow things to develop at their own pace, you will lay a firm foundation for your future success. Don't be anxious for quick results or greedy to get everything at once. You may well get some short-term benefits, but in the long term nothing good will come of it and what you have won in this fashion is unlikely to endure. Rash or reckless action will undermine the very features of the situation that are likely to produce the most good for the longest period of time. You must be patient and have faith that things will work out as they must, exactly in the right way. Similarily, do not think you can get immediate results through clever manipulation. This will also backfire. Rather, tried and true methods are the best way to obtain a positive outcome. Although you must be patient, that does not mean that you should do nothing. To the contrary, you should continually focus on your long-term goal. Progress will often be slow. Hence you must persevere in order that things do not bog down. Be gentle. Do not try to force matters. As new problems arise - and they will invetiably will, remain adaptable and flexible. Externally, maintain poise and calm. Internally, maintain your determination to succeed. Similar concerns apply to the cultivation of your character. Perhaps you want to reform your life or make a change to a more rewarding lifestyle. It is entirely appropriate that you make some changes at once. But you cannot become a completely better, happier person overnight. You will need time to adjust to the new conditions.");
        expectedDivination.put("The Image","On the mountain there is a tree, This is the image of Developing Gradually, Thus the superior person abides in thw worthiness and virtue And so improves the lives and values of ordinary people");
        if(jian.getDivination().equals(hasSameDivination)) {
            return doesNotHaveTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    String hasTheSameNumber(JianDevelopingGradually jian) {
        String hasTheSameNumber = "Jian has the same number";
        String doesNotHaveTheSameNumber = "Jian does not have the same number";
        int number = 53;
        if(number == jian.getNumber()) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
