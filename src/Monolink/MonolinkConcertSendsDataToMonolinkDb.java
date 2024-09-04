package Monolink;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class MonolinkConcertSendsDataToMonolinkDb  extends ConsoleProgram {


    public  void run() {
        try {
            sentConcertDataToDatabase();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public void sentConcertDataToDatabase() throws SQLException, ClassNotFoundException {

        File monolinkData = new File("monolinkTourData.txt");

        try {
            Scanner input = new Scanner(monolinkData);
            String ticketUrl = "";
            String Status = "";
            while(input.hasNext()) {
                String line = input.nextLine();

                if(line.contains("Ticket url:")){
                    //Ticket url: https://www.songkick.com/concerts/40085466-monolink-at-mondo
                     ticketUrl = line.substring(11);
                }
                if(line.contains("Upcomming")){
                    //Upcomming or passed: Upcomming

                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://153.92.6.106:3306/u970857260_dj_factory","u970857260_alexandra","UrYGIeqz^|4");
        PreparedStatement stmt = con.prepareStatement(" insert into monolink_concert_dates (ConcertDate, ConcertCity, ConcertTicketUrl, Status) values (?, ?, ? , ? )");
        stmt.setString(1, "test1");
        stmt.setString(2, "test2");
        stmt.setString(3, "test3");
        stmt.setString(4, "test4");

        stmt.executeUpdate();
        con.close();
    }
}
