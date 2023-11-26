import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateHeartsFromArcs  extends GraphicsProgram {

        public void run() {
                double diamondSide = 100;
                int angle = -45;
                int angle2 = 180;
                GPolygon heart = new GPolygon();

                angle += 90;
                heart.addPolarEdge(diamondSide, angle);
                angle += 90;
                heart.addPolarEdge(diamondSide, angle);
                heart.addArc(diamondSide, diamondSide, -angle ,  -angle2);
                heart.addArc(diamondSide, diamondSide, angle, -angle2);

                add(heart , getWidth() / 2 - diamondSide, getHeight() / 2 + diamondSide);
        }
}
