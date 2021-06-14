package model;

public class Customer {
	private String id;
	private String name;
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer: id= " + id + ", name= " + name;
	}

	public String getName() {
		return name;
	}

	
	
	
	
	
}
