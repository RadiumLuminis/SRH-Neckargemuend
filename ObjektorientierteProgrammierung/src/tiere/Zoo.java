package tiere;

public class Zoo {

	public static void main(String[] args) {

		Tier hund = new Tier("Peter", 3, "Hund");
		Tier katze = new Tier("Holly", 5, "Katze");
		Tier vogel = new Tier("Lulu", 11, "Vogel");
		Tier seltsam =  new Tier("Nessi", 517, "Seemonster");
		
		hund.werBistDu();
		katze.werBistDu();
		vogel.werBistDu();
		seltsam.werBistDu();
		System.out.println("Anzahl der Tiere gesamt: " +Tier.getAnzahlTiere());
	}

}
