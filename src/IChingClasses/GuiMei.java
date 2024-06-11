package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class GuiMei extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public GuiMei() {
        image = new GImage("../IChingImages/UpToSixtyFour/54.GuiMei.jpg");
        element = "Thunder, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1", "The Marrying Maiden" );
        qualities.put("2", "The Maiden given in marriage");
        qualities.put("3", "Playing a subordinate role");
        qualities.put("4", "Subordination");
        qualities.put("5", "Keeping in the background");
        divination = getDivinationText();
        number = 54;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Gui Mei - The Marrying Maiden";
        String keywords = "The Maiden given in marriage, Playing a subordinate role, subordination, keeping in the background";
        String theJudgement = "The Marrying Maiden. To set forth brings misfortune. There is nothing for which this is beneficial.";
        String theJudgementDescription = "Under the current circumstances you must play a subordinate role. Your contributions are not being fully recognized and your worth is not fully appreciated. However, for the moment there is nothing you can do about this. If you try to assert yoursel, people will regard it as inappropriate. You will be either rebuffed or ignored. The text compares your situation to that of a secondary wife in a family in ancient China. The secondary wife had to behave with caution and circumspection. She could not shine too much lest she uncur the wrath of the first wife. She has to be demure and self-sacrificing in order to preserve order and harmony in the family. Her position was very difficult and required the utomst tact and reserve, but if she behaved with suitable discretion, she could find a place of peace and dignity within the household. The best strategy right now is to be flexible and adaptable. You are not going to receive very much recognition for your efforts, so you should be sensible. If your expectations are too unrealistic, then you will only make yourself unhappy. Don't be angry and resentful. Life is not always fair. Accept the situation for the time being. Stay out of the limelight and don't try to draw attention to yourself. Perform your assigned role without show or ceremony. Instead of bemoaning your fate, consider instead how you can be of service and make a contribution. Relationships with others may be particulary difficult now. You cannot control the current situation. In particular, you cannot force other people to love you, you can only behave with love toward them. That means acting out of mercy and acceptance rather than out of anger and bitterness. Do not try to manipulate others and do not allow others to manipulate you. In the long run, what holds human relationships together are charity, tact, and discretion, not demanding everything that is yours but overlooking the inevitable slights and upsets of daily life. Despite your subordinate position, it is still possible to act with honor and dignity. Hold yourself to the highest standards. Take pride in your work and in your good qualities. Belive in yourself even if others do not currently recognize you. By staying true to your own ideals and not allowing your self-worth to be determined by the oppinion of others, you will gain inner strength and obtain inner freedom.";
        String theImage = "Above the lake there is thunder, this is the image of the maiden given in marriage. Thus the superior person understands the imperfect and the transitory in the light of what endures in the end.";
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
        new GuiMei();
    }
}
