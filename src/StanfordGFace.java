import acm.graphics.*;

import java.awt.*;

public class StanfordGFace extends GCompound {

    public StanfordGFace(double width, double height) {
        head = new GOval( width, height);
        leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
        rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
        nose = createNose(NOSE_WIDTH * width, NOSE_HEIGHT * height);
        mouth = new GArc(MOUTH_WIDTH * width, MOUTH_HEIGHT * height, 180 ,360 );
        mouthFix = new GArc(MOUTH_WIDTH * width, MOUTH_HEIGHT * height, 0 ,180);
        mouthFix.setFilled(true);
        mouthFix.setColor(Color.white);
        mouth.setFilled(true);
        add(head, 0, 0);
        add(leftEye, 0.25 * width - EYE_WIDTH * width / 2, 0.25 * height - EYE_HEIGHT * height / 2);
        add(rightEye, 0.75 * width - EYE_WIDTH * width / 2, 0.25 * height - EYE_HEIGHT * height /2);
        add(nose, 0.5 * width, 0.5 * height);
        add(mouth, 0.5 * width - MOUTH_WIDTH * width / 2, 0.75 * height - MOUTH_HEIGHT * height / 2);
        add(mouthFix, 0.5 * width - MOUTH_WIDTH * width / 2, 0.75 * height - MOUTH_HEIGHT * height / 2);
    }

    /** Creates a triangle for nose */
    private GPolygon createNose(double width, double height) {
        GPolygon triangle = new GPolygon();
        triangle.addVertex(0, - height / 2 );
        triangle.addVertex(width / 2, height / 2);
        triangle.addVertex(-width / 2, height / 2);
        return triangle;
    }

    /* Constant specifyinf feature size as a fraction of the head size */
    private final double EYE_WIDTH = 0.15;
    private final double EYE_HEIGHT = 0.15;
    private final double NOSE_WIDTH = 0.15;
    private final double NOSE_HEIGHT = 0.1;
    private final double MOUTH_WIDTH = 0.5;
    private final double MOUTH_HEIGHT = 0.1;

    /* Private instance variables */
    private GOval head;
    private GOval leftEye, rightEye;
    private GPolygon nose;
    private GArc mouth;
    private GArc mouthFix;
}
