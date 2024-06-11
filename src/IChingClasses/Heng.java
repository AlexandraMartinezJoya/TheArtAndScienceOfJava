package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Heng extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Heng() {
        image = new GImage("../IChingImages/UpToSixtyFour/32.Heng.jpg");
        element = "Thunder, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Enduring" );
        qualities.put("2", "Constancy");
        qualities.put("3", "Long-lasting");
        qualities.put("4", "Perseverence");
        qualities.put("5", "Endurance");
        qualities.put("6", "Duration");
        divination = getDivinationText();
        number = 32;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Heng - Enduring";
        String keywords = " Constancy, Long-lasting, Perseverence, Endurance, Duration";
        String theJudgement = "Enduring. Success. No blame. It is beneficial to persevere. It is beneficial to have somewhere to go.";
        String theJudgementDescription = "To endure means to keep going despite obstacles. Endurance is neither stagnatiopn or a state of rest. It progresses forward, unlike stagnation, and it keeps moving and growing, unlike rest. What endures renews itself and its effects through continous activity. What endures does so through change, not in spite of change. Its effects are understood against the experience of change. We see this in the cycle of the seasons that continually renew themselves as the earth moves around the sun. The cycle of the seasons repeats perpetually because its underlying causes continue. Plants and animals grow and change as they endure over time, When they cease to grow, they die, and they cease to endure. So is in life. All life is change. But in order to make change intelligible, there must be things that persist, against which change can be understood. To give your life meaninig, you must have something that endures: your identity, your relationships with others, and your principles. If you surrender what is enduring within you, then you surrender to the flux of events and become indistinguishable from them. Then there is nothing left of you. The lesson of IChingClasses.Heng is that you must learn to be consistent and persevere in the face ofg a changing world. Circumstances around you are changing, but you must maintain your integrity. Be consistent. Do not allow yourself to be blown about by a momentary alteration in fortunes. Do not let concerns about what others might think or how well others are doing by comparison lead you take drastic or reckless action. Instead, focus on what is and should be enduring in your life: your relationships, your character, and your principles. The situation that you face now requires you to persevere even though you face adversity and obstacles. Choose a path and stick to it. Keep your long term goals firmly in mind and progress slowly but surely toward them. Employ routines, practices, and cycles of activity that you can engage in over the long haul that will bring you closer and closer to your goal. Be content to make progress step by step through time-tested methods. Attend to the little things. If you neglect them, they will cause problems in the long run. But if you take care of everyday tasks, you will head off problems before they become large. The secret to endurance is character. Stick to your principles. Maintain your vision. This will see you through difficult times. You will inevitably have to adjust your strategy as events change, but do not give up its essential features. Don't be tempted to make radical alterations out of fear or anexiety. Slow and steady will win this particualar race. When things go well, keep going and do not become lazy. When things go badly, keep going and do not become disheartened or affraid. But wether things go well or badly, you must keep going. Never give up. Through endurance and continous practice, advantages will slowly but surely accumulate, and the situation will eventually move toward your desired goal.";
        String theImage = "Thunder and wind. This is the image of what is Enduring. Thus the superior person stands firm, and does not change his direction.";
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
        new Heng();
    }
}
