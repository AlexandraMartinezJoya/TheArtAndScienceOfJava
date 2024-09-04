package IChingTests;

import IChingClasses.Gen;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.awt.*;
import java.util.HashMap;

public class GenTests  extends ConsoleProgram {

    public String isTheSameGenImage(GImage image, GImage kunImage) {
        String isTheSameGenImage = "Image of Gen is the same";
        String isNotTheSameGenImage = "Image of Gen is not the same";
        if(image.equals(kunImage)) {
            return isTheSameGenImage;
        } else {
            return isNotTheSameGenImage;
        }
    }


    public String genHasSameImagePath(Gen gen) {
        String expectedImagePath = "../IChingImages/UpToSixtyFour/1.Qian.jpg";
        GImage expectedImage = new GImage(expectedImagePath);
        String isSameImagePath = "Gen image path is same as expected";
        String isNotSameImagePath = "Gen image path is not the same as expected";
        Image kunImagePath = gen.getIChingImage().getImage();
        if(expectedImagePath.equals(isSameImagePath)) {
            return isSameImagePath;
        } else {
            return isNotSameImagePath;
        }
    }

    public String hasSameClassImagePath(Gen gen) {
        String hasTheSameClassImagePath = "Gen has the same image path and it is: "+ gen.getImagePath();
        String doesNotHaveTheSameClassImagePath = "Gen does not have the same image path";
        String expectedImagePath =  "../IChingImages/UpToSixtyFour/52.Gen.jpg";
        if(gen.getImagePath().equals(expectedImagePath)){
            return hasTheSameClassImagePath;
        } else {
            return doesNotHaveTheSameClassImagePath;
        }
    }

    public String isTheSameGenElement(String genElement){
        String isTheSameGenElement = "Gen element name is the same and it is: "+ genElement;
        String isNotTheSameGenElementName = "Gen element name is not the same";
        String expectedElementName = "Mountain";
        if(genElement.equals(expectedElementName)){
            return isTheSameGenElement;
        } else {
            return isNotTheSameGenElementName;
        }
    }

    public String areTheSameQualities(HashMap genElementQualities) {
        String areTheSameQualities ="Gen element has the same qualities and they are:  " + genElementQualities;
        String areNotTheSameQualities = "Gen element does not have the same element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1", "Stillness" );
        expectedElementQualities.put("2", "Tranquility");
        expectedElementQualities.put("3", "Stability");
        if(genElementQualities.equals(expectedElementQualities)) {
            return areTheSameQualities;
        } else {
            return areNotTheSameQualities;
        }
    }

    public String isTheSameGenFamilyMember(String genFamilyMember) {
        String isTheSameFamilyMember = "Gen element has the same family member and it is " + genFamilyMember;
        String isNotTheSameFamilyMember = "Gen element does not have the same family member";
        String expectedFamillyMember = "Youngest Son";
        if(genFamilyMember.equals(expectedFamillyMember)){
            return isTheSameFamilyMember;
        } else {
            return isNotTheSameFamilyMember;
        }
    }

    public String isTheSameBodyPart(HashMap bodyPart){
        String hasTheSameBodyPart = "Gen element has the same body part and it is: " + bodyPart;
        String doesNotHaveTheSameBodyPart = "Gen element does not have the same body part";
        HashMap expectedBodyPart = new HashMap<String, String>();
        expectedBodyPart.put("1", "Hand");
        if(bodyPart.equals(expectedBodyPart)) {
            return hasTheSameBodyPart;
        } else {
            return doesNotHaveTheSameBodyPart;
        }
    }

    public String hasTheSameAnimals (String genAnimals) {
        String hasTheSameAnimals = "Gen element has the same animals";
        String doesNotHaveSameAnimals = "Gen element does not have the same same element";
        String expectedAnimals = "Dog";
        if (genAnimals.equals(expectedAnimals)) {
            return hasTheSameAnimals;
        } else {
            return doesNotHaveSameAnimals;
        }
    }

    public String areSameSeasonsAndWeather(HashMap seasonsAndWeather){
        String areTheSameSeasonAndWeather = "Gen animals are the same and are " + seasonsAndWeather;
        String areNotTheSameSeasonsAndWeather = "Gen animals are not the same ";
        HashMap expectedSeasonsAndWeather = new HashMap<String, String>();
        expectedSeasonsAndWeather.put("1", "Late Winter");
        expectedSeasonsAndWeather.put("2", "Stillness");
        if(seasonsAndWeather.equals(expectedSeasonsAndWeather)) {
            return areTheSameSeasonAndWeather;
        } else {
            return areNotTheSameSeasonsAndWeather;
        }
    }

    public String isTheSameDivination(HashMap genDivination) {
        String isTheSameDivination = "Gen has the same divination " + genDivination.get("Keywords");
        String doesNotHaveTheSameDivination = "Gen does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Gen");
        expectedDivination.put("Keywords", "Mountain, Restraint, Attaining inner peace, Enduring, Taking one day at a time");
        expectedDivination.put("The Judgement", "Keeping Still. He keeps his back still, So that he no longer feels his body, He goes into his courtyard and does not see his people, no blame");
        expectedDivination.put("Judgement Description", "The Book of Changes teaches that you must both your activity and your rest in harmony with the needs of the situation and the demands of the time. Success comes not only from moving forward at the right time but also from remaining still when it is appropriate to do so. The theme of Gen is recognizing that the time has come to be still so that you can regain your balance and find peace. The text offers the metaphor of keeping the back still. The back represents the center of your body. Where the back goes the body goes , so if the back remains still, the body will be still. The back is also the location of the spine, hence to make one's back still means to calm the nerves and thus one's mind. When your mind is calm and your thoughts are orderly, it is as if you no longer feel your body - that is, you no longer feel the pain of demands pressing on you from the outside and the urgency of desires pressing on you from the inside. When you are angry and distressed, the world looks disordered and confused. But when you are perfectly calm, you see the world with greater clarity. Being still allows you to see beyond the surface turbulence of life and the petty struggles of the day and look more deeply into the nature of things. Beyond the chaos and commotion lie deeper truths. You recently entered a difficult and trying period. The world seems disordered and confused. In part, that is because you have disorder and confusion within you. The most important thing for you to do right now is to restore your inner balance and find peace of mind. Do not let the chaos and the striving of the outside world distract you or upset you. There is nothing more that you can do in the present situation. You have done all you can, any further exertions would only be counterproductive. Because struggling outwardly will do you no good, you should stop struggling inward as well. Take a deep breath, collect your thoughts, and reflect. You will get nowhere if you obsess about your problems. That will only cause your anxiety to build and build until you feel that you absolutely must do something, and then you are likely to do precisely the wrong thing. If you make your decisions based on worry and apprehension, you are likely to misjudge and exaggerate things. But when your mind is still and your emotions are centered, you will make no mistakes. Calm yourself and you will be able to see more deeply into the situation. Then everything will appear in its proper perspective. Being still does not mean abandoning your feelings. Quite the contrary, you will find that you will have a greater intuitive understanding of what is going on. The point is that you can best get in touch with those intuitions through stillness rather than through being in an emotional upheaval. And when you connect with those deeper parts of yourself, you will naturally select the right strategies and make the proper choices. You will instinctively know the right thing to do. In this way stillness becomes the necessary predicate for right action in the future.");
        expectedDivination.put("The Image", "A chain of mountains: This is the image of keeping still. Thus the superior person Does not allow his thoughts To go beyond his situation");
        if(genDivination.equals(expectedDivination)){
            return isTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String isTheSameNumber(int number){
        String isTheSameNumber = "Gen has the same number and it is :" + number;
        String isNotTheSameNumber = "Gen does not have the same number";
        int expectedNumber = 52;
        if(number == expectedNumber) {
            return isTheSameNumber;
        } else {
            return isNotTheSameNumber;
        }
    }
}