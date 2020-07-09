import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int option = 0;
		ArrayList <Flight> flights = new ArrayList <Flight>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		//Add Flight
		flights.add(new Flight("Kota Kinabalu", "Senai", "12-07-2020", "10:30 - 15:50", 10));
		flights.add(new Flight("Senai", "Kota Kinabalu", "12-07-2020", "10:30 - 15:50", 10));
		
		
		//Display
		for(int i = 0; i < flights.size(); i++) {
			int list = i+1;
        		System.out.println("Flight Number: " + list);;
            		System.out.println("From: " + flights.get(i).getDestination1());
            		System.out.println("To: " + flights.get(i).getDestination2());
                  System.out.println("Time: " + flights.get(i).getTime());
                  System.out.println("Seat: " + flights.get(i).getSeat());
            		System.out.println("\n");
		}
		
		//Booking
		Random rnd = new Random();
		int flightNumber = 1;
		int costumerId = rnd.nextInt(999);
		Customer customer = new Customer(costumerId, "Kennedy Wee", "kennedywee@gmail.com", "0137735813");
		customers.add(customer);
		Booking booking = new Booking(customer, flights.get(flightNumber-1));
		bookings.add(booking);
		System.out.println("The seat is now reserved for you.");
		int totalCost = 0;
        	if (booking.getCostumer().getId() == customer.getId()) {
        		totalCost += booking.getCost();
        	}
        
        	System.out.println("Costumer ID: " + customer.getId());
        	System.out.println("Total costs: " + totalCost + " Euro");
        	System.out.println();
         
		//Cancel Booking
      
      Scanner choice = new Scanner(System.in);
	   System.out.print("Enter the costumer id: ");
	   int customerId = choice.nextInt();
	      if (customer.getId() == customerId)
         {

	            if (booking.getCostumer().getId() == customer.getId())
	            {
                  System.out.println("Your reservation has been canceled!");
	            }
         }
         else
         {
              System.out.println("Incorrect customer id!");
         }
	   System.out.println();
	                    

	}

}
