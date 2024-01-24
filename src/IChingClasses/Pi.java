package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Pi  extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Pi () {
        image = new GImage("../IChingImages/UpToSixtyFour/12.Pi.jpg");
        element = "Heaven, Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", " Stagnation" );
        qualities.put("2", "Blockage");
        qualities.put("3", "Misfortune");
        qualities.put("4", "Disharmony");
        qualities.put("5", "Hinderance");
        qualities.put("6", "Standstill");
        divination = getDivinationText();
        number = 12;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Pi-Standstill";
        String keywords = "Stagnation, blockage, misfortune, disharmony, hinderance";
        String theJudgement = "Standstill. Inferior people do not further, the perseverance of the superior person. The great depart, the petty arrive";
        String theJudgementDescription = "IChingClasses.Pi describes a time when heaven and earth are estranged and comunication is difficult if not impossible. People in different areas of life have lost touch with each other, social relations have broken down, and disorder proliferates. The time is truly out of joint. Because people cannot cooperate, they cannot make progress. Because people pursue only their narrow self-interest and regard everyone else as rivals and enemies, harmony and reciprocity wither away. In a time of standstull, petty and inferior people are on the rise. Their bad habbits, small mindedness, selfishness and meannness poison the atmosphere of social life. People of goodwill and elightment must persevere through these difficult time, keeping a low profile. They should not count on the assistance of intolerant, shallow, and fawning people, for the latter seek only to maximize their own glory and power. Indeed, during the time of IChingClasses.Pi, the petty make sport of people of integrity and hinder their progress at every turn. Enlightened people should not contribute to the disharmony and mean spiritness of the time,and they should not be tempted to surrender their principles in order to advance. In these circumstances they cannot extert much influence, therefore they should remain faithful to their values and wait until better days arrive. In personal terms, IChingClasses.Pi signifies that you face a standstill in your life. Matters have stagnated. Obstacles block your progress. Your efforts meet with failure and rejection at every turn. You may feel that life has dealt you a bad hand and that your luck has run out. Relationships with others have become more complicated and troublesome. You have difficulty getting people to understand you and consider your point of view. Misunderstandings proliferate. You may feel estragement, alienation, and despair. During this period you should not expect help from people who do not share your values or have your best interest at heart. They have their own agendas and they will not much care what happens to you. Do not rest your hopes on shallow, vain or selfish individuals. They cannot save themselves, they will certainly not be able to save you. You may be tempted to go against your better judgement and abandon your principles in order to fit in or gain the acceptance of such people. Resist the temptation It is not worth throwing yourself away on something that is unseemly and wrong for you. Instead, the proper strategy is to withraw from the situation. preserve your integrity and maintain your faith in yourself. Do not try to force things to improve. They will improve in their own time. Until then, the way to combat the stagnation outside you is to combat the stagnation within. Remember that no matter what happens now and whatever mistakes you may have made in the past, there is good within you foster and nurture those most valuable facets of yourself and let them lead you through this difficult period. Keep hope. Have patience. Better times are coming.";
        String theImage = " Heaven and earth not unite. This is the image of standstill. thus the superior person restrains himself and preserves his inner virtue. In order to escape difficulties and hardship, he does not allow himself to be honored with rank or salary.";
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
        new Pi();
    }
}
