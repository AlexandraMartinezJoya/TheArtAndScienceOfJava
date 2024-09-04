package IChingTests;

import IChingClasses.Kan;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class KanTests extends ConsoleProgram {

    public void run(){
        Kan kan = new Kan();
        GImage thisImage = new GImage("../IChingImages/UpToSixtyFour/29.Kan.jpg");
        GImage kanImage = kan.getIChingImage();
        String isSameImage = isKanImageSameImage(thisImage, kanImage);
        println(isSameImage);
        String isSameImageClassPath = isKanImageSameImageClassPath(kan);
        println(isSameImageClassPath);

        String isKanElementTheSame = isKanElementTheSame(kan);
        println(isKanElementTheSame);

        String kanHasSameElementQualities = kanHasSameElementQualities(kan);
        println(kanHasSameElementQualities);

        String kanHasTheSameFamilyMember = kanHasTheSameFamilyMember(kan);
        println(kanHasTheSameFamilyMember);

        String kanHasTheSameBodyPart = kanHasSamePartOfBody(kan);
        println(kanHasTheSameBodyPart);

        String kanHasTheSameSeasonsAndWeather = kanHasTheSameSeasonsAndWeather(kan);
        println(kanHasTheSameSeasonsAndWeather);

        String hasTheSameDivination = kanHasTheSameDivination(kan);
        println(hasTheSameDivination);

        String hasSameNumber = kanHasTheSameNumber(kan);
        println(hasSameNumber);
    }

    public String isKanImageSameImage(GImage kanImage, GImage expectedKanImage){
        String isTheSameKanImage = "Kan image is the same";
        String isNotTheSameKanImage = "It is not the same kan image";
        if(kanImage.equals(expectedKanImage)){
            return isTheSameKanImage;
        } else {
            return isNotTheSameKanImage;
        }
    }

    public String isKanImageSameImageClassPath(Kan kan) {
        String isTheSameImagePath = "Kan has the same image path and is : " + kan.getImagePath();
        String isNotTheSameImagePath = "Kan does not have the same image path";
        String expectedKanPath = "../IChingImages/UpToSixtyFour/29.Kan.jpg";
        if(kan.getImagePath().equals(expectedKanPath)){
            return isTheSameImagePath;
        } else {
            return isNotTheSameImagePath;
        }
    }

    public String isKanElementTheSame(Kan kan){
        String kanElementIsSameAsExpected = "Kan element is the same as expected ";
        String kanElementIsNotTheSameAsExpected = "Kan element is not the same as expected";
        String expectedKanElement =  "Water, Water";
        String kanElement = kan.getElementName();
        if(kanElement.equals(expectedKanElement)){
            return kanElementIsSameAsExpected;
        } else {
            return kanElementIsNotTheSameAsExpected;
        }
    }

    public String kanHasSameElementQualities(Kan kan) {
        String kanHasTheSameElementQualities = "Kan has the same element qualities";
        String kanDoesNotHaveTheSameElementQualities = "Kan does not have the same element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1","Danger");
        expectedElementQualities.put("2","Melancholy");
        expectedElementQualities.put("3","Passion");
        if(expectedElementQualities.equals(kan.getElementQualities())) {
            return kanHasTheSameElementQualities +  ":  "+ expectedElementQualities;
        } else {
            return kanDoesNotHaveTheSameElementQualities;
        }
    }

    public String kanHasTheSameFamilyMember(Kan kan) {
        String kanHasTheSameFamilyMember = "Kan has the same family member";
        String kanDoesNotHaveTheSameFamilyMember = "Kan does not have the same family member";
        String expectedFamilyMember = "Middle Son";
        if(kan.getFamilyMember().equals(expectedFamilyMember)){
            return kanHasTheSameFamilyMember + " and it is : " + expectedFamilyMember;
        } else {
            return kanDoesNotHaveTheSameFamilyMember;
        }
    }

    public String kanHasSamePartOfBody(Kan kan) {
        String kanHasTheSameBodyPart = "Kan has the same body part";
        String kanDoesNotHaveTheSameBodyPart = "Kan does not have the same body part";
        HashMap expectedBodyPart = new HashMap<String, String>();
        expectedBodyPart.put("1", "Ear");
        if(kan.getBodyPart().equals(expectedBodyPart)) {
            return kanHasTheSameBodyPart +" and it is: " + expectedBodyPart;
        } else {
            return kanDoesNotHaveTheSameBodyPart;
        }
    }

    public String hasTheSameRelatedAnimal(Kan kan) {
        String hasTheSameRelatedAnimal = "Kan has the same related animal";
        String kanDoesNotHaveTheSameRelatedAnimal = "Kan does not have the same related animal";
        String expectedRelatedAnimal = "";
        if(kan.getRelatedAnimal().equals(expectedRelatedAnimal)) {
            return hasTheSameRelatedAnimal;
        } else {
            return kanDoesNotHaveTheSameRelatedAnimal;
        }
    }

    public String kanHasTheSameSeasonsAndWeather(Kan kan) {
        String hasTheSameSeasonsAndWeather = "Kan has the same seasons and weather";
        String kanDoesNotHaveTheSameSeasonsAndWeather = "Kan does not have the same seasons and weather";
        HashMap expectedSeasonsAndWeather = new HashMap<String, String>();
        expectedSeasonsAndWeather.put("1", "Middle winter");
        expectedSeasonsAndWeather.put("2", "Cloudy");
        if(kan.getSeasonAndWeather().equals(expectedSeasonsAndWeather)) {
            return hasTheSameSeasonsAndWeather + " and they are " + expectedSeasonsAndWeather;
        } else {
            return kanDoesNotHaveTheSameSeasonsAndWeather;
        }
    }

    public String kanHasTheSameDivination(Kan kan){
        String kanHasTheSameDivination = "Kan has the same divination and the divination keywords are: " + kan.getDivination().get("Keywords") ;
        String kanDoesNotHaveTheSameDivination = "Kan does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Kan");
        expectedDivination.put("Keywords","Darkness, danger, despair, the abysmal, courage and devotion, maintaining faith, pushing through the rapids, getting through the other side");
        expectedDivination.put("The Judgement","Repeated Abyss. If you are truthful and sincere, and follow your heart, then you will have success, and your actions will bring esteem");
        expectedDivination.put("Judgement Description","You face a difficult and dangerous situation. You cannot wish it away. You must rise to the challenge and handle the dangers in front of you. Water symbolizes danger, and water also symbolizes the proper way to behave during times of danger. Water is a part of nature and behaves naturally. No matter what happens, it is true to itself. It flows forward without pause. It fills up every place it travels, no matter how lowly. It does not hesitate to move downward in order to move forward. It does not refuse to travel through dangerous places or to take a plunge. It follows its own course, pressing even onward through rocks and ravines until it reaches the calmness of the ocean. In like fashion, when confronted with difficulties, you must be like water: true to yourself, moving forward without hesitation, and not disdaining to do whatever is necessary to push through the dangerous conditions into safety. The text emphasizes truth and sincerity. It says that you can proceed through danger successfully if you are sincere. To be sincere means first that you are not lying to yourself or deluding yourself. Do not engage in wishful thinking. Accept matters as they are and not as you would like them to be. Equally important, be true to yourself. Understand who you are, what you believe, and what you stand for. Sincerity also means that you are connected to and making use of all your emotional resources. You must summon up all your courage. If you can master yourself, you are in the best possible position to master the situation. And once you have gotten in touch with your heart, you will instinctively know what you have to do to survive. Being honest does not mean pessimism or despair. Quite the contrary: the lessons of the Book of Changes is that true courage comes from confronting yourself as you are, making use of what you have inside you and not running away from your nature. People who engage in pessimism and self abuse may be as out of touch with reality and with themselves as people who display an excess of pride. If you are sincere, and willing to accept yourself, you will discover that there is much more to you than you imagined. Sincerity means, finally, that you must believe in yourself. Do not lose heart. Stand up for your beliefs and maintain your integrity. When chips are down, it is less important what other people think than what you believe. Remain true to your deepest values. To face danger and to face the disapproval and misunderstanding of others takes courage. But if you are not true to yourself in time of danger, you will lose yourself in time of danger. To succeed in a dangerous situation, you must be thorough and persistent, proceeding without hesitation, like water flowing through a deep ravine. You must do whatever it takes to move past your difficulties. To vacillate when there is work to be done will only increase the perils you face. Like a person traveling through rapids, you must propel yourself forward through the situation in order to reach safety. You must push through, no matter how bad it may seem, for safety lies not where you are but on the other side. Danger is a part of life. It cannot be avoided. Like the rapids, we must move through it in order to get to safety. That is why courage is one of the most important values in life. To risk danger may sometimes require physical courage. But the most important asset you can have is emotional courage, the ability to face up to your situation and to who you really are. Emotional courage is a form of self- knowledge. That is why the book of changes emphasizes truth and sincerity in times of danger, for one succeeds in facing danger through self-knowledge. Danger can clarify your thinking. It can help you understand yourself, what you truly care about, and what you must do. Thus, paradoxically, danger protects as well as threatens: Facing danger makes you stronger if you do not allow yourself to be overwhelmed by it.");
        expectedDivination.put("The Image","Water flows incessantly toward its goal: this is the image of the abyss repeated. thus the superior person walks in lasting virtue and carries the work of edification.");
        if(kan.getDivination().equals(expectedDivination)) {
            return kanHasTheSameDivination;
        } else {
            return kanDoesNotHaveTheSameDivination;
        }
    }

    public String kanHasTheSameNumber(Kan kan){
        String kanHasTheSameNumber = "Kan has the same number and it is " + kan.getNumber();
        String kanDoesNotHaveTheSameNumber = "Kan does not have the same number";
        int expectedNumber = 29;
        if(kan.getNumber() == expectedNumber) {
            return kanHasTheSameNumber;
        } else {
            return kanDoesNotHaveTheSameNumber;
        }
    }

}
