import IChingClasses.ShengAscending;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;


import java.util.HashMap;

public class ShengAscendingTests extends ConsoleProgram {

    public void run() {
        ShengAscending shengAscending = new ShengAscending();
        String hasSameImage = hasSameImage(shengAscending);
        println(hasSameImage);
    }

    public String hasSameImage(ShengAscending shengAscending){
        String hasTheSameImage = "Sheng Ascending has the same image";
        String doesNotHaveTheSameImage = "Sheng Ascending does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/46.ShengAscending.jpg");
        if(shengAscending.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(ShengAscending shengAscending) {
        String hasSameImagePath =  "Sheng Ascending has the same image path";
        String doesNotHaveTheSameImagePath = "Sheng Ascending does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/46.ShengAscending.jpg";
        if(shengAscending.getImagePath().equals(expectedImagePath)){
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElementName(ShengAscending shengAscending) {
        String hasSameElementName = "Sheng Ascending has the same element name " + shengAscending.getElementName();
        String doesNotHaveSameElementName = "Sheng Ascending does not have the same element name";
        String expectedElementName ="Earth, Wind";
        if(shengAscending.getElementName().equals(expectedElementName)) {
            return hasSameElementName;
        } else {
            return doesNotHaveSameElementName;
        }
    }

    public String hasSameQualities (ShengAscending shengAscending) {
        String hasSameQualities = "Sheng Ascending has the same qualities " + shengAscending.getElementQualities() ;
        String doesNotHaveSameQualities = "Sheng Ascending does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Pushing upward" );
        expectedQualities.put("2", "Rising");
        expectedQualities.put("3", "Climbing");
        expectedQualities.put("4", "Persistence and devotion");
        expectedQualities.put("5", "Progressing step by step");
        expectedQualities.put("6", "Making steady progress");
        expectedQualities.put("7", "The accumulation of small advantages");
        if(shengAscending.getElementQualities().equals(expectedQualities)){
            return hasSameQualities;
        } else {
            return doesNotHaveSameQualities;
        }
    }

    public String hasSameDivination(ShengAscending shengAscending) {
        String hasSameDivination = "Sheng Ascending has the same divination " + shengAscending.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Sheng Ascending does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Sheng Ascending");
        expectedDivination.put("Keywords","Pushing upward, Rising, Climbing , Progressing step by step, Making steady progress, The accumulation of small advantages");
        expectedDivination.put("The Judgement","Pushing upward, Rising, Climbing, persistence and devotion, Progressing step by step, Making steady progress, The accumulation of small advantages");
        expectedDivination.put("Judgement Description","Step by step, you are making progress. Your upward movement meets with no resistance and therefore nothing holds you back. It is all a matter of time. You will not get where you want to go overnight, but devoted and persistent efforts will pay off handsomely in the long run. You need not to worry about the ultimate result. The secrets to your success are threefold. First, the time is right for your advance. Second, you have established the necessary groundwork. When the fundamentals are sound, every move forward brings cumulative benefits that bring you ever closer to your goal. Third, and most important, you succeed because you do not try to get everything at once. Instead, you move forward slowly but surely, inch by inch, never hesitating but always advancing in steady, deliberate steps. If you want to reach your goal, all you have to do is maintain this successful strategy. Have faith in yourself. Proceed step by step. When you encounter obstacles, don't be discouraged. Don't lose your temper or try to force things. Instead, be modest and unassuming. Adapt to the situation and keep going. Imagine a young plant that is moving through the soil toward the light. When it encounters earth, it adapts and shifts directions until it finds the best possible space to push upward, then  it simply continues its steady ascent. In t he same fashion, you will find that if you put your mind to it you can easily move around whatever stands in your way. Don't be afraid to ask people for help or advice. Because the time is right, they will be happy to give it to you. The important thing is to keep making steady progress. The text says that setting out toward the south brings good fortune, the the south represents activity. be confident that if you work hard you will eventually get what you want. In the long run, your continuous exertions will be rewarded with recognition and supreme success. Like a plant inching ever upward, you will reach the surface and feel the warm sunlight shining on you.");
        expectedDivination.put("The Image","Within the earth, wood grows, This is the image of Ascending, Thus the superior person , with adaptable character, accumulates the small, in order to achieve great success");
        if(shengAscending.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(ShengAscending shengAscending) {
        String hasTheSameNumber = "Sheng Ascending has the same number "+ shengAscending.getNumber();
        String doesNotHaveTheSameNumber = "Sheng Ascending does not have the same number";
        int expectedNumber = 46;
        if(shengAscending.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
