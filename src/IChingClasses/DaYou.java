package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class DaYou extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public DaYou(){
        image = new GImage("../IChingImages/IChingClasses.DaYou.png");
        element = "Fire, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Fire on top of heaven" );
        qualities.put("2", "Possession in great measure.");
        qualities.put("3", "Accumulation of truths");
        qualities.put("4", "Many truths at the same time");
        qualities.put("5", "Internal family system");
        qualities.put("6", "Supreme success");
        qualities.put("7", "Inner truth");
        qualities.put("8", "Inner sincerity");
        qualities.put("9", "Bell");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "body aura");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        divination = getDivinationText();
        number = 61;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Da You - Possession in great measure";
        String keywords = "Fire on top of heaven. Supreme success. Possession in great measure";
        String theJudgement = "Inner truth, inner sincerity, Good fortune. It is beneficial to cross the great river";
        String theJudgementDescription = "The Book of Changes regards truth as one of the most powerful forces in the universe. If you want to influence other people, there is no better way than through the truth that lies within you. Possessing  inner truth means that you are sincere. You are on the inside what you appear to be on the outside. You are honest and genuine both in your words and your deeds. You say what you mean and you mean what you say. Such a person naturally inspires trust and confidence in others. Even the most difficult and contentious people will respond to someone whom they recognize is sincere and aboveboard. The most powerful advocates are those who genuinely believe in the rightness of their cause. Many speaks try to win influence by manipulating or flattering others. They may confuse and even impress momentarily, but their audiences do not really trust them. On the other hand, when people are completely sincere, their character shines through to others with the most powerful effect. Indeed, the text says that even pigs and fish respond to the power of inner truth. To influence others, you must approach them in the proper manner. If you want them to be receptive to you, then you must also be receptive to them. Listen to what other people have to say. Try to see things from their point of view. Open your heart and your mind and assume that you have as much to learn from them as they have to learn from you. When you do this, you will be able to see the truth in their way of thinking, and they, in turn, will be able to see truth in yours. Once you understand what is important to them, you will be able to express yourself in the right way. Nevertheless, inner truth is not simply a device for persuading others. It is a way of living your life. The word truth, is also the word for confidence, trust, and reliability. If you want to have these things in your dealing with the outside world, you must possess each of them within. First, to possess inner truth you must know yourself. Then you can trust your instincts in any situation. Second, to possess inner truth means that ou have personal integrity, a stable center, and a core of beliefs and principles to which you remain true. If you lack these things, your life will be shallow and unfulfilling. You cannot compensate for them by relying on other people and things to give yourself stability or fill and inner emptiness. Third, inner truth means inner confidence. To possess inner truth means that you are self-reliant and have faith in yourself. If you are conflicted and uncertain, this will be reflected in your behavior and in dealings with others. As a result, people will lose confidence in you. You must belive in yourself if you want others to belive in you. Indeed, you will find that the power of inner truth is contagious. A person with supreme confidence inspires others and gives them confidence as well. Fourth, to possess inner truth means that you must be honest with yourself. Self-deception will inevitably affect your choices and your relationships. People who hide things from themselves cannot help hiding things from others. That is why inner truth is crucial to behaving with rectitude toward the outside world. You cannot be true to others if you are not true to yourself.";
        String theImage = "Wind over fire. This is the image of inner truth. Thus the superior person discusses criminal cases carefully, and postpones executions. Cuvant purtat de vant, Who by truth";
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

    public int getNumber() { return number;}

    void create() { new DaYou();}
}
