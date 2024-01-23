package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class BiUnion extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public BiUnion() {
        image = new GImage("IChingImages/IChingClasses.BiUnion.png");
        element = "Water, Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Joining with others" );
        qualities.put("2", "Joining in");
        qualities.put("3", "Rallying around a leader");
        divination = getDivinationText();
        number = 8;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Bi - Union";
        String keywords = " Union. Good fortune. Look deep down inside yourself and divine. Whether you have greatness, perseverence, and constancy, for there will be no blame, those who lack peace gradually come from all sides. Those who arrive too late meet with misfortune.";
        String theJudgement = "Obstruction. The southwest is beneficial. The northeast is not. It is beneficial to see a great person. Perseverance beings good fortune.";
        String theJudgementDescription = "The theme of Bi is unity with other people, and one's relationships to individuals and groups. Successful unions can help all of their members grow as individuals and prosper. But they also require that people be willing to cooperate and work for each other's good rather than for their own selfish interests. People must also believe that they have something in common if the union is to succeed. You should not join a group if you do not feel connected and committed to others and do not share their values and belifs. Joining in because you can think of nothing better to do or because other people are doing so is a recipie for eventual estragement, disillusionment, and unhappiness. But if the relationship is right, joining in will be good for your own growth and self-development. Your contributions to the group will be recognized, and all of the members will mutually support eachother. Unity is more than coming together, it also requires holding perople together over the long run, and dealing with the stresses and strains, the difficulties and disagreements that inevitably arise in the group. Holding people together required leadership - a central person or figure whom others depend on and around whom people can unite. Being the center of a group carries great responsibilities. It requires that you have magnanimity, vision, inner strength, perservereance, and constancy. If you are called upon to take the responsibility of forming a group or keeping it toghether, the text advises that you look deep inside yourself to see whether you have these important qualities. If you take up a leadership role without a genuine sense of commitment or without a sense of being truly called to the task, you may only create confusion and chaos and you will stand in the way of others who could forge a successful union. When a group forms around a common project, ideal, or value, it naturally attracts other who want to share in the vitality and happiness of a sucessful union. As the text says, people who are at first hesitant to make a commitment gradually take heart and join in from all sides. The power of a healthy union is that it can inspire others and ive them something to belive in when they are full of confusion or self-doubt. If you are contemplating joining a group that you think is right for you, do not take long. People form strong bonds and alliances through their shared experiences in a group. If you join in too late, those connections will already be in place and you will have missed being a part of the formative influences that give a group it's identity. You may feel like an outsider, and you may find it difficult or even impossible to fully intergrate into the group and feel fully a part of it.";
        String theImage = "On the earth, water. This is the image of Union, thus the kings of old establishment myriad feudal states to foster close relations with the feudal lords.";
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
        new BiUnion();
    }
}
