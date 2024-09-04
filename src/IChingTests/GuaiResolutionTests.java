package IChingTests;

import IChingClasses.GuaiResolution;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class GuaiResolutionTests extends ConsoleProgram {

    public void run() {
        GuaiResolution guaiResolution = new GuaiResolution();
        String hasTheSameImage = hasTheSameImage(guaiResolution);
        println(hasTheSameImage);
    }

    public String hasTheSameImage(GuaiResolution guaiResolution) {
        String hasTheSameImage = "Guai Resolution has the same image";
        String doesNotHaveTheSameImage = "Guai Resolution does not have the same image";
        GImage expectedImage =  new GImage("../IChingImages/UpToSixtyFour/43.GuaiResolution.jpg");
        if(guaiResolution.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath( GuaiResolution guaiResolution) {
        String hasTheSameImagePath = "Guai Resolution has the same image path";
        String doesNotHaveTheSameImagePath = "Guai Resolution does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/43.GuaiResolution.jpg";
        if(guaiResolution.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName (GuaiResolution guaiResolution) {
        String hasTheSameElementName = "Guai Resolution has the same element name "+ guaiResolution.getElementName();
        String doesNotHaveTheSameElementName = "Guai Resolution does not have the same element name";
        String expectedElementName = "Lake, Heaven";
        if(guaiResolution.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(GuaiResolution guaiResolution) {
        String hasTheSameQualties = "Guai resolution has the same qualtieis "+ guaiResolution.getElementQualities();
        String doesNotHaveTheSameQualities = "Guai Resolution does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Resoluteness" );
        expectedQualities.put("2", "Determination");
        expectedQualities.put("3", "Decisiveness");
        expectedQualities.put("4", "Speaking forthrightly");
        expectedQualities.put("5", "Elimination");
        expectedQualities.put("6", "Eradicating remaining evils");
        expectedQualities.put("7", "Parting");
        expectedQualities.put("8", "Cutting off");
        expectedQualities.put("9", "Breakthrough");
        if(guaiResolution.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualties;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(GuaiResolution guaiResolution) {
        String hasTheSameDivination = "Guai Resolution has the same divination with the keywords "+ guaiResolution.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Guai Resolution does not have the same keywords";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Guai Resolution");
        expectedDivination.put("Keywords","Resoluteness, Determination, Decisiveness, Speaking forthrightly, Elimination, Eradicating remaining evils, Parting, Cutting off, Breakthrough");
        expectedDivination.put("The Judgement","Resolution. Declare it at the court of the king. Proclaim it sincerely and truthfully. There is danger. Notify the city. It is not beneficial to resort to arms. It is beneficial to have somewhere to go.");
        expectedDivination.put("Judgement Description","Something is wrong and you must rectify it. Inferior elements still dominate the situation and you must eliminate them. If you do nothing, you will compromise yourself and make a bad situation worse. The problem may be external - people or institutions that undermine the good and prevent progress. Or it may be internal - your own bad habits and negative emotions that weigh you down. Either way, the obstacles are real. You must face up to them and surmount them. You are not unaware of the problem. But you have esitated, telling yourself that the problem is not so bad or that it will eventually take care of itself. But the time for hesitation and temporizing is past. If you do not act, nothing will get better. You must be absolutetly convinced that change is necessary and you must be determined to play a part in that change. When a problem is great, it requires cooperation to overcomne it. If you attack the problem with insufficient resources, you will either be defeated or you will be forced to compromise. And you cannot compromise. The problem must be fully eliminated. Don't overreact and don't try to solve the problem by yourself overnight. You need help if you are to prevail. The best way to gather public support is to state forthrightly what the problem is. If something bad has occured, don't be affraid to say honestly and candidly. Be curteous and evenhanded in dealing with others. You do not want to arouse unnecessary offense or opposition, and you do not want people to think that your emotions have gotten the better of you. But you cannot dissemble or suggarcoat what is wrong. You must speak the truth. You cannot rally people together if they do not understand the seriousness of the sittuation. Evils and injustices can never be eradicated until they are named and identified as what they are. To eliminate evil, you must first expose it in order to gain public support. You must not use violent or underhanded methods to solve your problem. Force leads to more force, evil begets more evil. Do not get in the gutter with what you are trying to eliminate. If you allow yourself to get entangled in passion or hatered, you will become what you oppose. The same principle apply if you are trying to eliminate bad habits in yourself. Be honest with yourself, but don't engage in self-loathing or self-defeating behavior. If you are trying to reform a relationship, you and your partner must have the courage to sincere and candid with each other if you are to work through your problems. But you should not engage in backbiting, manipulation, and emotional assaults. That will only make the sittuation worse. You must discuss your problems openly and frankly, and try to recognize the causes of your present unhappiness. Strive to reach mutual understanding rather than mutual recrimination. Then put your previous struggles behind your and move on.");
        expectedDivination.put("The Image","Water from the lake rises up to the heavens, this is the image of resolution, thus the superior person dispenses his riches to those below, he abides in virtue by shunning evil.");
        if(guaiResolution.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber (GuaiResolution guaiResolution) {
        String hasSameNumber = "Guai Resolution has the same number "+ guaiResolution.getNumber();
        String doesNotHaveSameNumber = "Guai Resolution does not have the same number";
        int expectedNumber = 43;
        if(guaiResolution.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveSameNumber;
        }
    }
}
