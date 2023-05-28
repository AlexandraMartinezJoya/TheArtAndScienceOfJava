package Chapter8;

import acm.program.ConsoleProgram;

import java.util.StringTokenizer;

public class ScrabbleWords  extends ConsoleProgram {

    public void run(){
        println("This program reads in a line and calculates how many scrabble points it has");
        String line = readLine("Please enter your scrabble word: ");
        StringTokenizer tokenizer = new StringTokenizer(line, " ", true);
        int points = 0;
        while(tokenizer.hasMoreTokens()){
            line = tokenizer.nextToken();
            points += calculateWordPoints(line);
        }
        println("Your scrabble word has " + points + " number of points.");
    }

    private int calculateWordPoints(String line){
        int totalPoints = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int charPoint = getCharPoints(c);
            totalPoints+= charPoint;
        }
        return totalPoints;
    }

    private int getCharPoints(char ch){
        ch = Character.toLowerCase(ch);
        int totalPoints = 0;
        switch(ch){
            case 'a': case 'e': case 'i': case 'l': case 'n': case 'o': case 'r': case 's': case 't': case 'u': totalPoints = 1 ;break;
            case 'd': case 'g': totalPoints = 2; break;
            case 'b': case 'c': case 'm': case 'p': totalPoints = 3; break;
            case 'f': case 'h': case 'v': case 'w': case 'y': totalPoints = 4; break;
            case 'k': totalPoints = 5; break;
            case 'j': case 'x': totalPoints = 8;break;
            case 'q': case 'z': totalPoints = 10;break;
            default: totalPoints = 0;
        }
        return totalPoints;
    }
}
