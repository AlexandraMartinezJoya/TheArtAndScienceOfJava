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
        listOfPendingUrls.add("https://monoskop.org/Monoskop");
        //https://monoskop.org/About_Monoskop
        listOfPendingUrls.add("https://monoskop.org/About_Monoskop");
        listOfPendingUrls.add("https://post.lurk.org/@monoskop");
        listOfPendingUrls.add("https://monoskop.org/Shadow_libraries");
        listOfPendingUrls.add("https://ubu.com");
        listOfPendingUrls.add("https://aaaaarg.fail");
        listOfPendingUrls.add("https://aaaaarg.fail");
        listOfPendingUrls.add("https://monoskop.org/Fediverse");
        listOfPendingUrls.add("https://tldr.nettime.org/explore");
        listOfPendingUrls.add("https://mastodon.art/explore");
        listOfPendingUrls.add("https://mamot.fr/explore");
        listOfPendingUrls.add("https://chaos.social/explore");
        listOfPendingUrls.add("https://systemli.social/explore");
        listOfPendingUrls.add("https://blacktwitter.io/public/local");
        listOfPendingUrls.add("https://digipres.club/explore");
        listOfPendingUrls.add("https://zirk.us/explore");
        listOfPendingUrls.add("https://kolektiva.social/explore");
        listOfPendingUrls.add("https://framapiaf.org/explore");
        listOfPendingUrls.add("https://scholar.social/explore");
        listOfPendingUrls.add("https://tilde.zone/explore");
        listOfPendingUrls.add("https://merveilles.town/explore");
        listOfPendingUrls.add("https://saturation.social/explore");
        listOfPendingUrls.add("https://sunbeam.city/explore");
        listOfPendingUrls.add("https://mastodon.social/explore");
        listOfPendingUrls.add("https://vis.social/about");
        listOfPendingUrls.add("https://twitter.com/artistshacking/status/1518753397012316161");
        listOfPendingUrls.add("https://fediverse.party/en/portal/servers/");
        listOfPendingUrls.add("https://social.coop/explore");
        listOfPendingUrls.add("https://fediverse.party/en/portal/servers/");
        listOfPendingUrls.add("https://samenet.social/explore");
        listOfPendingUrls.add("https://lugnasad.eu");
        listOfPendingUrls.add("https://astronomy.city/explore");
        listOfPendingUrls.add("https://astronomy.social/explore");
        listOfPendingUrls.add("https://humangenetics.social/explore");
        listOfPendingUrls.add("https://oulipo.social/about");
        listOfPendingUrls.add("https://oulipo.social/about");
        listOfPendingUrls.add("https://archaeo.social/explore");
        listOfPendingUrls.add("https://zirk.us/explore");
        listOfPendingUrls.add("https://tusk.schoollibraries.net/explore");
        listOfPendingUrls.add("https://mastodon.oeru.org/explore");
        listOfPendingUrls.add("https://akademienl.social/explore");
        listOfPendingUrls.add("https://mastodon.education/explore");
        listOfPendingUrls.add("https://sotl.social/explore");
        listOfPendingUrls.add("https://sotl.social/explore");
        listOfPendingUrls.add("https://koreadon.com/explore");
        listOfPendingUrls.add("https://feedbeat.me/explore");
        listOfPendingUrls.add("https://piano.masto.host/explore");
        listOfPendingUrls.add("https://metalverse.social/explore");
        listOfPendingUrls.add("https://drumstodon.net/explore");
        listOfPendingUrls.add("https://musician.social/explore");
        listOfPendingUrls.add("https://douzepoints.social/explore");
        listOfPendingUrls.add("https://epsilon.social/explore");
        listOfPendingUrls.add("https://screenwriting.space/explore");
        listOfPendingUrls.add("https://rollenspiel.social/explore");
        listOfPendingUrls.add("https://radiosocial.de/explore");
        listOfPendingUrls.add("https://hamradio.tel/explore");
        listOfPendingUrls.add("https://pl.nudie.social/main/public");
        listOfPendingUrls.add("https://prf.me/explore");
        listOfPendingUrls.add("https://makerspace.social/explore");
        listOfPendingUrls.add("https://hackers.town/about");
        listOfPendingUrls.add("https://freeradical.zone/explore");
        listOfPendingUrls.add("https://gamemaking.social/about");
        listOfPendingUrls.add("https://botsin.space/about");
        listOfPendingUrls.add("https://scholar.social/about");
        listOfPendingUrls.add("https://merveilles.town/about");
        listOfPendingUrls.add("https://post.lurk.org/about");
        listOfPendingUrls.add("https://twitter.com/artistshacking/status/1518753397012316161");
        listOfPendingUrls.add("https://makerspace.social/explore");
        listOfPendingUrls.add("https://3dp.chat/explore");
        listOfPendingUrls.add("https://bikesare.cool/explore");
        listOfPendingUrls.add("http://redecentralize.github.io/alternative-internet/");
        listOfPendingUrls.add("https://social.vtopia.live");
        listOfPendingUrls.add("http://distributedweb.care");
        listOfPendingUrls.add("https://redecentralize.org/interviews/");
        listOfPendingUrls.add("https://homebrewserver.club");
        listOfPendingUrls.add("https://homebrewserver.club");
        listOfPendingUrls.add("http://web.archive.org/web/20200616164626/http://p2pforever.org/#values");
        listOfPendingUrls.add("https://carefulnetworks.net");
        listOfPendingUrls.add("https://etherdump.vvvvvvaria.org/publish/wg.communitynetworks.raw.html");
        listOfPendingUrls.add("https://the-federation.info");
        listOfPendingUrls.add("https://fediverse.network");
        listOfPendingUrls.add("https://indieweb.org/2013/Hollywood");
        listOfPendingUrls.add("https://indieweb.org/2014/NYC");
        listOfPendingUrls.add("https://radicalnetworks.org/archives/2015/");
        listOfPendingUrls.add("https://thesix.mur.at/en/autonomy-impossible/");
        listOfPendingUrls.add("https://esc.mur.at/en/projekt/ministry-hacking");
        listOfPendingUrls.add("https://pingping.press/8m/");
        listOfPendingUrls.add("https://monoskop.org/Art_and_technology_centres");
        listOfPendingUrls.add("https://amsterdamalternative.nl/articles/13446/we-moeten-het-internet-collectiviseren");
        listOfPendingUrls.add("https://gametoots.de/explore");
        listOfPendingUrls.add("https://hub.adrelien.com");
        listOfPendingUrls.add("https://mastodon.triggerphra.se/about");
        listOfPendingUrls.add("https://rail.chat/about");
        listOfPendingUrls.add("https://aircrew.rocks/explore");
        listOfPendingUrls.add("https://bahn.social/explore");
        listOfPendingUrls.add("https://toot.pizza/explore");
        listOfPendingUrls.add("https://mastodon.sk/about");
        listOfPendingUrls.add("https://gomastodon.cz/explore");
        listOfPendingUrls.add("https://mastodon.fedi.bzh/explore");
        listOfPendingUrls.add("https://mk.phreedom.club");
        listOfPendingUrls.add("https://librosphere.fr/main/public");
        listOfPendingUrls.add("https://norrebro.space/explore");
        listOfPendingUrls.add("https://loðfíll.is/explore");
        listOfPendingUrls.add("https://best-friends.chat/about");
        listOfPendingUrls.add("https://mastodon.in.th/about");
        listOfPendingUrls.add("https://occitania.social/explore");
        listOfPendingUrls.add("https://monoskop.org/Craslab");
        listOfPendingUrls.add("https://monoskop.org/Art_and_technology_centres");


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


            File weatherToday = new File( "MonolinksMonoSkop" + dayDateFormat + ".html");
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
