package Chapter3;

import acm.program.ConsoleProgram;

/***
 * This program is displaying the average of more than one number
 *
 * Solved by @AlexandraMartinezJoya
 */
public class AverageNDoubles extends ConsoleProgram {
        public void run(){
            println("This program averages "+ (int)NUMBER_OF_DOUBLES +" numbers");

            double total = 0;
            for (int numberCount = 0; numberCount <= NUMBER_OF_DOUBLES; numberCount++) {
                double number = readDouble("Please enter number : " + numberCount + " ");
                total += number;
            }
            double average = total /  NUMBER_OF_DOUBLES;
            println("The average is " + average);
        }

        @SuppressWarnings("FieldCanBeLocal")
        private final double NUMBER_OF_DOUBLES = 4;
}
