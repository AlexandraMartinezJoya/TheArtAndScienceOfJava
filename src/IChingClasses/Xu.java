package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Xu extends IChingStone implements IChingLineNames {

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

    public Xu() {
        imagePath = "../IChingImages/UpToSixtyFour/5.Xu.jpg";
        image = new GImage(imagePath);
        element = "Water, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Calculated waiting" );
        qualities.put("2", "Biding your time");
        qualities.put("3", "Waiting for rain");
        qualities.put("4", "Nourishment");
        qualities.put("5", "Replenishment");
        divination = getDivinationText();
        number = 5;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Xu - Calculated waiting";
        String keywords = "Calculated waiting, biding your time, waiting for rain, nourishment, replenishment";
        String theJudgement = "Waiting. Sincerity and faithfulness bring shining success. Perseverance brings good fortune. It is beneficial to cross the great river.";
        String theJudgementDescription = "Because of circumstances beyond control, you must wait patiently. You cannot take direct action at present. Nevertheless, you must have faith that things will work out for the best eventually. Just as we cannot force the rain to fall, we cannot force the propitious circumstances for action. Instead, we must let them come to us, just as the rain will eventually come and replenish and nourish the earth. There are two kinds of waiting: the apprehensive waiting of the weak and the calculated waiting of the strong. The weak person wait out of the fear and despair, becomes increasingly filled with anxiety and agitation and so finally plunges ahead at the wrong time with disastrous results. In contrast, the strong person waits because waiting is the best way to maximize the chances of eventual success. Such calculated waiting is a sign of strength, not weakness, of assurance, not resignation, of competence, not deficiency. While the weak person waits ever fearful that matters will spin out of control, the strong person waits knowing that success in inevitable, and all the elements for success will appear when the time is right. Calculated waiting is not merely a matter of hope for better days. It is a matter of faith, faith in the ultimate success of your endeavors, and equally important, faith in yourself. You must believe that you are going to succeed and that you deserve to. You must visualize success in your mind's eye. You must believe the narrative of your eventual triumph. Then your faith will unconsciously adapt to your actions to maximize your chances. Hence the text says, 'Sincerity and faithfulness bring shining success'.The power of faith provides allows a person to preserve in even the most difficult endeavors, symbolized by crossing the great river. Just because you are waiting does not mean that there is nothing to do. First and foremost, you must try to understand the situation objectively. Your faith must be nourished by realism. You will prevail only if you can develop the necessary inner strength and self-confidence to meet the conditions that actually exist, and to do this, you must be uncompromisingly honest with yourself. Only when you face the situation as it is without self-deception or illusion will you be able to see what holds you back and what you must do to prevail. At this point, the way forward will slowly emerge, the light of your inner truth will gradually illuminate the path to success. Make all the necessary preparations. Do not cut corners and do not take half measures. When and only when the time is right, you must go forward with tenacity. Along the way you will inevitably experience doubts about whether you have what it takes to succeed. Put them aside. Keep your ultimate goal ever before you. When the time has come to act, you must be resolute and preserving. Go out to meet your fate with determination, with faith and with courage. Then you will get what you seek.";
        String theImage = "Clouds rise up to heaven, this is the image of waiting, thus the superior person eats and drinks in joy and repose.";
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
        new Xu();
    }
}
