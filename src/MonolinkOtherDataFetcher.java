import acm.program.ConsoleProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//this algorithm has to be implemented in C , then moved to C++, so that we can actually clean, with my old mem allocation library.
// else Java will just take its frozen copy of C with what it can remember, and then overwrite. And on the web noone has given it permission to.
//which basically means that the tools that are meant to help you. do not do what they are created for
// This code can only be used on Mac Machines and mac phones, because their systems hopefully preservd the old code in good condition, presumably steve jobs death wasnt
// yet another feast for crows . I heard in one of lennard cohen song where his lips went and where his heart went but never his eyes or ears.


public class MonolinkOtherDataFetcher extends ConsoleProgram {

    public void run(){
        getBehandeArtLatestNews();
        createTodaysArtLinkFile();
    }

    private void  createTodaysArtLinkFile() {
        Date day = new Date();
        String formattedToday = day.toString();
        String year =  getYear(formattedToday);
        String today = getDay(formattedToday);
        String month = getMonth(formattedToday);
        String dayDateFormat = createDateString(today, month, year);

        File behanceFile = new File( "MonolinkNewArtOfTheDayGenerator" + dayDateFormat + ".html");
        File artLinksFile = new File ("ArtLinksToday" + dayDateFormat + ".txt");

        try {
            Scanner input = new Scanner(behanceFile);
            PrintWriter writer = new PrintWriter(artLinksFile);
            while(input.hasNext()) {
                String artWebsiteHtml = input.nextLine();
                String artLinks = getArtLinks(artWebsiteHtml);
                writer.print(artLinks+"\n");
                println(artLinks);
            }
            writer.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void getBehandeArtLatestNews(){
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
       listOfPendingUrls.add("https://www.behance.net/galleries/3d-art");

      //todo :
//        listOfPendingUrls.add("www.cursdepuericultura.ro");
//        listOfPendingUrls.add("drirenalexoi.ro");


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

            File monolinkNewticketingAgencyAndsoMuchMore = new File( "monolinkNewticketingAgencyAndsoMuchMore" + dayDateFormat + ".html");
            File artLinksFile = new File ("steamskickedtoday" + dayDateFormat + ".txt");
            PrintWriter output = new PrintWriter(artLinksFile);
            while(input.hasNext()) {
                String line = input.nextLine();
                println(line +"\n");
                //not sure we need this bit unless planning to expand for multiple files so going to leave this code here for now
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

    private String getArtLinks( String rawHtml) {
        try {
            Date day = new Date();
            String formattedToday = day.toString();
            String year =  getYear(formattedToday);
            String today = getDay(formattedToday);
            String month = getMonth(formattedToday);
            String dayDateFormat = createDateString(today, month, year);

            File behanceFile = new File( "MonolinkNewArtOfTheDayGenerator" + dayDateFormat + ".html");
            Scanner input = new Scanner("MonolinkNewArtOfTheDayLinkList" + dayDateFormat + ".txt");
            PrintWriter writer = new PrintWriter(behanceFile);
            writer.close();
            input.close();
            } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return "";
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
