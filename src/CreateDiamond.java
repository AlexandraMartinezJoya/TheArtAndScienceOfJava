import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateDiamond extends GraphicsProgram {

    public void run(){
        GPolygon diamond = new GPolygon();
        diamond.addVertex( - DIAMOND_WIDTH / 2, 0 );
        diamond.addVertex(  0, DIAMOND_HEIGHT / 2 );
        diamond.addVertex( DIAMOND_WIDTH / 2, 0 );
        diamond.addVertex(  0, - DIAMOND_HEIGHT / 2 );

        add(diamond, (double)getWidth() / 2, (double)getHeight() / 2);


        GPolygon secondDiamond = new GPolygon();
        secondDiamond.addVertex( - DIAMOND_WIDTH/ 2, 0);
        secondDiamond.addEdge(  DIAMOND_WIDTH/ 2, DIAMOND_HEIGHT / 2);
        secondDiamond.addEdge(  DIAMOND_WIDTH/ 2, - DIAMOND_HEIGHT / 2);
        secondDiamond.addEdge( - DIAMOND_WIDTH/ 2, - DIAMOND_HEIGHT / 2);
        secondDiamond.addEdge(  - DIAMOND_WIDTH/ 2, DIAMOND_HEIGHT / 2);
        add(secondDiamond, (double)getWidth() / 4, (double)getHeight() / 4);

        GDiamond diamond1 = new GDiamond(100);
        add(diamond1, (double)getWidth() / 3 ,(double)getHeight() / 2);


        GPolygon newDiamond = new GPolygon();
        newDiamond.addVertex( -DIAMOND_SIDE * 4, DIAMOND_SIDE  * 4  );
        int angle = -45;
        for(int i = 0; i < 4; i ++){
            newDiamond.addPolarEdge(DIAMOND_SIDE, angle);
            angle += 90;
        }
        add(newDiamond, getWidth()  * 1.88 , getHeight() - getHeight() * 2 + 1.44 * DIAMOND_SIDE );
    }

    private final double DIAMOND_SIDE = 100;
    private final double DIAMOND_WIDTH = 80;
    private final double DIAMOND_HEIGHT = 120;
}
