package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class DingTheCaldron extends IChingStone implements IChingLineNames {

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

    public DingTheCaldron(){
        imagePath = "../IChingImages/UpToSixtyFour/50.DingTheCaldron.jpg";
        image = new GImage(imagePath);
        element = "Fire, Wind, wood";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Cultural renewal" );
        qualities.put("2", "In with the new");
        qualities.put("3", "Establishing things");
        qualities.put("4", "Formation in a new order");
        qualities.put("5", "Devotion");
        qualities.put("6", "Creation of new rituals");
        qualities.put("7", "Polishing your talents");
        qualities.put("8", "Seeking spiritual values");
        qualities.put("9", "Being of service to others");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "body aura");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        divination = getDivinationText();
        number = 50;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Ding - The caldron";
        String keywords = "The Caldron, Cultural renewal, In with the new, Establishing things, Formation in a new order, Devotion, creation of new rituals, polishing your talents, seeing spiritual values, being of service to others";
        String theJudgement = "The Caldron, Supreme good fortune, success.";
        String theJudgementDescription = "The Ding, or ritual caldron, formed part of a religious service in which sacrifices were made to a divinity. Through this ritual, people purified themselves and rededicated themselves to spiritual ends. The text urges you to model yourself after the Ding. It is time to purify your motives and devote yourself to worthy aims. The text promises success and supreme good fortune. But it is not necessarily worldly success. Indeed, it is time to abandon materialism and selfishness. You will make progress not from chasing after greater wealth or social status but from pursuing spiritual values such as kindness, generosity, and service to others. Different ingredients were mixed in the ritual caldron and then cooked together to fom a divine offering. In the same way, you must now gather the different ingredients of your world and combine them together to produce something worthwhile. That the raw materials of your life and transform them into something new and wonderful. These raw ingredients inclusde your talents. Keep your skills in good repair by employing them in the service of others. Don't waste your abilities on things that are trivial or unworthy of you. The raw materials of life also include opportunities in your environment. Look around you. There are hidden possibilities everywhere for you to deploy and improve your skills. You may fear that you lack the ability or the qualities of mind and heart necessary to succeed. Do not be concerned. You do have something to contribute to the situation, whether you know it or not. Within every person there lies a divine presence. It is up to you to discover it and develop your life. Ding teaches that you can transform yourself and your world if you do so not for selfish ends but in pursuit of something truly valuable. Quietly support others and help them to succeed. Assist other people without any desire to take credit for their success. Conduct yourself with modesty and devotion. Like the ritual caldron, you can be a source of inspiration to others. People will draw strength from you and follow your example.";
        String theImage = "Above wood there is fire, This is the image of the caldron, thus the superior person consolidates his fate by making his position correct";
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

    public String getImagePath() { return imagePath; }

    @Override
    public void create() { new DingTheCaldron();}
}
