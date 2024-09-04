import IChingClasses.KunOppression;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;
import java.util.HashMap;

public class KunOppressionTests extends ConsoleProgram {

    public void run() {
        KunOppression kunOppression = new KunOppression();
        String hasSameImage = hasSameImage(kunOppression);
        println(hasSameImage);
    }

    public String hasSameImage(KunOppression kunOppression) {
        String hasSameImage = "Kun Oppression has the same image";
        String doesNotHaveSameImage = "Kun Oppression does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/47.KunOppression.jpg");
        if(kunOppression.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(KunOppression kunOppression){
        String hasSameImagePath = "Kun Oppression has the same image path";
        String doesNotHaveTheSameImagePath = "Kun Oppression does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/47.KunOppression.jpg";
        if(kunOppression.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(KunOppression kunOppression){
        String hasSameElementName = "Kun Oppression has the same element name " + kunOppression.getElementName();
        String doesNotHaveTheSameElementName = "Kun Oppression does not have the same element name";
        String expectedElementName = "Lake, Water";
        if(kunOppression.getElementName().equals(expectedElementName)){
            return hasSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasSameQualities(KunOppression kunOppression) {
        String hasTheSameQualities = "Kun Oppression has the same qualities " + kunOppression.getElementQualities();
        String doesNotHaveTheSameQualities = "Kun Oppression does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Exhaustion" );
        expectedQualities.put("2", "Being restricted");
        expectedQualities.put("3", "Hardship");
        expectedQualities.put("4", "Adversity");
        expectedQualities.put("5", "Impasse");
        expectedQualities.put("6", "Overflowing lake");
        expectedQualities.put("7", "Water on top of lake");
        if(kunOppression.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(KunOppression kunOppression) {
        String hasTheSameDivination = "Kun Oppression has the same divination " + kunOppression.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Kun Oppression does not have the same qualities";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Kun - Oppression");
        expectedDivination.put("Keywords","Exhaustion, Being restricted, Hardship, Adversity, Impasse, Overflowing lake");
        expectedDivination.put("The Judgement","Oppression. Success. With perseverance, the great person brings about good fortune. No blame. What one says is not believed");
        expectedDivination.put("Judgement Description","It seems ad if the world is conspiring against you. You are faced with adversity everywhere you turn. Inside, you feel exhausted, tired, burned out. Life seems to have lost all its spark and attraction. Yet the text says that times of oppression hold the promise of success. How can this be? The present situation is a test of your character. It takes a great soul to remain undaunted by adverse circumstances. Right now there is nothing you can do to make things better. You will simply have to wait out this very trying time. If you let your misfortunes get to you and crush your spirit, you will be utterly lost. But if you can maintain your equanimity and your patience, you will be able to endure, and you will become a stronger, better person in the process. If you do not allow them to defeat you, the difficulties you face will toughen your spirit and shape the conditions of your future success. That is why the text sayts that the great person brings about good fortune. People of truly sound and noble character bend in the face of adversity, but they are not broken. They emerge from the trial with renewed hope and the will to go forward and prevail. They succeed because they possess an inner strength that has been tempered and tested by fate. For the time being, you will have little influence on the situation. The people who control your life do not listen to you and will not trust you. Anything you say to them will only fall on deaf ears. Because you cannot affect the outside world, you are thrown back on your own inner resources. Although you must bide your time, you must remain determined to succeed in spite of all obstacles. Now more than ever you must persevere, holding fast to your integrity and to your belief in yourself. When you have a world that you cannot control, your inner tranquility is the one thing that you have a say about. No one can take this away from you unless you allow it. To prevail against an inner oppression that consists of despair, self-abuse, and hopelessness. Emotions like these drain the life from you and rob you of the will to go on. To defeat them, you must maintain your faith, your emotional balance, and your self-confidence. If you can win this inner victory, no outside foe can stand against you.");
        expectedDivination.put("The Image","A lake overflowing, this is the image of oppression. Thus the superior person realizes his destiny by following his  own will");
        if(kunOppression.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(KunOppression kunOppression){
        String hasTheSameNumber = "Kun Oppression has the same number "+kunOppression.getNumber();
        String doesNotHaveTheSameNumber = "Kun Oppression does not have the same number";
        int expectedNumber = 47;
        if(kunOppression.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
