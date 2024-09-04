import IChingClasses.XiaoXu;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class XiaoXuTests extends ConsoleProgram {

    public void run() {
        XiaoXu xiaoXu = new XiaoXu();

        String xiaoXuHasSameImage = xiaoXuHasSameImage(xiaoXu);
        println(xiaoXuHasSameImage);
    }

    public  String xiaoXuHasSameImage(XiaoXu xiaoXu){
        String xiaoXuHasTheSameImage = "Xiao xu has the same image";
        String xiaoXuDoesNotHaveTheSameImage = "Xiao xu does not have the same image";
        GImage expectedXiaoXuImage = new GImage("../IChingImages/UpToSixtyFour/9.XiaoXu.jpg");
        if(xiaoXu.getIChingImage().equals(expectedXiaoXuImage)) {
            return xiaoXuHasTheSameImage;
        } else {
            return xiaoXuDoesNotHaveTheSameImage;
        }
    }

    public String xiaoXuHasTheSameImagePath(XiaoXu xiaoXu) {
        String xiaoXuHasTheSameImagePath = "Xiao xu has the same image path";
        String xiaoXuDoesNotHaveTheSameImagePath = "Xiao xu does not have the same image path";
        String expectedXiaoXuImagePath = "../IChingImages/UpToSixtyFour/9.XiaoXu.jpg";
        if(xiaoXu.getImagePath().equals(expectedXiaoXuImagePath)) {
            return xiaoXuHasTheSameImagePath;
        } else {
            return xiaoXuDoesNotHaveTheSameImagePath;
        }
    }

    public String xiaoXuHasSameElementName(XiaoXu xiaoXu) {
        String xiaoXuHasSameElementName = "Xiao xu has the same element name and it is " + xiaoXu.getElementName();
        String xiaoXuDoesNotHaveTheSameElementName = "Xiao xu does not have the same element name";
        String expectedXiaoXuElementName = "../IChingImages/UpToSixtyFour/9.XiaoXu.jpg";
        if(xiaoXu.getImagePath().equals(expectedXiaoXuElementName)) {
            return xiaoXuHasSameElementName;
        } else {
            return xiaoXuDoesNotHaveTheSameElementName;
        }
    }

    public String xiaoXuHasSameQualities(XiaoXu xiaoXu) {
        String xiaoXuHasSameElementQualities = "Xiao xu has the same element qualities and they are "+xiaoXu.getElementQualities();
        String xiaoXuDoesNotHaveTheSameElementQualities = "Xiao xu does not have the same element qualities";
        HashMap expectedElementQualities = new HashMap<>();
        expectedElementQualities.put("1", "The taming of the power of the small" );
        expectedElementQualities.put("2", "Restraint of the powerful by the weak");
        expectedElementQualities.put("3", "Small framing");
        expectedElementQualities.put("4", "Taking care of the little things");
        expectedElementQualities.put("5", "Accumulation of small advantages");
        expectedElementQualities.put("6", "Using gentleness and friendly persuasion");
        expectedElementQualities.put("7", "Temporarily held back");
        expectedElementQualities.put("8", "But the rain will come");
        expectedElementQualities.put("9", "New paradise");
        if(xiaoXu.getElementQualities().equals(expectedElementQualities)){
            return xiaoXuHasSameElementQualities;
        } else {
            return xiaoXuDoesNotHaveTheSameElementQualities;
        }
    }

    public String xiaoXuHasTheSameDivination(XiaoXu xiaoXu) {
        String xiaoXuHasTheSameDivination = "Xiao xu has the same divination and it is: "+xiaoXu.getDivination().get("Keywords");
        String xiaoXuDoesNotHaveTheSameDivination = "Xiao xu does not have the same divination ";
        HashMap expectedXiaoXuDivination = new HashMap<>();
        expectedXiaoXuDivination.put("Title","XiaoXu");
        expectedXiaoXuDivination.put("Keywords","The taming of the power of the small, restraint of the powerful by the weak, Small framing, taking care of the little things, accumulation of small advantages, using gentleness and friendly persuasion, temporarily held back, but the rain will come, new paradise");
        expectedXiaoXuDivination.put("The Judgement","Small accumulation, success, dense clouds, no rain from the outskirts of our western region");
        expectedXiaoXuDivination.put("Judgement Description","Rain symbolizes nourishment, release of tension, and success. Dense clouds offer the promise of eventual rain. However, the rain has not yet fallen, hence there is nothing to do but wait for events to play themselves out. The situation is not unfavorable. There is promise of success in the long run. But circumstances currently prevent you from doing much to bring your plans to fruition. Your advance is blocked by factors that you are not yet fully aware of. Although this may be frustrating, you should maintain a realistic attitude. Even though the barriers to progress seem minor, and frustratingly trivial, do not underestimate them. Exercise caution. There is considerably potential in the situation, but your position is not yet secure. Do not try to force the issue. Instead, do all that you can do now to prepare in small ways for the eventual breakthrough. Pay careful attention to everyday questions. Be meticulous and painstaking in your efforts. Plan ahead for future. Gather information and discuss the situation with others. Accumulate whatever small advantages you can. Do not threaten or coerce others or order them around to get your way. Instead, try to influence people through gentle persuasion and friendly behavior. In this way you can act as a partial restraint on their behavior if they are contemplating something unwise. The key is to be firm and determined on the inside and adaptable and gentle on the outside. Have faith that eventually the obstacles that are holding you back will give way, and the rain will fall.");
        expectedXiaoXuDivination.put("The Image","The wind blows across the sky, this is the image of small accumulation. thus the superior person cultivates his graceful virtues.");
        if(xiaoXu.getDivination().equals(expectedXiaoXuDivination)) {
            return xiaoXuHasTheSameDivination;
        } else {
            return xiaoXuDoesNotHaveTheSameDivination;
        }
    }

    public String xiaoXuHasTheSameNumber(XiaoXu xiaoXu) {
        String xiaoXuHasTheSameNumber = "Xiao xu has the same expected number of: " + xiaoXu.getNumber();
        String xiaoXuDoesNotHaveTheSameNumber = "Xiao xu does not have the same number";
        int expectedNumber = 9;
        if(xiaoXu.getNumber() == expectedNumber) {
            return xiaoXuHasTheSameNumber;
        } else {
            return xiaoXuDoesNotHaveTheSameNumber;
        }
    }

}
