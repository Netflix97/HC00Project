
public class Customer {
	
	int id;
	String name;
	String email;
	String phone;
	
	public Customer (int id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void printCostumer()
	{
		System.out.print(name);
		System.out.println(email);
		System.out.println(phone);
	}

}
