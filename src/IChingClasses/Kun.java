package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Kun extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Kun(){
        image = new GImage("../IChingImages/UpToSixtyFour/2.Kun.jpg");
        element = "Earth";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Receptive" );
        qualities.put("2", "Adaptive");
        qualities.put("3", "Yielding");
        familyMember = "Mother";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "belly");
        partOfBody.put("2", "womb");
        animals = "Cow";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Early Autumn");
        seasonsAndWeather.put("2", "Warm");
        divination = getDivinationText();
        number = 2;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Kun";
        String keywords = "Receptivity, Docility, Aquiesnce , Acceptance, Adjustment, Nurturing";
        String theJudgement = "The Receptive, Supreme Success, It is Beneficial to be constant like a mare. If the superior person sets out to do something, he will go astray, but if he follows, he will find guidance. It is beneficial to find friends in the southwest and forego friends in the northeast. Serene perserverence brings good fortune.";
        String theJudgementDescription = "The four fundamental attributes yuan heng li zhen (fundamental, successful, beneficial, and persevering) describe IChingClasses.Kun as they do IChingClasses.Qian. However the \"perseverence of a mare\" in IChingClasses.Kun contrasts with Quian injunction of steadfast endurance. Whereas Quian advises us to pursue our ends constantly, doggedly, and incessantly like the ceasless movement of the heavens, IChingClasses.Kun advises us to accept and endure change, adjusting to and even welcoming what occurs. In place of untiring striving we should adopt the gentle and devoted perseverance of the mare. The mare follows the lead of the others and is by nature accomodating and accepting  - qualities which are appropriate to the sittuation. The mare also contrasts with the dragon featured in the line statements of IChingClasses.Qian. The dragon flies in the heavens and so symbolises heaven; the mare roams freely throughout the full extent of the earth and hence symbolises earth. The southwest means to seek assistence from other employing the virtues associated with earth, humility, devotion, cooperation, and responsiveness. In this context the northeast represents the opposite qualities. Therefore, in seeking friends one should avoid arogance, lack of commitment, selfishness, and indifference. Serene perserverance brings good fortune because we adapt ourselves to the situation and accept it for what it is. Hence we are able to do what the sittuation demands of us naturally and are able to make progress in exactly the right way. The sittuation you face requires responsivness to circumstances and devotion to doing the right thing given the specific context in which you find yourself. Responsivness does not mean lasstitude or passivity - it means action that is in accord with the demands of the situation , action that flows naturally with events rather than trying to resist or confront them directly.This is not the time to try to sieze control of things or take the initiative. nor should you move ahead without consulting other people. If you do so, you will only create chaos and confusion. Rather, you should do your best to understand what circumstances require and how can you best adapt to respond to them. To do this, you must put asides your preconceptions and your ego. Keep an open mind. Listen to other people and try and learn from them. Act with generosity and kindness. Put your talents and abilities in the service of others. Seek out friends and helpers to work with. Through devotion, adaptability and careful attention to detail, you can achieve great things. For the text tells us that the receptive, like the dynamic, offers the possibility of supreme success. Receptivity to circumstances is not intertia. It is not the opposite of dynamic action but rather its natural complement. Receptive people follow and adjust to the course of events in the world. They do not try to mold the world to their will or pretend that matters are what they are not. They accept the world as it is and respond to it naturally. They follow the lead of others and consider how to best make a contribution. They assist those who need assistance, they are generous where generosity is required. They put themselves at the disposal of the sittuation so that they can improve it. Although receptive\n" +
                "people do not try to lead or enforce their will, through their resiliance and dedication they nevertheless succed in having the most powerful influence on events. Implicit in receptivness is realism - adapting to things as they are rather than the way we would like them to be. English has a similar metaphor that identifies earth with realism. We say that a realistic person does not have his head in the clouds but is down to earth. This realism is the very oppsite of surrender or capitulation. Indeed, it is the necessary prerequisite to effective action, and to doing what they sittuation truly demands. As the text says, if we set forth blindly, we will soon go astray, but if we follow, we will find guidance from the situation itself. In this way, the situation begins to adapt itself to us even as we adapt ourselves to it. If we do not try to impose willfull preconceptions on the world, it will perpetually surprise us with all manner of possibilities. An attitude of receptivity thus produces a fertility of imagination, which is able to behold a similar fertility in the world itself. Finally, receptivness does not mean conforming to the world resignedly. It means that one acts so as to nurish it. IChingClasses.Kun teaches that through acceptance and adaptability we can redeem what is base and ignoble and make what is good in the world even better. In this way we can bring something to the sittuation, and add peace and prosperity to the world. Instead of trying to dominate or impose our will on those around us, we act as a midwife or assistant, helping others achieve their ends and in this way exerting our influence indirectly, gently, and persistently. IChingClasses.Kun teaches us that one does not have to take the lead in order to have influence, one does not have to be dynamic in order to exercise power, one does not have to be arrogant in order to impress others, and one does not have to be first in everything in order to prevail at the end.";
        String theImage = " The basic disposition of Earth is Receptive. Thus the superior person supports all things with his generous virtue.";
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

    public String getFamilyMember() {
        return familyMember;
    }

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

    public int getNumber() { return number; }

    @Override
    public void create() { new Kun();}
}
