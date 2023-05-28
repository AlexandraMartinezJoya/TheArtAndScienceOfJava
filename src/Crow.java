import acm.graphics.*;

import java.awt.*;

public class Crow extends GCompound  {

    private boolean isFilled;
    private Color fillColor;
    private double CROW_HEAD_SIZE_RADIUS = 30;

    /**
     * Creates a Legendary CROW
     * append
     */
    public Crow(){

        double widthPos = getWidth() / 2;
        double heightPos = getHeight() /2;

        drawCrowHead(widthPos, heightPos);
        drawCrowNeck();
        drawCrowBody();
        drawCrowLegs();
    }

    private void drawCrowHead(double widthPos, double heightPos){
        drawHeadShape( widthPos,  heightPos);
        addCrowSuperCoolHairWhichCannotBeUsedInSalon();
        addCrowWEyes();
        addCrowBeak();
    }

    private void addCrowSuperCoolHairWhichCannotBeUsedInSalon(){

    }

    private void addCrowEyes(){

    }

    private void addCrowWEyes(){

    }

    private void addCrowBeak(){

    }

    private void drawHeadShape(double widthPos, double heightPos){
            double headInitialXPosition = widthPos;
            double headInitialYPosition = heightPos;
            GOval headShape = new GOval(CROW_HEAD_SIZE_RADIUS * 2,  CROW_HEAD_SIZE_RADIUS * 2 );
            add(headShape, widthPos , heightPos);
            markAsComplete();
    }

    private void drawCrowNeck(){

    }

    private void drawCrowBody(){

    }

    private void drawCrowLegs(){

    }

    public void setFilled(boolean var1) {

        this.isFilled = var1;
        this.repaint();
    }

    public boolean isFilled() {

        return this.isFilled;
    }

    public void setFillColor(Color var1) {

        this.fillColor = var1;
        this.repaint();
    }

    public Color getFillColor() {

        return this.fillColor == null ? this.getColor() : this.fillColor;
    }
}
