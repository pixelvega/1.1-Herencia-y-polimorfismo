package exercise2_1;

public class Telephone {
	public String brand;
	public String model;

	public Telephone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void call(String phoneNumber) {
		System.out.println("Está llamando al número " + phoneNumber);
		
	}

}
