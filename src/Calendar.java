import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Calendar extends GraphicsProgram {

    public void run(){
        drawCalendarTtitle();
        drawCalendarOutline();
    }

    private void drawCalendarTtitle() {
            double width = getWidth();
            GLabel monday = new GLabel("Monday");
            monday.setFont("SansSerif-Bold");
            double cellSize = width / NUMBER_OF_ROWS;
            add(monday, 0 + START_PADDING , TABLE_TITLE_HEIGHT);
            GLabel tuesday = new GLabel("Tuesday");
            tuesday.setFont("SansSerif-Bold");
            add(tuesday,   cellSize ,TABLE_TITLE_HEIGHT);
            GLabel wednesday = new GLabel("Wednesday");
            wednesday.setFont("SansSerif-Bold");
            add(wednesday, 2 * cellSize , TABLE_TITLE_HEIGHT);
            GLabel thursday = new GLabel("Thursday");
            thursday.setFont("SansSerif-Bold");
            add(thursday,  3 * cellSize , TABLE_TITLE_HEIGHT);
            GLabel friday = new GLabel("Friday");
            friday.setFont("SansSerif-Bold");
            add(friday,  4 * cellSize , TABLE_TITLE_HEIGHT);
            GLabel saturday = new GLabel("Saturday");
            add(saturday,  5 * cellSize , TABLE_TITLE_HEIGHT);
            saturday.setFont("SansSerif-Bold");
            GLabel sunday =  new GLabel("Sunday");
            sunday.setFont("SansSerif-Bold");
            add(sunday, 6 * cellSize , TABLE_TITLE_HEIGHT );
    }

    private void drawCalendarOutline(){
        drawCalendarLines();
        addCalendarDays();
    }

    private void drawCalendarLines(){
        double rectWidth = (double) getWidth()  / N_COLUMNS ;
        double rectHeight = ((double) getHeight()  - TABLE_TITLE_HEIGHT ) / N_ROWS ;
        for ( int i = 0 ; i < N_ROWS; i++) {
            for (int j = 0; j < N_COLUMNS; j++){
//                if( i == 0){
//
//                }
                double x = j * rectWidth;
                double y = i * rectHeight;
                if(i == 0  && y == 0) {
                    y  = TABLE_TITLE_HEIGHT;
                } else {
                    y = TABLE_TITLE_HEIGHT + i * rectHeight;
                }
                GRect sq = new GRect(x, y, rectWidth, rectHeight);
                add(sq);

            }
        }
    }

    private void addCalendarDays(){

    }

    /**
     * The number of days in the month according to the book exercise
     */
    private final int   DAYS_IN_MONTH = 31;

    /**
     *The day of the week on which the month starts
     * Sunday = 0, Monday = 1, Tuesday = 2; and so on
     */
    private int DAY_MONTH_STARTS = 5;

    /**
     * Private constants
     */
    private int NUMBER_OF_ROWS = 7;
    private int N_ROWS = 6;
    private int N_COLUMNS = 7;
    private int NUMBER_OF_DAYS_IN_WEEK = 7;
    private int START_PADDING = 15;
    private int TABLE_TITLE_HEIGHT = 30;
}
