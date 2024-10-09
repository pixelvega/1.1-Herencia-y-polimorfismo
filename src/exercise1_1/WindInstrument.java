package exercise1_1;

public class WindInstrument extends Instrument {
	
	static {
		System.out.println("Ahora se está inicializando la instancia de Instrument -> WindInstrument STATIC");
	}
	
	{
		System.out.println("Ahora se está inicializando la instancia de Instrument -> WindInstrument");
	}
	
	public WindInstrument(String name, double price) {
		super(name, price);		
	}
	
	public void play() {
		System.out.println("Està sonant un instrument de vent.");
	}
	
}
