import acm.graphics.GPolygon;

public class SnowflakeFractal extends GPolygon {

    public SnowflakeFractal(double edge, int order){
        addVertex( -edge / 2, edge / (2 * Math.sqrt(3)));
        addFractalLine(edge, 0, order);
        addFractalLine(edge, -120, order);
        addFractalLine(edge, +120, order);
    }

    private void addFractalLine(double r, int thetha, int order){
        if(order == 0){
            addPolarEdge(r, thetha);
        } else {
            addFractalLine( r /3, thetha, order -1);
            addFractalLine(r / 3, thetha + 60, order -1);
            addFractalLine(r / 3, thetha - 60, order -1);
            addFractalLine( r /3, thetha, order -1);
        }

    }
}
