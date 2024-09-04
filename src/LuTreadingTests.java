import IChingClasses.LuTreading;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class LuTreadingTests extends ConsoleProgram {

    public void run() {
        LuTreading luTreading = new LuTreading();

        String luTreadingHasSameImage = luTreadingHasSameImage(luTreading);
        println(luTreadingHasSameImage);

    }

    public String luTreadingHasSameImage(LuTreading luTreading){
        String luTreadingHasTheSameImage = "Lu Treading has the same image";
        String luTreadingDoesNotHaveTheSameImage = "Lu treading does not have the same image";
        GImage expectedLuTreadingImage = new GImage("../IChingImages/UpToSixtyFour/10.LuTreading.jpg");
        if(luTreading.equals(expectedLuTreadingImage)) {
            return luTreadingHasTheSameImage;
        } else {
            return luTreadingDoesNotHaveTheSameImage;
        }
    }

    public String luTreadingHasSameImageClassPath(LuTreading luTreading) {
        String luTreadingHasSameImagePath = "Lu treading has the same image class path";
        String luTreadingDoesNotHaveSameImagePath = "Lu treading does not have the same image path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/10.LuTreading.jpg";
        if(luTreading.getImagePath().equals(expectedClassPath)) {
            return luTreadingHasSameImagePath;
        } else {
            return luTreadingDoesNotHaveSameImagePath;
        }
    }

    public String luTreadingHasSameElementName(LuTreading luTreading) {
        String luTreadingHasSameElementName = "Lu treading has the same element name" + luTreading.getElementName();
        String luTreadingDoesNotHaveSameElementName = "Lu treading does not have the same element name";
        String expectedElementName = "Heaven, Lake";
        if(luTreading.getElementName().equals(expectedElementName)) {
            return luTreadingHasSameElementName;
        } else {
            return luTreadingDoesNotHaveSameElementName;
        }
    }

    public String luTreadingHasSameQualities(LuTreading luTreading) {
        String luTreadingHasSameQualities = "Lu Treading has the same elemnt qualities;" + luTreading.getElementQualities();
        String luTreadingDoesNotHaveSameQualities = "Lu treading does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", " Treading" );
        expectedQualities.put("2", "Conduct");
        expectedQualities.put("3", "Circumspection");
        expectedQualities.put("4", "Daring");
        expectedQualities.put("5", "Treading carefully");
        expectedQualities.put("6", "Stepping on the tiger's tail");
        if(luTreading.getElementQualities().equals(expectedQualities)) {
            return luTreadingHasSameQualities;
        } else {
            return luTreadingDoesNotHaveSameQualities;
        }
    }

    public String luTreadingHasTheSameDivination(LuTreading luTreading) {
        String luTreadingHasSameDivination = "Lu Treading has the same divination and they keywords are: " + luTreading.getDivination().get("Keywords");
        String luTreadingDoesNotHaveTheSameDivination = "Lu treading does not have the expected divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Lu-Treading");
        expectedDivination.put("Keywords", "Conduct, Circumspection, Daring, Treading carefully, Stepping on the tiger's tail");
        expectedDivination.put("The Judgement", "Treading on the tail of the tiger. It does not bite. Success");
        expectedDivination.put("Judgement Description", "The theme of Lu is the need for care and circumspection, in conduct and social interaction. You find yourself in a difficult situation. It is like treading on the tail of a tiger. If you make a wrong move, you may bring strong forces down upon you. Therefore it is important to behave with the utmost delicacy and decorum. Plan your moves in advance. Think carefully what you want to do before you act. Move toward your goal steadily and avoid rash behavior. This is not the time to engage in reckless adventures or radical approaches. Stick to traditional, tested and proven methods. In personal relations, be pleasant and tactful, particularly to difficult people who might have reason to harm you. Don't allow their inability and bad temper to throw you or cause you respond sarcastically or in anger. maintain your poise and composure. Even though your position is perilous, you can still make progress if you behave with the utmost tact and consideration during this difficult time. Don't forget your sense of humor and manners. They will help you avoid potential problems and smooth over misunderstandings. Above all, do not lose your cool. Doing the right thing now requires that you keep your wits about you. Imagine yourself walking along a balance beam. If you keep your balance emotionally as well as physically and move forward with grace and dexterity, you will get to the other side unharmed.");
        expectedDivination.put("The Image", "Heaven above, the lake below, this is the image of treading, thus the superior person distinguishes between the high and the low, improving the hearts and minds of ordinary people");
        if(luTreading.getDivination().equals(expectedDivination)) {
            return luTreadingHasSameDivination;
        } else {
            return luTreadingDoesNotHaveTheSameDivination;
        }
    }

    public String luTreadingHasSameNumber(LuTreading luTreading) {
        String luTreadingHasSameNumber = "Lu treading has the same number and it is " + luTreading.getNumber();
        String luTreadingDoesNotHaveTheSameNumber = "Lu treading does not have the same number";
        int expecedNumber = 10;
        if(luTreading.getNumber() == expecedNumber) {
            return luTreadingHasSameNumber;
        } else {
            return luTreadingDoesNotHaveTheSameNumber;
        }
    }


}
