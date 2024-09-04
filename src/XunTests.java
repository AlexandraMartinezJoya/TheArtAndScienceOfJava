import IChingClasses.Xun;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class XunTests extends ConsoleProgram {

    public void run(){
        Xun xun = new Xun();
        String xunImageIsSameAsExpected = xunImageIsSameAsExpected(xun);
        println(xunImageIsSameAsExpected);
    }

    public String xunImageIsSameAsExpected(Xun xun){
        String xunImageIsSameAsExpected = "Xun image is same as expected";
        String xunImageIsNotSameAsExpected = "Xun image is not the same as expected";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/57.Xun.jpg");
        if (xun.getIChingImage().equals(expectedImage)){
            return xunImageIsSameAsExpected;
        } else {
            return xunImageIsNotSameAsExpected;
        }
    }

    public String xunImageHasSameClassPath(Xun xun){
        String xunImageHasTheSameClassPath = "Xun image has the same class path";
        String xunImageDoesNotHaveTheSameClassPath = "Xun image does not have same class path";
        String expectedXunPath  =  "../IChingImages/UpToSixtyFour/57.Xun.jpg";
        if(xun.getImagePath().equals(expectedXunPath)) {
            return xunImageHasTheSameClassPath;
        } else {
            return xunImageDoesNotHaveTheSameClassPath;
        }
    }

    public String hasSameElementName(Xun xun) {
        String xunHasSameElementName = "Xun has same element name and it is : " + xun.getElementName();
        String xunDoesNotHaveTheSameElementName = "Xun does not have the same element name";
        String expectedXunElement = "Wind, Wind";
        if(xun.getElementName().equals(expectedXunElement)) {
            return xunHasSameElementName;
        } else {
            return xunDoesNotHaveTheSameElementName;
        }
    }

    public String hasSameElementPropreties(Xun xun) {
        String xunHasTheSameElementPropreties = "Xun has the same element propreties and they are : " + xun.getElementQualities();
        String xunDoesNotHaveTheSameElementPropreties = "Xun does not have the same element propreties";
        HashMap expectedElementPropreties = new HashMap<String, String>();
        expectedElementPropreties.put("1", "Gentle" );
        expectedElementPropreties.put("2", "Submissive");
        expectedElementPropreties.put("3", "Persistent");
        expectedElementPropreties.put("4", "Penetrating");
        if(xun.getElementQualities().equals(expectedElementPropreties)) {
            return xunHasTheSameElementPropreties;
        } else {
            return xunDoesNotHaveTheSameElementPropreties;
        }
    }

    public String hasTheSameFamilyMember(Xun xun){
        String xunHasTheSameFamilyMember = "Xun has the same family member and it is " + xun.getFamilyMember();
        String xunDoesNotHaveSameFamilyMember = "Xun does not have the same family member";
        String expectedFamilyMember = "Eldest Daughter";
        if(xun.getFamilyMember().equals(expectedFamilyMember)){
            return xunHasTheSameFamilyMember;
        } else {
            return xunDoesNotHaveSameFamilyMember;
        }
    }

    public String hasTheSamePartOfBody(Xun xun){
        String xunHasTheSameBodyPart = "Xun has the same body part and it is : " + xun.getBodyPart();
        String xunDoesNotHaveTheSameBodyPart = "Xun does not have the same body part";
        HashMap expectedXunBodyPart = new HashMap<String, String>();
        expectedXunBodyPart.put("1", "thigh");
        if(xun.getBodyPart().equals(expectedXunBodyPart)){
            return xunHasTheSameBodyPart;
        } else {
            return xunDoesNotHaveTheSameBodyPart;
        }
    }

    public String hasTheSameAnimals(Xun xun) {
        String xunHasTheSameAnimals = "Xun has the same expected animals";
        String xunDoesNotHaveTheSameAnimals = "Xun does not have the same expected animals";
        String expectedAnimals = "";
        if(xun.getRelatedAnimal().equals(expectedAnimals)) {
            return xunHasTheSameAnimals;
        } else {
            return xunDoesNotHaveTheSameAnimals;
        }
    }

    public String hasSameWeatherAndSeasons(Xun xun) {
        String xunHasTheSameSeasonsAndWeather = "Xun has the same seasons and weather and they are : " + xun.getSeasonAndWeather();
        String xunDoesNotHaveTheSameSeasonsAndWeather = "Xun does not have the same seasons and weather";
        HashMap expectedSeasonsAndWeather = new HashMap<String, String>();
        expectedSeasonsAndWeather.put("1", "Early Summer");
        expectedSeasonsAndWeather.put("2", "Mild Movement");
        if(xun.getSeasonAndWeather().equals(expectedSeasonsAndWeather)) {
            return xunHasTheSameSeasonsAndWeather;
        } else {
            return xunDoesNotHaveTheSameSeasonsAndWeather;
        }
    }

    public String hasSameDivination(Xun xun) {
        String xunHasTheSameDivination = "Xun has the same divination :" + xun.getDivination().get("Keywords");
        String xunDoesNotHaveTheSameDivination = "Xun does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Xun - Gentle Influence");
        expectedDivination.put("Keywords", "Compliance, Humility, Gentleness, Penetrating, Wind, Persistence");
        expectedDivination.put("The Judgement", "Gentle influence. Success in small matters. It is beneficial to have somewhere to go. It is beneficial to see a great person.");
        expectedDivination.put("Judgement Description", "The best way to affect the situation right now is through gentle, persistent action and subtle forms of influence. The text compares the right way of proceeding to that of wind. A mild breeze seems inconspicuous. But it can penetrate everywhere. Its effects are gradual but are consistent over time. It is delightful and unassuming. Therefore, it is not feared or resisted but is gladly and gratefully accepted. And because it is accepted, it has influence.The key is to be both gentle and persistent. A violent of forceful approach will be counterproductive and meet with a rebuff. But a gentle approach will be more readily and, if you are persistent, will eventually have the right effect. Because you can only influence the situation in subtle ways, clarity and simpleminded purpose is essential. If you are uncertain about what you want or if you want to waste your time pursuing multiple and conflicting ends, your message will be dissipated and you will have no influence at all. Therefore, you must be absolutely clear in your mind what your goals are. Define your objectives and stick to them. The wind is the most powerful when it blows in one direction. You will not change the situation all at once, but only though steady and persistent influence. Things will proceed slowly, but if you have patience, over time you can have a significant effect. Restrain any impulsive tendencies. Be patient and flexible. Adjust to changing circumstances rather than fighting them, and continually look for opportunities to persuade and win people over to your side. Under no circumstances should you act aggressively or try and dominate the situation. That will surely backfire. Instead, let others take the lead. Stay in the background and serve them. You will make the most progress by subordinating yourself and making your presence felt in small but significant ways");
        expectedDivination.put("The Image", "Wind follow one another: This is the image of gentle influence, thus the superior person spreads his commands widely, motivates activity and influences events");
        if(xun.getDivination().equals(expectedDivination)) {
            return xunHasTheSameDivination;
        } else {
            return xunDoesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(Xun xun){
        String xunHasSameNumber = "Xun has the same number";
        String xunDoesNotHaveSameNumber = "Xun does not have same number";
        int expectedNumber = 57;
        if(xun.getNumber() == expectedNumber) {
            return xunHasSameNumber;
        } else {
            return xunDoesNotHaveSameNumber;
        }
    }
}