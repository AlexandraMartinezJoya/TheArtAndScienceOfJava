package IChingClasses;

import IChingClasses.IChingLineNames;
import IChingClasses.IChingStone;
import acm.graphics.GImage;

import java.util.HashMap;

public class DaGuo  extends IChingStone implements IChingLineNames {

    GImage image;
    String imagePath;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public DaGuo() {
        imagePath = "../IChingImages/UpToSixtyFour/28.DaGuo.jpg";
        image = new GImage(imagePath);
        element = "Lake, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Too much" );
        qualities.put("2", "Overload");
        qualities.put("3", "Critical mass");
        qualities.put("4", "Taking a stand");
        qualities.put("5", "Setting priorities");
        qualities.put("6", "Making choices");
        qualities.put("7", "Preponderance of the great");
        divination = getDivinationText();
        number = 28;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Da Guo - Greatness in excess";
        String keywords = "Preponderance of the great, Too much, overload, Critical mass, taking a stand, setting priorities, making choices";
        String theJudgement = "Greatness in excess, The ridgepole sags, Its beneficial to have somewhere to go, success";
        String theJudgementDescription = "The ridgepole is a support beam on which the weight of the entire room rests. The load that it bears is to great, therefore it sags to the breaking point. The ridgepole is a metephor for a sittuation for which stresses and strains have reached their maximum. Something will have to give.  Da Guo describes an exceptional time. Circumstances have reached a point of crisis. You face pressures from all directions. Perhaps you have taken on to much , or perhaps expectations and obligations that were at one point bearable and reasonable have slowly but surely increased to the point that they became to great. Whatever the case, something needs to be done, and quickly. You must make a transition to a new sittuation without delay. Nevertheless you cannot force matters.  A sudden movement under the ridgepole under great stress will snap it, bringing the whole roof crashing down. In the same way, the stresses and the strains of the situation cannot be relived by rash actions. Instead you must carefully consider the underlying causes of the crisis that you now find yourself in. There is 'to much' in the sittuation, but you need to consider what that to much is. Perhaps you have overestimated what you can do because you are to eager to get ahead, or because you lack the necessary skills and talents. You have not learned the value of patience and proper preparation. Perhaps you have became to aggressive or to obsessive, on the one hand, or too anxious and apprehensive on the other. Your fears and obsessions have cut you off from others, or have led you to engage in self-destructive habits. Perhaps the pressure comes from your relationships with others. You or another person may be engaged in obsessive and  excessive behaviour. Your judgement, or theirs, is impaired because emotions and insecurities are running high. Whatever the problem, you must act now to restore balance in your life, It is up to you to restore a sense of reality and stability to the situation. Things cannot go on as they have been. You must reassess your priorities. You must make a change. Once you have decided what the problem is, you must act quickly but with gentleness and composure. The time calls for extraordinary measures, but the transition must be peacefull and nonviolent. The problem has been a growing imbalance. The solution will only come from restoring balance, not from exacerbating the problem. A time for greatness in excess calls for a corresponding greatness in your character. Not only must you recognize the need for change, but you must carry it out gently and swiftly , without fear or anexiety";
        String theImage = "The lake over the trees, this is the image of greatness in excess. Thus the superior person when he stands alone, is unafraid, and if he has to renounce the world , he is undaunted";
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

    public String getImagePath() { return imagePath; }

    @Override
    public void create() {
        new DaGuo();
    }
}
