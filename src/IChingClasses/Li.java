package IChingClasses;

import acm.graphics.GImage;
import java.util.HashMap;

public class Li extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Li() {
        image = new GImage("../IChingImages/UpToSixtyFour/30.Li.jpg");
        element = "Fire, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Fire" );
        qualities.put("2", "Brilliance");
        qualities.put("3", "Clarity");
        qualities.put("4", "Shedding light on things");
        qualities.put("5", "Enlightenment");
        familyMember = "Middle Daughter";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "eye");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Middle Summer");
        divination = getDivinationText();
        number = 30;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "IChingClasses.Li";
        String keywords = "Fire, Brilliance, Clarity, Shedding light on things, Enlightment";
        String theJudgement = "Radiance, It is beneficial to persevere, success, raising a cow brings good fortune";
        String theJudgementDescription = "The two great themes of IChingClasses.Li and enlightenment and interdependece. Fire sheds light on everything as its radiance extends outward, but it burns brightly only as long as it fuel to draw on. As long as fuel lasts, the fire lasts. Whatever gives light, clarifies, and enlightends depends on something else to which it clings, something whose persistence and perseverence allows the light to shine. Hence the text says that in order to be radiant, it is beneficial to persevere. Our brilliance cannot continue long if we do not take care to preserve t he things that allow us to shine. Enlightment means understanding the conditioned and interdependent nature of existancec - how things depend on each other for their being and their continuation. What seems to be self-sustaining and independent actually clings to something else that is the source of its power and preservation. When what supports a thing changes, so too must the thing that depends on it. It is like the flame that clings to its fuel, when the fuel is exhausted, the fire will not last long. We cannot change one element in an interconnected system without changing the other as well, or remove one element without affecting the things that depend on it and on which it depends. If we fail to understand the multiple forms of interdependence in life, the network of interrelated causes and effects, and the existence of synergies and interconnection, we are not truly enlightened. So it is with human life. The life of human beings is not free and independent. It is conditioned on circumstances and, in particular, on other human beings. If you wish to gain clarity in your life, you must understand who and what you depend on and what depends on you. You are never free of everything and everyone . You cling to something just as a fire clings to its fuel. But it is up to you to decide what to cling on. If you cling to what is beneficial and healthy, you will be secure and your life will be well ordered. If you cling to what is disordered and decaying, you will be thrown about as condition change, and your position and your peace of mind will not last long. If you hold onyo thing that are bad for you, or have outlived their usefulness in your life, you are enslaved. But if you cling to what is good and ally yourself with what is beneficient and harmonious, you are free. Human freedom emerges out of unfreedom, out of the spaces created by our conditioned existence and our dependence to others. To realize freedom you must first understand those condition and interdependencies. That is the sense in which enlightment makes a person free. It is not because having understood your sitation you are no longer conditioned or interdependent, it is because you come to understand its hidden possibilities - what can be changed and what cannot. This knowledge allows you to imagine how to capitalize on dependencies and create new synergies. In this way you can achieve success. According to the text, \"raising a cow\" brings good fortune. The cow symbolizes docilirty, the care of the cow symbolizes nurturance. Enlightment means accepting the world for what it is. recognizing one's connection to others, and taking care of what needs taking care of. This is the path to clarity and peace. Acceptance does not mean resignation. It means facing up to the facts. Only when we accept the world can we begin to work with it to imrpove it and our situation within it. Do not cling to the past, for it is gone and it will not return. Accept change. Be open-minded and adaptable. Don't overreact with anger or despair and don't bury your head in the sand. Don't bemoan your fate. Consider how you can change things for the better, given the situation you now face. Nurture others and you will nurture yourself.";
        String theImage = "Brightness doubled generates radiance that spreads in all directions. This is the image of Fire. In the same way great people perpetuate their brilliance, to illuminate the four corners of the world";
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
    public void create() { new Li();}
}
