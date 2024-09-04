package IChingTests;

import IChingClasses.Meng;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class MengTests extends ConsoleProgram {

    public void run(){
        Meng meng = new Meng();

        String mengHasTheSameImage = hasSameImage(meng);
        println(mengHasTheSameImage);

    }

    public String hasSameImage(Meng meng){
        String mengHasTheSameImage = "Meng has the same image";
        String mengDoesNotHaveTheSameImage = "Meng does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/4.Meng.jpg");
        if(meng.getIChingImage().equals(expectedImage)){
            return mengHasTheSameImage;
        } else {
            return mengDoesNotHaveTheSameImage;
        }
    }

    public String hasTheSameImageClassPath(Meng meng){
        String mengHasSameImageClassPath = "Meng has the same image class path";
        String mengDoesNotHaveTheSameImageClassPath = "Meng does not have the same image class path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/4.Meng.jpg";
        if(meng.getImagePath().equals(expectedClassPath)) {
            return mengHasSameImageClassPath;
        } else {
            return mengDoesNotHaveTheSameImageClassPath;
        }
    }

    public String hasTheSameElementName(Meng meng) {
        String mengHasTheSameElementName = "Meng has the same element name and it is " + meng.getElementName();
        String mengDoesNotHaveTheSameElementName = "Meng does not have the same element name";
        String expectedElementName = "Mountain, Thunder";
        if(meng.getElementName().equals(expectedElementName)) {
            return mengHasTheSameElementName;
        } else {
            return mengDoesNotHaveTheSameElementName;
        }
    }

    public String hasTheSameElementQualities(Meng meng) {
        String mengHasTheSameElementQualities = "Meng has the same element qualities and they are " + meng.getElementQualities();
        String mengDoesNotHaveTheSameElementQualities = "Meng does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Innocence");
        expectedQualities.put("2", "Ignorance");
        expectedQualities.put("4", "Immaturity");
        expectedQualities.put("5", "Youthful folly");
        expectedQualities.put("6", "Wisdom not yet revealed");
        expectedQualities.put("7", "The young shoot");
        expectedQualities.put("8", "Beginner’s luck");
        if(meng.getElementQualities().equals(expectedQualities)){
            return mengHasTheSameElementQualities;
        } else {
            return mengDoesNotHaveTheSameElementQualities;
        }
    }

    public String hasSameDivination(Meng meng){
        String mengHasTheSameDivination= "Meng has the same divination and it is "+ meng.getDivination().get("Keywords");
        String mengDoesNotHaveTheSameDivination = "Meng does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Meng");
        expectedDivination.put("Keywords", "Nourishing others, being nourished");
        expectedDivination.put("The Judgement", "Youthful Inexperience. Success. It is not who seek the ignorant youth. The ignorant youth seeks me. It is beneficial to persevere.");
        expectedDivination.put("Judgement Description", "Meng describes a situation in which you have limited experience and do not know how to deal with the situation before you. Whether you realize it or not, you need to seek help. But instruction is useless unless the pupil understands the need for instruction and is genuinely willing to learn. That is why the text says that the teacher does not seek the youth, the youth must seek the teacher. Conversely, if you have been approached for help, remember that you cannot teach a person who is not yet ready to listen and learn. Do not be ashamed to admit that the complications in the situation are beyond your ken and that you do not know all the answers. Rather, try to see this as an opportunity to expand your vision and experience. Open your mind and put aside preconceptions and prejudices. Remember that your goal is to learn, to to show off what you already know. Combine eagerness to learn with modesty and humility. In this way you will maximize the benefits of your education. If you express a desire to learn and seek out people you trust and respect, the results will be positive. Once you have begun the course of instruction, neither you nor your teacher should give up until you have thoroughly mastered the information you need. Successful education requires not only the initial assimilation of material but also the development of good habits and consistency of effort. Hence the text says, 'it is beneficial to persevere'. Another traditional interpretation of Meng is that you already know what you must do in the current situation, but you not like the answer. Such unwillingness to face reality is a form of close-mindness and hence in its own way an inability to learn from experience. Knowing what is the case and pretending that it is otherwise, or recognizing what has to be done and refusing to accept it is truly a manifestation of folly. If you know the answer to your question, there is no point in asking the Book of Changes for a different answer. Many commentators read the text literally: they suggest that you will eventually receive the hexagram Meng if you ask the Book of Changes the same question repeatedly after getting an answer you do not like. Receiving Meng is the books way of rebuking you for pestering it when it already given you an answer. This standard interpretation is fanciful but dubious since there is no evidence that Meng is more likely to appear through random selection than is any other hexagram. A better interpretation of the text is more consistent with the hexagram's general theme: Meng teaches that one cannot learn the truth until one is ready to receive the truth. Hence if you actively seek enlightenment, you should not then ignore or dismiss it if the truth it reveals are unpleasant. To make progress in life is to grow up, to put aside youthful folly and replace illusion with clarity. You cannot live your life through wishful thinking.");
        expectedDivination.put("The Image", "A spring emerges from beneath the mountains. This is the image of Youthful Inexperience. The superior acts with resolution and so cultivates his character.");
        if(meng.getDivination().equals(expectedDivination)){
            return mengHasTheSameDivination;
        } else {
            return mengDoesNotHaveTheSameDivination;
        }
    }

    public String hasSameNumber(Meng meng) {
        String mengHasTheSameNumber = "Meng has the same number and it is: "+ meng.getNumber();
        String mengDoesNotHaveTheSameNumber = "Meng does not have the same number";
        int expectedNumber = 4;
        if(meng.getNumber() == expectedNumber) {
            return mengHasTheSameNumber;
        } else {
            return mengDoesNotHaveTheSameNumber;
        }
    }
}
