package FoundFrequencies;/* *
 * File: EarthImage.java
 * --------------------------------
 * This program displays an image of the earth from space
 * The image appears through the courtesy of NASA/JPL-Caltech
 */


import acm.program.ConsoleProgram;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class FindMeGoodWeather extends ConsoleProgram {

    public void run(){
        String url = "https://www.google.com/search?q=found+frequencies";
        crawler(url);
    }

    public void crawler(String startingUrl){
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Timisoara&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Brussels&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Berlin&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=London&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Amsterdam&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Stockholm&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Copenhagen&appid=97d9b1254938da07cc4c1565100f4f97");
        listOfPendingUrls.add("https://api.openweathermap.org/data/2.5/weather?q=Paris&appid=97d9b1254938da07cc4c1565100f4f97");
        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        listOfPendingUrls.add(startingUrl);
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


            File weatherToday = new File( "Weather " + dayDateFormat + ".txt");
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
        return fullDate.substring(7, 10) + " " + fullDate.substring(0, 3) ;
    }
    private String getYear(String fullDate){
        return fullDate.substring(25);
    }
    private String getMonth (String fullDate){
        return fullDate.substring(4, 7);
    }
    private String createDateString(String day, String month , String year){
        String dateString =  day + "-"+ month + "-" + year;
        return dateString;
    }
}
