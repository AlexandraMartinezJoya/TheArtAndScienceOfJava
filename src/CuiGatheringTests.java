import IChingClasses.CuiGatheringTogether;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class CuiGatheringTests extends ConsoleProgram {

    public void run() {
        CuiGatheringTogether cuiGatheringTogether = new CuiGatheringTogether();
        String hasSameImage = hasSameImage(cuiGatheringTogether);
        println(hasSameImage);
    }

    public String hasSameImage(CuiGatheringTogether cuiGatheringTogether){
        String hasSameImage = "Cui Gathering has the same image";
        String doesNotHaveTheSameImage = "Cui Gathering does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/45.CuiGathering.jpg");
        if(cuiGatheringTogether.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(CuiGatheringTogether cuiGatheringTogether) {
        String hasTheSameImagePath = "Cui has the same image path";
        String doesNotHaveTheSameImagePath = "Cui does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/45.CuiGathering.jpg";
        if(cuiGatheringTogether.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName (CuiGatheringTogether cuiGatheringTogether) {
        String hasTheSameElementName = "Cui has the same element name " + cuiGatheringTogether.getElementName();
        String doesNotHaveTheSameElementName = "Cui does not have the same element name";
        String expectedElementName = "Lake, Earth";
        if(cuiGatheringTogether.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(CuiGatheringTogether cuiGatheringTogether) {
        String hasTheSameQualities = "Cui has the same qualties " + cuiGatheringTogether.getElementQualities();
        String doesNotHaveTheSameQualties = "Cui does not have the same qualities";
        HashMap expectedQualities =  new HashMap<>();
        expectedQualities.put("1", "Gathering" );
        expectedQualities.put("2", "Massing");
        expectedQualities.put("3", "Joining others");
        expectedQualities.put("4", "Assembling");
        expectedQualities.put("5", "Having a common cause");
        expectedQualities.put("6", "Holding yourself together");
        expectedQualities.put("7", "Pitching in");
        expectedQualities.put("8", "Cooperation between leaders and followers");
        if(cuiGatheringTogether.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualties;
        }
    }

    public String hasTheSameDivination(CuiGatheringTogether cuiGatheringTogether) {
        String hasTheSameDivination = "Cui has the same divination with the keywords " + cuiGatheringTogether.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Cui does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Cui Gathering");
        expectedDivination.put("Keywords", "Gathering, Massing, Joining others, assembling, having a common cause, holding yourself together, pitching in, cooperation between leaders and followers");
        expectedDivination.put("The Judgement", "Gathering together. Success. The king approaches his temple. It is beneficial to see a great person. Success. It is beneficial to persevere. Brining a great offering means good fortune. It is beneficial to have somewhere to go.");
        expectedDivination.put("Judgement Description", "Fostering unity takes skill and patience. In order to bring people together, whether in a community, a charitable organization, or a business, you must give them a shared sense of purpose. You must give up the group direction, hence the text says, It is beneficial to have somewhere to go. Common goals, shared symbols, and shared belifs unite individuals and let them feel that they are working for something more than selfish interests or petty concerns. It is the duty of leaders to instill this sense of higher purpose. The text speaks of the king entering his temple. In ancient times rulers would lead their people by making a sacrifice to their ancestors. This sacrifice reminded people that they had common origins and that toghether they were keeping faith with something noble and valuable. Calling upon common ancestors and invoking shared traditions was a powerful symbol of community, which constituted them as a single people with a common history and destiny. In the same way, if you are called to bring people togeher, you must instill in them a sense of shared history and purpose. You must give them something to belive in. You must bring \"a great offering\" : something that performs the same function as the offering to the ancestors that the ancient kings made. You must find symbols that people can rally around and that express their joint commitment. You must create or invoke a common narrative through which people can connect themselves back to the past and ahead to the future. Thus gathering together means much more than simply assembling individuals at a single place and time. It means gathering them together with those who have gone before and with those who will be part of the group in the future. in this way the group's members can see themselves as part of a continuing project or tradition. In othder to gather other people together, you must first gather yourself together. To do this you must be certain about your values and aims. If you are internally conflicted, you will be outwardly hesitant and you will not be able to inspire confidence. Clarity of moral vision is necessary to rally people together around a great cause. When that clarity is present, an association whose members are united around a common goal can do remarkable things. Groups function best when their members willingly cooperate. If people become selfish, the group will not succeed and may even fall apart. Conflict is inevitable in any large organization because people have different interests and different point of view. But this is acceptable as long as the disagreements concern how best to realize shared values and goals rather than attempts by one faction to suppress and dominate another. If you are a member of a group, be willing to work with the leaders and help them succeed. Understand your place in the larger organization and give your best. If you are a leader, make sure that you act in the interests of everyone. Remember the Chinese proverb that to rule is to serve.");
        expectedDivination.put("The Image", "The lake rises above the earth, This is the image of gathering together, thus the superior person repairs his weapons, in order to meet the unexpected");
        if(cuiGatheringTogether.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(CuiGatheringTogether cuiGatheringTogether) {
        String hasTheSameNumber = "Cui Gathering together has the same number "+cuiGatheringTogether.getNumber();
        String doesNotHaveTheSameNumber = "Cui Gathering together does not have the same number";
        int expectedNumber = 45;
        if(cuiGatheringTogether.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
