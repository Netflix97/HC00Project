
public class Booking {
	int cost;
	Customer customer;
	Flight flight;
	
	public Booking (Customer customer, Flight flight) {
		this.customer = customer;
		this.flight = flight;
	}
	
	public Customer getCostumer() {
		return customer;
	}
	
	public int getCost(){
		return 100;
		
	}

}
