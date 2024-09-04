package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Dun extends IChingStone implements IChingLineNames {

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

    public Dun () {
        imagePath = "../IChingImages/UpToSixtyFour/33.Dun.jpg";
        image = new GImage(imagePath);
        element = "Heaven, Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", " The piglet" );
        qualities.put("2", "Strategic withdrawal");
        qualities.put("3", "Live to fight another day");
        qualities.put("4", "Retreat");
        divination = getDivinationText();
        number = 33;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Dun";
        String keywords = "The piglet, Strategic withdrawal, live to fight another day";
        String theJudgement = "Retreat. Success. In small things, it is beneficial to persevere";
        String theJudgementDescription = "You face hostile conditions and therefore should make a strategic retreat. This is entirely appropriate under the circumstances and should not be confused with cowardice or resignation. You should withdraw when you are in the strongest position to do so, preserving your resources in order to fight another day. An army that retreats often after it is defeated in battle has waited too long. As a result, it often suffers heavy casualties and it flees and must leave its arms and provisions on the field. In this case, by timing your withdrawal appropriately, you avoid losses and conserve your power. In this way, you can actually strengthen yourself and begin preparations for effective countermeasures. Indeed, by retreating in the right way, you can actually make things more difficult for your opponent by limiting his options and means of attack. You can retreat to a position of strength with full power and resources to your disposal. By making yourself less vulnerable to your adversary, you make your adversary less powerful and less able to harm you. Applied outside of battlefield, the lesson of DUn is that properly timed retreat from a situation that is not serving your bes interests can be constructive and liberating. It can enhance your power rather than detracting from it. By withdrawing from the situation you can free yourself from entanglements that sap your energies and form negative personalities who drag you down. This gives you the chance to take a broader view and rethink your priorities. Knowing when and how to retreat properly requires shrewdness, careful planning, and completele cooldeadedness. Good timing is essential. But when you exit is properly prepared and performed, the results are entirely favorable. Hence the text predicts success. Similar considerations apply if your question concerns your own lifestyle. You need to reassess the choices you have made and the habits that you have fell into. If your behavior is not making you happy and fulfilled, there is something wrong. Perhaps you are acting in a way that is contrary to your best interests. The adversity you face may lie  within yourself and your own self-destructive tendencies. If so, it may be time to withdraw and start over. Move away from what is harmful and take the time to replenish yourself.";
        String theImage = "Mountain under heaven. This is the image of Retreat. Thus the superior person keeps petty people at a distance. not with anger but with reserve.";
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

    public String getImagePath() { return imagePath; }

    public int getNumber() { return number;}

    @Override
    public void create() {
        new Dun();
    }

}
