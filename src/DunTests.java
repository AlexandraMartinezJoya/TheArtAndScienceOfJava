import IChingClasses.Dun;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class DunTests extends ConsoleProgram {

    public void run(){
        Dun dun = new Dun();
        String hasSameImage = hasSameImage(dun);
        println(hasSameImage);
    }

    public String hasSameImage(Dun dun) {
        String hasSameImage = "Dun has same expected image";
        String doesNotHaveSameImage = "Dun does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/33.Dun.jpg");
        if(dun.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(Dun dun) {
        String hasSameImagePath = "Dun has the same image path";
        String doesNotHaveSameImagePath = "Dun does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/33.Dun.jpg";
        if(dun.getImagePath().equals(expectedImagePath)){
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasTheSameElementName(Dun dun) {
        String hasTheSameElementName =  "Dun does has the same element name " + dun.getElementName();
        String doesNotHaveTheSameElementName = "Dun does not have the same element name";
        String expectedElementName = "Heaven, Mountain";
        if(dun.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(Dun dun) {
        String hasTheSameQualities = "Dun has the same expected qualities " + dun.getElementQualities();
        String doesNotHaveSameQualities = "Dun does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", " The piglet" );
        expectedQualities.put("2", "Strategic withdrawal");
        expectedQualities.put("3", "Live to fight another day");
        expectedQualities.put("4", "Retreat");
        if(dun.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveSameQualities;
        }
    }

    public String hasTheSameDivination(Dun dun){
        String hasTheSameDivination = "Dun has the same expected divination with the keywords "+ dun.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Dun does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Dun");
        expectedDivination.put("Keywords","The piglet, Strategic withdrawal, live to fight another day");
        expectedDivination.put("The Judgement","Retreat. Success. In small things, it is beneficial to persevere");
        expectedDivination.put("Judgement Description","You face hostile conditions and therefore should make a strategic retreat. This is entirely appropriate under the circumstances and should not be confused with cowardice or resignation. You should withdraw when you are in the strongest position to do so, preserving your resources in order to fight another day. An army that retreats often after it is defeated in battle has waited too long. As a result, it often suffers heavy casualties and it flees and must leave its arms and provisions on the field. In this case, by timing your withdrawal appropriately, you avoid losses and conserve your power. In this way, you can actually strengthen yourself and begin preparations for effective countermeasures. Indeed, by retreating in the right way, you can actually make things more difficult for your opponent by limiting his options and means of attack. You can retreat to a position of strength with full power and resources to your disposal. By making yourself less vulnerable to your adversary, you make your adversary less powerful and less able to harm you. Applied outside of battlefield, the lesson of DUn is that properly timed retreat from a situation that is not serving your bes interests can be constructive and liberating. It can enhance your power rather than detracting from it. By withdrawing from the situation you can free yourself from entanglements that sap your energies and form negative personalities who drag you down. This gives you the chance to take a broader view and rethink your priorities. Knowing when and how to retreat properly requires shrewdness, careful planning, and completele cooldeadedness. Good timing is essential. But when you exit is properly prepared and performed, the results are entirely favorable. Hence the text predicts success. Similar considerations apply if your question concerns your own lifestyle. You need to reassess the choices you have made and the habits that you have fell into. If your behavior is not making you happy and fulfilled, there is something wrong. Perhaps you are acting in a way that is contrary to your best interests. The adversity you face may lie  within yourself and your own self-destructive tendencies. If so, it may be time to withdraw and start over. Move away from what is harmful and take the time to replenish yourself.");
        expectedDivination.put("The Image","Mountain under heaven. This is the image of Retreat. Thus the superior person keeps petty people at a distance. not with anger but with reserve.");
        if(dun.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Dun dun) {
        String hasTheSameNumber = "Dun has the same number " + dun.getNumber();
        String doesNotHaveTheSameNumber = "Dun does not have the same number";
        int expectedNumber =33;
        if(dun.getNumber() == expectedNumber){
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
