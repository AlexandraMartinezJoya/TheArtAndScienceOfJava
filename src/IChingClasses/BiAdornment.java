package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class BiAdornment extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public BiAdornment() {
        image = new GImage("../IChingImages/UpToSixtyFour/23.BiAdornment.jpg");
        element = "Mountain, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Inner fire" );
        qualities.put("2", "Strength of character");
        qualities.put("3", "Persuasion");
        qualities.put("6", "Simplicity");
        qualities.put("7", "Inner beauty");
        qualities.put("8", "Inner focus");
        qualities.put("9", "Inner calm");
        qualities.put("10", "Inner smile");
        qualities.put("11", "Mutual admiration and respect");
        qualities.put("12", "Worthy adversary");
        qualities.put("13", "Church splitting apart in 3 same pieces");
        qualities.put("14", "Makes teachers wonder");
        qualities.put("15", "Seeing from more than one straight perspective");
        qualities.put("16", "Visionary");
        qualities.put("17", "Self love");
        qualities.put("18", "Self self care");
        divination = getDivinationText();
        number = 22;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "BiLimitation";
        String keywords = "Grace, beauty, persuasion, simplicity, inner beauty, inner focus, inner calm, inner smile";
        String theJudgement = "Adornment. Success. In small matters it is beneficial to undertake something";
        String theJudgementDescription = "Adornment brings success as a small thing. It smooths the path of life and makes it more bearable. When adornment becomes the central thing, it can easily become perverted because it is placed above other human values and human needs. Nevertheless, the study of beauty helps us understand the profundity of the world. Through the contemplation of beauty and form, we discover both the demands of a particular time and the power of the unchanging. And through attention to how beauty is produced, we apprehend the connection between outr form and inner nature. The beauty of a fire or a mountain range is the natural product of the processes that give rise to these things. It is the same in human life. The Book of Changes teaches that outer beauty should emerge as a natural product of inner beauty. Then adornment does not simply cover or disguise a person's nature but becomes its organic expression. In practical terms, Bi signifies that you cannot exert great influence on the situation. But you can have a positive effect in small ways. But you can have a positive effect in small ways. Behave with tact and consideration to others. For the time being, you must accept aspects of the sittuation that you do not like, but you can make progress at the periphery if you act with charm and grace. Work on polishing your appearance and your powers of persuation. Brush up your talents. Smooth out the rough edges in your life and in your relationships with others. This is a good time to improve your habits of communication and self expression. Consider making minor changes to your souroundings so that they better express and reflect who you are. All of these activities should be understood as means of improving the presentation of your inner self and your real values. They are not ends in themselves. Bi reminds you that as you focus on self-presentation, you should not take yourself too seriously. Do not allow yourself to become conceited or self-indulgent, and do not waste time on trivial things. The outer persona must serve the inner person, and not the other way around. The best way to achienve inner beauty is to let the beauty within shine forth in your words and deeds. If inner beauty is lacking, outward display will not compensate for it in the long run, for without the nourishment of what is within, outer beauty will soon fade. Therefore, the best long-term strategy for maintainance of grace and beauty is the development of a graceful and beautiful soul. Thus any focus on adornment must inevitably lead back to the care and cultivation of the soul. Charm and attractivness are genuine assets in life. gracefulness and poise are talents that can be mastered and fostered with good effect. BBut your first priority must always be self-development. If you pay too much attention to how you appear to other people, your life will become meaningless and superficial. A beautiful face does not compensate for selfishness and shallowness, beautiful possesions cannot compensate for lack of healthy human relationships, beautiful form does not excuse ugly behavior. If the Book of Changes has a preffered aestethic, it is one of simplicity and sincerity that naturally expresses healtiness and soundness of one's character. You should not expect that public dress and deportment can remedy a private lack, or that external possesions can substitute for internal self-possesion. Outer worth flows from inner worth and cannot replace it. No amount of fancy clothes or material goods will give you peace, emotional balance, and self-esteem. If you want others to value you, you must first value yourself as you are.";
        String theImage = "Fire at the foot of the mountains, this is the image of adornment, thus the superior person regulates the masses through enlightment and teaches for generations to come";
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
        new BiAdornment();
    }
}
