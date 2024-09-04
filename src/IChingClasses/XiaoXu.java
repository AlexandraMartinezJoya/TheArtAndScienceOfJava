package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class XiaoXu extends IChingStone implements IChingLineNames {

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

    public XiaoXu(){
        imagePath = "../IChingImages/UpToSixtyFour/9.XiaoXu.jpg";
        image = new GImage(imagePath);
        element = "Earth, Heaven";
        qualities = new HashMap<String, String>();
        qualities.put("1", "The taming of the power of the small" );
        qualities.put("2", "Restraint of the powerful by the weak");
        qualities.put("3", "Small framing");
        qualities.put("4", "Taking care of the little things");
        qualities.put("5", "Accumulation of small advantages");
        qualities.put("6", "Using gentleness and friendly persuasion");
        qualities.put("7", "Temporarily held back");
        qualities.put("8", "But the rain will come");
        qualities.put("9", "New paradise");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        divination = getDivinationText();
        number = 9;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "XiaoXu";
        String keywords = "The taming of the power of the small, restraint of the powerful by the weak, Small framing, taking care of the little things, accumulation of small advantages, using gentleness and friendly persuasion, temporarily held back, but the rain will come, new paradise";
        String theJudgement = "Small accumulation, success, dense clouds, no rain from the outskirts of our western region";
        String theJudgementDescription = "Rain symbolizes nourishment, release of tension, and success. Dense clouds offer the promise of eventual rain. However, the rain has not yet fallen, hence there is nothing to do but wait for events to play themselves out. The situation is not unfavorable. There is promise of success in the long run. But circumstances currently prevent you from doing much to bring your plans to fruition. Your advance is blocked by factors that you are not yet fully aware of. Although this may be frustrating, you should maintain a realistic attitude. Even though the barriers to progress seem minor, and frustratingly trivial, do not underestimate them. Exercise caution. There is considerably potential in the situation, but your position is not yet secure. Do not try to force the issue. Instead, do all that you can do now to prepare in small ways for the eventual breakthrough. Pay careful attention to everyday questions. Be meticulous and painstaking in your efforts. Plan ahead for future. Gather information and discuss the situation with others. Accumulate whatever small advantages you can. Do not threaten or coerce others or order them around to get your way. Instead, try to influence people through gentle persuasion and friendly behavior. In this way you can act as a partial restraint on their behavior if they are contemplating something unwise. The key is to be firm and determined on the inside and adaptable and gentle on the outside. Have faith that eventually the obstacles that are holding you back will give way, and the rain will fall.";
        String theImage = "The wind blows across the sky, this is the image of small accumulation. thus the superior person cultivates his graceful virtues.";
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

    public String getImagePath() { return imagePath;}

    @Override
    public void create() { new XiaoXu();}
}
