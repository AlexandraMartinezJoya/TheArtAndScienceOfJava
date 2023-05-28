import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateHexagon extends GraphicsProgram {

    public void run(){
        add(createHexagon(50), getWidth() / 2, getHeight() / 2) ;
        add(createOctagon(50), getWidth() / 4, getHeight() / 4) ;
    }

    private GPolygon createHexagon(double side){
        GPolygon hex = new GPolygon();
        hex.addVertex(-side, 0);
        int angle = 60;
        for (int i = 0; i < 6; i++){
            hex.addPolarEdge(side, angle);
            angle -= 60;
        }
        return hex;
    }

    private GPolygon createOctagon(double side){
        GPolygon hex = new GPolygon();
        hex.addVertex(-side, 0);
        int angle = 45;
        for (int i = 0; i < 7; i++){
            hex.addPolarEdge(side, angle);
            angle -= 45;
        }
        return hex;
    }
}
