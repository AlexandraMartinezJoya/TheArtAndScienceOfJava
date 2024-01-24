package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class TongRen extends IChingStone implements IChingLineNames {
    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public TongRen() {
        image = new GImage("../IChingImages/UpToSixtyFour/13.TongRen.jpg");
        element = "Heaven, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", " Joining with others" );
        qualities.put("2", "Fellowship");
        qualities.put("3", "Concord");
        qualities.put("4", "Community");
        qualities.put("5", "Keeping the group together");
        qualities.put("6", "Fellowship with people");
        divination = getDivinationText();
        number = 13;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Tong Ren-Fellowship with people";
        String keywords = "Joining with others, fellowship, concord, community, keeping the group together";
        String theJudgement = "Fellowship with people, even in the open fields. Success. It is beneficial to cross the great river. It is beneficial for the superior person to persevere.";
        String theJudgementDescription = "The best way to realize your goals now is through participation in a group. You can achiece great influence and success through a collective endeavor. The group may be your friends, or it may be a political group, a social club, a religious organization, or the people you work with everyday. If you are willing to join in with likeminded people, you can acomplish much more than you ever could on your own. For a group to succed, people need to feel they have a common purpose and that the members are commited to eachother. Trust and reciprocity are essential ingredients to success. The text speaks of fellowship even in the open fields. Fields are a metaphor for what is far and wide, broad and distant. Thus fellowship even in the open fields means fellowship that is maintained through thick and thin, and that can extend to all sorts of people who possess common values and goals. A sense of commitment and shared devotion make it possible for a group to achieve important and ambitious tasks, symbolized by being able to cross the great river. If you find a gruop with whom you can identify and whose values you admire, give your support without reservation. If others see that you are earnest and sincere, they will be willing to join in as well. Over time, groups are subjected to many stresses and strains. The important thing is to let everyone in the group feel that they are needed and that their contributions are valued. If you take advantage of people or treat them in condencesion, they will not be willing to give their all for the group, and they will be more likely to abandon the enterprise in times of hardship. Whatever your position in the fellowship or organization, be open minded and willing to listen to others. Keep the communication lines open not only preserves harmony and stability over time, but it also helps the groups achieve its goals more effectively. The collective intelligence of many people working on a single project is often more powerful and thorough than of any single individual, not matter how talented. Individual efforts and skills become greater than the sum of their parts when they are brought together in a common endeavor.";
        String theImage = "Heaven and fire combine: this is the image of Fellowship with People, Thus the superior person organizes the clans and makes distinctions among things";
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

    public void create() {
        new TongRen();
    }

}
