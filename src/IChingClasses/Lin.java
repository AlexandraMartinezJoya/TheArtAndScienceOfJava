package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Lin extends IChingStone implements IChingLineNames {

    GImage image;
    String imagePath;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Lin(){
        imagePath = "../IChingImages/UpToSixtyFour/19.Lin.jpg";
        image = new GImage(imagePath);
        element = "Earth, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1","Approach");
        qualities.put("2","Oversight");
        qualities.put("3","Cooperation");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 19;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Lin Overseeing";
        String keywords = "Approach, Oversight, Cooperation";
        String theJudgement = "Overseeing, supreme success, It is beneficial to persevere, when the eight month comes there will be misfortune";
        String theJudgementDescription = "By tradition, Lin is a symbol of springtime. More generally, it symbolizes happy joyous times of natural progress and advancement, like the first stirrings of spring. The low advance upward to the high, who happily accepts them.Matters move forward naturally. Relationships thrive. Success blossoms like the flowers of spring.However, just like growth during springtime, everything must take it's natural course. Do not try to hurry things, let matters develop in a normal and healthy fashion. Full growth is not achieved in the spring, but in the summertime. Thus, you should not become impatient, success will come eventually come if you lay strong foundations now and if you nurture things appropriately.Energy and initiative are important during this time. Make the most of opportunities for growth when they present themselves. This is an especially fertile period, so be on the lookout for ways to improve your situation and your relationships with others. Encourage people who work under you and help them advance.  Think of them like young plants in springtime that needed to be tended and helped so that they will grow upward and become healthy, beautifull, and strong.  Finally, remember that spring does not last forever. Good times will eventually evaporate, so it's important to make most of them while they last. Hence the text says 'In the eight month' (September in the Chinese Calendar) 'there will be missfortune'. because summer is fading away and autumn is approaching. For this reason it is important to nip problems in the bud before they have a chance to grow large. Keep your eyes for difficulty or deterioration. If you make the effort now, you will be in a much stronger position when you face obstacles in the future. Take advantage of this favorable time to establish the groundwork for future success. ";
        String theImage = "The earth is above the lake, this is the image of overseeing. Thus , the superior person teaches and shows concern without exhaustion, tolerating and protecting the people without limit";
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

    public String getImagePath() {return imagePath;}

    @Override
    public void create() { new Lin();}
}
