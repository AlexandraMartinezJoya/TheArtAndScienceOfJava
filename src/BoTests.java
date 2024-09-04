import IChingClasses.Bo;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class BoTests extends ConsoleProgram {

    public void run() {
        Bo bo = new Bo();
        String hasSameImage = hasSameImage(bo);
        println(hasSameImage);
    }

    public String hasSameImage(Bo bo) {
        String hasSameImage = "Bo has the same image";
        String doesNotHaveTheSameImage = "Bo does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/23.Bo.jpg");
        if(bo.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(Bo bo) {
        String hasSameImagePath = "Bo has the same image path";
        String doesNotHaveTheSameImagePath = "Bo does not have the same image path";
        String expectedImagePath =  "../IChingImages/UpToSixtyFour/23.Bo.jpg";
        if(bo.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(Bo bo) {
        String hasTheSameElementName =  "Bo has the same element name and it is " + bo.getElementName();
        String doesNotHaveTheSameElementName = "Bo does not have the same element name";
        String expectedElementName = "Mountain, Earth";
        if(bo.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameQualities(Bo bo) {
        String hasTheSameQualities = "Bo has the same expected qualities and they are " + bo.getElementQualities();
        String doesNotHaveTheSameQualities = "Bo does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Deterioration" );
        expectedQualities.put("2", "Stripping away");
        expectedQualities.put("3", "Collapse");
        expectedQualities.put("4", "Falling apart");
        if(bo.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(Bo bo) {
        String hasTheSameDivination = "Bo has the same divination with the keywords " + bo.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Bo does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Bo - Splitting Apart");
        expectedDivination.put("Keywords", "Deterioration, Stripping away, Collapse, Falling apart");
        expectedDivination.put("The Judgement", "Splitting apart. It is not beneficial to have somewhere to go. Stay put");
        expectedDivination.put("Judgement Description", "Things are falling apart. The situation around you is deteriorating. Inferior people are on the rise and they are displacing people of value and merit. Relationships that once could be taken for granted have frayed and dissolved. Old ways of doing things are disintegrating and nothing has yet taken their place. Because the time is not propitious, there is no advantage in trying to undertake anything now. The deterioration that you face may result from changes in outer condition over which you have no control. In that case, you should not blame yourself for the fact that everything changes. Alternatively, the problem may be that elements of your life now seem to have outlived their usefulness. Old habits no longer serve your interests. Old assumptions no longer make sense. Things that you once took for granted no longer seem solid and dependable. This means you too are undergoing change. You are experiencing the end of an old cycle without the comforting assurance of what is yet to come. In either case, it is useless to struggle against the time. Your position has been weakened by the changes around you. You are vulnerable, either due to your position, your emotions, or both. For this reason avoid confrontation. You will only make things worse. The structure of the hexagram Bo suggests that the proper course of conduct at this time. The lower trigram, Kun, symbolizes devotion and acceptance. The upper trigram, Gen, symbolizes stillness and patience. These are the virtues to adopt now. You must endure this period of deterioration and wait for better times to emerge. According to the law of change, they inevitably will. In the meantime, acquiesce the new condition without surrendering your principles. Keep quiet and maintain a low profile. Try to remain detached and untroubled to the extent that circumstances allow. Emotional reactions will only drain you and cause you to do foolish things. But if you can stay calm, collected, and above the fray, you can safeguard your position during this difficult time and you will be less vulnerable to manipulation. Change is coming both to your outer and to your inner experience. This change may be painful and upsetting, but you must let it run it's course. It is a law of nature. Whatever becomes great will eventually be lessened, and whatever becomes full will eventually be emptied. You cannot alter this general trend. Therefore, the wisest course is to withdraw and wait for time of renewal.");
        expectedDivination.put("The Image", "The mountain rests on earth, this is the image of splitting apart, in the same way, those above make their foundations secure, by generosity to those below.");
        if(bo.getDivination().equals(expectedDivination)){
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Bo bo) {
        String hasTheSameNumber = "Bo has the same number as expected "+ bo.getNumber();
        String doesNotHaveTheSameNumber = "Bo does not have the same number as expected";
        int expectedNumber = 23;
        if(bo.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }

}
