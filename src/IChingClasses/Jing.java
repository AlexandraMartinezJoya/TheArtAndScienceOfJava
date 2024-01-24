package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Jing extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Jing() {
        image = new GImage("../IChingImages/UpToSixtyFour/48.Jing.jpg");
        element = "Water, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Human potential" );
        qualities.put("2", "Human resources");
        qualities.put("3", "Replenishing");
        qualities.put("4", "Renewal");
        qualities.put("5", "Nourishing others");
        qualities.put("6", "Going deeply into things");
        qualities.put("7", "Human nature");
        qualities.put("8", "The unchanging");
        qualities.put("9", "The well");
        divination = getDivinationText();
        number = 48;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Jing - The well";
        String keywords = "Human potential, human resources, replenishing, renewal, nourishing others, going deeply into things, human nature, the unchanging";
        String theJudgement = "The well. One can change the town, but one cannot change the well. It neither increases or decreases. They come and go, drawing from the well. If the rope does not go all the way, or the jugs break, Misfortune.";
        String theJudgementDescription = "The theme of IChingClasses.Jing is the need to replenish yourself and others. A well that is properly tended is inexhaustable. When you draw water from it, there is still more water to draw on. But when you do not take care of the well, or the environment that surrounds it, the well becomes muddy or dries up. Then the well is of no use to anyone. To replenish other people you must support them and give them room to flourish. Accept people for what they are, do not try to force them into preconceived molds. Consider how you can be of help to others rather than how you can get everyone to do your bidding. If you create conditions of trust and reciprocity in the world around you, your relationships with others will be like an inexhaustible well that you and everyone else can draw on. But if you act selfishly and high-handedly, people will not cooperate with you or with each other and the resources that mutuality produces will dry up. The well is a model for how to life your life. Those who are like a well are dependable. They are unfailing in their abilities to nourish and benefit others. They are continually replenished by the cooperation that they receive and by the affection and esteem in which other people hold them. Because they create an atmosphere of trust and mutual support, they are inexhaustible. The more they give, the more they are enriched. If you have been neglecting your relationships, now is an excellent time to change things. Be generous and humane to other people and they will respond naturally. Similar considerations apply to the care and nourishment of yourself. Within you are the resources of your body, your mind and your spirit. If you take care of them properly, they are inexhaustible. but if you neglect them or abuse them, they will dry up. Your body needs proper nutrition and exercise. Your mind needs education and intellectual challenge. Your spirit needs something to belive in and to strive for. Replenishing yourself means using your skills and talents rather than letting them waste away. It means challenging and stretching yourself so that you can continue to grow. Don't fritter your life away on meaningless and trivial things. Dedicate yourself to soething you think is really valuable and pursue it. Focus on living up to your own potential rather than on whether you are sufficiently admired. Treat yourself with respect if you want others to respect you. A key methaphor of this hexagram is depth. The text says that the rope must fo down all the way into the well if you want to draw fresh water. If you want to achieve somethinig worthwhile, you must not stake over the surface of things but go deeply into them. If you want healthy, lasting relationships with others, you must make genuine commitments rather than engage in superficial interactions. To succeed at life, you must have depth in your character. You may think that you do not have much to offer. But do not sell yourself short. Be willing to dig deep down inside yourself and realize your potential. Make the effort and the results will surprise you. You do not yet know all the things that you are capable of. To go deeply into things you also need devotion. Replenish yourself and other takes time and attention. It is a continuous process. It requires commitment. If you are careless and neglect your talents and your relationships with others , you waste them and they will waste away. Then you are like the clumsy person who breaks the jug that the water is drawn from. The water is still there, but there is no way that you can get at it. Your ability to replensih yourself is connected to how well you replenish others. If you are stubborn and difficult, or if you shut yourself off from other people, your mind, body, and spirit will eventually suffer. You are like a well that no one tends and no one visits; it is no surprise that such a well becomes muddy from lack of use. But if you engage with the world and cooperate with others in a spirit of reciprocity and goodwill, you will find that all aspects of your life will magically improve. Then you become like a well with clear, cold water that nourishes others and is continually replenished.";
        String theImage = "Water over wood. This is the image of the Well. Thus the superior person encourages the people at their work, and urges them to help one another.";
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
        new Jing();
    }
}
