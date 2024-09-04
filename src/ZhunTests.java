import IChingClasses.Zhun;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class ZhunTests extends ConsoleProgram {

    public void run() {
        Zhun zhun = new Zhun();

        String isSameImage = isSameImage(zhun);
        println(isSameImage);
        println("---------------------------------");
    }

    public String isSameImage(Zhun zhun) {
        String zhunHasTheSameImage = "Zhun has the same image";
        String zhunDoesNotHaveTheSameImage = "Zhun does not have the same image";
        GImage expectedZhunImage = new GImage("../IChingImages/UpToSixtyFour/51.Zhen.jpg");
        if(zhun.getIChingImage().equals(expectedZhunImage)) {
            return zhunHasTheSameImage;
        } else {
            return zhunDoesNotHaveTheSameImage;
        }
    }

    public String imageHasSameClassPath(Zhun zhun){
        String imageHasTheSameClassPath = "Zhun image has the same class path";
        String imageDoesNotHaveTheSameClassPath = "Zhun does not have the same class path";
        String expectedImageClassPath =  "../IChingImages/UpToSixtyFour/3.Zhun.jpg";
        if(zhun.getImagePath().equals(expectedImageClassPath)) {
            return imageHasTheSameClassPath;
        } else {
            return imageDoesNotHaveTheSameClassPath;
        }
    }

    public String hasSameElementName(Zhun zhun){
        String imageHasTheSameElementName = "Zhun image has the same element name and it is: " + zhun.getElementName();
        String imageDoesNotHaveTheSameElementName = "Zhun does not have the same element name";
        String expectedElement = "Water, Thunder";
        if(zhun.getElementName().equals(expectedElement)) {
            return imageHasTheSameElementName;
        } else {
            return imageDoesNotHaveTheSameElementName;
        }
    }

    public String hasSameElementQualities(Zhun zhun) {
        String zhunHasTheSameElementQualities = "Zhun has the same element qualities as expected and they are " + zhun.getElementQualities();
        String zhunDoesNotHaveElementQualities = "Zhun does not have the element qualities as expected";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Pushing up out of the ground" );
        expectedQualities.put("2", "Growing pains" );
        expectedQualities.put("3", "Birth throes" );
        expectedQualities.put("4", "Birth pangs" );
        expectedQualities.put("5", "Initial difficulties" );
        expectedQualities.put("6", "Time to gather helper" );
        if(zhun.getElementQualities().equals(expectedQualities)) {
            return zhunHasTheSameElementQualities;
        } else {
            return zhunDoesNotHaveElementQualities;
        }
    }

    public String hasSameDivination(Zhun zhun) {
        String zhunHasTheSameElementQualities = "Zhun has the same divination and the keywords are : " + zhun.getDivination().get("Keywords");
        String zhunDoesNotHaveTheSameDivination = "Zhun does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Zhun - Difficulty in the beginning");
        expectedDivination.put("Keywords", "Pushing up out of the ground, growing pains, birth throes, birth pangs, initial difficulties, time to gather helpers");
        expectedDivination.put("The Judgement", "Difficulty in the beginning, Supreme success, It is beneficial to persevere, Do not use this as an opportunity to undertake anything, it is beneficial to establish feudal lords");
        expectedDivination.put("Judgement Description", "To undertake something means to engage in something ambitious. In ancient China, rulers granted lands and titles to feudatories in exchange for their promise of help and support, and in particular promises of military assistance when the ruler was attacked. Hence 'to establish feudal lords' means to seek help from others during a difficult time. You face a situation akin to growing pains. A new era is beginning. Things are struggling to take form. Chaos is slowly and painfully being converted into the first semblance of a new order. This confusion may reside in your projects and undertakings, in your own thoughts and desires, or even in your relationships with others. You may find what you one thought was settled and clear has now become unsettled and uncertain. You may be questioning old assumptions and beliefs, although you are not yet quite sure what to replace them with. You are leaving the confines of the safe and familiar and moving to a new frontier of indeterminate scope and abundant possibilities. Indeed, there are so many possibilities now that you may find yourself adrift and confused. But the current lack of form brings the promise of ultimate success, for there is much potential here. Nevertheless, precisely because things are still so unsettled, you must not act prematurely or attempt any great undertakings. This is not the time to be overly ambitious. Rather, you must move slowly and carefully, feeling your way about and beginning to consolidate your position. You could benefit greatly from the help and advice of other people during this difficult time. Do not be too proud to ask for assistance. Look to people more experienced than yourself to advise you. They will help you sort out your thoughts and priorities.");
        expectedDivination.put("The Image", "Clouds and thunder. This is the image of difficulty in the beginning. thus the superior person regulates and brings order.");
        if(zhun.getDivination().equals(expectedDivination)) {
            return zhunHasTheSameElementQualities;
        } else {
            return zhunDoesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(Zhun zhun) {
        String zhunHasTheSameNumber = "Zhun has the same number as expected and it is: " + zhun.getNumber();
        String zhunDoesNotHaveTheSameNumber = "Zhun does not have the same number as expected";
        int expectedNumber = 3;
        if(zhun.getNumber()== expectedNumber) {
            return zhunHasTheSameNumber;
        } else {
            return zhunDoesNotHaveTheSameNumber;
        }
    }

}
