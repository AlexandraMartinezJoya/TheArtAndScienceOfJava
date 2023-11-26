import acm.program.GraphicsProgram;

import java.awt.*;

public class drawSnowflakes extends GraphicsProgram {

    public void run() {
//        SnowflakeFractal snowflake = new SnowflakeFractal(100, 5);
//        add(snowflake, 300, 300);

        SnowFlakeOne newSnowflake = new SnowFlakeOne(SnowflakeType.SNOWFLAKE_TYPE_ONE, 40);
        newSnowflake.setFilled(true);
        newSnowflake.setColor(LIGHT_BLUE);
        newSnowflake.setFillColor(LIGHT_BLUE);

        add(newSnowflake, 200, 200);
    }

    private final Color PURPLE_COLOR = new Color(163, 73, 164);
    private final Color LIGHT_BLUE = new Color(202,242, 240);

}
