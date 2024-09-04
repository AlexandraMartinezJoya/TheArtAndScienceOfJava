import IChingClasses.MingYi;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class MingYiTests extends ConsoleProgram {

    public void run() {
        MingYi mingYi = new MingYi();
        String hasTheSameImage = hasTheSameImage(mingYi);
        println(hasTheSameImage);
    }

    public String hasTheSameImage(MingYi mingYi){
        String hasTheSameImage = "Ming Yi has the same image";
        String doesNotHaveTheSameImage = "Ming Yi does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/36.MingYi.jpg");
        if(mingYi.getIChingImage().equals(expectedImage)){
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(MingYi mingYi){
        String hasTheSameImagePath = "Ming Yi has the same image path";
        String doesNotHaveTheSameImagePath = "Ming Yi does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/36.MingYi.jpg";
        if(mingYi.getImagePath().equals(expectedImagePath)){
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(MingYi mingYi){
        String hasTheSameElementName = "Ming Yi has the same element name " + mingYi.getElementName();
        String doesNotHaveTheSameElementName = "Ming Yi does not have the same element name";
        String expectedElementName = "Earth, Fire";
        if(mingYi.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities( MingYi mingYi){
        String hasTheSameQualities = "Ming Yi has the same qualities " + mingYi.getElementQualities();
        String doesNotHaveTheSameQualities = "Ming Yi does not have the same qualities";
        HashMap expectedQualties = new HashMap<String, String>();
        expectedQualties.put("1", "The crying pheasant" );
        expectedQualties.put("2", "Eclipse");
        expectedQualties.put("3", "Hiding one's light");
        expectedQualties.put("4", "Brilliance injured,");
        expectedQualties.put("5", "Censorship");
        expectedQualties.put("6", "Keeping a low profile");
        expectedQualties.put("7", "Hiding your feelings");
        if(mingYi.getElementQualities().equals(expectedQualties)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination(MingYi mingYi) {
        String hasSameDivination = "Ming Yi has the same divination " + mingYi.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Ming Yi does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Ming Yi");
        expectedDivination.put("Keywords","The crying pheasant, eclipse, hiding one's light, brilliance injured, censorship, keeping a low profile, hiding your feelings");
        expectedDivination.put("The Judgement","Darkening of the Light, In adversity, it is beneficial to persevere.");
        expectedDivination.put("Judgement Description","You face unfavorable circumstances. You encounter criticism and opposition, you projects fail to prosper, or those who have control over your life lack confidence in you. Whatever the problem, there is little that you can do about it for the time being. You must wait out the bad times until things take a turn for the better. Because you are currently trapped in a hostile environment, the best strategy right now is to keep a low profile. You must hide your light. If you try to assert yourself, the people who surround you will not be sympathetic and will rebuff you. If you object to your treatment, people will not understand, and you may make things even worse for yourself. Instead of protesting, it is better to allow those in your environment to believe that you accept the situation. Someone may be jealous of you or resent you. You should not give them an opportunity to harm you. Do not be aggressive and do not call attention to yourself. This is no time to pick a fight. Conditions are not in your favor right now, and you do not have the resources to prevail. Nevertheless, during this difficult time you must continue to have faith in yourself. Do not give up just because things are not going well. As the text says, in times of adversity, it is beneficial to remain steadfast and to persevere. It is a test of your will and your endurance. You must preserve your inner light - the still, small voice within. Do not let the darkness on the outside extinguish the light on the inside, for then there will be nothing left of you when times improve. People and events will surely provoke you. But you must maintain your composure and your emotional compass. Do not let what others say and do cause you to lose heart. You cannot let their ignorace or their bad judgement undermine your self-confidence. They see only a small part of the picture. Their values are not your values. And even though things seem rough right now, time has a way of turning present disadvantages into seeds of later advantages. You will not be down forever. Hostile circumstances require you to accept the situation for the time being. You must allow people to think that you acquiesce and are going along. But you must never surrender. Maintain your resistance on the inside. Hold fast to your enduring values and to your ultimate goals. Remember who you are and what you stand for. Even though there is little that you can do at present, you must preserve your integrity during these dark times. Keep your heart and soul steadfast and ever fixed on what is most important. Eventually, things will change for the better, and you will prevail.");
        expectedDivination.put("The Image","The light has descended into the center of the earth, this is the image of darkening of light, thus the superior person oversees the masses. He hides his light, yet it still shines.");
        if(mingYi.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(MingYi mingYi){
        String hasSameNumber = "Ming Yi has same number " + mingYi.getNumber();
        String doesNotHaveSameNumber = "Ming Yi does not have same number";
        int expectedNumber = 36;
        if(mingYi.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveSameNumber;
        }
    }
}
