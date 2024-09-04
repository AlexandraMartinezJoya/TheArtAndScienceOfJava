package IChingTests;

import IChingClasses.Li;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class LiTests extends ConsoleProgram {

    public void run() {
        Li li = new Li();
        String isTheSameLiImage = isTheSameLiImage(li);
        println(isTheSameLiImage);
        String imageHasTheSameClassPath = imageHasTheSameClassPath(li);
        println(imageHasTheSameClassPath);
        println("--------------------------");
    }

    public String isTheSameLiImage(Li li){
        String isTheSameLiImage = "Li image is the same";
        String isNotTheSameLiImage = "Li image is not the same";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/30.Li.jpg");
        if(li.getIChingImage().equals(expectedImage)) {
            return isTheSameLiImage;
        } else {
            return isNotTheSameLiImage;
        }
    }

    public String imageHasTheSameClassPath(Li li) {
        String imageHasTheSameClassPath = "Li image does not have the same class path";
        String imageDoesNotHaveTheSameClassPath = "Li image does not have the same class path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/30.Li.jpg";
        if(li.getImagePath().equals(expectedClassPath)) {
            return imageHasTheSameClassPath;
        } else {
            return imageDoesNotHaveTheSameClassPath;
        }
    }

    public String liHasTheSameElementName(Li li) {
        String liHasTheSameElementName = "Li has the same element name and is: " + li.getElementName();
        String liDoesNotHaveTheSameElementName = "Li does not have the expected element name";
        String expectedElementName = "Fire, Fire";
        if(li.getElementName().equals(expectedElementName)) {
            return liHasTheSameElementName;
        } else {
            return liDoesNotHaveTheSameElementName;
        }
    }

    public String liHasTheSameQualities(Li li) {
        String liHasTheSameQualities = "Li has the same qualities and they are : " + li.getElementQualities();
        String liDoesNotHaveTheSameQualities = "Li does not have the same qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1","Fire");
        expectedElementQualities.put("2","Brilliance");
        expectedElementQualities.put("3","Clarity");
        expectedElementQualities.put("4","Shedding light on things");
        expectedElementQualities.put("5","Enlightenment");
        if(li.getElementQualities().equals(expectedElementQualities)) {
            return liHasTheSameQualities;
        } else {
            return liDoesNotHaveTheSameQualities;
        }
    }

    public String liHasTheSameFamilyMember(Li li) {
        String liHasTheSameFamilyMember = "Li has the same family member and it is: " + li.getFamilyMember();
        String liDoesNotHaveTheSameFamilyMember = "Li does not have the same family member";
        String expectedFamilyMember = "Middle Daughter";
        if(li.getFamilyMember().equals(expectedFamilyMember)) {
            return liHasTheSameFamilyMember;
        } else {
            return liDoesNotHaveTheSameFamilyMember;
        }
    }

    public String liHasTheSameBodyPart(Li li) {
        String liHasTheSameBodyPart = "Li has the same body part and it is: " + li.getBodyPart();
        String liDoesNotHaveTheSameBodyPart = "Li does not have the same body part";
        HashMap expectedBodyPart = new HashMap<String, String>();
        expectedBodyPart.put("1", "Eye");
        if(li.getBodyPart().equals(expectedBodyPart)) {
            return liHasTheSameBodyPart;
        } else {
            return liDoesNotHaveTheSameBodyPart;
        }
    }

    public String liHasTheSameAnimals(Li li) {
        String liHasTheSameAnimalsAsExpected = "Li has the same animals as expected";
        String liDoesNotHaveTheSameAnimalsAsExpected = "Li does not have the same animals as expected";
        String expectedAnimals = "";
        if(li.getRelatedAnimal().equals(expectedAnimals)) {
            return liHasTheSameAnimalsAsExpected;
        } else {
            return liDoesNotHaveTheSameAnimalsAsExpected;
        }
    }

    public String liHasSameSeasonsAndWeather(Li li){
        String liHasTheSameSeasonsAndWeather = "Li has the same seasons and weather and they are: " + li.getSeasonAndWeather();
        String liDoesNotHaveTheSameSeasonsAndWeather = "Li does not have the same seasons and weather";
        HashMap expectedSeasonsAndWeather = new HashMap<String, String>() ;
        expectedSeasonsAndWeather.put("1", "Middle Summer");
        if(li.getSeasonAndWeather().equals(expectedSeasonsAndWeather)) {
            return liHasTheSameSeasonsAndWeather;
        } else {
            return liDoesNotHaveTheSameSeasonsAndWeather;
        }
    }

    public String liHasTheSameDivination(Li li) {
        String liHasTheSameDivination = "Li has the same divination and the divination keywords are: " + li.getDivination().get("Keywords");
        String liDoesNotHaveTheSameDivination = "Li does not have the same divination as expected";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Li");
        expectedDivination.put("Keywords", "Fire, Brilliance, Clarity, Shedding light on things, Enlightenment");
        expectedDivination.put("The Judgement", "Radiance, It is beneficial to persevere, success, raising a cow brings good fortune");
        expectedDivination.put("Judgement Description", "The Book of Changes teaches that you must both your activity and your rest in harmony with the needs of the situation and the demands of the time. Success comes not only from moving forward at the right time but also from remaining still when it is appropriate to do so. The theme of Gen is recognizing that the time has come to be still so that you can regain your balance and find peace. The text offers the metaphor of keeping the back still. The back represents the center of your body. Where the back goes the body goes , so if the back remains still, the body will be still. The back is also the location of the spine, hence to make one's back still means to calm the nerves and thus one's mind. When your mind is calm and your thoughts are orderly, it is as if you no longer feel your body - that is, you no longer feel the pain of demands pressing on you from the outside and the urgency of desires pressing on you from the inside. When you are angry and distressed, the world looks disordered and confused. But when you are perfectly calm, you see the world with greater clarity. Being still allows you to see beyond the surface turbulence of life and the petty struggles of the day and look more deeply into the nature of things. Beyond the chaos and commotion lie deeper truths. You recently entered a difficult and trying period. The world seems disordered and confused. In part, that is because you have disorder and confusion within you. The most important thing for you to do right now is to restore your inner balance and find peace of mind. Do not let the chaos and the striving of the outside world distract you or upset you. There is nothing more that you can do in the present situation. You have done all you can, any further exertions would only be counterproductive. Because struggling outwardly will do you no good, you should stop struggling inward as well. Take a deep breath, collect your thoughts, and reflect. You will get nowhere if you obsess about your problems. That will only cause your anxiety to build and build until you feel that you absolutely must do something, and then you are likely to do precisely the wrong thing. If you make your decisions based on worry and apprehension, you are likely to misjudge and exaggerate things. But when your mind is still and your emotions are centered, you will make no mistakes. Calm yourself and you will be able to see more deeply into the situation. Then everything will appear in its proper perspective. Being still does not mean abandoning your feelings. Quite the contrary, you will find that you will have a greater intuitive understanding of what is going on. The point is that you can best get in touch with those intuitions through stillness rather than through being in an emotional upheaval. And when you connect with those deeper parts of yourself, you will naturally select the right strategies and make the proper choices. You will instinctively know the right thing to do. In this way stillness becomes the necessary predicate for right action in the future.");
        expectedDivination.put("The Image", "Brightness doubled generates radiance that spreads in all directions. This is the image of Fire. In the same way great people perpetuate their brilliance, to illuminate the four corners of the world");
        if(li.getDivination().equals(expectedDivination)) {
            return liHasTheSameDivination;
        } else {
            return liDoesNotHaveTheSameDivination;
        }
    }

    public String liHasTheSameNumber(Li li){
        String  liHasTheSameNumberAsExpected= "Li has the same number and it is: " + li.getNumber();
        String liDoesNotHaveTheSameNumber = "Li does not have the same number";
        int expectedNumber = 30;
        if(li.getNumber() == expectedNumber) {
            return liHasTheSameNumberAsExpected;
        } else {
            return liDoesNotHaveTheSameNumber;
        }
    }
}
