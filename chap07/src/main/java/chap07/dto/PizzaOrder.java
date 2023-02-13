package chap07.dto;

public class PizzaOrder {
	private String name;
	private String streetAddress; 
	private String city;
	private String email;
	private String phone;
	private String crust;
	private String size;
	private String topping;
	private String instruction;
	
	public PizzaOrder(String name, String streetAddress, String city, String email,
			String phone, String crust, String size, String topping, String instruction) {
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.email = email;
		this.phone = phone;
		this.crust = crust;
		this.size = size;
		this.topping = topping;
		this.instruction = instruction;
	}

	public String getName() {
		return name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getCrust() {
		return crust;
	}

	public String getSize() {
		return size;
	}

	public String getTopping() {
		return topping;
	}

	public String getInstruction() {
		return instruction;
	}
	
	
	
}
