package exercise1_2;


public class Car {
	public static final String brand = "Renault";
	public static String model = "Scenic";
	public int power;

	public Car() {
		this.power = 120;
	}
	
	public static void brake() {
		System.out.println("El vehículo está frenando.");
	}
	
	public void accelerate() {
		System.out.println("El vehículo está acelerando.");
	}


	public static void main(String[] args) {
		Car.brake();
		
		Car myCar = new Car();
		myCar.accelerate();
		
	}

}
