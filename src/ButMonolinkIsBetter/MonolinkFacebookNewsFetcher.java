package ButMonolinkIsBetter;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MonolinkFacebookNewsFetcher extends ConsoleProgram {

    public void run(){
        getFacebookLatestNews();
    }

    private void getFacebookLatestNews(){
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        listOfPendingUrls.add("https://www.facebook.com/monolink");

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


            File weatherToday = new File( "MonolinkFacebookPosts" + dayDateFormat + ".html");
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


    private void removeUglyHeader(){
        //todo
        //lines in total =
        //lines minus ugly header ruining everything =
        //read div 1. it actually has a class. apparently some horseman mounts his horse on his lazy loading server
        //count divs to the one you need. get the links needed. move to dj-factory.space
        //count how many divs you must go down they did server loading async just to :show :hide lol
        //2 years later ... :D some code seems to be stolen from online movie industry ... i saw the same at netsky
        //best thing we can do on fb is stories with stickers. their AR cavalery can put an image on a video with a song :D
        //gj zuck, im sure you're worth being free online webspace.
    }

    private void getTicketingInfoFromFbLink(){
        //todo
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
