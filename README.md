# HC00Project
Project 1 OOP Subject

to unknown visitors, this is an uncompleted project.

In this file repository, we will update each changes of our program on airlines reservation ticket.

package bookingticket;

/**
 *
 * @author Netfli97
 */
import java.util.Scanner;

public class BookingTicket {
    
    static Scanner scan = new Scanner(System.in);
    static String Name;
    static String [] flightlist ={"1)Miri to Bintulu","2)Bintulu to Miri"};
    static int number;
    
    
    
    
    public static void getname() {

        System.out.println("Please input your name:");
        Name = scan.nextLine();
        System.out.println("Welcome "+ Name);
        getFlight();
    }
    
    public static void getFlight(){
        System.out.println("Please select a flight:");
        for(int i=0;i<flightlist.length;i++){
            System.out.println(flightlist[i]);
        }
         number =scan.nextInt();
         System.out.println("You've selected the flight "+flightlist[number-1].substring(3, flightlist[number-1].length()));
         getSeat();
          
    }
    
    public static void getSeat(){
        System.out.println("Please choose how many seat:");
        String seat = scan.next();
        System.out.println("Thank you, \nYou have selected " +seat+" seat for the flight "+flightlist[number-1].substring(3,flightlist[number-1].length()));
        
    }
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        getname();
    }
    
}
