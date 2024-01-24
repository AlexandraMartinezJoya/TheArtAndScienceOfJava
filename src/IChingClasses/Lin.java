package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class Lin extends IChingStone implements IChingLineNames {

    GImage image;
    String element;
    HashMap qualities;
    String familyMember;
    HashMap partOfBody;
    String animals;
    HashMap seasonsAndWeather;
    HashMap divination;
    int number;

    public Lin(){
        image = new GImage("../IChingImages/UpToSixtyFour/19.Lin.jpg");
        element = "Earth, Lake";
        qualities = new HashMap<String, String>();
        qualities.put("1", "The crying pheasant" );
        qualities.put("2", "Eclipse");
        qualities.put("3", "Hiding one's light");
        qualities.put("4", "Brilliance injured,");
        qualities.put("5", "Censorship");
        qualities.put("6", "Keeping a low profile");
        qualities.put("7", "Hiding your feelings");
        partOfBody = new HashMap<String, String>();
        seasonsAndWeather = new HashMap<String, String>();
        seasonsAndWeather.put("1", "");
        divination = getDivinationText();
        number = 19;
    }

    private HashMap getDivinationText(){
        HashMap divination = new HashMap<String, String>();
        String title = "Ming IChingClasses.Yi ";
        String keywords = "The crying pheasant, eclipse, hiding one's light, brilliance injured, censorship, keeping a low profile, hiding your feelings";
        String theJudgement = "Darkening of the Light, In adversity, it is beneficial to persevere.";
        String theJudgementDescription = "You face unfavorable circumstances. You encounter criticism and opposition, you projects fail to prosper, or those who have control over your life lack confidence in you. Whatever the problem, there is little that you can do about it for the time being. You must wait out the bad times until things take a turn for the better. Because you are currently trapped in a hostile environment, the best strategy right now is to keep a low profile. You must hide your light. If you try to assert yourself, the people who surround you will not be sympathetic and will rebuff you. If you object to your treatment, people will not understand, and you may make things even worse for yourself. Instead of protesting, it is better to allow those in your environment to believe that you accept the situation. Someone may be jealous of you or resent you. You should not give them an opportunity to harm you. Do not be aggressive and do not call attention to yourself. This is no time to pick a fight. Conditions are not in your favor right now, and you do not have the resources to prevail. Nevertheless, during this difficult time you must continue to have faith in yourself. Do not give up just because things are not going well. As the text says, in times of adversity, it is beneficial to remain steadfast and to persevere. It is a test of your will and your endurance. You must preserve your inner light - the still, small voice within. Do not let the darkness on the outside extinguish the light on the inside, for then there will be nothing left of you when times improve. People and events will surely provoke you. But you must maintain your composure and your emotional compass. Do not let what others say and do cause you to lose heart. You cannot let their ignorace or their bad judgement undermine your self-confidence. They see only a small part of the picture. Their values are not your values. And even though things seem rough right now, time has a way of turning present disadvantages into seeds of later advantages. You will not be down forever. Hostile circumstances require you to accept the situation for the time being. You must allow people to think that you acquiesce and are going along. But you must never surrender. Maintain your resistance on the inside. Hold fast to your enduring values and to your ultimate goals. Remember who you are and what you stand for. Even though there is little that you can do at present, you must preserve your integrity during these dark times. Keep your heart and soul steadfast and ever fixed on what is most important. Eventually, things will change for the better, and you will prevail.";
        String theImage = "The light has descended into the center of the earth, this is the image of darkening of light, thus the superior person oversees the masses. He hides his light, yet it still shines.";
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

    void create() { new Lin();}
}
