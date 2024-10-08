package exercise1_1;

public class Main {

	public static void main(String args[]) {
		Instrument flute = new WindInstrument();
		Instrument violin = new StringInstrument();
		Instrument viola = new StringInstrument();
		Instrument drums = new PercussionInstrument();
		
		flute.play();	
		violin.play();
		viola.play();
		violin.play();
		drums.play();	
	}
}
