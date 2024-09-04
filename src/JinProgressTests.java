import IChingClasses.JinProgress;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JinProgressTests extends ConsoleProgram {

    public void run() {
        JinProgress jinProgress = new JinProgress();
        String hasSameImage = hasSameImage(jinProgress);
        println(hasSameImage);
    }

    public String hasSameImage(JinProgress jinProgress){
        String hasSameImage = "Jin Progress has the same image";
        String doesNotHaveSameImage = "Jin Progress does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/35.JinProgress.jpg");
        if(jinProgress.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(JinProgress jinProgress){
        String hasSameImagePath = "Jin Progress has same image path";
        String doesNotHaveSameImagePath = "Jin progress does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/35.JinProgress.jpg";
        if(jinProgress.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasSameElementName (JinProgress jinProgress) {
        String hasSameElementName = "Jin Progress has same element name " + jinProgress.getElementName();
        String doesNotHaveSameElementName = "Jin progress does not have the same element name";
        String expectedElementName =  "Fire, Earth";
        if(jinProgress.getElementName().equals(expectedElementName)){
            return hasSameElementName;
        } else {
            return doesNotHaveSameElementName;
        }
    }

    public String hasSameQualities( JinProgress jinProgress) {
        String hasTheSameQualities = "Jin Progress has the same qualities " + jinProgress.getElementQualities();
        String doesNotHaveTheSameQualities = "Jin progress does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Advance" );
        expectedQualities.put("2", "Recognition");
        expectedQualities.put("3", "Move forward");
        expectedQualities.put("4", "Progress");
        expectedQualities.put("5", "Fire on top of the earth");
        expectedQualities.put("6", "Campfire");
        if(jinProgress.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasSameDivination (JinProgress jinProgress) {
        String hasTheSameDivination= "Jin progress has the same divination " + jinProgress.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Jin progress does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Jin Progress - Advance");
        expectedDivination.put("Keywords","Advance, Recognition, Move forward, Progress");
        expectedDivination.put("The Judgement","Progress, The Marquis of Kang, Is honored with horses in great numbers, In a single day he is granted audience three times.");
        expectedDivination.put("Judgement Description","You face unfavorable circumstances. You encounter criticism and opposition, you projects fail to prosper, or those who have control over your life lack confidence in you. Whatever the problem, there is little that you can do about it for the time being. You must wait out the bad times until things take a turn for the better. Because you are currently trapped in a hostile environment, the best strategy right now is to keep a low profile. You must hide your light. If you try to assert yourself, the people who surround you will not be sympathetic and will rebuff you. If you object to your treatment, people will not understand, and you may make things even worse for yourself. Instead of protesting, it is better to allow those in your environment to believe that you accept the situation. Someone may be jealous of you or resent you. You should not give them an opportunity to harm you. Do not be aggressive and do not call attention to yourself. This is no time to pick a fight. Conditions are not in your favor right now, and you do not have the resources to prevail. Nevertheless, during this difficult time you must continue to have faith in yourself. Do not give up just because things are not going well. As the text says, in times of adversity, it is beneficial to remain steadfast and to persevere. It is a test of your will and your endurance. You must preserve your inner light - the still, small voice within. Do not let the darkness on the outside extinguish the light on the inside, for then there will be nothing left of you when times improve. People and events will surely provoke you. But you must maintain your composure and your emotional compass. Do not let what others say and do cause you to lose heart. You cannot let their ignorace or their bad judgement undermine your self-confidence. They see only a small part of the picture. Their values are not your values. And even though things seem rough right now, time has a way of turning present disadvantages into seeds of later advantages. You will not be down forever. Hostile circumstances require you to accept the situation for the time being. You must allow people to think that you acquiesce and are going along. But you must never surrender. Maintain your resistance on the inside. Hold fast to your enduring values and to your ultimate goals. Remember who you are and what you stand for. Even though there is little that you can do at present, you must preserve your integrity during these dark times. Keep your heart and soul steadfast and ever fixed on what is most important. Eventually, things will change for the better, and you will prevail.");
        expectedDivination.put("The Image","The light has descended into the center of the earth, this is the image of darkening of light, thus the superior person oversees the masses. He hides his light, yet it still shines");
        if(jinProgress.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber (JinProgress jinProgress) {
        String hasTheSameNumber = "Jin Progress has the same number " + jinProgress.getNumber();
        String doesNotHaveTheSameNumber = "Jin Progress does not have the same number";
        int expectedNumber = 35;
        if(jinProgress.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
