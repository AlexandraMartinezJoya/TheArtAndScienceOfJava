import acm.program.GraphicsProgram;

public class drawStars extends GraphicsProgram {

    public void run (){
        double starWidth = 35;
        Star fourPoint = new AbstractStarFactory().createStar(StarType.FOUR_POINT, starWidth );
        add(fourPoint, 100 , 100);
        Star fivePoint = new AbstractStarFactory().createStar(StarType.FIVE_POINT, starWidth);
        add(fivePoint, 150, 100);
        Star sixPoint = new AbstractStarFactory().createStar(StarType.SIX_POINT, starWidth);
        add(sixPoint, 200, 100);
        Star eightPoint = new AbstractStarFactory().createStar(StarType.EIGHT_POINT, starWidth);
        add(eightPoint, 250, 100);
        Star tenPoint = new AbstractStarFactory().createStar(StarType.TEN_POINT, starWidth);
        add(tenPoint, 320, 100);
        Star twelvePoint = new AbstractStarFactory().createStar(StarType.TWELVE_POINT, starWidth);
        add(twelvePoint, 400, 100);
    }
}
