import acm.program.ConsoleProgram;

import java.io.File;

import java.io.PrintWriter;

import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GetWeatherDataFromTheWeb extends ConsoleProgram {

    public void run() {
        try{
            String brusselsweblink = "https://api.openweathermap.org/data/2.5/weather?q=Brussels&appid=97d9b1254938da07cc4c1565100f4f97";
            //const url = `https://api.openweathermap.org/data/2.5/weather?q=${inputVal}&appid=${apiKey}&units=metric`;
            int count = 0;
            URL link = new URL(brusselsweblink);
            Scanner input = new Scanner(link.openStream());
            File weatherData = new File("BrusselsWeatherData.txt");
            PrintWriter output = new PrintWriter(weatherData);
            while(input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
                println("name: " + line + "\n");
                output.print(line + "\n");
            }
            output.close();
            println("The size of the file is " + count + " characters");

        } catch (Exception e){
            println(e.getMessage());
        }
    }
}
