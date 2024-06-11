package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class WuWang extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public WuWang () {
        image = new GImage("../IChingImages/UpToSixtyFour/25.WuWang.jpg");
        element = "Heaven, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", " Without expectations" );
        qualities.put("2", "Without guile");
        qualities.put("3", "Acting naturally");
        qualities.put("4", "Being spontaneous");
        qualities.put("5", "The unexpected");
        qualities.put("6", "Innocence");
        divination = getDivinationText();
        number = 25;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Wu Wang";
        String keywords = "Without expectations, without guile, acting naturally, being spontaneous, the unexpected";
        String theJudgement = "Innocence. Supreme success. It is beneficial to persevere. If one is not what he should be, he meets with calamity, and it is not beneficial for him to undertake anything";
        String theJudgementDescription = "TIn the Book of Changes, innocence does not carry the Christian connotation of being without sin. Rather to be innocent means to be genuine, sincere, and unaffected, without guile or deceit. For similar reasons, innocence does not mean being naive or unaware of one's souroundings. A wild animal acts naturally and instinctively, but senses are often finely attuned to its environment. To act innocently means to act spontaneously and naturally, without ulterior motives. However, human innocence means more than this, because aggressive, selfish, and depraved behavior can also be spontaneous. Innocence has a necessary moral dimension. It means doing the right thing for its own sake without thought or reward. An innocent person is naturally drawn to what is good and right and moves in this direction instinctively and without ceremony or calculation, without manipulation or deception. The text days that the innocent behavior that lacks moral qualities will only bring unhappiness and misfortune. Innocent action is the best way to deal with the unexpected events that life inevitably hands us. You cannot always prepare for every contingency and you cannot run your life according to a script, no matter how intricate and well thought out. You must be willing to improvise and respond naturally to the sittuation. This hexagram suggests that the best path for you to follow now is one of simplicity, honesty and naturalness. Try to do the right thing because it is the right thing to do. Your reward will come in due course. Don't overthink things and stop trying to turn every situation to your personal advantage. Getting lost in intricate machinations and devious plottings will only cause anexiety and confusion. Above all, don't try to manipulate people or take advantage of them. Your scheming will backfire. A sincere and uncomplicated approach has much greater chance of success. Act simply and spontaneously and you need not worry about the result. You will do the right thing in exactly the right way. Innocence means accepting your own nature and allowing the best parts of yourself to emerge naturally and spontaneously. You don't need to be something that you are not and you shouldn't try. Stop comparing yourself to other people, and don't worry whether you are sufficiently popular or influential. That way of thinking is simply a recipe for unhappiness. Be content to be yourself. Let your inner qualities shine through in your dealings with others, and they will respond. Conformity is a great pressure in social life. But there is no need to conform just for conformity's sake. Don't be tempted to do something that is beneath you just to fit in. Refuse to be drawn into anything deceptive or base. Instead, trust your instincts. You have the resources within you to judge the situation. Let your heart be your guide.";
        String theImage = "Thunder rolling under heaven: All things behave with natural innocence. Thus the ancient kings rich in virtue and in harmony with the seasons nourished the ten thousand things";
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

    @Override
    public void create() {
        new WuWang();
    }
}
