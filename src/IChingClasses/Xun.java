package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Xun extends IChingStone implements IChingLineNames {

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

    public Xun(){
        imagePath = "../IChingImages/UpToSixtyFour/57.Xun.jpg";
        image = new GImage(imagePath);
        element = "Wind, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Gentle" );
        qualities.put("2", "Submissive");
        qualities.put("3", "Persistent");
        qualities.put("4", "Penetrating");
        familyMember = "Eldest Daughter";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "thigh");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Early Summer");
        seasonsAndWeather.put("2", "Mild Movement");
        divination = getDivinationText();
        number = 57;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Xun - Gentle Influence";
        String keywords = "Compliance, Humility, Gentleness, Penetrating, Wind, Persistence";
        String theJudgement = "Gentle influence. Success in small matters. It is beneficial to have somewhere to go. It is beneficial to see a great person.";
        String theJudgementDescription = "The best way to affect the situation right now is through gentle, persistent action and subtle forms of influence. The text compares the right way of proceeding to that of wind. A mild breeze seems inconspicuous. But it can penetrate everywhere. Its effects are gradual but are consistent over time. It is delightful and unassuming. Therefore, it is not feared or resisted but is gladly and gratefully accepted. And because it is accepted, it has influence.The key is to be both gentle and persistent. A violent of forceful approach will be counterproductive and meet with a rebuff. But a gentle approach will be more readily and, if you are persistent, will eventually have the right effect. Because you can only influence the situation in subtle ways, clarity and simpleminded purpose is essential. If you are uncertain about what you want or if you want to waste your time pursuing multiple and conflicting ends, your message will be dissipated and you will have no influence at all. Therefore, you must be absolutely clear in your mind what your goals are. Define your objectives and stick to them. The wind is the most powerful when it blows in one direction. You will not change the situation all at once, but only though steady and persistent influence. Things will proceed slowly, but if you have patience, over time you can have a significant effect. Restrain any impulsive tendencies. Be patient and flexible. Adjust to changing circumstances rather than fighting them, and continually look for opportunities to persuade and win people over to your side. Under no circumstances should you act aggressively or try and dominate the situation. That will surely backfire. Instead, let others take the lead. Stay in the background and serve them. You will make the most progress by subordinating yourself and making your presence felt in small but significant ways";
        String theImage = "Wind follow one another: This is the image of gentle influence, thus the superior person spreads his commands widely, motivates activity and influences events";
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

    public HashMap getSeasonAndWeather() {return seasonsAndWeather;}

    public HashMap getDivination() { return divination;}

    public int getNumber() { return number;}

    public String getImagePath() {return imagePath;}

    @Override
    public void create() { new Xun();}
}
