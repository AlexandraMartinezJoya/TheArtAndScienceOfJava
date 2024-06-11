package WoraklsSoGood.KevinRodriguez.IChing;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class IChingStoneModel extends GraphicsProgram {

    private GImage modelImage;
    private String stoneName;

    public IChingStoneModel(String lineOne, String lineTwo, String lineThree) {
        if(lineOne.equals("StraightLine") && lineTwo.equals("StraightLine") && lineThree.equals("StraightLine")){
            modelImage = new GImage("IChingImages/Qian.png");
            stoneName = "Qian";
        }
        if(lineOne.equals("StraightLine") && lineTwo.equals("StraightLine") && lineThree.equals("BrokenLine")) {
            modelImage = new GImage("IChingImages/Xun.png");
            stoneName = "IChingClasses.Xun";
        }
        if(lineOne.equals("StraightLine") && lineTwo.equals("BrokenLine") && lineThree.equals("BrokenLine")) {
            modelImage = new GImage("IChingImages/Gen.png");
            stoneName = "IChingClasses.Gen";
        }
        if(lineOne.equals("StraightLine") && lineTwo.equals("BrokenLine") && lineThree.equals("StraightLine")){
            modelImage = new GImage("IChingImages/Li.png");
            stoneName = "IChingClasses.Li";
        }
        if(lineOne.equals("BrokenLine") && lineTwo.equals("BrokenLine") && lineThree.equals("BrokenLine")) {
            modelImage = new GImage("IChingImages/Kun.png");
            stoneName = "IChingClasses.Kun";
        }
        if(lineOne.equals("BrokenLine") && lineTwo.equals("BrokenLine") && lineThree.equals("StraightLine")) {
            modelImage = new GImage("IChingImages/Zhen.png");
            stoneName = "IChingClasses.Zhen";
        }
        if(lineOne.equals("BrokenLine") && lineTwo.equals("StraightLine") && lineThree.equals("BrokenLine")) {
            modelImage = new GImage("IChingImages/Kan.png");
            stoneName = "IChingClasses.Kan";
        }
        if(lineOne.equals("BrokenLine") && lineTwo.equals("StraightLine") && lineThree.equals("StraightLine")) {
            modelImage = new GImage("IChingImages/Dui.png");
            stoneName = "IChingClasses.Dui";
        }
    }

    public GImage getImage() {
        return  modelImage;
    }

    public String getStoneName() {
        return stoneName;
    }
}
