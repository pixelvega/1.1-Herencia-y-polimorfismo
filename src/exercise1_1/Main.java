package exercise1_1;

public class Main {

	public static void main(String args[]) {
		Instrument flute = new WindInstrument("flute", 99);
		Instrument violin = new StringInstrument("violín", 120);
		Instrument viola = new StringInstrument("viola", 200);
		Instrument drums = new PercussionInstrument("drums", 400);
		
		flute.play();	
		violin.play();
		viola.play();
		violin.play();
		drums.play();	
	}
}
