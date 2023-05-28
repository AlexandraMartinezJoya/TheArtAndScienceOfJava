import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

public class ColoredLabels extends GraphicsProgram {

    /**
     * Private constants
     */
    private final int MAX_LABELS = 7;
    
    /** Instance variable */
    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        for(int i = 1; i <= MAX_LABELS; i++){
            addLabel(i);
        }
    }

    private void addLabel(int labelNumber){
        switch (labelNumber) {
            case 1 -> addCustomLabel("red");
            case 2 -> addCustomLabel("orange");
            case 3 -> addCustomLabel("yellow");
            case 4 -> addCustomLabel("green");
            case 5 -> addCustomLabel("cyan");
            case 6 -> addCustomLabel("blue");
            case 7 -> addCustomLabel("magenta");
        }
    }
    
    private void addCustomLabel(String colorKeyword){
        double x = rgen.nextDouble(100, 300);
        double y = rgen.nextDouble(50, 300);
        Color thisColor = getAppropriateColor(colorKeyword);
        GLabel colorfull = new GLabel(colorKeyword, x, y);
        colorfull.setColor(thisColor);
        add(colorfull, x, y);
    }
    
    private Color getAppropriateColor(String colorKeyword){
        Color myColor = switch (colorKeyword) {
            case "red" -> getcolorForRed();
            case "orange" -> getColorForOrange();
            case "yellow" -> getColorForYellow();
            case "green" -> getColorForGreen();
            case "cyan" -> getColorForCyan();
            case "blue" -> getColorForBlue();
            case "magenta" -> getColorForMagenta();
            default -> Color.BLACK;
        };
        return myColor;
    }
    
    private Color getcolorForRed (){
        return Color.RED;
    }


    private Color getColorForOrange (){
        return Color.ORANGE;
    }

    private Color getColorForYellow (){
        return Color.YELLOW;
    }


    private Color getColorForGreen (){
        return Color.GREEN;
    }


    private Color getColorForCyan (){
        return Color.CYAN;
    }


    private Color getColorForBlue (){
        return Color.BLUE;
    }


    private Color getColorForMagenta(){
        return Color.MAGENTA;
    }
}
