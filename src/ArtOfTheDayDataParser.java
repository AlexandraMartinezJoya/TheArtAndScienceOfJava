import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class ArtOfTheDayDataParser extends ConsoleProgram {

    public void run(){

    //img to find which has class js-cover-image

        Date day = new Date();
        String formattedToday = day.toString();
        String year =  getYear(formattedToday);
        String today = getDay(formattedToday);
        String month = getMonth(formattedToday);
        String dayDateFormat = createDateString(today, month, year);

        String path = "MonolinksNewArtOfTheDayGenerator" + dayDateFormat + ".html";
        File artFoundOnline = new File(path);
        File imagePath = new File("ImageOfTheDay.txt");
        println(artFoundOnline);
        try {
            Scanner input = new Scanner(artFoundOnline);
            PrintWriter writer = new PrintWriter(imagePath);
            while(input.hasNext()) {
                String line = input.nextLine();
                String imageElement = getImageElement(line);
                writer.print(imageElement+"\n");
                println(line);
            }
            writer.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String getImageElement(String line) {
        //String  findElementInLine();
        return "";
    }

    private String getDay (String fullDate){
        return fullDate.substring(7, 10);
    }
    private String getYear(String fullDate){
        return fullDate.substring(25);
    }
    private String getMonth (String fullDate){
        return fullDate.substring(0, 3);
    }
    private String createDateString(String day, String month , String year){
        String dateString = "";
        dateString += day + "-"+ month + "-" + year;
        return dateString;
    }
}
