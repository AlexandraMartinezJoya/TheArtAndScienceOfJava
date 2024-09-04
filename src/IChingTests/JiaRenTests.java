package IChingTests;

import IChingClasses.JiaRen;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class JiaRenTests extends ConsoleProgram {

    public void run(){
        JiaRen jiaRen = new JiaRen();
        String hasSameImage = hasSameImage(jiaRen);
        println(hasSameImage);
    }

    public String hasSameImage (JiaRen jiaRen){
        String hasSameImage = "Jia Ren has the same expected image";
        String doesNotHaveTheSameExpectedImage = "Jia Ren does not have the same expected image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/37.JiaRen.jpg");
        if(jiaRen.getIChingImage().equals(expectedImage)){
            return hasSameImage;
        } else {
            return doesNotHaveTheSameExpectedImage;
        }
    }

    public String hasTheSameImagePath(JiaRen jiaRen){
        String hasTheSameImagePath = "Jia Ren has the expected image path";
        String doesNotHaveTheSameImagePath = "Jia Ren does not have the expected image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/37.JiaRen.jpg";
        if(jiaRen.getImagePath().equals(expectedImagePath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasTheSameElementName(JiaRen jiaRen) {
        String hasTheSameElementName = "Jia Ren has the same element name " + jiaRen.getElementName();
        String doesNotHaveTheSameElementName = "Jia Ren does not have the same element name";
        String expectedElementName = "Wind, Fire";
        if(jiaRen.getElementName().equals(expectedElementName)){
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasSameQualities(JiaRen jiaRen) {
        String hasTheSameQualities = "Jia Ren has the same divination "+ jiaRen.getElementQualities();
        String doesNotHaveTheSameQualities = "Jia Ren has the same qualities";
        HashMap expectedQualities = new HashMap();
        expectedQualities.put("1", "The household" );
        expectedQualities.put("2", "The family");
        expectedQualities.put("3", "The clan");
        expectedQualities.put("4", "Close knit group");
        expectedQualities.put("5", "House people");
        expectedQualities.put("6", "Playing your part");
        expectedQualities.put("7", "Establishing expectations");
        expectedQualities.put("8", "Serving as an example");
        expectedQualities.put("9", "Creating mutuality and trust");
        if(jiaRen.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String hasTheSameDivination(JiaRen jiaRen) {
        String hasTheSameDivination = "Jia Ren has the same divination " + jiaRen.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Jia Ren does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Jia Ren The family");
        expectedDivination.put("Keywords","The household, the family, the clan, close-knit groups, house people, playing your part, establishing expectations, serving as an example, creating mutuality and trust");
        expectedDivination.put("The Judgement","The family. The perseverance of a woman is beneficial");
        expectedDivination.put("Judgement Description","Although the hexagram Jia Ren concerns the family, in ancient China the family was a metaphor and model for virtually all other forms of social organization. Hence the hexagram is also about the ideal forms of social life and social relations. Each member of the family - father, mother, son, daughter, elder sibling, younger sibling - had specific duties and relationships, When each of them fulfilled their proper obligations to the others, each of them played their respective role (as father, mother, son, daughter, etc.) appropriately, and the family was well ordered. The Chinese believed that if the family was well ordered, then all of society would be well ordered. In ancient Chinese society, men were expected to the heads of households, women were expected to be subordinate to them. The relationship between superior and subordinate was analogized to that between a man and a woman in a family. Hence a subordinate is always yin to the superior's yang. Because in China, everyone was subordinate to someone else, everyone - including all men - were yin to somebody else's yang. Thus when the text says 'perseverance of a woman is beneficial' it refers to the steadfast uprightness of a person who is in a yin (subordinate) position. In today's more egalitarian society, we cannot accept the Book of Changes assumptions about the respective roles of sexes, or its acceptance of natural hierarchies among people based on the model of the family. Nevertheless, the more general advice that the book of changes offers is still valid. It applies to any social relationship, and especially to close-knit organizations. If you want the relationship or the organization to run smoothly, you must be committed to it. Play your appropriate and assigned role and work for the greater good of everyone involved. If everyone in the organization does this, it will be well ordered and peace will reign. Duties and responsibilities should be laid out clearly in advance so that everyone knows their role and feels that they will be valued for their contribution. whether they are a leader, a follower, a specialist, or one among equals. The group should be well ordered so that people know what they can expect from others and know what is expected of them. They must be able to take pride in their contribution to the greater good and they must be honored and recognized for what they do. Then they will not feel abused or put upon and social bonds will be strenthend over time. It is not enough to assign people roles and expect them to fill them. Trust, consideration, and mutual affection are necessary for relationships to thrive and prosper. Mechanically, enforcing other misses the informal elements of mutuality, reciprocity, and affection that are necessary to any successful long-term alliance. If the relationship is too rigid, it will not stand the stresses that everyday life puts on it, much less the strains caused by a genuine crisis. Mutuality and benevolence bind the group together and give it the flexibility to improvise and change to meet changing times. If you have not been paying enough attention to your relationships, now is a good time to mend fences, renew lines of communication, and show people that you care about and respect them. Remember that the social cement of courtesy and reciprocity binds close-knit groups together. All too often we treat people we live with every day with less respect and give them less attention than we do perfect strangers or mere acquaintances that we are trying to impress. Intimacy should not mean taking people for granted. Rather, it should mean valuing those close to you especially. Showing a little consideration every now and then will help keep the relationship together through adversity. If the problem is lack of discipline, you should immediately take steps to restore order. It may be necessary to get tough for a while until appropriate expectations are reestablished. But the point of discipline is not to weld power or to inflict punishment for its own sake. It is to let everyone know where they stand and show them how others rely on them. Good discipline and clear expectations within the family can actually support the mutual trust and affection of its members, just as trust and affection can help keep relationships well ordered and running smoothly.");
        expectedDivination.put("The Image","Wind emerges from the fire, this is the image of family, thus the superior person ensures that his words have substance and his deeds constancy");
        if(jiaRen.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }


    public String hasSameNumber(JiaRen jiaRen){
        String hasSameNumber = "Jia Ren has the same number " + jiaRen.getNumber();
        String doesNotHaveTheSameNumber = "Jia Ren does not have the same number";
        int expectedNumber = 37;
        if(jiaRen.getNumber() == expectedNumber){
            return hasSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}

