package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Yu  extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Yu() {
        image = new GImage("IChingImages/IChingClasses.Yu.png");
        element = "Thunder, Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Enthusiasm" );
        qualities.put("2", "Stirring up");
        qualities.put("3", "Insipiring");
        qualities.put("4", "Broadcasting");
        qualities.put("5", "Undertaking");
        qualities.put("6", "Preparing for");
        qualities.put("7", "Planning ahead");
        qualities.put("8", "Enjoyment");
        qualities.put("9", "Delight");
        divination = getDivinationText();
        number = 16;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Yu - Enthusiasm";
        String keywords = "Stirring up, Insipiring, Broadcasting, Undertaking, Preparing for, planning ahead, enjoyment, delight";
        String theJudgement = "Enthusiasm, it is beneficial to establish feudal lords and set armies in motion";
        String theJudgementDescription = "This hexagram has two meanings. On the one hand, it means to make preparations for future action. On the other hand, it means to stir up enthusiasm and delight in one's self and in other people. Taken together, the message is that if you make proper arrangements early on and provide for things in advance, you can feel free to relax and enjoy the fruits of your labors later without concern or guilt. You may justifiable take delight in what you have put in place and set in motion. Conversely, if you are trapped in inertia, indolence, or deluded satisfaction, you cannot make plans for the future. To take precautions and to work for the future, a person needs to be stimulated and motivated. That is why preparation is the flip side of enthusiasm. The words of the hexagram judgment reflect this duality: establishing feudal lords is a matter of prior preparation. One creates feudatories because one will need their support someday. On the other hand, to set armies in motion is a matter of inspiring the troops to action after one has made the proper preparations. In like fashion, you should anticipate your needs and gather people around you who can help you achieve your aims. The traditional metaphor of enthusiasm in the Book of Changes is music. The metaphor of music simultaneously captures the notions of delight, harmony, inspiration, and sympathy between people. The vibration of one string brings symphatetic vibrations from others. Sounds resonate with other sounds, harmonies blend, fundamentals produce overtones. Moreover music exemplifies how to stir people up and get them to act as one. Music is the great unifier. Catchy melodies and vigorous drumbeats cause people to sing and move their bodies in unison. Music joins the spirits of many individuals into one great spirit, rythms transport bodies and souls towards a single goal. If you want to inspire others, you must first have symathy with them. You must be like a string on a musical instrument that resonates with other strings. To motivate people you must adjust and adapt yourself so that you are in harmony with their needs and their values. Great leaders and teachers inspire because they understand and are in harmony with the tenor of their times. They are able to lead people because they follow the people's spirit and act in accord with it. Nothing significant and lasting can be acomplished and no laws can be effectively enforced, unless it is in accord with popular sentiment. Second, you can inspire no one if you are not yourself inspired. If you have confidence and enthusiasm, you can do a great deal, without them you can do very little. To bring people together for a common purpose, you must feel reused and a motivatated to do something important. Following the calling of your heart will create a natural and spontanous response in others. Do not be afraid to be passionate about what is truly important to you. Your inspiration will draw able helpers to your side. This is how great masses of people are unified and how they achieve victory. Third, you must combine your passiopn with preparation and hard work. Thomas Edison once said that genious is 1 percent inspiration and 99 percent perspiration. The same is true of stirring people up to something great. It is not enough simply to arouse passions momentarily. The groundwork for inspiration must be carefully laid. That is why music is so apt a symbol of this hexagram. Great musicians inspire and ennoble us, but their ability to do so is the result of years of hard work and practice at their craft. Music is the perfect example of the preparation that results in a seemingly spontaneous inspiration and connection with a higher power. As it is in music, so it is in life, creativity and improvisation are made possible by prior development, instinct is the child of practice, spontaneity is the residue of design.";
        String theImage = "Thunder rises out of the earth, this is the image of enthusiasm, thus the kind of old made music, to rouse the spirits and inspire virtue, they offered it in splendor to worship the supreme diety, so that they might be worthy of their illstrious ancestors";
        divination.put("Title", title);
        divination.put("Keywords", keywords);
        divination.put("The Judgement", theJudgement);
        divination.put("Judgement Description", theJudgementDescription);
        divination.put("The Image", theImage);
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

    public void create() {
        new Yu();
    }
}
