import IChingClasses.XiaoGuo;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class XiaoGuoTests extends ConsoleProgram {

    public void run() {
        XiaoGuo xiaoGuo = new XiaoGuo();
        String hasSameImage = hasSameImage(xiaoGuo);
        println(hasSameImage);
    }

    public String hasSameImage(XiaoGuo xiaoGuo){
        String hasSameImage =  "Xiao Guo has same image";
        String doesNotHaveSameImage = "Xiao Guo does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/62.XiaoGuo.jpg");
        if(xiaoGuo.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveSameImage;
        }
    }

    public String hasSameImagePath(XiaoGuo xiaoGuo) {
        String hasSameImagePath = "Xiao Guo has same image path";
        String doesNotHaveSameImagePath = "Xiao Guo does not have the same image path";
        String expectedPath = "../IChingImages/UpToSixtyFour/62.XiaoGuo.jpg";
        if(xiaoGuo.getImagePath().equals(expectedPath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasSameElement(XiaoGuo xiaoGuo) {
        String hasTheSameElement = "Xiao Guo has the same element and it is "+ xiaoGuo.getElementName();
        String doesNotHaveTheSameElement = "Xiao Guo does not have the same element";
        String expectedElement = "Thunder, Mountain";
        if(xiaoGuo.getElementName().equals(expectedElement)){
            return hasTheSameElement;
        } else {
            return doesNotHaveTheSameElement;
        }
    }

    public String hasTheSameQualities(XiaoGuo xiaoGuo) {
        String hasTheSameQualities = "Xiao Gou has the same element qualities and are " + xiaoGuo.getElementQualities();
        String doesNotHaveTheSameQualities = "Xiao Gou does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Exceeding Smallness" );
        expectedQualities.put("2", "Preponderance of the small");
        expectedQualities.put("3", "Smallness in excess");
        expectedQualities.put("4", "Conscientiousness");
        expectedQualities.put("5", "Keeping a low profile");
        expectedQualities.put("6", "Reining in your ambitions");
        expectedQualities.put("7", "Maintaining your dignity in everyday life");
        expectedQualities.put("8", "Paying attention to detail");
        expectedQualities.put("9", "The little bird flies close to the ground");
        if(xiaoGuo.getElementQualities().equals(expectedQualities)){
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(XiaoGuo xiaoGuo) {
        String hasTheSameDivination = "Xiao Guo has the same divination with the keywords " + xiaoGuo.getDivination().get("Keywords");
        String doesNotHaveSameDivination = "Xiao Guo does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Xiao Guo - Exceeding Smallness");
        expectedDivination.put("Keywords","Preponderance of the small, small in excess, conscientiousness, keeping a low profile, reining in your ambitions, maintaining your dignity in everyday life, paying attention to detail, the little bird flies close to the ground");
        expectedDivination.put("The Judgement","Exceeding Smallness. Success. It is beneficial to persevere. Small things may be done, great things should not be done. The flying bird leaves behind its song. One should not go up, one should go down. Great good fortune.");
        expectedDivination.put("Judgement Description","This is not the time to undertake something big or difficult. Conditions are not in your favor for significant accomplishment. You lack the strength and resources to achieve what you would like. Therefore, you need to understand the demands of the time and scale back your expectations. You should not expect great success, but that does not mean there is nothing you can do. The text compares your situation to a small bird. If the little bird attempts to fly to high, it will get into trouble. But if it stays low, it will be safe and find its nest. In the same way, your best strategy right now is to maintain a low profile and attend to everyday matters. Stick to your ordinary routine. Success will come from scrupulous dedication to the minutiae of everyday life. Be especially conscientious and pay careful attention to detail. If you resolve to undertake only small things but do them well, you will get through this difficult period in good shape. Just as a small bird should not fly too high, you should not bit off more than you can chew. This is not a time for risk taking. Play it safe for the time being. Recognize your limitations and don't take on more than you are able. Don't try to show off or call attention to yourself. Be simple and unpretentious and keep your feet firmly planted on the ground. If you are too big for your britches, people will resent you and your projects will fail. But if you are modest and dignified and simply attend to your business, you will earn respect.");
        expectedDivination.put("The Image","Above the mountain there is thunder: This is the image of Exceeding Smallness Thus the superior person In his conduct is exceedingly respectful, In his mourning is exceedingly sorrowful, in this expenditures is exceedingly temperate.");
        if(xiaoGuo.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveSameDivination;
        }
    }

    public String hasTheSameNumber(XiaoGuo xiaoGuo){
        String hasTheSameNumber = "Xiao Guo has the same number and it is " + xiaoGuo.getNumber();
        String doesNotHaveTheSameNumber = "Xiao Guo does not have the same number";
        int expectedNumber = 62;
        if(xiaoGuo.getNumber() == expectedNumber){
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }

}
