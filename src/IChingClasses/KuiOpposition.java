package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class KuiOpposition extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public KuiOpposition() {
        image = new GImage("../IChingImages/IChingClasses.KuiOpposition.png");
        element = "Fire, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Estrangement" );
        qualities.put("2", "Misunderstanding");
        qualities.put("3", "Different points of view");
        qualities.put("4", "Polarity");
        qualities.put("5", "Diversity");
        qualities.put("6", "Creative tension");
        qualities.put("7", "Finding commonality within difference");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Middle Summer");
        divination = getDivinationText();
        number = 30;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Li";
        String keywords = "Fire, Brilliance, Clarity, Shedding light on things, Enlightenment";
        String theJudgement = "Opposition, In small matters there is good fortune";
        String theJudgementDescription = "Opposition and estrangement have entered the situation. Misunderstandings have arisen, and so people mistrust and doubt each other. For this reason, they are not cooperating and cannot make any progress. In these circumstances it is important to proceed slowly and carefully. Mistrust has to be dissipated gradually, in small steps. Hence the text says that good fortune comes from small things. Even in marked opposition there is usually some kind of commonality. In order to relax the tensions, it  is best to remind people of what they have in commmon and turn their attention to values that all share. If you find yourself estranged from other people, try to see things from their point of view. Consider that they are probably as mistrustful of you are you are of them. Viewing other people not as enemies but as fellow human beings trying to make their way in the world is the first step to resolving conflict. Be tolerant and gracious. Be willing to make the first move in order to meet other people halfway. Doing this will begin to dissipate the atmosphere of confrontation and mutual suspicion. By altering the tone of your interactions and making signs that you seek understanding and reconciliation, you can begin breaking down barriers of mistrust and soften attitudes that have hardened over time. But it is important to proceed with great sensitivity and caution. Do not think that you can make everything better overnight. Trust takes time to be reestablished, especially when opposition has been severe or longstanding. Do not rush things. Give people, including yourself, time to move closer together and find a method of reconciliation. In a time of opposition, making the first move takes courage. Don't allow your pride or your fear of being thought weak keep you from reaching out to others and resolving misunderstandings. People cling to opposition not because they are strong, but because they are weak: the sittuation makes them feel insecure and they are afraid of what will happen if they expose themselves. As a result, they allow resentments to build and misunderstandings to fester. By contrast, people who know their own worth are the ones who can afford to be tolerant and generous. They understand that people can improve their lives if they are willing to risk a little emotional pain and uncertainty. They do not confuse tolerance with deficiency or magnanimity with weakness.";
        String theImage = "Fire is above, Lake is below, this is the image of opposition, the superior person seeks common ground, while recognizing differences.";
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

    void create() { new KuiOpposition();}
}
