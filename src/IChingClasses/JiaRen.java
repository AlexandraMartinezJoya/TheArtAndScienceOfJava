package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class JiaRen extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public JiaRen(){
        image = new GImage("../IChingImages/UpToSixtyFour/37.JiaRen.jpg");
        element = "Wind, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "The household" );
        qualities.put("2", "The family");
        qualities.put("3", "The clan");
        qualities.put("4", "Close knit group");
        qualities.put("5", "House people");
        qualities.put("6", "Playing your part");
        qualities.put("7", "Establishing expectations");
        qualities.put("8", "Serving as an example");
        qualities.put("9", "Creating mutuality and trust");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "body aura");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        divination = getDivinationText();
        number = 37;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Jia Ren The family";
        String keywords = "The household, the family, the clan, close-knit groups, house people, playing your part, establishing expectations, serving as an example, creating mutuality and trust";
        String theJudgement = "The family. The perseverance of a woman is beneficial";
        String theJudgementDescription = "Although the hexagram Jia Ren concerns the family, in ancient China the family was a metaphor and model for virtually all other forms of social organization. Hence the hexagram is also about the ideal forms of social life and social relations. Each member of the family - father, mother, son, daughter, elder sibling, younger sibling - had specific duties and relationships, When each of them fulfilled their proper obligations to the others, each of them played their respective role (as father, mother, son, daughter, etc.) appropriately, and the family was well ordered. The Chinese believed that if the family was well ordered, then all of society would be well ordered. \n" +
                "In ancient Chinese society, men were expected to the heads of households, women were expected to be subordinate to them. The relationship between superior and subordinate was analogized to that between a man and a woman in a family. Hence a suborditate is always yin to the superior's yang. Because in China, everyone was subordinate to someone else, everyone - including all men - were yin to somebody else's yang. Thus when the text says 'preserverance of a woman is beneficial' it refers to the steadfast uprightness of a person who is in a yin (subordinate) position. In today's more egalitarian society, we cannot accept the Book of Changes assumptions about the respective roles of sexes, or its acceptance of natural hierarchies among people based on the model of the family. Nevertheless, the more general advice that the book of changes offers is still valid. It applies to any social relationship, and especially to close-knit organizations. If you want the relationship or the organization to run smoothly, you must be committed to it. Play your appropriate and assigned role and work for the greater good of everyone involved. If everyone in the organization does this, it will be well ordered and peace will reign. Duties and responsabilties should be laid out clearly in advance so that everyone knows their role and feels that they will be valued for their contribution. whether they are a leader, a follower, a specialist, or one among equals. The group should be well ordered so that people know what they can expect from others and know what is expected of them. They must be able to take pride in their contribution to the greater good and they must be honored and recognized for what they do. Tehn they will not feel abused or put upon and social bonds will be strenthend over time. It is not enough to assign people roles and expect them to fill them. Trust, consideration, and mutual affection are necessary for relationships to thirive and prosper. Mechanically, enforcing otder misses the informal elements of mutuality, reciprocity, and affection that are necessary to any successful long-term alliance. If the relationship is too rigid, it will not stand the stresses that everyday life puts on it, much less the strains caused by a genuine crisis. Mutuality and benevolence bind the group together and give it the flexibility to improvise and change to meet changing times. If you have not been paying enough attention to your relationships, now is a good time to mend fences, renew lines of communication, and show people that you care about and repsect them. Remember that the social cement of courtesy and reciprocity binds close-knit groups together. All too often we treat people we live with every day with less respect and give them less attention than we do perfect strangers or mere aquaintances that we are trying to impress. Intimacy should not mean taking people for granted. Rather, it should mean valuing those close to you especially. Showing a little consideration every now and then will help keep the relationship together through adversity. If the problem is lack of discipline, you should immediately take steps to restore order. It may be necessary to get tough for a while until appropriate expectations are reestablished. But the point of discipline is not to weild power or to inflict punishment for its own sake. It is to let everyone know where they stand and show them how others rely on them. Good discipline and clear expectations within the family can actually support the mutual trust and affection of its members, just as trust and effection can help keep relationships well ordered and running smoothly.";
        String theImage = "Wind emerges from the fire, this is the image of family, thus the superior person ensures that his words have substance and his deeds constancy";
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

    public int getNumber() { return number;}

    @Override
   public void create() { new JiaRen();}
}
