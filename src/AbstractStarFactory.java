public class AbstractStarFactory {

    Star star;

    Star createStar(StarType type, double width) {
        switch (type){
            case FOUR_POINT :
                star = new FourPointStar(StarType.FOUR_POINT, width); break;
            case FIVE_POINT:
                star = new FivePointStar(StarType.FIVE_POINT, width); break;
            case SIX_POINT:
                star = new SixPointStar(StarType.SIX_POINT, width); break;
            case EIGHT_POINT:
                star = new EightPointStar(StarType.EIGHT_POINT, width); break;
            case TEN_POINT:
                star = new TenPointStar(StarType.TEN_POINT, width); break;
            case TWELVE_POINT:
                star = new TwelvePointStar(StarType.TWELVE_POINT, width); break;
            default:
                star = new EightPointStar(StarType.EIGHT_POINT, width);
        }
        return star;
    }
}
