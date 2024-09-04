package IChingTests;

import IChingClasses.QianModesty;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class QianModestyTests extends ConsoleProgram {

    public void run() {
        QianModesty qianModesty = new QianModesty();
        String hasTheSameImage = hasTheSameImage(qianModesty);
    }

    public String hasTheSameImage(QianModesty qianModesty){
        String hasTheSameImage = "Qian modesty has the same image";
        String doesNotHaveTheSameImage = "Qian modesty does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/15.QianModesty.jpg");
        if(qianModesty.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImagePath(QianModesty qianModesty) {
        String hasTheSameImagePath = "Qian modesty has the same expected image path";
        String doesNotHaveTheSameImagePath = "Qian modesty does not have the expected image path";
        String expectedPath = "../IChingImages/UpToSixtyFour/15.QianModesty.jpg";
        if(qianModesty.getImagePath().equals(expectedPath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(QianModesty qianModesty) {
        String hasTheSameElementName = "Qian modesty has the same element name and it is " + qianModesty.getElementName();
        String doesNotHaveSameElementName = "Qian modesty does not have the same element name";
        String expectedElementName = "Earth, Mountain";
        if(qianModesty.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveSameElementName;
        }
    }

    public String hasTheSameQualities(QianModesty qianModesty) {
        String hasTheSameElementQualities = "Quian modesty has the same expected qualities and are" + qianModesty.getElementQualities();
        String doesNotHaveTheSameElementQualities = "Qian modesty does not have the same expected qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Humility" );
        expectedQualities.put("2", "Humbleness");
        expectedQualities.put("3", "Moderation");
        expectedQualities.put("4", "Temperance");
        expectedQualities.put("5", "Maintaining a balanced attitude");
        expectedQualities.put("6", "Fulfilling ones duties");
        expectedQualities.put("7", "Carrying things through to completion");
        if(qianModesty.getElementQualities().equals(expectedQualities)) {
            return hasTheSameElementQualities;
        } else {
            return doesNotHaveTheSameElementQualities;
        }
    }

    public String hasSameDivination(QianModesty qianModesty) {
        String hasSameDivination = "Qian modesty has the same divination with the keywords " + qianModesty.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Qian modesty does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "QianModesty");
        expectedDivination.put("Keywords", "Humility, Modesty, Moderation, Temperance, Maintaining a balanced attitude, Fulfilling ones duties, Carrying things through to completion");
        expectedDivination.put("The Judgement", "Return. Success. Going out and coming in without harm. Friends come. No blame. It is beneficial to have somewhere to go.");
        expectedDivination.put("Judgement Description", "According to the book of changes, modesty is one of the most important virtues. It is not innate but rather is the product of long, continuous and conscious self-development and self-cultivation. It differs from Christian ideal of meekness iun important respects. Modesty does not mean submissiveness or passivity. A modest person may be quite active in the world, working steadily and unobtrusively, making commitments and living up to them. The text says that the modest person carries things through their conclusion. Why is this attitude modest? It is because modest people do not think they are more important than the work that they perform or the commitment that they have made to others. Therefore, they are consistent and reliable. Modest people do not regard anything that they must do as beneath them. Therefore, their pride does not get in the way of their success. They put their work, their obligations, and their commitments before their egos. That is why they are able to prevail in the long run. Thus, modesty does not imply inaction. Rather, it means acting positively, cooperatively, and harmoniously. It means respecting other people and treating them as equals. By contrast, proud people think they are better than everyone else or act as if they were. Often their pride hides a deeper insecurity. But truly modest people know who they are and therefore do not need to engage in pretension in order to impress others. Conversely, they do not think of others as beneath them, they treat other people with the inherent dignity that all people deserve. Thus modesty means being intolerant and accepting rather than haughty or judgemental. The virtue of modesty is connected to the principles of yin and yang underlying the philosophy of the book of changes. Whatever is extended too far will eventually be contracted and diminished, conversely, whatever is modest will eventually be expanded and increased. People envy and fear what is to great to powerful and seek to undermine it, but they do not feel threatened by what is lowly and humble and so they treat it with kindness and affection. By adopting the virtues of humility and modesty you make it easier for people to accept you and cooperate with you to your mutual advantage. And by not pushing things too far you avoid pride and overreaching that might bring about a fall.");
        expectedDivination.put("The Image", "In the middle of the earth there is a mountain, this is the image of modesty, thus the superior person lessens what is too much, and increases what is too little. he weighs things and makes their distribution equal.");
        if(qianModesty.getDivination().equals(expectedDivination)) {
            return hasSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(QianModesty qianModesty) {
        String hasTheSameNumber = "Qian modesty has the same number " + qianModesty.getNumber();
        String doesNotHaveSameNumber = "Qian modesty does not have the same number";
        int expectedNumber = 15;
        if(qianModesty.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveSameNumber;
        }
    }
}

