
public class Spielfilm extends Film {
	
	public String regisseur;
	public String genre;
	
	public Spielfilm(String ttl, int len, boolean vrh, String reg, String gen) {
		super(ttl, len, vrh);
		regisseur = reg;
		genre = gen;
	}

	public void anzeigen() {
		System.out.println("Der Titel des Films:\t" +titel);
		System.out.println("Die Länge des Films:\t" +laenge);
		System.out.println("Vorhanden:\t\t" +vorhanden);
		System.out.println("Regisseur des Films:\t" +regisseur);
		System.out.println("Das Genre des Films:\t" +genre);
		System.out.println();
	}
	
}
