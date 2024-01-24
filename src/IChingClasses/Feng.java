package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Feng extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Feng() {
        image = new GImage("../IChingImages/UpToSixtyFour/55.Feng.jpg");
        element = "Thunder, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Abundence" );
        qualities.put("2", "Zenith");
        qualities.put("3", "Fullness");
        qualities.put("4", "Splendor");
        qualities.put("5", "Plenty");
        qualities.put("6", "Being generous");
        qualities.put("7", "Acting decisively");
        qualities.put("8", "Living in the present");
        qualities.put("9", "Making the most of the good times");
        divination = getDivinationText();
        number = 55;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Feng - Abundence";
        String keywords = "Zenith, Fullness, Splendor, Plenty, Being generous, Acting decisively, living in the present, Making the most of the good times";
        String theJudgement = "Abundance. Success. The king approaches. Do not be sad. Be like the sun at midday.";
        String theJudgementDescription = "The sun at noon will surely descend just as it has ascended. But in the meantime it shines brightly, bestowing warmth and radience on everything beneath it. In the same way, you now face a moment of rare brilliance and abundance. Everything is now possible. Relationships will flourish. Your ambitions can be achieved. Make the most of this time. Do not worry that things will not always be this perfect. That will only cause you to freeze up. If you mourn what has not yet happned, you will waste your opportunity to do good in the present. Therefore , the text advices you to be like the sun at middday - joyous, powerful, energetic, and happy. Size up the problems before you. Wigh the circumstances objectively. Then go out and take care of business. Success is assured. It is your time to shine. How can you make the good times last as long as possible? The answer, once again, is to take your cue from the sun. The sun is the very symbol of optimism and generosity: it does not try to keep its warmth and energy for itself. It spreads its light throughout the heavens, bringing clarity to everything beneath it. It does not worry that it will burn out someday. Rather, it gives freely, and then it gives some more, and in the way all life on earth is preserved and perpetuated. Like the sun, do what you can to illuminate the world and make your fellow creatures warm and happy. If you want to perpetuate t he good times, share your bounty with others. Do not worry about gain or loss, or about wether you will have enough in the future. If you try and hog the benefits to yoursel, you will cut yourself off from others. People will envy you and refuse to cooperate with you. If you become fearful and obsessed that people are trying to take things from you, you will drain your energies and squander your opportunities. As a result, the good times will pass all the more quickly, and no one will be there to help you on your downward slide. On the other hand, if you share your good fortune with others, they will rejoice in your success and work with you to keep things moving forward. And you in turn will be renewed and stimulated by their goodwill and cooperation. Be optimistic and you will feel better about yourself and your life. Be magnanimous and you will be enriched in countless ways through the gratitude, affection, and support of others. As paradoxical as it seems, the more you give to others, the more will be given to you in return. The less you worry about the transitories of the time of abundance, the longer it will remain with you and those you care for.";
        String theImage = "Thunder and lightning culminate as one, This is the image of abundancec, thus the superior person judges cases, and carries out punishments.";
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
        new Feng();
    }
}
