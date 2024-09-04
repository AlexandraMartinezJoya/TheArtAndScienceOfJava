package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class QianModesty extends IChingStone implements IChingLineNames {

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

    public QianModesty() {
        imagePath = "../IChingImages/UpToSixtyFour/15.QianModesty.jpg";
        image = new GImage(imagePath);
        element = "Earth, Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Humility" );
        qualities.put("2", "Humbleness");
        qualities.put("3", "Moderation");
        qualities.put("4", "Temperance");
        qualities.put("5", "Maintaining a balanced attitude");
        qualities.put("6", "Fulfilling ones duties");
        qualities.put("7", "Carrying things through to completion");
        divination = getDivinationText();
        number = 15;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "QianModesty";
        String keywords = "Humility, Modesty, Moderation, Temperance, Maintaining a balanced attitude, Fulfilling ones duties, Carrying things through to completion";
        String theJudgement = "Return. Success. Going out and coming in without harm. Friends come. No blame. It is beneficial to have somewhere to go.";
        String theJudgementDescription = "According to the book of changes, modesty is one of the most important virtues. It is not innate but rather is the product of long, continuous and conscious self-development and self-cultivation. It differs from Christian ideal of meekness iun important respects. Modesty does not mean submissiveness or passivity. A modest person may be quite active in the world, working steadily and unobtrusively, making commitments and living up to them. The text says that the modest person carries things through their conclusion. Why is this attitude modest? It is because modest people do not think they are more important than the work that they perform or the commitment that they have made to others. Therefore, they are consistent and reliable. Modest people do not regard anything that they must do as beneath them. Therefore, their pride does not get in the way of their success. They put their work, their obligations, and their commitments before their egos. That is why they are able to prevail in the long run. Thus, modesty does not imply inaction. Rather, it means acting positively, cooperatively, and harmoniously. It means respecting other people and treating them as equals. By contrast, proud people think they are better than everyone else or act as if they were. Often their pride hides a deeper insecurity. But truly modest people know who they are and therefore do not need to engage in pretension in order to impress others. Conversely, they do not think of others as beneath them, they treat other people with the inherent dignity that all people deserve. Thus modesty means being intolerant and accepting rather than haughty or judgemental. The virtue of modesty is connected to the principles of yin and yang underlying the philosophy of the book of changes. Whatever is extended too far will eventually be contracted and diminished, conversely, whatever is modest will eventually be expanded and increased. People envy and fear what is to great to powerful and seek to undermine it, but they do not feel threatened by what is lowly and humble and so they treat it with kindness and affection. By adopting the virtues of humility and modesty you make it easier for people to accept you and cooperate with you to your mutual advantage. And by not pushing things too far you avoid pride and overreaching that might bring about a fall.";
        String theImage = "In the middle of the earth there is a mountain, this is the image of modesty, thus the superior person lessens what is too much, and increases what is too little. he weighs things and makes their distribution equal.";
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

    public String getImagePath() {return imagePath;}

    @Override
    public void create() {
        new QianModesty();
    }
}
