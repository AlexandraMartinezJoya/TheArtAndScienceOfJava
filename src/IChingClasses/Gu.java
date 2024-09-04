package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Gu extends IChingStone implements IChingLineNames {

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

    public Gu(){
        imagePath = "../IChingImages/UpToSixtyFour/18.Gu.jpg";
        image = new GImage("../IChingImages/UpToSixtyFour/18.Gu.jpg");
        element = "Mountain, Wind";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Blizzard" );
        qualities.put("2", "Hurricane");
        qualities.put("3", "Cave in windy mountain");
        qualities.put("4", "Spin");
        qualities.put("5", "Misty spin");
        qualities.put("6", "Cloud");
        qualities.put("7", "Vacuum");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Late Winter");
        seasonsAndWeather.put("2", "Stillness");
        divination = getDivinationText();
        number = 18;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Gu";
        String keywords = "Working on what has been spoiled, decay, repair, restoration";
        String theJudgement = "Things are falling apart. The situation around you is deteriorating. Inferior people are on the rise and they are displacing people of value and merit. Relationships that once could be taken for granted have frayed and dissolved. Old ways of doing things are disintegrating and nothing has yet taken their place. Because the time is not advantageous, there is no advantage in trying to undertake anything now. The deterioration that you face may result from changes in outer condition over which you have no control. In that case, you should not blame yourself for the fact that everything changes. Alternatively, the problem may be that elements of your life now seem to have outlived their usefulness. Old habits no longer serve your interests. Old assumptions no longer make sense. Things that you once took for granted no longer seem solid and dependable. This means you too are undergoing change. You are experiencing the end of an old cycle without the comforting assurance of what is yet to come. In either case, it is useless to struggle against the time. Your position has been weakened by the changes around you. You are vulnerable, either due to your position, your emotions, or both. For this reason avoid confrontation. You will only make things worse. The structure of the hexagram IChingClasses.Bo suggests that the proper course of conduct at this time. The lower trigram, Kun, symbolizes devotion and acceptance. The upper trigram, Gen, symbolizes stillness and patience. These are the virtues to adopt now. You must endure this period of deterioration and wait for better times to emerge. According to the law of change, they inevitably will. In the meantime, acquiesce the new condition without surrendering your principles. Keep quiet and maintain a low profile. Try to remain detached and untroubled to the extent that circumstances allow. Emotional reactions will only drain you and cause you to do foolish things. But if you can stay calm, collected, and above the fray, you can safeguard your position during this difficult time and you will be less vulnerable to manipulation. Change is coming both to your outer and to your inner experience. This change may be painful and upsetting. But you must let it run it's course. It is a law of nature. Whatever becomes great will eventually be lessened, and whatever becomes full will eventually be emptied. You cannot alter this general trend. Therefore, the wisest course is to withdraw and wait for time of renewal.";
        String theJudgementDescription = "Although the theme if Gu is decay, the hexagram also symbolizes the possibility of hope. Gu is concerned not so much with the natural forces of decay, as with the decay that comes through bad habits and unwise choices. Such decay results from inertia, carelessness, muddled thinking, selfishness, and lack of discipline. In order to remedy this decay, you must adopt the opposite traits, energetic activity, careful preparation, thoughtful deliberation, determination, and commitment. What has gone wrong though mistake, lassitude, or inaction, can be repaired through self-discipline, commitment, energy, and enterprise. Gu thus symbolizes both the inevitable weaknesses and shortcomings of human will that cause conditions to decline and the abundant potential of human freedom that can bring about renewal and recovery. This is a message of hope, the text tells us that working to repair what has become stagnant promises supreme success. That is why it is worth 'crossing the great river', that is, undertaking something difficult and arduous. Something is going wrong in your life. It may be your environment or it may be your own habits and attitudes. The problem is the legacy of previous bad choices. It has existed for some time, although you may not have realized it. Its origins lie in past actions or inaction, mistakes of judgement and missed opportunities. Even so, you now have the ability to do something about it. You can start anew. But you must make the effort to do so. Inertia is a big reason why things have come to this state. If you let things slide, the problem will not go away. Indeed, the situation will only get worse. Success in remedying what has been spoiled requires, first of all, that you ascertain what has gone wrong and why. You must ask yourself how things got this way. In order to do this you will have to face the situation honestly. You may have to confront unpleasant and unresolved issues in your life or your environment, and you may have to acknowledge features of the situation that you previously neglected, denied, or hid from yourself. The task calls for deliberation and self-examination. This may be emotionally difficult, but gaining insight is essential to success. Hence the text says 'before starting, three days', meaning that before you must take the time to understand the source of the problem so that you can devise an appropriate remedy. You should not be afraid to act for fear of doing the wrong thing, but you should exercise caution and restraint at the beginning. Seek advice from people you trust. Do not be to proud to ask for help. Once you have started working to repair the sittuation, spend some time evaluating what you have done. Ask yourself: if the new strategy working? Does it need to be readjusted? That is why the text says, after starting, three days. After you begin reforms, your actions must be guided by continous investigation and deliberation. In this way you will avoid falling back into bad old habbits. Above all, have courage. Maintain faith in yourself no matter how difficult making the necessary changes may be at the beginning. If you persevere and remain determined to see things through, your efforts will be rewarded.";
        String theImage = "Below the mountain, the wind blows. This is the image of remedying what has been spoiled. Thus the superior person stirs up the people and nourishes the virtue";
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

    public String getImagePath() { return imagePath;}

    @Override
    public void create() {
        new Gu();
    }
}
