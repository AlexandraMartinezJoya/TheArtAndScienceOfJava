package IChingTests;

import IChingClasses.WuWang;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class WuWangTests extends ConsoleProgram {

    public void run() {
        WuWang wuWang = new WuWang();
        String hasSameImage = hasSameImage(wuWang);
        println(hasSameImage);
    }

    public String hasSameImage(WuWang wuWang) {
        String hasTheSameImage = "WuWang has the same image as expected";
        String doesNotHaveTheSameImage = "WuWang does not have the same expected image";
        GImage expectedImage = new GImage( "../IChingImages/UpToSixtyFour/25.WuWang.jpg");
        if(wuWang.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(WuWang wuWang) {
        String hasTheSameImagePath = "Wu wang has the same image path";
        String doesNotHaveTheSameImagePath = "Wu wang does not have the same image path";
        String expectedImagePath =  "../IChingImages/UpToSixtyFour/25.WuWang.jpg";
        if(wuWang.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(WuWang wuWang) {
        String hasSameElementName = "WuWang has the same element name of "+ wuWang.getElementName();
        String doesNotHaveSameElementName = "WuWang does not have the same element name";
        String expectedElementName =  "Heaven, Thunder";
        if(wuWang.getElementName().equals(expectedElementName)) {
            return hasSameElementName;
        } else {
            return doesNotHaveSameElementName;
        }
    }

    public String hasSameElementQualities(WuWang wuWang) {
        String hasSameElementQualities = "WuWang has the same expected qualities " + wuWang.getElementQualities();
        String doesNotHaveSameElementQualities = "WuWang does not have the same element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1", " Without expectations" );
        expectedElementQualities.put("2", "Without guile");
        expectedElementQualities.put("3", "Acting naturally");
        expectedElementQualities.put("4", "Being spontaneous");
        expectedElementQualities.put("5", "The unexpected");
        expectedElementQualities.put("6", "Innocence");
        if(wuWang.getElementQualities().equals(expectedElementQualities)) {
            return hasSameElementQualities;
        } else {
            return doesNotHaveSameElementQualities;
        }
    }

    public String hasSameDivination(WuWang wuWang) {
        String hasSameDivination = "Wu wang has the same expected divination with the keywords " + wuWang.getDivination().get("Keywords");
        String doesNotHaveSameDivintion = "Wu wang does not have the expected divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Wu Wang");
        expectedDivination.put("Keywords", "Without expectations, without guile, acting naturally, being spontaneous, the unexpected");
        expectedDivination.put("The Judgement", "Innocence. Supreme success. It is beneficial to persevere. If one is not what he should be, he meets with calamity, and it is not beneficial for him to undertake anything");
        expectedDivination.put("Judgement Description", "In the Book of Changes, innocence does not carry the Christian connotation of being without sin. Rather to be innocent means to be genuine, sincere, and unaffected, without guile or deceit. For similar reasons, innocence does not mean being naive or unaware of one's surroundings. A wild animal acts naturally and instinctively, but senses are often finely attuned to its environment. To act innocently means to act spontaneously and naturally, without ulterior motives. However, human innocence means more than this, because aggressive, selfish, and depraved behavior can also be spontaneous. Innocence has a necessary moral dimension. It means doing the right thing for its own sake without thought or reward. An innocent person is naturally drawn to what is good and right and moves in this direction instinctively and without ceremony or calculation, without manipulation or deception. The text days that the innocent behavior that lacks moral qualities will only bring unhappiness and misfortune. Innocent action is the best way to deal with the unexpected events that life inevitably hands us. You cannot always prepare for every contingency and you cannot run your life according to a script, no matter how intricate and well thought out. You must be willing to improvise and respond naturally to the situation. This hexagram suggests that the best path for you to follow now is one of simplicity, honesty and naturalness. Try to do the right thing because it is the right thing to do. Your reward will come in due course. Don't overthink things and stop trying to turn every situation to your personal advantage. Getting lost in intricate machinations and devious plotting will only cause anxiety and confusion. Above all, don't try to manipulate people or take advantage of them. Your scheming will backfire. A sincere and uncomplicated approach has much greater chance of success. Act simply and spontaneously and you need not worry about the result. You will do the right thing in exactly the right way. Innocence means accepting your own nature and allowing the best parts of yourself to emerge naturally and spontaneously. You don't need to be something that you are not and you shouldn't try. Stop comparing yourself to other people, and don't worry whether you are sufficiently popular or influential. That way of thinking is simply a recipe for unhappiness. Be content to be yourself. Let your inner qualities shine through in your dealings with others, and they will respond. Conformity is a great pressure in social life. But there is no need to conform just for conformity's sake. Don't be tempted to do something that is beneath you just to fit in. Refuse to be drawn into anything deceptive or base. Instead, trust your instincts. You have the resources within you to judge the situation. Let your heart be your guide.");
        expectedDivination.put("The Image", "Thunder rolling under heaven: All things behave with natural innocence. Thus the ancient kings rich in virtue and in harmony with the seasons nourished the ten thousand things");
        if(wuWang.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveSameDivintion;
        }
    }

    public String  hasTheSameNumber(WuWang wuWang) {
        String hasTheSameNumber = "Wu wang has the same number as expected " + wuWang.getNumber();
        String doesNotHaveTheSameNumber = "Wu wang does not have the same expected number";
        int expectedNumber = 25;
        if(wuWang.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}

