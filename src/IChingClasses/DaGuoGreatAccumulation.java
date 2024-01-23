package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class DaGuoGreatAccumulation extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public DaGuoGreatAccumulation(){
        image = new GImage("../IChingImages/IChingClasses.DaGuoGreatAccumulation.png");
        element = "Lake, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "To much" );
        qualities.put("2", "Overload");
        qualities.put("3", "Critical mass");
        qualities.put("4", "Taking a stand");
        qualities.put("5", "Setting priorities");
        qualities.put("6", "Making choices");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Mid Autumn");
        seasonsAndWeather.put("2", "");
        divination = getDivinationText();
        number = 28;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Da Guo - Great Accumulation";
        String keywords = "Greatness in Excess. The ridgepole sags. It is beneficial to have somewhere to go. Success";
        String theJudgement = "Joy, Success. It is beneficial to persevere";
        String theJudgementDescription = "The ridgepole is a support beam on which the weight of the entire roof rests. The load that it bears is too great, therefore, it sags to the breaking point. The ridgepole is a metaphor for a situation which stresses and strings have reached their maximum. Something will have to give. Da Guo describes an exceptional time. Circumstances have reached a point of crisis. You face great pressures from all directions. Perhaps you have taken on too much, or perhaps obligations and expectations that were at one point bearable and reasonable have slowly but surely increased to the point that they have become too great. Whatever the case, something needs to be done, and quickly. You must make a transition to a new situation without delay. Nevertheless, you cannot force matters. A sudden movement of ridgepole under great stress will snap it, bringing the whole roof crashing down. In the same way, the stresses and strains of the situation cannot be relieved by rash action. Instead, you must carefully consider the underlying causes of the crisis that you now find yourself in. There is 'too much' in the situation, but you need to figure out what to much is. Perhaps you have overestimated what you can do because you are too eager to get ahead, or because you lack the necessary skills and talents. You have not learned the value of patience and proper preparation. Perhaps you have become too aggressive or to obsessive, on the one hand, or too anxious and apprehensive on the other. Your fears and obsessions have cut you off from others, or have led you to engage in self-destructive habits. Perhaps the pressure comes from your relationships with others. You or another person may be engaged in obsessive or excessive behavior. Your judgement- or theirs - is impaired because emotions and insecurities are running high. Whatever the problem, you must act now to restore the balance in your life. It is up to you to restore a sense of reality and stability to the situation. Things cannot go on as they have been. You must reassess your priorities. You must make a change. Once you have decided what the problem is, you must act quickly but with gentleness and composure. The time calls for extraordinary measures, but the transition to the new situation must be peaceful and non-violent. The problem has been a growing imbalance. The solution will only come from restoriing balance, not from excerbating the problem. A time of greatness in excess calls for a corresponding greatness in your character. Not only must you recognize the need for change, but you must carry it out gently and swiftly, without fear or anxiety.";
        String theImage = "The lake rises over the trees, this is the image of greatness in excess. Thus the superior person, when he stands alone, in unafraid, and if he has to renounce the world, he is undaunted.";
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

    public String getFamilyMember() {
        return familyMember;
    }

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

    public int getNumber(){return number;}

    void create() { new DaGuoGreatAccumulation();}
}
