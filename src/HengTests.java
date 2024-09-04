import IChingClasses.Heng;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class HengTests extends ConsoleProgram {

    public void run() {
        Heng heng = new Heng();
        String hasTheSameImage = hasTheSameImage(heng);
        println(hasTheSameImage);
    }

    public String hasTheSameImage(Heng heng){
        String hasTheSameImage = "Heng has the same image";
        String doesNotHaveTheSameImage = "Heng does not have the same image";
        GImage expectedImage = new GImage( "../IChingImages/UpToSixtyFour/32.Heng.jpg");
        if(heng.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImageClassPath(Heng heng){
        String hasTheSameImageClassPath = "Heng does the same image class path";
        String doesNotHaveTheSameImageClassPath = "Heng does not have the same image class path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/32.Heng.jpg";
        if(heng.getImagePath().equals(expectedClassPath)){
            return hasTheSameImageClassPath;
        } else {
            return doesNotHaveTheSameImageClassPath;
        }
    }

    public String hasTheSameElementName(Heng heng) {
        String hasTheSameElementName = "Heng has the same element name "+ heng.getElementName();
        String doesNotHaveTheSameElementName = "Heng does not have the same element name";
        String expectedElementName = "Thunder, Wind";
        if(heng.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(Heng heng) {
        String hasTheSameQualities = "Heng has the same qualities "+ heng.getElementQualities();
        String doesNotHaveTheSameQualities = "Heng does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Enduring" );
        expectedQualities.put("2", "Constancy");
        expectedQualities.put("3", "Long-lasting");
        expectedQualities.put("4", "Perseverence");
        expectedQualities.put("5", "Endurance");
        expectedQualities.put("6", "Duration");
        if(heng.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(Heng heng){
        String hasTheSameDivination = "Heng has the same divination "+ heng.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Heng does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Heng - Enduring");
        expectedDivination.put("Keywords","Constancy, Long-lasting, Perseverance, Endurance, Duration");
        expectedDivination.put("The Judgement","Enduring. Success. No blame. It is beneficial to persevere. It is beneficial to have somewhere to go.");
        expectedDivination.put("Judgement Description","To endure means to keep going despite obstacles. Endurance is neither stagnation or a state of rest. It progresses forward, unlike stagnation, and it keeps moving and growing, unlike rest. What endures renews itself and its effects through continuous activity. What endures does so through change, not in spite of change. Its effects are understood against the experience of change. We see this in the cycle of the seasons that continually renew themselves as the earth moves around the sun. The cycle of the seasons repeats perpetually because its underlying causes continue. Plants and animals grow and change as they endure over time, When they cease to grow, they die, and they cease to endure. So is in life. All life is change. But in order to make change intelligible, there must be things that persist, against which change can be understood. To give your life meaning, you must have something that endures: your identity, your relationships with others, and your principles. If you surrender what is enduring within you, then you surrender to the flux of events and become indistinguishable from them. Then there is nothing left of you. The lesson of Heng is that you must learn to be consistent and persevere in the face of a changing world. Circumstances around you are changing, but you must maintain your integrity. Be consistent. Do not allow yourself to be blown about by a momentary alteration in fortunes. Do not let concerns about what others might think or how well others are doing by comparison lead you take drastic or reckless action. Instead, focus on what is and should be enduring in your life: your relationships, your character, and your principles. The situation that you face now requires you to persevere even though you face adversity and obstacles. Choose a path and stick to it. Keep your long term goals firmly in mind and progress slowly but surely toward them. Employ routines, practices, and cycles of activity that you can engage in over the long haul that will bring you closer and closer to your goal. Be content to make progress step by step through time-tested methods. Attend to the little things. If you neglect them, they will cause problems in the long run. But if you take care of everyday tasks, you will head off problems before they become large. The secret to endurance is character. Stick to your principles. Maintain your vision. This will see you through difficult times. You will inevitably have to adjust your strategy as events change, but do not give up its essential features. Don't be tempted to make radical alterations out of fear or anxiety. Slow and steady will win this particular race. When things go well, keep going and do not become lazy. When things go badly, keep going and do not become disheartened or afraid. But whether things go well or badly, you must keep going. Never give up. Through endurance and continuous practice, advantages will slowly but surely accumulate, and the situation will eventually move toward your desired goal.");
        expectedDivination.put("The Image","Thunder and wind. This is the image of what is Enduring. Thus the superior person stands firm, and does not change his direction.");
        if(heng.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Heng heng){
        String hasTheSameNumber = "Heng has the same number " + heng.getNumber();
        String doesNotHaveTheSameNumber = "Heng does not have the same number";
        int expectedNumber = 32;
        if(heng.getNumber()==expectedNumber){
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }

}
