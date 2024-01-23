package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Fu extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Fu() {
        image = new GImage("IChingImages/IChingClasses.Fu.png");
        element = "Wind, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Storm" );
        qualities.put("2", "Cloudy storms");
        qualities.put("3", "Many thunders");
        qualities.put("4", "Thunderstorm");
        qualities.put("5", "Lightning speed");
        qualities.put("6", "Lightning distance");
        qualities.put("7", "Brainstorms");
        qualities.put("8", "Brainstorms collaborating");
        qualities.put("9", "Many ideas at the same time");
        qualities.put("10", "Turning point");
        qualities.put("11", "Restoration");
        qualities.put("12", "Renovation");
        qualities.put("13", "Renewal");
        divination = getDivinationText();
        number = 24;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Fu";
        String keywords = "Storm, Cloudy storms, Many thunders, Thunderstorm, Lightning speed, Lightning distance, Brainstorms, Brainstorms collaborating, Many ideas at the same time, turning point, restauration, reinovation, renewal";
        String theJudgement = "Return. Success. Going out and coming in without harm. Friends come. No blame. It is beneficial to have somewhere to go.";
        String theJudgementDescription = "IChingClasses.Fu represents the beginning for a new cycle of growth. The text offers the metaphor of seven days as the length that a cycle must take before it renews itself. If one begin with IChingClasses.Qian,"+
                "and, starting from bottom to top, places each like with its opposite, in six transformations the yin lines will have fully displaced the yang lines, and IChingClasses.Qian will become IChingClasses.Kun. "+
                "The seventh transformation then begins a new sequence, with a yang line moving up from the bottom. You have reached a turning point, and the beginning of a new cycle." +
                "The law of change is in operation, and after a period of decline, confusion, and stagnation, there are new possibilities for renewal, clarity, and improvement." +
                "The old order is passing away and a new one is dawning. As things begin to change imperceptibly in your favor, new alliances and relationships can form, and" +
                "old ones that had grown stale and frayed can become renewed and strengthened, the the text says 'friends come'. Nevertheless, you should not expect that" +
                "everything will get better overnight. Rather, this hexagram describes the moment at which the tide begins to shift in your favor. The days start to become longer"+
                "at the winter solstice, but spring is still many months off. For this reason it would not be wise to try to force matters. Things are still in their earliest stages, and it" +
                "would be the best to let them develop naturally, in their own time. Your position is not yet strong enough to take aggressive action, and in any case you cannot make" +
                "everything better all at once. Instead, you should conserve your energies, secure in the faith that things are bound to improve if you give them time. What is most important"+
                "is that you make a sincere and honest commitment to take the first steps in what will be a long and steady process of improvement. The hexagram IChingClasses.Fu represents an opportunity" +
                "handed to you to begin again. If you have made mistakes in the past, or have strayed from the proper path, you must take this opportunity to correct yourself, remend," +
                "and ask forgiveness as necessary. Hence the text speaks of 'turning around and returning to the Way'. The Book of Changes is both optimistic and pragmatic about the possibilities" +
                "of self-renewal. Every period of darkness is followed by new light. The Book of Changes is both optimistic and pragmatic about the possibilities of self-renewal. Every period of darkness"+
                "is followed by new light. The Book of Changes thus holds out the hope that redemption is still possible if you devote yourself to it wholeheartedly. But you must act at the proper time"+
                "That is why the text says 'it is beneficial to have somewhere to go'. The possibilities for return and renewal are not endless. If you lack resolve and commitment, if you wait too long to change" +
                "your ways, the path of redemption will be closed and you will have to wait through a new cycle. Fortunately, you are now in a propitious time when change is possible. A door has been opened" +
                "for you. It is up to you to pass through it. Nothing can be forced. Everything must unfold in its natural time. But even if you cannot change everything immediately, before you begin your journey, you" +
                " must first turn yourself around so that you can move in the right direction.";
        String theImage = "Thunder over the earth, this is the image of fu, Return. Success. Going out and coming in without harm.  Friends come. No blame.";
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
        new Fu();
    }
}
