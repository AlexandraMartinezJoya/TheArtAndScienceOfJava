import java.awt.*;

public class SnowflakeTwo extends Snowflake {

    public SnowflakeTwo(SnowflakeType type, double width) {
        super(type, width);
    }

    @Override
    protected void create(double width) {
        star = new SixPointStar(StarType.SIX_POINT, width);
    }

    @Override
    public void setFilled(boolean b) {
        Color myColor = star.getColor();
        star.setFilled(b);
        star.setFillColor(myColor);
    }

    @Override
    public boolean isFilled() {
        return star.isFilled();
    }

    @Override
    public void setFillColor(Color color) {
        star.setFillColor(color);
    }

    @Override
    public Color getFillColor() {
        return null;
    }

    Star star;
}
