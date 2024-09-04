package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class GeRevolution extends IChingStone implements IChingLineNames {

    GImage image;
    String imagePath;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public GeRevolution(){
        imagePath = "../IChingImages/UpToSixtyFour/49.GeRevolution.jpg";
        image = new GImage(imagePath);
        element = "Lake, Fire";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Molting" );
        qualities.put("2", "Shedding old skin,");
        qualities.put("3", "Metamorphism");
        qualities.put("4", "Transformation");
        qualities.put("5", "Fire under the lake");
        qualities.put("6", "Steamy water");
        qualities.put("7", "Warm pond of lake");
        qualities.put("8", "Molten under the lake");
        familyMember = "";
        partOfBody = new HashMap<String, String>();
        partOfBody.put("1", "");
        animals = "";
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "Mid summer");
        seasonsAndWeather.put("2", "");
        divination = getDivinationText();
        number = 49;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Ge - Revolution";
        String keywords = "Molting, Shedding old skin, Metamorphosis, Transformation, Fire under the lake, Steamy water, Warm pond of lake, Molten under the lake";
        String theJudgement = "Revolution, On your own day, there is confidence, Supreme success, it is beneficial to persevere, regrets vanish";
        String theJudgementDescription = "Revolution means the abolition of an old order in preparations for a new one. Such drastic changes are appropriate only when there is no other alternative. If you are contemplating such a change, it is because you feel things have gone as far as they can in the present form and something entirely new is called for. When you realize that the time has come for revolution in your life it's because they already begun to experience a revolution in your heart. You may find yourself questioning long-held assumptions and beliefs. What once seemed so central and important to you now begins to seem irrelevant and besides the point. All of this seems that your values and experiences are changing. You have begun to see things in different ways. It's dizzying and leaves you uncertain. But it's a necessary precondition to transform of your life. The name of the hexagram, Ge, compares this process to the shedding of an old skin in preparation for a new one. You should not be afraid of the changes you want to make. Now more than ever you need to have the courage and faith in yourself. But before you proceed, you must think of things carefully. Take the time to consider the ramifications of what you are about to do. Radical change that is well motivated and properly prepared invigorates your life. Change that is reckless and ill considered can be very destructive. Remember that you are not the only person affected by the change. You must take other's people feelings are interests into account. Noone goes into a revolution alone, wether by choice or circumstance, one takes many others as well. You will need the support of others if you are to succeed in making a successful transformation. Discuss your change of heart with them and describe what you plan to accomplish. Talk openly about their fears and concerns as well as your own. If you show them that you are not being self-centered, capricious and arbitary but that is what you really need to do, they will be more supportive than you expect. And they might offer helpful advice about how to achieve your next goals. When you have thoroughly considered the need for change and generated the support of others, you are ready to act. Good timing is crucial to a successful transformation.  Do not be afraid to make far-reaching changes in your lifestyle, your habits or your environment. You must change your life in order to make it cohere to who you are now. As the text says, when your day comes, there is confidence. The same principles apply to political revolutions or transformations in large organizations. Drastic change is a very serious matter. It should not be undertaken lightly, but only when there is nothing else to be done. A successful revolution requires a leader who is called to the task. You should not accept radical changes unless you feel a calling to lead and serve others, an inner compulsion that convinces you that change must come and that you must play your part in it. A successful leader must act at the right time, and must gain the support of others. If you do not do this, your attempts will fail. Perhaps most important, you must make the changes not merely for your own sake but for those who follow you. Revolution is justified when it helps the people and not merely their leaders. And you have a duty to guide the movement forward to something creative and positive, and to prevent events from spinning out of control and becoming excessive or destructive. If you can do all these things, you should have no regrets about making the necessary changes.";
        String theImage = "Fire in the lake, this is the image of Ge Revolution, Thus the superior person sets the calendar in order, to illuminate in accordance with the times";
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

    public int getNumber(){return number;}

    public String getImagePath() { return imagePath; }

    @Override
    public void create() { new GeRevolution();}
}
