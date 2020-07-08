import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int option = 0;
		ArrayList <Flight> flights = new ArrayList <Flight>();
		
		flights.add(new Flight("Kota Kinabalu", "Senai", "12-07-2020", "10:30 - 15:50"));
		flights.add(new Flight("Senai", "Kota Kinabalu", "12-07-2020", "10:30 - 15:50"));
		
		for(int i = 0; i < flights.size(); i++) {
			int list = i+1;
        	System.out.println("Flight Number: " + list);;
            System.out.println("From: " + flights.get(i).getDestination1());
            System.out.println("To: " + flights.get(i).getDestination2());
            System.out.println("\n");
		}

	}

}
