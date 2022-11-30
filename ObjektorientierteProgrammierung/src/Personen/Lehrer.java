package Personen;

public class Lehrer extends Person {

	private String klasse;
	
	public Lehrer(String name, int alter, String wohnort, String klasse) {
		super(name, alter, wohnort);
		this.klasse = klasse;
	}
	
	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	@Override
	public void showInfo() {
		System.out.println("Ich bin ein Lehrer");
	}
	
	public void showLehrerInfo()  {
		System.out.println("Ich bin Klassenlehrer der Klasse " +getKlasse());
	}
	
}
