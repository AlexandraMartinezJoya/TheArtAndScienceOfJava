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

    }

    private final double TRAPEZOID_BASE = 120;
    private final double TRAPEZOID_TOP = 100;
    private final double TRAPEZOID_EDGE = 60;

    private final double DIAMOND_WIDTH = 80;
    private final double DIAMOND_HEIGHT = 120;
}
