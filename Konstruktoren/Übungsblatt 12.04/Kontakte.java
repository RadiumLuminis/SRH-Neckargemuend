
public class Kontakte {

	private String vorname;

	private String nachname;

	private String telefonnummer;

	private static int zaehler = 0;

	public void ausgabe() {
		System.out.println(zaehler + ". Kontakt: ");
		System.out.println("Nachname: " + nachname);
		System.out.println("Vorname: " + vorname);
		System.out.println("Telefonnummer: " + telefonnummer + "\n");
	}

	public Kontakte(String nn, String vn, String tn) {
		vorname = vn;
		nachname = nn;
		telefonnummer = tn;
		zaehler++;

	}

	public Kontakte(String nn, String vn) {
		vorname = vn;
		nachname = nn;
		telefonnummer = "---";
		zaehler++;
	}

	public Kontakte(String nn) {
		vorname = "unbekannt";
		nachname = nn;
		telefonnummer = "---";
		zaehler++;

	}

	public static void main(String[] args) {

		Kontakte k1 = new Kontakte("Kost");
		k1.ausgabe();
		Kontakte k2 = new Kontakte("Zopf", "Maria");
		k2.ausgabe();
		Kontakte k3 = new Kontakte("Hauser", "Bernd", "07221-4712");
		k3.ausgabe();

	}

}
