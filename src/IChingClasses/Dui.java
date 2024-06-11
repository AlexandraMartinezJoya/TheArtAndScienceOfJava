package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Dui extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Dui(){
        image = new GImage("../IChingImages/UpToSixtyFour/58.Dui.jpg");
        element = "Lake, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Joy" );
        qualities.put("2", "Pleasure");
        qualities.put("3", "Satisfaction");
        qualities.put("4", "Openness");
        familyMember = "Youngest Daughter";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "Mouth");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Late Autumn");
        seasonsAndWeather.put("2", "Rain");
        divination = getDivinationText();
        number = 58;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Dui";
        String keywords = "The lake, Giving and receiving, communication, sharing, integrity, inner stability, inner peace";
        String theJudgement = "Joy, Success. It is beneficial to persevere";
        String theJudgementDescription = "Joy comes from inner peace and inner balance. It requires integrity and strength within and gentleness and acceptance without. Put differently, joy is a matter of character on the one hand and communication on the other. People lack joy because they lack cannot freely communicate with others. Then they are cut off from the pleasures of the shared experience. In the Book of Changes, joy symbolized by two lakes that are joined together. Their waters flow freely into each other and thus replenish each other. Yet although the two lakes freely share with each other, each retains its individual integrity. Joy emerges naturally from freely communicating and sharing experiences with others. It is infectious. If you are cheerful and happy, you will make others feel cheerful and happy as well. And when people are optimistic and outgoing, they share their thoughts and experiences more easily. Reach out to other people in a spirit of goodwill. Let people know that you are interested in what they have to say. Work to create a positive, accepting atmosphere. If you are warm and friendly, people will respond natually and positively. They will be willing to help you and give you the benefit of their perspective. If you try to make people joyous through devious means, or through manipulating them, you may have temporary success. But without the creation of trust and mutual respect, joy cannot last. When people take joy in each other's company, they are willing to make sacrificses for each other. Difficulties seem to melt away. Troubles seem smaller and less threatening than before. When people feel supported and encouraged, they are willing to take on even the most difficult tasks. Thus, joy has enormous power. It brings people together, moves them to do great things and bestows success on their efforts. Joy is not the same as pleasure. The pursuit of pleasure comes from an inward lack, the experience of joy stems from an inner plentitude. Please soon fades and demands repeated stimulation to be re-created and sustained. Joy required nothing outside of itself. Try to run after joy and you will not get it. Joy must come from within. It is the product of inner peace and emotional stability. A person who is not balanced inwardly will not find that balance externally. You cannot depend on other people to make you happy, or rely on things to fulfill you. That is simply a recipie for frustration. Whenever your happiness depends on the acumulation of things or the approval of other people, you have no real security. You are at the mercy of forces beyond your control. You will continually be anxious and fearful that what you have will be taken away from you or that you will never get what you think you need to be complete. Instead, take a different approach. If you want to take joy in the outside world, you must first learn to find some joy in your heart. Make peace with yourself. Stop chasing after things in order to prove that you are worthy of love. Instead, devote yourself to something that nourishes and replenishes you.Stop looking outside yourself for the key to your happiness or for the confirmation of your self-worth. You have everything within yourself that you need in order to be happy. Accept life for what it is and accept yourself for who you are. Have a little faith in yourself and your abilities. Learn to share with other people and have fun doing so. Then you wont have to look outside yourself for joy. You will find that is already within you.";
        String theImage = "Lake attached to each other. This is the image of joy Thus the superior person join with friends for discussion and practice.";
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

    public String getFamilyMember() {
        return familyMember;
    }

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

    public int getNumber(){return number;}

    @Override
    public void create() { new Dui();}
}
