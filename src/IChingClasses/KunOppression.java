package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class KunOppression extends IChingStone implements IChingLineNames {

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

    public KunOppression() {
        imagePath = "../IChingImages/UpToSixtyFour/47.KunOppression.jpg";
        image = new GImage(imagePath);
        element = "Lake, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Exhaustion" );
        qualities.put("2", "Being restricted");
        qualities.put("3", "Hardship");
        qualities.put("4", "Adversity");
        qualities.put("5", "Impasse");
        qualities.put("6", "Overflowing lake");
        qualities.put("7", "Water on top of lake");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 47;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Kun - Oppression";
        String keywords = "Exhaustion, Being restricted, Hardship, Adversity, Impasse, Overflowing lake";
        String theJudgement = "Oppression. Success. With perseverance, the great person brings about good fortune. No blame. What one says is not believed";
        String theJudgementDescription = "It seems ad if the world is conspiring against you. You are faced with adversity everywhere you turn. Inside, you feel exhausted, tired, burned out. Life seems to have lost all its spark and attraction. Yet the text says that times of oppression hold the promise of success. How can this be? The present situation is a test of your character. It takes a great soul to remain undaunted by adverse circumstances. Right now there is nothing you can do to make things better. You will simply have to wait out this very trying time. If you let your misfortunes get to you and crush your spirit, you will be utterly lost. But if you can maintain your equanimity and your patience, you will be able to endure, and you will become a stronger, better person in the process. If you do not allow them to defeat you, the difficulties you face will toughen your spirit and shape the conditions of your future success. That is why the text sayts that the great person brings about good fortune. People of truly sound and noble character bend in the face of adversity, but they are not broken. They emerge from the trial with renewed hope and the will to go forward and prevail. They succeed because they possess an inner strength that has been tempered and tested by fate. For the time being, you will have little influence on the situation. The people who control your life do not listen to you and will not trust you. Anything you say to them will only fall on deaf ears. Because you cannot affect the outside world, you are thrown back on your own inner resources. Although you must bide your time, you must remain determined to succeed in spite of all obstacles. Now more than ever you must persevere, holding fast to your integrity and to your belief in yourself. When you have a world that you cannot control, your inner tranquility is the one thing that you have a say about. No one can take this away from you unless you allow it. To prevail against an inner oppression that consists of despair, self-abuse, and hopelessness. Emotions like these drain the life from you and rob you of the will to go on. To defeat them, you must maintain your faith, your emotional balance, and your self-confidence. If you can win this inner victory, no outside foe can stand against you.";
        String theImage = "A lake overflowing, this is the image of oppression. Thus the superior person realizes his destiny by following his  own will";
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
    public void create() { new KunOppression();}
}
