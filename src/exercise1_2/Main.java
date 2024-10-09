package exercise1_2;

public class Main {
	public static void main(String[] args) {
		Car.brake();
		
		Car myCar2 = new Car("Megane",120);
		Car myCar = new Car("Scenic" ,150);
		myCar.accelerate();
		myCar2.accelerate();
		
	}

}
