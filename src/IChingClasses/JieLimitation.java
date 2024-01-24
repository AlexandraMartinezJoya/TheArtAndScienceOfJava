package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class JieLimitation extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public JieLimitation() {
        image = new GImage("../IChingImages/UpToSixtyFour/60.JieLimitation.jpg");
        element = "Water, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Control" );
        qualities.put("2", "Restriction");
        qualities.put("3", "Limitation");
        qualities.put("4", "Articulation");
        qualities.put("5", "Separate and distinguish");
        qualities.put("6", "Setting boundaries");
        qualities.put("7", "Constraint");
        qualities.put("8", "Self-control");
        divination = getDivinationText();
        number = 60;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Jie - Limitation";
        String keywords = "Control, restriction, limitation, articulation, separate and distinguish, setting boundaries, constraint, self-control";
        String theJudgement = " Limitation. Success. One should not engage in bitter limitation";
        String theJudgementDescription = "Limitation is a necessary element of a happy life. Limiting expenditures is necessary to remain solvent, limiting passions is necessary for maturity and sound judgement. The best limitations are those we choose for ourselves. They strenghten our character and make life easier to bear. You are facing a situation in which limitation is necessary. Perhaps you have taken on to much, or perhaps you have become self-indulgent or carried things to extremes. Whatever the problem, it is up to you to rectify matters by enforcing boundaries and reining things in a bit. Moderation is the key here. You have to strike a new balance in your life. To do that you will need to exercise some self-restraint. If you work at self discipline, it will eventually come naturally to you. Adopt good habits and doing the right thing will become easy rather than a burden. The same principles apply to your finances. Keep an eye on your expenditures, and void anything that is too extravagant. Be prudent without being stingy. Limitation means setting priorities. Decide what your responsabilities are and be prepared to live up to them. You may have to make some tradeoffs. Short0term sacrifices may be necessary. But in the long run, it will be worth it. You cannot have everything in life. You need to decide what is most important to you. That is how to achieve peace of mind. You may be facing limitation in your everyday environment. If so, be realistic. Don't bite more than you can chew. Accomodate yourself to present conditions with optimism and good humor. Accept the restrictions with grace and without rancor. You can do more now if you remain adaptable and flexible. Don't give up hope, instead, make the most out of what you have. Be content to make progress in smaller steps, taking one thing at a time. Don't try to do more than present circumstances allow. Limitation is good when it strenghtens people, increases their self-control, and makes them more self-reliant. It is bad when it is punitive and counter-productive. You will gain nothing by being to hard on yourself. Your goal should be balance and moderation, not asceticism or self-abuse. Similarily, if you are too hard on others , your attempts at discipline will do you and them no good. People will either lose confidence in you or they will rebel at your attempts to control them. Thus the text says that you should avoid bitter limitation, because that is going too far. You need to excercise restraint in all things, including the exercise of restraint itself.";
        String theImage = "Above the lake is water. This is the image of Limitation. Thus the superior person establishes measures and limits, and deliberates about the nature of virtuous conduct.";
        divination.put("Title", title);
        divination.put("Keywords", keywords);
        divination.put("The Judgement", theJudgement);
        divination.put("Judgement Description", theJudgementDescription);
        divination.put("The Image", theImage);
        return divination;
    }

    public GImage getIChingImage() {
        return image;
    }

    public String getElementName() {
        return element;
    }

    public HashMap getElementQualities() {
        return qualities;
    }

    public String getFamilyMember() { return familyMember;}

    public HashMap getBodyPart() {
        return partOfBody;
    }

    public String getRelatedAnimal() {
        return animals;
    }

    public HashMap getSeasonAndWeather() {
        return seasonsAndWeather;
    }

    public HashMap getDivination() { return divination;}

    public int getNumber() { return number;}

    public void create() {
        new JieLimitation();
    }
}
