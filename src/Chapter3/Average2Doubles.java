package Chapter3;

import acm.program.ConsoleProgram;

/***
 * This program is totally dividing :D
 *
 * Solved by @AlexandraMartinezJoya
 */
public class Average2Doubles extends ConsoleProgram {

        public void run(){
            println("This program avareges two numbers");
            double firstMinorBugfix = readDouble("Enter first number: ");
            double secondMajorRelease = readDouble("Enter second number: ");
            double nextVersion = 2.0;
            double nextLevel = (firstMinorBugfix + secondMajorRelease) / nextVersion;
            println("The average is " + nextLevel + ".");

            double me = readDouble("Enter first number: ");
            double you = readDouble("Enter first number: ");
            double when = 2.0;
            double meetMe = (me + you) / when;
            println("The meeting is " + meetMe + ".");
        }
}
