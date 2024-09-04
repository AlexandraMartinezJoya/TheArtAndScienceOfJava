import IChingClasses.WeiJi;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class WeiJiTests extends ConsoleProgram {

    public void run() {
        WeiJi weiJi = new WeiJi();
        String hasSameImage = hasSameImage(weiJi);
        println(hasSameImage);
    }

    public String hasSameImage(WeiJi weiJi) {
        String hasSameImage = "Wei Ji has the same expected image";
        String doesNotHaveTheSameImage = "Wei Ji does not have the same expected image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/64.WeiJi.jpg");
        if(weiJi.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(WeiJi weiJi) {
        String hasTheSameImagePath = "Wei Ji has the same image path";
        String doesNotHaveSameImagePath = "Wei Ji does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/64.WeiJi.jpg";
        if(weiJi.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasTheSameElement(WeiJi weiJi) {
        String hasTheSameElement = "Wei Ji has the same element and it is " + weiJi.getElementName();
        String doesNotHaveTheSameElement = "Wei Ji does not have the same element";
        String expectedElementName = "Fire, Water";
        if(weiJi.getElementName().equals(expectedElementName)){
            return hasTheSameElement;
        } else {
            return doesNotHaveTheSameElement;
        }
    }

    public String hasTheSameQualities(WeiJi weiJi) {
        String hasTheSameQualities = "Wei Ji has the same qualities and they are " + weiJi.getElementQualities();
        String doesNotHaveTheSameQualities = "Wei Ji does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Not yet across" );
        expectedQualities.put("2", "Before the end");
        expectedQualities.put("3", "Nearly home and dry");
        expectedQualities.put("4", "Bringing order out of confusion");
        expectedQualities.put("9", "Exercising order and circumspection");
        if(weiJi.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(WeiJi weiJi) {
        String hasTheSameDivination = "Wei Ji has the same divination with the keywords " + weiJi.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Wei Ji does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Wei Ji - Before Completion");
        expectedDivination.put("Keywords","Not yet across, Before the end, Nearly home and dry, Bringing order out of confusion, Exercising order and circumspection");
        expectedDivination.put("The Judgement","Before Completion. Success.But if the little fox, Almost across the river, Gets its tail wet, There is nothing for which this is beneficial.");
        expectedDivination.put("Judgement Description","You face a difficult situation. The elements for successful change are there, but everything seems confused and unsettled. It is up to you to bring order out of chaos. It is a great responsibility. The problem is, you don't yet know what to do. There are contradictory indication and contradictory forces at work in the situation. You feel tugged at from all sides. You you must make a decision. The text compares your situation to that of an old fox that is trying to cross a frozen river. It does not know there the ice is to thin. Therefore, it proceeds slowly and cautiously, listening carefully for the first sounds of a crack in the surface. No matter how dar across it is, it does not lose its balance or caution. By contrast, a young fox lacks this prudence and circumspection, if it rushes ahead boldly when it is nearly across the river, it may fall into the icy waters. In the same way, when you are trying to bring order to a confusing situation, you must begin slowly and methodically, First of all, decide what your goals truly are. There is no sense of starting out if you don't know there you want to go. Clarifying what you want the outcome to be will go a long way toward formulating the right strategy. Second, don't rush matters. Rome wasn't built in a day. Take things one step at a time. Don't try to resolve everything at once. Third, be wary. Take the time to gather information and intelligence. Deliberate thoroughly about the best way to proceed. In sum, be like an old fox navigating the ice, cautious, alert, flexible, surefooted, and willing to change direction at a moment's notice. If you can keep your wits about you, you will get across.");
        expectedDivination.put("The Image","Fire over water. This is the image of things before completion. Thus the superior person carefully distinguishes things so that everything is its place");
        if(weiJi.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(WeiJi weiJi) {
        String hasTheSameNumber =  "Wei Ji has the same number and it is " + weiJi.getNumber();
        String doesNotHaveTheSameNumber = "Wei Ji does not have the same number";
        int expectedNumber = 64;
        if(weiJi.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }

}
