package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class XianMutualInfluence extends IChingStone implements IChingLineNames {

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

    public XianMutualInfluence(){
        imagePath = "../IChingImages/UpToSixtyFour/31.XianMutualInfluence.jpg";
        image = new GImage(imagePath);
        element = "Lake, Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Influence" );
        qualities.put("2", "Reciprocity");
        qualities.put("3", "Mutual attraction");
        qualities.put("4", "Courtship");
        qualities.put("5", "Wooing");
        qualities.put("6", "Lake on top of a mountain");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 31;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Xian Mutual Influence";
        String keywords = "Influence, Reciprocity, Mutual attraction , Courtship, Wooing, Lake on top of a mountain";
        String theJudgement = "Mutual influence. Success. It is beneficial to persevere. To marry a woman brings good fortune";
        String theJudgementDescription = "The theme of Xian is attraction, influence, and the formation of relationships. The relationship in question may be a love affair, but it could also be a friendship, family relations, a professional relationship, a business connection, or a political alliance. Relationships need time to grow, so that the parties can gradually gain trust and a degree of comfort with each other. This is symbolized by the union of Dui (Joy, Acceptance) with Gen(Patience, keeping still. Aggressiveness and impatience may damage the relationship in its initial stages. Do not try to force matters or achieve everything overnight. Mutual attraction has its own ways that are not fully under the control of either party. It must develop naturally, on it's own terms. The theme of Xian is not simply influence but mutual influence. In forming relationships, do not try to manipulate or dominate, or force the other person to your own way of thinking. Influence must always be reciprocal, a matter of give and take. Only in this way can it be happy and long-lasting. There is an important difference between courtship and seduction. Seduction is the result of momentary enthusiasm; it is a desire to manipulate and control in order to fill up the emptiness that lies within the heart of the seducer. That emptiness, however, can never be filled, and therefore it leads to ever new desires, ever new attempts to conquest and control, ever new struggles to force the production of love in another heart. Because it is not founded on mutual trust and respect, it will inevitably end in betrayal and unhappiness. If you desire to form a relationship with another, ask yourself whether you and the other person are engaged in courtship or seduction. Hence the text says it is beneficial to persevere, for perseverance marks the difference between short-term seduction and long-term commitment. Courtship should not be pursued for its own sake, but for the commitment it produces. Influence should not pursued for its own sake, but for the good things that it helps being into being. Through mutual attraction, people with complementary talents and affinities are brought together and create something great and lasting. Hence the text says 'to marry a woman brings good fortune'. Just as one should not seek love merely in order to seduce but in order to produce relationships that last, one should not seek to be influential simply to become famous and powerful but in order to achieve something of purpose and value. Finally, Xian teaches that the nature of a thing can be determined by what it attracts and what it is attracted to. What kind of company do you keep and what kind of people do you pursue? If your relationships are unhappy, perhaps it is because you are attracting or pursuing the wrong sort of people, or perhaps it is because of some unhealthy vision you have about yourself. Good relationships are bringing out in you and in the people you are connected to.";
        String theImage = "A lake on the mountain, this is the image of Mutual Influence. The superior person receives others because he is open to them.";
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

    public String getImagePath() {return imagePath; }

    @Override
    public void create() { new XianMutualInfluence();}

}
