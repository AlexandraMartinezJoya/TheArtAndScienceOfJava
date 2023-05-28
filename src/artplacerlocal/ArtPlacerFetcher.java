package artplacerlocal;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ArtPlacerFetcher  extends ConsoleProgram {
    public void run(){
        String url = "https://www.artplacer.com";
        crawler(url);
    }

    public void crawler(String startingUrl){
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        listOfPendingUrls.add("https://www.artplacer.com/pricing/");
        listOfPendingUrls.add("https://www.artplacer.com/");
        listOfPendingUrls.add("https://www.artplacer.com/tools-for-artists-and-galleries/");
        listOfPendingUrls.add(startingUrl);

        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        while(!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 100){
            String urlString = listOfPendingUrls.remove(0);
            if(!listOfTraversedUrls.contains(urlString)){
                println("Craw: " + urlString);
            }
            for(String s:  getSubUrls(urlString)) {
                if(!listOfTraversedUrls.contains(s)) {
                    listOfPendingUrls.add(s);
                }
            }
            listOfPendingUrls.addAll(getSubUrls(urlString));
        }
    }


    public ArrayList<String> getSubUrls (String urlString){
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            Date day = new Date();
            String formattedToday = day.toString();
            String year =  getYear(formattedToday);
            String today = getDay(formattedToday);
            String month = getMonth(formattedToday);
            String dayDateFormat = createDateString(today, month, year);


            File weatherToday = new File( "artplacer " + dayDateFormat + ".html");
            PrintWriter output = new PrintWriter(weatherToday);
            while(input.hasNext()) {
                String line = input.nextLine();

                println(line +"\n");

                current = line.indexOf("Http:", current);
                output.print(line + "\n");
                while (current > 0){
                    int endIndex = line.indexOf("\"",  current);
                    if (endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
            input.close();
            output.close();
        } catch ( Exception e){
            println(e.getMessage());
        }
        return list;
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
