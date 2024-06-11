package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Meng extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Meng() {
        image = new GImage("../IChingImages/UpToSixtyFour/4.Meng.jpg");
        element = "Mountain, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Innocence");
        qualities.put("2", "Ignorance");
        qualities.put("4", "Immaturity");
        qualities.put("5", "Youthful folly");
        qualities.put("6", "Wisdom not yet revealed");
        qualities.put("7", "The young shoot");
        qualities.put("8", "Beginner’s luck");
        divination = getDivinationText();
        number = 4;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Meng";
        String keywords = "Nourishing others, being nourished, ";
        String theJudgement = "Youthful Inexperience. Success. It is not who seek the ignorant youth. The ignorant youth seeks me. It is beneficial to persevere.";
        String theJudgementDescription = "IChingClasses.Meng describes a situation in which you have limited experience and do not know how to deal with the sittuation before you. Whether you realize it or not, you need to seek help. But instruction is useless unless the pupil understands the need for instruction and is genuinely willing to learn. That is why the text says that the teacher does not seek the youth, the youth must seek the teacher. Conversely, if you have been approached for help, remember that you cannot teach a person who is not yet ready to listen and learn. Do not be ashamed to admit that the complications in the situation are beyond your ken and that you do not know all the answers. Rather, try to see this as an opportunity to expand your vision and experience. Open your mind and put aside preconceptions and prejudices. Remember that your goal is to learn, to to show off what you already know. Combine eagerness to learn with modesty and humility. In this way you will maximize the benefits of your education. If you express a desire to learn and seek out people you trust and respect, the results will be positive. Once you have begun the course of instruction, neither you nor your teacher should give up until you have thoroughly mastered the information you need. Successful education requires not only the initial assimilation of material but also the development of good habits and consistency of effort. Hence the text says, \"it is beneficial to persevere\". Another traditional interpretation of IChingClasses.Meng is that you already know what you must do in the current situation, but you not like the answer. Such unwillingness to face reality is a form of close-mindness and hence in its own way an inability to learn from experience. Knowing wehat is the case and pretending that it is otherwise, or recognizing what has to be done and refusing to accept it is truly a manifestation of folly. If you know the answer to your question, there is no point in asking the Book of Changes for a different answer. Many commentators read the text literally: they suggest that you will eventually recive the hexagram IChingClasses.Meng if you ask the Book of Changes the same question repeatedly after getting an answer you do not like. Receiving IChingClasses.Meng is the books way of rebuking you for pestering it when it already given you an answer. This standard interpretation is fanciful but dubious since there is no evidence that IChingClasses.Meng is more likely to appear through random selection than is any other hexagram. A better interpretation of the text is more consistent with the hexagram's general theme: IChingClasses.Meng teaches that one cannot learn the truth until one is ready to receive the truth. Hence if you actively seek enlightment, you should not then ignore or dismiss it if the truth it reveals are unpleasant. To make progress in life is to grow up, to put aside youthful folly and replace illusion with clarity. You cannot live your life through wishful thinking.";
        String image = "A spring emerges from beneath the mountains. This is the image of Youthful Inexpereince. The superior acts with resulution and so cultivates his character.";
        divination.put("Title", title);
        divination.put("Keywords", keywords);
        divination.put("The Judgement", theJudgement);
        divination.put("Judgement Description", theJudgementDescription);
        divination.put("The Image", image);
        return divination;
    }

    public GImage getIChingImage() {
        return image;
    }

    public String getElementName() {
        return element;
    }

    public HashMap getElementQualities() {
        return qualities;
    }

    public String getFamilyMember() { return familyMember;}

    public HashMap getBodyPart() {
        return partOfBody;
    }

    public String getRelatedAnimal() {
        return animals;
    }

    public HashMap getSeasonAndWeather() {
        return seasonsAndWeather;
    }

    public HashMap getDivination() { return divination;}

    public int getNumber() { return number;}

    @Override
    public void create() {new Meng();}
}
