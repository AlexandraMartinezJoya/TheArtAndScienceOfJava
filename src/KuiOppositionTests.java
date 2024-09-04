import IChingClasses.KuiOpposition;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class KuiOppositionTests extends ConsoleProgram {

    public void run(){
        KuiOpposition kuiOpposition = new KuiOpposition();
        String hasSameImage = hasSameImage(kuiOpposition);
        println(hasSameImage);
    }

    public String hasSameImage(KuiOpposition kuiOpposition){
        String hasTheSameImage = "Kui has the same image";
        String doesNotHaveTheSameImage = "Kui does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/38.KuiOpposition.jpg");
        if(kuiOpposition.getIChingImage().equals(expectedImage)){
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(KuiOpposition kuiOpposition){
        String hasTheSameImagePath = "Kui has the same image path";
        String doesNotHaveTheSameImagePath = "Kui does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/38.KuiOpposition.jpg";
        if(kuiOpposition.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(KuiOpposition kuiOpposition){
        String hasTheSameElementName = "Kui opposition has the same element name " + kuiOpposition.getElementName();
        String doesNotHaveTheSameElementName = "Kui opposition does not have the same element name";
        String expectedElementName ="Fire, Lake";
        if(kuiOpposition.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(KuiOpposition kuiOpposition) {
        String hasTheSameElementQualities = "Kui opposition has the same qualities " + kuiOpposition.getElementQualities();
        String doesNotHaveTheQualities = "Kui opposition does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Estrangement" );
        expectedQualities.put("2", "Misunderstanding");
        expectedQualities.put("3", "Different points of view");
        expectedQualities.put("4", "Polarity");
        expectedQualities.put("5", "Diversity");
        expectedQualities.put("6", "Creative tension");
        expectedQualities.put("7", "Finding commonality within difference");
        if(kuiOpposition.getElementQualities().equals(expectedQualities)) {
            return hasTheSameElementQualities;
        } else {
            return doesNotHaveTheQualities;
        }
    }

    public String hasTheSameDivination(KuiOpposition kuiOpposition){
        String hasTheSameDivination = "Kui Opposition has the same divination with the keywords "+ kuiOpposition.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Kui Opposition does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Kui Opposition");
        expectedDivination.put("Keywords","Estrangement, Misunderstanding, Different points of view, Polarity, Diversity, Creative tension, Finding commonality within difference");
        expectedDivination.put("The Judgement","Opposition, In small matters there is good fortune");
        expectedDivination.put("Judgement Description","Opposition and estrangement have entered the situation. Misunderstandings have arisen, and so people mistrust and doubt each other. For this reason, they are not cooperating and cannot make any progress. In these circumstances it is important to proceed slowly and carefully. Mistrust has to be dissipated gradually, in small steps. Hence the text says that good fortune comes from small things. Even in marked opposition there is usually some kind of commonality. In order to relax the tensions, it  is best to remind people of what they have in common and turn their attention to values that all share. If you find yourself estranged from other people, try to see things from their point of view. Consider that they are probably as mistrustful of you are you are of them. Viewing other people not as enemies but as fellow human beings trying to make their way in the world is the first step to resolving conflict. Be tolerant and gracious. Be willing to make the first move in order to meet other people halfway. Doing this will begin to dissipate the atmosphere of confrontation and mutual suspicion. By altering the tone of your interactions and making signs that you seek understanding and reconciliation, you can begin breaking down barriers of mistrust and soften attitudes that have hardened over time. But it is important to proceed with great sensitivity and caution. Do not think that you can make everything better overnight. Trust takes time to be reestablished, especially when opposition has been severe or longstanding. Do not rush things. Give people, including yourself, time to move closer together and find a method of reconciliation. In a time of opposition, making the first move takes courage. Don't allow your pride or your fear of being thought weak keep you from reaching out to others and resolving misunderstandings. People cling to opposition not because they are strong, but because they are weak: the situation makes them feel insecure and they are afraid of what will happen if they expose themselves. As a result, they allow resentments to build and misunderstandings to fester. By contrast, people who know their own worth are the ones who can afford to be tolerant and generous. They understand that people can improve their lives if they are willing to risk a little emotional pain and uncertainty. They do not confuse tolerance with deficiency or magnanimity with weakness.");
        expectedDivination.put("The Image","Fire is above, Lake is below, this is the image of opposition, the superior person seeks common ground, while recognizing differences.");
        if(kuiOpposition.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(KuiOpposition kuiOpposition) {
        String hasTheSameNumber = "Kui has the same expected number "+ kuiOpposition.getNumber();
        String doesNotHaveTheSameNumber = "Kui does not have the same expected number";
        int expectedNumber = 38;
        if(kuiOpposition.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
