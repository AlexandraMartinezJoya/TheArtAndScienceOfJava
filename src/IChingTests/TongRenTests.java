package IChingTests;

import IChingClasses.TongRen;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class TongRenTests  extends ConsoleProgram {

    public void run() {
        TongRen tongRen = new TongRen();
        String tongRenHasSameImage = tongRenHasSameImage(tongRen);
        println(tongRenHasSameImage);
    }

    public String tongRenHasSameImage(TongRen tongRen) {
        String tongRenHasSameImage = "Tong ren has the same image";
        String tongRenDoesNotHaveTheSameImage = "Tong ren does not have the same image";
        GImage expectedImage = new GImage("../IChingImages/UpToSixtyFour/13.TongRen.jpg");
        if(tongRen.getIChingImage().equals(expectedImage)){
            return tongRenHasSameImage;
        } else {
            return tongRenDoesNotHaveTheSameImage;
        }
    }

    public String tongRenHasSameImagePath(TongRen tongRen) {
        String tongRenHasTheSameImagePath = "Tong ren has the same image path";
        String tongRenDoesNotHaveTheSameImagePath = "Tong ren does not have the same image path";
        String expectedImagePath = "../IChingImages/UpToSixtyFour/13.TongRen.jpg";
        if(tongRen.getImagePath().equals(expectedImagePath)) {
            return tongRenHasTheSameImagePath;
        } else {
            return tongRenDoesNotHaveTheSameImagePath;
        }
    }

    public String tongRenHasTheSameElementName(TongRen tongRen) {
        String tongRenHasTheSameElementName = "Tong ren has the same element name and it is "+ tongRen.getElementName() ;
        String tongRenDoesNotHaveTheSameElementName = "Tong ren does not have the same element name";
        String expectedElementName = "Heaven, Fire";
        if(tongRen.getElementName().equals(expectedElementName)) {
            return tongRenHasTheSameElementName;
        } else {
            return tongRenDoesNotHaveTheSameElementName;
        }
    }

    public String tongRenHasTheSameQualities(TongRen tongRen) {
        String tongRenHasTheSameQualities = "Tong ren has the same qualities and they are: "+ tongRen.getElementQualities();
        String tongRenDoesNotHaveTheSameQualities = " Tong ren does not have the same qualities";
        HashMap expectedQualitieis = new HashMap<String, String>();
        expectedQualitieis.put("1", " Joining with others" );
        expectedQualitieis.put("2", "Fellowship");
        expectedQualitieis.put("3", "Concord");
        expectedQualitieis.put("4", "Community");
        expectedQualitieis.put("5", "Keeping the group together");
        expectedQualitieis.put("6", "Fellowship with people");
        if(tongRen.getElementQualities().equals(expectedQualitieis)) {
            return tongRenHasTheSameQualities;
        } else {
            return tongRenDoesNotHaveTheSameQualities;
        }
    }

    public String tongRenHasTheSameDivination (TongRen tongRen) {
        String tongRenHasTheSameDivination = "Tong ren has the same divination with the keywords: " + tongRen.getDivination().get("Keywords");
        String tongRenDoesNotHaveTheSameDivination = "Tong ren does not have the same divination";
        HashMap expectedDivination = new HashMap<String, String>();
        expectedDivination.put("Title", "Tong Ren-Fellowship with people");
        expectedDivination.put("Keywords", "Joining with others, fellowship, concord, community, keeping the group together");
        expectedDivination.put("The Judgement", "Fellowship with people, even in the open fields. Success. It is beneficial to cross the great river. It is beneficial for the superior person to persevere.");
        expectedDivination.put("Judgement Description", "The best way to realize your goals now is through participation in a group. You can achieve great influence and success through a collective endeavor. The group may be your friends, or it may be a political group, a social club, a religious organization, or the people you work with everyday. If you are willing to join in with like-minded people, you can accomplish much more than you ever could on your own. For a group to succeed, people need to feel they have a common purpose and that the members are committed to each other. Trust and reciprocity are essential ingredients to success. The text speaks of fellowship even in the open fields. Fields are a metaphor for what is far and wide, broad and distant. Thus fellowship even in the open fields means fellowship that is maintained through thick and thin, and that can extend to all sorts of people who possess common values and goals. A sense of commitment and shared devotion make it possible for a group to achieve important and ambitious tasks, symbolized by being able to cross the great river. If you find a group with whom you can identify and whose values you admire, give your support without reservation. If others see that you are earnest and sincere, they will be willing to join in as well. Over time, groups are subjected to many stresses and strains. The important thing is to let everyone in the group feel that they are needed and that their contributions are valued. If you take advantage of people or treat them in condescension, they will not be willing to give their all for the group, and they will be more likely to abandon the enterprise in times of hardship. Whatever your position in the fellowship or organization, be open minded and willing to listen to others. Keep the communication lines open not only preserves harmony and stability over time, but it also helps the groups achieve its goals more effectively. The collective intelligence of many people working on a single project is often more powerful and thorough than of any single individual, not matter how talented. Individual efforts and skills become greater than the sum of their parts when they are brought together in a common endeavor.");
        expectedDivination.put("The Image","Heaven and fire combine: this is the image of Fellowship with People, Thus the superior person organizes the clans and makes distinctions among things");
        if(tongRen.getDivination().equals(expectedDivination)) {
            return tongRenHasTheSameDivination;
        } else {
            return tongRenDoesNotHaveTheSameDivination;
        }
    }

    public String tongRenHasTheSameNumber( TongRen tongRen) {
        String tongRenHasTheSameNumber = " Tong ren has the same number and it is: "+ tongRen.getNumber();
        String tongRenDoesNotHaveTheSameNumber = "Tong ren does not have the same number";
        int expectedNumber = 13;
        if(tongRen.getNumber() == expectedNumber) {
            return tongRenHasTheSameNumber;
        } else {
            return tongRenDoesNotHaveTheSameNumber;
        }
    }

}

