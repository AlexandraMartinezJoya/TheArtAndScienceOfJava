import IChingClasses.Shi;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class ShiTests extends ConsoleProgram {

    public void run() {

        Shi shi = new Shi();
        String shiHasTheSameImage = shiHasTheSameImage(shi);
        println(shiHasTheSameImage);
    }

    public String shiHasTheSameImage(Shi shi){
        String shiHasTheSameExpectedImage = "Shi has the same expected image";
        String shiDoesNotHaveTheSameExpectedImage = "Shi does not have the same expected image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/7.Shi.jpg");
        if(shi.getIChingImage().equals(expectedImage)) {
            return shiHasTheSameExpectedImage;
        } else {
            return shiDoesNotHaveTheSameExpectedImage;
        }
    }

    public String shiHasTheSameImagePath (Shi shi) {
        String shiHasTheSameImagePath = "Shi has the same expected image path";
        String shiDoesNotHaveTheSameImagePath = "Shi has the same expected image path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/7.Shi.jpg";
        if(shi.getImagePath().equals(expectedClassPath)) {
            return shiHasTheSameImagePath;
        } else {
            return shiDoesNotHaveTheSameImagePath;
        }
    }

    public String shiHasTheSameElements(Shi shi) {
        String shiHasTheExpectedElements = "Shi has the expected elements and they are : " + shi.getElementName();
        String shiDoesNotHaveTheExpectedElements = "Shi does not have the expected elements";
        String expectedElements = "Earth, Water";
        if(shi.getElementName().equals(expectedElements)) {
            return shiHasTheExpectedElements;
        } else {
            return shiDoesNotHaveTheExpectedElements;
        }
    }

    public String shiHasTheSameQualities(Shi shi) {
        String shiHasTheSameElementQualities = "Shi has the same element qualities and they are" + shi.getElementQualities() ;
        String shiDoesNotHaveTheSameQualities = "Shi does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Underground water" );
        expectedQualities.put("2", "Subterranean water");
        expectedQualities.put("3", "Inner spring");
        expectedQualities.put("4", "Underground rivers");
        expectedQualities.put("5", "Water conduct");
        expectedQualities.put("6", "Sewerage system");
        expectedQualities.put("7", "Drain pipe");
        expectedQualities.put("8", "Underground channel");
        expectedQualities.put("9", "Gathering of springs");
        expectedQualities.put("10", "Underground lake");
        expectedQualities.put("11", "Restoration");
        expectedQualities.put("12", "Renovation");
        expectedQualities.put("13", "Renewal");
        expectedQualities.put("14", "Improvement");
        expectedQualities.put("15", "Military virtues");
        expectedQualities.put("16", "Discipline");
        expectedQualities.put("17", "Self discipline");
        expectedQualities.put("18", "Honor");
        expectedQualities.put("19", "Loyalty");
        expectedQualities.put("20", "Integrity");
        expectedQualities.put("21", "The multitude");
        if(shi.getElementQualities().equals(expectedQualities)) {
            return shiHasTheSameElementQualities;
        } else {
            return shiDoesNotHaveTheSameQualities;
        }
    }

    public String shiHasTheSameDivination(Shi shi){
        String shiHasTheSameDivination = "Shi has the same divination and it is " + shi.getDivination().get("Keywords");
        String shiDoesNotHaveTheSameDivination = "Shi does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Shi");
        expectedDivination.put("Keywords", "Underground water, Subterranean water, Inner spring, Underground rivers, drain pipe, Sewerage system, Drain pipe, Underground channel, Gathering of springs, underground lake, gathering of springs, restoration, renovation, renewal, improvement, military virtues, discipline, self discipline, honor, loyalty, integrity, the multitude of water springs, geiser, artificial water fountain");
        expectedDivination.put("The Judgement","The army needs perseverance and a strong leader. Good fortune. No blame");
        expectedDivination.put("Judgement Description","A mass of people is not an army, but it can become one if its trained, organized, and led by a great general. Discipline is crucial. It converts a disorganized mob into an effective fighting force. But discipline is not achieved through threats or violence. Rather it requires leadership. Good generals know how to inspire their troops and create a sense of esprit de corps. They know how and when to exercise authority and punish disobedience, to encourage resourcefulness and reward ambition. They train their troops so thoroughly that discipline and obedience become second nature, and then organize and arrange them so that their force and effect is amplified and maximized. Great generals always show care and concern for the welfare of their soldiers. They understand the destructiveness of war and therefore risk the lives of their soldiers only when it is necessary to do so. They are bold when the situation requires it but hold back when it is prudent. They use force sparingly and with precision. And because they are loyal and honorable to those who serve beneath them, their troops willingly follow them into battle. Just as troops are loyal to good generals, good generals are loyal and trustworthy to their king and country. Hence rulers have complete confidence in their military leaders and give them the responsibility to conduct the war to its conclusion. The same considerations apply to all effective leadership. Any organization needs a strong leader who knows how to gain the trust of others and inspire them with a sense of vision and common purpose. You must be able to convey your sense of enthusiasm and commitment to others, and you must recognize the importance of planning, organization and discipline. Exert your authority fairly and consistently and you will win the respect and obedience of others. Act loyally and honorably to others if you want them to act loyally and honorably to you. The army is also a metaphor for the conduct of your life. You are both the potential army and the general who must train it and transform it from a disorganized mass of peasantry into a disciplined and motivated force. Like the general, you are entrusted with great possibilities. But like the undifferentiated mass, your ambitions will amount to nothing if you do not establish priorities and organize and structure your life. If you want to succeed, you must have clear-cut goals and you must be enthusiastic about them. Otherwise you will not have the courage to persevere when you meet opposition. Discipline yourself and your desires so that healthy and effective habits become second nature. Marshal your forces and abilities and put them to the best possible use. In the same way, apply the basic elements of good military strategy to your life. Once you have settled on your goals, decide what course of action will be most likely to achieve them, and pursue them with steadfast determination. Be resourceful and open to new solutions. Make no rash assaults but instead move forwardly only when you have carefully planned everything in advance and have fully considered the consequences of your actions. Seek all available intelligence and information and carefully consider the correct terrain in which to act. Put yourself in the right place as to maximize your effectiveness. In dealing with others, adopt the military virtues of honor, loyalty and integrity. Finally, treat yourself and your resources with the same degree of care that a wise general would treat his own troops. Do not enlist in reckless sallies and do not engage in self-destructive behavior. Respect yourself and behave toward yourself as someone who is worthy of loyalty and honor. Have the courage to maintain faith in yourself and your aspirations. Follow the principles of a great general and you will help ensure your victory in the long run.");
        expectedDivination.put("The Image","In the middle of the earth is water. This is the image of the army. Thus the superior person marshals his forces through generosity to the common people");
        if(shi.getDivination().equals(expectedDivination)) {
            return shiHasTheSameDivination;
        } else {
            return shiDoesNotHaveTheSameDivination;
        }
    }

    public String shiHasTheSameNumber(Shi shi) {
        String shiHasTheSameNumber = "Shi has the same number and it is: "+ shi.getNumber();
        String shiDoesNotHaveTheSameNumber = "Shi does not have the same number";
        int expectedNumber = 7;
        if(shi.getNumber() == expectedNumber) {
            return shiHasTheSameNumber;
        } else {
            return shiDoesNotHaveTheSameNumber;
        }
    }

}
