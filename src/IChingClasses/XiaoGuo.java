package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class XiaoGuo extends IChingStone implements IChingLineNames {

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

    public XiaoGuo() {
        imagePath = "../IChingImages/UpToSixtyFour/62.XiaoGuo.jpg";
        image = new GImage(imagePath);
        element = "Thunder, Mountain";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Exceeding Smallness" );
        qualities.put("2", "Preponderance of the small");
        qualities.put("3", "Smallness in excess");
        qualities.put("4", "Conscientiousness");
        qualities.put("5", "Keeping a low profile");
        qualities.put("6", "Reining in your ambitions");
        qualities.put("7", "Maintaining your dignity in everyday life");
        qualities.put("8", "Paying attention to detail");
        qualities.put("9", "The little bird flies close to the ground");
        divination = getDivinationText();
        number = 62;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Xiao Guo - Exceeding Smallness";
        String keywords = "Preponderance of the small, small in excess, conscientiousness, keeping a low profile, reining in your ambitions, maintaining your dignity in everyday life, paying attention to detail, the little bird flies close to the ground";
        String theJudgement = "Exceeding Smallness. Success. It is beneficial to persevere. Small things may be done, great things should not be done. The flying bird leaves behind its song. One should not go up, one should go down. Great good fortune.";
        String theJudgementDescription = "This is not the time to undertake something big or difficult. Conditions are not in your favor for significant accomplishment. You lack the strength and resources to achieve what you would like. Therefore, you need to understand the demands of the time and scale back your expectations. You should not expect great success, but that does not mean there is nothing you can do. The text compares your situation to a small bird. If the little bird attempts to fly to high, it will get into trouble. But if it stays low, it will be safe and find its nest. In the same way, your best strategy right now is to maintain a low profile and attend to everyday matters. Stick to your ordinary routine. Success will come from scrupulous dedication to the minutiae of everyday life. Be especially conscientious and pay careful attention to detail. If you resolve to undertake only small things but do them well, you will get through this difficult period in good shape. Just as a small bird should not fly too high, you should not bit off more than you can chew. This is not a time for risk taking. Play it safe for the time being. Recognize your limitations and don't take on more than you are able. Don't try to show off or call attention to yourself. Be simple and unpretentious and keep your feet firmly planted on the ground. If you are too big for your britches, people will resent you and your projects will fail. But if you are modest and dignified and simply attend to your business, you will earn respect.";
        String theImage = "Above the mountain there is thunder: This is the image of Exceeding Smallness Thus the superior person In his conduct is exceedingly respectful, In his mourning is exceedingly sorrowful, in this expenditures is exceedingly temperate.";
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
        new XiaoGuo();
    }
}
