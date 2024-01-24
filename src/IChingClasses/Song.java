package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Song extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Song () {
        image = new GImage("../IChingImages/UpToSixtyFour/6.Song.jpg");
        element = "Heaven, Water";
        qualities = new HashMap<String, String>();
        qualities.put("1", " Contention" );
        qualities.put("2", "Arbitration");
        qualities.put("3", "Demanding justice");
        qualities.put("4", "Speaking Out");
        qualities.put("5", "Conflict");
        divination = getDivinationText();
        number = 6;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Song";
        String keywords = "Contention, arbitration, demanding justice, speaking out.";
        String theJudgement = "In conflict, be sincere. Be prudent in dealing with obstruction, to halt halfway brings good fortune, to carry things though to the end brings misfortune, It is beneficial to see a great person, it is not beneficial to cross the great river";
        String theJudgementDescription = "Conficts arise when two people believe that they are right and their interests become opposed. This may be because the parties have not been communicating with eachother effectively or because they no longer trust each other. And if the parties are strangers, then they have never had the chance to communicate or develop trust. Thus if you wish to understand conflict, you must understand its beginnings. If you do not believe that you are in the right, you should not become involved in conflict. This is true both as a moral and a practical matter. If you do not believe in yourself asnd in the justness of your cause, you will not win a fight with a determined opponent. Indeed, you should never go into combat without a sincere commitment to success and without understanding your goals in advance. Conflict is a matter or values, not a matter of force. If uou do not fight to vindicate values that you believe in, there is no point in going forward/ Even if you have superior strength, domniating another when you know that you are wrong does not mean that you've won. It only means that you debased yourself though the use of violence and trickery. \"Be prudent in dealing with obstruction\" means that you should not rush into conflicts thoughtlessly. Because a struggle destroys the resources of both parties, it is always better to explore how a direct confruntation can be avoided. Try to adjust matters and reach a settlement before conflicts grow and get out of hand. Open up lines of communication and try to establish trust and reciprocity. Attempting to reach accomodation keeps each side from wasting valueable capital and may even produce unexpected synergies. Nevertheless, some things are simply worth fighting for, and if there is no other choice, conflict becomes a necessity. Indeed, conflict and a show of strength is sometimes necessary as a prerequisite to later agreement. If you find yourself in a conflict, remain calm and collected. A conflict is a potentially dangerous situation. Iy can easily spin out of control if you do not pay careful attention. Having entered into it, you must find a way out of it. The most aggressive approach is not always the best one. You should first decide what you want to achieve and what you will accept as a satisfactory ending to the conflict. Unless you know what your goals are, you will not be able to plan an effective strategy. By prolonging conflict without a clear plan or direction, you may destroy something very valuable in the process - not only what belongs to your adversary, but what belongs to yourself. Once you have begun a conflict with another, you must have the inner strength and confidence to settle your dispute and meet your opponent halfway. Often this requires courage every bit as great as the courage to fight on. The secret of success in conflict is not the ability to prevail. It is the ability to compromise. If you cannot compromise, every conflict must become either an ignominous defeat or a fight to death. But if you have the ability to compromise, you can turn a deadly conflict into a potential of growth and improvment. Nevertheless, you will be able to reach an effective compromise only when you know what your own values and goals truly are and what you will be willinng to give up in order to get them. If you are confused about what you want, you will find it difficult to end a conflict without great loss. That is why the text says that in conflict you must be sincere. You must be honest with yourself at each stage of the process in getting into the conflict, in carrying the conflict forward , and in getting out of it. Compromise becomes possible precicely because conflicts are conflicts of value as well as conflicts of interests and resources. By learning to respect and understand your opponent's values, you can find your way to a solution. The most successful compromises are those in which each side feels that it has gained something important or that some elements of its cause have been recognized and vindicated. Even if you are convinced that you are in the right, you must know when to stop halfway. Even if compromise is not possible, you will have to let go at some point. If you fight to the bitter end, you will not only use up your resources but you will also create lasting enmity. Words once spoken and blows once struck cannot be taken back. It's easier to forgive a minor skirmish than a bloodbath. And if you fight to the bitter end, you may so weaken yourself that the victory you gain is not worth the cost. Because conflict can be so destructive to all sides, it is important to put your disputes before a neutral arbiter that both parties can trust. Hence the text says that should \"see a great person\", not merely for advice but to help end the conflict. The legitimacy and authority of an arbiter - whether a person or an insitution - all low the parties to settle the dispute and save face. Quite literally, it allow them to have their day in court - to state fully and publicly the nature of their grievance and have it considered fully and fairly by a neutral third party, even if they do not ultimately win the day. The ability of both parties to be heard and heard equally is an important feature of a just legal system. Finally, the text advises that when you are engaged in conflict, you should not \"cross the great river\", that is, you should not attempt singnificant new undertakings, start new projects, or make major life changes until the conflict is satisfactory resolved. Conflicts drain both pgysical and emotional resources. If your attention is divided on several fronts, you weaken yourself and make it more difficult to prevail in any aspect of your life. Similarly, to win a conflict in the outside world you must not be comflicted inside. If you wand your allies are at odds, or if you are divided within yourself, you lessen the chances of successful compromise or ultimate victory.";
        String theImage = "Heaven and water go their opposite ways: this is the image of conflict, thus in all his affairs the superior person carefully considers how things begin.";
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
        new Song();
    }
}
