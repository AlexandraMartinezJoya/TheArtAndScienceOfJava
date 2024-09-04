package IChingTests;

import IChingClasses.JieLimitation;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JieLimitationTests extends ConsoleProgram {

    public void run(){
        JieLimitation jieLimitation = new JieLimitation();
        String hasSameImage = hasSameImage(jieLimitation);
    }

    public String hasSameImage(JieLimitation jieLimitation) {
        String hasSameImage = "Jie Limitation has same image";
        String doesNotHaveSameImage = "Jie Limitation does not have the same image";
        GImage expectedImage = new GImage( "../IChingImages/UpToSixtyFour/60.JieLimitation.jpg");
        if(jieLimitation.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(JieLimitation jieLimitation){
        String hasSameImage = "Jie Limitation has the same image";
        String doesNotHaveTheSameImage = "Jie Limitation";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/60.JieLimitation.jpg";
        if(jieLimitation.getImagePath().equals(expectedImagePath)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameElement(JieLimitation jieLimitation) {
        String hasSameElement = "Jie Limitation has the same element and is " + jieLimitation.getElementName();
        String doesNotHaveTheSameElement = "Jie limitation does not have the same element name";
        String expectedElement = "Water, Lake";
        if(jieLimitation.getElementName().equals(expectedElement)){
            return hasSameElement;
        } else {
            return doesNotHaveTheSameElement;
        }
    }

    public String hasTheSameQualities(JieLimitation jieLimitation) {
        String hasTheSameQualities = "Jie Limiation has the same qualities "+ jieLimitation.getElementQualities();
        String doesNotHaveTheSameQualities = "Jie Limitation does not have the same qualities";
        HashMap expectedLimisation = new HashMap<String, String>();
        expectedLimisation.put("1", "Control" );
        expectedLimisation.put("2", "Restriction");
        expectedLimisation.put("3", "Limitation");
        expectedLimisation.put("4", "Articulation");
        expectedLimisation.put("5", "Separate and distinguish");
        expectedLimisation.put("6", "Setting boundaries");
        expectedLimisation.put("7", "Constraint");
        expectedLimisation.put("8", "Self-control");
        if(jieLimitation.getElementQualities().equals(expectedLimisation)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(JieLimitation jieLimitation) {
        String hasTheSameDivination = "Jie Limitation has the same divination with the keywords" + jieLimitation.getDivination().get("Keywords");
        String doesNotHaveTheSameLimitation = "Jie limitation does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Jie - Limitation");
        expectedDivination.put("Keywords","Control, restriction, limitation, articulation, separate and distinguish, setting boundaries, constraint, self-control");
        expectedDivination.put("The Judgement","Limitation. Success. One should not engage in bitter limitation");
        expectedDivination.put("Judgement Description","Limitation is a necessary element of a happy life. Limiting expenditures is necessary to remain solvent, limiting passions is necessary for maturity and sound judgement. The best limitations are those we choose for ourselves. They strengthen our character and make life easier to bear. You are facing a situation in which limitation is necessary. Perhaps you have taken on to much, or perhaps you have become self-indulgent or carried things to extremes. Whatever the problem, it is up to you to rectify matters by enforcing boundaries and reining things in a bit. Moderation is the key here. You have to strike a new balance in your life. To do that you will need to exercise some self-restraint. If you work at self discipline, it will eventually come naturally to you. Adopt good habits and doing the right thing will become easy rather than a burden. The same principles apply to your finances. Keep an eye on your expenditures, and void anything that is too extravagant. Be prudent without being stingy. Limitation means setting priorities. Decide what your responsibilities are and be prepared to live up to them. You may have to make some tradeoffs. Short0term sacrifices may be necessary. But in the long run, it will be worth it. You cannot have everything in life. You need to decide what is most important to you. That is how to achieve peace of mind. You may be facing limitation in your everyday environment. If so, be realistic. Don't bite more than you can chew. Accommodate yourself to present conditions with optimism and good humor. Accept the restrictions with grace and without rancor. You can do more now if you remain adaptable and flexible. Don't give up hope, instead, make the most out of what you have. Be content to make progress in smaller steps, taking one thing at a time. Don't try to do more than present circumstances allow. Limitation is good when it strengthens people, increases their self-control, and makes them more self-reliant. It is bad when it is punitive and counter-productive. You will gain nothing by being to hard on yourself. Your goal should be balance and moderation, not asceticism or self-abuse. Similarly, if you are too hard on others , your attempts at discipline will do you and them no good. People will either lose confidence in you or they will rebel at your attempts to control them. Thus the text says that you should avoid bitter limitation, because that is going too far. You need to exercise restraint in all things, including the exercise of restraint itself.");
        expectedDivination.put("The Image","Above the lake is water. This is the image of Limitation. Thus the superior person establishes measures and limits, and deliberates about the nature of virtuous conduct.");
        if(jieLimitation.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameLimitation;
        }
    }

    public String hasTheSameNumber(JieLimitation jieLimitation) {
        String hasTheSameNumber = "Jie Limitation has the same number " + jieLimitation.getNumber();
        String doesNotHaveTheSameNumber = "Jie limitation does not have the same number";
        int expectedNumber = 60;
        if(jieLimitation.getNumber() == expectedNumber){
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}

