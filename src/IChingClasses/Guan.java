package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Guan extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Guan(){
        image = new GImage("../IChingImages/UpToSixtyFour/20.JianDevelopingGradually.jpg");
        element = "Wind, Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Observation");
        qualities.put("2", "Notice");
        qualities.put("3", "Contemplation");
        qualities.put("4", "Serving as an example");
        qualities.put("5", "Taking an overview");
        qualities.put("6", "Understanding");
        qualities.put("7", "Self-examination");
        qualities.put("8", "Spiritual connection");
        qualities.put("9", "Inner clarity leads to successful action in the world");
        qualities.put("10", "Inner observation and analysis");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 20;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Guan ";
        String keywords = "observation, contemplation, serving as an example, taking an overview, understanding, self-examination, spiritual connection, inner clarity leads to successful action in the world";
        String theJudgement = "Viewing, The ablution has been made, but not yet offering, filled with trust and sincerity, they are reverent and dignified.";
        String theJudgementDescription = "The text describes a religious ceremony in ancient China in which the leader first pours out a ritual libation and then makes a sacrifice in front of the people. The text focuses on the magical moment between these two acts, when all attention is focused on the leader, religious reverence and spiritual contemplation are at their height. In the book of changes, guan is metaphor for contemplation. Contemplation does not mean turning away from the world. Rather it means taking the time to understand the workings of the universe, one's own nature, and one's place in a world of continuity and change. Contemplation is more than the acumulation of bits of knowledge, more than the assimilation and memorization of true factual propositions. It is a profoundly spiritual practice. Through opening one's self to hidden realities and to the possibilities latent in the world, the self is transformed. People who are able to contemplate themselves and the world with utter clarity are thereby imbued with the power to change themselves and the world. Their understanding gives them an uncanny spiritual force that naturally emanates from them and influences others. Sensing the power of their thought, others look up to them and follow them. This is the connection between looking and being looked up to, between contemplation and serving as an example for others. It is the connection between inner truth and outward effect. The challenge you face now is to take a new look at the sittuation. Put aside older ways of imagining things and take a broader view. Be open minded and not allow your emotions to cloud your judgement. Try to face reality as it is and not as you might want it to be. Stop thinking about things from the standpoint of how they affect you personally and try to see the larger picture. Consider the origins of things and how matters arrived at the present state. This is a time to learn and to expand possibilties. If you can approach the situation with complete clarity and dispassion, you will be able to see the direction in which events are moving. And if you are willing to embrace the truth, whatever it might be, you will gain enormous power and influence in the long run. Do not be too concerned if people do not listen to you at first. As people recognize your commitment to the truth and the clarity of your thought, they will come around. Knowledge is not simply a collection of true statements. It is a social practice and a terrain of power. The force of conformity is very strong. Many people compromise their belifs and alter their understandings in order to fit in. And many others use their knowledge not for the good of mankind but to sieze the power and manipulate others in the short run. Do not follow this path. The right kind of influence will accrue to you only if you maintain your integrity.";
        String theImage = "The winds blows over the earth, this is the image of viewing, thus the kings of old inspected the four corners of the earth, observed the people, and gave them instruction";
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

    public int getNumber() { return number; }

    void create() { new Guan();}
}
