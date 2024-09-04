package IChingTests;

import IChingClasses.Xu;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class XuTests extends ConsoleProgram {

    public void run(){
        Xu xu = new Xu();

        String xuHasSameImage = hasSameImage(xu);
        println(xuHasSameImage);
        println("---------------------------------");
    }

    public String hasSameImage(Xu xu){
        String xuHasTheSameImagePath = "Xu has the same image ";
        String xuDoesNotHaveTheSameImagePath = "Xu does not have the same image";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/5.Xu.jpg";
        if(xu.getIChingImage().equals(expectedImagePath)) {
            return xuHasTheSameImagePath;
        } else {
            return xuDoesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameImageClassPath(Xu xu) {
        String xuHasTheSameImageClassName = "Xu has the same image class path: ";
        String xuDoesNotHaveTheSameImageClassName = "Xu does not have the same image class path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/5.Xu.jpg";
        if(xu.getImagePath().equals(expectedClassPath)) {
            return xuHasTheSameImageClassName;
        } else {
            return xuDoesNotHaveTheSameImageClassName;
        }
    }

    public String hasTheSameElementName(Xu xu) {
        String xuHastheSameElementName = "Xu has the same element name " + xu.getElementName();
        String xuDoesNotHaveTheSameElementName = "Xu does not have the same element name";
        String expectedElementName = "Water, Heaven";
        if(expectedElementName.equals(xu.getElementName())){
            return xuHastheSameElementName;
        } else {
            return xuDoesNotHaveTheSameElementName;
        }
    }

    public String hasSameElementQualities(Xu xu) {
        String hasTheSameElementQualities = "Xu has the same element qualities and they are" + xu.getElementQualities();
        String doesNotHaveTheSameElementQualities = "Xu has the same element qualities";
        HashMap expectedElementQualities = new HashMap<String, String>();
        expectedElementQualities.put("1", "Calculated waiting");
        expectedElementQualities.put("2", "Biding your time");
        expectedElementQualities.put("3", "Waiting for rain");
        expectedElementQualities.put("4", "Nourishment");
        expectedElementQualities.put("5", "Replenishment");
        if(xu.getElementQualities().equals(expectedElementQualities)) {
            return  hasTheSameElementQualities;
        } else {
            return doesNotHaveTheSameElementQualities;
        }
    }

    public String hasSameDivination(Xu xu) {
        String xuHasSameDivination = "Xu has the same divination: "+ xu.getDivination().get("Keywords");
        String xuDoesNotHaveTheSameDivination = "Xu does not have the same divination.";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Xu - Calculated waiting");
        expectedDivination.put("Keywords", "Calculated waiting, biding your time, waiting for rain, nourishment, replenishment");
        expectedDivination.put("The Judgement", "Waiting. Sincerity and faithfulness bring shining success. Perseverance brings good fortune. It is beneficial to cross the great river.");
        expectedDivination.put("Judgement Description", "Because of circumstances beyond control, you must wait patiently. You cannot take direct action at present. Nevertheless, you must have faith that things will work out for the best eventually. Just as we cannot force the rain to fall, we cannot force the propitious circumstances for action. Instead, we must let them come to us, just as the rain will eventually come and replenish and nourish the earth. There are two kinds of waiting: the apprehensive waiting of the weak and the calculated waiting of the strong. The weak person wait out of the fear and despair, becomes increasingly filled with anxiety and agitation and so finally plunges ahead at the wrong time with disastrous results. In contrast, the strong person waits because waiting is the best way to maximize the chances of eventual success. Such calculated waiting is a sign of strength, not weakness, of assurance, not resignation, of competence, not deficiency. While the weak person waits ever fearful that matters will spin out of control, the strong person waits knowing that success in inevitable, and all the elements for success will appear when the time is right. Calculated waiting is not merely a matter of hope for better days. It is a matter of faith, faith in the ultimate success of your endeavors, and equally important, faith in yourself. You must believe that you are going to succeed and that you deserve to. You must visualize success in your mind's eye. You must believe the narrative of your eventual triumph. Then your faith will unconsciously adapt to your actions to maximize your chances. Hence the text says, 'Sincerity and faithfulness bring shining success'.The power of faith provides allows a person to preserve in even the most difficult endeavors, symbolized by crossing the great river. Just because you are waiting does not mean that there is nothing to do. First and foremost, you must try to understand the situation objectively. Your faith must be nourished by realism. You will prevail only if you can develop the necessary inner strength and self-confidence to meet the conditions that actually exist, and to do this, you must be uncompromisingly honest with yourself. Only when you face the situation as it is without self-deception or illusion will you be able to see what holds you back and what you must do to prevail. At this point, the way forward will slowly emerge, the light of your inner truth will gradually illuminate the path to success. Make all the necessary preparations. Do not cut corners and do not take half measures. When and only when the time is right, you must go forward with tenacity. Along the way you will inevitably experience doubts about whether you have what it takes to succeed. Put them aside. Keep your ultimate goal ever before you. When the time has come to act, you must be resolute and preserving. Go out to meet your fate with determination, with faith and with courage. Then you will get what you seek.");
        expectedDivination.put("The Image","Clouds rise up to heaven, this is the image of waiting, thus the superior person eats and drinks in joy and repose.");
        if(xu.getDivination().equals(expectedDivination)) {
            return xuHasSameDivination;
        } else {
            return xuDoesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(Xu xu) {
        String hasSameNumber = "Xu has same number";
        String doesNotHaveSameNumber = "Xu does not have the same number";
        int expectedNumber = 5;
        if(xu.getNumber() == expectedNumber) {
            return hasSameNumber;
        } else {
            return doesNotHaveSameNumber;
        }
    }
}
