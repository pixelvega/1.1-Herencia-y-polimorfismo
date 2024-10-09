package exercise1_1;

public class StringInstrument extends Instrument {
	static {
		System.out.println("Ahora se está inicializando la instancia de Instrument -> StringInstrument STATIC");
	}
	
	{
		System.out.println("Ahora se está inicializando la instancia de Instrument -> StringInstrument");
	}
	
	public StringInstrument(String name, double price) {
		super(name, price);
	}
	
	public void play() {
		System.out.println("Està sonant un instrument de corda.");
	};
	
}
