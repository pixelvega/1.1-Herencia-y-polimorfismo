package exercise1_1;

public class PercussionInstrument extends Instrument {
	
	static {
		System.out.println("Ahora se está inicializando la instancia de Instrument -> PercussionInstrument STATIC");
	}
	
	{
		System.out.println("Ahora se está inicializando la instancia de Instrument -> PercussionInstrument");
	}
	
	public PercussionInstrument(String name, double price) {
		super(name, price);
	}
	
	public void play() {
		System.out.println("Està sonant un instrument de percussió.");
	}
}
