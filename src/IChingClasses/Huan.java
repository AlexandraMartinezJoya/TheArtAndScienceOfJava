package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Huan extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Huan(){
        image = new GImage("../IChingImages/IChingClasses.Huan.png");
        element = "Wind, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Dispersion");
        qualities.put("2", "Dissolution");
        qualities.put("3", "Getting rid of egotism");
        qualities.put("4", "Bringing people together");
        qualities.put("5", "Finding a common common purpose");
        qualities.put("6", "Clearing up blockages");
        qualities.put("7", "Melting the ice");
        qualities.put("8", "Eliminating obstacles within yourself");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 59;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Huan Dispersion ";
        String keywords = "Dispersion. Success. The king approaches his temple. It is beneficial to cross the great river. It is beneficial to persevere";
        String theJudgement = "Dispersion. Success. The king approaches his temple. It is beneficial to cross the great river. It is beneficial to persevere";
        String theJudgementDescription = "You can now make progress by bringing people together. To do this, you must dissolve the things that keep them apart. Egotism, selfishness, and insecurity have pitted people against each other. They are unable or afraid to communicate with each other openly and sincerely. Hence they pursue their narrow self-interest in a short-sighted way. You have the power to change all that. Strive to clear up misunderstandings and doubts. Work to reconcile people and break up factions and cliques. Progress will come only when you eliminate mutual suspicion and antagosnism and restore harmony and cooperation. The same principles apply with special force to yourself. It is time to break through the barriers that separate you from others. You must dissolve the selfishness and egotism within you. This is the path to happiness and success. To eliminate egotism and dispel misunderstanding, you must excecise gentleness, flexibility, and tact. If you try to force people to come together, they will resist. If you try to domniate people, you will simply drive them further apart. The text compares the best strategy to wind blowing gently over floes of ice that separate people. Over time, the ice melts and the barriers that once divided people are gradually removed. In the same way, you need to open channels of communication slowly and give people a sense of comfort with each other. Gradually , they will begin to come together. The melting of ice starts slowly at first and then proceeds more quickly, the same is true of trust. Trust begins in little things and then , once it is established, the forces of solidarity and reconciliation build on each other more rapidly. What is the best way to dissolve faction and bring people together? The text offers two solutions - the first is a great symbol or idea, the second is a great project.\n" +
                "The text says the king approaches his temple. In ancient China, religious ceremonies brought people together both physically and spiritually and called on their common commitments and belifs. Rituals and sacred music inspired them and bound them together emotionally. Invoking tradition through symbols and religious ceremony gave people a sense that they were one people with a long history and a common destiny. If you want to dissolve the barriers that separate people, you should appeal to their shared beliefs and practices. Remind people of the many things they have in common. It may be a common history, a common set of values, a common tradition, or an everyday activity common to all. Invoke a great idea or cause that everyone can believe in and rally around. Draw on symbols of shared history and community. When people feel that they are keeping faith with something noble and valuable that is greater than themselves, their estrangement and selfishness will dissolve and they will rally together. Similarily, the text says that it is beneficial to cross the great river. If you want to remedy alienation, you must give people a shared sense of purpose. Call them together to a great understaking. Set a high and noble goal. When people work together on a single task, the barriers between them begin to dissolve. If you cannot get people to work on something big, start with something small. Laboring together, even on something minor, has an important symbolic effect. Cooperating on joint projects allows people to find what they have in common. It humanizes others and lets the participants see each other as allies rather than adversaries. Instead of worrying about whether others will grab something that is theirs, people instead focus on whether they will be able to reach a common goal. And when they achieve that goal together, they will celebrate as one.";
        String theImage = "The wind moves across the water, this is the image of dispersion, thus the ancient kings made offerings to the Supreme Diety and established temples";
        divination.put("Title", title);
        divination.put("Keywords", keywords);
        divination.put("The Judgement", theJudgement);
        divination.put("Judgement Description", theJudgementDescription);
        divination.put("The Image", theImage);
        return divination;
    }

    public GImage getIChingImage() {
        return image;
    }

    public String getElementName() {
        return element;
    }

    public HashMap getElementQualities() {
        return qualities;
    }

    public String getFamilyMember() {
        return familyMember;
    }

    public HashMap getBodyPart() {
        return partOfBody;
    }

    public String getRelatedAnimal() {
        return animals;
    }

    public HashMap getSeasonAndWeather() {
        return seasonsAndWeather;
    }

    public HashMap getDivination() { return divination;}

    public int getNumber() { return number; }

    void create() { new Huan();}

}
