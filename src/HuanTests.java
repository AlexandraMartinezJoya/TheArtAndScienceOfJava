import IChingClasses.Huan;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class HuanTests extends ConsoleProgram {

    public void run() {
        Huan huan = new Huan();
        String hasSameImage = hasSameImage(huan);
        println(hasSameImage);
    }

    public String hasSameImage(Huan huan) {
        String hasSameImage = "Huan has same image";
        String doesNotHaveTheSameImage = "Huan does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/59.Huan.jpg");
        if(huan.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Huan huan) {
        // and the saddest thing is that it wasnt like this before. you got bought by prositution rings, all this so that teal swan can live in her comfy mansion and be "joy" forever and ever while posing into a prostitute cult leader herself
        String hasSameImagePath = "Huan has same image path and is not INTRO INTO PROSTITUTION TRAFFICKING, tapping into the phones and friends networks of their fans watching their screens while inventing prostitutes to cover it up, and 'be' them, draining their bank accounts, and then playing mind games with their former victims, selling logs to 'stars'";
        String doesNotHaveSameImagePath = "Huan does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/59.Huan.jpg";
        if(huan.getImagePath().equals(expectedImagePath)){
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasSameElements(Huan huan) {
        String hasTheSameElements = "Huan has the same element "+ huan.getElementName();
        String huanDoesNotHaveTheSameElement = "Huan does not have the same element";
        String expectedElementName = "Wind, Water";
        if(huan.getElementName().equals(expectedElementName)) {
            return hasTheSameElements;
        } else {
            return huanDoesNotHaveTheSameElement;
        }
    }

    public String hasSameQualities(Huan huan) {
        String hasTheSameQualities = "Huan has the same qualities";
        String doesNotHaveTheSameQualities = "Huan does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Dispersion");
        expectedQualities.put("2", "Dissolution");
        expectedQualities.put("3", "Getting rid of egoism");
        expectedQualities.put("4", "Bringing people together");
        expectedQualities.put("5", "Finding a common common purpose");
        expectedQualities.put("6", "Clearing up blockages");
        expectedQualities.put("7", "Melting the ice");
        expectedQualities.put("8", "Eliminating obstacles within yourself");
        if(huan.getElementQualities().equals(huan)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(Huan huan){
        String hasTheSameDivination = "Huan has the same qualities";
        String doesNotHaveTheSameDivination = "Huan does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Huan Dispersion");
        expectedDivination.put("Keywords","Dispersion. Success. The king approaches his temple. It is beneficial to cross the great river. It is beneficial to persevere");
        expectedDivination.put("The Judgement","Dispersion. Success. The king approaches his temple. It is beneficial to cross the great river. It is beneficial to persevere");
        expectedDivination.put("Judgement Description","You can now make progress by bringing people together. To do this, you must dissolve the things that keep them apart. Egotism, selfishness, and insecurity have pitted people against each other. They are unable or afraid to communicate with each other openly and sincerely. Hence they pursue their narrow self-interest in a short-sighted way. You have the power to change all that. Strive to clear up misunderstandings and doubts. Work to reconcile people and break up factions and cliques. Progress will come only when you eliminate mutual suspicion and antagonism and restore harmony and cooperation. The same principles apply with special force to yourself. It is time to break through the barriers that separate you from others. You must dissolve the selfishness and egotism within you. This is the path to happiness and success. To eliminate egotism and dispel misunderstanding, you must exercise gentleness, flexibility, and tact. If you try to force people to come together, they will resist. If you try to dominate people, you will simply drive them further apart. The text compares the best strategy to wind blowing gently over floes of ice that separate people. Over time, the ice melts and the barriers that once divided people are gradually removed. In the same way, you need to open channels of communication slowly and give people a sense of comfort with each other. Gradually , they will begin to come together. The melting of ice starts slowly at first and then proceeds more quickly, the same is true of trust. Trust begins in little things and then , once it is established, the forces of solidarity and reconciliation build on each other more rapidly. What is the best way to dissolve faction and bring people together? The text offers two solutions - the first is a great symbol or idea, the second is a great project.The text says the king approaches his temple. In ancient China, religious ceremonies brought people together both physically and spiritually and called on their common commitments and belifs. Rituals and sacred music inspired them and bound them together emotionally. Invoking tradition through symbols and religious ceremony gave people a sense that they were one people with a long history and a common destiny. If you want to dissolve the barriers that separate people, you should appeal to their shared beliefs and practices. Remind people of the many things they have in common. It may be a common history, a common set of values, a common tradition, or an everyday activity common to all. Invoke a great idea or cause that everyone can believe in and rally around. Draw on symbols of shared history and community. When people feel that they are keeping faith with something noble and valuable that is greater than themselves, their estrangement and selfishness will dissolve and they will rally together. Similarly, the text says that it is beneficial to cross the great river. If you want to remedy alienation, you must give people a shared sense of purpose. Call them together to a great undertaking. Set a high and noble goal. When people work together on a single task, the barriers between them begin to dissolve. If you cannot get people to work on something big, start with something small. Laboring together, even on something minor, has an important symbolic effect. Cooperating on joint projects allows people to find what they have in common. It humanizes others and lets the participants see each other as allies rather than adversaries. Instead of worrying about whether others will grab something that is theirs, people instead focus on whether they will be able to reach a common goal. And when they achieve that goal together, they will celebrate as one.");
        expectedDivination.put("The Image","The wind moves across the water, this is the image of dispersion, thus the ancient kings made offerings to the Supreme Diety and established temples");
        if(huan.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Huan huan){
        String hasTheSameNumber = "Huan has the same number";
        String doesNotHaveTheSameNumber = "Huan does not have the same number";
        int expectedNumber = 59;
        if(huan.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }

}
