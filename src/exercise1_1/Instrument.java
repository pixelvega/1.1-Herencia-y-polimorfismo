package exercise1_1;

public abstract class Instrument {
	private String name;
	private double price;
	
	{
		System.out.println("Ahora se está inicializando la clase Instrument");
	}
	
	static {
		System.out.println("Ahora se está inicializando la clase Instrument STATIC");
	}
	
	
	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
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


