package auto;

public class Auto {
	
	//Klassenvariable mit der Anzahl der Autos
	private static int anzahlAutos;
	
	
	// Attribut mit der Farbe des Autos
	private String farbe;
	
	// Attribut mit der Anzahl der Türen
	private int tueren;
	
	// Attribut mit der Geschwindigkeit
	private int geschwindigkeit;
	
	// 1. Konstruktor der Klasse
	public Auto() 
	{
		farbe = "weiss";
		tueren = 5;
		geschwindigkeit = 0;
		
		anzahlAutos++;
	}
	
	// 2. Konstruktor
	public Auto(String s1) 
	{
		farbe = s1;
		tueren = 5;
		geschwindigkeit = 0;
		
		anzahlAutos++;
	}
		
	
	// 3. Konstruktor
	public Auto(String s1, int i1) 
	{
		farbe = s1;
		tueren = i1;
		geschwindigkeit = 0;
		
		anzahlAutos++;
	}
	
	
	// Methode zum Beschleunigen
	public void beschleunigen()
	{
		System.out.println("Ich werde beschleunigt");
		
		geschwindigkeit += 100;
	}
	
	// Methode zum Bremsen
	public void bremsen()
	{
		System.out.println("Ich werde gebremst");
		
		geschwindigkeit -= 150;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getTueren() {
		return tueren;
	}

	public void setTueren(int tueren) {
		this.tueren = tueren;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public static int getAnzahlAutos() {
		return anzahlAutos;
	}
	
}
