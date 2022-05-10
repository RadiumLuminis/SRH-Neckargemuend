package konten;

public class TestGirokonto {

	public static void main(String[] args) {

		Girokonto napf = new Girokonto("Karl Napf", 1000.0);
		
		napf.geldEinzahlen(1500.0);
		napf.geldAbheben(600.0);
		napf.zeigeKontostand();		
		
	}

}
