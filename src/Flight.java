
public class Flight {
	
	private String destination1;
	private String destination2;
	private String date;
	private String time;
	private double price;
	
	//Constructor
	public Flight(String destination1, String destination2, String date, String time, double price) {
		this.destination1 = destination1;
		this.destination2 = destination2;
		this.date = date;
		this.time = time;
		this.price = price;
	}
	
	//Mutator	
	public void setDestination1(String destination1) {
		this.destination1 = destination1;
	}
	
	public void setDestination2(String destination2) {
		this.destination2 = destination2;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Accessor
	public String getDestination1()	{
		return destination1;
	}
	
	public String getDestination2()	{
		return destination2;
	}
	
	public String getDate()	{
		return date;
	}
	
	public String getTime()	{
		return time;
	}
	
	public double getPrice()	{
		return price;
	}
	

}
