package mensch;

public class Schulklasse {

	public static void main(String[] args) {
		
		Mensch kilian = new Mensch("Kilian", 22, "Neckargemünd");
		Mensch tim = new Mensch("Tim", 24, "Frankfurt");
		Mensch dominik = new Mensch("Dominik", 26, "Stuttgart");
		
		kilian.vorstellen();
		kilian.wasBinIch();
		System.out.println();
		tim.wasBinIch();
		tim.vorstellen();
		System.out.println();
		
		dominik.vorstellen();
		dominik.wasBinIch();	
		System.out.println();
		
		Mann Klaus = new Mann("Klaus", 55, "Heiligkreuzsteinach", false);
		Frau Tina = new Frau("Tina", 12, "Frankfurt", true);
		
		Klaus.vorstellen();
		if(Klaus.isBarttraeger()) {
			System.out.println("Klaus trägt einen Bart");
		}
		else {
			System.out.println("Klaus trägt keinen Bart");
		}
		Klaus.wasBinIch();
		System.out.println();
		
		Tina.vorstellen();
		if(Tina.isSchwanger()) {
			System.out.println("Tina ist schwanger");
		}
		else {
			System.out.println("Tina ist nicht schwanger");
		}
		Tina.wasBinIch();		
		System.out.println();
		
	}

}
