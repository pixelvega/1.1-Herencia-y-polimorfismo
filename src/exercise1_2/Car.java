package exercise1_2;


public class Car {
	public static final String brand = "Renault";
	public static String model;
	public int power;

	public Car(String model, int power) {
		Car.model = model;
		this.power = power;
	}
	
	public static void brake() {
		System.out.println("El vehículo está frenando.");
	}
	
	public void accelerate() {
		System.out.println("El vehículo está acelerando.");
	}

	

}
