/**
 * Chapter 5 introduced the function combination(n, k), which returns the number of ways in which one can choose k items out of a set of n distinct objects.
 * One of the classic ways to visualize the combinations function is called "Pascal's triangle" , after the seventenths century french mathematician called
 * Blaise Pascal , even though it was known by the Chineese mathematicians over 2000 years ago. The top row triangle contains the entry combinations
 * (0, 0) The next row contains combinations (1, 0), and combinations (1, 1). The pattern continues from there, with n increasing as you move downward
 * and k increasing as you move across the triangle from left to right, as shown in the following diagram:
 *
 * n=0  ->                    1
 * n=1                    1        1
 * n=2                1       2      1
 * n=3             1      3       3      1
 * n=4          1            4       4        1
 * n=5         1    5     10     10       5      1
 *  n=6      1     6     15      20     15     6     1
 *  n=7    1     7     21     35     35    21     7     1
 *
 *  In the triangle, each value along the left or right edge is simply 1, and each value in the interior or the triangle is the sum of the two values diagonally
 *  above it to the left and right. Write a GraphicsProgram  that displays first several ways of Pascal's triangle as shown in the first sample run.
 *  The top circle should be centered horizontally a few pixels below the top of the window. Your program should then generate additional rows of the triangle
 *  as long as all the circles in the new row will fit the canvas. As soon as the circles in a row would extend past the sides or the bottom of the canvas, the progam should stop.
 *
 */
import acm.program.GraphicsProgram;

public class PascalTriangle extends GraphicsProgram {

    public void run(){

        double width = getWidth() / 2 ;
        double height = 3 + 2 * BALL_RADIUS;
        int currentRow =1;
        int currentBallsInRow = 1;
        int maxRows =(int) ((getHeight() -  BORDER) / (2 * BALL_RADIUS  + BORDER  ));
        int maxBallsInRow = maxRows;
        int numOfBricks = maxBallsInRow;
        int numOfRows = maxRows;
        double y =getHeight() - 30 ;
        while (numOfRows > 0) {
            double x = (getWidth()/2) - ((numOfBricks* 2 *BALL_RADIUS)/2);
            for (int i = numOfBricks; i > 0; i--) {
                int number = combinations(i, numOfBricks);
                println("Iterator is " + i);
                println("row number is : " + numOfRows);
                GBallWithNumber ballWithNumber = new GBallWithNumber(BALL_RADIUS, x, y, "1");
                add(ballWithNumber);
                x += 2 * BALL_RADIUS +2 * BORDER;
            }
            numOfBricks--;
            numOfRows--;
            y -= 2 * BALL_RADIUS + 1.5 *  BORDER;
        }
    }

    private int combinations(int n, int k){
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public final int  BALL_RADIUS = 25;
    public final int BALLS_IN_BASE = 8;
    public final double BORDER = 5;
}
