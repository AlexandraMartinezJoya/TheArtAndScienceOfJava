import IChingClasses.Zhen;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class ZhenTests extends ConsoleProgram {

    public void run(){
        Zhen zhen = new Zhen();
        String isZhenImageTheSame = isZhenImageTheSame(zhen);
        println(isZhenImageTheSame);

    }

    public String isZhenImageTheSame(Zhen zhen){
        String isZhenImageTheSame = "Zhen image is the same as expected";
        String zhenImageIsNotTheSame = "Zhen image is not the same as expected";
        GImage expectedZhenImage = new GImage("../IChingImages/UpToSixtyFour/51.Zhen.jpg");
        if(zhen.getIChingImage().equals(expectedZhenImage)) {
            return isZhenImageTheSame;
        } else {
            return zhenImageIsNotTheSame;
        }
    }

    public String isZhenImagePathTheSame(Zhen zhen){
        String isZhenImageTheSame = "The image path of Zhen is the same as expected";
        String zhenImageIsNotTheSame = "The image path of Zhen is not the same as expected";
        String expectedZhenPath = "../IChingImages/UpToSixtyFour/51.Zhen.jpg";
        if(zhen.getImagePath().equals(expectedZhenPath)){
            return isZhenImageTheSame;
        } else {
            return zhenImageIsNotTheSame;
        }
    }

    public String isTheSameZhenElement(Zhen zhen) {
        String isSameZhenElement = "The element of Zhen is the same as expected and is : " + zhen.getElementName() ;
        String zhenElementIsNotTheSameAsExpected = "The element of zhen is not what expected";
        String expectedElement =  "Thunder, Thunder";
        if(zhen.getElementName().equals(expectedElement)){
            return isSameZhenElement;
        } else {
            return zhenElementIsNotTheSameAsExpected;
        }
    }

    public String hasSameElementQualities(Zhen zhen) {
        String zhenHasTheSameElementQualities = "Zhen has the expected qualities: " + zhen.getElementQualities();
        String zhenDoesNotHaveTheSameElementQualities = "Zhen does not have the expected element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1", "Energetic" );
        expectedElementQualities.put("2", "Arousing");
        expectedElementQualities.put("3", "Moving");
        if(zhen.getElementQualities().equals(expectedElementQualities)) {
            return zhenHasTheSameElementQualities;
        } else {
            return zhenDoesNotHaveTheSameElementQualities;
        }
    }

    public String hasSameFamilyMember(Zhen zhen) {
        String hasTheSameFamilyMember = "Zhen has the same family member and it is: "+ zhen.getFamilyMember();
        String doesNotHaveTheSameFamilyMember = "Zhen does not have the same family member";
        String expectedFamilyMember = "Eldest Son";
        if(zhen.getFamilyMember().equals(expectedFamilyMember)) {
            return hasTheSameFamilyMember;
        } else {
            return doesNotHaveTheSameFamilyMember;
        }
    }

    public String hasSamePartOfBody(Zhen zhen){
        String hasTheSamePartOfBody = "Zhen has the same part of body and it is: " + zhen.getBodyPart();
        String doesNotHaveTheSamePartOfBody = "Zhen does not have the same part of body";
        HashMap expectedPartOfBody = new HashMap<String, String>();
        expectedPartOfBody.put("1", "foot");
         if(zhen.getBodyPart().equals(expectedPartOfBody)){
             return hasTheSamePartOfBody;
         } else {
             return doesNotHaveTheSamePartOfBody;
         }
    }

    public String hasSameRelatedAnimals(Zhen zhen) {
        String hasTheSameRelatedAnimals = "Zhen has the same related animals and it is:" + zhen.getRelatedAnimal();
        String doesNotHaveTheSameRelatedAnimals = "Zhen does not have the same related animals";
        String expectedRelatedAnimals = "Dragon";
        if(zhen.getRelatedAnimal().equals(expectedRelatedAnimals)){
            return hasTheSameRelatedAnimals;
        } else {
            return doesNotHaveTheSameRelatedAnimals;
        }
    }

    public String hasTheSameSeasonsAndWeather(Zhen zhen){
        String hasTheSameSeasonsAndWeather = "Zhen has the same seasons and weather and are: "+ zhen.getSeasonAndWeather();
        String doesNotHaveTheSameSeasonsAndWeather = "Zhen does not have the same related seasons and weather";
        HashMap expectedSeasonsAndWeather = new HashMap<String, String>();
        expectedSeasonsAndWeather.put("1", "Springtime");
        expectedSeasonsAndWeather.put("2", "Earthquake");
        if(zhen.getSeasonAndWeather().equals(expectedSeasonsAndWeather)){
            return hasTheSameSeasonsAndWeather;
        } else {
            return doesNotHaveTheSameSeasonsAndWeather;
        }
    }

    public String hasSameDivination(Zhen zhen){
        String hasTheSameDivination = "Zhen has the same divination and the keywords are : " + zhen.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Zhen does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Zhen");
        expectedDivination.put("Keywords","Thunder, Shake, Quake, Upheaval,The arousing, Reassess your life, Shocking you out of your lethargy, Hidden potential in sudden change,Blessing in disguise, Taking action");
        expectedDivination.put("The Judgement","Shock. Success,Thunder comes - crack, crack! Afterward there is laughter and talk - ha, ha! The shock terrifies for a hundred miles, but he does not let the sacrificial spoon and chalice fail.");
        expectedDivination.put("Judgement Description","Something unexpected has shaken you. You had not prepared for it. Suddenly, your life seems in upheaval. You experience fear and panic. But once your initial reaction subside, you will recognize that the sudden turn of events is for the best. You have been caught by surprise, but if you hold yourself properly, something positive can and will emerge from the shake-up. The important thing is to stay calm and keep your wits about you. Take a closer look at the situation. It is possible that you simply taken on to much. The shocking event may be a blessing in disguise, it gives you an opportunity to reassess your priorities and lessen some of your burdens. Perhaps you have drifted into an unsatisfying and unrewarding routine. The shocking event can awaken you from your lethargy and force you to change your plans. The disruption of your everyday life can invigorate you and give you a fresh outlook on life. It is like the being splashed with cold water. It is unpleasant at first, but it simulates your senses. After the shake-up, you suddenly see new possibilities. Although the change may be disturbing in the beginning, maintain your poise and approach the new situation with an open mind. You will come out of this series of events stronger, better, and happier. The book of changes compares the situation you now face to thunder pealing while a person is performing a sacred ritual. The shock comes just as the person is ladling out of the sacramental wine. But he is so imbued with seriousness and a sense of purpose that he does not spill a drop. In the same way, you should consider the change as a test of character. If you can maintain equanimity and composure in the face of outside upheaval, you are secure against whatever life can throw against you and you will always be able to spot the new potential in changed conditions. That is because the shock not only shakes you up, it also shakes up the world outside you. New possibilities are created out of the shards of the old. This is a key idea in the book of changes: change- even sudden and startling change, is not only a hazard but an opportunity. People who let shocking events dictate their inner life will be disabled and moored in confusion. They are like people who are struck by lightning. But people who maintain balance in their inner life are quickly to restore balance in their relations with the outside world. They can rise to the challenge and improve their lives in the process.");
        expectedDivination.put("The Image","Repeated thunder, This is the image of the Shock, in fear and trembling , the superior person examines himself.");
        if(zhen.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber (Zhen zhen) {
        String hasTheSameNumber = "Zhen has the expected number of " + zhen.getNumber();
        String doesNotHaveTheSameNumber = "Zhen does not have the same number";
        int expectedNumber = 51;
        if(zhen.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
