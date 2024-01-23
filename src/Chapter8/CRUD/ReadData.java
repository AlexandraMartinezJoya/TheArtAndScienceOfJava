package Chapter8.CRUD;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData extends ConsoleProgram {

    public void run(){
        println("This program reads data from a .txt file");
        FileInputStream scores = null;
        try {
            scores = new FileInputStream("Scores.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner input = new Scanner(scores);
        while(input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            println(firstName + " " + lastName + " " + score);
        }
        input.close();
    }
}
