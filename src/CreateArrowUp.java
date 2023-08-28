import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateArrowUp extends GraphicsProgram {

    public void run() {
        double diamondSide = 100;
        int angle = -45;
        int angle2 = 180;

        GPolygon arrowUp = new GPolygon();
        for(int i = 0; i < 3; i++){
            angle += 90;
            arrowUp.addPolarEdge(diamondSide, angle);
            if(i == 2){
                arrowUp.addArc(diamondSide, diamondSide, -angle ,  -angle2);
                arrowUp.addArc(diamondSide, diamondSide, angle, -angle2);
            }
        }
        add(arrowUp, 300, 300);
    }
}
