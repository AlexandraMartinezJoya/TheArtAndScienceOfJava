import IChingClasses.BiUnion;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class BiUnionTests extends ConsoleProgram {

    public void run() {
        BiUnion biUnion = new BiUnion();
        String isBiUnionImageTheSame = isBiUnionImageTheSame(biUnion);
        println(biUnion);
    }

    public String isBiUnionImageTheSame(BiUnion biUnion) {
        String isBiUnionTheSame = "Bi union image is same as expected";
        String biUnionIsNotTheSameAsExpected = "Bi union is not the same as expected";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/8.BiUnion.jpg");
        if(biUnion.getIChingImage().equals(expectedImage)) {
            return isBiUnionTheSame;
        } else {
            return biUnionIsNotTheSameAsExpected;
        }
    }

    public String isBiUnionClassPathTheSame(BiUnion biUnion) {
        String isBiUnionClassPathTheSame = "Bi union has the same class path";
        String biUnionDoesNotHaveTheSameClassPath = "Bi union does not have the same class path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/8.BiUnion.jpg";
        if(biUnion.getImagePath().equals(expectedClassPath)) {
            return isBiUnionClassPathTheSame;
        }else {
            return biUnionDoesNotHaveTheSameClassPath;
        }
    }

    public String hasBiUnionSameElements(BiUnion biUnion) {
        String hasBiUnionTheSameElement = "Bi union has the same elements: " + biUnion.getElementName();
        String biUnionDoesNotHaveTheSameElement = "Bi union does not have the same element";
        String expectedElementName = "Water, Earth";
        if(expectedElementName.equals(biUnion.getElementName())) {
            return hasBiUnionTheSameElement;
        } else {
            return biUnionDoesNotHaveTheSameElement;
        }
    }

    public String biUnionHasTheSameQualities(BiUnion biUnion){
        String biUnionHasTheSameElementQualities = "Bi union has the same element qualities and are " + biUnion.getElementQualities();
        String biUnionDoesNotHaveTheSameElementQualities = "Bi union does not have the same element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Joining with others" );
        expectedQualities.put("2", "Joining in");
        expectedQualities.put("3", "Rallying around a leader");
        if(biUnion.getElementQualities().equals(expectedQualities)){
            return biUnionHasTheSameElementQualities;
        } else {
            return biUnionDoesNotHaveTheSameElementQualities;
        }
    }

    public String biUnionHasTheSameDivination (BiUnion biUnion) {
        String biUnionHasSameDivination = "Bi Union has the same element divination with the keywords :" + biUnion.getDivination().get("Keywords");
        String biUnionDoesNotHaveTheSameDivination = "Bi union does not have the same element qualities";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Bi - Union");
        expectedDivination.put("Keywords","Union. Good fortune. Look deep down inside yourself and divine. Whether you have greatness, perseverance, and constancy, for there will be no blame, those who lack peace gradually come from all sides. Those who arrive too late meet with misfortune.");
        expectedDivination.put("The Judgement","Obstruction. The southwest is beneficial. The northeast is not. It is beneficial to see a great person. Perseverance brings good fortune.");
        expectedDivination.put("Judgement Description","The theme of Bi is unity with other people, and one's relationships to individuals and groups. Successful unions can help all of their members grow as individuals and prosper. But they also require that people be willing to cooperate and work for each other's good rather than for their own selfish interests. People must also believe that they have something in common if the union is to succeed. You should not join a group if you do not feel connected and committed to others and do not share their values and beliefs. Joining in because you can think of nothing better to do or because other people are doing so is a recipe for eventual estrangement, disillusionment, and unhappiness. But if the relationship is right, joining in will be good for your own growth and self-development. Your contributions to the group will be recognized, and all of the members will mutually support each other. Unity is more than coming together, it also requires holding people together over the long run, and dealing with the stresses and strains, the difficulties and disagreements that inevitably arise in the group. Holding people together required leadership - a central person or figure whom others depend on and around whom people can unite. Being the center of a group carries great responsibilities. It requires that you have magnanimity, vision, inner strength, perseverance, and constancy. If you are called upon to take the responsibility of forming a group or keeping it together, the text advises that you look deep inside yourself to see whether you have these important qualities. If you take up a leadership role without a genuine sense of commitment or without a sense of being truly called to the task, you may only create confusion and chaos and you will stand in the way of others who could forge a successful union. When a group forms around a common project, ideal, or value, it naturally attracts other who want to share in the vitality and happiness of a successful union. As the text says, people who are at first hesitant to make a commitment gradually take heart and join in from all sides. The power of a healthy union is that it can inspire others and ive them something to believe in when they are full of confusion or self-doubt. If you are contemplating joining a group that you think is right for you, do not take long. People form strong bonds and alliances through their shared experiences in a group. If you join in too late, those connections will already be in place and you will have missed being a part of the formative influences that give a group it's identity. You may feel like an outsider, and you may find it difficult or even impossible to fully integrate into the group and feel fully a part of it.");
        expectedDivination.put("The Image","On the earth, water. This is the image of Union, thus the kings of old establishment myriad feudal states to foster close relations with the feudal lords.");
        if(biUnion.getDivination().equals(expectedDivination)){
            return biUnionHasSameDivination;
        } else {
            return biUnionDoesNotHaveTheSameDivination;
        }
    }

    public String biUnionHasTheSameNumber(BiUnion biUnion){
        String biUnionHasTheSameNumber = "Bi union has the same number: " + biUnion.getNumber();
        String biUnionDoesNotHaveTheSameNumber = "Bi union does not have the same qualities";
        int expectedNumber = 8;
        if(biUnion.getNumber() == expectedNumber) {
            return biUnionHasTheSameNumber;
        } else {
            return biUnionDoesNotHaveTheSameNumber;
        }
    }
}
