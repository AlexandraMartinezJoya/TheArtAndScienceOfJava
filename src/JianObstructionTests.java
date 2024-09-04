import IChingClasses.JianObstruction;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JianObstructionTests extends ConsoleProgram {

    public void run() {
        JianObstruction jianObstruction = new JianObstruction();
        String hasSameImage = hasSameImage(jianObstruction);
        println(hasSameImage);
    }

    public String hasSameImage(JianObstruction jianObstruction){
        String hasSameImage = "Jian Obstruction has the same image";
        String doesNotHaveTheSameImage = "Jian Obstruction does not have the same image";
        GImage expectedImage = new GImage( "../IChingImages/UpToSixtyFour/39.JianObstruction.jpg");
        if(jianObstruction.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(JianObstruction jianObstruction){
        String hasTheSameImagePath = "Jian Obstruction has the same image path";
        String doesNotHaveTheSameImagePath = "Jian Obstruction does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/39.JianObstruction.jpg";
        if(jianObstruction.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(JianObstruction jianObstruction) {
        String hasTheSameElementName = "Jian Obstruction has the same element name " + jianObstruction.getElementName();
        String doesNotHaveTheSameElementName = "Jian Obstruction does not have the same element name";
        String expectedElementName = "Water, Mountain";
        if(jianObstruction.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(JianObstruction jianObstruction){
        String hasTheSameQualities = "Jian Obstruction has the expected qualities "+ jianObstruction.getElementQualities();
        String doesNotHaveTheSameQualities = "Jian Obstruction does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Limping" );
        expectedQualities.put("2", "Stumbling");
        expectedQualities.put("3", "Adversity");
        expectedQualities.put("4", "Impediment");
        expectedQualities.put("5", "Trouble");
        expectedQualities.put("6", "Difficulty");
        expectedQualities.put("7", "Hardship");
        expectedQualities.put("8", "Hindrance");
        expectedQualities.put("9", "Looking inward");
        expectedQualities.put("10", "Self-reflection");
        expectedQualities.put("11", "Surmounting the obstacles within");
        if(jianObstruction.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(JianObstruction jianObstruction){
        String hasTheSameDivination = "Jian has the same divination with the keywords " + jianObstruction.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Jian does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Jian - Obstruction");
        expectedDivination.put("Keywords","Limping, stumbling, adversity, impediment, trouble, difficulty, hardship, hindrance, looking inward, self-reflection, surmounting the obstacles within");
        expectedDivination.put("The Judgement","Obstruction. The southwest is beneficial. The northeast is not. It is beneficial to see a great person. Perseverance beings good fortune.");
        expectedDivination.put("Judgement Description","The southwest represents receptivity and patience, the northeast represents assertion and advance. Hence the text says that instead of pressing ahead urgently one should hold back and accept the situation for what it is. You are faced with obstacles that you cannot overcome. The more you struggle with your problems, the larger they seem to loom. It is time to take a break from your efforts and pause. Stop trying to enforce your will. Instead, look at the things with detachment, humility, and acceptance. Be willing to learn. The point of detaching yourself from your current struggles is not to give up hope of eventual success. Quite the contrary: you must be absolutely determined to prevail in the long run. Rather, the point is to restore your emotional balance and clear your head. Before you can regroup, you must free yourself from the emotional entanglements of past approaches that have been counterproductive. You need a fresh start and a fresh attitude. This is the meaning of the statement that the 'southwest' is beneficial. In the Book of Changes, the southwest is the direction associated with the earth. By adopting the virtues associated with earth: acceptance, humility, devotion, and patience - you will regain your composure and recharge your batteries. The text says 'it is beneficial to see a great person'. After you have taken the time to reassess the situation, you need to join forces with others. Ask for advice from people you respect and trust, and who understand you and your goals. They may have fresh perspectives. Don't be too stubborn to admit that you need help or too proud to accept it from others. Work together with people to tackle the problem rather than trying to go it alone. Finally, do not give up hope. Persevere. Even though you may have to wait, or make a strategic retreat, if you maintain an enduring devotion to achieving your goal, you will eventually prevail. The test of great character is the ability to let go and walk away temporarily from a goal while being utterly devoted to achieving it in the long run. The obstructions that you face today will help develop your character so that you can better meet the challenges of the future. When obstruction leads to reassessment and self-improvement, it can even be a blessing in disguise.");
        expectedDivination.put("The Image","Beyond the mountain, there is water, This is the image of obstruction, thus the superior person reflects on himself, and cultivates his character.");
        if(jianObstruction.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(JianObstruction jianObstruction) {
        String hasTheSameNumber = "Jian Obstruction has the same number "+ jianObstruction.getNumber();
        String doesNotHaveTheSameNumber = "Jian Obstruction does not have the same number";
        int expectedNumber = 39;
        if(jianObstruction.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }

}
