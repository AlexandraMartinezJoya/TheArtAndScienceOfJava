import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class createIsoscelescTriangle extends GraphicsProgram {

    public void run(){
        add(createIsoscelescTriangle(50), getWidth() /2, getHeight() /2);
    }


    private GPolygon createIsoscelescTriangle(double side){
        GPolygon triangle = new GPolygon();
        triangle.addVertex(-side / 2, 0);
        int angle = 120;
        for (int i = 0; i < 2; i++){
            triangle.addPolarEdge(side, angle);
            angle += 90;

        }
        return triangle;
    }
}
