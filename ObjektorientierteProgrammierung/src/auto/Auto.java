package auto;

public class Auto {
	
	// Attribut mit der Farbe des Autos
	String farbe;
	
	// Attribut mit der Anzahl der Türen
	int tueren;
	
	// Attribut mit der Geschwindigkeit
	int geschwindigkeit;
	
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

}
