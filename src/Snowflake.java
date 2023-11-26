
import acm.graphics.GCompound;
import acm.graphics.GFillable;

public abstract class Snowflake extends GCompound implements GFillable {

    SnowflakeType type;
    double width;

    Snowflake(SnowflakeType type, double width ){
        this.type = type;
        this.width = width;
    }

    abstract void create( double width);

}
