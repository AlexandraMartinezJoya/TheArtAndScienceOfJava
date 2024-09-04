
import IChingClasses.Qian;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class QuianTests extends ConsoleProgram {

    GImage thisImage;

    public String isQuianImage(GImage quianImage) {
        String isSameImage = "This is the same image";
        String isNotSameImage = "This is not the same image";
        thisImage = new GImage("../IChingImages/UpToSixtyFour/1.Qian.jpg");
        if (thisImage.equals(quianImage)) {
            return isSameImage;
        } else {
            return isNotSameImage;
        }
    }

    //TO CHECK Further
    public String isQuianSamePath(GImage quianImage) {
        String isSameImagePath = "This is the same image path";
        String isNotSameImagePath = "This is not the same image path";
        String imagePath = "../IChingImages/UpToSixtyFour/1.Qian.jpg";
        String thisImage = "Quian Image has a temporary path link in the util package  @ EventObject . At current development level image can only be extended";
        return thisImage;
    }

    public String isClassImagePathTheSame(Qian qian){
        String isTheSameImagePath = "The image path is the same and is: "+ qian.getImagePath();
        String isNotTheSameImagePath = "The image path is not the same";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/1.Qian.jpg";
        if(qian.getImagePath().equals(expectedImagePath)) {
            return isTheSameImagePath;
        } else {
            return isNotTheSameImagePath;
        }
    }

    public String isSameElementName(String quianElementName, String elementName) {
        String isSameElementName = "The element name is correct";
        String isNotSameElementName = "The element name is not the same";
        if (quianElementName.equals(elementName)) {
            return isSameElementName;
        } else {
            return isNotSameElementName;
        }
    }



    public String hasSameElementQualities(HashMap elementQualitiesShouldBe, HashMap elementQualities) {
        String haveTheSameQualities = "Quian element has the same qualities";
        String doesNotHaveTheSameQualities = "Quian element does not have the same qualities";
        if (elementQualitiesShouldBe.equals(elementQualities)) {
            return haveTheSameQualities;
        } else {
            return doesNotHaveTheSameQualities;
        }
    }

    public String isTheSameFamilyMember(String familyMemberShouldBe, String familyMemberIs) {
        String hasTheSameFamilyMember = "Quian element has father as family member";
        String doesNotHaveTheSameFamilyMember = "Quian element does not have father as family member";
        if (familyMemberShouldBe.equals(familyMemberIs)) {
            return hasTheSameFamilyMember;
        } else {
            return doesNotHaveTheSameFamilyMember;
        }
    }

    public String hasTheSameBodyPart(HashMap quianBodyPart, HashMap thisBodyPart) {
        String hasSameBodyParts = "";
        if (quianBodyPart.equals(thisBodyPart)) {
            hasSameBodyParts ="Quian element has the same body parts";
        } else {
            hasSameBodyParts =  " Quian element has the same body part";
        }

        return hasSameBodyParts +  " \nThe Equals method considers an empty hash map and one with set parameters to be same value";
    }

    public String hasSameParametersInEachBodyPart(HashMap quianBodyPart, HashMap thisBodyPart) {
        String bodyPartOne = quianBodyPart.get("1").toString();
        String bodyPartTwo = quianBodyPart.get("2").toString();
        String thisBodyPartOne = thisBodyPart.get("1").toString();
        String thisBodyPartTwo = thisBodyPart.get("2").toString();
        String returnValue = "";
        if (bodyPartOne.equals(thisBodyPartOne)) {
            returnValue.concat("The first body parts have same value");
        } else {
            returnValue.concat("The first body parts do not have the same value");
        }
        if (bodyPartTwo.equals(thisBodyPartTwo)) {
            returnValue.concat("\br The second body parts have the same value");
        } else {
            returnValue.concat("\br The second body parts do not have the same value");
        }

        return returnValue;
    }

    public String isTheSameAnimal(String quianAnimal, String thisAnimal) {
        if(quianAnimal.equals(thisAnimal)) {
            return "The quian animal value is correct : ".concat(quianAnimal);
        } else {
            return "The quian element is not corrent";
        }
    }

    public String areTheSameSeasonsAndWeather(HashMap seasonAndWeather, HashMap thisSeasonAndWeather) {
        if(seasonAndWeather.equals(thisSeasonAndWeather)){
            return "The seasons and weather are the same";
        } else {
            return "The seasons and weather are not the same";
        }
    }

    public String seasonsAndWeatherHasSameKeyAndValuesAsExpected(HashMap seasonsAndWeather) {
        String returnAnswer = "";
        Object keyOne = seasonsAndWeather.get("1");
        String quianKeyOne = keyOne.toString();
        if(quianKeyOne.equals("Early Winter")) {
            returnAnswer = "The first key is 1 and is Early Winter";
        } else {
            returnAnswer = "The first key is 1 and is NOT Early Winter";
        }
        Object keyTwo = seasonsAndWeather.get("2");
        String quianKeyTwo = keyTwo.toString();
        if(quianKeyTwo.equals("Cold")) {
            returnAnswer = returnAnswer.concat("\br The second key is 2 and is Cold");
        } else {
            returnAnswer = returnAnswer.concat("\br The second key is 2 and is Not Cold");
        }
        Object keyThree = seasonsAndWeather.get("3");
        String quianKeyThree = keyThree.toString();
        if(quianKeyThree.equals("Ice")) {
            returnAnswer = returnAnswer.concat("\br The second key is 3 and is Ice");
        } else {
            returnAnswer = returnAnswer.concat("\br The second key is 3 and is Not Ice");
        }
        return returnAnswer;
    }

    public String isDivinationSameAsExpected(HashMap quianDivination){
        String returnAnswer = "";
        String quianTitle = quianDivination.get("Title").toString();
        String titleShouldBe = "Qian - TheDynamic";
        if(titleShouldBe.equals(quianTitle)){
            returnAnswer =  returnAnswer.concat("Qian title is : ").concat(quianTitle);
        } else {
            returnAnswer = returnAnswer.concat("Qian title is: ").concat(quianTitle).concat("and should be: ").concat(titleShouldBe);
        }
        String quianKeywords = quianDivination.get("Keywords").toString();
        String expectedKeywords = "Activity, Creativity, Dynamic force, Assertion, Strength, Decisiveness, Strong action, Going forward, Moving Upward, Undertaking something, Constant and ceaseless exertion";
        if(quianKeywords.equals(expectedKeywords)) {
            returnAnswer = returnAnswer.concat("\nThe string keywords are same as expected: ").concat(quianKeywords);
        } else {
            returnAnswer = returnAnswer.concat("\nThe string keywords are not the same as expected");
        }
        String quianJudgement = quianDivination.get("The Judgement").toString();
        String expectedJudgement = "The Dynamic, Supreme Success, It is Beneficial to Persevere";
        if(quianJudgement.equals(expectedJudgement)) {
            returnAnswer = returnAnswer.concat("\nThe string judgement is the same as expected: ").concat(quianJudgement);
        } else {
            returnAnswer = returnAnswer.concat("\nThe string judgement is not the same as expected");
        }

        String quianJudgementDescription = quianDivination.get("Judgement Description").toString();
        String expectedJudgementDescription = "The Book of Changes begins with the dynamic principle, which has four basic attributes. It is fundamental (sublime, originating, and supreme), successful (bestowing power), beneficial (advantageous, and morally appropriate), and persevering(determined, steadfast, and upright). These are the four virtues of the Book of Changes. The four Chinese words for these attributes (yuan, heng li zhen) are often used to represent the four seasons, or virtually anything that can be divided into four. The four virtues are usually paired: fundamental with successful, and beneficial with persevering. Thus, the text says that dynamic action will help you achieve supreme success, and it is beneficial to persevere, to keep moving forward. To conduct yourself in accordance with the nature of the times, you should make the four virtues your own: attend to what is basic and fundamental, and perserve in what is beneficial and morally upright/ The text enjoins you to use your creative power for good - to bring order out of chaos, beauty out of squalor, peace out of tumult, and justice out of injustice. Quian signifies that you are in a very favorable situation if you take the right approach. This is not a time to hold back. Rather, you must take strong, decisive action. Seize the initiative. Go out into the world and make a difference. Be creative. Look for fresh and original ways to solve your problems. It is time to try something new and bold. If you move forward now with confidence, others will have confidence in you. If you are willing to act on your belifs and stand up for what you belive is right, people will look up to you and follow you. Your energy and enthusiasm will inspire them and this will help you achieve your goals. Have faith in yourself and maintain a positive attitude. You have every reason to be optimistic. ANd the more optimistic and enthusiastic you are about your project, the more you will help to ensure your ultimate success. No matter how dynamic and forceful you may be, however, strong action will amout to nothing if it is not for the right purposes. If you want to harness the right kind of creative power, you must be convinced that you are doing is correct and you must steadfastly maintain your integrity and uprightness. Go back to basics. Return to your most fundamental principles. People who know that their cause is just are the most powerful of all. Their heart, mind and spirit all aim at the same end. They embody the dynamic principle perfectly, hence they are like a force of nature. Because they harbor no doubts or inner conflicts, their energy and initiative are put to their highest use, and that is why they succeed. In the same way if you want to make the most of this propitious hour, you must devote yourself to something that is truly worthy. You must employ your energies for honorable goals. Do not waste your time on things that are base, trivial or beneath you. The moment for creative action will not last forever, so do not squander it. Strong action also will not succeed if it not carefully thought through and carried forward. Do not confuse dynamism with recklessness or creativity with carelessness. Plan ahead. Try and gauge the consequences of what you are about to do. Marshal your resources carefully, and when the time is right, do not be afraid to move forward boldly and decisively. Moreover, once you have begun, you must finish what you start. Behind creativity there must be commitment or your plans will amount to nothing. You must keep moving forward steadily and determinedly until you succeed. Hence the text says that it is beneficial to persevere.";
        if(quianJudgementDescription.equals(expectedJudgementDescription)) {
            returnAnswer = returnAnswer.concat("\nThe judgement description is same as expected: ").concat("\n").concat(quianJudgementDescription);
        } else {
            returnAnswer = returnAnswer.concat("\nThe judgement description is not the same as expected");
        }

        return returnAnswer;
    }

    public String isSameNumber(int quianNumber, int expectedQuianNumber){
        String isSameNumber = "";
        if(quianNumber == expectedQuianNumber) {
            isSameNumber = "Quian has same number and it is ".concat (String.valueOf(quianNumber));
        } else {
             isSameNumber = "Quian does not have same number";
        }
        return isSameNumber;
    }

}