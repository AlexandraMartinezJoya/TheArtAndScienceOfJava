import IChingClasses.Kun;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.awt.*;
import java.util.HashMap;

public class KunTests extends ConsoleProgram{

    public void run(){
        Kun kun = new Kun();
        GImage thisImage = new GImage("../IChingImages/UpToSixtyFour/2.Kun.jpg");
        GImage kunImage = kun.getIChingImage();
        String isSameImage = isKunImageSameImage(thisImage, kunImage);
        println(isSameImage);
        String isSameImagePath = isKunImageSameImagePath(kun);
        println(isSameImagePath);

        String kunElementName = kun.getElementName();
        String expectedElementName = "Earth";
        String hasSameElement = hasSameElement(kunElementName, expectedElementName);
        println(hasSameElement);

        String kunHasSameQualities = kunHasSameQualities(kun.getElementQualities());
        println(kunHasSameQualities);

        String kunFamilyMember = kun.getFamilyMember();
        String hasSameFamilyMember = hasSameFamilyMember(kunFamilyMember);
        println(hasSameFamilyMember);

        HashMap kunSeasonsAndWeather = kun.getSeasonAndWeather();
        String hasSameSeasons = hasSameSeasonsAndWeather(kunSeasonsAndWeather);
        println(hasSameSeasons);

        HashMap divination = kun.getDivination();
        String hasSameDivination = kunHasSameDivination(divination);
        println(hasSameDivination);

        int expectedNumber = 2;
        String hasSameExpectedNumber = hasSameExpectedNumber(kun.getNumber(), expectedNumber);
        println(hasSameExpectedNumber);
    }

    public String isKunImageSameImage(GImage thisImage, GImage expectedImage) {
        String isKunImageSameImage = "Kun Image is same image";
        String isNotKunImageSameImage = "Kun Image is not same image";
        if (thisImage.equals(expectedImage)) {
            return isKunImageSameImage;
        } else {
            return isNotKunImageSameImage;
        }
    }

    public String isKunImageSameImagePath(Kun kun){
        String expectedImagePath = "../IChingImages/UpToSixtyFour/1.Qian.jpg";
        GImage expectedImage = new GImage(expectedImagePath);
        String isSameImagePath = "Kun image path is same as expected";
        String isNotSameImagePath = "Kun image path is not the same as expected";
        Image kunImagePath = kun.getIChingImage().getImage();
        if(expectedImagePath.equals(isSameImagePath)) {
            return isSameImagePath;
        } else {
            return isNotSameImagePath;
        }
    }

    public String hasSameElement(String kunElementName, String expectedElementName) {
        String isExpectedElementNameTheSame = "Kun element name is same as expected and is" + expectedElementName;
        String isNotExpectedElementName = "Kun element name is not the same as expected";
        if(expectedElementName.equals(kunElementName)) {
            return isExpectedElementNameTheSame;
        } else {
            return isNotExpectedElementName;
        }
    }

    public String  kunHasSameQualities (HashMap hasSameElementQualities) {
        String hasSameQualities = "Kun has the same element qualities";
        String doesNotHaveSameQualities = "Kun does not have same element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1","Receptive");
        expectedElementQualities.put("2","Adaptive");
        expectedElementQualities.put("3","Yielding");

        if(hasSameElementQualities.equals(expectedElementQualities)) {
            return  hasSameQualities;
        } else {
            return doesNotHaveSameQualities;
        }
    }

    public String hasSameFamilyMember(String familyMemeber) {
        String hasSameFamilyMember = "Kun has the same family member";
        String doesNotHaveSameFamilyMember = "Kun does not have the same family member";
        String expectedFamilyMember = "Mother";
        if(familyMemeber.equals(expectedFamilyMember)) {
            return hasSameFamilyMember;
        } else {
            return doesNotHaveSameFamilyMember;
        }
    }

    public String hasSamePartOfBody(HashMap kunPartsOfBody) {
        String hasSamePartOfBody = "Kun has the same body parts";
        String doesNotHasSamePartOfBody = "Kun does not have the same body parts";
        HashMap expectedPartOfBody = new HashMap<String, String>();
        expectedPartOfBody.put("1", "belly");
        expectedPartOfBody.put("2", "womb");
        if(kunPartsOfBody.equals(expectedPartOfBody)){
            return hasSamePartOfBody;
        } else {
            return  doesNotHasSamePartOfBody;
        }
    }

    public String kunHasSameAnimal (String animal) {
        String kunHasSameAnimal = "Kun has same animal";
        String kunDoesNotHaveSameAnimal = "Kun does not have the same animal";
        String expectedAnimal = "Cow";
        if(animal.equals(expectedAnimal)) {
            return kunHasSameAnimal;
        } else {
            return kunDoesNotHaveSameAnimal;
        }
    }

    public String hasSameSeasonsAndWeather(HashMap kunSeasonsAndWeather) {
        String kunHasSameSeasonsAndWeather = "Kun has the same seasons and weather";
        String kunDoesNotHaveTheSameSeasonsAndWeather = "Kun does not have the same seasons and weather";
        HashMap expectedSeasonsAndWeather = new HashMap<String, String>();
        expectedSeasonsAndWeather.put("1", "Early Autumn");
        expectedSeasonsAndWeather.put("2", "Warm");
        if (kunSeasonsAndWeather.equals(expectedSeasonsAndWeather)) {
            return kunHasSameSeasonsAndWeather;
        } else {
            return  kunDoesNotHaveTheSameSeasonsAndWeather;
        }
    }

    public String kunHasSameDivination(HashMap kunDivination) {
        String kunHasTheSameDivination = "Kun has the same divination";
        String kunDoesNotHaveTheSameDivination = "Kun does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        String judgementDescription = "The four fundamental attributes yuan heng li zhen (fundamental, successful, beneficial, and persevering) describe Kun as they do Qian. However the 'perseverance of a mare' in Kun contrasts with Quian injunction of steadfast endurance. Whereas Quian advises us to pursue our ends constantly, doggedly, and incessantly like the ceaseless movement of the heavens, Kun advises us to accept and endure change, adjusting to and even welcoming what occurs. In place of untiring striving we should adopt the gentle and devoted perseverance of the mare. The mare follows the lead of the others and is by nature accommodating and accepting  - qualities which are appropriate to the situation. The mare also contrasts with the dragon featured in the line statements of Qian. The dragon flies in the heavens and so symbolises heaven; the mare roams freely throughout the full extent of the earth and hence symbolises earth. The southwest means to seek assistance from other employing the virtues associated with earth, humility, devotion, cooperation, and responsiveness. In this context the northeast represents the opposite qualities. Therefore, in seeking friends one should avoid arrogance, lack of commitment, selfishness, and indifference. Serene perseverance brings good fortune because we adapt ourselves to the situation and accept it for what it is. Hence we are able to do what the situation demands of us naturally and are able to make progress in exactly the right way. The situation you face requires responsiveness to circumstances and devotion to doing the right thing given the specific context in which you find yourself. Responsiveness does not mean lassitude or passivity - it means action that is in accord with the demands of the situation , action that flows naturally with events rather than trying to resist or confront them directly.This is not the time to try to seize control of things or take the initiative. nor should you move ahead without consulting other people. If you do so, you will only create chaos and confusion. Rather, you should do your best to understand what circumstances require and how can you best adapt to respond to them. To do this, you must put asides your preconceptions and your ego. Keep an open mind. Listen to other people and try and learn from them. Act with generosity and kindness. Put your talents and abilities in the service of others. Seek out friends and helpers to work with. Through devotion, adaptability and careful attention to detail, you can achieve great things. For the text tells us that the receptive, like the dynamic, offers the possibility of supreme success. Receptivity to circumstances is not inertia. It is not the opposite of dynamic action but rather its natural complement. Receptive people follow and adjust to the course of events in the world. They do not try to mold the world to their will or pretend that matters are what they are not. They accept the world as it is and respond to it naturally. They follow the lead of others and consider how to best make a contribution. They assist those who need assistance, they are generous where generosity is required. They put themselves at the disposal of the situation so that they can improve it. Although receptive\n" +
                "people do not try to lead or enforce their will, through their resilience and dedication they nevertheless succeed in having the most powerful influence on events. Implicit in receptiveness is realism - adapting to things as they are rather than the way we would like them to be. English has a similar metaphor that identifies earth with realism. We say that a realistic person does not have his head in the clouds but is down to earth. This realism is the very opposite of surrender or capitulation. Indeed, it is the necessary prerequisite to effective action, and to doing what they situation truly demands. As the text says, if we set forth blindly, we will soon go astray, but if we follow, we will find guidance from the situation itself. In this way, the situation begins to adapt itself to us even as we adapt ourselves to it. If we do not try to impose willful preconceptions on the world, it will perpetually surprise us with all manner of possibilities. An attitude of receptivity thus produces a fertility of imagination, which is able to behold a similar fertility in the world itself. Finally, receptiveness does not mean conforming to the world resignedly. It means that one acts so as to nourish it. IChingClasses.Kun teaches that through acceptance and adaptability we can redeem what is base and ignoble and make what is good in the world even better. In this way we can bring something to the situation, and add peace and prosperity to the world. Instead of trying to dominate or impose our will on those around us, we act as a midwife or assistant, helping others achieve their ends and in this way exerting our influence indirectly, gently, and persistently. Kun teaches us that one does not have to take the lead in order to have influence, one does not have to be dynamic in order to exercise power, one does not have to be arrogant in order to impress others, and one does not have to be first in everything in order to prevail at the end.";
        expectedDivination.put("Title", "Kun");
        expectedDivination.put("Keywords", "Receptivity, Docility, Acquiescence , Acceptance, Adjustment, Nurturing");
        expectedDivination.put("The Judgement", "The Receptive, Supreme Success, It is Beneficial to be constant like a mare. If the superior person sets out to do something, he will go astray, but if he follows, he will find guidance. It is beneficial to find friends in the southwest and forego friends in the northeast. Serene perseverance brings good fortune.");
        expectedDivination.put("Judgement Description", judgementDescription);
        expectedDivination.put("The Image", "The basic disposition of Earth is Receptive. Thus the superior person supports all things with his generous virtue.");
        if(kunDivination.equals(expectedDivination)){
            return kunHasTheSameDivination;
        } else {
            return kunDoesNotHaveTheSameDivination;
        }
    }

    public String hasSameExpectedNumber(int kunNumber, int expectedKunNumber){
        String isTheSameExpectedNumber = "Kun has the same expected number";
        String isNotTheExpectedNumber  = "Kun does not have the same expected number";
        if( kunNumber == expectedKunNumber) {
            return isTheSameExpectedNumber;
        } else {
            return isNotTheExpectedNumber;
        }
    }

}
