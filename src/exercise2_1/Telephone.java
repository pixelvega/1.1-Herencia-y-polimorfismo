package exercise2_1;

public class Telephone {
	private String brand;
	private String model;

	public Telephone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void call(String phoneNumber) {
		System.out.println("Está llamando al número " + phoneNumber);
	}

}
