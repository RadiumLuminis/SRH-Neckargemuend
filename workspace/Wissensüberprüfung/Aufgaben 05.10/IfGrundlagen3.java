
public class IfGrundlagen3 {

	public static void main (String [] args) {
		
		int intValue1 = 5;
		int intValue2 = 10;
		
		if(intValue1 == 5 && intValue2 == 10) {
			System.out.println("Die Werte sind 5 UND 10");
		}
		
		if(intValue1 == 5 || intValue2 == 10) {
			System.out.println("Wert 1 ist 5 oder Wert 2 ist 10");
		}
		
		if(intValue1 != 5 && intValue2 != 10) {
			System.out.println("Die Werte sind UNGLEICH 5 UND UNGLEICH 10");
		}
		
	}	
}
