package FoundFrequencies.RandomNameGenerator; /***
 * This program reads data from another website and then writes a local copy of it.
 * This version still has errors in it and I cannot debug it for my debugger has crashed.
 */

import acm.program.ConsoleProgram;

import javax.swing.text.View;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileFromUrl extends ConsoleProgram {

    public void run(){
        try{
        String weblink = "http://www.avss.ucsb.edu/NameMala.HTM";
        int count = 0;
        URL link = new URL(weblink);
        Scanner input = new Scanner(link.openStream());
        File boyNames = new File("BoyNames.txt");
        PrintWriter output = new PrintWriter(boyNames);
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

    public boolean navigateToUrl(String url) {

//        String weblink = "http://www.avss.ucsb.edu/NameFema.HTM";
//        URI uri = new URI(weblink);
//        Desktop myDesktop = Desktop.getDesktop();
//        myDesktop.browse(uri);
//        Desktop desktop = Desktop.getDesktop();
//        URI uri = new URI("C:/Users/za0ne/IdeaProjects/NewUtopia/BoyNames.HTML");
//        desktop.browse(uri);

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    URI uri = new URI(url);
                    desktop.browse(uri);
                    return true;
                } catch (IOException | URISyntaxException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return false;
    }
}
