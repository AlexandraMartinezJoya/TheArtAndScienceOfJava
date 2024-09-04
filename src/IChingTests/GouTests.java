package IChingTests;

import IChingClasses.Gou;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class GouTests extends ConsoleProgram {

    public void run() {
        Gou gou = new Gou();
        String hasSameImage = hasSameImage(gou);
        println(hasSameImage);
    }

    public String hasSameImage(Gou gou){
        String hasSameImage = "Gou has the same image";
        String doesNotHaveTheSameImage = "Gou does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/44.Gou.jpg");
        if(gou.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Gou gou) {
        String hasTheSameImagePath = "Gou has the same image path";
        String doesNotHaveTheSameImagePath = "Gou does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/44.Gou.jpg";
        if(gou.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(Gou gou) {
        String hasTheSameElementName = "Gou has the same element name "+ gou.getElementName();
        String doesNotHaveTheSameElementName = "Gou does not have the same element name";
        String expectedElementName = "Heaven, Wind";
        if(gou.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(Gou gou) {
        String hasTheSameQualities = "Gou has the same qualities " + gou.getElementQualities();
        String doesNotHaveTheSameQualities = "Gou does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Temptation" );
        expectedQualities.put("2", "Brief encounter");
        expectedQualities.put("3", "Coming to meet");
        expectedQualities.put("4", "Coupling of opposites");
        expectedQualities.put("5", "Two ships that pass in the night");
        expectedQualities.put("6", "Hidden dangers");
        expectedQualities.put("7", "The beginnings of corruption");
        expectedQualities.put("8", "Nip problems in the bud");
        expectedQualities.put("9", "Encounter");
        if(gou.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(Gou gou) {
        String hasTheSameDivination = "Gou has the same divination with the keywords " + gou.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Gou does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Gou-Encounter");
        expectedDivination.put("Keywords","Temptation, Brief encounter, Coming to meet, Coupling of opposites, two ships that pass in the night, Hidden dangers, The beginnings of corruption, Nip problems in the bud");
        expectedDivination.put("The Judgement","Encounter. The woman is powerful. Do not marry her.");
        expectedDivination.put("Judgement Description","The text analogizes temptation to a femme fatale who is young and seemingly harmless but who has powerful abilities to seduce others. She is represented by the single yin line, which seduces the five yang lines above it. Comparing temptation with a powerful woman seemed natural to the patriarchal society of ancient China, yin was traditionally associated not only with the feminine but also with the small, the dark, the evil, and the inferior. But we need not maintain these inegalitarian views to understand the point. There is no reason why the seducer could not be male and victim female. In either case, the text advises not to marry the seducer. Marriage is a long-term commitment. In Gou there is a relationship that cannot and should not last. If one commits oneself to the temptation or allows it to become a permanent part of one's life, misfortune will result. The flirtation seems harmless at first - delightful and inviting. However, it gains its power from the fact that ones to meet it and allows it to take over. Temptation advances on us because - whether we realize it or not - we meet it halfway. You find yourself in a situation that seems outwardly pleasant and agreeable. But there are hidden dangers lurking behind an attractive facade. Troubles are brewing, although you don't realize it. It is possible that someone has a hidden agenda. Or that people you are dealing with are simply not right for you. In any case, be exceedingly careful about offers and promises that people make to you. It is not yet clear whom to trust. Watch what people do and not what they say. Try to get additional information about their uprightness and trustworthiness. You don't want to put yourself in a compromising position. It is important not to let yourself be drawn into something that is beneath you or that you will later regret. Therefore, guard your independence and your integrity jealously. Don't allow others to manipulate you. Inferior people worm their way into your life only because you regard them as harmless and allow them entry. They get you to trust them and help them by making it appear that they need your help and your trust. They play on good tendencies of reciprocity and mutual sympathy to get their way. If you don't let yourself be duped in the first place, they will not gain influence over you. There is no need to ne haughty or aggressive. You shouldn't overreact to the situation. But you need to make your own position clear so that you are not pushed around or misused. If you signal that you care committed to the right path and unlikely to be deceived, people who do not have your best interest at heart will move on to another target. Only those who are sincere will remain. Temptation often seems small and harmless at first. But as soon as you indulge it and make it part of your life, it can grow in unexpected ways and gain more and more power over you. If you embarked on something that is not worthy of you , turn back while it is still easy to avoid the situation and make amends. If you have started to develop bad habits, nip them in the bud before they have a chance to become fixed. If you have begun to  be obsessed with doubts, worries, or negative thoughts, try to counteract them before they become a major part of your emotional life. Everything  is easier to deal with when it is small. It is only when we neglect it that is has a chance to become large.");
        expectedDivination.put("The Image","Under heaven there is wind, this is the image of encounter. thus the prince disseminates his commands, and proclaims them to the four corners of the world");
        if(gou.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Gou gou) {
        String hasTheSameNumber = "Gou has the same number " + gou.getNumber();
        String doesNotHaveTheSameNumber = "Gou does not have the same number";
        int expectedNumber = 44;
        if(gou.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}

