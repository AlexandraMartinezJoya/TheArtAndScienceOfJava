package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Qian extends IChingStone implements IChingLineNames {

    GImage image;
    String imagePath;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Qian() {
        imagePath =  "../IChingImages/UpToSixtyFour/1.Qian.jpg";
        image = new GImage(imagePath);
        element = "Heaven, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Creative" );
        qualities.put("2", "Dynamic");
        qualities.put("3", "Strong");
        qualities.put("4", "Assertion");
        qualities.put("5", "Strength");
        qualities.put("6", "Decisiveness");
        qualities.put("7", "Strong Action");
        qualities.put("8", "Going forward");
        qualities.put("9", "Moving upward");
        qualities.put("10", "Undertaking something");
        qualities.put("11", "Constant and ceaseless exertion");
        familyMember = "Father";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "head");
        partOfBody.put("2", "mind");
        animals = "Horse";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Early Winter");
        seasonsAndWeather.put("2", "Cold");
        seasonsAndWeather.put("3", "Ice");
        divination = getDivinationText();
        number = 1;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Qian - TheDynamic";
        String keywords = "Activity, Creativity, Dynamic force, Assertion, Strength, Decisiveness, Strong action, Going forward, Moving Upward, Undertaking something, Constant and ceaseless exertion";
        String theJudgement = "The Dynamic, Supreme Success, It is Beneficial to Persevere";
        String theJudgementDescription = "The Book of Changes begins with the dynamic principle, which has four basic attributes. It is fundamental (sublime, originating, and supreme), successful (bestowing power), beneficial (advantageous, and morally appropriate), and persevering(determined, steadfast, and upright). These are the four virtues of the Book of Changes. The four Chinese words for these attributes (yuan, heng li zhen) are often used to represent the four seasons, or virtually anything that can be divided into four. The four virtues are usually paired: fundamental with successful, and beneficial with persevering. Thus, the text says that dynamic action will help you achieve supreme success, and it is beneficial to persevere, to keep moving forward. To conduct yourself in accordance with the nature of the times, you should make the four virtues your own: attend to what is basic and fundamental, and perserve in what is beneficial and morally upright/ The text enjoins you to use your creative power for good - to bring order out of chaos, beauty out of squalor, peace out of tumult, and justice out of injustice. Quian signifies that you are in a very favorable situation if you take the right approach. This is not a time to hold back. Rather, you must take strong, decisive action. Seize the initiative. Go out into the world and make a difference. Be creative. Look for fresh and original ways to solve your problems. It is time to try something new and bold. If you move forward now with confidence, others will have confidence in you. If you are willing to act on your belifs and stand up for what you belive is right, people will look up to you and follow you. Your energy and enthusiasm will inspire them and this will help you achieve your goals. Have faith in yourself and maintain a positive attitude. You have every reason to be optimistic. ANd the more optimistic and enthusiastic you are about your project, the more you will help to ensure your ultimate success. No matter how dynamic and forceful you may be, however, strong action will amout to nothing if it is not for the right purposes. If you want to harness the right kind of creative power, you must be convinced that you are doing is correct and you must steadfastly maintain your integrity and uprightness. Go back to basics. Return to your most fundamental principles. People who know that their cause is just are the most powerful of all. Their heart, mind and spirit all aim at the same end. They embody the dynamic principle perfectly, hence they are like a force of nature. Because they harbor no doubts or inner conflicts, their energy and initiative are put to their highest use, and that is why they succeed. In the same way if you want to make the most of this propitious hour, you must devote yourself to something that is truly worthy. You must employ your energies for honorable goals. Do not waste your time on things that are base, trivial or beneath you. The moment for creative action will not last forever, so do not squander it. Strong action also will not succeed if it not carefully thought through and carried forward. Do not confuse dynamism with recklessness or creativity with carelessness. Plan ahead. Try and gauge the consequences of what you are about to do. Marshal your resources carefully, and when the time is right, do not be afraid to move forward boldly and decisively. Moreover, once you have begun, you must finish what you start. Behind creativity there must be commitment or your plans will amount to nothing. You must keep moving forward steadily and determinedly until you succeed. Hence the text says that it is beneficial to persevere.";
        String theImage = "Heaven moves constantly. Thus the superior person strengthens himself without pause.";
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

    public String getImagePath() { return imagePath;}

    @Override
    public void create() {
        new Qian();
    }
}
