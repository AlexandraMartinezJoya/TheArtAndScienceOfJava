package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Shi extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Shi() {
        image = new GImage("../IChingImages/UpToSixtyFour/7.Shi.jpg");
        element = "Earth, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Underground water" );
        qualities.put("2", "Subterranean water");
        qualities.put("3", "Inner spring");
        qualities.put("4", "Underground rivers");
        qualities.put("5", "Water conduct");
        qualities.put("6", "Sewerage system");
        qualities.put("7", "Drain pipe");
        qualities.put("8", "Underground channel");
        qualities.put("9", "Gathering of springs");
        qualities.put("10", "Underground lake");
        qualities.put("11", "Restoration");
        qualities.put("12", "Renovation");
        qualities.put("13", "Renewal");
        qualities.put("14", "Improvement");
        qualities.put("15", "Military virtues");
        qualities.put("16", "Discipline");
        qualities.put("17", "Self discipline");
        qualities.put("18", "Honor");
        qualities.put("19", "Loyalty");
        qualities.put("20", "Integrity");
        qualities.put("21", "The multitude");
        divination = getDivinationText();
        number = 7;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Shi";
        String keywords = "Underground water, Subterranean water, Inner spring, Underground rivers, drain pipe, Sewerage system, Drain pipe, Underground channel, Gathering of springs, underground lake, gathering of springs, restoration, renovation, renewal, improvement, military virtues, discipline, self discipline, honor, loyalty, integrity, the multitude of water springs, geiser, artificial water fountain";
        String theJudgement = "The army needs perseverance and a strong leader. Good fortune. No blame";
        String theJudgementDescription = " A mass of people is not an army, but it can become one if its trained, organized, and led by a great general. Discipline is curcial. It converts a disorganized mob into an effective fighting force. But discipline is not achieved through threats or violence. Rather it requires leadership. Good generals know how to inspire their troops and create a sense of esprit de corps. They know how and when to exercise authority and punish disobedience, to enourage resourcefulness and reward ambition. They train their troops so thoughly that discipline and obedience become second nature, and then organize and arrange them so that their force and effect is amplified and maximized. Grteat generals always show care and concern for the welfare of their soldiers. They understand the destructiveness of war and therefor risk the lives of their soldiers only when it is necessary to do so. They are bold when the situation requires it but hold back when it is prudent. They use force sparingly and with precision. And because they are loyal and honorable to those who serve beneath them, their troops willingly follow them into battle. Just as troops are loyal to good generals, good generals are loyal and trustworthy to their king and country. Hence rulers have complete confidence in their military leaders and give them the responsability to conduct the war to its conclusion.\n" +
                "The same considerations apply to all effective leadership. Any organization needs a strong leader who knows how to gain the trust of others and inspire them with a sense of vision and common purpose. You must be able to convey your sense of enthusiasm and commitment to others, and you must recognize the importance of planning, organization and discipline. Exert your authority fairly and consistently and you will win the respect and obedience of others. Act loyally and honorably to others if you want them to act loyally and honorably to you. The army is also a metaphor for the conduct of your life. You are both the potential army and the general who must train it and transform it from a disorganized mass of peasantry into a disciplined and motivated force. Like the general, you are entrusted with great possibilities. But like the undifferentiated mass, your ambitions will amount to nothing if you do not establish priorities and organize and structure your life. If you want to succeed, you must have clear-cut goals and you must be enthusiastic about them. Otherwise you will not have the courage to persevere when you meet opposition. Discipline yourself and your desires so that healthy and effective habits become second nature. Marshal your forces and abilities and put them to the best possible use. In the same way, apply the basic elements of good military strategy to your life. Once you have settled on your goals, decide what course of action will be most likely to achieve them, and pursue them with steadfast determination. Be resourceful and open to new solutions. Make no rash assaults but instead move forwardly only when you have carefully planned everything in advance and have fully considered the consequences of your actions. Seek all available intelligence and information and carefully consider the correct terrain in which to act. Put yourself in the right place as to maximize your effectivness. In dealing with others, adopt the military virtues of honor, loyality asnd integrity. Finally, treat yourself and your resources with the same degree of care that a wise general would treat his own troops. Do not enlist in reckless sallies and do not engage in self-destructive behavior. Repsect yourself and behave toward yourself as someone who is worthy of loyalty and honor. Have the courage to maintain faith in yourself and your aspirations. Follow the principles of a great general and you will help ensure your victory in the long run.";
        String theImage = "In the middle of the earth is water. This is the image of the army. Thus the superior person marshals his forces through generosity to the common people";
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
        new Shi();
    }
}
