package MonolinkNewsFetcher;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MonolinkConcertNewsFetcher extends ConsoleProgram {

    public void run(){
        monolinkConcertCrawler();
    }

    public void monolinkConcertCrawler() {
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        listOfPendingUrls.add("https://www.songkick.com/artists/8286163-monolink/calendar");

        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        while (!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 100) {
            String urlString = listOfPendingUrls.remove(0);
            if (!listOfTraversedUrls.contains(urlString)) {
                println("Craw: " + urlString);
                writeDataToLocalFile(urlString);
            }
        }
        writeConcertTourData();
    }

    public void writeConcertTourData() {

        String dayDateFormat = createDateToday();

        File tourDatesData = new File( "monolinkTourDates " + dayDateFormat + ".txt");
        File tourData = new File("monolinkTourData.txt");
        int count = 0;
        try {
            Scanner input = new Scanner(tourDatesData);
            PrintWriter output = new PrintWriter(tourData);
            while(input.hasNext() ) {
                String line = input.nextLine();
                if (line.contains("<time datetime=") ){
                    String timeOfTour = getTimeOfTour(line);
                    output.print("Time: " +  timeOfTour +"\n");
                    println("Time Of Tour: " + timeOfTour +"\n");

                }
                if(line.contains("<strong class=\"primary-detail")) {
                    String city = getCity(line);
                    output.print("City:  " + city +"\n");
                    println("City: " + city +"\n");
                }
                if(line.contains("href=\"/festivals/") || line.contains("href=\"/concerts/")) {
                    String ticketUrl = getTicketUrl(line);
                    if(!ticketUrl.equals("")){
                        count ++ ;
                        output.print(count +"\n");
                        output.print("Ticket url: " + ticketUrl +"\n");
                        println("Ticket url: " + ticketUrl +"\n");
                    }

                }
                if(line.contains("data-analytics-label=\"past") || line.contains("data-analytics-label=\"upcoming")){
                    String upcommingOrPassed = getConcertType(line);
                    output.print("Upcomming or passed: " + upcommingOrPassed +"\n");
                    println("Upcomming or passed: " + upcommingOrPassed);
                }
            }
            input.close();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String getConcertType(String line){
        String upcommingOrPassed = "";
        if(line.contains("data-analytics-label=\"upcoming")){
            upcommingOrPassed = "Upcomming";
        }
        if(line.contains("data-analytics-label=\"past")){
            upcommingOrPassed = "Passed";
        }
        return upcommingOrPassed;
    }

    private String getTimeOfTour(String line){
        String dateString = "";
        //<time datetime="2021-11-25"></time>
        if (line.length() == 43){
            String dateRemoveEnding = line.substring(0, line.length() - 8);
            dateString = dateRemoveEnding.substring(24, dateRemoveEnding.length() -1);
        } else {
            //<time datetime="2022-05-21T15:00:00-0500"></time>
            String dateRemoveEnding = line.substring(0, line.length() - 22);
            dateString = dateRemoveEnding.substring(24,dateRemoveEnding.length() -1);
        }


        return dateString;
    }

    private String getCity(String line){
        String cityString = "";
        String cityRemoveEnding = line.substring(0, line.length() - 8);
        cityString = cityRemoveEnding.substring(41, cityRemoveEnding.length() -1);
        return cityString;
    }

    private String getTicketUrl(String line){
        int length = line.length();
        String urlString = "";
        if(line.contains("href=\"/festivals/")){
            length = line.length();
            urlString = line.substring(14, line.length() -1);
            urlString = "https://www.songkick.com" + urlString;
        }
        if (length < 100) {
            urlString = line.substring(14, line.length() -1);
            urlString = "https://www.songkick.com" + urlString;
        }

        return urlString;
    }

    public void writeDataToLocalFile (String urlString){
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;

            String dayDateFormat = createDateToday();


            File tourDates = new File( "monolinkTourDates " + dayDateFormat + ".txt");
            PrintWriter output = new PrintWriter(tourDates);
            while(input.hasNext()) {
                String line = input.nextLine();
                println(line +"\n");

                current = line.indexOf("Http:", current);
                output.print(line + "\n");
                while (current > 0){
                    int endIndex = line.indexOf("\"",  current);
                    if (endIndex > 0){
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
    }

    private String createDateToday(){
        Date day = new Date();
        String formattedToday = day.toString();
        String year =  getYear(formattedToday);
        String today = getDay(formattedToday);
        String month = getMonth(formattedToday);
        String dayDateFormat = createDateString(today, month, year);
        return dayDateFormat;
    }

    private String getDay (String fullDate){
        return fullDate.substring(7, 10);
    }
    private String getYear(String fullDate){
        return fullDate.substring(24);
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
