
public class Artikel {
	
	private double einkaufspreis;
	private String name;
	private int regalnummer; 
	private static int anzahlArtikel = 0;
	
	public Artikel() {
		anzahlArtikel += 1;
	}
	
	public void zeigeVerkaufspreis() {
		System.out.println("Der Artikel heißt: " +name);
		System.out.println("Der Artikel liegt im Regal: " +regalnummer);
		System.out.println("Der Verkaufspreis beträgt: " +(einkaufspreis * 1.19));
	}

	public double getEinkaufspreis() {
		return einkaufspreis;
	}

	public void setEinkaufspreis(double einkaufspreis) {
		this.einkaufspreis = einkaufspreis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegalnummer() {
		return regalnummer;
	}

	public void setRegalnummer(int regalnummer) {
		if (regalnummer > 62) {
			System.out.println("Keine Regalnummer größer 62 erlaubt!");
			return;
		}
		this.regalnummer = regalnummer;
	}
	
	public int getAnzahlArtikel() {
		return anzahlArtikel;
	}

	
}
