package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Kan extends IChingStone implements IChingLineNames {

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

    public Kan() {
        imagePath = "../IChingImages/UpToSixtyFour/29.Kan.jpg";
        image = new GImage(imagePath);
        element = "Water, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Danger" );
        qualities.put("2", "Melancholy");
        qualities.put("3", "Passion");
        familyMember = "Middle Son";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "ear");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Middle Winter");
        seasonsAndWeather.put("2", "Cloudy");
        divination = getDivinationText();
        number = 29;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Kan";
        String keywords = "Darkness, danger, despair, the abysmal, courage and devotion, maintaining faith, pushing through the rapids, getting through the other side";
        String theJudgement = "Repeated Abyss. If you are truthful and sincere, and follow your heart, then you will have success, and your actions will bring esteem";
        String theJudgementDescription = "You face a difficult and dangerous situation. You cannot wish it away. You must rise to the challenge and handle the dangers in front of you. Water symbolizes danger, and water also symbolizes the proper way to behave during times of danger. Water is a part of nature and behaves naturally. No matter what happens, it is true to itself. It flows forward without pause. It fills up every place it travels, no matter how lowly. It does not hesitate to move downward in order to move forward. It does not refuse to travel through dangerous places or to take a plunge. It follows its own course, pressing even onward through rocks and ravines until it reaches the calmness of the ocean. In like fashion, when confronted with difficulties, you must be like water: true to yourself, moving forward without hesitation, and not disdaining to do whatever is necessary to push through the dangerous conditions into safety. The text emphasizes truth and sincerity. It says that you can proceed through danger successfully if you are sincere. To be sincere means first that you are not lying to yourself or deluding yourself. Do not engage in wishful thinking. Accept matters as they are and not as you would like them to be. Equally important, be true to yourself. Understand who you are, what you believe, and what you stand for. Sincerity also means that you are connected to and making use of all your emotional resources. You must summon up all your courage. If you can master yourself, you are in the best possible position to master the situation. And once you have gotten in touch with your heart, you will instinctively know what you have to do to survive. Being honest does not mean pessimism or despair. Quite the contrary: the lessons of the Book of Changes is that true courage comes from confronting yourself as you are, making use of what you have inside you and not running away from your nature. People who engage in pessimism and self abuse may be as out of touch with reality and with themselves as people who display an excess of pride. If you are sincere, and willing to accept yourself, you will discover that there is much more to you than you imagined. Sincerity means, finally, that you must believe in yourself. Do not lose heart. Stand up for your beliefs and maintain your integrity. When chips are down, it is less important what other people think than what you believe. Remain true to your deepest values. To face danger and to face the disapproval and misunderstanding of others takes courage. But if you are not true to yourself in time of danger, you will lose yourself in time of danger. To succeed in a dangerous situation, you must be thorough and persistent, proceeding without hesitation, like water flowing through a deep ravine. You must do whatever it takes to move past your difficulties. To vacillate when there is work to be done will only increase the perils you face. Like a person traveling through rapids, you must propel yourself forward through the situation in order to reach safety. You must push through, no matter how bad it may seem, for safety lies not where you are but on the other side. Danger is a part of life. It cannot be avoided. Like the rapids, we must move through it in order to get to safety. That is why courage is one of the most important values in life. To risk danger may sometimes require physical courage. But the most important asset you can have is emotional courage, the ability to face up to your situation and to who you really are. Emotional courage is a form of self- knowledge. That is why the book of changes emphasizes truth and sincerity in times of danger, for one succeeds in facing danger through self-knowledge. Danger can clarify your thinking. It can help you understand yourself, what you truly care about, and what you must do. Thus, paradoxically, danger protects as well as threatens: Facing danger makes you stronger if you do not allow yourself to be overwhelmed by it.";
        String theImage = "Water flows incessantly toward its goal: this is the image of the abyss repeated. thus the superior person walks in lasting virtue and carries the work of edification.";
        divination.put("Title", title);
        divination.put("Keywords", keywords);
        divination.put("The Judgement", theJudgement);
        divination.put("Judgement Description", theJudgementDescription);
        divination.put("The Image", theImage);
        return divination;
    }

    public GImage getIChingImage() {return image;}

    public String getElementName() { return element;}

    public HashMap getElementQualities() { return qualities;}

    public String getFamilyMember() { return familyMember;}

    public HashMap getBodyPart() { return partOfBody;}

    public String getRelatedAnimal() {return animals;}

    public HashMap getSeasonAndWeather() {return seasonsAndWeather;}

    public HashMap getDivination() {return divination;}

    public int getNumber() { return number;}

    public String getImagePath() {return imagePath;}

    @Override
    public void create() {
        new Kan();
    }
}
