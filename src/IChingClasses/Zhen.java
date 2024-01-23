package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Zhen extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Zhen(){
        image = new GImage("IChingImages/Zhen.png");
        element = "Thunder, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Energetic" );
        qualities.put("2", "Arousing");
        qualities.put("3", "Moving");
        familyMember = "Eldest Son";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "foot");
        animals = "Dragon";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Springtime");
        seasonsAndWeather.put("2", "Earthquake");
        divination = getDivinationText();
        number = 51;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Zhen";
        String keywords = "Thunder, Shake, Quake, Upheval,The arousing, Reasses your life, Shocking you out of your lethargy, Hidden potential in sudden change,Blessing in disguise, Taking action";
        String theJudgement = "Shock. Success,Thunder comes - crack, crack! Afterward there is laughter and talk - ha, ha! The shock terrifies for a hundread miles, but he does not let the sacrificial spoon and chalice fail.";
        String theJudgementDescription = "Something unexpected has shaken you. You had not prepared for it. Suddenly, your life seems in upheval. You experience fear and panic. But once your initial reaction subside, you will recognize that the sudden turn of events is for the best. You have been caught by surprise, but if you hold yourself properly, something positive can and will emerge from the shake-up. The important thing is to stay calm and keep your wits about you. Take a closer look at the sittuation. It is possible that you simply taken on to much. The shocking event may be a blessing in disguise, it gives you an opportunity to reasses your priorities and lessen some of your burdens. Perhaps you have drifted into an unsatisfying and unrewarding routine. The shocking event can awaken you from your lethargy and force you to change your plans. The disruption of your everyday life can invigorate you and give you a fresh outlook on life. It is like the being splashed with cold water. It is unpleasant at first, but it simulates your senses. After the shake-up, you suddenly see new possibilities. Although the change may be disturbing in the beginning, maintain your poise and approach the new sittuation with an open mind. You will come out of this series of events stronger, better, and happier. The book of changes compares the sittuation you now face to thunder pealing while a person is performing a sacred ritual. The shock comes just as the person is ladling out of the sacramental wine. But he is so imbued with seriousness and a sense of purpose that he does not spill a drop. In the same way, you should consider the change as a test of character. If you can maintain equanimity and composure in the face of outside upheval, you are secure against whatever life can throw against you and you will always be able to spot the new potential in changed conditions. That is because the shock not only shakes you up, it also shakes up the world ouside you. New possibilities are created out of the shards of the old. This is a key idea in the book of changes: change- even sudden and startling change, is not only a hazard but an opportunity. People who let shocking events dictate their inner life will be disabled and mored in confusion. They are like people who are struck by lightning. But people who maintain balance in their inner life are quickly to restore balance in their relations with the outside world. They can rise to the challenge and improve their lives in the process.";
        String theImage = "Repeated thunder, This is the image of the Shock, in fear and trembling , the superior person examines himself.";
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

    public HashMap getDivination() {
        return divination;
    }

    public int getNumber() { return number;}

    public void create() {
        new Zhen();
    }
}
