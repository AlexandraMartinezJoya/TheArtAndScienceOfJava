package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Bo extends IChingStone implements IChingLineNames {

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

    public Bo() {
        imagePath = "../IChingImages/UpToSixtyFour/23.Bo.jpg";
        image = new GImage(imagePath);
        element = "Mountain, Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Deterioration" );
        qualities.put("2", "Stripping away");
        qualities.put("3", "Collapse");
        qualities.put("4", "Falling apart");
        divination = getDivinationText();
        number = 23;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Bo - Splitting Apart";
        String keywords = "Deterioration, Stripping away, Collapse, Falling apart";
        String theJudgement = "Splitting apart. It is not beneficial to have somewhere to go. Stay put";
        String theJudgementDescription = "Things are falling apart. The situation around you is deteriorating. Inferior people are on the rise and they are displacing people of value and merit. Relationships that once could be taken for granted have frayed and dissolved. Old ways of doing things are disintegrating and nothing has yet taken their place. Because the time is not propitious, there is no advantage in trying to undertake anything now. The deterioration that you face may result from changes in outer condition over which you have no control. In that case, you should not blame yourself for the fact that everything changes. Alternatively, the problem may be that elements of your life now seem to have outlived their usefulness. Old habits no longer serve your interests. Old assumptions no longer make sense. Things that you once took for granted no longer seem solid and dependable. This means you too are undergoing change. You are experiencing the end of an old cycle without the comforting assurance of what is yet to come. In either case, it is useless to struggle against the time. Your position has been weakened by the changes around you. You are vulnerable, either due to your position, your emotions, or both. For this reason avoid confrontation. You will only make things worse. The structure of the hexagram Bo suggests that the proper course of conduct at this time. The lower trigram, Kun, symbolizes devotion and acceptance. The upper trigram, Gen, symbolizes stillness and patience. These are the virtues to adopt now. You must endure this period of deterioration and wait for better times to emerge. According to the law of change, they inevitably will. In the meantime, acquiesce the new condition without surrendering your principles. Keep quiet and maintain a low profile. Try to remain detached and untroubled to the extent that circumstances allow. Emotional reactions will only drain you and cause you to do foolish things. But if you can stay calm, collected, and above the fray, you can safeguard your position during this difficult time and you will be less vulnerable to manipulation. Change is coming both to your outer and to your inner experience. This change may be painful and upsetting, but you must let it run it's course. It is a law of nature. Whatever becomes great will eventually be lessened, and whatever becomes full will eventually be emptied. You cannot alter this general trend. Therefore, the wisest course is to withdraw and wait for time of renewal.";
        String theImage = "The mountain rests on earth, this is the image of splitting apart, in the same way, those above make their foundations secure, by generosity to those below.";
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

    public String getImagePath() { return imagePath; }

    @Override
    public void create() {
        new Bo();
    }
}
