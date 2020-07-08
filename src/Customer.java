
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
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void printCostumer() {
		System.out.print(name);
		System.out.println(email);
		System.out.println(phone);
	}

}
