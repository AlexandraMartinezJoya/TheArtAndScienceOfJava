import IChingClasses.Sui;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class SuiTests extends ConsoleProgram {

    public void  run() {
        Sui sui = new Sui();
        String suiHasSameImage = suiHasSameImage(sui);
        println(suiHasSameImage);
    }

    public String suiHasSameImage(Sui sui) {
        String hasTheSameImage = "Sui has the same image";
        String doesNotHaveTheSameImage = "Sui does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/17.Sui.jpg");
        if(sui.getIChingImage().equals(expectedImage)) {
            return hasTheSameImage;
        } else {
            return doesNotHaveTheSameImage;
        }
    }

    public String hasSameImagePath(Sui sui) {
        String hasTheSameImagePath = "Sui has the same image path";
        String doesNotHaveTheSameImagePath = "Sui does not have the same image path";
        String expectedClassPath ="../IChingImages/UpToSixtyFour/17.Sui.jpg";
        if(sui.getImagePath().equals(expectedClassPath)) {
            return hasTheSameImagePath;
        } else {
            return doesNotHaveTheSameImagePath;
        }
    }

    public String hasSameElements(Sui sui){
        String hasSameElements = "Sui has the same expected elements and they are "+ sui.getElementName();
        String doesNotHaveSameElements = "Sui does not have the same element name";
        String expectedElementName =  "Lake, Thunder";
        if(sui.getElementName().equals(expectedElementName)) {
            return hasSameElements;
        } else {
            return doesNotHaveSameElements;
        }
    }

    public String hasSameQualities (Sui sui) {
        String hasTheSameQualities = "Sui has the same expected qualities and they are " + sui.getElementQualities();
        String doesNotHaveSameQualities = "Sui does not have the same qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", "Following" );
        expectedQualities.put("2", "Allegiance");
        expectedQualities.put("3", "Loyalty");
        expectedQualities.put("4", "Looking out");
        expectedQualities.put("5", "Continuing");
        expectedQualities.put("6", "Adaptability");
        expectedQualities.put("7", "Being adaptable");
        expectedQualities.put("8", "Changing");
        expectedQualities.put("9", "Being able to distinguish and apply necessary changes");
        if(sui.getElementQualities().equals(expectedQualities)) {
            return hasTheSameQualities;
        } else {
            return doesNotHaveSameQualities;
        }
    }

    public String hasTheSameDivination(Sui sui) {
        String hasTheSameDivination = "Sui has the same divination "+ sui.getDivination().get("Keywords");
        String doesNotHaveTheSameDivination = "Sui does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Sui - Following");
        expectedDivination.put("Keywords", "Following, Allegiance, Loyalty, Looking out, Continuing, Adaptability, Being adaptable, Changing, Being able to distinguish and apply the changes needed");
        expectedDivination.put("The Judgement", "Resolution. Declare it at the court of the king. Proclaim it sincerely and truthfully. There is danger. Notify the city. It is not beneficial to resort to arms. It is beneficial to have somewhere to go.");
        expectedDivination.put("Judgement Description", "Sui concerns the obligations of followers and leaders - how to get others to follow you and when and how to follow others. If you want other to follow you, you must know how to adjust yourself to them. In the words of the old Chinese proverb, to rule is to serve. No one can be a true leader who does not have sympathy for those in one's charge. You must adapt yourself to the demands of the time and the needs of your supporters. Then you will gain the respect and trust of others so that they follow you with joy and gladness. If you try to gain mastery over other people through force and fraud, or through conspiracy and connivance, you will poison social relations and breed resentment and resistance. At most you will gain control only of a fraction that must suppress its opponents. If you wil power through injuring others, you will have to keep injuring them to maintain your base. The injuries you do to others will not fade away, they will haunt you later on. On the other hand, if you gain power through winning the trust and affection of others, they will give you the benefit of the doubt when you must take tough decisions that you feel are in the interest of all. When your leadership is established on trust rather than fear, you maintain your base of support by continuing to work on behalf of those who follow you. They in turn will support your endeavors, and in this way everyone will benefit. Conversely, if you are in the position of following others, you must make sure that you are doing so for the right reasons. Hence the text warns you to be constant and steadfastly faithful. One can be only faithful in this way to principles that last for a long time rather than to fads and fashions that come and go. If you follow a group because it is currently powerful and influential, you are not really following anything but your own ambition and your own need for approval. But if you follow a group or leader because of the quality of its beliefs and goals, and not merely to advance your own selfish interests, you will be without blame..Sui has a dual meaning. It means both to follow something and to pursue it. Thus, Sui also concerns the deeper question of what you should pursue in life. The answer to this question, is deceptively simple to state but often difficult to put into practice: first of all, you must follow your conscience. Second, you must follow what gives happiness. In the hexagram Sui, Zhen - the symbol of the Arousing, follows Dui. So should you. Life is to short to squander on things that are unrewarding. Devote yourself to things that will enrich you and give meaning to your life. Aim high. If you settle for less than the best, you will almost certainly get it. Just because you pursue something valuable does not mean that you will attain it immediately and without effort. Nothing worth having is attained so easily. You must cultivate the virtues of patience and flexibility. Sui teaches that you can achieve great success if you know how to adapt your efforts to the demands of the time. Indeed, this is a central theme of Book of Changes. Be open-minded and willing to learn. Instead of exhausting your energies in vain struggles against the world, try to see how you can make progress by moving in different directions. Be willing to experiment. Take a fresh view of the situation. Overcome old prejudices and try new ways of doing things. Flexibility without and persistence within will bring you to your goal.");
        expectedDivination.put("The Image", "Thunder in the middle of the lake, this is the image of following, thus the superior person goes indoors at night for the rest and recuperation.");
        if(sui.getDivination().equals(expectedDivination)) {
            return hasTheSameDivination;
        } else {
            return doesNotHaveTheSameDivination;
        }
    }

    public String hasTheSameNumber(Sui sui) {
        String hasTheSameNumber = "Sui has the same number and it is: " + sui.getNumber();
        String doesNotHaveTheSameNumber = "Sui does not have the same number";
        int expectedNumber = 17;
        if(sui.getNumber() == expectedNumber) {
            return hasTheSameNumber;
        } else {
            return doesNotHaveTheSameNumber;
        }
    }
}
