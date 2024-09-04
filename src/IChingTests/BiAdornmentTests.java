package IChingTests;

import IChingClasses.BiAdornment;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class BiAdornmentTests extends ConsoleProgram {

    public void run() {
        BiAdornment biAdornment = new BiAdornment();
        String hasSameImage = hasSameImage(biAdornment);
        println(hasSameImage);
    }

    public String hasSameImage(BiAdornment biAdornment) {
        String hasSameImage = "Bi Adornment has the same image";
        String doesNotHaveTheSameImage = "Bi Adornment does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/22.BiAdornment.jpg");
        if(biAdornment.getIChingImage().equals(expectedImage)) {
            return hasSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(BiAdornment biAdornment) {
        String hasSameImagePath = "Bi Adornment has the same image path";
        String doesNotHaveSameImagePath = "Bi Adornment does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/22.BiAdornment.jpg";
        if(biAdornment.getImagePath().equals(expectedImagePath)) {
            return hasSameImagePath;
        } else {
            return doesNotHaveSameImagePath;
        }
    }

    public String hasTheSameElementName(BiAdornment biAdornment) {
        String hasTheSameElementName = "Bi Adornment has the same element name and it is " + biAdornment.getElementName();
        String doesNotHaveTheSameElementName = "Bi Adornment does not have the same element name";
        String expectedElementName = "Mountain, Fire";
        if(biAdornment.getElementName().equals(expectedElementName)) {
            return hasTheSameElementName;
        } else {
            return doesNotHaveTheSameElementName;
        }
    }

    public String hasExpectedQualities (BiAdornment biAdornment) {
        String hasTheExpectedQualities = "Bi Adornment has the expected qualities " + biAdornment.getElementQualities();
        String doesNotHaveTheExpectedQualities = "Bi Adornment does not have the expected qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Inner fire" );
        expectedQualities.put("2", "Strength of character");
        expectedQualities.put("3", "Persuasion");
        expectedQualities.put("6", "Simplicity");
        expectedQualities.put("7", "Inner beauty");
        expectedQualities.put("8", "Inner focus");
        expectedQualities.put("9", "Inner calm");
        expectedQualities.put("10", "Inner smile");
        expectedQualities.put("11", "Visionary");
        expectedQualities.put("12", "Ornamentation ");
        if(biAdornment.getElementQualities().equals(expectedQualities)) {
            return hasTheExpectedQualities;
        } else {
            return doesNotHaveTheExpectedQualities;
        }
    }

    public String hasExpectedDivination(BiAdornment biAdornment) {
        String hasTheExpectedDivination = "Bi adornment has the expected divination with the keywords: " + biAdornment.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Bi Adornment does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Bi Adornment");
        expectedDivination.put("Keywords","Grace, beauty, persuasion, simplicity, inner beauty, inner focus, inner calm, inner smile");
        expectedDivination.put("The Judgement","Adornment. Success. In small matters it is beneficial to undertake something");
        expectedDivination.put("Judgement Description","Adornment brings success as a small thing. It smooths the path of life and makes it more bearable. When adornment becomes the central thing, it can easily become perverted because it is placed above other human values and human needs. Nevertheless, the study of beauty helps us understand the profundity of the world. Through the contemplation of beauty and form, we discover both the demands of a particular time and the power of the unchanging. And through attention to how beauty is produced, we apprehend the connection between outr form and inner nature. The beauty of a fire or a mountain range is the natural product of the processes that give rise to these things. It is the same in human life. The Book of Changes teaches that outer beauty should emerge as a natural product of inner beauty. Then adornment does not simply cover or disguise a person's nature but becomes its organic expression. In practical terms, Bi signifies that you cannot exert great influence on the situation. But you can have a positive effect in small ways. But you can have a positive effect in small ways. Behave with tact and consideration to others. For the time being, you must accept aspects of the situation that you do not like, but you can make progress at the periphery if you act with charm and grace. Work on polishing your appearance and your powers of persuasion. Brush up your talents. Smooth out the rough edges in your life and in your relationships with others. This is a good time to improve your habits of communication and self expression. Consider making minor changes to your surroundings so that they better express and reflect who you are. All of these activities should be understood as means of improving the presentation of your inner self and your real values. They are not ends in themselves. Bi reminds you that as you focus on self-presentation, you should not take yourself too seriously. Do not allow yourself to become conceited or self-indulgent, and do not waste time on trivial things. The outer persona must serve the inner person, and not the other way around. The best way to achieve inner beauty is to let the beauty within shine forth in your words and deeds. If inner beauty is lacking, outward display will not compensate for it in the long run, for without the nourishment of what is within, outer beauty will soon fade. Therefore, the best long-term strategy for maintenance of grace and beauty is the development of a graceful and beautiful soul. Thus any focus on adornment must inevitably lead back to the care and cultivation of the soul. Charm and attractiveness are genuine assets in life. gracefulness and poise are talents that can be mastered and fostered with good effect. BBut your first priority must always be self-development. If you pay too much attention to how you appear to other people, your life will become meaningless and superficial. A beautiful face does not compensate for selfishness and shallowness, beautiful possessions cannot compensate for lack of healthy human relationships, beautiful form does not excuse ugly behavior. If the Book of Changes has a preferred aesthetic, it is one of simplicity and sincerity that naturally expresses healthiness and soundness of one's character. You should not expect that public dress and deportment can remedy a private lack, or that external possessions can substitute for internal self-possession. Outer worth flows from inner worth and cannot replace it. No amount of fancy clothes or material goods will give you peace, emotional balance, and self-esteem. If you want others to value you, you must first value yourself as you are.");
        expectedDivination.put("The Image","Fire at the foot of the mountains, this is the image of adornment, thus the superior person regulates the masses through enlightment and teaches for generations to come");
        if(biAdornment.getDivination().equals(expectedDivination)) {
            return hasTheExpectedDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasExpectedNumber(BiAdornment biAdornment) {
        String hasExpectedNumber = "Bi adornment has the expected number of: " + biAdornment.getNumber();
        String doesNotHaveTheExpectedNumber = "Bi Adornment does not have the expected number";
        int expectedNumber = 22;
        if(biAdornment.getNumber() == expectedNumber) {
            return hasExpectedNumber;
        } else {
            return doesNotHaveTheExpectedNumber;
        }
    }
}