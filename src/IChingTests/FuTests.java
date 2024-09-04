package IChingTests;

import IChingClasses.Fu;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class FuTests extends ConsoleProgram {

    public void run() {
        Fu fu = new Fu();
        String hasSameImage = hasSameImage(fu);
        println(hasSameImage);
    }

    public String hasSameImage(Fu fu) {
        String hasSameImage = "Fu has the same image";
        String doesNotHaveTheSameImage = "Fu does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/24.Fu.jpg");
        if(fu.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Fu fu) {
        String hasSameImagePath = "Fu has the same image path";
        String doesNotHaveTheSameImagePath = "Fu does not have the same image path";
        String expectedPath = "../IChingImages/UpToSixtyFour/24.Fu.jpg";
        if(fu.getImagePath().equals(expectedPath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(Fu fu) {
        String hasSameElementName = "Fu has the expected element name of "+ fu.getElementName();
        String doesNotHaveTheExpectedElementName = "Fu does not have the expected element name";
        String expecetdElementName =  "Wind, Thunder";
        if(fu.getElementName().equals(expecetdElementName)) {
            return hasSameElementName;
        } else {
            return doesNotHaveTheExpectedElementName;
        }
    }

    public String hasTheSameQualities(Fu fu) {
        String hasSameElementQualities = "Fu has the same qualities and they are " + fu.getElementQualities();
        String doesNotHaveTheSameElementQualities = "Fu does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Storm" );
        expectedQualities.put("2", "Cloudy storms");
        expectedQualities.put("3", "Many thunders");
        expectedQualities.put("4", "Thunderstorm");
        expectedQualities.put("5", "Lightning speed");
        expectedQualities.put("6", "Lightning distance");
        expectedQualities.put("7", "Brainstorms");
        expectedQualities.put("8", "Brainstorms collaborating");
        expectedQualities.put("9", "Many ideas at the same time");
        expectedQualities.put("10", "Turning point");
        expectedQualities.put("11", "Restoration");
        expectedQualities.put("12", "Renovation");
        expectedQualities.put("13", "Renewal");
        if(fu.getElementQualities().equals(expectedQualities)) {
            return hasSameElementQualities;
        } else{
            return doesNotHaveTheSameElementQualities;
        }
    }

    public String hasTheSameDivination(Fu fu) {
        String hasTheSameDivination = "Fu has the same divination "+ fu.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Fu does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Fu");
        expectedDivination.put("Keywords", "Storm, Cloudy storms, Many thunders, Thunderstorm, Lightning speed, Lightning distance, Brainstorms, Brainstorms collaborating, Many ideas at the same time, turning point, restoration, renovation, renewal");
        expectedDivination.put("The Judgement", "Return. Success. Going out and coming in without harm. Friends come. No blame. It is beneficial to have somewhere to go.");
        expectedDivination.put("Judgement Description", "Fu represents the beginning for a new cycle of growth. The text offers the metaphor of seven days as the length that a cycle must take before it renews itself. If one begin with Qian, and, starting from bottom to top, places each like with its opposite, in six transformations the yin lines will have fully displaced the yang lines, and Qian will become Kun. The seventh transformation then begins a new sequence, with a yang line moving up from the bottom. You have reached a turning point, and the beginning of a new cycle. The law of change is in operation, and after a period of decline, confusion, and stagnation, there are new possibilities for renewal, clarity, and improvement. The old order is passing away and a new one is dawning. As things begin to change imperceptibly in your favor, new alliances and relationships can form, and old ones that had grown stale and frayed can become renewed and strengthened, the the text says 'friends come'. Nevertheless, you should not expect that everything will get better overnight. Rather, this hexagram describes the moment at which the tide begins to shift in your favor. The days start to become longer at the winter solstice, but spring is still many months off. For this reason it would not be wise to try to force matters. Things are still in their earliest stages, and it would be the best to let them develop naturally, in their own time. Your position is not yet strong enough to take aggressive action, and in any case you cannot make everything better all at once. Instead, you should conserve your energies, secure in the faith that things are bound to improve if you give them time. What is most important is that you make a sincere and honest commitment to take the first steps in what will be a long and steady process of improvement. The hexagram Fu represents an opportunity handed to you to begin again. If you have made mistakes in the past, or have strayed from the proper path, you must take this opportunity to correct yourself, remend, and ask forgiveness as necessary. Hence the text speaks of 'turning around and returning to the Way'. The Book of Changes is both optimistic and pragmatic about the possibilities of self-renewal. Every period of darkness is followed by new light. The Book of Changes is both optimistic and pragmatic about the possibilities of self-renewal. Every period of darkness is followed by new light. The Book of Changes thus holds out the hope that redemption is still possible if you devote yourself to it wholeheartedly. But you must act at the proper time. That is why the text says 'it is beneficial to have somewhere to go'. The possibilities for return and renewal are not endless. If you lack resolve and commitment, if you wait too long to change your ways, the path of redemption will be closed and you will have to wait through a new cycle. Fortunately, you are now in a propitious time when change is possible. A door has been opened for you. It is up to you to pass through it. Nothing can be forced. Everything must unfold in its natural time. But even if you cannot change everything immediately, before you begin your journey, you must first turn yourself around so that you can move in the right direction.");
        expectedDivination.put("The Image", "Thunder over the earth, this is the image of fu, Return. Success. Going out and coming in without harm.  Friends come. No blame.");
        if(fu.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Fu fu) {
        String hasTheSameNumber = "Fu has the same number of " + fu.getNumber();
        String doesNotHaveTheSameNumber = "Fu does not have the same number";
        int expectedNumber = 24;
        if(fu.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
