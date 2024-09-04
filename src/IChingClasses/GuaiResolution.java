package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class GuaiResolution extends IChingStone implements IChingLineNames {

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

    public GuaiResolution() {
        imagePath = "../IChingImages/UpToSixtyFour/43.GuaiResolution.jpg";
        image = new GImage(imagePath);
        element = "Lake, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Resoluteness" );
        qualities.put("2", "Determination");
        qualities.put("3", "Decisiveness");
        qualities.put("4", "Speaking forthrightly");
        qualities.put("5", "Elimination");
        qualities.put("6", "Eradicating remaining evils");
        qualities.put("7", "Parting");
        qualities.put("8", "Cutting off");
        qualities.put("9", "Breakthrough");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 43;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Guai Resolution";
        String keywords = "Resoluteness, Determination, Decisiveness, Speaking forthrightly, Elimination, Eradicating remaining evils, Parting, Cutting off, Breakthrough";
        String theJudgement = "Resolution. Declare it at the court of the king. Proclaim it sincerely and truthfully. There is danger. Notify the city. It is not beneficial to resort to arms. It is beneficial to have somewhere to go.";
        String theJudgementDescription = "Something is wrong and you must rectify it. Inferior elements still dominate the situation and you must eliminate them. If you do nothing, you will compromise yourself and make a bad situation worse. The problem may be external - people or institutions that undermine the good and prevent progress. Or it may be internal - your own bad habits and negative emotions that weigh you down. Either way, the obstacles are real. You must face up to them and surmount them. You are not unaware of the problem. But you have esitated, telling yourself that the problem is not so bad or that it will eventually take care of itself. But the time for hesitation and temporizing is past. If you do not act, nothing will get better. You must be absolutetly convinced that change is necessary and you must be determined to play a part in that change. When a problem is great, it requires cooperation to overcomne it. If you attack the problem with insufficient resources, you will either be defeated or you will be forced to compromise. And you cannot compromise. The problem must be fully eliminated. Don't overreact and don't try to solve the problem by yourself overnight. You need help if you are to prevail. The best way to gather public support is to state forthrightly what the problem is. If something bad has occured, don't be affraid to say honestly and candidly. Be curteous and evenhanded in dealing with others. You do not want to arouse unnecessary offense or opposition, and you do not want people to think that your emotions have gotten the better of you. But you cannot dissemble or suggarcoat what is wrong. You must speak the truth. You cannot rally people together if they do not understand the seriousness of the sittuation. Evils and injustices can never be eradicated until they are named and identified as what they are. To eliminate evil, you must first expose it in order to gain public support. You must not use violent or underhanded methods to solve your problem. Force leads to more force, evil begets more evil. Do not get in the gutter with what you are trying to eliminate. If you allow yourself to get entangled in passion or hatered, you will become what you oppose. The same principle apply if you are trying to eliminate bad habits in yourself. Be honest with yourself, but don't engage in self-loathing or self-defeating behavior. If you are trying to reform a relationship, you and your partner must have the courage to sincere and candid with each other if you are to work through your problems. But you should not engage in backbiting, manipulation, and emotional assaults. That will only make the sittuation worse. You must discuss your problems openly and frankly, and try to recognize the causes of your present unhappiness. Strive to reach mutual understanding rather than mutual recrimination. Then put your previous struggles behind your and move on.";
        String theImage = "Water from the lake rises up to the heavens, this is the image of resolution, thus the superior person dispenses his riches to those below, he abides in virtue by shunning evil.";
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

    public String getImagePath() { return imagePath; }

    @Override
    public void create() { new GuaiResolution();}
}
