package IChingTests;

import IChingClasses.GeRevolution;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class GeRevolutionTests extends ConsoleProgram {

    public void run() {
        GeRevolution geRevolution = new GeRevolution();
        String hasTheSameImage = hasTheSameImage(geRevolution);
        println(hasTheSameImage);
    }

    public String hasTheSameImage(GeRevolution geRevolution){
        String hasTheSameImage = "Ge Revolution has the same image";
        String doesNotHaveTheSameImage = "Ge Revolution does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/49.GeRevolution.jpg");
        if(geRevolution.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(GeRevolution geRevolution) {
        String hasTheSameImagePath = " Ge Revolution has the same image path";
        String doesNotHaveTheSameImagePath = "Ge Revolution does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/49.GeRevolution.jpg";
        if(geRevolution.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName( GeRevolution geRevolution) {
        String hasTheSameElementName = "Ge Revolution has the same element name "+ geRevolution.getElementName();
        String doesNotHaveTheSameElementName = "Ge Revolution does not have the same element name";
        String expectedElementName = "Lake, Fire";
        if(geRevolution.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(GeRevolution geRevolution) {
        String hasTheSameQualities ="Ge Revolution has the same qualities "+ geRevolution.getElementQualities();
        String doesNotHaveTheSameQualities = "Ge Revolution does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Molting" );
        expectedQualities.put("2", "Shedding old skin,");
        expectedQualities.put("3", "Metamorphism");
        expectedQualities.put("4", "Transformation");
        expectedQualities.put("5", "Fire under the lake");
        expectedQualities.put("6", "Steamy water");
        expectedQualities.put("7", "Warm pond of lake");
        expectedQualities.put("8", "Molten under the lake");
        if(geRevolution.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    String hasTheSameDivination(GeRevolution geRevolution) {
        String hasTheSameDivination = "Ge Revolution has the same divination with the keywords " + geRevolution.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Ge Revolution does not have the same qualities";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Ge - Revolution");
        expectedDivination.put("Keywords", "Molting, Shedding old skin, Metamorphosis, Transformation, Fire under the lake, Steamy water, Warm pond of lake, Molten under the lake");
        expectedDivination.put("The Judgement", "Revolution, On your own day, there is confidence, Supreme success, it is beneficial to persevere, regrets vanish");
        expectedDivination.put("Judgement Description", "Revolution means the abolition of an old order in preparations for a new one. Such drastic changes are appropriate only when there is no other alternative. If you are contemplating such a change, it is because you feel things have gone as far as they can in the present form and something entirely new is called for. When you realize that the time has come for revolution in your life it's because they already begun to experience a revolution in your heart. You may find yourself questioning long-held assumptions and beliefs. What once seemed so central and important to you now begins to seem irrelevant and besides the point. All of this seems that your values and experiences are changing. You have begun to see things in different ways. It's dizzying and leaves you uncertain. But it's a necessary precondition to transform of your life. The name of the hexagram, Ge, compares this process to the shedding of an old skin in preparation for a new one. You should not be afraid of the changes you want to make. Now more than ever you need to have the courage and faith in yourself. But before you proceed, you must think of things carefully. Take the time to consider the ramifications of what you are about to do. Radical change that is well motivated and properly prepared invigorates your life. Change that is reckless and ill considered can be very destructive. Remember that you are not the only person affected by the change. You must take other's people feelings are interests into account. Noone goes into a revolution alone, wether by choice or circumstance, one takes many others as well. You will need the support of others if you are to succeed in making a successful transformation. Discuss your change of heart with them and describe what you plan to accomplish. Talk openly about their fears and concerns as well as your own. If you show them that you are not being self-centered, capricious and arbitary but that is what you really need to do, they will be more supportive than you expect. And they might offer helpful advice about how to achieve your next goals. When you have thoroughly considered the need for change and generated the support of others, you are ready to act. Good timing is crucial to a successful transformation.  Do not be afraid to make far-reaching changes in your lifestyle, your habits or your environment. You must change your life in order to make it cohere to who you are now. As the text says, when your day comes, there is confidence. The same principles apply to political revolutions or transformations in large organizations. Drastic change is a very serious matter. It should not be undertaken lightly, but only when there is nothing else to be done. A successful revolution requires a leader who is called to the task. You should not accept radical changes unless you feel a calling to lead and serve others, an inner compulsion that convinces you that change must come and that you must play your part in it. A successful leader must act at the right time, and must gain the support of others. If you do not do this, your attempts will fail. Perhaps most important, you must make the changes not merely for your own sake but for those who follow you. Revolution is justified when it helps the people and not merely their leaders. And you have a duty to guide the movement forward to something creative and positive, and to prevent events from spinning out of control and becoming excessive or destructive. If you can do all these things, you should have no regrets about making the necessary changes.");
        expectedDivination.put("The Image", "Fire in the lake, this is the image of Ge Revolution, Thus the superior person sets the calendar in order, to illuminate in accordance with the times");
        if(geRevolution.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    String hasTheSameNumber(GeRevolution geRevolution) {
        String hasTheSameNumber = "Ge Revolution has the same number " + geRevolution.getNumber();
        String doesNotHaveTheSameNumber = "Ge Revolution does not have the same number";
        int expectedNumber = 49;
        if(geRevolution.getNumber() == expectedNumber){
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
