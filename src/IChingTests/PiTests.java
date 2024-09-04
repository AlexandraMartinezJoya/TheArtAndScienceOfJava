package IChingTests;

import IChingClasses.Pi;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class PiTests  extends ConsoleProgram {

    public void run() {
        Pi pi = new Pi();

        String piHasTheSameImage = piHasTheSameImage(pi);
        println(piHasTheSameImage);
    }

    public String piHasTheSameImage(Pi pi) {
        String piHasTheSameImage = "Pi has the same image";
        String piDoesNotHaveTheSameImage = "Pi does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/12.Pi.jpg");
        if(pi.getIChingImage().equals(expectedImage)) {
            return piHasTheSameImage;
        } else {
            return piDoesNotHaveTheSameImage;
        }
    }

    public String piHasTheSameImagePath(Pi pi) {
        String piHasTheSameImagePath = "Pi has the same image path";
        String piDoesNotHaveTheSameImagePath = "Pi does not have the same image path";
        String expectedClassPath = "../IChingImages/UpToSixtyFour/12.Pi.jpg";
        if(pi.getImagePath().equals(expectedClassPath)) {
            return piHasTheSameImagePath;
        } else {
            return piDoesNotHaveTheSameImagePath;
        }
    }

    public String piHasTheSameElementName(Pi pi) {
        String piHasTheSameElementName = "Pi has the expected element name which is " +pi.getElementName();
        String piDoesNotHaveTheSameElementName = "Pi does not have the expected element name";
        String expectedElementName = "Heaven, Earth";
        if(pi.getElementName().equals(expectedElementName)) {
            return piHasTheSameElementName;
        } else {
            return piDoesNotHaveTheSameElementName;
        }
    }

    public String piHasTheSameQualities(Pi pi) {
        String piHasTheSameQualities = "Pi has the expected qualities "+ pi.getElementQualities();
        String piDoesNotHaveTheExpectedQualities = "Pi does not have the element qualities";
        HashMap expectedQualities = new HashMap<String, String>();
        expectedQualities.put("1", " Stagnation" );
        expectedQualities.put("2", "Blockage");
        expectedQualities.put("3", "Misfortune");
        expectedQualities.put("4", "Disharmony");
        expectedQualities.put("5", "Hindrance");
        expectedQualities.put("6", "Standstill");
        if(pi.getElementQualities().equals(expectedQualities)) {
            return piHasTheSameQualities;
        } else {
            return piDoesNotHaveTheExpectedQualities;
        }
    }

    public String piHasTheSameDivination (Pi pi) {
        String piHasTheSameDivination = "Pi has the same expected divination " + pi.getDivination().get("Keywords");
        String piDoesNotHaveTheSameDivination = "Pi does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title","Pi-Standstill");
        expectedDivination.put("Keywords","Stagnation, blockage, misfortune, disharmony, hindrance");
        expectedDivination.put("The Judgement","Standstill. Inferior people do not further, the perseverance of the superior person. The great depart, the petty arrive");
        expectedDivination.put("Judgement Description","Pi describes a time when heaven and earth are estranged and communication is difficult if not impossible. People in different areas of life have lost touch with each other, social relations have broken down, and disorder proliferates. The time is truly out of joint. Because people cannot cooperate, they cannot make progress. Because people pursue only their narrow self-interest and regard everyone else as rivals and enemies, harmony and reciprocity wither away. In a time of standstill, petty and inferior people are on the rise. Their bad habits, small mindedness, selfishness and meanness poison the atmosphere of social life. People of goodwill and enlightenment must persevere through these difficult time, keeping a low profile. They should not count on the assistance of intolerant, shallow, and fawning people, for the latter seek only to maximize their own glory and power. Indeed, during the time of Pi, the petty make sport of people of integrity and hinder their progress at every turn. Enlightened people should not contribute to the disharmony and mean spiritless of the time,and they should not be tempted to surrender their principles in order to advance. In these circumstances they cannot extort much influence, therefore they should remain faithful to their values and wait until better days arrive. In personal terms, Pi signifies that you face a standstill in your life. Matters have stagnated. Obstacles block your progress. Your efforts meet with failure and rejection at every turn. You may feel that life has dealt you a bad hand and that your luck has run out. Relationships with others have become more complicated and troublesome. You have difficulty getting people to understand you and consider your point of view. Misunderstandings proliferate. You may feel estrangement, alienation, and despair. During this period you should not expect help from people who do not share your values or have your best interest at heart. They have their own agendas and they will not much care what happens to you. Do not rest your hopes on shallow, vain or selfish individuals. They cannot save themselves, they will certainly not be able to save you. You may be tempted to go against your better judgement and abandon your principles in order to fit in or gain the acceptance of such people. Resist the temptation It is not worth throwing yourself away on something that is unseemly and wrong for you. Instead, the proper strategy is to withdraw from the situation. preserve your integrity and maintain your faith in yourself. Do not try to force things to improve. They will improve in their own time. Until then, the way to combat the stagnation outside you is to combat the stagnation within. Remember that no matter what happens now and whatever mistakes you may have made in the past, there is good within you foster and nurture those most valuable facets of yourself and let them lead you through this difficult period. Keep hope. Have patience. Better times are coming.");
        expectedDivination.put("The Image","Heaven and earth not unite. This is the image of standstill. thus the superior person restrains himself and preserves his inner virtue. In order to escape difficulties and hardship, he does not allow himself to be honored with rank or salary.");
        if(pi.getDivination().equals(expectedDivination)) {
            return piHasTheSameDivination;
        } else {
            return piDoesNotHaveTheSameDivination;
        }
    }

    public String piHasTheSameNumber(Pi pi) {
        String piHasTheSameNumber = "Pi has the same number and it is " + pi.getNumber();
        String piDoesNotHaveTheSameNumber = "Pi does not have the same number";
        int expectedNumber = 12;
        if(pi.getNumber() == expectedNumber) {
            return piHasTheSameNumber;
        } else {
            return piDoesNotHaveTheSameNumber;
        }
    }
}
