public class AbstractSnowflakeFactory {

    Snowflake snowflake;

    Snowflake createSnowflake (SnowflakeType type, double width){
        switch (type){
            case SNOWFLAKE_TYPE_ONE:
                snowflake = new SnowFlakeOne(type, width);
                break;
            case SNOWFLAKE_TYPE_TWO:
                snowflake = new SnowflakeTwo(type, width);
                break;
            case SNOWFLAKE_TYPE_THREE:
//                snowflake = new SnowflakeThree(type, width);
                break;
            default:
                snowflake = new SnowFlakeOne(type, width);
        }
        return snowflake;

    }
}
