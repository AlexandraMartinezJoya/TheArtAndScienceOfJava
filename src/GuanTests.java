import IChingClasses.Guan;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class GuanTests extends ConsoleProgram {

    public void run() {
        Guan guan = new Guan();
        String hasSameImage = hasSameImage (guan);
        println(hasSameImage);
    }

    public String hasSameImage(Guan guan) {
        String hasSameImage = "Guan has the same expected image";
        String doesNotHaveTheSameImage = "Guan does not have the expected image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/20.Guan.jpg");
        if(guan.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Guan guan) {
        String hasSameImagePath = "Guan has the same image path";
        String doesNotHaveTheSameImagePath = "Guan does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/20.Guan.jpg";
        if(guan.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElement(Guan guan) {
        String hasSameElement = "Guan has the same element and it is "+ guan.getElementName();
        String doesNotHaveTheSameElement = "Guan does not have the same element name";
        String expectedElementName = "Wind, Earth";
        if(guan.getElementName().equals(expectedElementName)) {
            return hasSameElement;
        } else {
            return doesNotHaveTheSameElement;
        }
    }

    public String hasSameQualities(Guan guan) {
        String hasTheSameQualities = "Guan has the same qualities and they are " + guan.getElementQualities();
        String doesNotHaveTheSameQualities = "Guan does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Observation");
        expectedQualities.put("2", "Notice");
        expectedQualities.put("3", "Contemplation");
        expectedQualities.put("4", "Serving as an example");
        expectedQualities.put("5", "Taking an overview");
        expectedQualities.put("6", "Understanding");
        expectedQualities.put("7", "Self-examination");
        expectedQualities.put("8", "Spiritual connection");
        expectedQualities.put("9", "Inner clarity leads to successful action in the world");
        expectedQualities.put("10", "Inner observation and analysis");
        if(guan.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination(Guan guan) {
        String hasSameDivination = "Guan has the same divination with the keywords: " + guan.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Guan does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Guan");
        expectedDivination.put("Keywords","Observation, contemplation, serving as an example, taking an overview, understanding, self-examination, spiritual connection, inner clarity leads to successful action in the world");
        expectedDivination.put("The Judgement","Viewing, The ablution has been made, but not yet offering, filled with trust and sincerity, they are reverent and dignified.");
        expectedDivination.put("Judgement Description","The text describes a religious ceremony in ancient China in which the leader first pours out a ritual libation and then makes a sacrifice in front of the people. The text focuses on the magical moment between these two acts, when all attention is focused on the leader, religious reverence and spiritual contemplation are at their height. In the book of changes, guan is metaphor for contemplation. Contemplation does not mean turning away from the world. Rather it means taking the time to understand the workings of the universe, one's own nature, and one's place in a world of continuity and change. Contemplation is more than the accumulation of bits of knowledge, more than the assimilation and memorization of true factual propositions. It is a profoundly spiritual practice. Through opening one's self to hidden realities and to the possibilities latent in the world, the self is transformed. People who are able to contemplate themselves and the world with utter clarity are thereby imbued with the power to change themselves and the world. Their understanding gives them an uncanny spiritual force that naturally emanates from them and influences others. Sensing the power of their thought, others look up to them and follow them. This is the connection between looking and being looked up to, between contemplation and serving as an example for others. It is the connection between inner truth and outward effect. The challenge you face now is to take a new look at the situation. Put aside older ways of imagining things and take a broader view. Be open minded and not allow your emotions to cloud your judgement. Try to face reality as it is and not as you might want it to be. Stop thinking about things from the standpoint of how they affect you personally and try to see the larger picture. Consider the origins of things and how matters arrived at the present state. This is a time to learn and to expand possibilities. If you can approach the situation with complete clarity and dispassion, you will be able to see the direction in which events are moving. And if you are willing to embrace the truth, whatever it might be, you will gain enormous power and influence in the long run. Do not be too concerned if people do not listen to you at first. As people recognize your commitment to the truth and the clarity of your thought, they will come around. Knowledge is not simply a collection of true statements. It is a social practice and a terrain of power. The force of conformity is very strong. Many people compromise their beliefs and alter their understandings in order to fit in. And many others use their knowledge not for the good of mankind but to seize the power and manipulate others in the short run. Do not follow this path. The right kind of influence will accrue to you only if you maintain your integrity.");
        expectedDivination.put("The Image","The winds blows over the earth, this is the image of viewing, thus the kings of old inspected the four corners of the earth, observed the people, and gave them instruction");
        if(guan.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(Guan guan) {
        String hasSameNumber = "Guan has the same number " + guan.getNumber();
        String doesNotHaveTheSameNumber = "Guan does not have the same number";
        int expectedNumber = 20;
        if(guan.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }


}
