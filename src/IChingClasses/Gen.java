package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Gen extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Gen(){
        image = new GImage("../IChingImages/IChingClasses.Gen.png");
        element = "Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Stillness" );
        qualities.put("2", "Tranquility");
        qualities.put("3", "Stability");
        familyMember = "Youngest Son";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "hand");
        animals = "Dog";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Late Winter");
        seasonsAndWeather.put("2", "Stillness");
        divination = getDivinationText();
        number = 52;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Gen";
        String keywords = "Mountain, Restraint, Attaining inner peace, Enduring, Taking one day at a time";
        String theJudgement = "Keeping Still. He keeps his back still, So that he no longer feels his body, He goes into his courtyard and does not see his people, no blame";
        String theJudgementDescription = "The Book of Changes teaches that you must both your activity and your rest in harmony with the needs of the situation and the demands of the time. Success comes not only from moving forward at the right time but also from remaining still when it is appropriate to do so. The theme of IChingClasses.Gen is recognizing that the time has come to be still so that you can regain your balance and find peace. The text offers the methaphor of keeping the back still. The back represents the center of your body. Where the back goes the body goes , so if the back remains still, the body will be still. The back is also the location of the spine, hence to make one's back still means to calm the nerves and thus one's mind. When your mind is calm and your thoughts are orderly, it is as if you no longer feel your body - that is, you no longer feel the pain of demands pressing on you from the outside and the urgency of desires pressing on you from the inside. When you are angry and distressed, the world looks disordered and confused. But when you are perfectly calm, you see the world with greater clarity. Being still allows you to see beyond the surface turbulence of life and the petty struggles of the day and look more deeply into the nature of things. Beyond the chaos and commotion lie deeper truths. You recently entered a difficult and trying period. The world seems disordered and confused. In part, that is because you have disorder and confusion within you. The most important thing for you to do right now is to restore your inner balance and find peace of mind. Do not let the chaos and the striving of the outside world distract you or upset you. There is nothing more that you can do in the present sittuation. You have done all you can, any further extertions would only be counterproductive. Because struggling outwardly will do you no good, you should stop struggling inward aswell. Take a deep breath, collect your thoughts, and reflect. You will get nowhere if you obsess about your problems. That will only cause your anexiety to build and build until you feel that you absolutely must do something, and then you are likely to do precisely the wrong thing. If you make your decisions based on worry and apprehension, you are likely to misjudge and exagerate things. But when your mind is still and your emotions are centered, you will make no mistakes. Calm yourself and you will be able to see more deeply into the situation. Then everything will appear in its proper perspective. Being still does not mean abandoning your feelings. Quite the contrary, you will find that you will have a greater intuitive understanding of what is going on. The point is that you can best get in touch with those intuitions through stillness rather than through being in an emotional upheval. And when you connect with those deeper parts of yourself, you will naturally select the right strategies and make the proper choices. You will instinctively know the right thing to do. In this way stillness becomes the necessary predicate for right action in the future.";
        String theImage = "A chain of mountains: This is the image of keeping still. Thus the superior person Does not allow his thoughts To go beyond his situation";
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

    public HashMap getDivination() {
        return divination;
    }

    public int getNumber() { return number; }

    @Override
    void create() {
        new Gen();
    }
}
