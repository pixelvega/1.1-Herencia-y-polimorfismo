package exercise2_1;

import exercise2_1.interfaces.Camera;
import exercise2_1.interfaces.Clock;

public class Smartphone extends Telephone implements Camera, Clock {

	public Smartphone(String brand, String model) {
		super(brand, model);
	}
	
	@Override
	public void photograph() {
		System.out.println("Está haciendo una foto");
	}
	
	@Override
	public void alarm() {
        System.out.println("Está sonando la alarma");
    }
	
}
