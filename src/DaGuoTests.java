import IChingClasses.DaGuo;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class DaGuoTests extends ConsoleProgram {

    public void run() {
        DaGuo daGuo = new DaGuo();
        String hasSameImage = hasSameImage(daGuo);
        println(hasSameImage);
    }

    public String hasSameImage(DaGuo daGuo){
        String hasTheSameImage = "Da Guo has the same image";
        String doesNotHaveTheSameImage = "Da Guo does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/28.DaGuo.jpg");
        if(daGuo.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(DaGuo daGuo) {
        String hasTheSameImagePath = "Da Guo has the same image path";
        String doesNotHaveTheSameImagePath =  "Da Guo does not have the same image path";
        String expectedImagePath =  "../IChingImages/UpToSixtyFour/28.DaGuo.jpg";
        if(daGuo.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(DaGuo daGuo) {
        String hasTheSameElementName = "Da Guo has the same expected element name "+ daGuo.getElementName();
        String doesNotHaveTheSameElementName = "Da Guo does not have the same element name";
        String expectedElementName =  "Lake, Wind";
        if(daGuo.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheExpectedQualities(DaGuo daGuo) {
        String hasTheExpectedQualities = "Da Guo has the expected qualities of "+daGuo.getElementQualities() ;
        String doesNotHaveTheExpectedQualities = "Da Guo does not have the expected qualities";
        HashMap expectedQualities = new HashMap<>();
        expectedQualities.put("1", "Too much" );
        expectedQualities.put("2", "Overload");
        expectedQualities.put("3", "Critical mass");
        expectedQualities.put("4", "Taking a stand");
        expectedQualities.put("5", "Setting priorities");
        expectedQualities.put("6", "Making choices");
        expectedQualities.put("7", "Preponderance of the great");
        if(daGuo.getElementQualities().equals(expectedQualities)) {
            return hasTheExpectedQualities;
        } else {
            return doesNotHaveTheExpectedQualities;
        }
    }

    public String hasSameDivination(DaGuo daGuo) {
        String hasTheSameDivination = "Da Guo has the expected divination with the keywords "+ daGuo.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Da Guo does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Da Guo - Greatness in excess");
        expectedDivination.put("Keywords","Preponderance of the great, Too much, overload, Critical mass, taking a stand, setting priorities, making choices");
        expectedDivination.put("The Judgement","Greatness in excess, The ridgepole sags, Its beneficial to have somewhere to go, success");
        expectedDivination.put("Judgement Description","The ridgepole is a support beam on which the weight of the entire room rests. The load that it bears is to great, therefore it sags to the breaking point. The ridgepole is a metephor for a sittuation for which stresses and strains have reached their maximum. Something will have to give.  Da Guo describes an exceptional time. Circumstances have reached a point of crisis. You face pressures from all directions. Perhaps you have taken on to much , or perhaps expectations and obligations that were at one point bearable and reasonable have slowly but surely increased to the point that they became to great. Whatever the case, something needs to be done, and quickly. You must make a transition to a new sittuation without delay. Nevertheless you cannot force matters.  A sudden movement under the ridgepole under great stress will snap it, bringing the whole roof crashing down. In the same way, the stresses and the strains of the situation cannot be relived by rash actions. Instead you must carefully consider the underlying causes of the crisis that you now find yourself in. There is 'to much' in the sittuation, but you need to consider what that to much is. Perhaps you have overestimated what you can do because you are to eager to get ahead, or because you lack the necessary skills and talents. You have not learned the value of patience and proper preparation. Perhaps you have became to aggressive or to obsessive, on the one hand, or too anxious and apprehensive on the other. Your fears and obsessions have cut you off from others, or have led you to engage in self-destructive habits. Perhaps the pressure comes from your relationships with others. You or another person may be engaged in obsessive and  excessive behaviour. Your judgement, or theirs, is impaired because emotions and insecurities are running high. Whatever the problem, you must act now to restore balance in your life, It is up to you to restore a sense of reality and stability to the situation. Things cannot go on as they have been. You must reassess your priorities. You must make a change. Once you have decided what the problem is, you must act quickly but with gentleness and composure. The time calls for extraordinary measures, but the transition must be peacefull and nonviolent. The problem has been a growing imbalance. The solution will only come from restoring balance, not from exacerbating the problem. A time for greatness in excess calls for a corresponding greatness in your character. Not only must you recognize the need for change, but you must carry it out gently and swiftly , without fear or anexiety");
        expectedDivination.put("The Image","The lake over the trees, this is the image of greatness in excess. Thus the superior person when he stands alone, is unafraid, and if he has to renounce the world , he is undaunted");
        if(daGuo.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(DaGuo daGuo) {
        String hasTheSameNumber = "Da Guo has the same number "+ daGuo.getNumber();
        String doesNotHaveTheSameNumber = "Da Guo does not have the same number";
        int expectedNumber = 28;
        if(daGuo.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
