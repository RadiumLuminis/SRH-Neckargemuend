
public class Methoden2_51 {
	
	public static void mwstBerechnen(double betrag) {
		
		betrag *= 0.19;
		System.out.println("Die Mehrwertsteuer beträgt: " +betrag);
	}
	
	public static double mwstBerechnen2(double betrag) {
		
		betrag *= 0.19;
		return betrag;
	}
	
	public static void main(String[] args) {

		double betrag = 6.66;
		mwstBerechnen(betrag);
		double erg = mwstBerechnen2(betrag);
		System.out.printf("Die Mehrwertsteuer beträgt: %.2f", erg);
	}

}
