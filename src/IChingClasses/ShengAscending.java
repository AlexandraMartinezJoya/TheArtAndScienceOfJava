package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class ShengAscending extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public ShengAscending(){
        image = new GImage("../IChingImages/IChingClasses.ShengAscending.png");
        element = "Earth, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Pushing upward" );
        qualities.put("2", "Rising");
        qualities.put("3", "Climbing");
        qualities.put("4", "Persistence and devotion");
        qualities.put("5", "Progressing step by step");
        qualities.put("6", "Making steady progress");
        qualities.put("7", "The accumulation of small advantages");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 46;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Sheng Ascending";
        String keywords = "Pushing upward, Rising, Climbing , Progressing step by step, Making steady progress, The accumulation of small advantages";
        String theJudgement = "Pushing upward, Rising, Climbing, persistence and devotion, Progressing step by step, Making steady progress, The accumulation of small advantages";
        String theJudgementDescription = "Step by step, you are making progress. Your upward movement meets with no resistance and therefore nothing holds you back. It is all a matter of time. You will not get where you want to go overnight, but devoted and persistent efforts will pay off handsomely in the long run. You need not to worry about the ultimate result. The secrets to your success are threefold. First, the time is right for your advance. Second, you have established the necessary groundwork. When the fundamentals are sound, every move forward brings cumulative benefits that bring you ever closer to your goal. Third, and most important, you succeed because you do not try to get everything at once. Instead, you move forward slowly but surely, inch by inch, never hesitating but always advancing in steady, deliberate steps. If you want to reach your goal, all you have to do is maintain this successful strategy. Have faith in yourself. Proceed step by step. When you encounter obstacles, don't be discouraged. Don't lose your temper or try to force things. Instead, be modest and unassuming. Adapt to the situation and keep going. Imagine a young plant that is moving through the soil toward the light. When it encounters earth, it adapts and shifts directions until it finds the best possible space to push upward, then  it simply continues its steady ascent. In t he same fashion, you will find that if you put your mind to it you can easily move around whatever stands in your way. Don't be afraid to ask people for help or advice. Because the time is right, they will be happy to give it to you. The important thing is to keep making steady progress. The text says that setting out toward the south brings good fortune, the the south represents activity. be confident that if you work hard you will eventually get what you want. In the long run, your continuous exertions will be rewarded with recognition and supreme success. Like a plant inching ever upward, you will reach the surface and feel the warm sunlight shining on you.";
        String theImage = "Within the earth, wood grows, This is the image of Ascending, Thus the superior person , with adaptable character, accumulates the small, in order to achieve great success";
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

    void create() { new ShengAscending();}
}
