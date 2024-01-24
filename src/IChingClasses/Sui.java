package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Sui extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Sui() {
        image = new GImage("../IChingImages/UpToSixtyFour/17.Sui.jpg");
        element = "Lake, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Following" );
        qualities.put("2", "Allegiance");
        qualities.put("3", "Loyalty");
        qualities.put("4", "Looking out");
        qualities.put("5", "Continuing");
        qualities.put("6", "Adaptability");
        qualities.put("7", "Being adaptable");
        qualities.put("8", "Changing");
        qualities.put("9", "Being able to distinguish and apply necessary changes");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 17;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Sui - Following";
        String keywords = "Following, Allegiance, Loyality, Looking out, Continuing, Adaptability, Being adaptable, Changing, Being able to distinguish and apply the changes needed";
        String theJudgement = "Resolution. Declare it at the court of the king. Proclaim it sincerely and truthfully. There is danger. Notify the city. It is not beneficial to resort to arms. It is beneficial to have somewhere to go.";
        String theJudgementDescription = "IChingClasses.Sui concerns the obligations of followers and leaders - how to get others to follow you and when and how to follow others. If you want other to follow you, you must know how to adjust yourself to them. In the words of the old Chinese proverb, to rule is to serve. No one can be a true leader who does not have sympathy for those in one's charge. You must adapt yourself to the demands of the time and the needs of your supporters. Then you will gain the respect and trust of others so that they follow you with joy and gladness. If you try to gain mastery over other people through force and fraud, or through conspiracy and connivance, you will poison social relations and breed resentment and resistance. At most you will gain control only of a fraction that must surpress its opponents. If you wil power through injuring others, you will have to keep injuring them to maintain your base. The injuries you do to thers will not fade away, they will haunt you later on. On the other hand, if you gain power through winning the trust and affection of others, they will give you the benefit of the doubt when you must take tough decisions that you feel are in the interest of all. When your leadership is established on trust rather than fear, you maintain your base of support by continuing to work on behalf of those who follow you. They in turn will support your endeavors, and in this way everyone will benefit. Conversely, if you are in the position of following others, you must make sure that you are doing so for the right reasons. Hence the text warns you to be constant and steadfastly faithful. One can be only faithful in this way to principles that last for a long time rather than to fads and fashions that come and go. If you follow a group because it is currently powerful and influential, you are not really following anything but your own ambition and your own need for approval. But if you follow a group or leader because of the quality of its belifs and goals, and not merely to advance your own selfish interests, you will be without blame. IChingClasses.Sui has a dual meaning. It means both to follow something and to pursue it. Thus, IChingClasses.Sui also concerns the deeper question of what you should persue in life. The answer to this question, is deceptively simple to state but often difficult to put into practice: first of all, you must follow your conscience. Second, you must follow what gives happiness. In the hexagram IChingClasses.Sui, Zhen - the symbol of the Arouding, follows IChingClasses.Dui. So should you. Life is to short to squander on things that are unrewarding. Devote yourself to things that will enrich you and give meaning to your life. Aim high. If you settle for less than the best, you will almost certainly get it. Just because you pursue something valuable does not mean that you will attain it imediately and without effort. Nothing worth having is attained so easily. You must cultivate the virtues of patience and flexibility. IChingClasses.Sui teaches that you can achieve great success if you know how to adapt your efforts to the demands of the time. Indeed, this is a central theme of Book of Changes. Be open-minded and willing to learn. Instead of exhausting your energies in vain struggles against the world, try to see how you can make progress by moving in different directions. Be willing to experiment. Take a fresh view of the situation. Overcome old prejudices and try new ways of doing things. Flexibility without and persistence within will bring you to your goal.";
        String theImage = "Thunder in the middle of the lake, this is the image of following, thus the superior person goes indoors at night for the rest and recuperation.";
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

    public String getFamilyMember() {
        return familyMember;
    }

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

    public int getNumber() { return number; }

    void create() { new Sui();}
}
