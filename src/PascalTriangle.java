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
 *  above it to the left and right. Write a GraphicsProgram  that displays
 *
 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class PascalTriangle extends GraphicsProgram {

    public void run(){
        double height = getHeight();
        double width = getWidth();
        double xLocation = width / 2;
        double yLocation = height / 2;
//        GBallWithNumber ballOne = new GBallWithNumber(TRIANGLE_RADIUS, xLocation, yLocation, "1");
//        add(ballOne);
        GBallWithNumber ballTwo = new GBallWithNumber(TRIANGLE_RADIUS *2, xLocation + TRIANGLE_RADIUS , yLocation + TRIANGLE_RADIUS, "2");
//        add(ballTwo);
        double numberOfRows = 7;
        int numberOfballs = 7;
        double y = height - 2 * TRIANGLE_RADIUS;
        while (numberOfRows > 0) {
            double x = (getWidth()/2) - ((BALLS_IN_BASE*TRIANGLE_RADIUS * 2)/2);
            for (int i = numberOfballs; i > 0; i--) {
                GBallWithNumber ballOne = new GBallWithNumber(TRIANGLE_RADIUS, x, y, "1");
                add(ballOne);
                x +=TRIANGLE_RADIUS * 2;
            }
            numberOfballs--;
            numberOfRows--;
            y -= TRIANGLE_RADIUS;
        }
    }

    public final int  TRIANGLE_RADIUS = 35;
    public final int BALLS_IN_BASE = 8;
}
