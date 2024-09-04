package IChingTests;

import IChingClasses.XianMutualInfluence;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;
import java.util.HashMap;

public class XianMutualInfluenceTests extends ConsoleProgram {
    public void run() {
        XianMutualInfluence xianMutualInfluence = new XianMutualInfluence();
        String hasSameImage = hasSameImage(xianMutualInfluence);
        println(hasSameImage);
    }

    public String hasSameImage(XianMutualInfluence xianMutualInfluence){
        String hasTheSameImage = "Xian has the same expected image";
        String doesNotHaveTheSameImage = "Xian does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/31.XianMutualInfluence.jpg");
        if(xianMutualInfluence.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImageClassPath(XianMutualInfluence xianMutualInfluence) {
        String hasTheSameImageClassPath = "Xian has the same image class path";
        String doesNotHaveTheSameImageClassPath = "Xian does not have the same image class path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/31.XianMutualInfluence.jpg";
        if(xianMutualInfluence.getImagePath().equals(expectedClassPath)) {
            return hasTheSameImageClassPath;
        } else {
            return doesNotHaveTheSameImageClassPath;
        }
    }

    public String hasTheSameElementName(XianMutualInfluence xianMutualInfluence) {
        String hasTheSameElementName = "Xian has the same element name of " + xianMutualInfluence.getElementName();
        String doesNotHaveTheSameElementName = "Xian does not have the same element name";
        String expectedElementName =  "Lake, Mountain";
        if(xianMutualInfluence.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameElementQualities(XianMutualInfluence xianMutualInfluence) {
        String hasTheSameElementQualities = "Xian has the same element qualities " + xianMutualInfluence.getElementQualities();
        String doesNotHaveTheSameQualities = "Xian does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Influence" );
        expectedQualities.put("2", "Reciprocity");
        expectedQualities.put("3", "Mutual attraction");
        expectedQualities.put("4", "Courtship");
        expectedQualities.put("5", "Wooing");
        expectedQualities.put("6", "Lake on top of a mountain");
        if(xianMutualInfluence.getElementQualities().equals(expectedQualities)) {
            return hasTheSameElementQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination(XianMutualInfluence xianMutualInfluence) {
        String hasSameDivination = "Xian has the same divination with the keywords: "+ xianMutualInfluence.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Xian does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Xian Mutual Influence");
        expectedDivination.put("Keywords","Influence, Reciprocity, Mutual attraction , Courtship, Wooing, Lake on top of a mountain");
        expectedDivination.put("The Judgement","Mutual influence. Success. It is beneficial to persevere. To marry a woman brings good fortune");
        expectedDivination.put("Judgement Description","The theme of Xian is attraction, influence, and the formation of relationships. The relationship in question may be a love affair, but it could also be a friendship, family relations, a professional relationship, a business connection, or a political alliance. Relationships need time to grow, so that the parties can gradually gain trust and a degree of comfort with each other. This is symbolized by the union of Dui (Joy, Acceptance) with Gen(Patience, keeping still. Aggressiveness and impatience may damage the relationship in its initial stages. Do not try to force matters or achieve everything overnight. Mutual attraction has its own ways that are not fully under the control of either party. It must develop naturally, on it's own terms. The theme of Xian is not simply influence but mutual influence. In forming relationships, do not try to manipulate or dominate, or force the other person to your own way of thinking. Influence must always be reciprocal, a matter of give and take. Only in this way can it be happy and long-lasting. There is an important difference between courtship and seduction. Seduction is the result of momentary enthusiasm; it is a desire to manipulate and control in order to fill up the emptiness that lies within the heart of the seducer. That emptiness, however, can never be filled, and therefore it leads to ever new desires, ever new attempts to conquest and control, ever new struggles to force the production of love in another heart. Because it is not founded on mutual trust and respect, it will inevitably end in betrayal and unhappiness. If you desire to form a relationship with another, ask yourself whether you and the other person are engaged in courtship or seduction. Hence the text says it is beneficial to persevere, for perseverance marks the difference between short-term seduction and long-term commitment. Courtship should not be pursued for its own sake, but for the commitment it produces. Influence should not pursued for its own sake, but for the good things that it helps being into being. Through mutual attraction, people with complementary talents and affinities are brought together and create something great and lasting. Hence the text says 'to marry a woman brings good fortune'. Just as one should not seek love merely in order to seduce but in order to produce relationships that last, one should not seek to be influential simply to become famous and powerful but in order to achieve something of purpose and value. Finally, Xian teaches that the nature of a thing can be determined by what it attracts and what it is attracted to. What kind of company do you keep and what kind of people do you pursue? If your relationships are unhappy, perhaps it is because you are attracting or pursuing the wrong sort of people, or perhaps it is because of some unhealthy vision you have about yourself. Good relationships are bringing out in you and in the people you are connected to.");
        expectedDivination.put("The Image","A lake on the mountain, this is the image of Mutual Influence. The superior person receives others because he is open to them.");
        if(xianMutualInfluence.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(XianMutualInfluence xianMutualInfluence) {
        String hasSameNumber = "Xian has the same number  " + xianMutualInfluence.getNumber();
        String doesNotHaveTheSameNumber = "Xian does not have the same number";
        int expectedNumber = 31;
        if(xianMutualInfluence.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}

