package Chapter3;

import acm.program.ConsoleProgram;

/***
 * This program displaying the total area of your apple cinnamon pie
 *
 * Solved by @AlexandraMartinezJoya
 */
public class AreaOfCircle extends ConsoleProgram {

        public void run(){
            println("This program calculates the area of a apple cinnamon pie, of radius of your choosing.");
            double pieRadius = readDouble("Please enter circle radius: ");
            double appleCinnamonPie = PI * pieRadius * pieRadius;
            println("The area of the circle is " + appleCinnamonPie);
        }

        /*private constants*/
        private final double PI = 3.14159265;

}
