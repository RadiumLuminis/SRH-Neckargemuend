package mensch;

public class Schulklasse {

	public static void main(String[] args) {
		
		Mensch kilian = new Mensch("Kilian", 22, "Neckargemünd");
		Mensch tim = new Mensch("Tim", 24, "Frankfurt");
		Mensch dominik = new Mensch("Dominik", 26, "Stuttgart");
		
		kilian.vorstellen();
		System.out.println();
		tim.vorstellen();
		System.out.println();
		dominik.vorstellen();
		System.out.println();
		
	}

}
