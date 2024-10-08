package exercise1_1;

public abstract class Instrument {
	private String name;
	private double price;
	
	public Instrument() {
		System.out.println("Instrument initialized.");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void play();

}


