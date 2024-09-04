import IChingClasses.Lin;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class LinTests extends ConsoleProgram {

    public void run() {
        Lin lin = new Lin();
        String linHasTheSameImage = linHasTheSameImage(lin);
        println(linHasTheSameImage);
    }

    public String linHasTheSameImage(Lin lin) {
        String hasTheSameImage = "Lin has the same image as expected";
        String linDoesNotHaveTheSameImage = "Lin does not have the same image as expected";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/19.Lin.jpg");
        if(lin.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return linDoesNotHaveTheSameImage;
        }
    }

    public String linHasTheSameImagePath (Lin lin) {
        String hasTheSameImagePath = "Lin has the same image path";
        String doesNotHaveTheSameImagePath = "Lin does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/19.Lin.jpg";
        if(lin.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(Lin lin) {
        String hasTheSameElementName = "Lin has the same expected element name " + lin.getElementName();
        String doesNotHaveTheSameElementName = "Lin does not have the same element name";
        String expectedElementName =  "Earth, Lake";
        if(lin.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(Lin lin) {
        String hasTheSameElementQualities = "Lin has the same element qualities and they are "+ lin.getElementQualities() ;
        String doesNotHaveTheSameElementQualities = "Lin does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1","Approach");
        expectedQualities.put("2","Oversight");
        expectedQualities.put("3","Cooperation");
        if(lin.getElementQualities().equals(expectedQualities)) {
            return hasTheSameElementQualities;
        } else {
            return doesNotHaveTheSameElementQualities;
        }
    }

    public String hasTheSameDivination(Lin lin) {
        String hasTheSameDivination = "Lin has the same divination with the keywords "+ lin.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Lin does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Lin Overseeing");
        expectedDivination.put("Keywords", "Approach, Oversight, Cooperation");
        expectedDivination.put("The Judgement", "Overseeing, supreme success, It is beneficial to persevere, when the eight month comes there will be misfortune");
        expectedDivination.put("Judgement Description", "By tradition, Lin is a symbol of springtime. More generally, it symbolizes happy joyous times of natural progress and advancement, like the first stirrings of spring. The low advance upward to the high, who happily accepts them.Matters move forward naturally. Relationships thrive. Success blossoms like the flowers of spring.However, just like growth during springtime, everything must take it's natural course. Do not try to hurry things, let matters develop in a normal and healthy fashion. Full growth is not achieved in the spring, but in the summertime. Thus, you should not become impatient, success will come eventually come if you lay strong foundations now and if you nurture things appropriately.Energy and initiative are important during this time. Make the most of opportunities for growth when they present themselves. This is an especially fertile period, so be on the lookout for ways to improve your situation and your relationships with others. Encourage people who work under you and help them advance.  Think of them like young plants in springtime that needed to be tended and helped so that they will grow upward and become healthy, beautifull, and strong.  Finally, remember that spring does not last forever. Good times will eventually evaporate, so it's important to make most of them while they last. Hence the text says 'In the eight month' (September in the Chinese Calendar) 'there will be missfortune'. because summer is fading away and autumn is approaching. For this reason it is important to nip problems in the bud before they have a chance to grow large. Keep your eyes for difficulty or deterioration. If you make the effort now, you will be in a much stronger position when you face obstacles in the future. Take advantage of this favorable time to establish the groundwork for future success. ");
        expectedDivination.put("The Image", "The earth is above the lake, this is the image of overseeing. Thus , the superior person teaches and shows concern without exhaustion, tolerating and protecting the people without limit");
        if(lin.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Lin lin) {
        String hasTheSameNumber = "Lin has the same number and it is "+ lin.getNumber();
        String doesNotHaveTheSameNumber = "Lin does not have the same number";
        int expectedNumber = 19;
        if(lin.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
