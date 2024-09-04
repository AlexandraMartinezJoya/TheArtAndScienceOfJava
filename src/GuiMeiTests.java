import IChingClasses.GuiMei;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class GuiMeiTests extends ConsoleProgram {

    public void run(){
        GuiMei guiMei = new GuiMei();
        String isSameImage = isSameImage(guiMei);
        println(isSameImage);
    }

    public String isSameImage(GuiMei guiMei) {
        String isSameImage = "Gui Mei is same image";
        String isNotTheSameImage = "Gui mei is not the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/54.GuiMei.jpg");
        if(guiMei.getIChingImage().equals(expectedImage)){
            return isSameImage;
        } else {
            return isNotTheSameImage;
        }
    }

    public String hasSameImagePath(GuiMei guiMei) {
        String hasSameImagePath = "Gui Mei has same image path";
        String hasNotTheSameImagePath = "Gui Mei does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/54.GuiMei.jpg";
        if(expectedImagePath.equals(guiMei.getImagePath())) {
            return hasSameImagePath;
        } else {
            return hasNotTheSameImagePath;
        }
    }

    public String hasSameElementName( GuiMei guiMei){
        String hasTheSameElementName = "Gui mei has the same element name " + guiMei.getElementName();
        String doesNotHaveTheSameElementName = "Gui Mei does not have the same element name";
        String expectedElementName = "Thunder, Lake";
        if(guiMei.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameElementQualities( GuiMei guiMei) {
        String hasTheSameElementQualities = "Gui Mei has the same element qualities" + guiMei.getElementQualities();
        String doesNotHaveTheSameElementQualities = "Gui Mei does not have the same element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1", "The Marrying Maiden" );
        expectedElementQualities.put("2", "The Maiden given in marriage");
        expectedElementQualities.put("3", "Playing a subordinate role");
        expectedElementQualities.put("4", "Subordination");
        expectedElementQualities.put("5", "Keeping in the background");
        if(guiMei.getElementQualities().equals(expectedElementQualities)){
            return hasTheSameElementQualities;
        } else {
            return doesNotHaveTheSameElementQualities;
        }
    }

    public String hasTheSameDivination(GuiMei guiMei) {
        String hasTheSameDivination = "Gui Mei has the same divination as expected: " + guiMei.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Gui Mei does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Gui Mei - The Marrying Maiden");
        expectedDivination.put("Keywords", "The Maiden given in marriage, Playing a subordinate role, subordination, keeping in the background");
        expectedDivination.put("The Judgement", "The Marrying Maiden. To set forth brings misfortune. There is nothing for which this is beneficial.");
        expectedDivination.put("Judgement Description", "Under the current circumstances you must play a subordinate role. Your contributions are not being fully recognized and your worth is not fully appreciated. However, for the moment there is nothing you can do about this. If you try to assert yoursel, people will regard it as inappropriate. You will be either rebuffed or ignored. The text compares your situation to that of a secondary wife in a family in ancient China. The secondary wife had to behave with caution and circumspection. She could not shine too much lest she uncur the wrath of the first wife. She has to be demure and self-sacrificing in order to preserve order and harmony in the family. Her position was very difficult and required the utomst tact and reserve, but if she behaved with suitable discretion, she could find a place of peace and dignity within the household. The best strategy right now is to be flexible and adaptable. You are not going to receive very much recognition for your efforts, so you should be sensible. If your expectations are too unrealistic, then you will only make yourself unhappy. Don't be angry and resentful. Life is not always fair. Accept the situation for the time being. Stay out of the limelight and don't try to draw attention to yourself. Perform your assigned role without show or ceremony. Instead of bemoaning your fate, consider instead how you can be of service and make a contribution. Relationships with others may be particulary difficult now. You cannot control the current situation. In particular, you cannot force other people to love you, you can only behave with love toward them. That means acting out of mercy and acceptance rather than out of anger and bitterness. Do not try to manipulate others and do not allow others to manipulate you. In the long run, what holds human relationships together are charity, tact, and discretion, not demanding everything that is yours but overlooking the inevitable slights and upsets of daily life. Despite your subordinate position, it is still possible to act with honor and dignity. Hold yourself to the highest standards. Take pride in your work and in your good qualities. Belive in yourself even if others do not currently recognize you. By staying true to your own ideals and not allowing your self-worth to be determined by the oppinion of others, you will gain inner strength and obtain inner freedom.");
        expectedDivination.put("The Image", "Above the lake there is thunder, this is the image of the maiden given in marriage. Thus the superior person understands the imperfect and the transitory in the light of what endures in the end.");
        if(guiMei.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(GuiMei guiMei) {
        String hasTheSameNumber = "Gui mei has the same number and is" + guiMei;
        String doesNotHaveTheSameNumber = "Gui mei does not have the same number";
        int expectedNumber = 54;
        if(guiMei.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
