package IChingClasses;

import acm.graphics.GImage;

import java.util.HashMap;

public class YiNurishment extends IChingStone implements IChingLineNames {

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

    public YiNurishment() {
        imagePath = "../IChingImages/UpToSixtyFour/27.YiNurishment.jpg";
        image = new GImage(imagePath);
        element = "Mountain, Thunder";
        qualities = new HashMap<String, String>();
        qualities.put("1", "Nourishing others");
        qualities.put("2", "Being nourished");
        qualities.put("3", "Bulging cheeks");
        qualities.put("4", "Breastmilk");
        qualities.put("5", "Jaws");
        divination = getDivinationText();
        number = 27;
    }

    private HashMap getDivinationText() {
        HashMap divination = new HashMap<String, String>();
        String title = "Yi Nourishment";
        String keywords = "Jaws, Nourishing others, being nourished, you are what you eat";
        String theJudgement = "Nourishment. Perseverance brings good fortune. Observe carefully. How a person provides nourishment to others, and what he seeks to fill his own mouth with";
        String theJudgementDescription = "This hexagram has a double theme: the nourishment of the self and the nourishment of others. Both are important to a happy life. Nourishment of the self means care and cultivation of the self. The Book of Changes is concerned much more than the nutrition that comes from eating good food. Nourishment means proper care of different aspects of the self , including the body, the mind and spirit, just as health of the body is affected by the quality of the food that you take into your mouth, the health of your life is determined by the quality of the activities that you engage in and the ways that you take care of yourself. Thus the lesson of Yi is that you truly are what you eat, when it comes to bodily nutrition and forms of intelectual and spiritual nourishment. If you nourish yourself in the right way, you will be healthier, happier, and better able to deal with the blows and misfortunes of life when they inevitably occur. If you do not attend to your mental, psysical and spiritual health, you will weaken and delibitate yourself. We might make an analogy to junk food, junk food fills you up in the short term, but makes you unhealthy in the long run. There is also spiritual junk food. It is attractive and seductive but ultimately leaves you feeling empty and craving more. It is up to you to decide what nourishment you will take into your body, what ideas you will take into your mind, amd what people you will take into your company. If you neglect exercise and sound diet, you will ruin your body. If you allow negative emotions and focus your thoughts on what it is unimportant or unworthy of you, those thoughts and emotions will frustrate and distract you. If you associate with people who use you and mistreat you, you will harm yourself on the long run. Thus, if you find that you lack peace, it might be because you have brought the causes of disturbance within yourself. A plant that is regularly watered and attended to grows and flourishes. In the same way, whatever you nourish and attend to will grow and become more important in your life. if you nourish the best parts of yourself, you will become a better, happier, and more well adjusted person. You will be better able to handle whatever life throws at you. And you will help realize the full potential of what your life can be. But if you attend to and nourish what is inferior in yourself, those aspects of life will eventually come to dominate you and you will suffer the consequences. Pander to the worst of your character and appetites, and you will debase and devalue yourself and make yourself needlesly unhappy. You will waste your life's potential on what is meaningless and trivial. And you will weaken your body, mind and spirit so that life can more easily overwhelm you and defeat you.The care of your body and your soul is a question of self respect. A person who has proper respect for himself takes care of himself, a person who does not respect himself harms himself. The Book of Changes does not insist that human beings have inherent tendencies and potential for change. You can realize the best parts of your potential for change. You can realize the best parts of your potential through wise activity and cultivation, you will foster the worst part by taking a contrary path. For this reason one can tell you the quality of the people by what they cultivate and what they fail to cultivate, what elements of their character they nourish and what they leave untouched. what they lavish their attention on, and what they neglect.It is not enough to nourish yourself. You must also nourish and care for others. One can judge the quality of people not only by how they take care of themselves but how they take care of others and on whom they bestow their concern. This hexagram suggests that you should think carefully about who you nourish and who you failed to nourish properly. To nourish others is a way to nourish the best parts of yourself. Just as you should exercise judgement in nourishing yourself, you should exercise in nourishing others. Do not waste time on people who abuse you or manipulate you. There is no point in casting your pearls before swine. You should take care of those who cannot take care of themselves, for it is the mark of a superior generous person. But you should not lavish your attention on those who can but who will not properly take care of themselves. If people do not learn to nourish themselves but repeatedly rely on you to help them out of their problems, you are offering the wrong kind of nourishment. You must help them learn to help themselves.";
        String theImage = "At the foot of the mountain, thunder. This is the image of nourishment. Thus the superior person is careful in his choice of his words, and temperate in eating and drinking";
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

    public String getImagePath() { return imagePath;}

    @Override
    public void create() {
        new YiNurishment();
    }
}
