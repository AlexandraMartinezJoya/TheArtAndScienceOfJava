package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class CuiGatheringTogether extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public CuiGatheringTogether(){
        image = new GImage("../IChingImages/UpToSixtyFour/45.CuiGatheringTogether.jpg");
        element = "Lake, Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Gathering" );
        qualities.put("2", "Massing");
        qualities.put("3", "Joining others");
        qualities.put("4", "Assembling");
        qualities.put("5", "Having a common cause");
        qualities.put("6", "Holding yourself together");
        qualities.put("7", "Pitching in");
        qualities.put("8", "Cooperation between leaders and followers");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 45;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Kun";
        String keywords = "Gathering, Massing, Joining others, assembling, having a common cause, holding yourself together, pitching in, cooperation between leaders and followers";
        String theJudgement = "Gathering together. Success. The king approaches his temple. It is beneficial to see a great person. Success. It is beneficial to persevere. Brining a great offering means good fortune. It is beneficial to have somewhere to go.";
        String theJudgementDescription = "Fostering unity takes skill and patience. In order to bring people together, whether in a community, a charitable organization, or a business, you must give them a shared sense of purpose. You must give up the group direction, hence the text says, It is beneficial to have somewhere to go. Common goals, shared symbols, and shared belifs unite individuals and let them feel that they are working for something more than selfish interests or petty concerns. It is the duty of leaders to instill this sense of higher purpose. The text speaks of the king entering his temple. In ancient times rulers would lead their people by making a sacrifice to their ancestors. This sacrifice reminded people that they had common origins and that toghether they were keeping faith with something noble and valuable. Calling upon common ancestors and invoking shared traditions was a powerful symbol of community, which constituted them as a single people with a common history and destiny. In the same way, if you are called to bring people togeher, you must instill in them a sense of shared history and purpose. You must give them something to belive in. You must bring \"a great offering\" : something that performs the same function as the offering to the ancestors that the ancient kings made. You must find symbols that people can rally around and that express their joint commitment. You must create or invoke a common narrative through which people can connect themselves back to the past and ahead to the future. Thus gathering together means much more than simply assembling individuals at a single place and time. It means gathering them together with those who have gone before and with those who will be part of the group in the future. in this way the group's members can see themselves as part of a continuing project or tradition. In othder to gather other people together, you must first gather yourself together. To do this you must be certain about your values and aims. If you are internally conflicted, you will be outwardly hesitant and you will not be able to inspire confidence. Clarity of moral vision is necessary to rally people together around a great cause. When that clarity is present, an association whose members are united around a common goal can do remarkable things. Groups function best when their members willingly cooperate. If people become selfish, the group will not succeed and may even fall apart. Conflict is inevitable in any large organization because people have different interests and different point of view. But this is acceptable as long as the disagreements concern how best to realize shared values and goals rather than attempts by one faction to suppress and dominate another. If you are a member of a group, be willing to work with the leaders and help them succeed. Understand your place in the larger organization and give your best. If you are a leader, make sure that you act in the interests of everyone. Remember the Chinese proverb that to rule is to serve.";
        String theImage = "The lake rises above the earth, This is the image of gathering together, thus the superior person repairs his weapons, in order to meet the unexpected";
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

    void create() { new CuiGatheringTogether();}
}
