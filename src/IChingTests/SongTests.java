package IChingTests;

import IChingClasses.Song;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class SongTests  extends ConsoleProgram {

    public void run(){
        Song song = new Song();

        String isSongImageSameAsExpected = songImageIsSameAsExpected(song);
        println(isSongImageSameAsExpected);
    }

    public String songImageIsSameAsExpected(Song song){
        String songImageIsSameAsExpected = "Song image is same as expected";
        String songImageIsNotAsExpected = "Song image is not as expected";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/6.Song.jpg");
        if(song.getIChingImage().equals(expectedImage)) {
            return songImageIsSameAsExpected;
        } else {
            return songImageIsNotAsExpected;
        }
    }

    public String songImageClassPathIsAsExpected(Song song) {
        String songImageIsSameAsExpected = "Song image class path is same as expected";
        String songImageIsNotAsExpected = "Song image class path is not as expected";
        String expectedImageClassPath = "../IChingImages/UpToSixtyFour/6.Song.jpg";
        if(song.getImageClassPath().equals(expectedImageClassPath)) {
            return songImageIsSameAsExpected;
        } else {
            return songImageIsNotAsExpected;
        }
    }

    public String songElementIsAsExpected(Song song) {
        String songElementIsAsExpected = "Song has the expected element name of " + song.getElementName();
        String songElementIsNotAsExpected = "Song does not have the expected element";
        String expectedElementName = "Heaven, Water";
        if(expectedElementName.equals(song.getElementName())) {
            return songElementIsAsExpected;
        } else {
            return songElementIsNotAsExpected;
        }
    }

    public String songElementHasSameQualitiesAsExpected(Song song) {
        String songHasTheSameQualities = "Song has the same element qualities as expected "+ song.getElementQualities();
        String songDoesntHaveTheSameElementAsExpected = "Song does not have the expected qualities";
        HashMap expectedSongQualities = new HashMap<String, String>();
        expectedSongQualities.put("1", " Contention" );
        expectedSongQualities.put("2", "Arbitration");
        expectedSongQualities.put("3", "Demanding justice");
        expectedSongQualities.put("4", "Speaking Out");
        expectedSongQualities.put("5", "Conflict");
        if(song.getElementQualities().equals(expectedSongQualities)) {
            return songHasTheSameQualities;
        } else {
            return songDoesntHaveTheSameElementAsExpected;
        }
    }

    public String songHasTheSameDivination(Song song){
        String songHasTheSameDivination = "Song has the same divination as expected "+ song.getDivination().get("Keywords");
        String songDoesNotHaveTheSameDivination = "Song does not have the same divination";
        HashMap expectedSongDivination = new HashMap<String, String>();
        expectedSongDivination.put("Title","Song");
        expectedSongDivination.put("Keywords","Contention, arbitration, demanding justice, speaking out.");
        expectedSongDivination.put("The Judgement","In conflict, be sincere. Be prudent in dealing with obstruction, to halt halfway brings good fortune, to carry things though to the end brings misfortune, It is beneficial to see a great person, it is not beneficial to cross the great river");
        expectedSongDivination.put("Judgement Description","Conflicts arise when two people believe that they are right and their interests become opposed. This may be because the parties have not been communicating with each other effectively or because they no longer trust each other. And if the parties are strangers, then they have never had the chance to communicate or develop trust. Thus if you wish to understand conflict, you must understand its beginnings. If you do not believe that you are in the right, you should not become involved in conflict. This is true both as a moral and a practical matter. If you do not believe in yourself and in the justness of your cause, you will not win a fight with a determined opponent. Indeed, you should never go into combat without a sincere commitment to success and without understanding your goals in advance. Conflict is a matter or values, not a matter of force. If you do not fight to vindicate values that you believe in, there is no point in going forward. Even if you have superior strength, dominating another when you know that you are wrong does not mean that you've won. It only means that you debased yourself though the use of violence and trickery. 'Be prudent in dealing with obstruction' means that you should not rush into conflicts thoughtlessly. Because a struggle destroys the resources of both parties, it is always better to explore how a direct confrontation can be avoided. Try to adjust matters and reach a settlement before conflicts grow and get out of hand. Open up lines of communication and try to establish trust and reciprocity. Attempting to reach accommodation keeps each side from wasting valuable capital and may even produce unexpected synergies. Nevertheless, some things are simply worth fighting for, and if there is no other choice, conflict becomes a necessity. Indeed, conflict and a show of strength is sometimes necessary as a prerequisite to later agreement. If you find yourself in a conflict, remain calm and collected. A conflict is a potentially dangerous situation. Iy can easily spin out of control if you do not pay careful attention. Having entered into it, you must find a way out of it. The most aggressive approach is not always the best one. You should first decide what you want to achieve and what you will accept as a satisfactory ending to the conflict. Unless you know what your goals are, you will not be able to plan an effective strategy. By prolonging conflict without a clear plan or direction, you may destroy something very valuable in the process - not only what belongs to your adversary, but what belongs to yourself. Once you have begun a conflict with another, you must have the inner strength and confidence to settle your dispute and meet your opponent halfway. Often this requires courage every bit as great as the courage to fight on. The secret of success in conflict is not the ability to prevail. It is the ability to compromise. If you cannot compromise, every conflict must become either an ignominious defeat or a fight to death. But if you have the ability to compromise, you can turn a deadly conflict into a potential of growth and improvement. Nevertheless, you will be able to reach an effective compromise only when you know what your own values and goals truly are and what you will be willing to give up in order to get them. If you are confused about what you want, you will find it difficult to end a conflict without great loss. That is why the text says that in conflict you must be sincere. You must be honest with yourself at each stage of the process in getting into the conflict, in carrying the conflict forward , and in getting out of it. Compromise becomes possible precisely because conflicts are conflicts of value as well as conflicts of interests and resources. By learning to respect and understand your opponent's values, you can find your way to a solution. The most successful compromises are those in which each side feels that it has gained something important or that some elements of its cause have been recognized and vindicated. Even if you are convinced that you are in the right, you must know when to stop halfway. Even if compromise is not possible, you will have to let go at some point. If you fight to the bitter end, you will not only use up your resources but you will also create lasting enmity. Words once spoken and blows once struck cannot be taken back. It's easier to forgive a minor skirmish than a bloodbath. And if you fight to the bitter end, you may so weaken yourself that the victory you gain is not worth the cost. Because conflict can be so destructive to all sides, it is important to put your disputes before a neutral arbiter that both parties can trust. Hence the text says that should 'see a great person', not merely for advice but to help end the conflict. The legitimacy and authority of an arbiter - whether a person or an institution - all low the parties to settle the dispute and save face. Quite literally, it allow them to have their day in court - to state fully and publicly the nature of their grievance and have it considered fully and fairly by a neutral third party, even if they do not ultimately win the day. The ability of both parties to be heard and heard equally is an important feature of a just legal system. Finally, the text advises that when you are engaged in conflict, you should not 'cross the great river', that is, you should not attempt significant new undertakings, start new projects, or make major life changes until the conflict is satisfactory resolved. Conflicts drain both physical and emotional resources. If your attention is divided on several fronts, you weaken yourself and make it more difficult to prevail in any aspect of your life. Similarly, to win a conflict in the outside world you must not be conflicted inside. If you wand your allies are at odds, or if you are divided within yourself, you lessen the chances of successful compromise or ultimate victory.");
        expectedSongDivination.put("The Image","Heaven and water go their opposite ways: this is the image of conflict, thus in all his affairs the superior person carefully considers how things begin.");
        if(song.getDivination().equals(expectedSongDivination)) {
            return songHasTheSameDivination;
        } else {
            return songDoesNotHaveTheSameDivination;
        }
    }

    public String songHasTheSameNumber(Song song) {
        String songHasTheSameNumber = "Song has the same number as expected and is: " + song.getNumber();
        String songDoesNotHaveTheSameNumber = "Song does not have the same number";
        int expectedSongNumber = 6;
        if(song.getNumber() == expectedSongNumber) {
            return songHasTheSameNumber;
        } else {
            return songDoesNotHaveTheSameNumber;
        }
    }


}

